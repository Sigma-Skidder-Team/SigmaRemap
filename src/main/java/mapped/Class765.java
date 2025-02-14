package mapped;

public class Class765 implements Runnable {
   private static String[] field3974;
   public final int field3975;
   public final int field3976;
   public final int field3977;
   public final int field3978;
   public final int field3979;
   public final float[] field3980;
   public final Class8026 field3981;

   public Class765(Class8026 var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      this.field3981 = var1;
      this.field3975 = var2;
      this.field3976 = var3;
      this.field3977 = var4;
      this.field3978 = var5;
      this.field3979 = var6;
      this.field3980 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field3975; var3 < this.field3976; var3++) {
         int var4 = (Class8026.method27518(this.field3981) - var3) % Class8026.method27518(this.field3981) * this.field3977;
         int var5 = var3 * this.field3977;

         for (int var6 = 1; var6 < this.field3978; var6++) {
            int var7 = var5 + (Class8026.method27513(this.field3981) - var6) * this.field3979;
            int var8 = var4 + var6 * this.field3979 + Class8026.method27516(this.field3981);
            int var9 = var7 + Class8026.method27516(this.field3981);
            int var10 = var7 + 1;
            this.field3980[var8] = this.field3980[var10];
            this.field3980[var9] = this.field3980[var10];
            this.field3980[var8 + 1] = -this.field3980[var7];
            this.field3980[var9 + 1] = this.field3980[var7];
         }
      }
   }
}
