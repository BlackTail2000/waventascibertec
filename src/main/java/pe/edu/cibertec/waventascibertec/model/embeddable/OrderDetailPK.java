package pe.edu.cibertec.waventascibertec.model.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import pe.edu.cibertec.waventascibertec.model.bd.Order;
import pe.edu.cibertec.waventascibertec.model.bd.Product;

@Data
@Embeddable
public class OrderDetailPK {
    @Column(insertable = false, updatable = false)
    private Integer orderid;
    @Column(insertable = false, updatable = false)
    private Integer productid;
}
