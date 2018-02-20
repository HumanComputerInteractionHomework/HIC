package youth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lw
 */

@Data
@Entity
@Table(name = "expect_company_quality")
public class ExpectCompanyQuality {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    private String phone;
    private String expectCompanyQuality;

    public ExpectCompanyQuality(){

    }

    public ExpectCompanyQuality(String phone, String expectCompanyQuality) {
        this.phone = phone;
        this.expectCompanyQuality = expectCompanyQuality;
    }
}
