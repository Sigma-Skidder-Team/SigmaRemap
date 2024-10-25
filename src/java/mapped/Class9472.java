package mapped;

import net.sourceforge.jaad.mp4.api.Frame;
import net.sourceforge.jaad.mp4.api.Movie;

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
         Movie var6 = var5.method30073();
         List var7 = var6.getTracks(AudioTrack.AudioCodec.AAC);
         if (var7.isEmpty()) {
            throw new Exception("movie does not contain any AAC track");
         }

         AudioTrack var8 = (AudioTrack)var7.get(0);
         var4 = new Class9650(new File(var1), var8.getSampleRate(), var8.getChannelCount(), var8.getSampleSize());
         Decoder var9 = new Decoder(var8.getDecoderSpecificInfo());
         SampleBuffer var10 = new SampleBuffer();

         while (var8.hasMoreFrames()) {
            Frame var11 = var8.method23324();
            var9.decodeFrame(var11.getData(), var10);
            var4.method37638(var10.getData());
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
         Decoder var6 = new Decoder(var5.method34012());
         SampleBuffer var7 = new SampleBuffer();

         while (true) {
            byte[] var8 = var5.method34013();
            var6.decodeFrame(var8, var7);
            if (var4 == null) {
               var4 = new Class9650(new File(var1), var7.method28524(), var7.method28525(), var7.method28526());
            }

            var4.method37638(var7.getData());
         }
      } finally {
         if (var4 != null) {
            var4.method37642();
         }
      }
   }
}
