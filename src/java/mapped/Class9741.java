package mapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.optifine.Config;

public class Class9741 {
   private static final IFormattableTextComponent field45485 = new TranslationTextComponent("effect.none").mergeStyle(TextFormatting.GRAY);

   public static List<EffectInstance> method38176(ItemStack var0) {
      return method38178(var0.method32142());
   }

   public static List<EffectInstance> method38177(Class8812 var0, Collection<EffectInstance> var1) {
      ArrayList var4 = Lists.newArrayList();
      var4.addAll(var0.method31816());
      var4.addAll(var1);
      return var4;
   }

   public static List<EffectInstance> method38178(CompoundNBT var0) {
      ArrayList var3 = Lists.newArrayList();
      var3.addAll(method38186(var0).method31816());
      method38181(var0, var3);
      return var3;
   }

   public static List<EffectInstance> method38179(ItemStack var0) {
      return method38180(var0.method32142());
   }

   public static List<EffectInstance> method38180(CompoundNBT var0) {
      ArrayList var3 = Lists.newArrayList();
      method38181(var0, var3);
      return var3;
   }

   public static void method38181(CompoundNBT var0, List<EffectInstance> var1) {
      if (var0 != null && var0.contains("CustomPotionEffects", 9)) {
         ListNBT var4 = var0.method131("CustomPotionEffects", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            CompoundNBT var6 = var4.method153(var5);
            EffectInstance var7 = EffectInstance.method8639(var6);
            if (var7 != null) {
               var1.add(var7);
            }
         }
      }
   }

   public static int method38182(ItemStack var0) {
      CompoundNBT var3 = var0.method32142();
      if (var3 != null && var3.contains("CustomPotionColor", 99)) {
         return var3.getInt("CustomPotionColor");
      } else {
         return method38185(var0) != Class8137.field34976 ? method38184(method38176(var0)) : 16253176;
      }
   }

   public static int method38183(Class8812 var0) {
      return var0 != Class8137.field34976 ? method38184(var0.method31816()) : 16253176;
   }

   public static int method38184(Collection<EffectInstance> var0) {
      int var3 = 3694022;
      if (!var0.isEmpty()) {
         float var4 = 0.0F;
         float var5 = 0.0F;
         float var6 = 0.0F;
         int var7 = 0;

         for (EffectInstance var9 : var0) {
            if (var9.method8631()) {
               int var10 = var9.getPotion().getLiquidColor();
               if (Config.method26911()) {
                  var10 = Class9680.method37891(var9.getPotion(), var10);
               }

               int var11 = var9.method8629() + 1;
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
         return !Config.method26911() ? 3694022 : Class9680.method37891((Effect)null, var3);
      }
   }

   public static Class8812 method38185(ItemStack var0) {
      return method38186(var0.method32142());
   }

   public static Class8812 method38186(CompoundNBT var0) {
      return var0 != null ? Class8812.method31814(var0.getString("Potion")) : Class8137.field34976;
   }

   public static ItemStack method38187(ItemStack var0, Class8812 var1) {
      ResourceLocation var4 = Registry.field16076.getKey(var1);
      if (var1 != Class8137.field34976) {
         var0.getOrCreateTag().method109("Potion", var4.toString());
      } else {
         var0.method32146("Potion");
      }

      return var0;
   }

   public static ItemStack method38188(ItemStack var0, Collection<EffectInstance> var1) {
      if (var1.isEmpty()) {
         return var0;
      } else {
         CompoundNBT var4 = var0.getOrCreateTag();
         ListNBT var5 = var4.method131("CustomPotionEffects", 9);

         for (EffectInstance var7 : var1) {
            var5.add(var7.method8637(new CompoundNBT()));
         }

         var4.put("CustomPotionEffects", var5);
         return var0;
      }
   }

   public static void method38189(ItemStack var0, List<ITextComponent> var1, float var2) {
      List<EffectInstance> var5 = method38176(var0);
      ArrayList<Pair> var6 = Lists.newArrayList();
      if (!var5.isEmpty()) {
         for (EffectInstance var8 : var5) {
            TranslationTextComponent var9 = new TranslationTextComponent(var8.method8636());
            Effect var10 = var8.getPotion();
            Map<Attribute, AttributeModifier> var11 = var10.method22299();
            if (!var11.isEmpty()) {
               for (Entry var13 : var11.entrySet()) {
                  AttributeModifier var14 = (AttributeModifier)var13.getValue();
                  AttributeModifier var15 = new AttributeModifier(var14.method37931(), var10.getAttributeModifierAmount(var8.method8629(), var14), var14.getOperation());
                  var6.add(new Pair(var13.getKey(), var15));
               }
            }

            if (var8.method8629() > 0) {
               var9 = new TranslationTextComponent("potion.withAmplifier", var9, new TranslationTextComponent("potion.potency." + var8.method8629()));
            }

            if (var8.method8628() > 20) {
               var9 = new TranslationTextComponent("potion.withDuration", var9, Class7182.method22535(var8, var2));
            }

            var1.add(var9.mergeStyle(var10.getEffectType().method8849()));
         }
      } else {
         var1.add(field45485);
      }

      if (!var6.isEmpty()) {
         var1.add(StringTextComponent.EMPTY);
         var1.add(new TranslationTextComponent("potion.whenDrank").mergeStyle(TextFormatting.DARK_PURPLE));

         for (Pair var21 : var6) {
            AttributeModifier var22 = (AttributeModifier)var21.getSecond();
            double var16 = var22.getAmount();
            double var18;
            if (var22.getOperation() != AttributeModifier.Operation.field13353 && var22.getOperation() != AttributeModifier.Operation.MULTIPLY_TOTAL) {
               var18 = var22.getAmount();
            } else {
               var18 = var22.getAmount() * 100.0;
            }

            if (!(var16 > 0.0)) {
               if (var16 < 0.0) {
                  var18 *= -1.0;
                  var1.add(
                     new TranslationTextComponent(
                           "attribute.modifier.take." + var22.getOperation().getId(),
                           ItemStack.field39974.format(var18),
                           new TranslationTextComponent(((Attribute)var21.getFirst()).getAttributeName())
                        )
                        .mergeStyle(TextFormatting.RED)
                  );
               }
            } else {
               var1.add(
                  new TranslationTextComponent(
                        "attribute.modifier.plus." + var22.getOperation().getId(),
                        ItemStack.field39974.format(var18),
                        new TranslationTextComponent(((Attribute)var21.getFirst()).getAttributeName())
                     )
                     .mergeStyle(TextFormatting.BLUE)
               );
            }
         }
      }
   }
}
