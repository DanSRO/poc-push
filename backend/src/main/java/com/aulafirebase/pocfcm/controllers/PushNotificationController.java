package com.aulafirebase.pocfcm.controllers;

import com.aulafirebase.pocfcm.dto.PushNotificationRequestDTO;
import com.aulafirebase.pocfcm.services.PushNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class PushNotificationController {
    @Autowired
    private PushNotificationService notificationService;

    @PostMapping
    public ResponseEntity<Void> sendNotification(@RequestBody PushNotificationRequestDTO dto){
        notificationService.sendNotification(dto);
        return ResponseEntity.noContent().build();
    }
}
