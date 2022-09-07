package com.ronald.naverhomework.payload.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class DepartmentDto {
    private Long departmentId;
    @NotEmpty(message = "deptName khong duoc de trong")
    @Size(min = 10, max = 50, message = "deptName trong khoang 10 den 50 ky tu!")
    private String deptName;
    @NotEmpty(message = "Description khong dc de trong")
    private String description;

    @Valid
    private List<EmployeeDto> employees;

}
