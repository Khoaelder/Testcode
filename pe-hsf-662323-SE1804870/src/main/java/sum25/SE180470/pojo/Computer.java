package sum25.SE180470.pojo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="computers  ")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "computer_id")
    private Integer computerId;
    @Column(name = "computer_model")
    private String computerModel;
    @Column(name = "type")
    private String type;

    @Column(name = "production_year")
    private Integer productionYear;
    @Column(name = "price")
    private  Double price;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;


    public Computer(String computerModel, String type, Integer productionYear, Double price, Manufacturer manufacturer) {
        this.computerModel = computerModel;
        this.type = type;
        this.productionYear = productionYear;
        this.price = price;
        this.manufacturer = manufacturer;
    }
}




