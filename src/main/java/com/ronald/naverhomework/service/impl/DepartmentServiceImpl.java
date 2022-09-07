package com.ronald.naverhomework.service.impl;

import com.ronald.naverhomework.payload.dto.DepartmentDto;
import com.ronald.naverhomework.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public DepartmentDto getDepartmentDto(DepartmentDto departmentDto) {
        log.info("info ne: " + departmentDto.toString());
        return departmentDto;
    }
}
