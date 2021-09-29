
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        int lkm = Integer.valueOf(lukija.nextLine());
        int sekunnitVrk = ((60*60)*24)*lkm;
        System.out.println(sekunnitVrk);

        lukija.close();

	System.out.println("Hienoa työtä!")

	System.out.println("Miten forkkaus meni mielestäsi?");
	String mielipide = lukija.nextLine();

    }
}
