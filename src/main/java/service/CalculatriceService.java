package service;

public class CalculatriceService {

	public int addition(int a, int b) {
		return a+b;
	}
	
	public int soustraction(int a, int b) {
		return a-b;
	}
	
	public int produit(int a, int b) {
		return a*b;
	}
	
	public int division(int a, int b) {
		try { 
			return a/b;
		}catch(ArithmeticException e) {
			System.out.print("Erreur division par zero");
			return -1;
		}
	}
}
