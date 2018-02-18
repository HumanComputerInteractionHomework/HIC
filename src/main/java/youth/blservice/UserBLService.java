package youth.blservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import youth.bean.ResultMessageBean;
import youth.dao.UserRepository;

import java.util.Map;

public interface UserBLService {


    public ResultMessageBean  login(String username, String password);
    public ResultMessageBean signUp(String phone, String password, String mail, String name);
    public ResultMessageBean editPassword(String phone, String password);



}
