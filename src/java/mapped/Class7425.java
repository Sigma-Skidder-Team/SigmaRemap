package mapped;

import com.mojang.bridge.game.PerformanceMetrics;

public class Class7425 implements PerformanceMetrics {
   private static String[] field31911;
   private final int field31912;
   private final int field31913;
   private final int field31914;
   private final int field31915;

   public Class7425(int var1, int var2, int var3, int var4) {
      this.field31912 = var1;
      this.field31913 = var2;
      this.field31914 = var3;
      this.field31915 = var4;
   }

   public int getMinTime() {
      return this.field31912;
   }

   public int getMaxTime() {
      return this.field31913;
   }

   public int getAverageTime() {
      return this.field31914;
   }

   public int getSampleCount() {
      return this.field31915;
   }
}
