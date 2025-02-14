package mapped;

public class Class1540 implements Runnable {
   private static String[] field8356;
   public final int field8357;
   public final int field8358;
   public final float[] field8359;
   public final Class8162 field8360;

   public Class1540(Class8162 var1, int var2, int var3, float[] var4) {
      this.field8360 = var1;
      this.field8357 = var2;
      this.field8358 = var3;
      this.field8359 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class8162.method28398(this.field8360)];

      for (int var4 = this.field8357; var4 < this.field8358; var4++) {
         int var5 = var4 * Class8162.method28394(this.field8360);

         for (int var6 = 0; var6 < Class8162.method28396(this.field8360); var6++) {
            for (int var7 = 0; var7 < Class8162.method28398(this.field8360); var7++) {
               int var8 = var7 * Class8162.method28392(this.field8360) + var5 + var6;
               var3[var7] = this.field8359[var8];
            }

            Class8162.method28399(this.field8360).method28455(var3);

            for (int var9 = 0; var9 < Class8162.method28398(this.field8360); var9++) {
               int var10 = var9 * Class8162.method28392(this.field8360) + var5 + var6;
               this.field8359[var10] = var3[var9];
            }
         }
      }
   }
}
