package mapped;

public class Class6829 {
   private static String[] field29706;
   public final Class1006 field29707;
   public double field29708;
   public double field29709;
   public double field29710;
   public double field29711;
   public float field29712;
   public float field29713;
   public Class2335 field29714 = Class2335.field15966;

   public Class6829(Class1006 var1) {
      this.field29707 = var1;
   }

   public boolean method20811() {
      return this.field29714 == Class2335.field15967;
   }

   public double method20812() {
      return this.field29711;
   }

   public void method20813(double var1, double var3, double var5, double var7) {
      this.field29708 = var1;
      this.field29709 = var3;
      this.field29710 = var5;
      this.field29711 = var7;
      if (this.field29714 != Class2335.field15969) {
         this.field29714 = Class2335.field15967;
      }
   }

   public void method20814(float var1, float var2) {
      this.field29714 = Class2335.field15968;
      this.field29712 = var1;
      this.field29713 = var2;
      this.field29711 = 0.25;
   }

   public void method20810() {
      if (this.field29714 != Class2335.field15968) {
         if (this.field29714 != Class2335.field15967) {
            if (this.field29714 != Class2335.field15969) {
               this.field29707.method4243(0.0F);
            } else {
               this.field29707.method3113((float)(this.field29711 * this.field29707.method3086(Class9173.field42108)));
               if (this.field29707.method3226()) {
                  this.field29714 = Class2335.field15966;
               }
            }
         } else {
            this.field29714 = Class2335.field15966;
            double var12 = this.field29708 - this.field29707.getPosX();
            double var14 = this.field29710 - this.field29707.getPosZ();
            double var16 = this.field29709 - this.field29707.getPosY();
            double var18 = var12 * var12 + var16 * var16 + var14 * var14;
            if (var18 < 2.5000003E-7F) {
               this.field29707.method4243(0.0F);
               return;
            }

            float var11 = (float)(Class9679.method37814(var14, var12) * 180.0F / (float)Math.PI) - 90.0F;
            this.field29707.field5031 = this.method20816(this.field29707.field5031, var11, 90.0F);
            this.field29707.method3113((float)(this.field29711 * this.field29707.method3086(Class9173.field42108)));
            BlockPos var20 = this.field29707.method3432();
            Class7380 var21 = this.field29707.field5024.method6738(var20);
            Class3209 var22 = var21.method23383();
            Class6408 var23 = var21.method23414(this.field29707.field5024, var20);
            if (var16 > (double)this.field29707.field5051 && var12 * var12 + var14 * var14 < (double)Math.max(1.0F, this.field29707.method3429())
               || !var23.method19516()
                  && this.field29707.getPosY() < var23.method19513(Class113.field414) + (double)var20.getY()
                  && !var22.method11540(Class7645.field32748)
                  && !var22.method11540(Class7645.field32771)) {
               this.field29707.method4229().method27049();
               this.field29714 = Class2335.field15969;
            }
         }
      } else {
         float var3 = (float)this.field29707.method3086(Class9173.field42108);
         float var4 = (float)this.field29711 * var3;
         float var5 = this.field29712;
         float var6 = this.field29713;
         float var7 = Class9679.method37765(var5 * var5 + var6 * var6);
         if (var7 < 1.0F) {
            var7 = 1.0F;
         }

         var7 = var4 / var7;
         var5 *= var7;
         var6 *= var7;
         float var8 = Class9679.method37763(this.field29707.field5031 * (float) (Math.PI / 180.0));
         float var9 = Class9679.method37764(this.field29707.field5031 * (float) (Math.PI / 180.0));
         float var10 = var5 * var9 - var6 * var8;
         float var27 = var6 * var9 + var5 * var8;
         if (!this.method20815(var10, var27)) {
            this.field29712 = 1.0F;
            this.field29713 = 0.0F;
         }

         this.field29707.method3113(var4);
         this.field29707.method4243(this.field29712);
         this.field29707.method4245(this.field29713);
         this.field29714 = Class2335.field15966;
      }
   }

   private boolean method20815(float var1, float var2) {
      Class6990 var5 = this.field29707.method4230();
      if (var5 != null) {
         Class6764 var6 = var5.method21673();
         if (var6 != null
            && var6.method20621(
                  this.field29707.field5024,
                  Class9679.method37769(this.field29707.getPosX() + (double)var1),
                  Class9679.method37769(this.field29707.getPosY()),
                  Class9679.method37769(this.field29707.getPosZ() + (double)var2)
               )
               != Class2163.field14186) {
            return false;
         }
      }

      return true;
   }

   public float method20816(float var1, float var2, float var3) {
      float var6 = Class9679.method37792(var2 - var1);
      if (var6 > var3) {
         var6 = var3;
      }

      if (var6 < -var3) {
         var6 = -var3;
      }

      float var7 = var1 + var6;
      if (!(var7 < 0.0F)) {
         if (var7 > 360.0F) {
            var7 -= 360.0F;
         }
      } else {
         var7 += 360.0F;
      }

      return var7;
   }

   public double method20817() {
      return this.field29708;
   }

   public double method20818() {
      return this.field29709;
   }

   public double method20819() {
      return this.field29710;
   }
}
