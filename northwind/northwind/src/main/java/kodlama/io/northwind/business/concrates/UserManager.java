package kodlama.io.northwind.business.concrates;

import kodlama.io.northwind.business.abstracts.UserService;
import kodlama.io.northwind.core.dataAccess.UserDao;
import kodlama.io.northwind.core.entities.User;
import kodlama.io.northwind.core.utilities.results.DataResult;
import kodlama.io.northwind.core.utilities.results.Result;
import kodlama.io.northwind.core.utilities.results.SuccessDataResult;
import kodlama.io.northwind.core.utilities.results.SuccessResult;

public class UserManager implements UserService{
	private UserDao _userDao;

	public UserManager(UserDao userDao) {
		
		this._userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this._userDao.save(user);
		return new SuccessResult("kullanıcı eklendi")
	}

	@Override
	public DataResult<User> findByEmail(String mail) {
		return new SuccessDataResult<User>(this._userDao.findByEmail(mail), "kullanıcı bulundu");
	}
	
}
