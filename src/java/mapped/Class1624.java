package mapped;

public class Class1624 implements Runnable {
   private static String[] field8800;
   public final int field8801;
   public final int field8802;
   public final float[] field8803;
   public final int field8804;
   public final float[] field8805;
   public final Class8431 field8806;

   public Class1624(Class8431 var1, int var2, int var3, float[] var4, int var5, float[] var6) {
      this.field8806 = var1;
      this.field8801 = var2;
      this.field8802 = var3;
      this.field8803 = var4;
      this.field8804 = var5;
      this.field8805 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field8801; var3 < this.field8802; var3++) {
         int var4 = 2 * var3;
         float var5 = this.field8803[this.field8804 + var3];
         this.field8805[var4] = Class8431.method29641(this.field8806)[var4] * var5;
         this.field8805[var4 + 1] = -Class8431.method29641(this.field8806)[var4 + 1] * var5;
      }
   }
}
