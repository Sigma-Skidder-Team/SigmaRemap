package mapped;

import java.io.IOException;

public class Class4981 extends Class4975 {
   private long[] field22867;
   private long[] field22868;
   private double[] field22869;

   public Class4981() {
      super("Edit List Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.method31863(4);
      int var5 = this.field22850 != 1 ? 4 : 8;
      this.field22867 = new long[var4];
      this.field22868 = new long[var4];
      this.field22869 = new double[var4];

      for (int var6 = 0; var6 < var4; var6++) {
         this.field22867[var6] = var1.method31863(var5);
         this.field22868[var6] = var1.method31863(var5);
         this.field22869[var6] = var1.method31869(16, 16);
      }
   }

   public long[] method15278() {
      return this.field22867;
   }

   public long[] method15279() {
      return this.field22868;
   }

   public double[] method15280() {
      return this.field22869;
   }
}
