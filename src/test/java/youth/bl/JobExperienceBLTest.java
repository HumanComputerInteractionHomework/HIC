package youth.bl;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import youth.bean.JobExperienceBean;
import youth.dao.JobExperienceRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class JobExperienceBLTest {

    @Autowired
    private JobExperienceBL jobExperienceBL;

    @Test
    public void saveJobExperienceTest() throws Exception {
        System.out.println("【开始】");
        List<JobExperienceBean> list=new ArrayList<JobExperienceBean>();
        JobExperienceBean j1=new JobExperienceBean("101","company3","high",
                "A","coder","2010","2011","good");
        JobExperienceBean j2=new JobExperienceBean("101","company4","middle",
                "B","viewer","2011","2012","well");
        list.add(j1);
        list.add(j2);
        jobExperienceBL.saveJobExperience(list);
        Assert.assertEquals("1","1");

    }

    @Test
    public void getJobExperienceTest() throws Exception {
        System.out.println("【开始】");
        List<JobExperienceBean> list=new ArrayList<JobExperienceBean>();
        for(JobExperienceBean e:jobExperienceBL.getJobExperience("101")){
            System.out.println(e);
        }
    }

}