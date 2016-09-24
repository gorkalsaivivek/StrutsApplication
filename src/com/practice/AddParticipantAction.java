package com.practice;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddParticipantAction extends ActionSupport 
implements ModelDriven<Participant>{

	
	Participant participant=new Participant();
	ParticipantDAO dao=new ParticipantDAO();
	
	@Override
	public Participant getModel() {
		// TODO Auto-generated method stub
		return participant;
	}
	
	public String execute()
	{
	dao.addParticipant(participant);
	return "success";
	}
	

}
