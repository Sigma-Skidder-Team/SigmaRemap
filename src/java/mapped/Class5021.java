package mapped;

import java.io.IOException;

public class Class5021 extends Class4975 {
   private long field22981;

   public Class5021() {
      super("Movie Fragment Random Access Offset Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      this.field22981 = var1.readBits(4);
   }

   public long method15383() {
      return this.field22981;
   }
}
