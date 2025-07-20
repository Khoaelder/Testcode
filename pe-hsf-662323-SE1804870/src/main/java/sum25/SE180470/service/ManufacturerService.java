package sum25.SE180470.service;

import sum25.SE180470.pojo.Manufacturer;

import java.util.List;

public interface ManufacturerService {

    public List<Manufacturer> getAllManufacturers();
    public void createManufacturer(Manufacturer manufacturer);

}
