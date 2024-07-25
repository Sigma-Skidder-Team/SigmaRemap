package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6615 extends class_6201 {
   public class_6615(class_6414 var1, class_317 var2) {
      super(var1, var2);
   }

   @Nullable
   @Override
   public class_353 method_28395(class_353 var1) {
      BlockPos var4 = var1.method_21858();
      World var5 = var1.method_21862();
      class_2522 var6 = var5.method_28262(var4);
      class_6414 var7 = this.method_28392();
      if (!var6.method_8350(var7)) {
         return class_4372.method_20372(var5, var4) != 7 ? var1 : null;
      } else {
         Direction var8;
         if (!var1.method_21859()) {
            var8 = var1.method_21857() != Direction.field_817 ? Direction.field_817 : var1.method_21863();
         } else {
            var8 = !var1.method_21866() ? var1.method_21857() : var1.method_21857().method_1046();
         }

         int var9 = 0;
         class_2921 var10 = var4.method_6089().method_13368(var8);

         while (var9 < 7) {
            if (!var5.field_33055 && !World.method_29586(var10)) {
               PlayerEntity var11 = var1.method_21868();
               int var12 = var5.method_28261();
               if (var11 instanceof class_9359 && var10.method_12165() >= var12) {
                  class_5182 var13 = new class_5182(
                     new TranslationTextComponent("build.tooHigh", var12).mergeStyle(TextFormatting.RED), ChatType.GAME_INFO, Util.NIL_UUID
                  );
                  ((class_9359)var11).field_47794.method_4156(var13);
               }
               break;
            }

            var6 = var5.method_28262(var10);
            if (!var6.method_8350(this.method_28392())) {
               if (var6.method_8374(var1)) {
                  return class_353.method_1784(var1, var10, var8);
               }
               break;
            }

            var10.method_13368(var8);
            if (var8.method_1029().method_42629()) {
               var9++;
            }
         }

         return null;
      }
   }

   @Override
   public boolean method_28390() {
      return false;
   }
}
