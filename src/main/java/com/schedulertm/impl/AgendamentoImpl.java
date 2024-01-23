package com.schedulertm.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schedulertm.entities.Agendamento;
import com.schedulertm.repo.AgendamentoRepo;
import com.schedulertm.service.AgendamentoService;

@Service("agendamentoImpl")
public class AgendamentoImpl implements AgendamentoService{

	@Autowired
	AgendamentoRepo repository;
	
	
	@Override
	public Agendamento createAgendamento(Agendamento agendamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agendamento updateAgendamento(Agendamento agendamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Agendamento> getAllAgendamento() {

		return repository.findAll();
	}

	@Override
	public Agendamento getAgendamentoById(long agendamentoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAgendamento(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
