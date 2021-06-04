package kodlamaio.hrmsJava.Entity.concrates;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "verification_code_employers")
public class VerificationCodeEmployer {
   @Id
   @Column(name = "id")
   private int id;

  
   @JsonIgnore()
   @JoinColumn(name = "employer_id")
   private Candidate candidate;

}