package mapped;

import java.io.IOException;

public class Class4985 extends Class4975 {
   private int[] field22876;
   private int[] field22877;
   private int[] field22878;

   public Class4985() {
      super("Sample Dependency Type Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      long var4 = -1L;
      if (this.field23026.method15437(1937011578L)) {
         var4 = (long)((Class4996)this.field23026.method15438(1937011578L)).method15342();
      }

      this.field22878 = new int[(int)var4];
      this.field22877 = new int[(int)var4];
      this.field22876 = new int[(int)var4];

      for (int var6 = 0; (long)var6 < var4; var6++) {
         byte var7 = (byte)var1.method31861();
         this.field22878[var6] = var7 & 3;
         this.field22877[var6] = var7 >> 2 & 3;
         this.field22876[var6] = var7 >> 4 & 3;
      }
   }

   public int[] method15291() {
      return this.field22876;
   }

   public int[] method15292() {
      return this.field22877;
   }

   public int[] method15293() {
      return this.field22878;
   }
}
