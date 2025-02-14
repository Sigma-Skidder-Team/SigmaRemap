package mapped;

public class Class670 implements Runnable {
   private static String[] field3384;
   public final int field3385;
   public final int field3386;
   public final double[][] field3387;
   public final int field3388;
   public final int field3389;
   public final int field3390;
   public final Class9615 field3391;

   public Class670(Class9615 var1, int var2, int var3, double[][] var4, int var5, int var6, int var7) {
      this.field3391 = var1;
      this.field3385 = var2;
      this.field3386 = var3;
      this.field3387 = var4;
      this.field3388 = var5;
      this.field3389 = var6;
      this.field3390 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field3385; var3 < this.field3386; var3++) {
         int var4 = Class9615.method37424(this.field3391) - var3;
         this.field3387[var3][Class9615.method37427(this.field3391)] = this.field3387[var4][1];
         this.field3387[var3][Class9615.method37427(this.field3391) + 1] = -this.field3387[var4][0];
      }

      for (int var7 = this.field3385; var7 < this.field3386; var7++) {
         int var9 = Class9615.method37424(this.field3391) - var7;

         for (int var5 = Class9615.method37427(this.field3391) + 2; var5 < this.field3388; var5 += 2) {
            int var6 = this.field3388 - var5;
            this.field3387[var7][var5] = this.field3387[var9][var6];
            this.field3387[var7][var5 + 1] = -this.field3387[var9][var6 + 1];
         }
      }

      for (int var8 = this.field3389; var8 < this.field3390; var8++) {
         int var10 = (Class9615.method37424(this.field3391) - var8) % Class9615.method37424(this.field3391);

         for (int var11 = 0; var11 < this.field3388; var11 += 2) {
            int var12 = (this.field3388 - var11) % this.field3388;
            this.field3387[var10][var12] = this.field3387[var8][var11];
            this.field3387[var10][var12 + 1] = -this.field3387[var8][var11 + 1];
         }
      }
   }
}
