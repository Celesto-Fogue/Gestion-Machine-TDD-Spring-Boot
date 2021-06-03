package com.iuc.msgestionmachine.service;

import com.iuc.msgestionmachine.entity.Machine;
import com.iuc.msgestionmachine.repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;

@Service
public class MachineServiceImpl implements MachineService{

    @Autowired
    private MachineRepository machineRepository;

    @Override
    public Machine ajouterMachine(Machine machine) {
        return machineRepository.save(machine);
    }

    @Override
    public Machine consulterMachine(Long l) {
        return null;
    }

    @Override
    public Machine modifierMachine(Long l, Machine machine) {
        return null;
    }
}
