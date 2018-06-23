package app;
import model.Cliente;


public class DescontoCpf implements TipoDesconto{
	private String cpfInformado;
	
	public DescontoCpf(String cpfInformado) {
		this.cpfInformado = cpfInformado;
	}
	
	public String getCpfInformado() {
		return cpfInformado;
	}
	
	@Override
	public double desconto(Cliente cliente) {
		// TODO Auto-generated method stub
		if(cliente.getCpf()==this.cpfInformado && cliente.getItem().getPrecoCompra()>99){
			return cliente.getItem().getPrecoCompra()*0.05;
		}if(cliente.getCpf()==this.cpfInformado && cliente.getItem().getPrecoCompra()>999){
			return cliente.getItem().getPrecoCompra()*0.10;
		
		}
		
		return 0;
		
	}

}
