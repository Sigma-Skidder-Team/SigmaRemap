package mapped;

public class Class1515 implements Runnable {
   private static String[] field8195;
   public final int field8196;
   public final int field8197;
   public final float[] field8198;
   public final int field8199;
   public final float[] field8200;
   public final Class8174 field8201;

   public Class1515(Class8174 var1, int var2, int var3, float[] var4, int var5, float[] var6) {
      this.field8201 = var1;
      this.field8196 = var2;
      this.field8197 = var3;
      this.field8198 = var4;
      this.field8199 = var5;
      this.field8200 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field8196; var3 < this.field8197; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         this.field8198[this.field8199 + var3] = this.field8200[var4] - this.field8200[var5];
         this.field8198[this.field8199 + Class8174.method28463(this.field8201) - var3] = this.field8200[var4] + this.field8200[var5];
      }
   }
}
