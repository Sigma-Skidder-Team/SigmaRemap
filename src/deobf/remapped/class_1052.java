package remapped;

import java.util.EnumSet;

public class class_1052 extends class_3599 {
   private static String[] field_5777;
   private final class_4040 field_5778;
   private final float field_5775;
   public final class_4931 field_5779;

   public class_1052(class_4040 var1, class_7637 var2, float var3) {
      this.field_5776 = var1;
      this.field_5779 = new class_4931().method_22607(8.0).method_22609().method_22603().method_22601().method_22602().method_22608();
      this.field_5778 = var2;
      this.field_5775 = var3 * var3;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
   }

   @Override
   public boolean method_16795() {
      class_5834 var3 = this.field_5778.method_26531();
      return this.field_5778.method_18589() == null
         && this.field_5778.method_21352()
         && this.field_5778.method_17809() != null
         && !this.field_5778.method_26892()
         && (var3 == null || var3.method_37387() != class_6629.field_34300);
   }

   @Override
   public void method_16796() {
      super.method_16796();
      this.field_5778.method_26927().method_5620();

      for (class_4040 var4 : this.field_5778
         .field_41768
         .<class_4040>method_25863(class_4040.class, this.field_5779, this.field_5778, this.field_5778.method_37241().method_18899(8.0, 8.0, 8.0))) {
         var4.method_26860(this.field_5778.method_17809());
      }
   }

   @Override
   public void method_16793() {
      super.method_16793();
      class_5834 var3 = this.field_5778.method_17809();
      if (var3 != null) {
         for (class_4040 var5 : this.field_5778
            .field_41768
            .<class_4040>method_25863(class_4040.class, this.field_5779, this.field_5778, this.field_5778.method_37241().method_18899(8.0, 8.0, 8.0))) {
            var5.method_26860(var3);
            var5.method_26891(true);
         }

         this.field_5778.method_26891(true);
      }
   }

   @Override
   public void method_16794() {
      class_5834 var3 = this.field_5778.method_17809();
      if (var3 != null) {
         if (!(this.field_5778.method_37275(var3) > (double)this.field_5775)) {
            this.field_5778.method_26891(true);
         } else {
            this.field_5778.method_26865().method_17240(var3, 30.0F, 30.0F);
            if (class_4040.method_18598(this.field_5778).nextInt(50) == 0) {
               this.field_5778.method_26853();
            }
         }

         super.method_16794();
      }
   }
}