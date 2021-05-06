package Business.concrates;

import java.util.regex.Pattern;

import Business.abstracts.EmailCheckService;
import core.abstracts.TextCheckService;
import core.concrate.JavaPatternCheckManager;

public class TextCheckManager implements TextCheckService {
	TextCheckService _emailCheckService;

	public TextCheckManager(TextCheckService checkManager) {
		this._emailCheckService = checkManager;//emaile baðlan email kontrolü yap
 	}

	@Override
	public boolean isEmailExists(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkWithRegex(String text) {
		// TODO Auto-generated method stub
		return false;
	}

 
}
