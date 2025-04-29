package edu.ICET.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String departmentType;
    private LocalDateTime createdAt;
    private LocalDateTime UpdatedAt;
}
