package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ICraftingRecipe;
import net.minecraft.util.ResourceLocation;

public abstract class Class4837 implements ICraftingRecipe {
   private final ResourceLocation field22614;

   public Class4837(ResourceLocation var1) {
      this.field22614 = var1;
   }

   @Override
   public ResourceLocation getId() {
      return this.field22614;
   }

   @Override
   public boolean method14965() {
      return true;
   }

   @Override
   public ItemStack getRecipeOutput() {
      return ItemStack.EMPTY;
   }
}
