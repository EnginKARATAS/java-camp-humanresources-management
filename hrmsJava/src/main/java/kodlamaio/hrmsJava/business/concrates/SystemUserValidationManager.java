package kodlamaio.hrmsJava.business.concrates;

import kodlamaio.hrmsJava.Entity.concrates.Employer;
import kodlamaio.hrmsJava.business.abstracts.SystemUserValidationService;

public class SystemUserValidationManager implements SystemUserValidationService {

	@Override
	public boolean isSystemUserConfirmed(Employer employer) {
		// TODO Auto-generated method stub
		System.out.println("kullanıcı doğrulandı(artık buraya başka servisler gelir gider o fieldi kontrol eder)");
		return true;
	}

}
