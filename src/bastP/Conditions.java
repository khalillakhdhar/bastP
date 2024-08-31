package bastP;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=132;
		int c=x/100;
		int d= (x%100)/10;
		int u=x%10;
		int somme=c+d+u;
		if(somme%3==0)
			System.out.println("la somme est divisible par 3 pour le chiffre "+x);
		else
			System.out.println("la somme n'est pas divisible par 3 pour le chiffre "+x);

	}

}
