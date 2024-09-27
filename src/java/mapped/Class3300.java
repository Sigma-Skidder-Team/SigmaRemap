package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3300 extends Class3298 {
   private static String[] field18806;

   public Class3300(Properties var1, Block var2, Block var3) {
      super(var2, var3, var1);
   }

   @Override
   public boolean method11837(BlockPos var1, World var2, PlayerEntity var3, ItemStack var4, BlockState var5) {
      boolean var8 = super.method11837(var1, var2, var3, var4, var5);
      if (!var2.isRemote && !var8 && var3 != null) {
         var3.method2764((Class954)var2.getTileEntity(var1));
      }

      return var8;
   }
}
