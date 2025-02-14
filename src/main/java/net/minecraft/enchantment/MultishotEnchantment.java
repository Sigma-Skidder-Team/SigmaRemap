package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class MultishotEnchantment extends Enchantment {
   private static String[] field27326;

   public MultishotEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.CROSSBOW, var2);
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
      return super.method18817(var1) && var1 != Enchantments.PIERCING;
   }
}
