package io.github.sarthaka24.neo4jdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories
public class Neo4JDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Neo4JDemoApplication.class, args);
    }

}
