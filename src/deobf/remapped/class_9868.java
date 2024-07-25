package remapped;

import java.util.EnumSet;

public class class_9868 extends class_3599 {
   private static String[] field_49921;
   private final class_337 field_49920;
   private int field_49919;
   private final boolean field_49918;

   public class_9868(class_337 var1) {
      this.field_49920 = var1;
      this.field_49918 = var1 instanceof class_4965;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
   }

   @Override
   public boolean method_16795() {
      class_5834 var3 = this.field_49920.method_17809();
      return var3 != null && var3.method_37330();
   }

   @Override
   public boolean method_16799() {
      return super.method_16799() && (this.field_49918 || this.field_49920.method_37275(this.field_49920.method_17809()) > 9.0);
   }

   @Override
   public void method_16796() {
      this.field_49919 = -10;
      this.field_49920.method_26927().method_5620();
      this.field_49920.method_26865().method_17240(this.field_49920.method_17809(), 90.0F, 90.0F);
      this.field_49920.field_41763 = true;
   }

   @Override
   public void method_16793() {
      class_337.method_1550(this.field_49920, 0);
      this.field_49920.method_26860((class_5834)null);
      this.field_49920.field_1260.method_38234();
   }

   @Override
   public void method_16794() {
      class_5834 var3 = this.field_49920.method_17809();
      this.field_49920.method_26927().method_5620();
      this.field_49920.method_26865().method_17240(var3, 90.0F, 90.0F);
      if (this.field_49920.method_26420(var3)) {
         this.field_49919++;
         if (this.field_49919 != 0) {
            if (this.field_49919 >= this.field_49920.method_1548()) {
               float var4 = 1.0F;
               if (this.field_49920.field_41768.method_43370() == class_423.field_1782) {
                  var4 += 2.0F;
               }

               if (this.field_49918) {
                  var4 += 2.0F;
               }

               var3.method_37181(class_6199.method_28369(this.field_49920, this.field_49920), var4);
               var3.method_37181(class_6199.method_28345(this.field_49920), (float)this.field_49920.method_26575(class_7331.field_37462));
               this.field_49920.method_26860((class_5834)null);
            }
         } else {
            class_337.method_1550(this.field_49920, this.field_49920.method_17809().method_37145());
            if (!this.field_49920.method_37378()) {
               this.field_49920.field_41768.method_29587(this.field_49920, (byte)21);
            }
         }

         super.method_16794();
      } else {
         this.field_49920.method_26860((class_5834)null);
      }
   }
}
