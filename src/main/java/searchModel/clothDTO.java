package searchModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Getter
@RequiredArgsConstructor
public class clothDTO {

	private int number;
	@NonNull
	private String type;
	private String site;
	private String filename;
	private String look;
	@NonNull
	private String gender;
}
