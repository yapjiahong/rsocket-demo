package com.example.rsocketservice.controller;

import com.alibaba.rsocket.RSocketService;
import com.demo.common.model.GlobalItem;
import com.demo.common.service.GlobalItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class ItemController {

    private final GlobalItemService globalItemService;

    public ItemController(final GlobalItemService globalItemService) {
        this.globalItemService = globalItemService;
    }

    @RequestMapping(value = "globalItems", method = RequestMethod.GET)
    public Mono<List<GlobalItem>> getGlobalItems(){
        return this.globalItemService.getGlobalItem();
    }
}
