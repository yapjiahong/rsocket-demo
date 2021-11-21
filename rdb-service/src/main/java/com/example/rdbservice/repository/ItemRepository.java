package com.example.rdbservice.repository;

import com.example.rdbservice.entity.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {

    List<Item> findAll();

}
