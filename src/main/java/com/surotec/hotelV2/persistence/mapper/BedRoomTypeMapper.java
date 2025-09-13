package com.surotec.hotelV2.persistence.mapper;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.surotec.hotelV2.domain.dto.BedRoomTypeDTO;
import com.surotec.hotelV2.persistence.entity.BedRoomTypeEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BedRoomTypeMapper {


    @Mapping(target = "id_type", source = "idTipo" )
    @Mapping(target = "name_type", source = "nombreTipo" )

    BedRoomTypeDTO toBedRoomTypeDTO(BedRoomTypeEntity bedRoomTypeEntity);

    List<BedRoomTypeDTO> toBedRoomTypeDTOs(Iterable<BedRoomTypeEntity> bedRoomTypeEntities);

    @InheritInverseConfiguration
    BedRoomTypeEntity toBedRoomTypeEntity(BedRoomTypeDTO bedRoomTypeDTO);


}
