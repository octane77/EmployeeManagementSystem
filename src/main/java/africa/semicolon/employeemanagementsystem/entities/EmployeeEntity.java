package africa.semicolon.employeemanagementsystem.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="employees")
public class EmployeeEntity {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    private String emailId;
}
