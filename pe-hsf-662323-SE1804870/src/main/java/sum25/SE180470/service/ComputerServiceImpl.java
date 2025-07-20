package sum25.SE180470.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sum25.SE180470.pojo.Computer;
import sum25.SE180470.repository.ComputerRepository;

import java.util.List;
@Service
public class ComputerServiceImpl implements  ComputerService {

    @Autowired
    private ComputerRepository computerRepository;

    @Override
    public List<Computer> getAllComputers() {
        return computerRepository.findAll() ;
    }

    @Override
    public void createComputer(Computer computer) {
        computerRepository.save(computer);
    }

    @Override
    public void deleteComputer(Computer computer) {
        computerRepository.delete(computer);
    }

    @Override
    public Computer getComputerById(Integer id) {
        return computerRepository.findById(id).orElse(null);
    }

    @Override
    public void updateComputer(Computer computer) {
       Computer existingComputer = computerRepository.findById(computer.getComputerId()).orElse(null);
        if (existingComputer != null) {
            existingComputer.setComputerModel(computer.getComputerModel());
            existingComputer.setType(computer.getType());
            existingComputer.setProductionYear(computer.getProductionYear());
            existingComputer.setPrice(computer.getPrice());
            existingComputer.setManufacturer(computer.getManufacturer());
            computerRepository.save(existingComputer);

        }




    }
}
