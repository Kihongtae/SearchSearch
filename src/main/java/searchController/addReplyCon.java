package searchController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import searchModel.replyDAO;
import searchModel.replyDTO;

public class addReplyCon implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		int clNumber = Integer.valueOf(request.getParameter("clNumber"));
		String content = request.getParameter("content");
		String userId = request.getParameter("userId");

		replyDTO dto = new replyDTO(clNumber, userId, content);
		
		int row = new replyDAO().addReply(dto);
		
		if(row>0) {
			System.out.println(" 댓글 입력 성공 ");
		}else {
			System.out.println("댓글 입력 실패");
		}

		System.out.println(dto.getClNum()+dto.getContent()+dto.getUserId());
		
		return null;
	}

}
