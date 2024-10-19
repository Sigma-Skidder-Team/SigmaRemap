package net.minecraft.enchantment;

import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.Map;
import javax.annotation.Nullable;

import mapped.CreatureAttribute;
import net.minecraft.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class Enchantment {
   private final EquipmentSlotType[] applicableEquipmentTypes;
   private final Rarity rarity;
   public final EnchantmentType type;
   public String name;

   @Nullable
   public static Enchantment getEnchantmentByID(int var0) {
      return Registry.ENCHANTMENT.getByValue(var0);
   }

   public Enchantment(Rarity var1, EnchantmentType var2, EquipmentSlotType[] var3) {
      this.rarity = var1;
      this.type = var2;
      this.applicableEquipmentTypes = var3;
   }

   public Map<EquipmentSlotType, ItemStack> method18811(LivingEntity var1) {
      EnumMap var4 = Maps.newEnumMap(EquipmentSlotType.class);

      for (EquipmentSlotType var8 : this.applicableEquipmentTypes) {
         ItemStack var9 = var1.getItemStackFromSlot(var8);
         if (!var9.isEmpty()) {
            var4.put(var8, var9);
         }
      }

      return var4;
   }

   public Rarity method18812() {
      return this.rarity;
   }

   public int method18813() {
      return 1;
   }

   public int method18809() {
      return 1;
   }

   public int method18807(int var1) {
      return 1 + var1 * 10;
   }

   public int method18808(int var1) {
      return this.method18807(var1) + 5;
   }

   public int method18814(int var1, DamageSource var2) {
      return 0;
   }

   public float method18815(int var1, CreatureAttribute var2) {
      return 0.0F;
   }

   public final boolean method18816(Enchantment var1) {
      return this.method18817(var1) && var1.method18817(this);
   }

   public boolean method18817(Enchantment var1) {
      return this != var1;
   }

   public String method18818() {
      if (this.name == null) {
         this.name = Util.makeTranslationKey("enchantment", Registry.ENCHANTMENT.getKey(this));
      }

      return this.name;
   }

   public String method18819() {
      return this.method18818();
   }

   public ITextComponent method18820(int var1) {
      TranslationTextComponent var4 = new TranslationTextComponent(this.method18819());
      if (!this.method18825()) {
         var4.mergeStyle(TextFormatting.GRAY);
      } else {
         var4.mergeStyle(TextFormatting.RED);
      }

      if (var1 != 1 || this.method18809() != 1) {
         var4.appendString(" ").append(new TranslationTextComponent("enchantment.level." + var1));
      }

      return var4;
   }

   public boolean method18821(ItemStack var1) {
      return this.type.method8990(var1.getItem());
   }

   public void method18822(LivingEntity var1, Entity var2, int var3) {
   }

   public void method18823(LivingEntity var1, Entity var2, int var3) {
   }

   public boolean method18824() {
      return false;
   }

   public boolean method18825() {
      return false;
   }

   public boolean method18826() {
      return true;
   }

   public boolean method18827() {
      return true;
   }

   public enum Rarity {
      COMMON(10),
      UNCOMMON(5),
      RARE(2),
      VERY_RARE(1);

      private final int field12590;
      private static final Rarity[] field12591 = new Rarity[]{COMMON, UNCOMMON, RARE, VERY_RARE};

      private Rarity(int var3) {
         this.field12590 = var3;
      }

      public int method8195() {
         return this.field12590;
      }
   }
}
