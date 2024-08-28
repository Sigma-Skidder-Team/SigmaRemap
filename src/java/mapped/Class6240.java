package mapped;

public class Class6240 extends Class6230 {
   private static String[] field27731;

   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      this.method19204(false);
      Class3257 var5 = var2.method32107();
      if (var5 instanceof Class3292) {
         Direction var6 = var1.method11324().<Direction>method23463(Class3357.field18899);
         BlockPos var7 = var1.method11323().method8349(var6);
         Direction var8 = !var1.method11326().method7007(var7.method8313()) ? Direction.field673 : var6;
         this.method19204(((Class3292)var5).method11834(new Class5910(var1.method11326(), var7, var6, var2, var8)).method9000());
      }

      return var2;
   }
}
