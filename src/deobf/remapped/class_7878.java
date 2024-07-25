package remapped;

import java.util.List;

public class class_7878 extends class_3599 {
   private static String[] field_40326;
   private int field_40325;

   private class_7878(class_449 var1) {
      this.field_40324 = var1;
   }

   @Override
   public boolean method_16795() {
      if (this.field_40325 > this.field_40324.field_41697) {
         return false;
      } else {
         List var3 = this.field_40324
            .field_41768
            .<class_91>method_25869(class_91.class, this.field_40324.method_37241().method_18899(8.0, 8.0, 8.0), class_449.field_1874);
         return !var3.isEmpty() || !this.field_40324.method_26520(class_6943.field_35707).method_28022();
      }
   }

   @Override
   public void method_16796() {
      List var3 = this.field_40324
         .field_41768
         .<class_91>method_25869(class_91.class, this.field_40324.method_37241().method_18899(8.0, 8.0, 8.0), class_449.field_1874);
      if (!var3.isEmpty()) {
         this.field_40324.method_26927().method_5616((class_8145)var3.get(0), 1.2F);
         this.field_40324.method_37155(class_463.field_2759, 1.0F, 1.0F);
      }

      this.field_40325 = 0;
   }

   @Override
   public void method_16793() {
      class_6098 var3 = this.field_40324.method_26520(class_6943.field_35707);
      if (!var3.method_28022()) {
         this.method_35635(var3);
         this.field_40324.method_37349(class_6943.field_35707, class_6098.field_31203);
         this.field_40325 = this.field_40324.field_41697 + class_449.method_2160(this.field_40324).nextInt(100);
      }
   }

   @Override
   public void method_16794() {
      List var3 = this.field_40324
         .field_41768
         .<class_91>method_25869(class_91.class, this.field_40324.method_37241().method_18899(8.0, 8.0, 8.0), class_449.field_1874);
      class_6098 var4 = this.field_40324.method_26520(class_6943.field_35707);
      if (var4.method_28022()) {
         if (!var3.isEmpty()) {
            this.field_40324.method_26927().method_5616((class_8145)var3.get(0), 1.2F);
         }
      } else {
         this.method_35635(var4);
         this.field_40324.method_37349(class_6943.field_35707, class_6098.field_31203);
      }
   }

   private void method_35635(class_6098 var1) {
      if (!var1.method_28022()) {
         double var4 = this.field_40324.method_37388() - 0.3F;
         class_91 var6 = new class_91(this.field_40324.field_41768, this.field_40324.method_37302(), var4, this.field_40324.method_37156(), var1);
         var6.method_254(40);
         var6.method_265(this.field_40324.method_37328());
         float var7 = 0.3F;
         float var8 = class_449.method_2158(this.field_40324).nextFloat() * (float) (Math.PI * 2);
         float var9 = 0.02F * class_449.method_2154(this.field_40324).nextFloat();
         var6.method_37214(
            (double)(
               0.3F
                     * -class_9299.method_42818(this.field_40324.field_41701 * (float) (Math.PI / 180.0))
                     * class_9299.method_42840(this.field_40324.field_41755 * (float) (Math.PI / 180.0))
                  + class_9299.method_42840(var8) * var9
            ),
            (double)(0.3F * class_9299.method_42818(this.field_40324.field_41755 * (float) (Math.PI / 180.0)) * 1.5F),
            (double)(
               0.3F
                     * class_9299.method_42840(this.field_40324.field_41701 * (float) (Math.PI / 180.0))
                     * class_9299.method_42840(this.field_40324.field_41755 * (float) (Math.PI / 180.0))
                  + class_9299.method_42818(var8) * var9
            )
         );
         this.field_40324.field_41768.method_7509(var6);
      }
   }
}
