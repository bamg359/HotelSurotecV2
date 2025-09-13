package com.surotec.hotelV2.web.controllers;


import com.surotec.hotelV2.domain.dto.BedRoomTypeDTO;
import com.surotec.hotelV2.domain.services.BedRoomTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BedRoomTypeController {

    final private BedRoomTypeService bedRoomTypeService;

    public BedRoomTypeController(BedRoomTypeService bedRoomTypeService) {
        this.bedRoomTypeService = bedRoomTypeService;
    }

    @GetMapping("/bedrooms_type")
    @ResponseBody
    public List<BedRoomTypeDTO> getBedRooms() {

        return bedRoomTypeService.getBedRooms();

    }
    
}
