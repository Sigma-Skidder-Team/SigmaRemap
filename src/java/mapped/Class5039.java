package mapped;

import java.io.IOException;

public class Class5039 extends Class4975 {
   private byte[] field23020;

   public Class5039() {
      super("Binary XML Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      this.field23020 = new byte[(int)this.method15430(var1)];
      var1.readBytes(this.field23020);
   }

   public byte[] method15427() {
      return this.field23020;
   }
}
