package CS102_lab02;

public class Test {
    public static void main(String[] args) {

        //Part A
        MySimpleURLReader m1 = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        System.out.println(m1.getPageContents());
        System.out.println(m1.getLineCount());

        //Part B
        System.out.println("URL: " + m1.getUrl());
        System.out.println("Webpage Name: " + m1.getName());
        
        //PART C
        System.out.println("Number of CSS links: " + m1.getNumberOfCSSLinks());
    }
}
