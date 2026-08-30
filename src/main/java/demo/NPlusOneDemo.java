package demo;

import java.util.ArrayList;
import java.util.List;

public class NPlusOneDemo {
    // Trigger a new CodeCop review task.
    //test1
    //test2
    
    private final UserMapper userMapper;

    public NPlusOneDemo(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> loadUsers(List<Long> userIds) {
        List<User> users = new ArrayList<>();
        for (Long id : userIds) {
            users.add(userMapper.selectById(id));
        }
        return users;
    }

    public interface UserMapper {
        User selectById(Long id);
    }

    public static class User {
    }
}
