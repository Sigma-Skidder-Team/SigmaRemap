package remapped;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URI;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

public class class_61 {
   private static final String field_60 = "usage:\nnet.sourceforge.jaad.Radio <url>";

   public static void main(String[] var0) {
      try {
         if (var0.length < 1) {
            method_39();
         } else {
            method_40(var0[0]);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         System.err.println("error while decoding: " + var4.toString());
      }
   }

   private static void method_39() {
      System.out.println("usage:\nnet.sourceforge.jaad.Radio <url>");
      System.exit(1);
   }

   private static void method_40(String var0) throws Exception {
      class_3885 var3 = new class_3885();
      SourceDataLine var4 = null;

      try {
         URI var5 = new URI(var0);
         Socket var6 = new Socket(var5.getHost(), var5.getPort() > 0 ? var5.getPort() : 80);
         PrintStream var7 = new PrintStream(var6.getOutputStream());
         String var8 = var5.getPath();
         if (var8 == null || var8.equals("")) {
            var8 = "/";
         }

         if (var5.getQuery() != null) {
            var8 = var8 + "?" + var5.getQuery();
         }

         var7.println("GET " + var8 + " HTTP/1.1");
         var7.println("Host: " + var5.getHost());
         var7.println();
         DataInputStream var9 = new DataInputStream(var6.getInputStream());

         String var10;
         do {
            var10 = var9.readLine();
         } while (var10 != null && !var10.trim().equals(""));

         class_7094 var11 = new class_7094(var9);
         AudioFormat var12 = new AudioFormat((float)var11.method_32603(), 16, var11.method_32607(), true, true);
         class_8405 var13 = new class_8405(var11.method_32606());

         while (true) {
            byte[] var14 = var11.method_32608();
            var13.method_38703(var14, var3);
            if (var4 != null && method_37(var4.getFormat(), var3)) {
               var4.stop();
               var4.close();
               var4 = null;
               var12 = new AudioFormat((float)var3.method_17970(), var3.method_17969(), var3.method_17962(), true, true);
            }

            if (var4 == null) {
               var4 = AudioSystem.getSourceDataLine(var12);
               var4.open();
               var4.start();
            }

            var14 = var3.method_17971();
            var4.write(var14, 0, var14.length);
         }
      } finally {
         if (var4 != null) {
            var4.stop();
            var4.close();
         }
      }
   }

   private static boolean method_37(AudioFormat var0, class_3885 var1) {
      return var0.getSampleRate() != (float)var1.method_17970()
         || var0.getChannels() != var1.method_17962()
         || var0.getSampleSizeInBits() != var1.method_17969()
         || var0.isBigEndian() != var1.method_17967();
   }
}
