package com.iuc.msgestionmachine.repository;

import com.iuc.msgestionmachine.entity.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MachineRepository extends JpaRepository<Machine, Long> {

}
