package mapped;

public class Class1641 implements Runnable {
   private static String[] field8910;
   public final int field8911;
   public final int field8912;
   public final int field8913;
   public final double[] field8914;
   public final double[] field8915;
   public final Class9788 field8916;

   public Class1641(Class9788 var1, int var2, int var3, int var4, double[] var5, double[] var6) {
      this.field8916 = var1;
      this.field8911 = var2;
      this.field8912 = var3;
      this.field8913 = var4;
      this.field8914 = var5;
      this.field8915 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field8911; var3 < this.field8912; var3++) {
         int var4 = 2 * var3;
         int var5 = this.field8913 + var3;
         this.field8914[var5] = Class9788.method38590(this.field8916)[var4] * this.field8915[var4]
            - Class9788.method38590(this.field8916)[var4 + 1] * this.field8915[var4 + 1];
      }
   }
}
