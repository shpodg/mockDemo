package demo.userfront.service;

import demo.userfront.vo.UserVo;

import java.util.List;

/**
 * Created by oneday on 2016/7/22 0022.
 */
public interface UserService {
    UserVo getUser(String userId);
    int updateUser(UserVo user);
    String createUser(UserVo user);
    List<UserVo> getUsers();
}
