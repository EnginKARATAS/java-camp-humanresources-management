package core.abstracts;

public interface TextCheckService {
 
	boolean isEmailExists(String email);

	boolean checkWithRegex(String text);
}
