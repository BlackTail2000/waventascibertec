package pe.edu.cibertec.waventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import pe.edu.cibertec.waventascibertec.model.embeddable.OrderDetailPK;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "orderdetails")
public class OrderDetail {
    @Id
    private OrderDetailPK id;
    @ManyToOne
    @JoinColumn(name = "orderid", nullable = false)
    private Order order;
    @ManyToOne
    @JoinColumn(name = "productid", nullable = false)
    private Product product;
    @Column(columnDefinition = "DECIMAL(10,4)", nullable = false)
    private BigDecimal unitprice;
    @Column(columnDefinition = "SMALLINT", nullable = false)
    private Integer quantity;
    @Column(columnDefinition = "DOUBLE(8,0)", nullable = false)
    private Double discount;
}
