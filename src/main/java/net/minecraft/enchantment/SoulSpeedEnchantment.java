package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class SoulSpeedEnchantment extends Enchantment {
   private static String[] field27342;

   public SoulSpeedEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.ARMOR_FEET, var2);
   }

   @Override
   public int method18807(int var1) {
      return var1 * 10;
   }

   @Override
   public int method18808(int var1) {
      return this.method18807(var1) + 15;
   }

   @Override
   public boolean method18824() {
      return true;
   }

   @Override
   public boolean method18826() {
      return false;
   }

   @Override
   public boolean method18827() {
      return false;
   }

   @Override
   public int method18809() {
      return 3;
   }
}
