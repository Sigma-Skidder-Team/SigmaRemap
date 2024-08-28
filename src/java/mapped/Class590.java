package mapped;

public class Class590 implements Runnable {
   private static String[] field2896;
   public final int field2897;
   public final int field2898;
   public final double[] field2899;
   public final boolean field2900;
   public final Class9330 field2901;

   public Class590(Class9330 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field2901 = var1;
      this.field2897 = var2;
      this.field2898 = var3;
      this.field2899 = var4;
      this.field2900 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2897; var3 < this.field2898; var3++) {
         Class9330.method35278(this.field2901).method38578(this.field2899, var3 * Class9330.method35277(this.field2901), this.field2900);
      }
   }
}
