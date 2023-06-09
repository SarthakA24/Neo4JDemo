package io.github.sarthaka24.neo4jdemo.repository;

import io.github.sarthaka24.neo4jdemo.domain.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long> {

    User findByName(String name);
    User findByEmail(String email);
//    @Query("MATCH (u:User)-[:HAS_MOBILE]->(m:Mobile) WHERE m.brandName = $brandName RETURN u")
    User findByMobilePhone_BrandName(String brandName);
    User findByMobilePhone_Processor_brand(String processorBrandName);
}
