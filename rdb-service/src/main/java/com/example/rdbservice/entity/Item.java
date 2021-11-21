package com.example.rdbservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item")
public class Item {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "key_column")
    private String keyColumn;

    @Column(name = "value_column")
    private String valueColumn;

}
