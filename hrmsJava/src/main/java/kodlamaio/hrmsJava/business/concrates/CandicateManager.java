package kodlamaio.hrmsJava.business.concrates;

import java.util.List;

import kodlamaio.hrmsJava.Entity.concrates.Candicate;
import kodlamaio.hrmsJava.business.abstracts.CandicateService;
import kodlamaio.hrmsJava.dataAccess.abstracts.CandicateDao;

public class CandicateManager implements CandicateService{

	private CandicateDao _candicateDao;
	
	public CandicateManager(CandicateDao _candicateDao) {
		this._candicateDao = _candicateDao;
	}

	@Override
	public boolean add(Candicate candicate) {
 		_candicateDao.save(candicate);
 		return true;
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
