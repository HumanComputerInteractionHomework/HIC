package youth.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import youth.model.Honor;
import youth.model.JobDetail;

import javax.transaction.Transactional;
import java.util.List;


public interface JobDetailRepository extends JpaRepository<JobDetail, Integer> {

//    @Transactional
//    void deleteByJobId(@Param("jobId") String jobId);

    JobDetail findByJobId(String jobId);


}
