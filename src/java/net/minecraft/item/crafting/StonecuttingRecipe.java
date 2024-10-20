package net.minecraft.item.crafting;

import mapped.Class120;
import mapped.Class4844;
import mapped.Class6504;
import net.minecraft.inventory.IInventory;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class StonecuttingRecipe extends Class4844 {
   private static String[] field22624;

   public StonecuttingRecipe(ResourceLocation var1, String var2, Class120 var3, ItemStack var4) {
      super(IRecipeType.STONECUTTING, Class6504.field28489, var1, var2, var3, var4);
   }

   @Override
   public boolean matches(IInventory var1, World var2) {
      return this.field22618.test(var1.getStackInSlot(0));
   }

   @Override
   public ItemStack method14971() {
      return new ItemStack(Blocks.STONECUTTER);
   }
}
