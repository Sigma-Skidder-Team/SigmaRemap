package mapped;

public class Class1596 implements Runnable {
   private static String[] field8647;
   public final int field8648;
   public final int field8649;
   public final float[] field8650;
   public final boolean field8651;
   public final Class9533 field8652;

   public Class1596(Class9533 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field8652 = var1;
      this.field8648 = var2;
      this.field8649 = var3;
      this.field8650 = var4;
      this.field8651 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class9533.method36858(this.field8652)];

      for (int var4 = this.field8648; var4 < this.field8649; var4++) {
         for (int var5 = 0; var5 < Class9533.method36858(this.field8652); var5++) {
            var3[var5] = this.field8650[var5 * Class9533.method36856(this.field8652) + var4];
         }

         Class9533.method36859(this.field8652).method29627(var3, this.field8651);

         for (int var6 = 0; var6 < Class9533.method36858(this.field8652); var6++) {
            this.field8650[var6 * Class9533.method36856(this.field8652) + var4] = var3[var6];
         }
      }
   }
}
