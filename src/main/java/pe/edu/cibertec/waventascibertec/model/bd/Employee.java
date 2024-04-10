package pe.edu.cibertec.waventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import pe.edu.cibertec.waventascibertec.model.embeddable.AddressDetails;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeid;
    @Column(length = 20, nullable = false)
    private String lastname;
    @Column(length = 10, nullable = false)
    private String firstname;
    @Column(length = 30)
    private String title;
    @Column(length = 25)
    private String titleofcourtesy;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(columnDefinition = "DATETIME")
    private Date birthdate;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(columnDefinition = "DATETIME")
    private Date hiredate;
    @Embedded
    private AddressDetails addressDetails;
    @Column(length = 24)
    private String homephone;
    @Column(length = 4)
    private String extension;
    @Column(columnDefinition = "MEDIUMTEXT", nullable = false)
    private String notes;
    @Column
    private Integer reportsto;
    @Column
    private String photopath;
    @Column
    private Float salary;
    @OneToMany(mappedBy = "employee")
    private List<Order> orders;
}
