package net.minecraft.item;

import java.util.List;

import mapped.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class ShieldItem extends Item {
   public ShieldItem(Properties var1) {
      super(var1);
      Class3357.method11931(this, ArmorItem.DISPENSER_BEHAVIOR);
   }

   @Override
   public String method11720(ItemStack var1) {
      return var1.method32145("BlockEntityTag") == null ? super.method11720(var1) : this.getTranslationKey() + '.' + getColor(var1).method310();
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      Class3301.method11848(var1, var3);
   }

   @Override
   public UseAction method11727(ItemStack var1) {
      return UseAction.BLOCK;
   }

   @Override
   public int method11728(ItemStack var1) {
      return 72000;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      var2.setActiveHand(var3);
      return Class6794.<ItemStack>method20697(var6);
   }

   @Override
   public boolean method11699(ItemStack var1, ItemStack var2) {
      return ItemTags.field26071.contains(var2.getItem()) || super.method11699(var1, var2);
   }

   public static Class112 getColor(ItemStack var0) {
      return Class112.method315(var0.method32144("BlockEntityTag").getInt("Base"));
   }
}
