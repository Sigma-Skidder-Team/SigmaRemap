package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class MendingEnchantment extends Enchantment {
   private static String[] field27330;

   public MendingEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.field14679, var2);
   }

   @Override
   public int method18807(int var1) {
      return var1 * 25;
   }

   @Override
   public int method18808(int var1) {
      return this.method18807(var1) + 50;
   }

   @Override
   public boolean method18824() {
      return true;
   }

   @Override
   public int method18809() {
      return 1;
   }
}
