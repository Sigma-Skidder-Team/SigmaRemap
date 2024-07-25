package remapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9541 {
   private static final IFormattableTextComponent field_48544 = new TranslationTextComponent("effect.none").mergeStyle(TextFormatting.GRAY);

   public static List<class_2250> method_43993(ItemStack var0) {
      return method_43991(var0.method_27990());
   }

   public static List<class_2250> method_43994(class_6004 var0, Collection<class_2250> var1) {
      ArrayList var4 = Lists.newArrayList();
      var4.addAll(var0.method_27404());
      var4.addAll(var1);
      return var4;
   }

   public static List<class_2250> method_43991(CompoundNBT var0) {
      ArrayList var3 = Lists.newArrayList();
      var3.addAll(method_43989(var0).method_27404());
      method_43986(var0, var3);
      return var3;
   }

   public static List<class_2250> method_43995(ItemStack var0) {
      return method_43998(var0.method_27990());
   }

   public static List<class_2250> method_43998(CompoundNBT var0) {
      ArrayList var3 = Lists.newArrayList();
      method_43986(var0, var3);
      return var3;
   }

   public static void method_43986(CompoundNBT var0, List<class_2250> var1) {
      if (var0 != null && var0.contains("CustomPotionEffects", 9)) {
         class_3416 var4 = var0.method_25927("CustomPotionEffects", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            CompoundNBT var6 = var4.method_15764(var5);
            class_2250 var7 = class_2250.method_10343(var6);
            if (var7 != null) {
               var1.add(var7);
            }
         }
      }
   }

   public static int method_43987(ItemStack var0) {
      CompoundNBT var3 = var0.method_27990();
      if (var3 != null && var3.contains("CustomPotionColor", 99)) {
         return var3.method_25947("CustomPotionColor");
      } else {
         return method_43990(var0) != class_3697.field_18134 ? method_43997(method_43993(var0)) : 16253176;
      }
   }

   public static int method_44000(class_6004 var0) {
      return var0 != class_3697.field_18134 ? method_43997(var0.method_27404()) : 16253176;
   }

   public static int method_43997(Collection<class_2250> var0) {
      int var3 = 3694022;
      if (!var0.isEmpty()) {
         float var4 = 0.0F;
         float var5 = 0.0F;
         float var6 = 0.0F;
         int var7 = 0;

         for (class_2250 var9 : var0) {
            if (var9.method_10336()) {
               int var10 = var9.method_10339().method_6544();
               if (Config.method_14438()) {
                  var10 = class_9300.method_42888(var9.method_10339(), var10);
               }

               int var11 = var9.method_10333() + 1;
               var4 += (float)(var11 * (var10 >> 16 & 0xFF)) / 255.0F;
               var5 += (float)(var11 * (var10 >> 8 & 0xFF)) / 255.0F;
               var6 += (float)(var11 * (var10 >> 0 & 0xFF)) / 255.0F;
               var7 += var11;
            }
         }

         if (var7 != 0) {
            var4 = var4 / (float)var7 * 255.0F;
            var5 = var5 / (float)var7 * 255.0F;
            var6 = var6 / (float)var7 * 255.0F;
            return (int)var4 << 16 | (int)var5 << 8 | (int)var6;
         } else {
            return 0;
         }
      } else {
         return !Config.method_14438() ? 3694022 : class_9300.method_42888((class_1425)null, var3);
      }
   }

   public static class_6004 method_43990(ItemStack var0) {
      return method_43989(var0.method_27990());
   }

   public static class_6004 method_43989(CompoundNBT var0) {
      return var0 != null ? class_6004.method_27403(var0.method_25965("Potion")) : class_3697.field_18134;
   }

   public static ItemStack method_43999(ItemStack var0, class_6004 var1) {
      Identifier var4 = class_8669.field_44365.method_39797(var1);
      if (var1 != class_3697.field_18134) {
         var0.method_27994().method_25941("Potion", var4.toString());
      } else {
         var0.method_27976("Potion");
      }

      return var0;
   }

   public static ItemStack method_43992(ItemStack var0, Collection<class_2250> var1) {
      if (var1.isEmpty()) {
         return var0;
      } else {
         CompoundNBT var4 = var0.method_27994();
         class_3416 var5 = var4.method_25927("CustomPotionEffects", 9);

         for (class_2250 var7 : var1) {
            var5.add(var7.method_10345(new CompoundNBT()));
         }

         var4.put("CustomPotionEffects", var5);
         return var0;
      }
   }

   public static void method_43988(ItemStack var0, List<ITextComponent> var1, float var2) {
      List var5 = method_43993(var0);
      ArrayList var6 = Lists.newArrayList();
      if (!var5.isEmpty()) {
         for (class_2250 var8 : var5) {
            TranslationTextComponent var9 = new TranslationTextComponent(var8.method_10340());
            class_1425 var10 = var8.method_10339();
            Map var11 = var10.method_6546();
            if (!var11.isEmpty()) {
               for (Entry var13 : var11.entrySet()) {
                  class_9343 var14 = (class_9343)var13.getValue();
                  class_9343 var15 = new class_9343(var14.method_43125(), var10.method_6547(var8.method_10333(), var14), var14.method_43121());
                  var6.add(new Pair(var13.getKey(), var15));
               }
            }

            if (var8.method_10333() > 0) {
               var9 = new TranslationTextComponent("potion.withAmplifier", var9, new TranslationTextComponent("potion.potency." + var8.method_10333()));
            }

            if (var8.method_10347() > 20) {
               var9 = new TranslationTextComponent("potion.withDuration", var9, class_1493.method_6889(var8, var2));
            }

            var1.add(var9.mergeStyle(var10.method_6550().method_35424()));
         }
      } else {
         var1.add(field_48544);
      }

      if (!var6.isEmpty()) {
         var1.add(StringTextComponent.EMPTY);
         var1.add(new TranslationTextComponent("potion.whenDrank").mergeStyle(TextFormatting.DARK_PURPLE));

         for (Pair var21 : var6) {
            class_9343 var22 = (class_9343)var21.getSecond();
            double var16 = var22.method_43123();
            double var18;
            if (var22.method_43121() != class_9342.field_47678 && var22.method_43121() != class_9342.field_47677) {
               var18 = var22.method_43123();
            } else {
               var18 = var22.method_43123() * 100.0;
            }

            if (!(var16 > 0.0)) {
               if (var16 < 0.0) {
                  var18 *= -1.0;
                  var1.add(
                     new TranslationTextComponent(
                           "attribute.modifier.take." + var22.method_43121().method_43115(),
                           ItemStack.field_31202.format(var18),
                           new TranslationTextComponent(((class_225)var21.getFirst()).method_952())
                        )
                        .mergeStyle(TextFormatting.RED)
                  );
               }
            } else {
               var1.add(
                  new TranslationTextComponent(
                        "attribute.modifier.plus." + var22.method_43121().method_43115(),
                        ItemStack.field_31202.format(var18),
                        new TranslationTextComponent(((class_225)var21.getFirst()).method_952())
                     )
                     .mergeStyle(TextFormatting.BLUE)
               );
            }
         }
      }
   }
}
