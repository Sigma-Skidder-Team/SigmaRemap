package mapped;

public class Class655 implements Runnable {
   private static String[] field3283;
   public final int field3284;
   public final int field3285;
   public final float[] field3286;
   public final boolean field3287;
   public final Class8682 field3288;

   public Class655(Class8682 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field3288 = var1;
      this.field3284 = var2;
      this.field3285 = var3;
      this.field3286 = var4;
      this.field3287 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3284; var3 < this.field3285; var3++) {
         Class8682.method31246(this.field3288).method28930(this.field3286, var3 * Class8682.method31245(this.field3288), this.field3287);
      }
   }
}
