package wildfly.ejb;

import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class CompraDolarServices
 */
@Stateful
public class CompraDolarServices implements CompraDolarServicesRemote {

	private double valor;
	
	@EJB
    private CotacaoServicesRemote cotacaoService;
    
    public CompraDolarServices() {
        // TODO Auto-generated constructor stub
    }

    @Override
	public void adicionarDolar(double pValor) {
		valor += pValor;
	}

	@Override
	public void removerDolar(double pValor) {
		valor -= pValor;
	}

	@Override
	public double calcularValorTotal() {
		return cotacaoService.calcularCotacaoReal(valor);
	}

}
