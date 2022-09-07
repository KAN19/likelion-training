package com.ronald.naverhomework.controller;

import com.ronald.naverhomework.payload.BaseResponse;
import com.ronald.naverhomework.payload.dto.DepartmentDto;
import com.ronald.naverhomework.payload.dto.EmployeeDto;
import com.ronald.naverhomework.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<?> createDepartment(@RequestBody @Valid DepartmentDto departmentDto) {
        return ResponseEntity.ok().body(BaseResponse.success(departmentService.getDepartmentDto(departmentDto)));
    }

}
