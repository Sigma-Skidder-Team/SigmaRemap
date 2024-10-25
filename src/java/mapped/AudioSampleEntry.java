package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class AudioSampleEntry extends Class5046 {
   private static String[] field23034;
   private int field23035;
   private int field23036;
   private int field23037;

   public AudioSampleEntry(String var1) {
      super(var1);
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      var1.skipBytes(8L);
      this.field23035 = (int)var1.readBits(2);
      this.field23036 = (int)var1.readBits(2);
      var1.skipBytes(2L);
      var1.skipBytes(2L);
      this.field23037 = (int)var1.readBits(2);
      var1.skipBytes(2L);
      this.method15441(var1);
   }

   public int method15449() {
      return this.field23035;
   }

   public int getSampleRate() {
      return this.field23037;
   }

   public int getSampleSize() {
      return this.field23036;
   }
}
