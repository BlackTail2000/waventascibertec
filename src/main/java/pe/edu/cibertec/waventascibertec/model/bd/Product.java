package pe.edu.cibertec.waventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer productid;
    @Column(length = 40, nullable = false)
    private String productname;
    @ManyToOne
    @JoinColumn(name = "supplierid")
    private Supplier supplier;
    @ManyToOne
    @JoinColumn(name = "categoryid")
    private Category category;
    @Column(length = 20)
    private String quantityperunit;
    @Column(columnDefinition = "DECIMAL(10,4)")
    private BigDecimal unitprice;
    @Column(columnDefinition = "SMALLINT")
    private Integer unitsinstock;
    @Column(columnDefinition = "SMALLINT")
    private Integer unitsonorder;
    @Column(columnDefinition = "SMALLINT")
    private Integer reorderlevel;
    @Column(columnDefinition = "BIT(1)", nullable = false)
    private Boolean discontinued;
    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;
}
