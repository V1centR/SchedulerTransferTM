package com.schedulertm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "AGENDAMENTO")
public class Agendamento {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "data_sequence")
	@SequenceGenerator(name = "data_sequence", sequenceName = "data_sequence_custom",initialValue = 1, allocationSize = 3)
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
	
	public Agendamento(String ctaOrigem2, String ctaDestino2, String dataRegistro2, String dataTransferencia2,
			String valorTransferencia2, String taxaAplicavel2, String status2) {
		// TODO Auto-generated constructor stub
	}

	
}
