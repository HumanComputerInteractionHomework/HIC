package youth.bean;

import lombok.Data;

/**
 * @author lw
 */

@Data
public class ExpectCompanyLevelBean {
    private String phone;
    private String expectCompanyLevel;

    public ExpectCompanyLevelBean(){

    }

    public ExpectCompanyLevelBean(String phone, String expectCompanyLevel) {
        this.phone = phone;
        this.expectCompanyLevel = expectCompanyLevel;
    }
}
