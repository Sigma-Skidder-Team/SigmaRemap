package mapped;

import java.io.IOException;

public class IPMPControlBox extends FullBox {
   private AudioByteManager field22873;
   private AudioByteManager[] field22874;

   public IPMPControlBox() {
      super("IPMP Control Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field22873 = AudioByteManager.readDescriptor(var1);
      int var4 = var1.readInt();
      this.field22874 = new AudioByteManager[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field22874[var5] = AudioByteManager.readDescriptor(var1);
      }
   }

   public AudioByteManager method15288() {
      return this.field22873;
   }

   public AudioByteManager[] method15289() {
      return this.field22874;
   }
}
