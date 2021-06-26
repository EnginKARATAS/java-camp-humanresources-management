package kodlamaio.hrmsJava.Entity.concrates;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="candidates")
public class Candidate extends User {

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="identity_number")
    private String identityNumber;

    @Column(name = "birth_year")
    private LocalDate birthYear;
 
    @JsonIgnore()
    @OneToMany(mappedBy = "schools_candidates")
    private List<SchoolCandidate> candidateSchools;
    
    @JsonIgnore()
    @OneToMany(mappedBy = "verification_code_candidates")
    private List<VerificationCodeCandidate> verificationCodeCandidates;

    @JsonIgnore()
    @OneToMany(mappedBy = "jobs_candicates")
    private List<JobCandidate> jobCandidates;

    @JsonIgnore()
    @OneToMany(mappedBy = "languages_candidates")
    private List<LanguageCandidate> languageCandidate;

    @JsonIgnore()
    @OneToMany(mappedBy = "schools_candidates")
    private List<SchoolCandidate> schoolCandidate;

}
