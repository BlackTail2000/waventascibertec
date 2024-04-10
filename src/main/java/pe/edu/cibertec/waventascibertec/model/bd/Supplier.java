package pe.edu.cibertec.waventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import pe.edu.cibertec.waventascibertec.model.embeddable.AddressDetails;
import pe.edu.cibertec.waventascibertec.model.embeddable.CompanyContact;

import java.util.List;

@Data
@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer supplierid;
    @Embedded
    private CompanyContact companyContact;
    @Embedded
    private AddressDetails addressDetails;
    @Column(length = 24)
    private String phone;
    @Column(length = 24)
    private String fax;
    @Column(columnDefinition = "MEDIUMTEXT")
    private String homepage;
    @OneToMany(mappedBy = "supplier")
    private List<Product> products;
}
