package kodlamaio.hrmsJava.Entity.concrates;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="system_user")
public class SystemUser extends User {
 
   @Column(name="first_name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name="identity_number")
   private String identityNumber;

   @Column(name = "birth_year")
   private LocalDate birthYear;

   @JsonIgnore()
   @OneToMany(mappedBy = "system_user_confirms")
   private List<SystemUserConfirm> systemUserConfirm;

}