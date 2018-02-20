package youth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lw
 */


@Data
@Entity
@Table(name = "user_basic_message")
public class UserBasicMessage {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    private String phone;
    private String realName;
    private String birthday;
    private String gender;
    private String address;
    private Double jobYear;
    private String salary;
    private Integer lowSalary;
    private Integer highSalary;
    private Integer basicSalary;
    private Integer bonus;
    private Integer commission;
    private Integer stockShareOption;

    public UserBasicMessage(){

    }

    public UserBasicMessage(String phone, String realName, String birthday, String gender, String address,
                            Double jobYear, String salary, Integer lowSalary, Integer highSalary,
                            Integer basicSalary, Integer bonus, Integer commission, Integer stockShareOption) {
        this.phone = phone;
        this.realName = realName;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
        this.jobYear = jobYear;
        this.salary = salary;
        this.lowSalary = lowSalary;
        this.highSalary = highSalary;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.commission = commission;
        this.stockShareOption = stockShareOption;
    }

}
