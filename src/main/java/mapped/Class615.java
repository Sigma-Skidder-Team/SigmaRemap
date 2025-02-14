package mapped;

public class Class615 implements Runnable {
   private static String[] field3053;
   public final int field3054;
   public final int field3055;
   public final double[] field3056;
   public final boolean field3057;
   public final Class3612 field3058;

   public Class615(Class3612 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field3058 = var1;
      this.field3054 = var2;
      this.field3055 = var3;
      this.field3056 = var4;
      this.field3057 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3054; var3 < this.field3055; var3++) {
         int var4 = var3 * Class3612.method12220(this.field3058);

         for (int var5 = 0; var5 < Class3612.method12221(this.field3058); var5++) {
            Class3612.method12223(this.field3058).method33658(this.field3056, var4 + var5 * Class3612.method12222(this.field3058), this.field3057);
         }
      }
   }
}
