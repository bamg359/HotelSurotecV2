package com.surotec.hotelV2.domain.repository;

import com.surotec.hotelV2.domain.dto.BedRoomTypeDTO;

import java.util.List;

public interface BedRoomTypeRepository {

    public List<BedRoomTypeDTO> getBedRoomsType();
}
