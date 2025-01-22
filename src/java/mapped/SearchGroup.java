package mapped;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public final class SearchGroup extends ItemGroup {

   @Override
   public ItemStack createIcon() {
      return new ItemStack(Items.COMPASS);
   }
}
