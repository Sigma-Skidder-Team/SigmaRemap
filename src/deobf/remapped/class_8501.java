package remapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class class_8501 {
   private static final String field_43534 = "usage:\nnet.sourceforge.jaad.Main [-mp4] <infile> <outfile>\n\n\t-mp4\tinput file is in MP4 container format";

   public static void main(String[] var0) {
      try {
         if (var0.length < 2) {
            method_39170();
         }

         if (var0[0].equals("-mp4")) {
            if (var0.length < 3) {
               method_39170();
            } else {
               method_39171(var0[1], var0[2]);
            }
         } else {
            method_39172(var0[0], var0[1]);
         }
      } catch (Exception var4) {
         System.err.println("error while decoding: " + var4.toString());
      }
   }

   private static void method_39170() {
      System.out.println("usage:\nnet.sourceforge.jaad.Main [-mp4] <infile> <outfile>\n\n\t-mp4\tinput file is in MP4 container format");
      System.exit(1);
   }

   private static void method_39171(String var0, String var1) throws Exception {
      class_9198 var4 = null;

      try {
         class_4791 var5 = new class_4791(new RandomAccessFile(var0, "r"));
         class_5111 var6 = var5.method_22093();
         List var7 = var6.method_23447(class_3040.field_14907);
         if (var7.isEmpty()) {
            throw new Exception("movie does not contain any AAC track");
         }

         class_5043 var8 = (class_5043)var7.get(0);
         var4 = new class_9198(new File(var1), var8.method_23221(), var8.method_23218(), var8.method_23222());
         class_8405 var9 = new class_8405(var8.method_8200());
         class_3885 var10 = new class_3885();

         while (var8.method_8219()) {
            class_7553 var11 = var8.method_8199();
            var9.method_38703(var11.method_34368(), var10);
            var4.method_42398(var10.method_17971());
         }
      } finally {
         if (var4 != null) {
            var4.method_42402();
         }
      }
   }

   private static void method_39172(String var0, String var1) throws IOException {
      class_9198 var4 = null;

      try {
         class_7094 var5 = new class_7094(new FileInputStream(var0));
         class_8405 var6 = new class_8405(var5.method_32606());
         class_3885 var7 = new class_3885();

         while (true) {
            byte[] var8 = var5.method_32608();
            var6.method_38703(var8, var7);
            if (var4 == null) {
               var4 = new class_9198(new File(var1), var7.method_17970(), var7.method_17962(), var7.method_17969());
            }

            var4.method_42398(var7.method_17971());
         }
      } finally {
         if (var4 != null) {
            var4.method_42402();
         }
      }
   }
}
