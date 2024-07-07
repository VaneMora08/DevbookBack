package com.devbook.formattech.service;

import com.devbook.formattech.Dto.StackDto;

import java.util.List;

public interface StackService {

    StackDto createStack (StackDto stackDto);
    List<StackDto> getAllStacks();
    StackDto getStackById(int id);
    StackDto updateStack(int id, StackDto stackDto);
    void deleteStack(int id);

}
