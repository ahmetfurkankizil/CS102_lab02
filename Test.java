package CS102_lab02;

public class Test {
    public static void main(String[] args) {
        SimpleURLReader s1 = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");
        System.out.println(s1.getPageContents());
        System.out.println(s1.getLineCount());
    }
}
