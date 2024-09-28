package mapped;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public final class Class6231 extends Class6230 {
   private static String[] field27718;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      BlockPos var5 = var1.method11323().offset(var1.method11324().<Direction>get(Class3357.field18899));

      for (Class1066 var7 : var1.method11326().<Class1066>getEntitiesInAABBexcluding(Class1066.class, new AxisAlignedBB(var5), var0 -> var0.isAlive() && !var0.method4927())) {
         if (var7.method4932() && var7.method2963(499, var2)) {
            var2.shrink(1);
            this.method19204(true);
            return var2;
         }
      }

      return super.dispenseStack(var1, var2);
   }
}
