package net.minecraft.item.crafting;

import mapped.Ingredient;
import mapped.Class6504;
import net.minecraft.inventory.IInventory;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class SmithingRecipe implements IRecipe<IInventory> {
   private static String[] field22625;
   private final Ingredient field22626;
   private final Ingredient field22627;
   private final ItemStack field22628;
   private final ResourceLocation field22629;

   public SmithingRecipe(ResourceLocation var1, Ingredient var2, Ingredient var3, ItemStack var4) {
      this.field22629 = var1;
      this.field22626 = var2;
      this.field22627 = var3;
      this.field22628 = var4;
   }

   @Override
   public boolean matches(IInventory var1, World var2) {
      return this.field22626.test(var1.getStackInSlot(0)) && this.field22627.test(var1.getStackInSlot(1));
   }

   @Override
   public ItemStack method14962(IInventory var1) {
      ItemStack var4 = this.field22628.copy();
      CompoundNBT var5 = var1.getStackInSlot(0).getTag();
      if (var5 != null) {
         var4.setTag(var5.copy());
      }

      return var4;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public ItemStack getRecipeOutput() {
      return this.field22628;
   }

   public boolean method14972(ItemStack var1) {
      return this.field22627.test(var1);
   }

   @Override
   public ItemStack method14971() {
      return new ItemStack(Blocks.SMITHING_TABLE);
   }

   @Override
   public ResourceLocation getId() {
      return this.field22629;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28490;
   }

   @Override
   public IRecipeType<?> getType() {
      return IRecipeType.SMITHING;
   }

   // $VF: synthetic method
   public static Ingredient method14973(SmithingRecipe var0) {
      return var0.field22626;
   }

   // $VF: synthetic method
   public static Ingredient method14974(SmithingRecipe var0) {
      return var0.field22627;
   }

   // $VF: synthetic method
   public static ItemStack method14975(SmithingRecipe var0) {
      return var0.field22628;
   }
}
