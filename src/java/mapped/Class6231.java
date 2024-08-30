package mapped;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public final class Class6231 extends Class6230 {
   private static String[] field27718;

   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      BlockPos var5 = var1.method11323().method8349(var1.method11324().<Direction>method23463(Class3357.field18899));

      for (Class1066 var7 : var1.method11326().<Class1066>method6772(Class1066.class, new AxisAlignedBB(var5), var0 -> var0.isAlive() && !var0.method4927())) {
         if (var7.method4932() && var7.method2963(499, var2)) {
            var2.method32182(1);
            this.method19204(true);
            return var2;
         }
      }

      return super.method19192(var1, var2);
   }
}
