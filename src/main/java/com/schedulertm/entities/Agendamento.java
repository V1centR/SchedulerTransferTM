package com.schedulertm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "AGENDAMENTO")
public class Agendamento {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
	
	@Column(name = "DATAREGISTRO", length = 50, nullable = false)
    private String dataRegistro;
	
	@Column(name = "DATATRANSFERENCIA", nullable = false)
	private String dataTransferencia;
	
	@Column(name = "VALORTRANSFERENCIA", nullable = false)
	private String valorTransferencia;
	
	@Column(name = "CTAORIGEM", nullable = false)
	private String ctaOrigem;
	
	@Column(name = "CTADESTINO", nullable = false)
	private String ctaDestino;
	
	@Column(name = "TAXAAPLICAVEL", nullable = false)
	private String taxaAplicavel;
	
	@Column(name = "STATUS", nullable = false)
	private String status;
	


}
