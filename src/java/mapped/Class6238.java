package mapped;

import net.minecraft.util.math.BlockPos;

public final class Class6238 extends Class6230 {
   private static String[] field27718;

   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      ServerWorld var5 = var1.method11326();
      Direction var6 = var1.method11324().<Direction>method23463(Class3357.field18899);
      BlockPos var7 = var1.method11323().method8349(var6);
      if (var5.method7007(var7) && Class3344.method11899(var5, var7, var2)) {
         var5.setBlockState(
            var7,
            Blocks.field36703
               .method11579()
               .method23465(Class3343.field18855, Integer.valueOf(var6.method544() != Class113.field414 ? var6.method536().method534() * 4 : 0)),
            3
         );
         TileEntity var8 = var5.getTileEntity(var7);
         if (var8 instanceof SkullTileEntity) {
            Class3344.method11898(var5, var7, (SkullTileEntity)var8);
         }

         var2.method32182(1);
         this.method19204(true);
      } else {
         this.method19204(Class3279.method11804(var1, var2));
      }

      return var2;
   }
}
