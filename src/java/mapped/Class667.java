package mapped;

public class Class667 implements Runnable {
   private static String[] field3366;
   public final int field3367;
   public final int field3368;
   public final float[] field3369;
   public final Class7821 field3370;

   public Class667(Class7821 var1, int var2, int var3, float[] var4) {
      this.field3370 = var1;
      this.field3367 = var2;
      this.field3368 = var3;
      this.field3369 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7821.method26151(this.field3370)];

      for (int var4 = this.field3367; var4 < this.field3368; var4++) {
         for (int var5 = 0; var5 < Class7821.method26151(this.field3370); var5++) {
            var3[var5] = this.field3369[var5 * Class7821.method26149(this.field3370) + var4];
         }

         Class7821.method26152(this.field3370).method28455(var3);

         for (int var6 = 0; var6 < Class7821.method26151(this.field3370); var6++) {
            this.field3369[var6 * Class7821.method26149(this.field3370) + var4] = var3[var6];
         }
      }
   }
}
