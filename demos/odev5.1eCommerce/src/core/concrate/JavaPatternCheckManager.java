package core.concrate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
import core.abstracts.TextCheckService;

public class JavaPatternCheckManager implements TextCheckService{
	
 
	public boolean checkWithRegex(String regex, String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
}

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	
	@Override
	public boolean isEmailExists(String email) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
