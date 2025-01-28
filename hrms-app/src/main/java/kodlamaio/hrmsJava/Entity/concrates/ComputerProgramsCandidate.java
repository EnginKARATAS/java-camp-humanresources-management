//package kodlamaio.hrmsJava.Entity.concrates;
//
//import java.time.LocalDate;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.sun.istack.NotNull;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "computer_programs_candidates")
//public class ComputerProgramsCandidate {
//
//    @Id
//    @Column(name="id")
//    @GeneratedValue( strategy = GenerationType.IDENTITY )
//    private int id;
//    @Column(name = "computer_program_id")
//    private String computerProgramId;
//
//    @Column(name = "candidate_cv_id")
//    private String candidateCvId;
//
//    @Column(name="created_at", columnDefinition = "Date default CURRENT_DATE")
//    private LocalDate createdAt = LocalDate.now();
//
//    @JsonIgnore()
//    @ManyToOne()
//    @JoinColumn(name = "candidate_id")
//    private Candidate candidate;
//
//}
