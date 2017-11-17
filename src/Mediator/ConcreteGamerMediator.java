package Mediator;

import java.util.ArrayList;

public class ConcreteGamerMediator implements GamerMediator{

	public ConcreteGamerMediator(){
		this.otherGamers = new ArrayList<Gamer>();
	}
	
	public void addGamer(Gamer g){
		otherGamers.add(g);
	}
	
	private ArrayList<Gamer> otherGamers;
	
	@Override
	public void sendInvitation(Gamer from) {
		for(Gamer g : otherGamers){
			if(g != from){
				g.receiveInvitationFrom(from);
			}
		}
		
	}
	

}
