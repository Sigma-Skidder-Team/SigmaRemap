package mapped;

import java.io.IOException;

public class Class5042 extends Class5041 {
   private byte[] field23028;

   public Class5042() {
      super("iTunes FairPlay Data Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field23028 = new byte[(int)this.method15430(var1)];
      var1.readBytes(this.field23028);
   }

   public byte[] method15443() {
      return this.field23028;
   }
}
