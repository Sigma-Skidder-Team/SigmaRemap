package mapped;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;

public final class BrewingGroup extends ItemGroup {
   public BrewingGroup(int var1, String var2) {
      super(var1, var2);
   }

   @Override
   public ItemStack createIcon() {
      return PotionUtils.method38187(new ItemStack(Items.field37971), Potions.WATER);
   }
}
