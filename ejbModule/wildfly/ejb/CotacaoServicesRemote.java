package wildfly.ejb;

import javax.ejb.Remote;

@Remote
public interface CotacaoServicesRemote {
	public double calcularCotacaoReal(double valor);
	public double adicionarDolar(double valor);
}
