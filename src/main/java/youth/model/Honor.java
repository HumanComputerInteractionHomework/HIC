package youth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lw
 */

@Data
@Entity
@Table(name = "honor")
public class Honor {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    private String phone;
    private String honorName;
    private String level;

    public Honor(){

    }

    public Honor(String phone, String honorName, String level) {
        this.phone = phone;
        this.honorName = honorName;
        this.level = level;
    }

}
