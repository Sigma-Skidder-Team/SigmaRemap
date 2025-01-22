package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class DepthStriderEnchantment extends Enchantment {
   private static String[] field27343;

   public DepthStriderEnchantment(Rarity var1, EquipmentSlotType... var2) {
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
   public int method18809() {
      return 3;
   }

   @Override
   public boolean method18817(Enchantment var1) {
      return super.method18817(var1) && var1 != Enchantments.FROST_WALKER;
   }
}
