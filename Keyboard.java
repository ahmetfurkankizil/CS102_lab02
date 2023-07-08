// Source code is decompiled from a .class file using FernFlower decompiler.
package CS102_lab02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Keyboard {
   public static final String version = "Keyboard:v1.0:15/12/2003";
   private static boolean printErrors = true;
   private static int errorCount = 0;
   private static String current_token = null;
   private static StringTokenizer reader;
   private static BufferedReader in;

   public Keyboard() {
   }

   public static int getErrorCount() {
      return errorCount;
   }

   public static void resetErrorCount(int var0) {
      errorCount = 0;
   }

   public static boolean getPrintErrors() {
      return printErrors;
   }

   public static void setPrintErrors(boolean var0) {
      printErrors = var0;
   }

   private static void error(String var0) {
      ++errorCount;
      if (printErrors) {
         System.out.println(var0);
      }

   }

   public static void reset() {
      resetErrorCount(0);
      current_token = null;
      reader = null;
      in = new BufferedReader(new InputStreamReader(System.in), 1);
   }

   public static void Wait() {
      try {
         current_token = null;
         reader = null;
         in.readLine();
      } catch (Exception var1) {
         error("OOPS.. ");
      }

   }

   private static String getNextToken() {
      return getNextToken(true);
   }

   private static String getNextToken(boolean var0) {
      String var1;
      if (current_token == null) {
         var1 = getNextInputToken(var0);
      } else {
         var1 = current_token;
         current_token = null;
      }

      return var1;
   }

   private static String getNextInputToken(boolean var0) {
      String var2 = null;

      try {
         if (reader == null) {
            reader = new StringTokenizer(in.readLine(), " \t\n\r\f", true);
         }

         while(var2 == null || " \t\n\r\f".indexOf(var2) >= 0 && var0) {
            while(!reader.hasMoreTokens()) {
               reader = new StringTokenizer(in.readLine(), " \t\n\r\f", true);
            }

            var2 = reader.nextToken();
         }
      } catch (Exception var4) {
         var2 = null;
      }

      return var2;
   }

   public static boolean endOfLine() {
      return !reader.hasMoreTokens();
   }

   public static String readString() {
      String var0;
      try {
         for(var0 = getNextToken(false); !endOfLine(); var0 = var0 + getNextToken(false)) {
         }
      } catch (Exception var2) {
         error("Error reading String data, null value returned.");
         var0 = null;
      }

      return var0;
   }

   public static String readWord() {
      String var0;
      try {
         var0 = getNextToken();
      } catch (Exception var2) {
         error("Error reading String data, null value returned.");
         var0 = null;
      }

      return var0;
   }

   public static boolean readBoolean() {
      String var0 = getNextToken();

      boolean var1;
      try {
         if (var0.toLowerCase().equals("true")) {
            var1 = true;
         } else if (var0.toLowerCase().equals("false")) {
            var1 = false;
         } else {
            error("Error reading boolean data, false value returned.");
            var1 = false;
         }
      } catch (Exception var3) {
         error("Error reading boolean data, false value returned.");
         var1 = false;
      }

      return var1;
   }

   public static char readChar() {
      String var0 = getNextToken(false);

      char var1;
      try {
         if (var0.length() > 1) {
            current_token = var0.substring(1, var0.length());
         } else {
            current_token = null;
         }

         var1 = var0.charAt(0);
      } catch (Exception var3) {
         error("Error reading char data, MIN_VALUE value returned.");
         var1 = 0;
      }

      return var1;
   }

   public static int readInt() {
      String var0 = getNextToken();

      int var1;
      try {
         var1 = Integer.parseInt(var0);
      } catch (Exception var3) {
         error("Error reading int data, MIN_VALUE value returned.");
         var1 = Integer.MIN_VALUE;
      }

      return var1;
   }

   public static long readLong() {
      String var0 = getNextToken();

      long var1;
      try {
         var1 = Long.parseLong(var0);
      } catch (Exception var4) {
         error("Error reading long data, MIN_VALUE value returned.");
         var1 = Long.MIN_VALUE;
      }

      return var1;
   }

   public static float readFloat() {
      String var0 = getNextToken();

      float var1;
      try {
         var1 = new Float(var0);
      } catch (Exception var3) {
         error("Error reading float data, NaN value returned.");
         var1 = Float.NaN;
      }

      return var1;
   }

   public static double readDouble() {
      String var0 = getNextToken();

      double var1;
      try {
         var1 = new Double(var0);
      } catch (Exception var4) {
         error("Error reading double data, NaN value returned.");
         var1 = Double.NaN;
      }

      return var1;
   }

   static {
      in = new BufferedReader(new InputStreamReader(System.in), 1);
   }
}
