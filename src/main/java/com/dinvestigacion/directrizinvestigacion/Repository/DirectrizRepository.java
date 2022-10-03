package com.dinvestigacion.directrizinvestigacion.Repository;

import com.dinvestigacion.directrizinvestigacion.Models.DirectrizInvestigacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectrizRepository extends JpaRepository<DirectrizInvestigacion, Long> {

}
