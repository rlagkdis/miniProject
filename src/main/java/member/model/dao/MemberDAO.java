package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.model.vo.Member;

public class MemberDAO {
	public int selectCheckLogin(Connection conn, String memberId, String memberPw) {
		String query = "SELECT * FROM MEMBER WHERE MEMBER_ID = ? AND MEMBER_PW= ?";
		int result = 0;
		// 쿼리문 실행 준비
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			pstmt.setString(2, memberPw); // 완료
			// 쿼리문 실행
			// 결과 받기
			ResultSet rset = pstmt.executeQuery();
			if(rset.next()) {
				result = 1;
			}
			//자원 해제
			pstmt.close();
			rset.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * 아이디로 조회 DAO
	 * @param conn
	 * @param memberId
	 * @return member
	 */
//	public Member selectOneById(Connection conn, String memberId) {
//		String query = "SELECT * FROM MEMBER_TBL WHERE MEMBER_ID = ?";
//		Member member = null;
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, memberId); // 쿼리문 실행 준비 완료
//			ResultSet rset = pstmt.executeQuery(); // 쿼리문 실행, 결과 받기
//			// 후처리
//			if(rset.next()) {
//				member = new Member();
//				member.setMemberId(rset.getString("MEMBER_ID"));
//				member.setMemberPw(rset.getString("MEMBER_PW"));
//				member.setMemberName(rset.getString("MEMBER_NAME"));
//				member.setMemberAge(rset.getInt("MEMBER_AGE"));
//				member.setMemberEmail(rset.getString("MEMBER_EMAIL"));
//				member.setMemberPhone(rset.getString("MEMBER_PHONE"));
//				member.setMemberGender(rset.getString("MEMBER_GENDER"));
//				member.setMemberHobby(rset.getString("MEMBER_HOBBY"));
//				member.setMemberAddress(rset.getString("MEMBER_ADDR"));
//				member.setMemberDate(rset.getTimestamp("MEMBER_DATE"));
//			}
//			rset.close();
//			pstmt.close();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return member;
//	}
//	/**
//	 * 회원가입 DAO
//	 * @param conn
//	 * @param member
//	 * @return result
//	 */
	public int insertMember(Connection conn, Member member) {
		// 위치홀더에 값을 넣을 때에는 순서가 중요
		String query = "INSERT INTO MEMBER VALUES(?,?,?,?,?)";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberPhone());
			pstmt.setString(5, member.getMemberEmail());
			result = pstmt.executeUpdate(); // DML은 UPDATE
			// 자원해제
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
//	
//	/**
//	 * 회원 정보 수정DAO
//	 * @param conn
//	 * @param member
//	 * @return result
//	 */
//	public int updateMember(Connection conn, Member member) {
//		String query ="UPDATE MEMBER_TBL SET MEMBER_PW = ?, MEMBER_EMAIL = ?, MEMBER_ADDR = ?, MEMBER_PHONE = ?, MEMBER_HOBBY = ? WHERE MEMBER_ID = ?";
//		int result = 0;
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, member.getMemberPw());
//			pstmt.setString(2, member.getMemberEmail());
//			pstmt.setString(3, member.getMemberAddress());
//			pstmt.setString(4, member.getMemberPhone());
//			pstmt.setString(5, member.getMemberHobby());
//			pstmt.setString(6, member.getMemberId()); // 쿼리문 실행 준비 완료
//			result = pstmt.executeUpdate();
//			pstmt.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return result;
//	}
//	/**
//	 * 회원 탈퇴 DAO
//	 * @param conn
//	 * @param memberId
//	 * @return result
//	 */
//	public int deleteMember(Connection conn, String memberId) {
//		String query = "DELETE FROM MEMBER_TBL WHERE MEMBER_ID = ?";
//		int result = 0;
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, memberId);
//			result = pstmt.executeUpdate();
//			pstmt.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return result;
//	}

}
