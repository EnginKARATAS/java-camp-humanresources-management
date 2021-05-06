package core.concrate;

import java.util.regex.Pattern;

import core.abstracts.CheckService;
import core.abstracts.TextCheckService;

public class JavaPatternCheckManager implements TextCheckService{
	
	public boolean checkWithRegex(String regex, String text) {
		return false;

	}

	@Override
	public boolean isEmailExists(String email) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
