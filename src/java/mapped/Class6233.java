package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class Class6233 extends Class6230 {
   private static String[] field27728;

   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      ServerWorld var5 = var1.method11326();
      if (!var5.isRemote()) {
         BlockPos var6 = var1.method11323().method8349(var1.method11324().<Direction>method23463(Class3357.field18899));
         this.method19204(method19206(var5, var6) || method19207(var5, var6));
         if (this.method19203() && var2.method32120(1, var5.method6814(), (ServerPlayerEntity)null)) {
            var2.method32180(0);
         }
      }

      return var2;
   }

   private static boolean method19206(ServerWorld var0, BlockPos var1) {
      BlockState var4 = var0.getBlockState(var1);
      if (var4.method23446(BlockTags.field32794)) {
         int var5 = var4.<Integer>method23463(Class3366.field18936);
         if (var5 >= 5) {
            var0.method6742((PlayerEntity)null, var1, Sounds.field26398, Class2266.field14732, 1.0F, 1.0F);
            Class3366.method11944(var0, var1);
            ((Class3366)var4.getBlock()).method11946(var0, var4, var1, (PlayerEntity)null, Class2084.field13572);
            return true;
         }
      }

      return false;
   }

   private static boolean method19207(ServerWorld var0, BlockPos var1) {
      for (LivingEntity var5 : var0.method6772(LivingEntity.class, new AxisAlignedBB(var1), Class8088.field34763)) {
         if (var5 instanceof Class1020) {
            Class1020 var6 = (Class1020)var5;
            if (var6.method4516()) {
               var6.method4515(Class2266.field14732);
               return true;
            }
         }
      }

      return false;
   }
}
