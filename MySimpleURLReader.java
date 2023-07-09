package CS102_lab02;

public class MySimpleURLReader extends SimpleURLReader{

    private String theUrlString;
    private String theFileName;

    public MySimpleURLReader(String var1){
        super(var1);
        this.theUrlString = var1;
    }

    // PART B
    public String getUrl(){
        return this.theUrlString;
    }

    // PART B
    public String getName(){
        String s = this.theUrlString;
        int lastOccurenceIndex = s.lastIndexOf('/') + 1;
        this.theFileName = s.substring(lastOccurenceIndex);
        return this.theFileName;
    }

    // PART C
    public int getNumberOfCSSLinks(){

        int lastIndex = 0;
        String s = super.pageContents;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = s.indexOf(".css", lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += 4; // Moving past the ".css"
            }
        }

        // The other ".css" files which are hidden 
        /* 
        System.out.println(s.substring(524, 34));
        System.out.println(s.substring(813, 903));
        System.out.println(s.substring(1032, 1122));
        */

        return count;
    }



}