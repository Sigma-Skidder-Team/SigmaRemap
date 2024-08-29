package mapped;

import java.util.List;

public class Class3340 extends Item {
   private static String[] field18846;

   public Class3340(Class5643 var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11707(Class5911 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      BlockState var6 = var4.getBlockState(var5);
      if (!var6.method23448(Blocks.field36527) && !var6.method23448(Blocks.BEDROCK)) {
         return ActionResultType.FAIL;
      } else {
         BlockPos var7 = var5.method8311();
         if (var4.method7007(var7)) {
            double var8 = (double)var7.getX();
            double var10 = (double)var7.getY();
            double var12 = (double)var7.getZ();
            List var14 = var4.method7181((Entity)null, new AxisAlignedBB(var8, var10, var12, var8 + 1.0, var10 + 2.0, var12 + 1.0));
            if (var14.isEmpty()) {
               if (var4 instanceof ServerWorld) {
                  EnderCrystalEntity var15 = new EnderCrystalEntity(var4, var8 + 0.5, var10, var12 + 0.5);
                  var15.method4144(false);
                  var4.method6916(var15);
                  Class7819 var16 = ((ServerWorld)var4).method6968();
                  if (var16 != null) {
                     var16.method26128();
                  }
               }

               var1.method18357().method32182(1);
               return ActionResultType.method9002(var4.field9020);
            } else {
               return ActionResultType.FAIL;
            }
         } else {
            return ActionResultType.FAIL;
         }
      }
   }

   @Override
   public boolean method11732(ItemStack var1) {
      return true;
   }
}
