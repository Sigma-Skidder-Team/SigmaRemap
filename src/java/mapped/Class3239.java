package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class Class3239 extends Class3238 {
   private static String[] field18689;
   private final VoxelShape[] field18690;

   public Class3239(Properties var1) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field18680, Boolean.valueOf(false))
            .with(field18681, Boolean.valueOf(false))
            .with(field18682, Boolean.valueOf(false))
            .with(field18683, Boolean.valueOf(false))
            .with(field18684, Boolean.valueOf(false))
      );
      this.field18690 = this.method11639(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   public VoxelShape method11503(BlockState var1, IBlockReader var2, BlockPos var3) {
      return this.field18690[this.method11641(var1)];
   }

   @Override
   public VoxelShape method11635(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.getShape(var1, var2, var3, var4);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }

   public boolean method11644(BlockState var1, boolean var2, Direction var3) {
      Block var6 = var1.getBlock();
      boolean var7 = this.method11645(var6);
      boolean var8 = var6 instanceof FenceGateBlock && FenceGateBlock.method11507(var1, var3);
      return !method11545(var6) && var2 || var7 || var8;
   }

   private boolean method11645(Block var1) {
      return var1.isIn(BlockTags.field32771) && var1.isIn(BlockTags.field32743) == this.getDefaultState().isIn(BlockTags.field32743);
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         return Class3329.method11880(var4, var2, var3);
      } else {
         ItemStack var9 = var4.getHeldItem(var5);
         return var9.getItem() != Items.LEAD ? ActionResultType.field14820 : ActionResultType.SUCCESS;
      }
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      World var4 = var1.getWorld();
      BlockPos var5 = var1.getPos();
      FluidState var6 = var1.getWorld().getFluidState(var1.getPos());
      BlockPos var7 = var5.north();
      BlockPos var8 = var5.east();
      BlockPos var9 = var5.south();
      BlockPos var10 = var5.west();
      BlockState var11 = var4.getBlockState(var7);
      BlockState var12 = var4.getBlockState(var8);
      BlockState var13 = var4.getBlockState(var9);
      BlockState var14 = var4.getBlockState(var10);
      return super.getStateForPlacement(var1)
         .with(field18680, Boolean.valueOf(this.method11644(var11, var11.method23454(var4, var7, Direction.SOUTH), Direction.SOUTH)))
         .with(field18681, Boolean.valueOf(this.method11644(var12, var12.method23454(var4, var8, Direction.WEST), Direction.WEST)))
         .with(field18682, Boolean.valueOf(this.method11644(var13, var13.method23454(var4, var9, Direction.NORTH), Direction.NORTH)))
         .with(field18683, Boolean.valueOf(this.method11644(var14, var14.method23454(var4, var10, Direction.EAST), Direction.EAST)))
         .with(field18684, Boolean.valueOf(var6.getFluid() == Fluids.WATER));
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field18684)) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      return var2.getAxis().method326() != Direction.Plane.HORIZONTAL
         ? super.updatePostPlacement(var1, var2, var3, var4, var5, var6)
         : var1.with(field18685.get(var2), Boolean.valueOf(this.method11644(var3, var3.method23454(var4, var6, var2.getOpposite()), var2.getOpposite())));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18680, field18681, field18683, field18682, field18684);
   }
}
