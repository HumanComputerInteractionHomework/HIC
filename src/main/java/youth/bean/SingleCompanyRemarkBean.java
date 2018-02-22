package youth.bean;

import lombok.Data;

@Data
public class SingleCompanyRemarkBean {

/*
* @author:MAX
* 就是单条的评价，威威加油~
*/
    private String phone;
    private String company;
    private int recomandScore;
    private int futureScore;
    private int ceoScore;
    private String remark;

    public SingleCompanyRemarkBean(){

    }

    public SingleCompanyRemarkBean(String phone, String company, int recomandScore, int futureScore, int ceoScore, String remark) {
        this.phone = phone;
        this.company = company;
        this.recomandScore = recomandScore;
        this.futureScore = futureScore;
        this.ceoScore = ceoScore;
        this.remark = remark;
    }
}

