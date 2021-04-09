package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

import exceptions.MinorAgeException;
import exceptions.NotAllowedDayException;
import model.SuperMarket;

public class Main {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private SuperMarket market;
	
	public Main() {
		
		market = new SuperMarket();
	}
	
	public static void main(String[] args) throws IOException {
		
	int choose = 3;
		
	Main app = new Main();
	
	do{
		choose = app.showMenu();
		app.executeOperation(choose);
		
	}while (choose!=2 );
	
	}
	public int showMenu() throws IOException {
		
		int answer = 0;
		
		System.out.println("Choose an Option: " + "\n (0) Let Someone enter " + "\n (1) See How many have enter " + "\n (2)End the Program ");
		
		answer = (Integer.parseInt(br.readLine()));
		return answer;
		
	}
	public void executeOperation(int choose) throws NumberFormatException, IOException {
		System.out.println("enters");
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
		System.out.println("enters 2");
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
		boolean joined	= market.letJoin(document, id,day,penultime);
		if(joined==true) {
		System.out.println("The person went inside");	
		}
		}catch(MinorAgeException mae){
			mae.printStackTrace();
			System.out.println("The minor ages cant go inside ");
			
		}catch(NotAllowedDayException nade){
			nade.printStackTrace();
	
		}
		
	}
	public void seeTries() {
		
		int tries = market.getTries();
		System.out.println("The amount of people that have try to enter is: " + tries);
	}
}
