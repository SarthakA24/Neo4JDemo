package io.github.sarthaka24.neo4jdemo.service;

import io.github.sarthaka24.neo4jdemo.domain.User;

public interface UserService {
    User findByName(String name);
    User findByEmail(String email);
    User saveUser(User user);
    User findByMobileBrand(String brandName);
    User findByProcessorBrandName(String processorBrandName);
}
