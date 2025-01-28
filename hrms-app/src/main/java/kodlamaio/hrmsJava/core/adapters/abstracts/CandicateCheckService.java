package kodlamaio.hrmsJava.core.adapters.abstracts;


import kodlamaio.hrmsJava.Entity.concrates.Candidate;

interface CandidateCheckService {
	boolean isUserExist(Candidate candicate);
}	
