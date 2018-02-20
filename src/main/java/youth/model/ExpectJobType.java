package youth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lw
 */

@Data
@Entity
@Table(name = "expect_job_type")
public class ExpectJobType {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    private String phone;
    private String expectJobType;

    public ExpectJobType(){

    }

    public ExpectJobType(String phone, String expectJobType) {
        this.phone = phone;
        this.expectJobType = expectJobType;
    }
}
