package com.example.boot.roomwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServices {

    private  RoomRepository roomRepository;

    @Autowired
    public RoomServices(RoomRepository roomRepository){
        super();
        this.roomRepository=roomRepository;
    }
    /*private static List<Room> rooms= new ArrayList<>();

    static {
        for(int i=0; i<10 ; i++){
            rooms.add(new Room(i, "Room "+i,"R"+i, "Q"));
        }
    } */
    public List<Room> getAllRooms(){
        List<Room> rooms = new ArrayList<Room>();
        this.roomRepository.findAll().forEach(rooms::add);
        return rooms;
    }
}
