package io.github.sarthaka24.neo4jdemo.service;

import io.github.sarthaka24.neo4jdemo.domain.User;
import io.github.sarthaka24.neo4jdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByName(String name) {
        return this.userRepository.findByName(name);
    }

    @Override
    public User findByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User findByMobileBrand(String brandName) {
        return this.userRepository.findByMobilePhone_BrandName(brandName);
    }

    @Override
    public User findByProcessorBrandName(String processorBrandName) {
        return this.userRepository.findByMobilePhone_Processor_brand(processorBrandName);
    }
}
