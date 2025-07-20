package sum25.SE180470.service;

import sum25.SE180470.pojo.Computer;

import java.util.List;

public interface ComputerService {

    public List<Computer> getAllComputers();
    public void createComputer(Computer computer);
    public void deleteComputer(Computer computer);
    public Computer getComputerById(Integer id);
    public void updateComputer(Computer computer);



}
