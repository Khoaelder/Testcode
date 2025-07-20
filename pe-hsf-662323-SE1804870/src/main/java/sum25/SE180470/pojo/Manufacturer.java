package sum25.SE180470.pojo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="manufacturers ")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manufacturer_id")
    private  Integer manufacturerId;
    @Column(name = "manufacturer_name",columnDefinition = "VARCHAR(100) NOT NULL UNIQUE")
    private  String manufacturerName;
    @Column(name ="country",columnDefinition = "VARCHAR(100)")
    private  String country;

    public Manufacturer(String manufacturerName, String country) {
        this.manufacturerName = manufacturerName;
        this.country = country;
    }
}
