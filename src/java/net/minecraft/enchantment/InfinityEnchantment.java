package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class InfinityEnchantment extends Enchantment {
   private static String[] field27334;

   public InfinityEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.field14680, var2);
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

   @Override
   public boolean method18817(Enchantment var1) {
      return !(var1 instanceof MendingEnchantment) ? super.method18817(var1) : false;
   }
}
