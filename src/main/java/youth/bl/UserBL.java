package youth.bl;
//.....


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import youth.bean.ResultMessageBean;
import youth.blservice.UserBLService;
import youth.dao.UserRepository;
import youth.model.User;

@Service
public class UserBL implements UserBLService {
    private final UserRepository userRepository;

    @Autowired
    public UserBL(UserRepository userRepository){
        this.userRepository=userRepository;


    }

    @Override
    public ResultMessageBean login(String phone, String password) {

        try {
            String realPassword= userRepository.findByPhone(phone).getPassword();
            System.out.println(realPassword);
            System.out.println(password);
            if (realPassword.equals(password)) {
                return new ResultMessageBean(true, "登陆成功");

            } else {
                return new ResultMessageBean(false, "登录失败");

            }


        }catch (Exception e){
            return new ResultMessageBean(false, "登录失败");

        }
    }

    @Override
    public ResultMessageBean signUp(String phone, String password, String mail, String name) {


        User user=new User(phone, mail, password, name);
       try{
            userRepository.save(user);
        }catch (Exception e){

            return new ResultMessageBean(false,"手机号已注册");

        }


        return new ResultMessageBean(true);
    }

    @Override
    public ResultMessageBean editPassword(String phone, String password) {
        try {
            userRepository.editPassword(phone,password);
            return new ResultMessageBean(true,"密码修改成功");
        }catch (Exception e){
            return new ResultMessageBean(false,"密码修改失败");
        }
    }
}
