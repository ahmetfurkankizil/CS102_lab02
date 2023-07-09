package CS102_lab02;

public class MySimpleURLReader extends SimpleURLReader{

    private String theUrlString;
    private String theFileName;

    public MySimpleURLReader(String var1){
        super(var1);
        this.theUrlString = var1;
    }

    public String getUrl(){
        return this.theUrlString;
    }

    public String getName(){
        String s = this.theUrlString;
        int lastOccurenceIndex = s.lastIndexOf('/') + 1;
        this.theFileName = s.substring(lastOccurenceIndex);
        return this.theFileName;
    }
}