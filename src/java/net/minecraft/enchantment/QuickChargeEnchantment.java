package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class QuickChargeEnchantment extends Enchantment {
   private static String[] field27305;

   public QuickChargeEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.field14682, var2);
   }

   @Override
   public int method18807(int var1) {
      return 12 + (var1 - 1) * 20;
   }

   @Override
   public int method18808(int var1) {
      return 50;
   }

   @Override
   public int method18809() {
      return 3;
   }
}
