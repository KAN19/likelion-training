package com.ronald.naverhomework.service.impl;

import com.ronald.naverhomework.payload.dto.EmployeeDto;
import com.ronald.naverhomework.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
//    @Override
//    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto) {
//        log.info("Info ne:" + employeeDto.toString());
//        return employeeDto;
//    }

    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto) {
        throw new RuntimeException("Error testing!!");
    }
}
