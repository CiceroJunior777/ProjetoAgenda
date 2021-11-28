/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author cicer
 */
@Entity
public class Agenda implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Tipo;
	private String Descricao;
	private int Hora;
	private int Data;

	public Agenda() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String Tipo) {
		this.Tipo = Tipo;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String Descricao) {
		this.Descricao = Descricao;
	}

	public int getHora() {
		return Hora;
	}

	public void setHora(int Hora) {
		this.Hora = Hora;
	}

	public int getData() {
		return Data;
	}

	public void setData(int Data) {
		this.Data = Data;
	}
	
	
}
