package sum25.SE180470.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import sum25.SE180470.pojo.Computer;
import sum25.SE180470.pojo.Manufacturer;
import sum25.SE180470.pojo.User;
import sum25.SE180470.repository.ComputerRepository;
import sum25.SE180470.repository.UserRepository;
import sum25.SE180470.service.ComputerService;
import sum25.SE180470.service.ManufacturerService;
import sum25.SE180470.service.UserService;

@SpringBootApplication
@EnableJpaRepositories("sum25.SE180470.repository")
@ComponentScan(basePackages = "sum25.SE180470")
@EntityScan("sum25.SE180470.pojo")
public class PeHsf662323Se1804870Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PeHsf662323Se1804870Application.class, args);
    }

    @Autowired
    private ComputerService computerService;
    @Autowired
    private UserService userService;
    @Autowired
    private ManufacturerService manufacturerService;

    @Override
    public void run(String... args) throws Exception {
        if(computerService.getAllComputers().isEmpty()){

//        Email	Password	Role
//        admin@laptopshop.com	@1	Admin
//        staff@laptopshop.com	@2	Staff
//        member@laptopshop.com	@3	Member

        User admin = new User("admin@laptopshop.com",  "Admin","@1");
        User staff = new User("staff@laptopshop.com",  "Staff","@2");
        User member = new User("member@laptopshop.com",  "Member","@3");
        userService.createUser(admin);
        userService.createUser(staff);
        userService.createUser(member);
        System.out.println("Users created successfully!");
//        manufacturer_name	country
//        Dell	USA
//        Lenovo	China
//        HP	USA
        Manufacturer dell = new Manufacturer("Dell", "USA");
        Manufacturer lenovo = new Manufacturer("Lenovo", "China");
        Manufacturer hp = new Manufacturer("HP", "USA");
        manufacturerService.createManufacturer(dell);
        manufacturerService.createManufacturer(lenovo);
        manufacturerService.createManufacturer(hp);
        System.out.println("Manufacturers created successfully!");


//        computer_model	type	production_year	price	manufacturer_id
//        XPS 13	Ultrabook	2023	1299.99	1
//        ThinkPad X1 Carbon	Business Laptop	2023	1499.99	2
//        Pavilion 15	Consumer Laptop	2022	699.99	3
//        Inspiron 14	Budget Laptop	2023	549.99	1

        Computer xps13 = new Computer("XPS 13", "Ultrabook", 2023, 1299.99, dell);
        Computer thinkPadX1 = new Computer("ThinkPad X1 Carbon", "Business Laptop", 2023, 1499.99, lenovo);
        Computer pavilion15 = new Computer("Pavilion 15", "Consumer Laptop", 2022, 699.99, hp);
        Computer inspiron14 = new Computer("Inspiron 14", "Budget Laptop", 2023, 549.99, dell);
        computerService.createComputer(xps13);
        computerService.createComputer(thinkPadX1);
        computerService.createComputer(pavilion15);
        computerService.createComputer(inspiron14);
        System.out.println("Computers created successfully!");

    }
    }
}
