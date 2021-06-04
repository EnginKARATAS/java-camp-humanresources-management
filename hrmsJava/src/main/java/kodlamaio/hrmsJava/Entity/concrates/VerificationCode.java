package kodlamaio.hrmsJava.Entity.concrates;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="candidates")

public class VerificationCode {
	

    @Column(name="id")
    private String id;

    @Column(name = "code")
    private String code;

    @Column(name="is_verified")
    private String isVerified;

    @Column(name = "verified_date")
    private LocalDate verifiedDate;
 
    @JsonIgnore()
    @OneToMany(mappedBy = "verification_code_candidates")
    private List<VerificationCodeCandidate> verificationCodeCandidats;
    
    @JsonIgnore()
    @OneToMany(mappedBy = "verification_code_employers")
    private List<VerificationCodeEmployer> verificationCodeEmployer;
    
  
}