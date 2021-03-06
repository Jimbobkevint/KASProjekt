package application.model;

import java.util.*;

public class Hotel {
	private String navn;
	private String adresse;
	private double prisEnkelt;
	private double prisDobbelt;
	private double afstand;
	private String tlfnr;
	private Person hotelbestyrer;
	private ArrayList<Tilmelding> tilmeldinger = new ArrayList<>();
	private ArrayList<HotelService> hotelServices = new ArrayList<>();
	
	public Hotel(String navn, String adresse, double prisEnkelt, double prisDobbelt, double afstand, String tlfnr, Person hotelbestyrer) {
		this.setNavn(navn);
		this.setAdresse(adresse);
		this.setPrisEnkelt(prisEnkelt);
		this.setPrisDobbelt(prisDobbelt);
		this.setAfstand(afstand);
		this.setTlfnr(tlfnr);
		this.setHotelbestyrer(hotelbestyrer);
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getPrisEnkelt() {
		return prisEnkelt;
	}

	public void setPrisEnkelt(double prisEnkelt) {
		this.prisEnkelt = prisEnkelt;
	}

	public double getPrisDobbelt() {
		return prisDobbelt;
	}

	public void setPrisDobbelt(double prisDobbelt) {
		this.prisDobbelt = prisDobbelt;
	}

	public double getAfstand() {
		return afstand;
	}

	public void setAfstand(double afstand) {
		this.afstand = afstand;
	}

	public String getTlfnr() {
		return tlfnr;
	}

	public void setTlfnr(String tlfnr) {
		this.tlfnr = tlfnr;
	}

	public Person getHotelbestyrer() {
		return hotelbestyrer;
	}

	public void setHotelbestyrer(Person hotelbestyrer) {
		this.hotelbestyrer = hotelbestyrer;
	}

	public ArrayList<Tilmelding> getTilmeldinger() {
		return new ArrayList<Tilmelding>(tilmeldinger);
	}

	public void addTilmelding(Tilmelding tilmelding) {
		tilmeldinger.add(tilmelding);
	}
	
	public void removeTilmelding(Tilmelding tilmelding) {
		tilmeldinger.remove(tilmelding);
	}
	
	public ArrayList<HotelService> getHotelServices() {
		return new ArrayList<HotelService>(hotelServices);
	}
	
	public void addHotelService(HotelService hotelService) {
		hotelServices.add(hotelService);
	}
	
	public void removeHotelService(HotelService hotelService) {
		hotelServices.remove(hotelService);
	}
	
	public HotelService createHotelService(String navn, String beskrivelse, double pris) {
		HotelService hotelService = new HotelService(navn, beskrivelse, pris);
		this.addHotelService(hotelService);
		return hotelService;
	}
}
