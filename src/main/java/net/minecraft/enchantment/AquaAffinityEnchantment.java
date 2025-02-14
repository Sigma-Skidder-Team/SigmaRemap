package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class AquaAffinityEnchantment extends Enchantment {
   private static String[] field27329;

   public AquaAffinityEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.ARMOR_HEAD, var2);
   }

   @Override
   public int method18807(int var1) {
      return 1;
   }

   @Override
   public int method18808(int var1) {
      return this.method18807(var1) + 40;
   }

   @Override
   public int method18809() {
      return 1;
   }
}
