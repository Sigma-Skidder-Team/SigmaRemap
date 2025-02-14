package mapped;

import java.io.IOException;

public class Class5032 extends FullBox {
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
