package net.minecraft.enchantment;

import mapped.CreatureAttribute;
import net.minecraft.inventory.EquipmentSlotType;

public class ImpalingEnchantment extends Enchantment {
   private static String[] field27310;

   public ImpalingEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.TRIDENT, var2);
   }

   @Override
   public int method18807(int var1) {
      return 1 + (var1 - 1) * 8;
   }

   @Override
   public int method18808(int var1) {
      return this.method18807(var1) + 20;
   }

   @Override
   public int method18809() {
      return 5;
   }

   @Override
   public float method18815(int var1, CreatureAttribute var2) {
      return var2 != CreatureAttribute.field33509 ? 0.0F : (float)var1 * 2.5F;
   }
}
