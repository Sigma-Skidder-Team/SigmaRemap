package mapped;

public class Class677 implements Runnable {
   private static String[] field3430;
   public final int field3431;
   public final int field3432;
   public final float[] field3433;
   public final int field3434;
   public final Class8543 field3435;

   public Class677(Class8543 var1, int var2, int var3, float[] var4, int var5) {
      this.field3435 = var1;
      this.field3431 = var2;
      this.field3432 = var3;
      this.field3433 = var4;
      this.field3434 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3431; var3 < this.field3432; var3++) {
         Class8543.method30434(this.field3435).method30931(this.field3433, var3 * this.field3434);
      }
   }
}
