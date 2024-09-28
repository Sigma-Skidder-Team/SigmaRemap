package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Class4851 extends Class4847 {
   private static String[] field22640;

   public Class4851(ResourceLocation var1, String var2, Class120 var3, ItemStack var4, float var5, int var6) {
      super(Class7207.field30937, var1, var2, var3, var4, var5, var6);
   }

   @Override
   public ItemStack method14971() {
      return new ItemStack(Blocks.BLAST_FURNACE);
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28486;
   }
}
