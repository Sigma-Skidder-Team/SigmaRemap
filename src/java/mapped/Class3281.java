package mapped;

public class Class3281 extends Item {
   private static String[] field18789;

   public Class3281(Class5643 var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11707(Class5911 var1) {
      PlayerEntity var4 = var1.method18358();
      World var5 = var1.method18360();
      BlockPos var6 = var1.method18345();
      BlockState var7 = var5.getBlockState(var6);
      if (!Class3244.method11656(var7)) {
         BlockPos var8 = var6.method8349(var1.method18354());
         if (!Class3397.method12012(var5, var8, var1.method18350())) {
            return ActionResultType.FAIL;
         } else {
            var5.method6742(var4, var8, Class6067.field26587, Class2266.field14732, 1.0F, field18735.nextFloat() * 0.4F + 0.8F);
            BlockState var9 = Class3397.method12009(var5, var8);
            var5.method6725(var8, var9, 11);
            ItemStack var10 = var1.method18357();
            if (var4 instanceof ServerPlayerEntity) {
               CriteriaTriggers.field44489.method15138((ServerPlayerEntity)var4, var8, var10);
               var10.method32121(1, var4, var1x -> var1x.method3185(var1.method18359()));
            }

            return ActionResultType.method9002(var5.method6714());
         }
      } else {
         var5.method6742(var4, var6, Class6067.field26587, Class2266.field14732, 1.0F, field18735.nextFloat() * 0.4F + 0.8F);
         var5.method6725(var6, var7.method23465(Class8820.field39699, Boolean.valueOf(true)), 11);
         if (var4 != null) {
            var1.method18357().method32121(1, var4, var1x -> var1x.method3185(var1.method18359()));
         }

         return ActionResultType.method9002(var5.method6714());
      }
   }
}
