package remapped;

public class class_2221 extends class_3599 {
   private static String[] field_11102;
   private final class_4206 field_11104;
   public int field_11103;

   public class_2221(class_4206 var1) {
      this.field_11104 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_11104.method_17809() != null;
   }

   @Override
   public void method_16796() {
      this.field_11103 = 0;
   }

   @Override
   public void method_16793() {
      this.field_11104.method_19573(false);
   }

   @Override
   public void method_16794() {
      class_5834 var3 = this.field_11104.method_17809();
      double var4 = 64.0;
      if (var3.method_37275(this.field_11104) < 4096.0 && this.field_11104.method_26420(var3)) {
         World var6 = this.field_11104.world;
         this.field_11103++;
         if (this.field_11103 == 10 && !this.field_11104.method_37378()) {
            var6.method_43365((class_704)null, 1015, this.field_11104.method_37075(), 0);
         }

         if (this.field_11103 == 20) {
            double var7 = 4.0;
            class_1343 var9 = this.field_11104.method_37307(1.0F);
            double var10 = var3.getPosX() - (this.field_11104.getPosX() + var9.field_7336 * 4.0);
            double var12 = var3.method_37080(0.5) - (0.5 + this.field_11104.method_37080(0.5));
            double var14 = var3.getPosZ() - (this.field_11104.getPosZ() + var9.field_7334 * 4.0);
            if (!this.field_11104.method_37378()) {
               var6.method_43365((class_704)null, 1016, this.field_11104.method_37075(), 0);
            }

            class_9053 var16 = new class_9053(var6, this.field_11104, var10, var12, var14);
            var16.field_46360 = this.field_11104.method_19570();
            var16.method_37256(
               this.field_11104.getPosX() + var9.field_7336 * 4.0, this.field_11104.method_37080(0.5) + 0.5, var16.getPosZ() + var9.field_7334 * 4.0
            );
            var6.method_7509(var16);
            this.field_11103 = -40;
         }
      } else if (this.field_11103 > 0) {
         this.field_11103--;
      }

      this.field_11104.method_19573(this.field_11103 > 10);
   }
}
