import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	ArrayList<Person> pList = new ArrayList<Person>(); // creates an ArrayList
														// of type Person called
														// pList

	public static void main(String[] args) {
		
		String mainList = (readData());
		//System.out.println(mainList);
		parseData(mainList);
		

	}

	public void addPerson() {
		for (Person p : pList) {
			pList.add(p);
		}
	}

	// function to read data from file
	private static String readData() {

		File data = new File("Stage_5_input.txt"); // sets the file data to be the data
											// in the text file
		BufferedReader br = null; // creates a reference to a buffered reader
									// called 'br' that is not pointing anywhere

		FileReader fr; // creates a reference to a filereader called 'fr'
		try {
			fr = new FileReader(data); // creates a new filereader instance
			br = new BufferedReader(fr); // creates a new bufferedreader
											// instance
			String line; // create a new String called 'line'
			// ArrayList<String> list = new ArrayList<>();
			String totalInput = ""; // creates a new String called 'totalInput'
									// which is empty

			while ((line = br.readLine()) != null) { // start a while loop that
														// will continue until
														// there is not text
														// left
				totalInput += line + "\n"; // updates the totalInput String to
											// include the next line of text
											// read in from the file and then
											// start a new line
			}
			return totalInput; // when the while loop finishes returns the
								// totalInput String
		}

		catch (FileNotFoundException e) {
			System.out.println("File not found: " + data.toString());
		}

		catch (IOException e) {
			System.out.println("Unable to read file: " + data.toString());
		}

		finally {
			try {
				br.close(); // attempts to close the buffered reader to reduce
							// memory load and increase efficiency
			} catch (IOException e) {
				System.out.println("Unable to close file: " + data.toString());
			} catch (NullPointerException ex) {

			}
		}
		return null;

	}
	
private static void parseData(String firstList) {
		
		String[] firstSplit = firstList.split("Boats");//creates a string array with everything above boats in [0] and everything below boats in [1]
		String[] marinas = firstSplit[0].trim().split("|");
		String[] secondList = firstSplit[1].trim().split("People");
		String[] boats = secondList[0].trim().split("|");
		String[] people = secondList[1].trim().split("|");
		
		System.out.println(firstSplit[0]);
		//System.out.println(Arrays.toString(boats));
	}
	

}
