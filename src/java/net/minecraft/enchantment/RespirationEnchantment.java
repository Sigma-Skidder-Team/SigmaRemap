package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class RespirationEnchantment extends Enchantment {
   private static String[] field27311;

   public RespirationEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.field14674, var2);
   }

   @Override
   public int method18807(int var1) {
      return 10 * var1;
   }

   @Override
   public int method18808(int var1) {
      return this.method18807(var1) + 30;
   }

   @Override
   public int method18809() {
      return 3;
   }
}
