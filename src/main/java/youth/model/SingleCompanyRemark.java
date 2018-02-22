package youth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lw
 */

@Data
@Entity
@Table(name = "single_company_remark")
public class SingleCompanyRemark {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    private String phone;
    private String company;
    private Integer recomandScore;
    private Integer futureScore;
    private Integer ceoScore;
    private String remark;

    public SingleCompanyRemark(){

    }

    public SingleCompanyRemark(String phone, String company, int recomandScore, int futureScore, int ceoScore, String remark) {
        this.phone = phone;
        this.company = company;
        this.recomandScore = recomandScore;
        this.futureScore = futureScore;
        this.ceoScore = ceoScore;
        this.remark = remark;
    }
}

