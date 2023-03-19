package io.github.sarthaka24.neo4jdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@NodeEntity
public class Processor {
    @Id
    @GeneratedValue
    private Long id;
    private String brand;
}
