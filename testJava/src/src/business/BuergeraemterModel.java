package business;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

import fabrikMethode.ConcreteCsvCreator;
import fabrikMethode.ConcreteTxtCreator;
import fabrikMethode.Creator;
import fabrikMethode.Product;
import ownUtil.ConcreteObservable;
import ownUtil.ConcreteObserver;

public class BuergeraemterModel implements ConcreteObservable{
	

	LinkedList<ConcreteObserver> liste = new LinkedList<ConcreteObserver>();
/**/	private ArrayList <Buergeramt> buergeraemterList = new ArrayList <Buergeramt>();
	//
	private static BuergeraemterModel instanz = null;
	
	public static BuergeraemterModel getInstanz() {
		if(instanz == null) {
			instanz = new BuergeraemterModel();
		}
		return instanz;
	}
	//
	public ArrayList<Buergeramt> getBuergeraemterList() {
		 return buergeraemterList;
	}
	private BuergeraemterModel () {
	}
 		
	//
	
	private Buergeramt buergeramt;

	public Buergeramt getBuergeramt() {
		return this.buergeramt;
	}
	
	public void setBuergeramt(Buergeramt buergeramt) {
		this.buergeramt = buergeramt;
		notifyObservers();
	}
 		
	public void schreibeBuergeraemterInCsvDatei()
	    throws IOException{
		Creator creator =new ConcreteCsvCreator();
		Product writer = creator.factoryMethod();
		/**/for( Buergeramt burgeramt : buergeraemterList) {
		writer.fuegeInDateiHinzu(buergeramt);
		/**/}
		writer.schliessDatei();

 	}
	public void schreibeBuergeraemterInTxtDatei()    throws IOException{
		Creator creator =new ConcreteTxtCreator();
		Product writer = creator.factoryMethod();
		//
		writer.fuegeInDateiHinzu(buergeramt);
		//
		writer.schliessDatei();
	}
	

	@Override
	public void addObserver(ConcreteObserver obs) {
		// TODO Auto-generated method stub
		liste.add(obs);
	
	}
	@Override
	public void removeObserver(ConcreteObserver obs) {
		// TODO Auto-generated method stub
		liste.remove(obs);
	
		
	}
	@Override
	public void notifyObservers() {
	// TODO Auto-generated method stub
	for(ConcreteObserver o:liste) {
			o.update();
		}
	}
	

}




















//private ArrayList <Buergeramt> buergeraemterList = new ArrayList <Buergeramt>();

/*
public ArrayList<Buergeramt> getBuergeraemterList() {
	 return buergeraemterList;
 }
private BuergeraemterModel () {
}*/


//for( Burgeramt burgeramt : buergeraemterList) {
//writer.fuegeInDateiHinzu(buergeramt);
//}








