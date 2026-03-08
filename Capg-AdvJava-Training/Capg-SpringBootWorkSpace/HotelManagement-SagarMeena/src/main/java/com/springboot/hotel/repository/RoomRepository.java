package com.springboot.hotel.repository;
import org.springframework.data.repository.CrudRepository;


import com.springboot.Entity.Room;

public interface RoomRepository extends CrudRepository<Room, String> {

}
