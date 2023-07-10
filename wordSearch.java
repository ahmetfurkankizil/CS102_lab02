package CS102_lab02;

import java.util.Scanner;

public class wordSearch extends HTMLFilteredReader {

    public wordSearch(String var) {
        super(var);
    }

    public String getPageContents(String str) {
        String s = super.getPageContents();

        String filteredString = "";

        Scanner scanner = new Scanner(s);
        while (scanner.hasNextLine()) {
            String theLineScanned = scanner.nextLine();
            if(theLineScanned.contains(str)) {
                filteredString = theLineScanned; 
                filteredString += "\n" + scanner.nextLine();
            }
        }

        scanner.close();
        return ("The String you provided is in the index: " + s.indexOf(str, 0) + " \nIts line is : \n" + filteredString);
    }
}
