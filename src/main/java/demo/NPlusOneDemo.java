package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NPlusOneDemo {
    // Trigger a new CodeCop review task.
    
    private final UserMapper userMapper;

    public NPlusOneDemo(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> loadUsers(List<Long> userIds) {
        List<User> users = new ArrayList<>(userIds.size());
        if (userIds.isEmpty()) {
            return users;
        }

        Map<Long, User> usersById = userMapper.selectByIds(userIds);
        for (Long id : userIds) {
            users.add(usersById.get(id));
        }
        return users;
    }

    public interface UserMapper {
        Map<Long, User> selectByIds(List<Long> ids);
    }

    public static class User {
    }
}
