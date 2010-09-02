package br.com.dominio.visao;

import br.com.dominio.negocio.BaseNegocio;
import br.com.dominio.negocio.GoogleTemperaturaNegocio;
import br.com.dominio.negocio.TemperaturaNegocio;

/**
 * @author eder
 * 
 * Classe de visão que mostra a saída do resultado do 
 * negócio direto na console.
 * O negócio é {@link TemperaturaNegocio} 
 * @see TemperaturaNegocio
 */
public class ConsoleTemperaturaVisao extends BaseVisao {

	/**
	 * Cidade usada na pesquisa
	 */
	private String cidade;
	
	/**
	 * Construtor para forçar o recebimento de uma cidade
	 * @param cidade
	 */
	public ConsoleTemperaturaVisao(String cidade) {
		this.cidade = cidade;
	}
	
	@Override
	protected BaseNegocio getNegocio() {
		//return new TemperaturaNegocio();
		return new GoogleTemperaturaNegocio();
	}
	
	@Override
	public void mostrar() {	
		System.out.println(getNegocio().executarNegocio(cidade)); 
		
	}
}
