// Source code is decompiled from a .class file using FernFlower decompiler.
package CS102_lab02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

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
}
