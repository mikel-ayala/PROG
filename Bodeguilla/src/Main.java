import java.util.*;

public class Main {

	public static void main(String[] args) {
		try {
			
		
		Scanner input= new Scanner (System.in);
		Kudeatzailea kude = new Kudeatzailea ();
		
		int aukera;
		do {
			
			kude.menuaErakutsi();
			aukera=input.nextInt();
			switch (aukera) {
			case 1: kude.factura(); break;
			case 2: kude.artGuztiak(); break;
			case 3: kude.saludables(); break;
			case 4: kude.equivalentes(); break;
			case 5: kude.masCaro(); break;
			case 6: kude.pocoStock(); break;
			default: 
				System.out.print("Sartu beste zenbaki bat mesedez");
			}
		}while (aukera!=0);
		
		
		input.close();
	}catch(Exception e){
		
	}
}
}
