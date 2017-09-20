package org.arun.learn;

public class ClientService {
	public String getClientName(){
		//return "Arun Kumar";
		ClientDto cdto = new ClientDto();
		return cdto.getClientRecord();
	}

}
