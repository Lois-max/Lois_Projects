package org.amalitech.javarecap3;
import java.util.Scanner;
public class Javarecap3 {


	public static void main  (String[] args) {

	//Initializations
	String code_trigger_stater_str = "start";
	
	boolean stf = false;//variable to check if user has already entered start

	re_run_kybd_input(code_trigger_stater_str,stf);
	
	}

	static String code_trigger_ender_str = "end";
	static String kybd_input_str="";

	private static void re_run_kybd_input(String code_trigger_stater_str, boolean stf) {
	boolean program_Running_bool=false;
	
	//taking user input
	Scanner kybd_input = new Scanner (System.in);
	kybd_input_str = kybd_input.nextLine();

	//checking if the input equals start
	if (kybd_input_str.equalsIgnoreCase(code_trigger_stater_str)) {
	program_Running_bool = true;
	stf = true;
	int x=0;
	int y=5;

	while (program_Running_bool == true) {
		
	if(x<y) {
	System.out.println("We are still in the while: " + Integer.toString(x));
	x++;
	}
	
	else {
	program_Running_bool =false;
	stf = true;
	System.out.println("we are still in the while loop");
	
	//taking in next user input
	kybd_input_str = kybd_input.nextLine();
	System.out.println("You enetered "+ kybd_input_str);
	}
	}

	System.out.println("hurray we are still in the while loop");
	}
	
	else if (kybd_input_str.equalsIgnoreCase(code_trigger_ender_str)) {
	if (stf) {
	System.out.println("The program has ended");
	kybd_input.close();
	
	}else {
	System.out.println("Start the program before ending");
	}
	}
	else {
	System.out.println("Please restart" + " and enter start to run code");
	stf=true;
	re_run_kybd_input(code_trigger_stater_str,stf);

	}
	
	}
	}
	

