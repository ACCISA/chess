package board;

import java.io.File;
import java.io.FileWriter;

public class Board {
	private static File chessCSV = new File("chess.csv");
	
	public  Board(){
		boolean fileExists = true; // by default we assume the file exists. Then we actually check if it is there. If it isnt the boolean variable is set to false
		
		//Check if the file exists
		if (!(chessCSV.isFile())) fileExists = false;
		
		if (fileExists) {
			System.out.println("The File exists");
			try {
				FileWriter writeToFile = new FileWriter(chessCSV);
//				String[] row = new String[8];
				int[] rows = new int[8];
				rows[0] = 2;
//				String[] rows = {"hello"};
//				for (int i = 0; i < rows.length; i++) {
//					rows[i] = "0";
//				}

				for (String element : rows ) {
					System.out.println(element);
				}
			} catch (Exception e) {
				System.out.println("There is an error in your file.");
			}
		}
		
		if (!(fileExists)) {
			System.out.println("The file does not exists");
		}

	}
	
	//Private variable that can only be accessed with this file. This is the permanent location of the CSV file
	
	
	// This function is ran at the start of the program
	// It checks if the chess.csv file exists. If it does it will wipe it and create a board 8x8 filled with 0. 0 represents an empty slot
	// If there is no  chess.csv it will create it and set the board.

}
