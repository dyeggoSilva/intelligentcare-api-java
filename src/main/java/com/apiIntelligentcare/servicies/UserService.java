package com.apiIntelligentcare.servicies;

import com.apiIntelligentcare.entitiles.Cursos;

import com.apiIntelligentcare.entitiles.User;
import com.apiIntelligentcare.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> listAll(){
        return userRepository.findAll();
    }

    public Object listId(int id){
        return userRepository.findById(id);
    }

    public User saveCurso(User user){
        return userRepository.save(user);
    }

    public void dellCurso(Integer id) {
        userRepository.deleteById(id);
    }


    public Optional<User> atualiUser(Integer id, User user) {
        Optional<User> cursoId = userRepository.findById(id);
        cursoId = Optional.of(userRepository.save(user));
        return cursoId;
    }




}
