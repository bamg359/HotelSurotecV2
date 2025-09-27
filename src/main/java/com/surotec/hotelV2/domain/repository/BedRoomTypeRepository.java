package com.surotec.hotelV2.domain.repository;

import com.surotec.hotelV2.domain.dto.BedRoomTypeDTO;

import java.util.List;

public interface BedRoomTypeRepository {

    public List<BedRoomTypeDTO> getBedRoomsType();


    public BedRoomTypeDTO getBedRoomById(int id_type);

    public BedRoomTypeDTO createBedRoomType(BedRoomTypeDTO bedRoomTypeDTO);

    public BedRoomTypeDTO updateBedRoomType(Integer id_type , BedRoomTypeDTO bedRoomTypeDTO);

    public void deleteBedRoomType(Integer id_type);
}
