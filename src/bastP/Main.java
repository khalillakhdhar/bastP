package bastP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=7;
		double y=3.4;
		float z=6;
		//x=z; impossible
		z=x; // autorisé
		x=(int) z; // casting
		String ch="1234.3";
		String c="1234a";
		
		double w=Double.parseDouble(ch);
		try {
		int val1= Integer.parseInt(c);
		System.out.println(val1);
		}
		catch (Exception e) {
			System.out.println("la valeur c n'est pas numérique");
			// TODO: handle exception
		}
		System.out.println("la valeur est: "+w);

	}

}
