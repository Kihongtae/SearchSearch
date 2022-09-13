package searchController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import searchModel.replyDTO;

public class addReplyCon implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		int clNumber = Integer.valueOf(request.getParameter("clNumber"));
		String content = request.getParameter("Content");
		String userId = request.getParameter("userId");

		replyDTO dto = new replyDTO(clNumber, content, userId);
		return null;
	}

}
