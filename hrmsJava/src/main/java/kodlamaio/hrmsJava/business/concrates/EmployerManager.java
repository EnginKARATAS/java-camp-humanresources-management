package kodlamaio.hrmsJava.business.concrates;

import java.util.List;

import kodlamaio.hrmsJava.Entity.concrates.Employer;
import kodlamaio.hrmsJava.business.abstracts.EmployerService;
import kodlamaio.hrmsJava.business.abstracts.SystemUserValidationService;
import kodlamaio.hrmsJava.core.abstracts.MailSenderService;
import kodlamaio.hrmsJava.core.concrates.TextCheckManager;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.ErrorResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsJava.core.utilities.results.SuccessResult;
import kodlamaio.hrmsJava.dataAccess.abstracts.EmployerDao;

public class EmployerManager implements EmployerService {
	
	private MailSenderService _mailSenderService;
	private SystemUserValidationService _systemUserValidationService;
	private EmployerDao _employerDao;
	
	public EmployerManager(MailSenderService _mailSenderService) {
		this._mailSenderService = _mailSenderService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>(_employerDao.findAll(),"şirketler listelendi");
	}

	@Override
	public Result add(Employer employer) {
		// TODO Auto-generated method stub
		boolean isFieldsNotNull = employer.getCompanyName() != null && employer.getPhoneNumber() != null && employer.getWebSite() != null && employer.getCompanyName() != null && employer.getEmail() != null;
		if (isFieldsNotNull) {
			if (TextCheckManager.isEmaiValid(employer.getEmail())) {
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
