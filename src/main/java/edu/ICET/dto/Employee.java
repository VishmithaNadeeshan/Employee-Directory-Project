package edu.ICET.dto;

import lombok.*;
import util.DepartmentType;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Integer id;
    private String name;
    private String email;
    private DepartmentType departmentType;
    private LocalDateTime createdAt;
    private LocalDateTime UpdatedAt;
}
