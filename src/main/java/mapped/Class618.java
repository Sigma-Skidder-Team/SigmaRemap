package mapped;

public class Class618 implements Runnable {
   private static String[] field3070;
   public final int field3071;
   public final int field3072;
   public final float[] field3073;
   public final boolean field3074;
   public final Class8026 field3075;

   public Class618(Class8026 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field3075 = var1;
      this.field3071 = var2;
      this.field3072 = var3;
      this.field3073 = var4;
      this.field3074 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27518(this.field3075)];

      for (int var4 = this.field3071; var4 < this.field3072; var4++) {
         int var5 = var4 * Class8026.method27514(this.field3075);

         for (int var6 = 0; var6 < Class8026.method27516(this.field3075); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class8026.method27518(this.field3075); var8++) {
               int var9 = var8 * Class8026.method27512(this.field3075) + var5 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field3073[var9];
               var3[var10 + 1] = this.field3073[var9 + 1];
            }

            Class8026.method27519(this.field3075).method30933(var3, this.field3074);

            for (int var11 = 0; var11 < Class8026.method27518(this.field3075); var11++) {
               int var12 = var11 * Class8026.method27512(this.field3075) + var5 + var7;
               int var13 = 2 * var11;
               this.field3073[var12] = var3[var13];
               this.field3073[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
