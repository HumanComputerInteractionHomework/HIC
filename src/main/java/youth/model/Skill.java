package youth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lw
 */

@Data
@Entity
@Table(name = "skill")
public class Skill {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    private String phone;
    private String skillName;
    private String degree;
    private String certificate;
    private String description;

    public Skill(){

    }

    public Skill(String phone, String skillName, String degree, String certificate, String description) {
        this.phone = phone;
        this.skillName = skillName;
        this.degree = degree;
        this.certificate = certificate;
        this.description = description;
    }
}
