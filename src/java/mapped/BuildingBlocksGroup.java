package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class BuildingBlocksGroup extends ItemGroup {

   @Override
   public ItemStack createIcon() {
      return new ItemStack(Blocks.BRICKS);
   }
}
