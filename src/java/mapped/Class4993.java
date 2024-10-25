package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class4993 extends Class4975 {
   private String field22912;

   public Class4993(String var1) {
      super(var1);
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      byte[] var4 = new byte[(int)this.method15430(var1)];
      var1.readBytes(var4);
      this.field22912 = new String(var4, "UTF-8");
   }

   public String method15326() {
      return this.field22912;
   }
}
