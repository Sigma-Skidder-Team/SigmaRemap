package remapped;

import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

public class class_4059 {
   private static final String field_19772 = "usage:\nnet.sourceforge.jaad.Play [-mp4] <infile>\n\n\t-mp4\tinput file is in MP4 container format";

   public static void main(String[] var0) {
      try {
         if (var0.length < 1) {
            method_18729();
         }

         if (var0[0].equals("-mp4")) {
            if (var0.length < 2) {
               method_18729();
            } else {
               method_18728(var0[1]);
            }
         } else {
            method_18727(var0[0]);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         System.err.println("error while decoding: " + var4.toString());
      }
   }

   private static void method_18729() {
      System.out.println("usage:\nnet.sourceforge.jaad.Play [-mp4] <infile>\n\n\t-mp4\tinput file is in MP4 container format");
      System.exit(1);
   }

   private static void method_18728(String var0) throws Exception {
      SourceDataLine var3 = null;

      try {
         class_4791 var4 = new class_4791(new RandomAccessFile(var0, "r"));
         class_5111 var5 = var4.method_22093();
         List var6 = var5.method_23447(class_3040.field_14907);
         if (var6.isEmpty()) {
            throw new Exception("movie does not contain any AAC track");
         }

         class_5043 var7 = (class_5043)var6.get(0);
         AudioFormat var8 = new AudioFormat((float)var7.method_23221(), var7.method_23222(), var7.method_23218(), true, true);
         var3 = AudioSystem.getSourceDataLine(var8);
         var3.open();
         var3.start();
         class_8405 var9 = new class_8405(var7.method_8200());
         class_3885 var10 = new class_3885();

         while (var7.method_8219()) {
            class_7553 var11 = var7.method_8199();

            try {
               var9.method_38703(var11.method_34368(), var10);
               byte[] var12 = var10.method_17971();
               var3.write(var12, 0, var12.length);
            } catch (class_5060 var17) {
               var17.printStackTrace();
            }
         }
      } finally {
         if (var3 != null) {
            var3.stop();
            var3.close();
         }
      }
   }

   private static void method_18727(String var0) throws Exception {
      SourceDataLine var3 = null;

      try {
         class_7094 var4 = new class_7094(new FileInputStream(var0));
         class_8405 var5 = new class_8405(var4.method_32606());
         class_3885 var6 = new class_3885();

         while (true) {
            byte[] var7 = var4.method_32608();
            var5.method_38703(var7, var6);
            if (var3 == null) {
               AudioFormat var8 = new AudioFormat((float)var6.method_17970(), var6.method_17969(), var6.method_17962(), true, true);
               var3 = AudioSystem.getSourceDataLine(var8);
               var3.open();
               var3.start();
            }

            var7 = var6.method_17971();
            var3.write(var7, 0, var7.length);
         }
      } finally {
         if (var3 != null) {
            var3.stop();
            var3.close();
         }
      }
   }
}
