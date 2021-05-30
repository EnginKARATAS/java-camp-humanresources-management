package kodlamaio.hrmsJava.business.concrates;

import java.util.List;

import kodlamaio.hrmsJava.Entity.concrates.Candicate;
import kodlamaio.hrmsJava.business.abstracts.CandicateService;
import kodlamaio.hrmsJava.core.abstracts.MailSenderService;
 import kodlamaio.hrmsJava.core.adapters.abstracts.CandicateCheckService;
import kodlamaio.hrmsJava.core.concrates.TextCheckManager;
import kodlamaio.hrmsJava.core.utilities.results.ErrorResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsJava.dataAccess.abstracts.CandicateDao;

public class CandicateManager implements CandicateService{

	private CandicateDao _candicateDao;
	private CandicateCheckService _candicateCheckService;
	private MailSenderService _mailSenderService;
	
	public CandicateManager(CandicateDao _candicateDao) {
		this._candicateDao = _candicateDao;
 	}

	@Override
	public Result add(Candicate candicate) {
		boolean isFieldsNotNull = candicate.getDateOfBirth() != null && candicate.getEmail() != null && candicate.getName() != null && candicate.getSurname() != null && candicate.getNationalId() != null;
		
		if (isFieldsNotNull) {
			
			if (_candicateCheckService.isUserExist(candicate)) {
				if (TextCheckManager.isEmaiValid(candicate.getEmail())) {				
					_candicateDao.save(candicate);
					String token = "123123";
					_mailSenderService.sendToken(candicate, token);
					return new SuccessDataResult<Candicate>("Kullanıcı eklendi");					
				}
				else {
					return new ErrorResult("E posta biçimi geçersiz)");	
				}	
			}
			else {
				return new ErrorResult("Mernis doğrulaması başarısız.");
			}
		}
		else {
			return new ErrorResult("Girilen alanlar boş olamaz.");
		}
 		 
	}

	@Override
	public void delete(Candicate candicate) {
		_candicateDao.delete(candicate);
	}

	@Override
	public void update(Candicate candicate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Candicate candicate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Candicate> getAll() {
		return _candicateDao.findAll();
	}
 

}
