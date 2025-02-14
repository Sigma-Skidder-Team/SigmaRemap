package mapped;

public class Class674 implements Runnable {
   private static String[] field3416;
   public final int field3417;
   public final int field3418;
   public final float[] field3419;
   public final Class7821 field3420;

   public Class674(Class7821 var1, int var2, int var3, float[] var4) {
      this.field3420 = var1;
      this.field3417 = var2;
      this.field3418 = var3;
      this.field3419 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field3417; var3 < this.field3418; var3++) {
         Class7821.method26150(this.field3420).method28457(this.field3419, var3 * Class7821.method26149(this.field3420));
      }
   }
}
