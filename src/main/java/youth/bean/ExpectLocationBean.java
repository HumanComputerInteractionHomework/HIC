package youth.bean;

import lombok.Data;

/**
 * @author lw
 */

@Data
public class ExpectLocationBean {
    private String phone;
    private String expectLocation;

    public ExpectLocationBean(){

    }

    public ExpectLocationBean(String phone, String expectLocation) {
        this.phone = phone;
        this.expectLocation = expectLocation;
    }
}
