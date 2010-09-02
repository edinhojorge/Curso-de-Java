package br.com.dominio.negocio;


/**
 * Classe base para todas os negócios que serão implementadas
 * @author eder
 */
abstract public class BaseNegocio {

	/**
	 * Método de execução do negócio. Fará o processamento e irá
	 * retornar o resultado do negócio.
	 * @return Resultado do processamento
	 */
	 abstract public String executarNegocio(String pedido);

}
