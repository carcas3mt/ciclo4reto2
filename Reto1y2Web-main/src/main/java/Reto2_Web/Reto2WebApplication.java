package Reto2_Web;

import Reto2_Web.infertace.InterfaceCosmetic;
import Reto2_Web.infertace.InterfaceOrder;
import Reto2_Web.infertace.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto2WebApplication implements CommandLineRunner{
    
    @Autowired
    private InterfaceOrder interfaceOrder;
    @Autowired
    private InterfaceUser interfaceUser;
    @Autowired
    private InterfaceCosmetic interfaceCosmetic;
    
    public static void main(String[] args) {
        SpringApplication.run(Reto2WebApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        interfaceCosmetic.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll();
    }

}
