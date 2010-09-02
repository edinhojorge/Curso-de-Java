package br.com.dominio.visao;

import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.dominio.negocio.BaseNegocio;
import br.com.dominio.negocio.TemperaturaNegocio;

/**
 * @author eder
 * 
 * Classe de visão que mostra a saída do resultado do 
 * negócio em uma janela do ambiente gráfico.
 * O negócio é {@link TemperaturaNegocio} 
 * @see TemperaturaNegocio
 */
public class JanelaTemperaturaVisao extends BaseVisao {

	/**
	 * Cidade usada na pesquisa
	 */	
	String cidade;

	/**
	 * Construtor para forçar o recebimento de uma cidade
	 * @param cidade
	 */	
	public JanelaTemperaturaVisao(String cidade) {
		this.cidade = cidade;
	}

	@Override
	protected BaseNegocio getNegocio() {
		return new TemperaturaNegocio();
	}

	@Override
	public void mostrar() {

		String temperatura = getNegocio().executarNegocio(cidade);
		JLabel labelTemperatura = new JLabel(temperatura);

		JFrame janela = new JFrame("Temperatura de " + cidade);

		janela.setSize(300, 100);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.getContentPane().add(labelTemperatura);
		
		janela.setVisible(true);

	}

}
