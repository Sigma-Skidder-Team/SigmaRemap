package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class PiercingEnchantment extends Enchantment {
   private static String[] field27331;

   public PiercingEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.CROSSBOW, var2);
   }

   @Override
   public int method18807(int var1) {
      return 1 + (var1 - 1) * 10;
   }

   @Override
   public int method18808(int var1) {
      return 50;
   }

   @Override
   public int method18809() {
      return 4;
   }

   @Override
   public boolean method18817(Enchantment var1) {
      return super.method18817(var1) && var1 != Enchantments.MULTISHOT;
   }
}
