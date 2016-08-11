package wildfly.ejb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CotacaoServices
 */
@Stateless
public class CotacaoServices implements CotacaoServicesRemote {

	private static final double COTACAO_DOLAR = 2.05;
    /**
     * Default constructor. 
     */
    public CotacaoServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public double calcularCotacaoReal(double valor) {
		// TODO Auto-generated method stub
		return valor *COTACAO_DOLAR;
	}

}
