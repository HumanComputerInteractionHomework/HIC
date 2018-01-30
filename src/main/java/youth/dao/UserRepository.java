package youth.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import youth.model.User;


public interface UserRepository extends JpaRepository<User, String> {

    User findByPhone(String phone);








}
