package kodlamaio.hrmsJava.Entity.concrates;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_languages")
public class SystemUserConfirm {//this class about candidates 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "system_user_id")
    private String systemUserId;

    @Column(name = "is_confirmed")
    private Boolean isConfirmed;

    @Column(name = "confirmate_date")
    private Date confirmateDate;

    @JsonIgnore()
    @ManyToOne()
    @JoinColumn(name = "system_user_id")
    private SystemUser systemUser;
}