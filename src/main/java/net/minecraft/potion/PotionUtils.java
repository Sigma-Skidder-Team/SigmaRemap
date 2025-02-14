package net.minecraft.potion;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import mapped.Class9680;
import mapped.Effect;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.optifine.Config;

import javax.annotation.Nullable;

public class PotionUtils {
   private static final IFormattableTextComponent field_242400_a = new TranslationTextComponent("effect.none").mergeStyle(TextFormatting.GRAY);

   public static List<EffectInstance> getEffectsFromStack(ItemStack stack) {
      return getEffectsFromTag(stack.getTag());
   }

   public static List<EffectInstance> mergeEffects(Potion potionIn, Collection<EffectInstance> effects) {
      ArrayList<EffectInstance> list = Lists.newArrayList();
      list.addAll(potionIn.getEffects());
      list.addAll(effects);
      return list;
   }

   public static List<EffectInstance> getEffectsFromTag(@Nullable CompoundNBT tag) {
      ArrayList list = Lists.newArrayList();
      list.addAll(getPotionTypeFromNBT(tag).getEffects());
      addCustomPotionEffectToList(tag, list);
      return list;
   }

   public static List<EffectInstance> getFullEffectsFromItem(ItemStack itemIn) {
      return getFullEffectsFromTag(itemIn.getTag());
   }

   public static List<EffectInstance> getFullEffectsFromTag(CompoundNBT tag) {
      ArrayList list = Lists.newArrayList();
      addCustomPotionEffectToList(tag, list);
      return list;
   }

   public static void addCustomPotionEffectToList(@Nullable CompoundNBT tag, List<EffectInstance> effectList) {
      if (tag != null && tag.contains("CustomPotionEffects", 9)) {
         ListNBT var4 = tag.getList("CustomPotionEffects", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            CompoundNBT var6 = var4.getCompound(var5);
            EffectInstance var7 = EffectInstance.read(var6);
            if (var7 != null) {
               effectList.add(var7);
            }
         }
      }
   }

   public static int getColor(ItemStack itemStackIn) {
      CompoundNBT nbt = itemStackIn.getTag();
      if (nbt != null && nbt.contains("CustomPotionColor", 99)) {
         return nbt.getInt("CustomPotionColor");
      } else {
         return getPotionFromItem(itemStackIn) != Potions.EMPTY ? getPotionColorFromEffectList(getEffectsFromStack(itemStackIn)) : 16253176;
      }
   }

   public static int getPotionColor(Potion potionIn) {
      return potionIn != Potions.EMPTY ? getPotionColorFromEffectList(potionIn.getEffects()) : 16253176;
   }

   public static int getPotionColorFromEffectList(Collection<EffectInstance> effects) {
      int var3 = 3694022;
      if (!effects.isEmpty()) {
         float var4 = 0.0F;
         float var5 = 0.0F;
         float var6 = 0.0F;
         int var7 = 0;

         for (EffectInstance var9 : effects) {
            if (var9.doesShowParticles()) {
               int var10 = var9.getPotion().getLiquidColor();
               if (Config.method26911()) {
                  var10 = Class9680.method37891(var9.getPotion(), var10);
               }

               int var11 = var9.getAmplifier() + 1;
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

   public static Potion getPotionFromItem(ItemStack itemIn) {
      return getPotionTypeFromNBT(itemIn.getTag());
   }

   public static Potion getPotionTypeFromNBT(@Nullable CompoundNBT tag) {
      return tag != null ? Potion.method31814(tag.getString("Potion")) : Potions.EMPTY;
   }

   public static ItemStack addPotionToItemStack(ItemStack itemIn, Potion potion) {
      ResourceLocation var4 = Registry.POTION.getKey(potion);
      if (potion != Potions.EMPTY) {
         itemIn.getOrCreateTag().putString("Potion", var4.toString());
      } else {
         itemIn.method32146("Potion");
      }

      return itemIn;
   }

   public static ItemStack method38188(ItemStack var0, Collection<EffectInstance> var1) {
      if (var1.isEmpty()) {
         return var0;
      } else {
         CompoundNBT var4 = var0.getOrCreateTag();
         ListNBT var5 = var4.getList("CustomPotionEffects", 9);

         for (EffectInstance var7 : var1) {
            var5.add(var7.write(new CompoundNBT()));
         }

         var4.put("CustomPotionEffects", var5);
         return var0;
      }
   }

   public static void method38189(ItemStack var0, List<ITextComponent> var1, float var2) {
      List<EffectInstance> var5 = getEffectsFromStack(var0);
      ArrayList<Pair> var6 = Lists.newArrayList();
      if (!var5.isEmpty()) {
         for (EffectInstance var8 : var5) {
            TranslationTextComponent var9 = new TranslationTextComponent(var8.getPotionName());
            Effect var10 = var8.getPotion();
            Map<Attribute, AttributeModifier> var11 = var10.method22299();
            if (!var11.isEmpty()) {
               for (Entry var13 : var11.entrySet()) {
                  AttributeModifier var14 = (AttributeModifier)var13.getValue();
                  AttributeModifier var15 = new AttributeModifier(var14.method37931(), var10.getAttributeModifierAmount(var8.getAmplifier(), var14), var14.getOperation());
                  var6.add(new Pair(var13.getKey(), var15));
               }
            }

            if (var8.getAmplifier() > 0) {
               var9 = new TranslationTextComponent("potion.withAmplifier", var9, new TranslationTextComponent("potion.potency." + var8.getAmplifier()));
            }

            if (var8.getDuration() > 20) {
               var9 = new TranslationTextComponent("potion.withDuration", var9, EffectUtils.method22535(var8, var2));
            }

            var1.add(var9.mergeStyle(var10.getEffectType().method8849()));
         }
      } else {
         var1.add(field_242400_a);
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
