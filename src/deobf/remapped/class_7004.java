package remapped;

import java.util.List;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7004 extends class_2451 {
   public class_7004(class_317 var1) {
      super(var1);
   }

   @Override
   public void method_11218(class_6098 var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      class_5734 var7 = var1.method_28021("Explosion");
      if (var7 != null) {
         method_32017(var7, var3);
      }
   }

   public static void method_32017(class_5734 var0, List<ITextComponent> var1) {
      class_3917 var4 = class_3917.method_18129(var0.method_25950("Type"));
      var1.add(new TranslationTextComponent("item.minecraft.firework_star.shape." + var4.method_18130()).mergeStyle(TextFormatting.GRAY));
      int[] var5 = var0.method_25922("Colors");
      if (var5.length > 0) {
         var1.add(method_32016(new StringTextComponent("").mergeStyle(TextFormatting.GRAY), var5));
      }

      int[] var6 = var0.method_25922("FadeColors");
      if (var6.length > 0) {
         var1.add(method_32016(new TranslationTextComponent("item.minecraft.firework_star.fade_to").appendString(" ").mergeStyle(TextFormatting.GRAY), var6));
      }

      if (var0.method_25933("Trail")) {
         var1.add(new TranslationTextComponent("item.minecraft.firework_star.trail").mergeStyle(TextFormatting.GRAY));
      }

      if (var0.method_25933("Flicker")) {
         var1.add(new TranslationTextComponent("item.minecraft.firework_star.flicker").mergeStyle(TextFormatting.GRAY));
      }
   }

   private static ITextComponent method_32016(IFormattableTextComponent var0, int[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         if (var4 > 0) {
            var0.appendString(", ");
         }

         var0.append(method_32018(var1[var4]));
      }

      return var0;
   }

   private static ITextComponent method_32018(int var0) {
      class_9077 var3 = class_9077.method_41790(var0);
      return var3 != null
         ? new TranslationTextComponent("item.minecraft.firework_star." + var3.method_41796())
         : new TranslationTextComponent("item.minecraft.firework_star.custom_color");
   }
}
