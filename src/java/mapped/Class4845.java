package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Class4845 extends Class4844 {
   private static String[] field22624;

   public Class4845(ResourceLocation var1, String var2, Class120 var3, ItemStack var4) {
      super(Class7207.field30940, Class6504.field28489, var1, var2, var3, var4);
   }

   @Override
   public boolean method14963(Class920 var1, World var2) {
      return this.field22618.test(var1.method3618(0));
   }

   @Override
   public ItemStack method14971() {
      return new ItemStack(Blocks.field37063);
   }
}
