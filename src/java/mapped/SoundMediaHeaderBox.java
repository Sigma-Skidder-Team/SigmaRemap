package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class SoundMediaHeaderBox extends Class4975 {
   private double field23021;

   public SoundMediaHeaderBox() {
      super("Sound Media Header Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field23021 = var1.method31869(8, 8);
      var1.skipBytes(2L);
   }

   public double method15428() {
      return this.field23021;
   }
}
