package com.surotec.hotelV2.web.controllers;


import com.surotec.hotelV2.domain.dto.BedRoomTypeDTO;
import com.surotec.hotelV2.domain.services.BedRoomTypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BedRoomTypeController {

    final private BedRoomTypeService bedRoomTypeService;

    public BedRoomTypeController(BedRoomTypeService bedRoomTypeService) {
        this.bedRoomTypeService = bedRoomTypeService;
    }

    @GetMapping("/bedrooms_type")
    public List<BedRoomTypeDTO> getBedRooms() {

        return this.bedRoomTypeService.getBedRooms();

    }

    @GetMapping("/bedroom_type_id/{id_type}")
    public BedRoomTypeDTO getBedRoomById(@PathVariable int id_type) {
        return bedRoomTypeService.getBedRoomById(id_type);
    }


    @PostMapping("/create_bedroom_type" )
    public BedRoomTypeDTO createBedRoomType(@RequestBody BedRoomTypeDTO bedRoomTypeDTO) {
        return bedRoomTypeService.createBedRoomType(bedRoomTypeDTO);
    }


    @PutMapping("/update_bedroom_type/{id_type}")
    public BedRoomTypeDTO updateBedRoomType(@PathVariable Integer id_type , @RequestBody BedRoomTypeDTO bedRoomTypeDTO){
        return bedRoomTypeService.updateBedRoomType(id_type, bedRoomTypeDTO);
    }


    @DeleteMapping("/delete_bedroom_type/{id_type}")
    public void deleteBedRoomType(@PathVariable Integer id_type){
        bedRoomTypeService.deleteBedRoomType(id_type);
    }

}
