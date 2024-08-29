package net.minecraft.util;

public class Timer {
   private static String[] field40355;
   public float renderPartialTicks;
   public float elapsedPartialTicks;
   private long field40358;
   private final float field40359;
   public float field40360 = 1.0F;

   public Timer(float var1, long var2) {
      this.field40359 = 1000.0F / var1;
      this.field40358 = var2;
   }

   public int getPartialTicks(long var1) {
      this.elapsedPartialTicks = (float)(var1 - this.field40358) / this.field40359 * this.field40360;
      this.field40358 = var1;
      this.renderPartialTicks = this.renderPartialTicks + this.elapsedPartialTicks;
      int var5 = (int)this.renderPartialTicks;
      this.renderPartialTicks -= (float)var5;
      return var5;
   }
}
