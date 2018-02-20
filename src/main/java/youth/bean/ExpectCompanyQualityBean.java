package youth.bean;

import lombok.Data;

/**
 * @author lw
 */

@Data
public class ExpectCompanyQualityBean {
    private String phone;
    private String expectCompanyQuality;

    public ExpectCompanyQualityBean(){

    }

    public ExpectCompanyQualityBean(String phone, String expectCompanyQuality) {
        this.phone = phone;
        this.expectCompanyQuality = expectCompanyQuality;
    }
}
