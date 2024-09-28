package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.NoteBlockInstrument;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class Class3426 extends Block {
   private static String[] field19174;
   public static final EnumProperty<NoteBlockInstrument> field19175 = BlockStateProperties.field39768;
   public static final BooleanProperty field19176 = BlockStateProperties.POWERED;
   public static final IntegerProperty field19177 = BlockStateProperties.field39757;

   public Class3426(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field19175, NoteBlockInstrument.field347)
            .with(field19177, Integer.valueOf(0))
            .with(field19176, Boolean.valueOf(false))
      );
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(field19175, NoteBlockInstrument.method300(var1.getWorld().getBlockState(var1.getPos().down())));
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var2 != Direction.DOWN ? super.updatePostPlacement(var1, var2, var3, var4, var5, var6) : var1.with(field19175, NoteBlockInstrument.method300(var3));
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      boolean var9 = var2.method6780(var3);
      if (var9 != var1.<Boolean>get(field19176)) {
         if (var9) {
            this.method12083(var2, var3);
         }

         var2.setBlockState(var3, var1.with(field19176, Boolean.valueOf(var9)), 3);
      }
   }

   private void method12083(World var1, BlockPos var2) {
      if (var1.getBlockState(var2.up()).isAir()) {
         var1.addBlockEvent(var2, this, 0, 0);
      }
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         var1 = var1.method23459(field19177);
         var2.setBlockState(var3, var1, 3);
         this.method12083(var2, var3);
         var4.method2911(Stats.field40153);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   @Override
   public void onBlockClicked(BlockState var1, World var2, BlockPos var3, PlayerEntity var4) {
      if (!var2.isRemote) {
         this.method12083(var2, var3);
         var4.method2911(Stats.field40152);
      }
   }

   @Override
   public boolean method11647(BlockState var1, World var2, BlockPos var3, int var4, int var5) {
      int var8 = var1.<Integer>get(field19177);
      float var9 = (float)Math.pow(2.0, (double)(var8 - 12) / 12.0);
      var2.method6742((PlayerEntity)null, var3, var1.<NoteBlockInstrument>get(field19175).method299(), Class2266.field14730, 3.0F, var9);
      var2.addParticle(
         ParticleTypes.field34088, (double)var3.getX() + 0.5, (double)var3.getY() + 1.2, (double)var3.getZ() + 0.5, (double)var8 / 24.0, 0.0, 0.0
      );
      return true;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19175, field19176, field19177);
   }
}
