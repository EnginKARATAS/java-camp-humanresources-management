package kodlamaio.hrmsJava.business.concrates;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsJava.Entity.concrates.Job;
import kodlamaio.hrmsJava.business.abstracts.JobService;
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
	public List<Job> getAll() {
		return this._jobDao.findAll();
	}

	@Override
	public Optional<Job> findById(int id) {
		return this._jobDao.findById(id);
	}
 
	
}
