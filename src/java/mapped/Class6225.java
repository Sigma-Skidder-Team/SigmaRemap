package mapped;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public class Class6225 extends Class6218 {
   private static String[] field27718;
   private final Class6218 field27720 = new Class6218();
   private final Class2099 field27721;

   public Class6225(Class2099 var1) {
      this.field27721 = var1;
   }

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      Direction var5 = var1.method11324().<Direction>get(DispenserBlock.field18899);
      ServerWorld var6 = var1.method11326();
      double var7 = var1.getX() + (double)((float)var5.getXOffset() * 1.125F);
      double var9 = var1.getY() + (double)((float)var5.getYOffset() * 1.125F);
      double var11 = var1.getZ() + (double)((float)var5.getZOffset() * 1.125F);
      BlockPos var13 = var1.method11323().offset(var5);
      double var14;
      if (!var6.getFluidState(var13).method23486(FluidTags.WATER)) {
         if (!var6.getBlockState(var13).isAir() || !var6.getFluidState(var13.down()).method23486(FluidTags.WATER)) {
            return this.field27720.method19196(var1, var2);
         }

         var14 = 0.0;
      } else {
         var14 = 1.0;
      }

      BoatEntity var16 = new BoatEntity(var6, var7, var9 + var14, var11);
      var16.method4171(this.field27721);
      var16.rotationYaw = var5.getHorizontalAngle();
      var6.addEntity(var16);
      var2.shrink(1);
      return var2;
   }

   @Override
   public void method19193(IBlockSource var1) {
      var1.method11326().playEvent(1000, var1.method11323(), 0);
   }
}
