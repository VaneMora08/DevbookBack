package com.devbook.formattech.service.implementation;

import com.devbook.formattech.service.RolService;
import com.devbook.formattech.repository.RolRepository;
import com.devbook.formattech.converter.RolMapper;
import com.devbook.formattech.Dto.RolDto;
import com.devbook.formattec.entity.Rol;
import com.devbook.formattech.exceptions.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@service
public class RolServiceImpl implements RolService {

  private static final Logger log = LoggerFactory.getLogger(CountryServiceImpl.class);

  @Autowired
  private RolRepository rolRepository;

  @Autowired
  private RolMapper rolMapper;

  @Override
  public RolDto createRol(RolDto rolDto) {
    Rol rol = rolMapper.rol(rolDto);
    rol = rolRepository.save(rol);
    return rolMapper.rolDto(rol)
  }

  @Override
  public List<RolDto> getAllRoles() {
    return rolRepository.findAll().stream()
            .map(RolMapper::rolDto).collect(Collectors.toUnmodifiableList());
  }

  @Override
  public RolDto getRolById(int id) {
    return rolRepository.findById(id)
            .map(RolMapper::rolDto)
            .orElseThrow(() -> new ResourceNotFoundException("Rol not found with id: " + id)
  }

  @Override
  public RolDto updateRol(int id, RolDto rolDto) {
    Rol existingRol = getRolById(id);
    existingRol.setRol(rolDto.getRol());
    Rol updatedRol = rolRepository.save(existingRol);
    return rolMapper.rolDto(updatedRol)
  }

  @Override
  public RolDto deleteRol(int id) {
    Country existingRol = getRolById(id);
    rolRepository.delete(existingRol)
  }
}
