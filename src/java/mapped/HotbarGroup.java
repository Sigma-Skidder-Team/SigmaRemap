package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public final class HotbarGroup extends ItemGroup {
   public HotbarGroup(int var1, String var2) {
      super(var1, var2);
   }

   @Override
   public ItemStack createIcon() {
      return new ItemStack(Blocks.BOOKSHELF);
   }

   @Override
   public void fill(NonNullList<ItemStack> items) {
      throw new RuntimeException("Implement exception client-side.");
   }

   @Override
   public boolean isAlignedRight() {
      return true;
   }
}
