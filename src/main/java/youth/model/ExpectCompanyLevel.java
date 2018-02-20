package youth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lw
 */

@Data
@Entity
@Table(name = "expect_company_level")
public class ExpectCompanyLevel {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    private String phone;
    private String expectCompanyLevel;

    public ExpectCompanyLevel(){

    }

    public ExpectCompanyLevel(String phone, String expectCompanyLevel) {
        this.phone = phone;
        this.expectCompanyLevel = expectCompanyLevel;
    }
}
