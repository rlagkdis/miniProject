package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

@WebServlet("/member/enrollView.kh")
public class EnrollServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/member/enroll.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 디비에 정보 넘어갈때 한글이 안깨지게 해줌
		request.setCharacterEncoding("UTF-8");
		
		String memberId = request.getParameter("member-id");
		String memberPw = request.getParameter("member-pw");
		String memberName = request.getParameter("member-name");
		String memberEmail = request.getParameter("member-email");
		String memberPhone = request.getParameter("member-phone");
		Member member = new Member(memberId, memberPw, memberName, memberPhone, memberEmail);
		MemberService mService = new MemberService();
		int result = mService.registerMember(member);
		if(result > 0) {
			// 가입 성공 했으면 index.jsp 이동
			// 방법1.
//			request.setAttribute("result", result);
//			request.getRequestDispatcher("/index.jsp").forward(request, response);
			// 방법2. 단순이동
			// -전달값으로 페이지 경로 가능,URL 가능
			response.sendRedirect(("/miniProject/index.jsp"));
		} else {
			// 가입 실패!
			request.setAttribute("title", "회원 가입 실패");
			request.setAttribute("msg", "회원가입이 완료되지 않았습니다.");
			request.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(request, response);
		}
	}

}
