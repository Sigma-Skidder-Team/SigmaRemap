package mapped;

public class Class4741 extends Class4740 {
   private static String[] field22484;
   public int field22485;
   public int field22486;
   public float field22487;
   public float field22488;
   public float field22489;
   public int[] field22490 = new int[]{0};
   public float[] field22491 = new float[]{0.0F};
   public float[] field22492;
   public float[] field22493 = new float[]{0.0F};
   public float[] field22494 = new float[]{0.0F};

   public Class4741(int var1) {
      super(var1);
      this.field22492 = new float[3];
   }

   @Override
   public void method14883(Class2443 var1, Class7413 var2, Class8428 var3) {
      int var6 = this.method14888(var2);
      this.field22471 = var1.method10451(var6);
      this.field22485 = var1.method10451(var6);
      if (var3 != null) {
         var3.method29609(this.field22471, var6);
         var3.method29609(this.field22485, var6);
      }
   }

   @Override
   public void method14884(Class2443 var1, Class8428 var2) {
      if (this.field22471 != 0) {
         this.field22472 = var1.method10451(2);
         if (var2 != null) {
            var2.method29609(this.field22472, 2);
         }
      }

      if (this.field22485 != 0) {
         this.field22486 = var1.method10451(2);
         if (var2 != null) {
            var2.method29609(this.field22486, 2);
         }
      }
   }

   @Override
   public void method14885(Class2443 var1, Class7413 var2) {
      super.method14885(var1, var2);
      if (this.field22485 != 0) {
         switch (this.field22486) {
            case 0:
               this.field22487 = field22495[var1.method10451(6)];
               this.field22488 = field22495[var1.method10451(6)];
               this.field22489 = field22495[var1.method10451(6)];
               break;
            case 1:
               this.field22487 = this.field22488 = field22495[var1.method10451(6)];
               this.field22489 = field22495[var1.method10451(6)];
               break;
            case 2:
               this.field22487 = this.field22488 = this.field22489 = field22495[var1.method10451(6)];
               break;
            case 3:
               this.field22487 = field22495[var1.method10451(6)];
               this.field22488 = this.field22489 = field22495[var1.method10451(6)];
         }

         this.method14889(var2, this.field22485, 1, this.field22491, this.field22490, this.field22493, this.field22494);
      }
   }

   @Override
   public boolean method14886(Class2443 var1) {
      boolean var4 = super.method14886(var1);
      if (this.field22485 != 0) {
         if (this.field22477[1] == null) {
            this.field22492[0] = (float)((double)((float)var1.method10451(this.field22490[0]) * this.field22491[0]) - 1.0);
            this.field22492[1] = (float)((double)((float)var1.method10451(this.field22490[0]) * this.field22491[0]) - 1.0);
            this.field22492[2] = (float)((double)((float)var1.method10451(this.field22490[0]) * this.field22491[0]) - 1.0);
         } else {
            int var5 = var1.method10451(this.field22490[0]);
            var5 += var5 << 1;
            float[] var6 = this.field22492;
            float[] var7 = this.field22477[1];
            int var8 = 0;
            var6[var8] = var7[var5];
            int var9 = var5 + 1;
            var8++;
            var6[var8] = var7[var9];
            var9++;
            var8++;
            var6[var8] = var7[var9];
         }
      }

      return var4;
   }

   @Override
   public boolean method14887(int var1, Class7870 var2, Class7870 var3) {
      boolean var6 = super.method14887(var1, var2, var3);
      if (this.field22485 != 0 && var1 != 1) {
         float var7 = this.field22492[this.field22480 - 1];
         if (this.field22477[1] == null) {
            var7 = (var7 + this.field22494[0]) * this.field22493[0];
         }

         if (this.field22479 > 4) {
            if (this.field22479 > 8) {
               var7 *= this.field22489;
            } else {
               var7 *= this.field22488;
            }
         } else {
            var7 *= this.field22487;
         }

         if (var1 != 0) {
            var2.method26365(var7, this.field22470);
         } else {
            var3.method26365(var7, this.field22470);
         }
      }

      return var6;
   }
}
