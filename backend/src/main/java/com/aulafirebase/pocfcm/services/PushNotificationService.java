package com.aulafirebase.pocfcm.services;

import com.aulafirebase.pocfcm.dto.PushNotificationRequestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PushNotificationService {
    private Logger logger = LoggerFactory.getLogger(PushNotificationService.class);

    @Autowired
    private FCMService fcmService;

    public void sendNotification(PushNotificationRequestDTO dto){
        try{
            fcmService.sendMessageToToken(dto);
        }catch (Exception e){
            logger.error(e.getMessage());
        }

    }
}
