package mapped;

public class Class9640 {
   private int field45071 = 20;
   private float field45072;
   private float field45073;
   private int field45074;
   private int field45075 = 20;

   public Class9640() {
      this.field45072 = 5.0F;
   }

   public void method37569(int var1, float var2) {
      this.field45071 = Math.min(var1 + this.field45071, 20);
      this.field45072 = Math.min(this.field45072 + (float)var1 * var2 * 2.0F, (float)this.field45071);
   }

   public void method37570(Class3257 var1, ItemStack var2) {
      if (var1.method11744()) {
         Class9427 var5 = var1.method11745();
         this.method37569(var5.method36157(), var5.method36158());
      }
   }

   public void method37571(PlayerEntity var1) {
      Class2197 var4 = var1.field5024.method6997();
      this.field45075 = this.field45071;
      if (this.field45073 > 4.0F) {
         this.field45073 -= 4.0F;
         if (!(this.field45072 > 0.0F)) {
            if (var4 != Class2197.field14351) {
               this.field45071 = Math.max(this.field45071 - 1, 0);
            }
         } else {
            this.field45072 = Math.max(this.field45072 - 1.0F, 0.0F);
         }
      }

      boolean var5 = var1.field5024.method6789().method17135(Class5462.field24231);
      if (var5 && this.field45072 > 0.0F && var1.method2934() && this.field45071 >= 20) {
         this.field45074++;
         if (this.field45074 >= 10) {
            float var6 = Math.min(this.field45072, 6.0F);
            var1.method3041(var6 / 6.0F);
            this.method37576(var6);
            this.field45074 = 0;
         }
      } else if (var5 && this.field45071 >= 18 && var1.method2934()) {
         this.field45074++;
         if (this.field45074 >= 80) {
            var1.method3041(1.0F);
            this.method37576(6.0F);
            this.field45074 = 0;
         }
      } else if (this.field45071 > 0) {
         this.field45074 = 0;
      } else {
         this.field45074++;
         if (this.field45074 >= 80) {
            if (var1.method3042() > 10.0F || var4 == Class2197.field14354 || var1.method3042() > 1.0F && var4 == Class2197.field14353) {
               var1.method2741(Class8654.field39000, 1.0F);
            }

            this.field45074 = 0;
         }
      }
   }

   public void method37572(Class39 var1) {
      if (var1.method119("foodLevel", 99)) {
         this.field45071 = var1.method122("foodLevel");
         this.field45074 = var1.method122("foodTickTimer");
         this.field45072 = var1.method124("foodSaturationLevel");
         this.field45073 = var1.method124("foodExhaustionLevel");
      }
   }

   public void method37573(Class39 var1) {
      var1.method102("foodLevel", this.field45071);
      var1.method102("foodTickTimer", this.field45074);
      var1.method107("foodSaturationLevel", this.field45072);
      var1.method107("foodExhaustionLevel", this.field45073);
   }

   public int method37574() {
      return this.field45071;
   }

   public boolean method37575() {
      return this.field45071 < 20;
   }

   public void method37576(float var1) {
      this.field45073 = Math.min(this.field45073 + var1, 40.0F);
   }

   public float method37577() {
      return this.field45072;
   }

   public void method37578(int var1) {
      this.field45071 = var1;
   }

   public void method37579(float var1) {
      this.field45072 = var1;
   }
}
