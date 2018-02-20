package youth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lw
 */

@Data
@Entity
@Table(name = "expectation")
public class Expectation {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    private String phone;
    private String salary;
    private Integer lowSalary;
    private Integer highSalary;


    public Expectation(){

    }

    public Expectation(String phone, String salary, Integer lowSalary, Integer highSalary) {
        this.phone = phone;
        this.salary = salary;
        this.lowSalary = lowSalary;
        this.highSalary = highSalary;
    }
}
