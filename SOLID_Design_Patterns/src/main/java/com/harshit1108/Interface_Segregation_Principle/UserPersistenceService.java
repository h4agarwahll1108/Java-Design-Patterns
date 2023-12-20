package com.harshit1108.Interface_Segregation_Principle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserPersistenceService implements PersistenceService<User>{

    private static final Map<Long, User> userList =  new HashMap<>();

    @Override
    public void save(User entity) {
        synchronized(userList) {
            userList.put(entity.getId(),entity);
            entity.setId((long) Math.random());
        }
    }
    @Override
    public void delete(User entity) {
        synchronized(userList) {
            userList.remove(entity.getId());
        }
    }
    @Override
    public User findById(Long id) {
        synchronized(userList) {
            return userList.get(id);
        }
    }

    //Extra method which is not common to product.
    public List<User> findByName(String username){
        synchronized(userList){
          return  userList.values()
                  .stream()
                  .filter(u->u.getUsername().equalsIgnoreCase(username))
                  .collect(Collectors.toList());
        }
    }
}
