package kodlamaio.hrmsJava.business.concrates;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsJava.Entity.concrates.Job;
import kodlamaio.hrmsJava.business.abstracts.JobService;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.ErrorResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsJava.core.utilities.results.SuccessResult;
import kodlamaio.hrmsJava.dataAccess.abstracts.JobDao;

@Service
public class JobManager implements JobService {

	JobDao _jobDao;

	@Autowired
	public JobManager(JobDao _jobDao) {
		super();
		this._jobDao = _jobDao;
	}

	@Override
	public Result add(Job job) {
		boolean isFieldsNotNull = job.getContent() != null; 
		if(this._jobDao.findByjobTitleEquals(job.getTitle()) != null) {

			this._jobDao.save(job);			
			return new SuccessResult("sistemde aynı isme ait bir iş var");
		}
		else {
			return new ErrorResult("sistemde aynı isme ait bir iş var");
		}
		// TODO Auto-generated method stub
	}
	
	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<>(this._jobDao.findAll());
	}

	@Override
	public Optional<Job> findById(int id) {
		return this._jobDao.findById(id);
	}	


	
 
	
}
