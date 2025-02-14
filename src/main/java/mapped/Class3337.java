package mapped;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Class3337 extends Item {
   private static String[] field18844;

   public Class3337(Properties var1) {
      super(var1);
   }

   @Override
   public boolean method11734(ItemStack var1) {
      return var1.getCount() == 1;
   }

   @Override
   public int method11736() {
      return 1;
   }
}
