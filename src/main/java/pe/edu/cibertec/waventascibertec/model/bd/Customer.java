package pe.edu.cibertec.waventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import pe.edu.cibertec.waventascibertec.model.embeddable.AddressDetails;
import pe.edu.cibertec.waventascibertec.model.embeddable.CompanyContact;

import java.util.List;

@Data
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @Column(length = 5)
    private String customerid;
    @Embedded
    private CompanyContact companyContact;
    @Embedded
    private AddressDetails addressDetails;
    @Column(length = 24)
    private String phone;
    @Column(length = 24)
    private String fax;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}
