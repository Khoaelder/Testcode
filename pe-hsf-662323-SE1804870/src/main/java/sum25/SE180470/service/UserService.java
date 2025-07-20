package sum25.SE180470.service;

import sum25.SE180470.pojo.User;

public interface UserService {


    public void createUser(User user);
    public User findUserByEmail(String email, String password );

}
