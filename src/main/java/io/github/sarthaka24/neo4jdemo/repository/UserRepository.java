package io.github.sarthaka24.neo4jdemo.repository;

import io.github.sarthaka24.neo4jdemo.domain.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long> {

    User findByName(String name);
    User findByEmail(String email);
}
