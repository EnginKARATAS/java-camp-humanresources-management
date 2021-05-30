package kodlamaio.hrmsJava.core.adapters.concrates;

 
import kodlamaio.hrmsJava.Entity.concrates.Candicate;
import kodlamaio.hrmsJava.core.adapters.abstracts.CandicateCheckService;

public class MernisValidationAdapter implements CandicateCheckService {

	@Override
	public boolean isUserExist(Candicate candicate) {
		// TODO Auto-generated method stub
		System.out.println("mernis okey verdi");
		return true;
	}

 
}
