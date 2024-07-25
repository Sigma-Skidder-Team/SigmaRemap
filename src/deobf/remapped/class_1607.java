package remapped;

public class class_1607 extends class_3599 {
   private static String[] field_8339;
   private int field_8340;

   private class_1607(class_6011 var1) {
      this.field_8338 = var1;
   }

   @Override
   public boolean method_16795() {
      class_5834 var3 = this.field_8338.method_26531();
      return this.field_8338.method_37285() && var3 != null ? this.field_8338.method_37275(var3) < 100.0 : false;
   }

   @Override
   public void method_16796() {
      this.field_8340 = 0;
   }

   @Override
   public void method_16794() {
      this.field_8340++;
      class_5834 var3 = this.field_8338.method_26531();
      if (var3 != null) {
         class_1343 var4 = new class_1343(
            this.field_8338.method_37302() - var3.method_37302(),
            this.field_8338.method_37309() - var3.method_37309(),
            this.field_8338.method_37156() - var3.method_37156()
         );
         class_2522 var5 = this.field_8338
            .field_41768
            .method_28262(
               new class_1331(
                  this.field_8338.method_37302() + var4.field_7336,
                  this.field_8338.method_37309() + var4.field_7333,
                  this.field_8338.method_37156() + var4.field_7334
               )
            );
         class_4774 var6 = this.field_8338
            .field_41768
            .method_28258(
               new class_1331(
                  this.field_8338.method_37302() + var4.field_7336,
                  this.field_8338.method_37309() + var4.field_7333,
                  this.field_8338.method_37156() + var4.field_7334
               )
            );
         if (var6.method_22007(class_6503.field_33094) || var5.method_8345()) {
            double var7 = var4.method_6217();
            if (var7 > 0.0) {
               var4.method_6213();
               float var9 = 3.0F;
               if (var7 > 5.0) {
                  var9 = (float)((double)var9 - (var7 - 5.0) / 5.0);
               }

               if (var9 > 0.0F) {
                  var4 = var4.method_6209((double)var9);
               }
            }

            if (var5.method_8345()) {
               var4 = var4.method_6193(0.0, var4.field_7333, 0.0);
            }

            this.field_8338.method_27444((float)var4.field_7336 / 20.0F, (float)var4.field_7333 / 20.0F, (float)var4.field_7334 / 20.0F);
         }

         if (this.field_8340 % 10 == 5) {
            this.field_8338
               .field_41768
               .method_43361(
                  class_3090.field_15340, this.field_8338.method_37302(), this.field_8338.method_37309(), this.field_8338.method_37156(), 0.0, 0.0, 0.0
               );
         }
      }
   }
}
