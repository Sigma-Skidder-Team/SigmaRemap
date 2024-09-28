package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.RailShape;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public final class Class6244 extends Class6218 {
   private static String[] field27734;
   private final Class6218 field27735 = new Class6218();

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      Direction var5 = var1.method11324().<Direction>get(Class3357.field18899);
      ServerWorld var6 = var1.method11326();
      double var7 = var1.getX() + (double)var5.getXOffset() * 1.125;
      double var9 = Math.floor(var1.getY()) + (double)var5.getYOffset();
      double var11 = var1.getZ() + (double)var5.getZOffset() * 1.125;
      BlockPos var13 = var1.method11323().method8349(var5);
      BlockState var14 = var6.getBlockState(var13);
      RailShape var15 = !(var14.getBlock() instanceof Class3429)
         ? RailShape.field247
         : var14.<RailShape>get(((Class3429)var14.getBlock()).method12093());
      double var16;
      if (!var14.isIn(BlockTags.field32766)) {
         if (!var14.isAir() || !var6.getBlockState(var13.down()).isIn(BlockTags.field32766)) {
            return this.field27735.method19196(var1, var2);
         }

         BlockState var18 = var6.getBlockState(var13.down());
         RailShape var19 = !(var18.getBlock() instanceof Class3429)
            ? RailShape.field247
            : var18.<RailShape>get(((Class3429)var18.getBlock()).method12093());
         if (var5 != Direction.DOWN && var19.method275()) {
            var16 = -0.4;
         } else {
            var16 = -0.9;
         }
      } else if (!var15.method275()) {
         var16 = 0.1;
      } else {
         var16 = 0.6;
      }

      AbstractMinecartEntity var20 = AbstractMinecartEntity.method3585(var6, var7, var9 + var16, var11, Class3282.method11811((Class3282)var2.getItem()));
      if (var2.method32152()) {
         var20.method3379(var2.method32149());
      }

      var6.addEntity(var20);
      var2.shrink(1);
      return var2;
   }

   @Override
   public void method19193(IBlockSource var1) {
      var1.method11326().playEvent(1000, var1.method11323(), 0);
   }
}
