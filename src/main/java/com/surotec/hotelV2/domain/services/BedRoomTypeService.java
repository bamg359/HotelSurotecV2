package com.surotec.hotelV2.domain.services;


import com.surotec.hotelV2.domain.dto.BedRoomTypeDTO;
import com.surotec.hotelV2.domain.repository.BedRoomTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedRoomTypeService {

    final private BedRoomTypeRepository bedRoomTypeRepository;

    public BedRoomTypeService(BedRoomTypeRepository bedRoomTypeRepository) {
        this.bedRoomTypeRepository = bedRoomTypeRepository;
    }


    public List<BedRoomTypeDTO> getBedRooms() {

        return bedRoomTypeRepository.getBedRoomsType();
    }

}
