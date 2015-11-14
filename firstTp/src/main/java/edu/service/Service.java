package edu.service;

import edu.domain.Iexamen;

public class Service {
	private Iexamen exm1;
	private Iexamen exm2;
	public Iexamen getExm1() {
		return exm1;
	}
	public void setExm1(Iexamen exm1) {
		this.exm1 = exm1;
	}
	public Iexamen getExm2() {
		return exm2;
	}
	public void setExm2(Iexamen exm2) {
		this.exm2 = exm2;
	}
	
	public void resultat()
	{
		float moyenne=(exm1.getNote()+exm2.getNote())/2;
		if(moyenne<10)
		{
			System.out.println("vous êtes redoublant avec un moyenne = "+moyenne);
		}
		else
		{
			System.out.println("vous êtes admis avec un moyenne = "+moyenne );
		}
		
	}
	

}
