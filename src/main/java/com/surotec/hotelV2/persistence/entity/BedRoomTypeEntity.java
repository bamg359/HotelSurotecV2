package com.surotec.hotelV2.persistence.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bed_room_type")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BedRoomTypeEntity {

    @Id
    @Column(name = "id_type")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipo;
    @Column(name = "name_type", nullable = false, length = 50)
    private String nombreTipo;
}
