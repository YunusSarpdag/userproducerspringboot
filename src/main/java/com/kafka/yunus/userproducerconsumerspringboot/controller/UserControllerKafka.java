package com.kafka.yunus.userproducerconsumerspringboot.controller;

import com.kafka.yunus.userproducerconsumerspringboot.dto.UserDto;
import com.kafka.yunus.userproducerconsumerspringboot.service.KafkaProducereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("userDataSender")
public class UserControllerKafka {

    @Autowired
    private KafkaProducereService kafkaProducereService;

    @PostMapping("/sendUserData")
    public void setUserData(@RequestBody UserDto user){
        kafkaProducereService.sendUserDate(user);

    }
}
