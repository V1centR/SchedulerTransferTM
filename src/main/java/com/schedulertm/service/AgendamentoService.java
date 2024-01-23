package com.schedulertm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.schedulertm.entities.Agendamento;


@Component
public interface AgendamentoService {
	
	Agendamento createAgendamento(Agendamento agendamento);
	
	Agendamento updateAgendamento(Agendamento agendamento);
	
    List <Agendamento> getAllAgendamento();
    
    List <Agendamento> getTodayAgendamento();
    
    List<Agendamento> findByRangeDate(String startDate, String endDate);
    
    Agendamento getAgendamentoById(long agendamentoId);
    
    void deleteAgendamento(Integer id);

}
