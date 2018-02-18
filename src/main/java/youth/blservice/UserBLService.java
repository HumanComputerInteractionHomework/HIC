package youth.blservice;
//.....
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import youth.dao.UserRepository;

import java.util.Map;

public interface UserBLService {

    String  login(String username, String password);

}
