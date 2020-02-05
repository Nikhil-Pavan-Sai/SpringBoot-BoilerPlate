package com.zemoso.project.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "Sample") //Give your table name here as per the table present in mysql
@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
public class Sample {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    //Add more attributes as per your requirement
}
