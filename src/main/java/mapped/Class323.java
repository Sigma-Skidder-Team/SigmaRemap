package mapped;

public class Class323 implements Runnable {
   private static String[] field1389;
   public final int field1390;
   public final int field1391;
   public final int field1392;
   public final float[] field1393;
   public final boolean field1394;
   public final Class8543 field1395;

   public Class323(Class8543 var1, int var2, int var3, int var4, float[] var5, boolean var6) {
      this.field1395 = var1;
      this.field1390 = var2;
      this.field1391 = var3;
      this.field1392 = var4;
      this.field1393 = var5;
      this.field1394 = var6;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8543.method30435(this.field1395)];

      for (int var4 = this.field1390; var4 < this.field1391; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < Class8543.method30435(this.field1395); var6++) {
            int var7 = 2 * var6;
            int var8 = var6 * this.field1392 + var5;
            var3[var7] = this.field1393[var8];
            var3[var7 + 1] = this.field1393[var8 + 1];
         }

         Class8543.method30436(this.field1395).method30933(var3, this.field1394);

         for (int var9 = 0; var9 < Class8543.method30435(this.field1395); var9++) {
            int var10 = 2 * var9;
            int var11 = var9 * this.field1392 + var5;
            this.field1393[var11] = var3[var10];
            this.field1393[var11 + 1] = var3[var10 + 1];
         }
      }
   }
}
