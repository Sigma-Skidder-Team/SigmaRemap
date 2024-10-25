package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5032 extends Class4975 {
   private byte[] field23000;

   public Class5032() {
      super("OMA DRM Rights Object Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field23000 = new byte[(int)this.method15430(var1)];
      var1.readBytes(this.field23000);
   }

   public byte[] method15402() {
      return this.field23000;
   }
}
