

	import java.util.Scanner;

	public class MyClass {
		
		public static void main(String[] args) {
			  Scanner sc2 = new Scanner(System.in);
		      Chat juliete = new Chat();
		      System.out.println("Quel est le nom du chat ?");
		      juliete.name = sc2.next();
		      System.out.println("Quel est l'age du chat ?");
		      juliete.age = sc2.nextInt();
		      System.out.println("votre age apr�s un ans est: "+ juliete.apresUnAn());
		      juliete.miao();
		      
		}
	

	}