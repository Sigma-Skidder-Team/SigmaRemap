package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class TransportationGroup extends ItemGroup {
   public TransportationGroup(int var1, String var2) {
      super(var1, var2);
   }

   @Override
   public ItemStack createIcon() {
      return new ItemStack(Blocks.POWERED_RAIL);
   }
}
