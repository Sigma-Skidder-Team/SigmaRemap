package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class PowerEnchantment extends Enchantment {
   private static String[] field27335;

   public PowerEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.BOW, var2);
   }

   @Override
   public int method18807(int var1) {
      return 1 + (var1 - 1) * 10;
   }

   @Override
   public int method18808(int var1) {
      return this.method18807(var1) + 15;
   }

   @Override
   public int method18809() {
      return 5;
   }
}
