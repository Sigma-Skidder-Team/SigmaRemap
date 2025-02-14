package mapped;

public class Class1481 implements Runnable {
   private static String[] field7974;
   public final int field7975;
   public final int field7976;
   public final float[] field7977;
   public final Class8630 field7978;

   public Class1481(Class8630 var1, int var2, int var3, float[] var4) {
      this.field7978 = var1;
      this.field7975 = var2;
      this.field7976 = var3;
      this.field7977 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field7975; var3 < this.field7976; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         float var6 = -this.field7977[var4] * Class8630.method31009(this.field7978)[var5] + this.field7977[var5] * Class8630.method31009(this.field7978)[var4];
         this.field7977[var4] = this.field7977[var4] * Class8630.method31009(this.field7978)[var4]
            + this.field7977[var5] * Class8630.method31009(this.field7978)[var5];
         this.field7977[var5] = var6;
      }
   }
}
