package mapped;

public class Class717 implements Runnable {
   private static String[] field3685;
   public final int field3686;
   public final int field3687;
   public final float[] field3688;
   public final boolean field3689;
   public final Class7941 field3690;

   public Class717(Class7941 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field3690 = var1;
      this.field3686 = var2;
      this.field3687 = var3;
      this.field3688 = var4;
      this.field3689 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3686; var3 < this.field3687; var3++) {
         int var4 = var3 * Class7941.method26763(this.field3690);

         for (int var5 = 0; var5 < Class7941.method26764(this.field3690); var5++) {
            Class7941.method26766(this.field3690).method28930(this.field3688, var4 + var5 * Class7941.method26765(this.field3690), this.field3689);
         }
      }
   }
}
