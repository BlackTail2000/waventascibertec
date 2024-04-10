package pe.edu.cibertec.waventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer orderid;
    @ManyToOne
    @JoinColumn(name = "customerid")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "employeeid")
    private Employee employee;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(columnDefinition = "DATETIME")
    private Date orderdate;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(columnDefinition = "DATETIME")
    private Date requireddate;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(columnDefinition = "DATETIME")
    private Date shippeddate;
    @Column
    private Integer shipvia;
    @Column(columnDefinition = "DECIMAL(10,4)")
    private BigDecimal freight;
    @Column(length = 40)
    private String shipname;
    @Column(length = 60)
    private String shipaddress;
    @Column(length = 15)
    private String shipcity;
    @Column(length = 15)
    private String shipregion;
    @Column(length = 10)
    private String shippostalcode;
    @Column(length = 15)
    private String shipcountry;
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;
}
