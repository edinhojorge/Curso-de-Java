package br.com.dominio.main;

public class Visibilidade {
	
	private int atributoPrivado;
	int atributoDefault;
	protected int atributoProtegido;
	public int atributoPublico;
	
	private void metodoPrivado(){
		System.out.print(atributoPrivado);
	}

	void metodoDefault(){
		metodoPrivado();
	}
	
	protected void metodoProtegido(){
		
	}
	
	public void metodoPublico(){
		
	}

}
