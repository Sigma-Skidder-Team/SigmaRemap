package mapped;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.crafting.RecipeBookCategory;

public class Class5832 extends Class5831 {
   private static String[] field25556;

   public Class5832(int var1, PlayerInventory var2) {
      super(ContainerType.FURNACE, Class7207.field30936, RecipeBookCategory.field12600, var1, var2);
   }

   public Class5832(int var1, PlayerInventory var2, IInventory var3, Class8202 var4) {
      super(ContainerType.FURNACE, Class7207.field30936, RecipeBookCategory.field12600, var1, var2, var3, var4);
   }
}
