package mapped;

import java.io.IOException;

public class Class5033 extends Class4975 {
   private int[] field23001;
   private int[][] field23002;

   public Class5033() {
      super("Sample Dependency Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      int var4 = ((Class4996)this.field23026.method15438(1937011578L)).method15342();

      for (int var5 = 0; var5 < var4; var5++) {
         this.field23001[var5] = (int)var1.readBits(2);

         for (int var6 = 0; var6 < this.field23001[var5]; var6++) {
            this.field23002[var5][var6] = (int)var1.readBits(2);
         }
      }
   }

   public int[] method15403() {
      return this.field23001;
   }

   public int[][] method15404() {
      return this.field23002;
   }
}
