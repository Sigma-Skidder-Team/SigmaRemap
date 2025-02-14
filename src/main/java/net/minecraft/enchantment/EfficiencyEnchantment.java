package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class EfficiencyEnchantment extends Enchantment {
   private static String[] field27312;

   public EfficiencyEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.DIGGER, var2);
   }

   @Override
   public int method18807(int var1) {
      return 1 + 10 * (var1 - 1);
   }

   @Override
   public int method18808(int var1) {
      return super.method18807(var1) + 50;
   }

   @Override
   public int method18809() {
      return 5;
   }

   @Override
   public boolean method18821(ItemStack var1) {
      return var1.getItem() != Items.field37956 ? super.method18821(var1) : true;
   }
}
