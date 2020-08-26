package com.franz.cursomc.dto;

import java.io.Serializable;

import com.franz.cursomc.domain.Categoria;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class CategoriaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	/*houve a necessidade de importação das seguintes bibliotecas, a partir do mvnrepository:
	 * 	<!-- https://mvnrepository.com/artifact/javax.validation/validation-api -->

		<dependency>
		
		<groupId>javax.validation</groupId>
		
		<artifactId>validation-api</artifactId>
		
		<version>2.0.1.Final</version>
		
		</dependency>
		
		
		<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-validator -->
		
		<dependency>
		
		<groupId>org.hibernate</groupId>
		
		<artifactId>hibernate-validator</artifactId>
		
		<version>6.1.5.Final</version>
		
		</dependency>
	*/
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=80, message="O tamanho deve ser entre 5 e 80 caracteres")
	private String nome;
	
	public CategoriaDTO() {
		
	}
	
	public CategoriaDTO(Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
