package mapped;

import java.util.List;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3320 extends Class3257 {
   public Class3320(Class5643 var1) {
      super(var1);
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      Class39 var7 = var1.method32145("Explosion");
      if (var7 != null) {
         method11873(var7, var3);
      }
   }

   public static void method11873(Class39 var0, List<ITextComponent> var1) {
      Class2119 var4 = Class2119.method8802(var0.method120("Type"));
      var1.add(new TranslationTextComponent("item.minecraft.firework_star.shape." + var4.method8801()).mergeStyle(TextFormatting.GRAY));
      int[] var5 = var0.method128("Colors");
      if (var5.length > 0) {
         var1.add(method11874(new StringTextComponent("").mergeStyle(TextFormatting.GRAY), var5));
      }

      int[] var6 = var0.method128("FadeColors");
      if (var6.length > 0) {
         var1.add(method11874(new TranslationTextComponent("item.minecraft.firework_star.fade_to").appendString(" ").mergeStyle(TextFormatting.GRAY), var6));
      }

      if (var0.method132("Trail")) {
         var1.add(new TranslationTextComponent("item.minecraft.firework_star.trail").mergeStyle(TextFormatting.GRAY));
      }

      if (var0.method132("Flicker")) {
         var1.add(new TranslationTextComponent("item.minecraft.firework_star.flicker").mergeStyle(TextFormatting.GRAY));
      }
   }

   private static ITextComponent method11874(IFormattableTextComponent var0, int[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         if (var4 > 0) {
            var0.appendString(", ");
         }

         var0.append(method11875(var1[var4]));
      }

      return var0;
   }

   private static ITextComponent method11875(int var0) {
      Class112 var3 = Class112.method317(var0);
      return var3 != null
         ? new TranslationTextComponent("item.minecraft.firework_star." + var3.method310())
         : new TranslationTextComponent("item.minecraft.firework_star.custom_color");
   }
}
