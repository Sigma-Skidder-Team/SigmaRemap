package mapped;

public class Class608 implements Runnable {
   private static String[] field3006;
   public final int field3007;
   public final int field3008;
   public final int field3009;
   public final float[][] field3010;
   public final Class8543 field3011;

   public Class608(Class8543 var1, int var2, int var3, int var4, float[][] var5) {
      this.field3011 = var1;
      this.field3007 = var2;
      this.field3008 = var3;
      this.field3009 = var4;
      this.field3010 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3007; var3 < this.field3008; var3++) {
         int var4 = Class8543.method30435(this.field3011) - var3;

         for (int var5 = this.field3009; var5 < Class8543.method30438(this.field3011); var5++) {
            int var6 = 2 * var5;
            int var7 = 2 * (Class8543.method30438(this.field3011) - var5);
            this.field3010[0][var6] = this.field3010[0][var7];
            this.field3010[0][var6 + 1] = -this.field3010[0][var7 + 1];
            this.field3010[var3][var6] = this.field3010[var4][var7];
            this.field3010[var3][var6 + 1] = -this.field3010[var4][var7 + 1];
         }
      }
   }
}
