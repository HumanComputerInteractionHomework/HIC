package youth.bl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import youth.blservice.CompanyBLService;
import youth.dao.JobDetailRepository;

import static org.junit.Assert.*;

/**
 * @author lw
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyBLTest {
    @Test
    public void getJobDetailByJobId() throws Exception {
        System.out.println(companyBLService.getJobDetailByJobId("39663835"));
    }
    @Test
    public void testMy() throws Exception {
        System.out.println("【开始】");
        System.out.println(jobDetailRepository.findByJobId("39047799"));
    }

    @Autowired
    private JobDetailRepository jobDetailRepository;

    @Autowired
    private CompanyBLService companyBLService;

    @Test
    public void companyRemark() throws Exception {

    }

    @Test
    public void getCompanyRemark() throws Exception {
        System.out.println("【开始】");
        System.out.println(companyBLService.getCompanyRemark("大连万达"));
    }

}