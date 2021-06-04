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

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="candidates")

public class Candidate extends User {

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="national_id")
    private String nationalId;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "description")
    private String description;

    @JsonIgnore()
    @OneToMany(mappedBy = "schools_candidates")
    private List<SchoolCandidate> candidateSchools;
    
    @JsonIgnore()
    @OneToMany(mappedBy = "schools_candidates")
    private List<VerificationCodeCandidate> verificationCodeCandidate;

   
    @JsonIgnore()
    @OneToMany(mappedBy = "candidates")
    private List<LanguageCandidate> candidateLanguages;

}
