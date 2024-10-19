package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.end.DragonFightManager;
import net.minecraft.world.server.ServerWorld;

import java.util.List;

public class Class3340 extends Item {
   private static String[] field18846;

   public Class3340(Properties var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11707(ItemUseContext var1) {
      World var4 = var1.getWorld();
      BlockPos var5 = var1.getPos();
      BlockState var6 = var4.getBlockState(var5);
      if (!var6.isIn(Blocks.field36527) && !var6.isIn(Blocks.BEDROCK)) {
         return ActionResultType.FAIL;
      } else {
         BlockPos var7 = var5.up();
         if (var4.method7007(var7)) {
            double var8 = (double)var7.getX();
            double var10 = (double)var7.getY();
            double var12 = (double)var7.getZ();
            List var14 = var4.method7181((Entity)null, new AxisAlignedBB(var8, var10, var12, var8 + 1.0, var10 + 2.0, var12 + 1.0));
            if (var14.isEmpty()) {
               if (var4 instanceof ServerWorld) {
                  EnderCrystalEntity var15 = new EnderCrystalEntity(var4, var8 + 0.5, var10, var12 + 0.5);
                  var15.method4144(false);
                  var4.addEntity(var15);
                  DragonFightManager var16 = ((ServerWorld)var4).method6968();
                  if (var16 != null) {
                     var16.method26128();
                  }
               }

               var1.method18357().shrink(1);
               return ActionResultType.method9002(var4.isRemote);
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
