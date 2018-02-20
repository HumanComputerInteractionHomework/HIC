package youth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lw
 */

@Data
@Entity
@Table(name = "project_experience")
public class ProjectExperience {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    private String phone;
    private String projectName;
    private String projectLevel;
    private String fromTime;
    private String toTime;
    private String projectDescription;
    private String jobDescription;

    public ProjectExperience(){

    }

    public ProjectExperience(String phone, String projectName, String projectLevel, String fromTime, String toTime, String projectDescription, String jobDescription) {
        this.phone = phone;
        this.projectName = projectName;
        this.projectLevel = projectLevel;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.projectDescription = projectDescription;
        this.jobDescription = jobDescription;
    }
}
