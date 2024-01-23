package com.schedulertm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.schedulertm.entities.Agendamento;


@Component
public interface AgendamentoService {
	
	Agendamento createAgendamento(Agendamento agendamento);
	Agendamento updateAgendamento(Agendamento agendamento);
    List <Agendamento> getAllAgendamento();
    Agendamento getAgendamentoById(long agendamentoId);
    void deleteAgendamento(Integer id);

}
