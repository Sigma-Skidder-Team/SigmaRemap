package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class SweepingEnchantment extends Enchantment {
   private static String[] field27323;

   public SweepingEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.WEAPON, var2);
   }

   @Override
   public int method18807(int var1) {
      return 5 + (var1 - 1) * 9;
   }

   @Override
   public int method18808(int var1) {
      return this.method18807(var1) + 15;
   }

   @Override
   public int method18809() {
      return 3;
   }

   public static float method18828(int var0) {
      return 1.0F - 1.0F / (float)(var0 + 1);
   }
}
