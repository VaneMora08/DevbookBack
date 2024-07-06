package com.devbook.formattech.converter;


import com.devbook.formattech.Dto.RolDto;
import com.devbook.formattech.entity.Rol;
import org.springframework.stereotype.Component;

@Component
public class RolMapper {

    public static RolDto rolDto(Rol rol) {

        RolDto rolDto = new RolDto();
        rolDto.setId(rol.getId());
        rolDto.setRol(rol.getRol());
        return rolDto;

    }

    public static Rol rol (RolDto rolDto) {

        Rol rol = new Rol();
        rol.setId(rolDto.getId());
        rol.setRol(rolDto.getRol());
        return rol;
    }
}
