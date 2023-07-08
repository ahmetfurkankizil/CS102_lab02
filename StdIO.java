// Source code is decompiled from a .class file using FernFlower decompiler.
package CS102_lab02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class StdIO {
   public static final String version = "StdIO:v1.0:15/12/2003";
   static final String stdOutStreamName = "Screen";
   static final String stdInStreamName = "Keyboard";
   private static PrintStream origOut;
   private static PrintStream stdout;
   private static String outStreamName;
   private static InputStream origIn;
   private static InputStream stdin;
   private static String inStreamName;

   public StdIO() {
   }

   public static boolean exists(String var0) {
      File var1 = new File(var0);
      return var1.exists();
   }

   public static String getInStreamName() {
      return inStreamName;
   }

   public static void from(String var0) {
      if (stdin != null) {
         resetIn();
      }

      try {
         stdin = new FileInputStream(var0);
         System.setIn(stdin);
         inStreamName = var0;
         Keyboard.reset();
      } catch (Exception var2) {
         System.err.println("Error:  Unable to open input file [" + var0 + "]");
         System.exit(1);
      }

   }

   public static void resetIn() {
      try {
         if (stdin != null) {
            stdin.close();
            stdin = null;
         }

         System.setIn(origIn);
         inStreamName = "Keyboard";
         Keyboard.reset();
      } catch (Exception var1) {
         System.err.println("Error:  Unable to close [" + inStreamName + "]");
         System.exit(1);
      }

   }

   public static String getOutStreamName() {
      return outStreamName;
   }

   public static void addTo(String var0) {
      to(var0, true);
   }

   public static void to(String var0) {
      to(var0, false);
   }

   public static void to(String var0, boolean var1) {
      if (stdout != null) {
         resetOut();
      }

      try {
         stdout = new PrintStream(new FileOutputStream(var0, var1));
         System.setOut(stdout);
         outStreamName = var0;
      } catch (Exception var3) {
         System.err.println("Error:  Unable to open output file [" + var0 + "]");
         System.exit(1);
      }

   }

   public static void resetOut() {
      try {
         if (stdout != null) {
            stdout.close();
            stdout = null;
         }

         System.setOut(origOut);
         outStreamName = "Screen";
      } catch (Exception var1) {
         System.err.println("Error:  Unable to close [" + outStreamName + "]");
         System.exit(1);
      }

   }

   static {
      origOut = System.out;
      stdout = null;
      outStreamName = "Screen";
      origIn = System.in;
      stdin = null;
      inStreamName = "Keyboard";
   }
}
