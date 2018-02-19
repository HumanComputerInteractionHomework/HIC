package youth.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "job_experience")
public class JobExperience {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    private String phone;
    private String companyName;
    private String companyQuality;
    private String companyLevel;
    private String job;
    private String fromTime;
    private String toTime;
    private String description;


    public JobExperience(){

    }

    public JobExperience(String phone, String companyName, String companyQuality, String companyLevel, String job, String fromTime, String toTime, String description) {
        this.phone = phone;
        this.companyName = companyName;
        this.companyQuality = companyQuality;
        this.companyLevel = companyLevel;
        this.job = job;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.description = description;
    }
}
