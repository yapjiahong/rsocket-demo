package com.example.rsocketservice.service.impl;

import com.alibaba.rsocket.RSocketService;
import com.demo.common.model.GlobalItem;
import com.demo.common.service.GlobalItemService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
@RSocketService(serviceInterface = GlobalItemService.class)
public class RSocketGlobalItemServiceImpl implements GlobalItemService{

    final List<GlobalItem> globalItemsList = new ArrayList<>();

    @Override
    public Mono<Void> setGlobalItem(List<GlobalItem> globalItems) {
        globalItemsList.addAll(globalItems);
        return Mono.empty();
    }

    @Override
    public Mono<List<GlobalItem>> getGlobalItem() {
        return Mono.just(this.globalItemsList);
    }
}
