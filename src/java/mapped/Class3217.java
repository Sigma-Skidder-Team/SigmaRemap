package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class Class3217 extends Class3213 {
   private static String[] field18622;
   private final BlockState field18626;

   public Class3217(Block var1, Properties var2) {
      super(var2);
      this.field18626 = var1.getDefaultState();
   }

   @Override
   public void method11599(World var1, BlockPos var2, BlockState var3, BlockState var4, Class907 var5) {
      if (method11604(var1, var2, var4)) {
         var1.setBlockState(var2, this.field18626, 3);
      }
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      World var4 = var1.getWorld();
      BlockPos var5 = var1.getPos();
      BlockState var6 = var4.getBlockState(var5);
      return !method11604(var4, var5, var6) ? super.getStateForPlacement(var1) : this.field18626;
   }

   private static boolean method11604(IBlockReader var0, BlockPos var1, BlockState var2) {
      return method11606(var2) || method11605(var0, var1);
   }

   private static boolean method11605(IBlockReader var0, BlockPos var1) {
      boolean var4 = false;
      BlockPos.Mutable var5 = var1.method8354();

      for (Direction var9 : Direction.values()) {
         BlockState var10 = var0.getBlockState(var5);
         if (var9 != Direction.DOWN || method11606(var10)) {
            var5.method8377(var1, var9);
            var10 = var0.getBlockState(var5);
            if (method11606(var10) && !var10.method23454(var0, var1, var9.getOpposite())) {
               var4 = true;
               break;
            }
         }
      }

      return var4;
   }

   private static boolean method11606(BlockState var0) {
      return var0.getFluidState().method23486(FluidTags.field40469);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return !method11605(var4, var5) ? super.updatePostPlacement(var1, var2, var3, var4, var5, var6) : this.field18626;
   }

   @Override
   public int method11601(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.method23394(var2, var3).colorValue;
   }
}
