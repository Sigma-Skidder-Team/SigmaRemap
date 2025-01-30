package net.minecraft.item.crafting;

import mapped.*;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public interface IRecipe<C extends IInventory> {
   boolean matches(C var1, World var2);

   ItemStack method14962(C var1);

   boolean method14960(int var1, int var2);

   ItemStack getRecipeOutput();

   default NonNullList<ItemStack> method14968(C var1) {
      NonNullList var4 = NonNullList.<ItemStack>method68(var1.getSizeInventory(), ItemStack.EMPTY);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         Item var6 = var1.getStackInSlot(var5).getItem();
         if (var6.method11723()) {
            var4.set(var5, new ItemStack(var6.method11722()));
         }
      }

      return var4;
   }

   default NonNullList<Ingredient> method14969() {
      return NonNullList.<Ingredient>create();
   }

   default boolean method14965() {
      return false;
   }

   default String method14970() {
      return "";
   }

   default ItemStack method14971() {
      return new ItemStack(Blocks.CRAFTING_TABLE);
   }

   ResourceLocation getId();

   Class6504<?> method14961();

   IRecipeType<?> getType();
}
