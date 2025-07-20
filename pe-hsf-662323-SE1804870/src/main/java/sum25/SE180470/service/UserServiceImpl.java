package sum25.SE180470.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sum25.SE180470.pojo.User;
import sum25.SE180470.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email, String password) {
        return userRepository.findByEmailAndPassword(email,password);

    }
}
