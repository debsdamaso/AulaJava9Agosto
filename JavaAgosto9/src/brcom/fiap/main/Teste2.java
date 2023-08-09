package brcom.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class Teste2 {

	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal(Produto[] p, int i) {
		double total =0;
		
		for(int c = 0 ; c < i; c++) {
			total += p[c].getValor() * p[c].getQuantidade();
		}
		return total;
	}
		
	public static void main(String[] args) {	

		// instanciar
		Produto[] vetorProdutos = new Produto[3];
		
		int indice =0;
		int continuar =0;
		
		while(continuar ==0) {
			vetorProdutos[indice] = new Produto();
			vetorProdutos[indice].setTipo(texto("Tipo de produto"));
			vetorProdutos[indice].setMarca(texto("Marca"));
			vetorProdutos[indice].setQuantidade(inteiro("Quantidade"));
			vetorProdutos[indice].setValor(real("Valor"));	
			indice ++;
			
			continuar = JOptionPane.showConfirmDialog(null, "Adicionar Produto?",
					"Carrinho de Compras", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
					
	
		// saída (contador)
		for (int contador =0; contador < indice; contador ++) {
			System.out.println("Tipo: " + vetorProdutos[contador].getTipo() +
					"\nMarca: " + vetorProdutos[contador].getMarca() +
					"\nQuantidade: " + vetorProdutos[contador].getQuantidade() +
					"\nValor: " + vetorProdutos[contador].getValor());
		}
		
		System.out.println("Valor Total: " + valorTotal(vetorProdutos, indice));
	}

}}