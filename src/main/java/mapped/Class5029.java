package mapped;

import java.io.IOException;

public class Class5029 extends FullBox {
   public Class5029() {
      super("Data Reference Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.readBits(4);
      this.method15442(var1, var4);
   }
}
