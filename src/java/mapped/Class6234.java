package mapped;

public final class Class6234 extends Class6230 {
   private static String[] field27718;

   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      ServerWorld var5 = var1.method11326();
      this.method19204(true);
      Direction var6 = var1.method11324().<Direction>method23463(Class3357.field18899);
      BlockPos var7 = var1.method11323().method8349(var6);
      BlockState var8 = var5.getBlockState(var7);
      if (!Class3397.method12012(var5, var7, var6)) {
         if (!Class3244.method11656(var8)) {
            if (!(var8.getBlock() instanceof Class3458)) {
               this.method19204(false);
            } else {
               Class3458.method12131(var5, var7);
               var5.method6728(var7, false);
            }
         } else {
            var5.method6730(var7, var8.method23465(Class8820.field39699, Boolean.valueOf(true)));
         }
      } else {
         var5.method6730(var7, Class3397.method12009(var5, var7));
      }

      if (this.method19203() && var2.method32120(1, var5.field9016, (ServerPlayerEntity)null)) {
         var2.method32180(0);
      }

      return var2;
   }
}
