package mapped;

public class Class787 implements Runnable {
   private static String[] field4119;
   public final int field4120;
   public final int field4121;
   public final float[] field4122;
   public final boolean field4123;
   public final Class8682 field4124;

   public Class787(Class8682 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field4124 = var1;
      this.field4120 = var2;
      this.field4121 = var3;
      this.field4122 = var4;
      this.field4123 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field4120; var3 < this.field4121; var3++) {
         Class8682.method31246(this.field4124).method28926(this.field4122, var3 * Class8682.method31245(this.field4124), this.field4123);
      }
   }
}
