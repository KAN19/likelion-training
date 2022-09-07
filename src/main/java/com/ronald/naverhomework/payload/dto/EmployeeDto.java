package com.ronald.naverhomework.payload.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class EmployeeDto {
    private String employeeId;

    @NotEmpty(message = "name khong duoc de trong")
    @Size(min = 10, max = 50, message = "Ten trong khoang 10 den 50 ky tu!")
    private String name;

    @JsonFormat( pattern = "dd-MM-yyyy")
    private LocalDate birthDate;

    private String gender;
    @NotEmpty(message = "email khong duoc de trong")
    @Email(message = "email khong dung format")
    private String email;
}
