package youth.bl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import youth.blservice.UserBLService;
import youth.dao.UserRepository;

import java.util.Map;
@Service
public class UserBL implements UserBLService {
    private final UserRepository userRepository;

    @Autowired
    public UserBL(UserRepository userRepository){
        this.userRepository=userRepository;


    }

    @Override
    public String login(String phone, String password) {
        return userRepository.findByPhone(phone).getPhone();



    }
}
