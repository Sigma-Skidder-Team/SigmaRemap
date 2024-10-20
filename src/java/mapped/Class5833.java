package mapped;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.RecipeBookCategory;

public class Class5833 extends Class5831 {
   private static String[] field25557;

   public Class5833(int var1, PlayerInventory var2) {
      super(ContainerType.SMOKER, IRecipeType.SMOKING, RecipeBookCategory.SMOKER, var1, var2);
   }

   public Class5833(int var1, PlayerInventory var2, IInventory var3, Class8202 var4) {
      super(ContainerType.SMOKER, IRecipeType.SMOKING, RecipeBookCategory.SMOKER, var1, var2, var3, var4);
   }
}
