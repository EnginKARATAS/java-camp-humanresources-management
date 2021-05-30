package kodlamaio.hrmsJava.business.concrates;

import java.util.List;

import kodlamaio.hrmsJava.Entity.concrates.Candicate;
import kodlamaio.hrmsJava.Entity.concrates.Employer;
import kodlamaio.hrmsJava.business.abstracts.EmployerService;
import kodlamaio.hrmsJava.business.abstracts.SystemUserValidationService;
import kodlamaio.hrmsJava.core.abstracts.MailSenderService;
import kodlamaio.hrmsJava.core.concrates.TextCheckManager;
import kodlamaio.hrmsJava.core.utilities.results.ErrorResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.core.utilities.results.SuccessResult;

public class EmployerManager implements EmployerService {
	
	private MailSenderService _mailSenderService;
	public SystemUserValidationService _systemUserValidationService;
	
	public EmployerManager(MailSenderService _mailSenderService) {
		this._mailSenderService = _mailSenderService;
	}

	@Override
	public List<Candicate> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(Employer employer) {
		// TODO Auto-generated method stub
		boolean isFieldsNotNull = employer.getCompanyName() != null && employer.getPhoneNumber() != null && employer.getWebSite() != null && employer.getCompanyName() != null && employer.getMail() != null;
		if (isFieldsNotNull) {
			if (TextCheckManager.isEmaiValid(employer.getMail())) {
				if (_systemUserValidationService.isSystemUserConfirmed(employer)) {
					return new SuccessResult("kullanıcı eklendi");
				}
			}
			else {
				return new ErrorResult("email biçimi yanlış");	
			}
		}
		else {
			return new ErrorResult("tüm alanlar zorunludur.");
		}
		return new ErrorResult("Hata");
		
	}

	@Override
	public void delete(Employer employer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employer employer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Employer employer) {
		// TODO Auto-generated method stub
		
	}

}
