package com.surotec.hotelV2.persistence.crud;

import com.surotec.hotelV2.persistence.entity.BedRoomTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudBedRoomType extends CrudRepository<BedRoomTypeEntity,Integer > {


}
