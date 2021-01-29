
public class Artikel {
	
	public int artnr;
	public double preis;
	public double bruttoPreis;
	public String Artikelbez;
	
	//leerer Constructor
	public Artikel() {
		
	}
	//Constructor mit 2 parametern
	public Artikel (int artnr, String Artikelbez) {
		this.artnr = artnr;
		this.Artikelbez = Artikelbez;
		
	}
	//Constructor overload mit 3 parametern
	public Artikel (int artnr, double preis, String Artikelbez) {
		this.artnr = artnr;
		this.Artikelbez = Artikelbez;
		this.preis = preis;
		this.bruttoPreis = preis * mehrwerststeuer;
	}
}
