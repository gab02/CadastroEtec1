package br.com.etechoracio.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="db_etec")
public class product extends BaseORM  {


		
		@Id
		@GeneratedValue
		@Column(name="codigo")
		private Long codigo;
		
		@Column(name="nome")
		private String nome;
		
		@Column(name="endereco")
		private String logradouro;
		
		@Column(name="cidade")
		private String cidade;
		
		@Column(name="bairro")
		private String bairro;
		
		@Column(name="dt_registro")
		private String cep;
		
		@Column(name="latitude")
		private double latitude;
		
		@Column(name="longitude")
		private double longitude;

		@Override
		public Long getId() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setId(Long arg0) {
			// TODO Auto-generated method stub
			
		}

	}

