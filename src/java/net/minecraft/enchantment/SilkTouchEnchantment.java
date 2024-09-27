package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class SilkTouchEnchantment extends Enchantment {
   private static String[] field27313;

   public SilkTouchEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.DIGGER, var2);
   }

   @Override
   public int method18807(int var1) {
      return 15;
   }

   @Override
   public int method18808(int var1) {
      return super.method18807(var1) + 50;
   }

   @Override
   public int method18809() {
      return 1;
   }

   @Override
   public boolean method18817(Enchantment var1) {
      return super.method18817(var1) && var1 != Enchantments.FORTUNE;
   }
}
