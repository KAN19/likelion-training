package com.ronald.naverhomework.controller;

import com.ronald.naverhomework.payload.BaseResponse;
import com.ronald.naverhomework.payload.dto.EmployeeDto;
import com.ronald.naverhomework.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<?> createEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
        return ResponseEntity.ok().body(BaseResponse.success(employeeService.getEmployeeDto(employeeDto)));
    }

}
