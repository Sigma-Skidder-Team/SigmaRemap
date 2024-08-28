package mapped;

import java.io.IOException;

public class Class5024 extends Class5023 {
   private long field22985;
   private int field22986;

   public Class5024() {
      super("3GPP Classification Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      this.method15384(var1);
      this.field22985 = var1.method31863(4);
      this.field22986 = (int)var1.method31863(2);
   }

   public long method15387() {
      return this.field22985;
   }

   public int method15388() {
      return this.field22986;
   }
}
