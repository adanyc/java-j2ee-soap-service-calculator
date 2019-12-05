package pe.com.adanyc.beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "pe.com.adanyc.beans.ServicioSumarWS")
public class ServicioSumarImpl implements ServicioSumarWS {

	@Override
	public int sumar(int a, int b) {
		return a + b;
	}

}
