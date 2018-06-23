package app;
import model.Cliente;


public class DescontoFrete implements TipoDesconto{

	@Override
	public double desconto(Cliente cliente) {
		// TODO Auto-generated method stub
		if(cliente.getItem().getPrecoCompra()>199){
			return 0;
		}if(cliente.getItem().getPrecoCompra()>99 && cliente.getItem().getPrecoCompra()<199){
			if(cliente.getRegiao()=="S" || cliente.getRegiao()=="SE"){
				return 0;
			}else{
				return cliente.getItem().getPrecoCompra()*0.10;
			}
		}else{
			return cliente.getItem().getPrecoCompra()*0.10;
		}
	}

}
