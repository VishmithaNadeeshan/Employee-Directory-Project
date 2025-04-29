package edu.ICET.dto;

import lombok.*;
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
    private String departmentType;
    private LocalDateTime createdAt;
    private LocalDateTime UpdatedAt;
}
