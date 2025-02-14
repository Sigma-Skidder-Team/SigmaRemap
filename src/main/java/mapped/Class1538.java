package mapped;

public class Class1538 implements Runnable {
   private static String[] field8344;
   public final int field8345;
   public final int field8346;
   public final int field8347;
   public final float[] field8348;
   public final Class8276 field8349;

   public Class1538(Class8276 var1, int var2, int var3, int var4, float[] var5) {
      this.field8349 = var1;
      this.field8345 = var2;
      this.field8346 = var3;
      this.field8347 = var4;
      this.field8348 = var5;
   }

   @Override
   public void run() {
      int var3 = this.field8345 + Class8276.method28932(this.field8349) - 1;

      for (int var4 = this.field8346; var4 < this.field8347; var4++) {
         int var5 = this.field8345 + var4;
         float var6 = this.field8348[var5];
         int var7 = var3 - var4;
         this.field8348[var5] = this.field8348[var7];
         this.field8348[var7] = var6;
      }
   }
}
