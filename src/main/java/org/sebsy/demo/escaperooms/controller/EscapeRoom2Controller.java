package org.sebsy.demo.escaperooms.controller;

import org.sebsy.demo.escaperooms.bll.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("room2")
public class EscapeRoom2Controller {

    private RoomService roomService;

    @Autowired
    public EscapeRoom2Controller( RoomService roomService) {
        this.roomService = roomService;
    }

    public void entreeSalle2() {
        System.out.println(roomService.entreeSalle());
    }

}
