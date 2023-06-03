package s105_n1Ex5_ObjetoFichero;

import java.io.Serializable;

public class MiObjeto implements Serializable { 
	// crear una clase que implemente Serializable
	
	//atributos
	private String sol;
	private int luna;
	
	//Construtor 
	public MiObjeto(String sol,int luna) {
		this.setSol(sol);
		this.setLuna(luna);
		
	}
    //getters 
	public String getSol() {
		return sol;
	}
	public int getLuna() {
		return luna;
	}
    //setters
	public void setSol(String sol) {
		this.sol = sol;
	}

	public void setLuna(int luna) {
		this.luna = luna;
	}
}
