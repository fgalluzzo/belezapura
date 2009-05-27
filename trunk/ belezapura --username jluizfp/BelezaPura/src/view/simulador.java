package view;

import util.GeraServico;
import modelo.Cliente;

public class simulador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
	    GeraServico geraServ = new GeraServico();
		for(int i =0;i<5;i++){
			c.setServicos(geraServ.gerador());
			System.out.println("Cliente "+(i+1));
			for(int j = 0;j<c.getServicos().size();j++){
				
				System.out.println(c.getServicos().get(j).getTipoServico());
				
			}
			
		}
		
	}

}
