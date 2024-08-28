package mapped;

public class Class943 extends Class944 implements Class942, Class935 {
   private static String[] field5317;
   public float field5318;
   public float field5319;
   public int field5320;
   private int field5321;

   public Class943() {
      super(Class4387.field21424);
   }

   @Override
   public void method3647() {
      if (++this.field5321 % 20 * 4 == 0) {
         this.field5324.method6787(this.field5325, Class8487.field36657, 1, this.field5320);
      }

      this.field5319 = this.field5318;
      int var3 = this.field5325.method8304();
      int var4 = this.field5325.getY();
      int var5 = this.field5325.method8306();
      float var6 = 0.1F;
      if (this.field5320 > 0 && this.field5318 == 0.0F) {
         double var7 = (double)var3 + 0.5;
         double var9 = (double)var5 + 0.5;
         this.field5324
            .method6743(
               (PlayerEntity)null,
               var7,
               (double)var4 + 0.5,
               var9,
               Class6067.field26535,
               Class2266.field14732,
               0.5F,
               this.field5324.field9016.nextFloat() * 0.1F + 0.9F
            );
      }

      if (this.field5320 == 0 && this.field5318 > 0.0F || this.field5320 > 0 && this.field5318 < 1.0F) {
         float var11 = this.field5318;
         if (this.field5320 <= 0) {
            this.field5318 -= 0.1F;
         } else {
            this.field5318 += 0.1F;
         }

         if (this.field5318 > 1.0F) {
            this.field5318 = 1.0F;
         }

         float var12 = 0.5F;
         if (this.field5318 < 0.5F && var11 >= 0.5F) {
            double var15 = (double)var3 + 0.5;
            double var13 = (double)var5 + 0.5;
            this.field5324
               .method6743(
                  (PlayerEntity)null,
                  var15,
                  (double)var4 + 0.5,
                  var13,
                  Class6067.field26534,
                  Class2266.field14732,
                  0.5F,
                  this.field5324.field9016.nextFloat() * 0.1F + 0.9F
               );
         }

         if (this.field5318 < 0.0F) {
            this.field5318 = 0.0F;
         }
      }
   }

   @Override
   public boolean method3751(int var1, int var2) {
      if (var1 != 1) {
         return super.method3751(var1, var2);
      } else {
         this.field5320 = var2;
         return true;
      }
   }

   @Override
   public void method3765() {
      this.method3780();
      super.method3765();
   }

   public void method3766() {
      this.field5320++;
      this.field5324.method6787(this.field5325, Class8487.field36657, 1, this.field5320);
   }

   public void method3767() {
      this.field5320--;
      this.field5324.method6787(this.field5325, Class8487.field36657, 1, this.field5320);
   }

   public boolean method3768(PlayerEntity var1) {
      return this.field5324.method6759(this.field5325) == this
         ? !(
            var1.method3276((double)this.field5325.method8304() + 0.5, (double)this.field5325.getY() + 0.5, (double)this.field5325.method8306() + 0.5)
               > 64.0
         )
         : false;
   }

   @Override
   public float method3762(float var1) {
      return Class9679.method37821(var1, this.field5319, this.field5318);
   }
}
