package Mediator;

public class Gamer {
	
	public Gamer(String name, GamerMediator mediator){
		this.name = name;
		this.mediator = mediator;
	}
	
	private String name;
	
	private GamerMediator mediator;
	
	public void inviteToGame(){
		mediator.sendInvitation(this);
	}
	
	public String getName(){
		return name;
	}
	
	public void receiveInvitationFrom(Gamer from){
		System.out.println("Hey I got invitation from: " + from.getName());
	}
	
}
