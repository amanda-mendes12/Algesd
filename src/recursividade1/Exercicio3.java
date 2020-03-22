package recursividade1;

public class Exercicio3 {

	public static void main(String[] args) {
		// 3) Crie um m�todo recursivo que procure um n�mero dentro de um vetor, a partir de um dado �ndice. 
		//    Se achar o mesmo, o m�todo retorna o �ndice onde ele se encontra, sen�o, retorna -1. (busca linear recursiva)
		
		System.out.println(procN(10, 27));
		
	}
	
	public static int procN (int i, int n) {
		int vet [] = {1, 2, 5, 8, 12, 14, 16, 27, 38, 99};
		
		if (i > vet.length) {
			return -1;
		}
		if (n == vet[i]) {
			return i;
		} else { 
			return procN(i+1, n);
		}
	}
}