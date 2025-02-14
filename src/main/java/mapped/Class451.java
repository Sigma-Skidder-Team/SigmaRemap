package mapped;

public class Class451 implements Runnable {
   private static String[] field2055;
   public final int field2056;
   public final int field2057;
   public final double[] field2058;
   public final boolean field2059;
   public final Class9330 field2060;

   public Class451(Class9330 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field2060 = var1;
      this.field2056 = var2;
      this.field2057 = var3;
      this.field2058 = var4;
      this.field2059 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class9330.method35279(this.field2060)];

      for (int var4 = this.field2056; var4 < this.field2057; var4++) {
         for (int var5 = 0; var5 < Class9330.method35279(this.field2060); var5++) {
            var3[var5] = this.field2058[var5 * Class9330.method35277(this.field2060) + var4];
         }

         Class9330.method35280(this.field2060).method38576(var3, this.field2059);

         for (int var6 = 0; var6 < Class9330.method35279(this.field2060); var6++) {
            this.field2058[var6 * Class9330.method35277(this.field2060) + var4] = var3[var6];
         }
      }
   }
}
