package youth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import youth.model.JobDetail;
import youth.model.ProjectExperience;

import java.util.List;

/*
* @author:MAX
*/
public interface JobDetailRepository extends JpaRepository<JobDetail, String> {



    @Query(value = "SELECT * FROM job2_0 WHERE job2_0.job_id in (SELECT DISTINCT job_like.job_id from job_like WHERE phone=:ph)", nativeQuery = true)
    List<JobDetail> getSavedJob(@Param("ph")String phone);




}

