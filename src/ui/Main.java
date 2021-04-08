package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

import exceptions.MinorAgeException;
import exceptions.NotAllowedDayException;
import model.SuperMarket;

public class Main {
	
	public Main() {
		
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private SuperMarket market;
	
	
	public static void main(String[] args) throws IOException {
		
	int choose = -1;
		
	Main app = new Main();
	
	do{
		choose = app.showMenu();
		app.executeOperation(choose);
		
	}while (choose!=2 );
	
	}
	public int showMenu() throws IOException {
		
		int answer = 0;
		
		do {
		System.out.println("Choose an Option: " + "\n (0) Let Someone enter " + "\n (1) See How many have enter " + "\n (2)End the Program ");
		
		answer = br.read();
		}while((answer>=0)&&(answer<3));
		return answer;
		
	}
	public void executeOperation(int choose) throws NumberFormatException, IOException {
		
		switch(choose) {
		
		case 0: letJoin();
		break;
		case 1: seeTries();
		break;
		case 2: 
		break;
		
		}
	}
	public void letJoin() throws NumberFormatException, IOException{
		
		String document = "";
		
		String id = "";
		
		int choose = -1;
		
		int penultime = 0;
		
		int day = 0;
		while((choose <0)||(choose >4)) {
		
		System.out.println("Choose your document Type: \n" + "(1)Identity Card \n" + "(2)Citizen Document \n" + "(3)Passport \n" + "(4)Foreign Citizen Document" );	
		choose = (Integer.parseInt(br.readLine()));
		
		}
		switch(choose) {
		
		case 1: document = "TI";
		break;
		
		case 2: document = "CC";
		break;
		
		case 3: document = "PP";
		break;
		
		case 4: document = "CE";
		break;
		}
		System.out.println("Insert your Document Number");
		try {
			id = br.readLine();
			penultime = Integer.parseInt(String.valueOf(id.charAt(id.length()-2)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		day = LocalDate.now().getDayOfMonth();
		try {
		market.letJoin(document, id,day,penultime);
		}catch(MinorAgeException mae){
			
			
		}catch(NotAllowedDayException nade){
			
		}
		
	}
	public void seeTries() {
		
	}
}
