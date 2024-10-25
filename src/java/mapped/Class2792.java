package mapped;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URI;

public class Class2792 {
   private static final String field17427 = "usage:\nnet.sourceforge.jaad.Radio <url>";

   public static void main(String[] var0) {
      try {
         if (var0.length < 1) {
            method10989();
         } else {
            method10990(var0[0]);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         System.err.println("error while decoding: " + var4.toString());
      }
   }

   private static void method10989() {
      System.out.println("usage:\nnet.sourceforge.jaad.Radio <url>");
      System.exit(1);
   }

   private static void method10990(String var0) throws Exception {
      SampleBuffer var3 = new SampleBuffer();
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

         Class9120 var11 = new Class9120(var9);
         AudioFormat var12 = new AudioFormat((float)var11.method34015(), 16, var11.method34016(), true, true);
         Decoder var13 = new Decoder(var11.method34012());

         while (true) {
            byte[] var14 = var11.method34013();
            var13.decodeFrame(var14, var3);
            if (var4 != null && method10991(var4.getFormat(), var3)) {
               var4.stop();
               var4.close();
               var4 = null;
               var12 = new AudioFormat((float)var3.method28524(), var3.method28526(), var3.method28525(), true, true);
            }

            if (var4 == null) {
               var4 = AudioSystem.getSourceDataLine(var12);
               var4.open();
               var4.start();
            }

            var14 = var3.getData();
            var4.write(var14, 0, var14.length);
         }
      } finally {
         if (var4 != null) {
            var4.stop();
            var4.close();
         }
      }
   }

   private static boolean method10991(AudioFormat var0, SampleBuffer var1) {
      return var0.getSampleRate() != (float)var1.method28524()
         || var0.getChannels() != var1.method28525()
         || var0.getSampleSizeInBits() != var1.method28526()
         || var0.isBigEndian() != var1.method28530();
   }
}
