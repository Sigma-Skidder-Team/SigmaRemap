package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class FlameEnchantment extends Enchantment {
   private static String[] field27336;

   public FlameEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.BOW, var2);
   }

   @Override
   public int method18807(int var1) {
      return 20;
   }

   @Override
   public int method18808(int var1) {
      return 50;
   }

   @Override
   public int method18809() {
      return 1;
   }
}
