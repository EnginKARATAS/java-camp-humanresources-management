package kodlamaio.hrmsJava.business.concrates;

import java.util.List;

import kodlamaio.hrmsJava.Entity.concrates.Candidate;
import kodlamaio.hrmsJava.business.abstracts.CandidateService;
import kodlamaio.hrmsJava.core.abstracts.MailSenderService;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.dataAccess.abstracts.CandidateDao;

public class CandidateManager implements CandidateService {

	private CandidateDao _candidateDao;
 	private MailSenderService _mailSenderService;
	
	public CandidateManager(CandidateDao candidateDao) {
		this._candidateDao = candidateDao;
 	}


	@Override
	public List<Candidate> getAll() {
		return null;
	}

	@Override
	public Result add(Candidate Candidate) {
		return null;
	}

	@Override
	public void delete(Candidate Candidate) {

	}

	@Override
	public void update(Candidate Candidate) {

	}

	@Override
	public void remove(Candidate Candidate) {

	}
}
