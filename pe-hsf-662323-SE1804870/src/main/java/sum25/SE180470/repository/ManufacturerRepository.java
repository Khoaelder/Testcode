package sum25.SE180470.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sum25.SE180470.pojo.Manufacturer;
@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer,Integer> {
}
