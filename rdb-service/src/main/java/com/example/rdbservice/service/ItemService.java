package com.example.rdbservice.service;

import com.example.rdbservice.entity.Item;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ItemService {
    Mono<List<Item>> getAllItem();
}
