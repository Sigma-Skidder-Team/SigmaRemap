package remapped;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.spi.AudioFileReader;

public class class_5233 extends AudioFileReader {
   public static final Type field_26838 = new Type("AAC", "aac");
   public static final Type field_26837 = new Type("MP4", "mp4");
   private static final Encoding field_26836 = new Encoding("AAC");

   @Override
   public AudioFileFormat getAudioFileFormat(InputStream var1) throws UnsupportedAudioFileException, IOException {
      AudioFileFormat var4;
      try {
         if (!var1.markSupported()) {
            var1 = new BufferedInputStream((InputStream)var1);
         }

         var1.mark(4);
         var4 = this.getAudioFileFormat((InputStream)var1, -1);
      } finally {
         var1.reset();
      }

      return var4;
   }

   @Override
   public AudioFileFormat getAudioFileFormat(URL var1) throws UnsupportedAudioFileException, IOException {
      InputStream var4 = var1.openStream();

      AudioFileFormat var5;
      try {
         var5 = this.getAudioFileFormat(var4);
      } finally {
         if (var4 != null) {
            var4.close();
         }
      }

      return var5;
   }

   @Override
   public AudioFileFormat getAudioFileFormat(File var1) throws UnsupportedAudioFileException, IOException {
      BufferedInputStream var4 = null;

      AudioFileFormat var6;
      try {
         var4 = new BufferedInputStream(new FileInputStream(var1));
         var4.mark(1000);
         AudioFileFormat var5 = this.getAudioFileFormat(var4, (int)var1.length());
         var4.reset();
         var6 = var5;
      } finally {
         if (var4 != null) {
            var4.close();
         }
      }

      return var6;
   }

   private AudioFileFormat getAudioFileFormat(InputStream var1, int var2) throws UnsupportedAudioFileException, IOException {
      byte[] var5 = new byte[8];
      var1.read(var5);
      boolean var6 = false;
      if (new String(var5, 4, 4).equals("ftyp")) {
         var6 = true;
      } else {
         new class_7390(var5);

         try {
            new class_7094(var1);
            var6 = true;
         } catch (Exception var9) {
            var6 = false;
         }
      }

      if (var6) {
         AudioFormat var7 = new AudioFormat(field_26836, -1.0F, -1, var2, -1, -1.0F, true);
         return new AudioFileFormat(field_26838, var7, -1);
      } else {
         throw new UnsupportedAudioFileException();
      }
   }

   @Override
   public AudioInputStream getAudioInputStream(InputStream var1) throws UnsupportedAudioFileException, IOException {
      try {
         if (!var1.markSupported()) {
            var1 = new BufferedInputStream((InputStream)var1);
         }

         var1.mark(1000);
         AudioFileFormat var4 = this.getAudioFileFormat((InputStream)var1, -1);
         var1.reset();
         return new class_5069((InputStream)var1, var4.getFormat(), (long)var4.getFrameLength());
      } catch (UnsupportedAudioFileException var5) {
         var1.reset();
         throw var5;
      } catch (IOException var6) {
         var1.reset();
         throw var6;
      }
   }

   @Override
   public AudioInputStream getAudioInputStream(URL var1) throws UnsupportedAudioFileException, IOException {
      InputStream var4 = var1.openStream();

      try {
         return this.getAudioInputStream(var4);
      } catch (UnsupportedAudioFileException var6) {
         if (var4 != null) {
            var4.close();
         }

         throw var6;
      } catch (IOException var7) {
         if (var4 != null) {
            var4.close();
         }

         throw var7;
      }
   }

   @Override
   public AudioInputStream getAudioInputStream(File var1) throws UnsupportedAudioFileException, IOException {
      FileInputStream var4 = new FileInputStream(var1);

      try {
         return this.getAudioInputStream(var4);
      } catch (UnsupportedAudioFileException var6) {
         if (var4 != null) {
            var4.close();
         }

         throw var6;
      } catch (IOException var7) {
         if (var4 != null) {
            var4.close();
         }

         throw var7;
      }
   }
}
