package mapped;

import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public abstract class Class3350 extends BannerBlock {
   public static final DirectionProperty field18875 = HorizontalBlock.HORIZONTAL_FACING;
   public static final BooleanProperty field18876 = BlockStateProperties.LIT;

   public Class3350(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18875, Direction.NORTH).with(field18876, Boolean.valueOf(false)));
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         this.method11918(var2, var3, var4);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   public abstract void method11918(World var1, BlockPos var2, PlayerEntity var3);

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(field18875, var1.getPlacementHorizontalFacing().getOpposite());
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class924) {
            ((Class924)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof Class924) {
            Class7236.method22721(var2, var3, (Class924)var8);
            ((Class924)var8).method3657(var2, Vector3d.method11328(var3));
            var2.updateComparatorOutputLevel(var3, this);
         }

         super.onReplaced(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return Container.calcRedstone(var2.getTileEntity(var3));
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18875, var2.rotate(var1.<Direction>get(field18875)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18875)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18875, field18876);
   }
}
