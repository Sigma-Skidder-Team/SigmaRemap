package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3230 extends Class3229 {
   private static String[] field18668;
   private final Block field18671;

   public Class3230(Block var1, Properties var2) {
      super(var2);
      this.field18671 = var1;
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      this.method11632(var1, var2, var3);
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!method11633(var1, var2, var3)) {
         var2.setBlockState(
            var3,
            this.field18671.getDefaultState().with(field18663, Boolean.valueOf(false)).with(field18669, var1.<Direction>get(field18669)),
            2
         );
      }
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var2.getOpposite() == var1.<Direction>get(field18669) && !var1.method23443(var4, var5)) {
         return Blocks.AIR.getDefaultState();
      } else {
         if (var1.<Boolean>get(field18663)) {
            var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
         }

         this.method11632(var1, var4, var5);
         return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      }
   }
}
