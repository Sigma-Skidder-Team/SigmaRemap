package mapped;

import java.io.IOException;

public class Class4976 extends FullBox {
   public Class4976() {
      super("FD Item Information Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.readBits(2);
      this.method15442(var1, var4);
      this.method15441(var1);
   }
}
