package mapped;

public class Class1554 implements Runnable {
   private static String[] field8432;
   public final int field8433;
   public final int field8434;
   public final float[] field8435;
   public final boolean field8436;
   public final Class9533 field8437;

   public Class1554(Class9533 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field8437 = var1;
      this.field8433 = var2;
      this.field8434 = var3;
      this.field8435 = var4;
      this.field8436 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class9533.method36858(this.field8437)];

      for (int var4 = this.field8433; var4 < this.field8434; var4++) {
         for (int var5 = 0; var5 < Class9533.method36858(this.field8437); var5++) {
            var3[var5] = this.field8435[var5 * Class9533.method36856(this.field8437) + var4];
         }

         Class9533.method36859(this.field8437).method29631(var3, this.field8436);

         for (int var6 = 0; var6 < Class9533.method36858(this.field8437); var6++) {
            this.field8435[var6 * Class9533.method36856(this.field8437) + var4] = var3[var6];
         }
      }
   }
}
