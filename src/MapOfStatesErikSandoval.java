/*
Erik Sandoval
COSC 2336-01
Instructor: Professor Liu
Programming Assignment 4
Due:  Monday, February 21st, 2022
This is a program that will create a HashMap that maps the names of the U.S. states to their corresponding capitals.
The program will accomplish this by using the data from the given array to generate a hashmap that will then be used
to find the correct capitol for a given state. If the state is not valid the program will generate an error message
for the user. The program used the HashMap and Scanner imports. It contains on class named MapOfStatesErikSandoval
with two class fields, namely th HashMap and the array of data. The class also contains a method to fill the HashMap,
and of course the main method which handles the user input and response.
Java
Amazon Corretto 17.0.2
 */

import java.util.HashMap; // import HashMap
import java.util.Scanner; // import Scanner

public class MapOfStatesErikSandoval { // MapOfStatesErikSandoval class
    // HashMap variable stateMap created
    private static HashMap<String, String> stateMap = new HashMap<>();
    // multidimensional array holding state and capitol information
    private static final String[][] stateCapitol = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Indiana", "Indianapolis"},
            {"Iowa", "Des Moines"},
            {"Kansas", "Topeka"},
            {"Kentucky", "Frankfort"},
            {"Louisiana", "Baton Rouge"},
            {"Maine", "Augusta"},
            {"Maryland", "Annapolis"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Minnesota", "Saint Paul"},
            {"Mississippi", "Jackson"},
            {"Missouri", "Jefferson City"},
            {"Montana", "Helena"},
            {"Nebraska", "Lincoln"},
            {"Nevada", "Carson City"},
            {"New Hampshire", "Concord"},
            {"New Jersey", "Trenton"},
            {"New York", "Albany"},
            {"New Mexico", "Santa Fe"},
            {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismark"},
            {"Ohio", "Columbus"},
            {"Oklahoma", "Oklahoma City"},
            {"Oregon", "Salem"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"}
    };

    // main method
    public static void main(String[] args) {
        fillHashMap(); // call fillHashMap function to move information from array to hashmap
        System.out.print("Enter a state: "); // prompt user to enter a state value
        Scanner scanner = new Scanner(System.in); // create scanner object to get user input
        String key = scanner.nextLine(); // set key variable equal to whatever the user inputs
        if (stateMap.containsKey(key)) { // if the user's input is a valid value proceed
            String value = stateMap.get(key); // set value variable to the key's mapped value
            System.out.println(value); // print out the value associated with the key
        } else { // if the user's input is invalid
            System.out.println("No such state"); // let user know that state does not exist
        }


    }
    public static void fillHashMap() { // fillHashMap method used to move information from array to HashMap
        for (int i = 0; i < 50; i++) { // nested for loop - outer loop
            for (int j = 0; j < 1; j++) { // nested for loop - inner loop
                stateMap.put(MapOfStatesErikSandoval.stateCapitol[i][j], // map capital to state using the nested
                        MapOfStatesErikSandoval.stateCapitol[i][j + 1]); // for loop above to iterate through the array
            }
        }
    }
}
