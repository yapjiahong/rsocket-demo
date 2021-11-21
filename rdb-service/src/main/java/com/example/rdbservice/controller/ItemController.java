package com.example.rdbservice.controller;

import com.example.rdbservice.entity.Item;
import com.example.rdbservice.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@Slf4j
public class ItemController {

    private final ItemService itemService;

    public ItemController(final ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping(value = "/getItems", method = RequestMethod.GET)
    public Mono<List<Item>> getAllItems() {
        return this.itemService.getAllItem();
    }
}
