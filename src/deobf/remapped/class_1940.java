package remapped;

import com.mojang.bridge.game.PerformanceMetrics;

public class class_1940 implements PerformanceMetrics {
   private static String[] field_9909;
   private final int field_9907;
   private final int field_9906;
   private final int field_9908;
   private final int field_9910;

   public class_1940(int var1, int var2, int var3, int var4) {
      this.field_9907 = var1;
      this.field_9906 = var2;
      this.field_9908 = var3;
      this.field_9910 = var4;
   }

   public int getMinTime() {
      return this.field_9907;
   }

   public int getMaxTime() {
      return this.field_9906;
   }

   public int getAverageTime() {
      return this.field_9908;
   }

   public int getSampleCount() {
      return this.field_9910;
   }
}
