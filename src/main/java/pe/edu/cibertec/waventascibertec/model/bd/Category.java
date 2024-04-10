package pe.edu.cibertec.waventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "categories")
public class Category {

    @Id @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryid;
    @Column(length = 15, nullable = false)
    private String categoryname;
    @Column(columnDefinition = "MEDIUMTEXT")
    private String description;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
