package com.iuc.msgestionmachine.service;

import com.iuc.msgestionmachine.entity.Machine;
import com.iuc.msgestionmachine.repository.MachineRepository;
import com.iuc.msgestionmachine.repository.MachineRepositoryTest;
import org.aspectj.lang.annotation.Before;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MachineServiceTest {

    @Autowired
    private MachineService machineService;

    @Autowired
    private MachineRepository machineRepository;

    @BeforeEach //??????????
    public void init(){

    }

    @Test
    public void creerMachineTest(){
        Machine machine = new Machine(null, "REF101", "Details");
        machine = machineService.ajouterMachine(machine);
        assertNotNull(machine);
    }

    @Test
    public void consulterMachineTest(){
        Machine machine = new Machine(1L, "REF101", "Details");
        Machine data = machineService.consulterMachine(1L);
        assertEquals(machine, data);
    }

    @Test
    public void modifierMachineTest(){
        Machine machine = new Machine(null, "REF101", "Details");
        Machine data = machineService.modifierMachine(1L, machine);
    }

    @Test
    public void supprimerMachineTest(){

    }

    @Test
    public void listerMachineTest(){

    }

    @Test
    public void rechercherMachineTest(){

   }
}
