import java.util.Scanner;
import java.text.DecimalFormat;

public class MyClass {
        
    public static void main(String args[]) {
        
        //Dezimalstellenrundung auf zwei stellen nach dem Komma
        DecimalFormat runden = new DecimalFormat("#0.00");
        double mehrwerststeuer = 1.19;
        int fortlaufendeNummer = 1;
        Scanner fetch = new Scanner(System.in);    
        
        
        Artikel[] Artikelliste = ladeArtikel();
        // System.out.println(Artikelliste[1].artnr + " " + Artikelliste[1].Artikelbez);
        
        double preismehrwert[] = new double[Artikelliste.length];
        for (int i = 0; i < 7 ; i++){
        	preismehrwert[i]= Artikelliste[i].preis * mehrwerststeuer;
        }
       
        System.out.println("Wie viele Produkte werden gekauft?");
        Abfragemenge[] warenkorb = new Abfragemenge[fetch.nextInt()];
        int[] artnumm = new int [warenkorb.length];
        
        for (int i = 0; i < warenkorb.length; i++) {
        	System.out.println("Artikelmenge und Artikel Nr. nacheinander."  );
        	warenkorb[i] = new Abfragemenge(fetch.nextInt());
        	artnumm[i] = (fetch.nextInt());
        }
        
       // DruckRechnung.DruckRechnung(fortlaufendeNummer);
        DruckRechnung druckRechnunug = new DruckRechnung(fortlaufendeNummer);
        // Ausgabe bezahlung
        double[] gesamtpreis = new double[warenkorb.length];
        
        for (int i = 0; i < warenkorb.length; i++) 
        {
        	for(int j = 0; j < 7; j++) 
        	{
        		if (Artikelliste[j].artnr == artnumm[i]) 
        		{
                	gesamtpreis[i] = warenkorb[i].menge * preismehrwert[j];
        			System.out.println(warenkorb[i].menge + " x " + Artikelliste[j].Artikelbez + "     " 	+ runden.format(warenkorb[i].menge * preismehrwert[j]) + "€");
        		}//if bed 
        		else 
        		{
        			
        		}
        	}//for
        }
        for (int i = 0; i < warenkorb.length; i++) 
        	{
        	
        	}
       
        fortlaufendeNummer = fortlaufendeNummer ++;
        fetch.close();
        
    	}

	private static Artikel[] ladeArtikel() {
		Artikel[] Artikelliste = new Artikel[7];
        Artikelliste[0] = new Artikel(10 , 7.50 ,  "New Silvans Turbo DVD");
        Artikelliste[1] = new Artikel(11 ,  6.00,"Afrim und Bashkim DVD");
        Artikelliste[2] = new Artikel(12 , 4.50 ,"Daniel allein zu Haus DVD");
        Artikelliste[3] = new Artikel(13 , 30.00 ,"Call of Duty Phillips war PC");
        Artikelliste[4] = new Artikel(14 , 40.00 ,"Call of Duty Phillips war PS4");
        Artikelliste[5] = new Artikel(15 , 40.00 ,"Cybernico 2077 PC");
        Artikelliste[6] = new Artikel(16 , 50.00 ,"Cybernico 2077 PS4");
		return Artikelliste;
	}

}
	

