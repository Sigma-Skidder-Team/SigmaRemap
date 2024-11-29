package mapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class Class9472 {
   private static final String field44014 = "usage:\nnet.sourceforge.jaad.Main [-mp4] <infile> <outfile>\n\n\t-mp4\tinput file is in MP4 container format";

   public static void main(String[] var0) {
      try {
         if (var0.length < 2) {
            method36530();
         }

         if (var0[0].equals("-mp4")) {
            if (var0.length < 3) {
               method36530();
            } else {
               method36531(var0[1], var0[2]);
            }
         } else {
            method36532(var0[0], var0[1]);
         }
      } catch (Exception var4) {
         System.err.println("error while decoding: " + var4.toString());
      }
   }

   private static void method36530() {
      System.out.println("usage:\nnet.sourceforge.jaad.Main [-mp4] <infile> <outfile>\n\n\t-mp4\tinput file is in MP4 container format");
      System.exit(1);
   }

   private static void method36531(String var0, String var1) throws Exception {
      Class9650 var4 = null;

      try {
         Class8490 var5 = new Class8490(new RandomAccessFile(var0, "r"));
         Class8583 var6 = var5.method30073();
         List var7 = var6.method30674(Class2267.field14741);
         if (var7.isEmpty()) {
            throw new Exception("movie does not contain any AAC track");
         }

         Class7356 var8 = (Class7356)var7.get(0);
         var4 = new Class9650(new File(var1), var8.method23338(), var8.method23337(), var8.method23339());
         Class6542 var9 = new Class6542(var8.method23320());
         Class8210 var10 = new Class8210();

         while (var8.method23323()) {
            Class1994 var11 = var8.method23324();
            var9.method19888(var11.method8282(), var10);
            var4.method37638(var10.method28523());
         }
      } finally {
         if (var4 != null) {
            var4.method37642();
         }
      }
   }

   private static void method36532(String var0, String var1) throws IOException {
      Class9650 var4 = null;

      try {
         Class9120 var5 = new Class9120(new FileInputStream(var0));
         Class6542 var6 = new Class6542(var5.method34012());
         Class8210 var7 = new Class8210();

         while (true) {
            byte[] var8 = var5.method34013();
            var6.method19888(var8, var7);
            if (var4 == null) {
               var4 = new Class9650(new File(var1), var7.method28524(), var7.method28525(), var7.method28526());
            }

            var4.method37638(var7.method28523());
         }
      } finally {
         if (var4 != null) {
            var4.method37642();
         }
      }
   }
}
