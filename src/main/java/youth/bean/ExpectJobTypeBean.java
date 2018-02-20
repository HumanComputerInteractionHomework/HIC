package youth.bean;

import lombok.Data;

/**
 * @author lw
 */

@Data
public class ExpectJobTypeBean {
    private String phone;
    private String expectJobType;

    public ExpectJobTypeBean(){

    }

    public ExpectJobTypeBean(String phone, String expectJobType) {
        this.phone = phone;
        this.expectJobType = expectJobType;
    }
}
