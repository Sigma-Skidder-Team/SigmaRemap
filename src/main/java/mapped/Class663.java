package mapped;

public class Class663 implements Runnable {
   private static String[] field3337;
   public final int field3338;
   public final int field3339;
   public final int field3340;
   public final float[] field3341;
   public final int field3342;
   public final int field3343;
   public final Class8543 field3344;

   public Class663(Class8543 var1, int var2, int var3, int var4, float[] var5, int var6, int var7) {
      this.field3344 = var1;
      this.field3338 = var2;
      this.field3339 = var3;
      this.field3340 = var4;
      this.field3341 = var5;
      this.field3342 = var6;
      this.field3343 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field3338; var3 < this.field3339; var3++) {
         int var4 = var3 * this.field3340;
         int var5 = (Class8543.method30435(this.field3344) - var3) * this.field3340;
         int var6 = var4 + Class8543.method30438(this.field3344);
         this.field3341[var6] = this.field3341[var5 + 1];
         this.field3341[var6 + 1] = -this.field3341[var5];
      }

      for (int var9 = this.field3338; var9 < this.field3339; var9++) {
         int var11 = var9 * this.field3340;
         int var15 = (Class8543.method30435(this.field3344) - var9 + 1) * this.field3340;

         for (int var7 = Class8543.method30438(this.field3344) + 2; var7 < this.field3340; var7 += 2) {
            int var13 = var15 - var7;
            int var8 = var11 + var7;
            this.field3341[var8] = this.field3341[var13];
            this.field3341[var8 + 1] = -this.field3341[var13 + 1];
         }
      }

      for (int var10 = this.field3342; var10 < this.field3343; var10++) {
         int var16 = (Class8543.method30435(this.field3344) - var10) % Class8543.method30435(this.field3344) * this.field3340;
         int var18 = var10 * this.field3340;

         for (int var17 = 0; var17 < this.field3340; var17 += 2) {
            int var12 = var16 + (this.field3340 - var17) % this.field3340;
            int var14 = var18 + var17;
            this.field3341[var12] = this.field3341[var14];
            this.field3341[var12 + 1] = -this.field3341[var14 + 1];
         }
      }
   }
}
