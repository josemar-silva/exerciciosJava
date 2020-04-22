package aula27;

public class exComandosUteisEmString {

	public static void main(String[] args) {

		String original = "JOSEMAR da SILVA lima";
		String b = original.toLowerCase();
		String c = original.toUpperCase();
		String d = original.trim();
		String e = original.substring(1);
		String f = original.substring(1,20);
		String g = original.replace('a','@');
		String h = original.replace("JOSEMAR","LINDAO");
		int i = original.indexOf("a");
		int j = original.lastIndexOf("a");
		
		String[] vect = original.split(" ");
		
		
		System.out.println(original);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d                    + " - " + d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(h);
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
		System.out.println(vect[0] + " " + vect[2]);
		
		
	}

}
