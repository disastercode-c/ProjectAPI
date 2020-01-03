package com.tcs.project.api.jpa;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.project.api.domain.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Long>{

}
