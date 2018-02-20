package youth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lw
 */

@Data
@Entity
@Table(name = "education")
public class Education {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    private String phone;
    private String educationDegree;
    private String school;
    private String major;
    private String fromTime;
    private String toTime;

    public Education(){

    }

    public Education(String phone, String educationDegree, String school, String major, String fromTime, String toTime) {
        this.phone = phone;
        this.educationDegree = educationDegree;
        this.school = school;
        this.major = major;
        this.fromTime = fromTime;
        this.toTime = toTime;
    }
}

