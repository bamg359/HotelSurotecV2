package com.surotec.hotelV2.persistence;

import com.surotec.hotelV2.domain.dto.BedRoomTypeDTO;
import com.surotec.hotelV2.domain.repository.BedRoomTypeRepository;
import com.surotec.hotelV2.persistence.crud.CrudBedRoomType;
import com.surotec.hotelV2.persistence.mapper.BedRoomTypeMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class BedRoomTypeEntityRepository implements BedRoomTypeRepository {


    final private  CrudBedRoomType crudBedRoomType;
    final private BedRoomTypeMapper bedRoomTypeMapper;

    public BedRoomTypeEntityRepository(CrudBedRoomType crudBedRoomType, BedRoomTypeMapper bedRoomTypeMapper) {
        this.crudBedRoomType = crudBedRoomType;
        this.bedRoomTypeMapper = bedRoomTypeMapper;
    }


    @Override
    public List<BedRoomTypeDTO> getBedRoomsType() {
        return this.bedRoomTypeMapper.toBedRoomTypeDTOs(this.crudBedRoomType.findAll());
    }


}
