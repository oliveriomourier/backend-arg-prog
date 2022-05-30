package com.ap.SpringBoot.services;

import com.ap.SpringBoot.models.User;
import com.ap.SpringBoot.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User newUser(User user){
        return userRepo.save(user);
    }

    public List<User> findAll(){
        return userRepo.findAll();
    }

    public Optional<User> findUserById(Long id){
        return userRepo.findById(id);
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }
}
