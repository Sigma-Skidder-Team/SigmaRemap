package mapped;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public final class MiscGroup extends ItemGroup {
   public MiscGroup(int var1, String var2) {
      super(var1, var2);
   }

   @Override
   public ItemStack createIcon() {
      return new ItemStack(Items.LAVA_BUCKET);
   }
}
