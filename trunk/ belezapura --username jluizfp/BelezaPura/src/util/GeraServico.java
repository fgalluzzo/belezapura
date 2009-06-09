package util;

import java.util.Vector;

import modelo.Servico;
import modelo.TipoServico;


public class GeraServico {
	
	private  Vector<Servico> servicos;
	private  int numServicos; //Cliente pode ter de 1 atï¿½ 5 serviï¿½os
	private  double  range;
	//private int ntipoServico;
	//private TipoServico tpServico;
	private  boolean temServico[];
	private  Servico servicosDisponiveis[];
	
	private  void carregaServicos(){
		
			
		for(int i = 0;i<servicosDisponiveis.length;i++){
			servicosDisponiveis[i] = new Servico();
			servicosDisponiveis[i].setTipoServico(TipoServico.values()[i]);

		}
				
	}
	
	public  Vector<Servico> gerador(){
		
		range = Math.random();
		//Em geral 30% dos clientes desejam todos os serviï¿½os, 40% desejam 4, 20% desejam
		//3 e 10% apenas 2.

		if(range <= 0.3)
			numServicos = 5;
		else if(range > 0.3 && range <=0.7)
			numServicos = 4;
		else if(range >0.7 && range <=0.9)
			numServicos = 3;
		else
			numServicos = 2;
		       
		/*Os serviï¿½os tambï¿½m sï¿½o procurados segundo um percentual mï¿½dio de 50% para cor-
		te, 40% para penteado, 30% para pedicure, 20% para depilaï¿½ï¿½o, 15% para massa-
		gem.
		
		corte : 27,25% 
		corte e penteado: 10% -- criado um range para corte e penteado um intervalo que seria englobado pelos 2 separadamente
		penteado : 20,8%
		pedicure: 19,35%
		depilaï¿½ï¿½o:12,9%
		massagem:9,7%  
		 */
		servicosDisponiveis = new Servico[7];
		carregaServicos();
		temServico = new boolean[6];
		
		for (int i = 0;i<4;i++){
			temServico[i] = false;
		}
		servicos =  new Vector<Servico>();
		for(int i =0;i<numServicos;i++){
			
			
			range = Math.random();
			
				
			if(range <= 0.2525 && !(temServico[0]) ){//Corte
				
				servicos.add(servicosDisponiveis[6]);//Lavagem
				servicos.add(servicosDisponiveis[1]);
				temServico[0] = true;
				
			}else if(range >0.2525 && range <=0.4025 && !(temServico[0])){//Corte e penteado
				
				servicos.add(servicosDisponiveis[6]);//Lavagem
				servicos.add(servicosDisponiveis[2]);
				temServico[0] = true;
				i++;//corte e penteado contam como 2 serviï¿½os
				
			}else if(range > 0.4025 && range <=0.5805 && !(temServico[0])){//penteado
				
				servicos.add(servicosDisponiveis[0]);
				temServico[0] = true;
				
			}else if(range > 0.5805 && range <=0.774 && !(temServico[1])){//pedicure
				
				servicos.add(servicosDisponiveis[3]);
				temServico[1] = true;
				
			}else if(range >0.774 && range <=0.903 && !(temServico[2])){//depilacao
				
				servicos.add(servicosDisponiveis[4]);
				temServico[2] = true;
				
			}else if(range >0.903 && !(temServico[3])){//massagem
				
				servicos.add(servicosDisponiveis[5]);
				temServico[3] = true;
			}else{//Quando gera um número aleatório de mesmo range que algum
				//que já possui entro aqui e adiciono o próximo serviço que não tem
					for (int j = 0; j<4;j++){
						if(!temServico[j]){	
							if(j ==0){
								
								int m = (int)(Math.random()*100)%3;
								if(m == 0)
									servicos.add(servicosDisponiveis[m]);
								else{
									servicos.add(servicosDisponiveis[6]);
									servicos.add(servicosDisponiveis[m]);
								}
								i++;
							}else{
								servicos.add(servicosDisponiveis[j+2]);
							}
						
							temServico[j] = true;
							break;
						}
					
				}
			}
			
		
		
			
			
			
			
				
				
			
				
		}
		
		
			
		return servicos;
	}
}
