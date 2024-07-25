package remapped;

import java.util.List;

public class class_9564 implements class_6406 {
   private static String[] field_48680;
   private final class_3139 field_48678;
   private boolean field_48679;

   public class_9564(class_3139 var1) {
      this.field_48678 = var1;
   }

   @Override
   public class_5068 method_29236(class_7966 var1, class_9184 var2, long var3) {
      var2.method_42327().method_8577().method_35674(field_32696);
      class_3542.method_16404(1.0F, 1.0F, 1.0F);
      class_7750 var7 = this.field_48678.method_14511();
      var2.method_9781(var1, 0, 0, 0, 0, this.method_29239(), this.method_29238());
      if (var7 == null) {
         return class_5068.field_26190;
      } else {
         List var8 = var2.method_42327().textRenderer.method_45391(var7.method_35160(), 125);
         int var9 = var7.method_35157() != class_3361.field_16559 ? 16776960 : 16746751;
         if (var8.size() != 1) {
            short var10 = 1500;
            float var11 = 300.0F;
            if (var3 >= 1500L) {
               int var12 = class_9299.method_42848(class_9299.method_42828((float)(var3 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int var13 = this.method_29238() / 2 - var8.size() * 9 / 2;

               for (class_7107 var15 : var8) {
                  var2.method_42327().textRenderer.method_45382(var1, var15, 30.0F, (float)var13, 16777215 | var12);
                  var13 += 9;
               }
            } else {
               int var16 = class_9299.method_42848(class_9299.method_42828((float)(1500L - var3) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               var2.method_42327().textRenderer.method_45378(var1, var7.method_35157().method_15384(), 30.0F, 11.0F, var9 | var16);
            }
         } else {
            var2.method_42327().textRenderer.method_45378(var1, var7.method_35157().method_15384(), 30.0F, 7.0F, var9 | 0xFF000000);
            var2.method_42327().textRenderer.method_45382(var1, (class_7107)var8.get(0), 30.0F, 18.0F, -1);
         }

         if (!this.field_48679 && var3 > 0L) {
            this.field_48679 = true;
            if (var7.method_35157() == class_3361.field_16559) {
               var2.method_42327().method_8590().method_16345(class_4949.method_22676(class_463.field_2139, 1.0F, 1.0F));
            }
         }

         var2.method_42327().method_8511().method_40284(var7.method_35151(), 8, 8);
         return var3 < 5000L ? class_5068.field_26192 : class_5068.field_26190;
      }
   }
}
