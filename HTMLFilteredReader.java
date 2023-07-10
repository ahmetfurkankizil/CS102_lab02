package CS102_lab02;

import java.util.Scanner;

public class HTMLFilteredReader extends MySimpleURLReader{
    
    public HTMLFilteredReader(String var) {
        super(var);
    }

    // PART D
    public String getPageContents(){
        String s = super.getPageContents();

        String filteredString = "";

        Scanner scanner = new Scanner(s);
        while (scanner.hasNextLine() && !filteredString.contains("2018")) {
            String theLineScanned = scanner.nextLine();
            if(!theLineScanned.contains("<")) {
                filteredString += theLineScanned.trim() + "\n";
            }
            else{
                int indexOfFirst = theLineScanned.indexOf(">", 0);
                int indexOfSecond = theLineScanned.indexOf("<", indexOfFirst);
                while (indexOfSecond != -1) {
                    if (indexOfFirst != -1) {
                        filteredString += theLineScanned.substring(indexOfFirst, indexOfSecond);
                        filteredString = filteredString.replaceAll(">", "");
                        indexOfFirst = theLineScanned.indexOf(">", indexOfSecond);
                        indexOfSecond = theLineScanned.indexOf("<", indexOfFirst);
                    }   
                }
            }
        }
        scanner.close();
        return filteredString;
    }

    public String getUnfilteredPageContents(){
        return super.getPageContents();
    }
}
