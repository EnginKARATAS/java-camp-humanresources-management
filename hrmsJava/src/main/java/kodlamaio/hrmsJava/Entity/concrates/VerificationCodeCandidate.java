package kodlamaio.hrmsJava.Entity.concrates;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
 import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "verification_code_candidates")
public class VerificationCodeCandidate {
    @Id
    @Column(name = "id")
    private int id;

  
    @Column(name="created_at", columnDefinition = "Date default CURRENT_DATE")
    private LocalDate createdAt = LocalDate.now();

    @JsonIgnore()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

}