package mapped;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;

public final class Class7402 extends ItemGroup {
   public Class7402(int var1, String var2) {
      super(var1, var2);
   }

   @Override
   public ItemStack method23640() {
      return PotionUtils.addPotionToItemStack(new ItemStack(Items.field37971), Potions.WATER);
   }
}
