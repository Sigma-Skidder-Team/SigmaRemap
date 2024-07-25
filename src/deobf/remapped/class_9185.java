package remapped;

import java.util.Random;

public class class_9185 extends class_8131 {
   private final String field_46997;
   private final class_6631 field_46996;
   private final boolean field_46995;

   public class_9185(class_5799 var1, String var2, class_1331 var3, class_6631 var4, boolean var5) {
      super(class_2746.field_13441, 0);
      this.field_46997 = var2;
      this.field_41648 = var3;
      this.field_46996 = var4;
      this.field_46995 = var5;
      this.method_42333(var1);
   }

   public class_9185(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13441, var2);
      this.field_46997 = var2.method_25965("Template");
      this.field_46996 = class_6631.valueOf(var2.method_25965("Rot"));
      this.field_46995 = var2.method_25933("OW");
      this.method_42333(var1);
   }

   private void method_42333(class_5799 var1) {
      class_6561 var4 = var1.method_26279(new Identifier("end_city/" + this.field_46997));
      class_8478 var5 = (!this.field_46995 ? class_8582.method_39478() : class_8582.method_39472()).method_39047().method_39053(this.field_46996);
      this.method_36998(var4, this.field_41648, var5);
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.method_25941("Template", this.field_46997);
      var1.method_25941("Rot", this.field_46996.name());
      var1.method_25934("OW", this.field_46995);
   }

   @Override
   public void method_36999(String var1, class_1331 var2, class_1556 var3, Random var4, class_9616 var5) {
      if (!var1.startsWith("Chest")) {
         if (!var1.startsWith("Sentry")) {
            if (var1.startsWith("Elytra")) {
               class_7451 var8 = new class_7451(var3.method_7066(), var2, this.field_46996.method_30489(Direction.field_800));
               var8.method_33906(new ItemStack(class_4897.field_24503), false);
               var3.method_7509(var8);
            }
         } else {
            class_6092 var9 = class_6629.field_34231.method_30484(var3.method_7066());
            var9.method_37256((double)var2.method_12173() + 0.5, (double)var2.method_12165() + 0.5, (double)var2.method_12185() + 0.5);
            var9.method_27917(var2);
            var3.method_7509(var9);
         }
      } else {
         class_1331 var10 = var2.method_6100();
         if (var5.method_44395(var10)) {
            class_2358.method_10817(var3, var4, var10, class_5931.field_30129);
         }
      }
   }
}
