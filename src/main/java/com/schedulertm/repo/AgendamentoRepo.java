package com.schedulertm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.schedulertm.entities.Agendamento;

@Repository
public interface AgendamentoRepo extends JpaRepository<Agendamento, Integer> {
	
	// SELECT * FROM AGENDAMENTO WHERE DATAREGISTRO BETWEEN '22/01/2024' AND '22/01/2024';
	@Query(value="SELECT * FROM AGENDAMENTO WHERE DATAREGISTRO = :today",nativeQuery = true)
	List<Agendamento> findToday(String today);
	
	@Query(value="SELECT * FROM AGENDAMENTO WHERE DATAREGISTRO BETWEEN :startDate AND :endDate",nativeQuery = true)
	List<Agendamento> findByRangeDate(String startDate, String endDate);

}
