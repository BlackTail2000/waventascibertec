package pe.edu.cibertec.waventascibertec.model.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class CompanyContact {
    @Column(length = 40, nullable = false)
    private String companyname;
    @Column(length = 30)
    private String contactname;
    @Column(length = 30)
    private String contacttitle;
}
