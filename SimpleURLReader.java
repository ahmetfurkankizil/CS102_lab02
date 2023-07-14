// Source code is decompiled from a .class file using FernFlower decompiler.
package CS102_lab02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleURLReader {
   public static final String version = "SimpleURLReader:v1.0:03/03/2002";
   String pageContents;
   int lineCount;

   public SimpleURLReader(String var1) {
      try {
         URL var2 = new URL(var1);
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));
         this.lineCount = 0;

         for(String var4 = var3.readLine(); var4 != null; var4 = var3.readLine()) {
            this.pageContents = this.pageContents + var4 + "\n";
            ++this.lineCount;
         }
      } catch (Exception var5) {
         System.out.println(var5);
      }

   }

   public String getPageContents() {
      return this.pageContents;
   }

   public int getLineCount() {
      return this.lineCount;
   }

   public void extensionMethod(){
        
        //Adding words to an arraylist
        String s = pageContents;
        ArrayList <String> words = new ArrayList<>();
        Scanner scanner = new Scanner(s);
        while (scanner.hasNextLine()) {
            String theLineScanned = scanner.nextLine();
            int indexOfSpace = theLineScanned.indexOf(" ", 0);
            while (indexOfSpace != -1) {
                indexOfSpace = theLineScanned.indexOf(" ", 0);
                if (indexOfSpace != -1) {
                    String tempWord;
                    tempWord = theLineScanned.substring(0,indexOfSpace+1);
                    
                    if (!words.contains(String.valueOf(words))) {
                        words.add(tempWord.replaceAll(" ", ""));
                    }  
                    theLineScanned = theLineScanned.replace(tempWord, "");
                }   
            }
            if (!words.contains(String.valueOf(words))) {
                words.add(theLineScanned.replaceAll(" ", ""));
            }
        }
        words.remove(10);

        String str = pageContents;
        int count;
        for (int i = 0; i < words.size(); i++) {
            count = 0;
            String holdingWord = words.get(i);
            if (str.contains(holdingWord)) {
               while (str.contains(holdingWord)) {
                  if (str.contains(holdingWord)) {
                     count++;
                     str = str.replaceFirst(holdingWord, "");
                  }
               }
               System.out.println("Word " + holdingWord + " occurs " + count + " times.");
            }
        }
    }
}
