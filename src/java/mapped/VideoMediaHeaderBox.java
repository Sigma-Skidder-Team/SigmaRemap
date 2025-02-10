package mapped;

import java.io.IOException;

public class VideoMediaHeaderBox extends FullBox {
   private double field23021;

   public VideoMediaHeaderBox() {
      super("Sound Media Header Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field23021 = var1.method31869(8, 8);
      var1.skipBytes(2L);
   }

   public double getBalance() {
      return this.field23021;
   }
}
