package cursoJava;
import java.util.Locale;
import java.util.Scanner;
public class AulaCasting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String nameCod;
		System.out.println("Digite seu codigo:");
		nameCod=sc.nextLine();
		
		double cod=0;
		
		cod = Double.parseDouble(nameCod);
		Locale.setDefault(Locale.US);
		System.out.printf("%.9f", cod);

	}

}
