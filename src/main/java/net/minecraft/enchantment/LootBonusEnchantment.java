package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class LootBonusEnchantment extends Enchantment {
   private static String[] field27314;

   public LootBonusEnchantment(Rarity var1, EnchantmentType var2, EquipmentSlotType... var3) {
      super(var1, var2, var3);
   }

   @Override
   public int method18807(int var1) {
      return 15 + (var1 - 1) * 9;
   }

   @Override
   public int method18808(int var1) {
      return super.method18807(var1) + 50;
   }

   @Override
   public int method18809() {
      return 3;
   }

   @Override
   public boolean method18817(Enchantment var1) {
      return super.method18817(var1) && var1 != Enchantments.SILK_TOUCH;
   }
}
