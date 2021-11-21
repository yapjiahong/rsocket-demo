package com.example.rdbservice.service.impl;

import com.demo.common.model.GlobalItem;
import com.demo.common.service.GlobalItemService;
import com.example.rdbservice.entity.Item;
import com.example.rdbservice.repository.ItemRepository;
import com.example.rdbservice.service.ItemService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final GlobalItemService globalItemService;

    public ItemServiceImpl(final ItemRepository itemRepository,
                           final GlobalItemService globalItemService) {
        this.itemRepository = itemRepository;
        this.globalItemService = globalItemService;
    }

    @PostConstruct
    private void init() {
        this.globalItemService.setGlobalItem(
                this.itemRepository.findAll()
                        .stream()
                        .parallel()
                        .map(iteam -> new GlobalItem(iteam.getId(), iteam.getKeyColumn(), iteam.getValueColumn()))
                        .collect(Collectors.toList())
        );
    }

    @Override
    public Mono<List<Item>> getAllItem() {
        return Mono.just(this.itemRepository.findAll());
    }
}
