package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class PunchEnchantment extends Enchantment {
   private static String[] field27315;

   public PunchEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.field14680, var2);
   }

   @Override
   public int method18807(int var1) {
      return 12 + (var1 - 1) * 20;
   }

   @Override
   public int method18808(int var1) {
      return this.method18807(var1) + 25;
   }

   @Override
   public int method18809() {
      return 2;
   }
}
