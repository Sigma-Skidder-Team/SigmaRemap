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
         MP4Container var4 = new MP4Container(new RandomAccessFile(var0, "r"));
         Movie var5 = var4.getMovie();
         List var6 = var5.method30674(Class2267.field14741);
         if (var6.isEmpty()) {
            throw new Exception("movie does not contain any AAC track");
         }

         VideoTrack var7 = (VideoTrack)var6.get(0);
         AudioFormat var8 = new AudioFormat((float)var7.getHeight(), var7.getDepth(), var7.getWidth(), true, true);
         var3 = AudioSystem.getSourceDataLine(var8);
         var3.open();
         var3.start();
         Decoder var9 = new Decoder(var7.getDecoderSpecificInfo());
         SampleBuffer var10 = new SampleBuffer();

         while (var7.hasMoreFrames()) {
            Frame var11 = var7.readNextFrame();

            try {
               var9.decodeFrame(var11.getData(), var10);
               byte[] var12 = var10.getData();
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
         Decoder var5 = new Decoder(var4.method34012());
         SampleBuffer var6 = new SampleBuffer();

         while (true) {
            byte[] var7 = var4.method34013();
            var5.decodeFrame(var7, var6);
            if (var3 == null) {
               AudioFormat var8 = new AudioFormat((float)var6.method28524(), var6.method28526(), var6.method28525(), true, true);
               var3 = AudioSystem.getSourceDataLine(var8);
               var3.open();
               var3.start();
            }

            var7 = var6.getData();
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
