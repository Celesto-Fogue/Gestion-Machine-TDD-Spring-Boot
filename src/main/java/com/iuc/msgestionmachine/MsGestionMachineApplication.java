package com.iuc.msgestionmachine;

import com.iuc.msgestionmachine.entity.Machine;
import com.iuc.msgestionmachine.service.MachineService;
import com.iuc.msgestionmachine.service.MachineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsGestionMachineApplication {

    @Autowired
    private MachineService machineService;

    public static void main(String[] args) {
        SpringApplication.run(MsGestionMachineApplication.class, args);
    }

    @Bean
    CommandLineRunner start(MachineServiceImpl machineServiceImpl){
        return args -> {
            System.out.println(" +++++++++++ MACHINE +++++++++++ ");
            machineServiceImpl.ajouterMachine(new Machine(null, "REF101", "Details"));
        };
    }
}
