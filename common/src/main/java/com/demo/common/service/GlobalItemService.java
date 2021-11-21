package com.demo.common.service;

import com.demo.common.model.GlobalItem;
import reactor.core.publisher.Mono;

import java.util.List;

public interface GlobalItemService {
    Mono<Void> setGlobalItem(List<GlobalItem> globalItems);
    Mono<List<GlobalItem>> getGlobalItem();
}
