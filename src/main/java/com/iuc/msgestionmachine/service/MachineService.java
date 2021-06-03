package com.iuc.msgestionmachine.service;

import com.iuc.msgestionmachine.entity.Machine;

public interface MachineService {

    public Machine ajouterMachine(Machine machine);

    public Machine consulterMachine(Long l);

    public Machine modifierMachine(Long l, Machine machine);
}
