package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class BindingCurseEnchantment extends Enchantment {
   private static String[] field27321;

   public BindingCurseEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.field14681, var2);
   }

   @Override
   public int method18807(int var1) {
      return 25;
   }

   @Override
   public int method18808(int var1) {
      return 50;
   }

   @Override
   public int method18809() {
      return 1;
   }

   @Override
   public boolean method18824() {
      return true;
   }

   @Override
   public boolean method18825() {
      return true;
   }
}
