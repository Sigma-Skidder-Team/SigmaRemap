package mapped;

import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

public class Class8256 {
   private static final String field35502 = "usage:\nnet.sourceforge.jaad.Play [-mp4] <infile>\n\n\t-mp4\tinput file is in MP4 container format";

   public static void main(String[] var0) {
      try {
         if (var0.length < 1) {
            method28784();
         }

         if (var0[0].equals("-mp4")) {
            if (var0.length < 2) {
               method28784();
            } else {
               method28785(var0[1]);
            }
         } else {
            method28786(var0[0]);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         System.err.println("error while decoding: " + var4.toString());
      }
   }

   private static void method28784() {
      System.out.println("usage:\nnet.sourceforge.jaad.Play [-mp4] <infile>\n\n\t-mp4\tinput file is in MP4 container format");
      System.exit(1);
   }

   private static void method28785(String var0) throws Exception {
      SourceDataLine var3 = null;

      try {
         Class8490 var4 = new Class8490(new RandomAccessFile(var0, "r"));
         Class8583 var5 = var4.method30073();
         List var6 = var5.method30674(Class2267.field14741);
         if (var6.isEmpty()) {
            throw new Exception("movie does not contain any AAC track");
         }

         Class7356 var7 = (Class7356)var6.get(0);
         AudioFormat var8 = new AudioFormat((float)var7.method23338(), var7.method23339(), var7.method23337(), true, true);
         var3 = AudioSystem.getSourceDataLine(var8);
         var3.open();
         var3.start();
         Class6542 var9 = new Class6542(var7.method23320());
         Class8210 var10 = new Class8210();

         while (var7.method23323()) {
            Class1994 var11 = var7.method23324();

            try {
               var9.method19888(var11.method8282(), var10);
               byte[] var12 = var10.method28523();
               var3.write(var12, 0, var12.length);
            } catch (Class2460 var17) {
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

   private static void method28786(String var0) throws Exception {
      SourceDataLine var3 = null;

      try {
         Class9120 var4 = new Class9120(new FileInputStream(var0));
         Class6542 var5 = new Class6542(var4.method34012());
         Class8210 var6 = new Class8210();

         while (true) {
            byte[] var7 = var4.method34013();
            var5.method19888(var7, var6);
            if (var3 == null) {
               AudioFormat var8 = new AudioFormat((float)var6.method28524(), var6.method28526(), var6.method28525(), true, true);
               var3 = AudioSystem.getSourceDataLine(var8);
               var3.open();
               var3.start();
            }

            var7 = var6.method28523();
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
