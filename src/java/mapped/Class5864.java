package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class5864 extends Class5839 {
   private static String[] field25632;

   public Class5864(Class920 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return method18282(var1);
   }

   public static boolean method18282(ItemStack var0) {
      return var0.getItem() == Items.field37975;
   }

   @Override
   public int method18269() {
      return 64;
   }
}
