package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5022 extends Class4975 {
   public Class5022() {
      super("Item Protection Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.readBits(2);
      this.method15442(var1, var4);
   }
}
