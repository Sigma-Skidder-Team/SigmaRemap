package mapped;

public class Class1595 implements Runnable {
   private static String[] field8641;
   public final int field8642;
   public final int field8643;
   public final float[] field8644;
   public final boolean field8645;
   public final Class7824 field8646;

   public Class1595(Class7824 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field8646 = var1;
      this.field8642 = var2;
      this.field8643 = var3;
      this.field8644 = var4;
      this.field8645 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7824.method26185(this.field8646)];

      for (int var4 = this.field8642; var4 < this.field8643; var4++) {
         int var5 = var4 * Class7824.method26181(this.field8646);

         for (int var6 = 0; var6 < Class7824.method26183(this.field8646); var6++) {
            for (int var7 = 0; var7 < Class7824.method26185(this.field8646); var7++) {
               int var8 = var7 * Class7824.method26179(this.field8646) + var5 + var6;
               var3[var7] = this.field8644[var8];
            }

            Class7824.method26186(this.field8646).method29627(var3, this.field8645);

            for (int var9 = 0; var9 < Class7824.method26185(this.field8646); var9++) {
               int var10 = var9 * Class7824.method26179(this.field8646) + var5 + var6;
               this.field8644[var10] = var3[var9];
            }
         }
      }
   }
}
