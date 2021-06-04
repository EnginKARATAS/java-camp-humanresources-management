package kodlamaio.hrmsJava.business.concrates;

import java.util.List;

import kodlamaio.hrmsJava.Entity.concrates.Employer;
import kodlamaio.hrmsJava.Entity.concrates.JobAdvertsement;
import kodlamaio.hrmsJava.business.abstracts.JobAdvertsementService;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsJava.core.utilities.results.SuccessResult;
import kodlamaio.hrmsJava.dataAccess.abstracts.JobAdvertsementDao;

public class JobAdvertsementManager implements JobAdvertsementService {

	JobAdvertsementDao _jobAdvertsementDao;

	public JobAdvertsementManager(JobAdvertsementDao _jobAdvertsementDao) {
		this._jobAdvertsementDao = _jobAdvertsementDao;
	}

	@Override
	public DataResult<List<JobAdvertsement>> getAll() {
		return new SuccessDataResult<>(this._jobAdvertsementDao.findAll(), "bilgiler listelendi");
	}
  
	@Override
	public Result add(JobAdvertsement jobAdvertsement, Employer employer) {
		this._jobAdvertsementDao.save(jobAdvertsement);
		return new SuccessResult("yeni job advertsement dbye"+ employer.getCompanyName() +"şirketi tarafından eklendi");
	}

	@Override
	public Result delete(JobAdvertsement jobAdvertsement,  Employer employer) {
		this._jobAdvertsementDao.delete(jobAdvertsement);
		return new SuccessResult("başarıyla silindi");
	}

	@Override
	public Result update(JobAdvertsement jobAdvertsement,  Employer employer) {
		return new SuccessResult("başarıyla güncellendi");
	}

	@Override
	public Result remove(JobAdvertsement jobAdvertsement,  Employer employer) {
		return new SuccessResult("başarıyla silindi");
	}

	@Override
	public Result unactive(JobAdvertsement jobAdvertsement,  Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result active(JobAdvertsement jobAdvertsement,  Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

}
