package mapped;

public class Class1580 implements Runnable {
   private static String[] field8553;
   public final int field8554;
   public final int field8555;
   public final int field8556;
   public final float[] field8557;
   public final Class8543 field8558;

   public Class1580(Class8543 var1, int var2, int var3, int var4, float[] var5) {
      this.field8558 = var1;
      this.field8554 = var2;
      this.field8555 = var3;
      this.field8556 = var4;
      this.field8557 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8543.method30435(this.field8558)];

      for (int var4 = this.field8554; var4 < this.field8555; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < Class8543.method30435(this.field8558); var6++) {
            int var7 = 2 * var6;
            int var8 = var6 * this.field8556 + var5;
            var3[var7] = this.field8557[var8];
            var3[var7 + 1] = this.field8557[var8 + 1];
         }

         Class8543.method30436(this.field8558).method30929(var3);

         for (int var9 = 0; var9 < Class8543.method30435(this.field8558); var9++) {
            int var10 = 2 * var9;
            int var11 = var9 * this.field8556 + var5;
            this.field8557[var11] = var3[var10];
            this.field8557[var11 + 1] = var3[var10 + 1];
         }
      }
   }
}
