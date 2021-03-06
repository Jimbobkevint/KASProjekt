package application.service;

import java.time.LocalDate;

import application.model.*;
import storage.Storage;

public class Service {
	
	public static Person createPerson(String navn, String tlfnr, String email) {
		Person person = new Person(navn, tlfnr, email);
		Storage.addPerson(person);
		return person;
	}
	
	public static void updatePerson(Person person, String navn, String tlfnr, String email) {
		person.setNavn(navn);
		person.setTlfnr(tlfnr);
		person.setEmail(email);
	}
	
	public static void deletePerson(Person person) {
		Storage.removePerson(person);
	}
	
	public static Deltager createDeltager(String navn, String tlfnr, String email, String adresse, String firmaNavn, String firmaTlfnr, String landBy, Ledsager ledsager) {
		Deltager deltager = new Deltager(navn, tlfnr, email, adresse, firmaNavn, firmaTlfnr, landBy, ledsager);
		Storage.addDeltagere(deltager);
		return deltager;
	}
	
	public static void updateDeltager(Deltager deltager, String navn, String tlfnr, String email, String adresse, String firmaNavn, String firmaTlfnr, String landBy, Ledsager ledsager) {
		deltager.setNavn(navn);
		deltager.setTlfnr(tlfnr);
		deltager.setEmail(email);
		deltager.setAdresse(adresse);
		deltager.setFirmaNavn(firmaNavn);
		deltager.setFirmaTlfnr(firmaTlfnr);
		deltager.setLandBy(landBy);
		deltager.setLedsager(ledsager);
	}
	
	public static void deleteDeltager(Deltager deltager) {
		Storage.removeDeltagere(deltager);
	}
	
	public static Hotel createHotel(String navn, String adresse, double prisEnkelt, double prisDobbelt, double afstand, String tlfnr, Person hotelbestyrer) {
		Hotel hotel = new Hotel(navn, adresse, prisEnkelt, prisDobbelt, afstand, tlfnr, hotelbestyrer);
		Storage.addHoteller(hotel);
		return hotel;
	}
	
	public static void updateHotel(Hotel hotel, String navn, String adresse, double prisEnkelt, double prisDobbelt, double afstand, String tlfnr, Person hotelbestyrer) {
		hotel.setNavn(navn);
		hotel.setAdresse(adresse);
		hotel.setPrisEnkelt(prisEnkelt);
		hotel.setPrisDobbelt(prisDobbelt);
		hotel.setAfstand(afstand);
		hotel.setTlfnr(tlfnr);
		hotel.setHotelbestyrer(hotelbestyrer);
	}
	
	public static void deleteHotel(Hotel hotel) {
		Storage.removeHoteller(hotel);
	}
	
	public static Konference createKonference(String navn, String adresse, LocalDate datoTid, double pris) {
		Konference konference = new Konference(navn, adresse, datoTid, pris);
		Storage.addKonferencer(konference);
		return konference;
	}
	
	public static void updateKonference(Konference konference, String navn, String adresse, LocalDate datoTid, double pris) {
		konference.setNavn(navn);
		konference.setAdresse(adresse);
		konference.setDatoTid(datoTid);
		konference.setPris(pris);
	}
	
	public static void deleteKonference(Konference konference) {
		Storage.removeKonferencer(konference);
	}
	
	public static Ledsager createLedsager(Deltager deltager, String navn, String tlfnr, String email) {
		return deltager.createLedsager(navn, tlfnr, email);
	}
	
	public static HotelService createHotelService(Hotel hotel, String navn, String beskrivelse, double pris) {
		return hotel.createHotelService(navn, beskrivelse, pris);
	}
	
	public static Udflugt createUdflugt(Konference konference, String navn, String beskrivelse, Person udflugtsafholder, LocalDate datoTid, double pris) {
		return konference.createUdflugt(navn, beskrivelse, udflugtsafholder, datoTid, pris);
	}
	
	public static Tilmelding createTilmelding(Konference konference, LocalDate ankomst, boolean foredragsholder, LocalDate afrejse, Hotel hotellet, Deltager deltager) {
		return konference.createTilmelding(ankomst, foredragsholder, afrejse, hotellet, deltager);
	}
}
