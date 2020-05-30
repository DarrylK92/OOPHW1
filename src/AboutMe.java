import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

/*
	This program allows the user to learn more about me.
	Author: Darryl Karney
	Course: CPSC24500
 */

public class AboutMe {

	static Scanner kb;
	
	public static void main(String[] args) {
		kb = new Scanner(System.in);
		while(true) {
			mainMenu();
		}
	}

	private static void mainMenu() {
		//Display main menu
		System.out.println("\nWhat would you like to ask me?");
		System.out.println("	1. What is my full name?");
		System.out.println("	2. Where did I go to high school?");
		System.out.println("	3. What are my favorite hobbies?");
		System.out.println("	4. What is my philosophy on life?");
		System.out.println("	5. What do I hope to do for a career?");
		System.out.println("	6. What do I look like?");
		System.out.print("Please enter the number of your choice, or 0 to quit: ");
		
		//Get user selection
		int selection;
		selection = kb.nextInt();
		
		//Process user selection
		switch(selection) {
		case 0:
			System.exit(0);
			
		case 1:
			System.out.println("Darryl Karney\n");
			break;
			
		case 2:
			System.out.println("Glenbard North High School\n");
			break;
			
		case 3:
			System.out.println("Programming\nPlaying board/video games\nListening to music\n");
			break;
			
		case 4:
			System.out.println("Everything is easy once you learn how to do it.\n");
			break;
			
		case 5:
			System.out.println("To develop software.\n");
			break;
			
		case 6:
			System.out.println("Check me out.");
			OpenImage();
			break;
		}
	}

	private static void OpenImage() {
		String url = "https://www.linkedin.com/in/darrylkarney/";
		
		if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
	}
}
