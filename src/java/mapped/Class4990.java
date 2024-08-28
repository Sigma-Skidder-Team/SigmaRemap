package mapped;

import java.io.IOException;

public class Class4990 extends Class4975 {
   private long[] field22904;
   private long[] field22905;

   public Class4990() {
      super("Time To Sample Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.method31863(4);
      this.field22904 = new long[var4];
      this.field22905 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field22904[var5] = var1.method31863(4);
         this.field22905[var5] = var1.method31863(4);
      }
   }

   public long[] method15318() {
      return this.field22904;
   }

   public long[] method15319() {
      return this.field22905;
   }
}
