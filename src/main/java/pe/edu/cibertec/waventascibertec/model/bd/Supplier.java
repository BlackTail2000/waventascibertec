package pe.edu.cibertec.waventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer supplierid;
    @Column(length = 40, nullable = false)
    private String companyname;
    @Column(length = 30)
    private String contactname;
    @Column(length = 30)
    private String contacttitle;
    @Column(length = 60)
    private String address;
    @Column(length = 15)
    private String city;
    @Column(length = 15)
    private String region;
    @Column(length = 10)
    private String postalcode;
    @Column(length = 15)
    private String country;
    @Column(length = 24)
    private String phone;
    @Column(length = 24)
    private String fax;
    @Column(columnDefinition = "MEDIUMTEXT")
    private String homepage;
    @OneToMany(mappedBy = "supplier")
    private List<Product> products;
}
