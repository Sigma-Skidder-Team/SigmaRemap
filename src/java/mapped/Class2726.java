package mapped;

public class Class2726 extends Class2595 {
   private static String[] field17230;
   private int field17231;
   public final Class1055 field17232;

   public Class2726(Class1055 var1) {
      this.field17232 = var1;
   }

   @Override
   public boolean method10803() {
      Class880 var3 = this.field17232.method3014();
      return this.field17232.method3250() && var3 != null ? this.field17232.method3277(var3) < 100.0 : false;
   }

   @Override
   public void method10804() {
      this.field17231 = 0;
   }

   @Override
   public void method10805() {
      this.field17231++;
      Class880 var3 = this.field17232.method3014();
      if (var3 != null) {
         Vector3d var4 = new Vector3d(
            this.field17232.getPosX() - var3.getPosX(),
            this.field17232.getPosY() - var3.getPosY(),
            this.field17232.getPosZ() - var3.getPosZ()
         );
         Class7380 var5 = this.field17232
            .field5024
            .method6738(
               new BlockPos(
                  this.field17232.getPosX() + var4.field18048,
                  this.field17232.getPosY() + var4.field18049,
                  this.field17232.getPosZ() + var4.field18050
               )
            );
         Class7379 var6 = this.field17232
            .field5024
            .method6739(
               new BlockPos(
                  this.field17232.getPosX() + var4.field18048,
                  this.field17232.getPosY() + var4.field18049,
                  this.field17232.getPosZ() + var4.field18050
               )
            );
         if (var6.method23486(Class8953.field40469) || var5.method23393()) {
            double var7 = var4.method11348();
            if (var7 > 0.0) {
               var4.method11333();
               float var9 = 3.0F;
               if (var7 > 5.0) {
                  var9 = (float)((double)var9 - (var7 - 5.0) / 5.0);
               }

               if (var9 > 0.0F) {
                  var4 = var4.method11344((double)var9);
               }
            }

            if (var5.method23393()) {
               var4 = var4.method11337(0.0, var4.field18049, 0.0);
            }

            this.field17232.method4840((float)var4.field18048 / 20.0F, (float)var4.field18049 / 20.0F, (float)var4.field18050 / 20.0F);
         }

         if (this.field17231 % 10 == 5) {
            this.field17232
               .field5024
               .method6746(Class7940.field34052, this.field17232.getPosX(), this.field17232.getPosY(), this.field17232.getPosZ(), 0.0, 0.0, 0.0);
         }
      }
   }
}
