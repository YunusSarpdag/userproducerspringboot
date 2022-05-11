package com.kafka.yunus.userproducerconsumerspringboot.service;

import com.kafka.yunus.userproducerconsumerspringboot.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducereService {
    @Autowired
    KafkaTemplate<String , UserDto> kafkaTemplate;

    public void sendUserDate(UserDto user){
        kafkaTemplate.send("user-topic" , user.getName() , user);
    }
}
