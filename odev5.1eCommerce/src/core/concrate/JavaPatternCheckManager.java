package core.concrate;

import java.util.regex.Pattern;

import core.abstracts.CheckService;

public class JavaPatternCheckManager implements CheckService{
	
	public boolean checkWithRegex(String regex, String text) {
 		// "^(.+)@(.+)$"
		boolean eMailCheckerRegex = Pattern.matches(regex, text);
 	    return eMailCheckerRegex;
	}
}
