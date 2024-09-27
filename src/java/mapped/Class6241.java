package mapped;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public final class Class6241 extends Class6230 {
   private static String[] field27732;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      this.method19204(true);
      ServerWorld var5 = var1.method11326();
      BlockPos var6 = var1.method11323().method8349(var1.method11324().<Direction>method23463(Class3357.field18899));
      if (!Class3336.method11883(var2, var5, var6) && !Class3336.method11884(var2, var5, var6, (Direction)null)) {
         this.method19204(false);
      } else if (!var5.isRemote) {
         var5.playEvent(2005, var6, 0);
      }

      return var2;
   }
}
