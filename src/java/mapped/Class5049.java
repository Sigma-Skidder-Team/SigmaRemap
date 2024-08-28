package mapped;

import java.io.IOException;

public class Class5049 extends Class5046 {
   private int field23038;
   private int field23039;
   private long field23040;

   public Class5049() {
      super("RTP Hint Sample Entry");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field23038 = (int)var1.method31863(2);
      this.field23039 = (int)var1.method31863(2);
      this.field23040 = var1.method31863(4);
   }

   public long method15452() {
      return this.field23040;
   }
}
