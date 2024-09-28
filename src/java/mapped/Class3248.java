package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;

public class Class3248 extends Class3247 {
   private static String[] field18709;
   public static final BooleanProperty field18710 = BlockStateProperties.field39700;
   public static final IntegerProperty field18711 = BlockStateProperties.field39746;

   public Class3248(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(HORIZONTAL_FACING, Direction.NORTH)
            .with(field18711, Integer.valueOf(1))
            .with(field18710, Boolean.valueOf(false))
            .with(field18708, Boolean.valueOf(false))
      );
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (var4.abilities.allowEdit) {
         var2.setBlockState(var3, var1.method23459(field18711), 3);
         return ActionResultType.method9002(var2.isRemote);
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public int method11658(BlockState var1) {
      return var1.<Integer>get(field18711) * 2;
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockState var4 = super.getStateForPlacement(var1);
      return var4.with(field18710, Boolean.valueOf(this.method11667(var1.getWorld(), var1.getPos(), var4)));
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return !var4.isRemote() && var2.getAxis() != var1.<Direction>get(HORIZONTAL_FACING).getAxis()
         ? var1.with(field18710, Boolean.valueOf(this.method11667(var4, var5, var1)))
         : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11667(IWorldReader var1, BlockPos var2, BlockState var3) {
      return this.method11668(var1, var2, var3) > 0;
   }

   @Override
   public boolean method11671(BlockState var1) {
      return method11672(var1);
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>get(field18708)) {
         Direction var7 = var1.<Direction>get(HORIZONTAL_FACING);
         double var8 = (double)var3.getX() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         double var10 = (double)var3.getY() + 0.4 + (var4.nextDouble() - 0.5) * 0.2;
         double var12 = (double)var3.getZ() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         float var14 = -5.0F;
         if (var4.nextBoolean()) {
            var14 = (float)(var1.<Integer>get(field18711) * 2 - 1);
         }

         var14 /= 16.0F;
         double var15 = (double)(var14 * (float)var7.getXOffset());
         double var17 = (double)(var14 * (float)var7.getZOffset());
         var2.addParticle(RedstoneParticleData.REDSTONE_DUST, var8 + var15, var10, var12 + var17, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(HORIZONTAL_FACING, field18711, field18710, field18708);
   }
}
