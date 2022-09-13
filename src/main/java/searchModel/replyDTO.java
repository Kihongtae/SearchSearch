package searchModel;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class replyDTO {

	private int clNum;
	private String userId;
	private String content;
}
