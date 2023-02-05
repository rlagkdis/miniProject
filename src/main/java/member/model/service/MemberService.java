package member.model.service;

import java.sql.Connection;

import common.JDBCTemplate;
import member.model.dao.MemberDAO;
import member.model.vo.Member;

public class MemberService {
	
	private MemberDAO mDao;
	
	public MemberService() {
		mDao = new MemberDAO();
	}
	/**
	 * 회원 로그인 service
	 * @param memberId
	 * @param memberPw
	 * @return int
	 */
	public int selectCheckLogin(String memberId, String memberPw) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = mDao.selectCheckLogin(conn, memberId, memberPw);
		return result;
	}
	/**
	 * 회원 가입 Service
	 * @param member
	 * @return int result
	 */
	public int registerMember(Member member) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = mDao.insertMember(conn, member);
		if(result > 0) {
			// 커밋
			JDBCTemplate.commit(conn);
		} else {
			// 롤백
			JDBCTemplate.rollback(conn);
		}
		// 연결 해제
		return result;
	}
	
	/**
	 * 아이디로 조회 Service
	 * @param memberId
	 * @return
	 */
//	public Member printOneById(String memberId) {
//		Member member = null;
//		Connection conn = JDBCTemplate.getConnection();
//		member = mDao.selectOneById(conn, memberId);
//		return member;
//	}
//	
//	
//	
//	/**
//	 * 회원 정보 수정 Service
//	 * @param member
//	 * @return reesult
//	 */
//	public int updateMember(Member member) {
//		int result = 0;
//		Connection conn = JDBCTemplate.getConnection();
//		result = mDao.updateMember(conn, member);
//		if(result > 0) {
//			JDBCTemplate.commit(conn);
//		} else {
//			JDBCTemplate.rollback(conn);
//		}
//		return result;
//	}
//	/**
//	 * 회원 탈퇴 Service
//	 * @param memberId
//	 * @return result
//	 */
//	public int deleteMember(String memberId) {
//		int result = 0;
//		Connection conn = JDBCTemplate.getConnection();
//		result = mDao.deleteMember(conn, memberId);
//		if (result > 0) {
//			JDBCTemplate.commit(conn);
//		} else {
//			JDBCTemplate.rollback(conn);
//		}
//		return result;
//	}

}
