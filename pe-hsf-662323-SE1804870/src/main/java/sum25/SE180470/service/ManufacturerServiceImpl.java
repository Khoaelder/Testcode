package sum25.SE180470.service;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import sum25.SE180470.pojo.Manufacturer;
import sum25.SE180470.repository.ManufacturerRepository;
import sum25.SE180470.repository.UserRepository;

import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    @Autowired
    public ManufacturerRepository manufacturerRepository;


    @Override
    public List<Manufacturer> getAllManufacturers() {
        return  manufacturerRepository.findAll();
    }

    @Override
    public void createManufacturer(Manufacturer manufacturer) {
        manufacturerRepository.save(manufacturer);
    }
}
