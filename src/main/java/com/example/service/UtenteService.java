package com.example.service;

import com.example.entity.User;
import com.example.model.request.UserRequest;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtenteService {

   @Autowired
   UserRepository userRepository;

   public Iterable<User> findAll() {
      return userRepository.findAll();
   }

   public void save(String name, String email) {
      User n = new User();
      n.setName(name);
      n.setEmail(email);
      userRepository.save(n);
   }

   public void delete(Integer n) {
      userRepository.deleteById(n);
   }

   public void save(User request) {
      userRepository.save(request);
   }

   public void save(UserRequest request) {
      User n = new User();
      n.setName(request.getName());
      n.setEmail(request.getEmail());
      userRepository.save(n);
   }

   public void update(Integer id, String email) {
      Optional<User> n = userRepository.findById(id);
      if(n.isPresent()) {
         n.get().setEmail(email);
         userRepository.save(n.get());
      } else {
         throw new RuntimeException("Utente non trovato");
      }

   }
}
