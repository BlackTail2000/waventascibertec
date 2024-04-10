package pe.edu.cibertec.waventascibertec.model.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class AddressDetails {
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
}
