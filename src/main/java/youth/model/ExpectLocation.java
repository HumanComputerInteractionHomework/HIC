package youth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lw
 */

@Data
@Entity
@Table(name = "expect_location")
public class ExpectLocation {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    private String phone;
    private String expectLocation;

    public ExpectLocation(){

    }

    public ExpectLocation(String phone, String expectLocation) {
        this.phone = phone;
        this.expectLocation = expectLocation;
    }
}
