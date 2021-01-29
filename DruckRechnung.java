import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DruckRechnung {
	int FortlaufendeNummer;
	public DruckRechnung(int FortlaufendeNummer) {
		System.out.println(" ");
        System.out.println(" ");
         
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String Uhrzeit = sdf.format(new Date());     
         
        System.out.println("---------------------------------------------------------------");
        System.out.println("Dennis Spielwarengeschäft");
        System.out.println("");
        System.out.println("Nilay-Benli-Straße 30489 Niklashausen");
        System.out.println("");
        System.out.println("Steuernummer: 123123123");
        LocalDate Datum =LocalDate.now();
        System.out.print(Datum);
        System.out.println("  " + Uhrzeit);
        System.out.println("Rechnung " + FortlaufendeNummer + " ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Bei einem Kauf von 5 Produkten können sie bei Ihrem");
        System.out.println("Einkauf bis zu 3% Spaaren ab einem kauf von 5 Produkten");
        System.out.println("");
        System.out.println("");
	}
}
	
