package kodlamaio.hrmsJava.Entity.concrates;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

  
	@Entity
	@Data
	@NoArgsConstructor
	@Table(name = "languages_candidates")
	public class SchoolCandidate {
		
		
	    @Column(name="cv_id")
	    private int cvId;
	    
	    @Column(name="school_id")
	    private int schoolId;
	    
	    @Column(name="start_date")
	    private Date startDate;

	    @Column(name="finish_date")
	    private Date finishDate;
	    
	    @Column(name="is_finished")
	    private boolean isFinished;

	    @JsonIgnore() 
	    @ManyToOne()
	    @JoinColumn(name = "candidate_id")
	    private Candidate candidate;
	    
	    private School school;

	}

	
	
 
