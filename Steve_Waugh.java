package com.Interface;

public class Steve_Waugh implements Vivian_Richardson, Brian_Lara {

	@Override
	public void battingstyle() {
		System.out.println ("Left Hand Batter");
		
	}

	@Override
	public void highscore() {
		System.out.println ("400");
		
	}

	@Override
	public void cartoonnetwork() {
		System.out.println ("Popeys the sailor man");
		
	}

	@Override
	public void sports() {
		System.out.println ("Cricket");
		
	}

	@Override
	public void leisure() {
		System.out.println ("Carrom Baoard");
		
	}
	
	public static void main (String [] args) {
		
		Steve_Waugh obj = new Steve_Waugh ();
		
		obj.battingstyle();
		obj.highscore();
		obj.cartoonnetwork();
		obj.sports();
		obj.leisure();
	}
	
	
	
	

}
