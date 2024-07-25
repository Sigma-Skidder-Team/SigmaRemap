package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1557 extends class_2451 {
   public class_1557(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      if (!var4.field_33055) {
         ItemStack var5 = var1.method_21867();
         class_1343 var6 = var1.method_21865();
         Direction var7 = var1.method_21857();
         class_8612 var8 = new class_8612(
            var4,
            var1.method_21868(),
            var6.field_7336 + (double)var7.method_1041() * 0.15,
            var6.field_7333 + (double)var7.method_1054() * 0.15,
            var6.field_7334 + (double)var7.method_1034() * 0.15,
            var5
         );
         var4.method_7509(var8);
         var5.method_27970(1);
      }

      return class_6910.method_31659(var4.field_33055);
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, class_704 var2, class_2584 var3) {
      if (!var2.method_26618()) {
         return class_954.<ItemStack>method_4207(var2.method_26617(var3));
      } else {
         ItemStack var6 = var2.method_26617(var3);
         if (!var1.field_33055) {
            var1.method_7509(new class_8612(var1, var6, var2));
            if (!var2.field_3876.field_4944) {
               var6.method_27970(1);
            }
         }

         return class_954.<ItemStack>method_4208(var2.method_26617(var3), var1.method_22567());
      }
   }

   @Override
   public void method_11218(ItemStack var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      class_5734 var7 = var1.method_28021("Fireworks");
      if (var7 != null) {
         if (var7.method_25939("Flight", 99)) {
            var3.add(
               new TranslationTextComponent("item.minecraft.firework_rocket.flight")
                  .appendString(" ")
                  .appendString(String.valueOf(var7.method_25950("Flight")))
                  .mergeStyle(TextFormatting.GRAY)
            );
         }

         class_3416 var8 = var7.method_25927("Explosions", 10);
         if (!var8.isEmpty()) {
            for (int var9 = 0; var9 < var8.size(); var9++) {
               class_5734 var10 = var8.method_15764(var9);
               ArrayList var11 = Lists.newArrayList();
               class_7004.method_32017(var10, var11);
               if (!var11.isEmpty()) {
                  for (int var12 = 1; var12 < var11.size(); var12++) {
                     var11.set(var12, new StringTextComponent("  ").append((ITextComponent)var11.get(var12)).mergeStyle(TextFormatting.GRAY));
                  }

                  var3.addAll(var11);
               }
            }
         }
      }
   }
}
