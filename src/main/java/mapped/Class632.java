package mapped;

public class Class632 implements Runnable {
   private static String[] field3150;
   public final int field3151;
   public final int field3152;
   public final int field3153;
   public final int field3154;
   public final float[] field3155;
   public final Class8543 field3156;

   public Class632(Class8543 var1, int var2, int var3, int var4, int var5, float[] var6) {
      this.field3156 = var1;
      this.field3151 = var2;
      this.field3152 = var3;
      this.field3153 = var4;
      this.field3154 = var5;
      this.field3155 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field3151; var3 < this.field3152; var3++) {
         int var4 = var3 * this.field3153;
         int var5 = (Class8543.method30435(this.field3156) - var3 + 1) * this.field3153;

         for (int var6 = this.field3154; var6 < Class8543.method30438(this.field3156); var6++) {
            int var7 = 2 * var6;
            int var8 = 2 * (Class8543.method30438(this.field3156) - var6);
            this.field3155[var7] = this.field3155[var8];
            this.field3155[var7 + 1] = -this.field3155[var8 + 1];
            int var9 = var4 + var7;
            int var10 = var5 - var7;
            this.field3155[var9] = this.field3155[var10];
            this.field3155[var9 + 1] = -this.field3155[var10 + 1];
         }
      }
   }
}
