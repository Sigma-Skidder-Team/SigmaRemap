package mapped;

public class Class1472 implements Runnable {
   private static String[] field7918;
   public final int field7919;
   public final int field7920;
   public final int field7921;
   public final int field7922;
   public final float[] field7923;
   public final Class8630 field7924;

   public Class1472(Class8630 var1, int var2, int var3, int var4, int var5, float[] var6) {
      this.field7924 = var1;
      this.field7919 = var2;
      this.field7920 = var3;
      this.field7921 = var4;
      this.field7922 = var5;
      this.field7923 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field7919; var3 < this.field7920; var3++) {
         int var4 = 2 * var3;
         int var5 = this.field7921 + (this.field7922 - var4) % this.field7922;
         this.field7923[var5] = this.field7923[this.field7921 + var4];
         this.field7923[var5 + 1] = -this.field7923[this.field7921 + var4 + 1];
      }
   }
}
