package mapped;

import net.minecraft.block.ContainerBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
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

public abstract class Class3373 extends ContainerBlock implements IWaterLoggable {
   public static final BooleanProperty field18966 = BlockStateProperties.WATERLOGGED;
   public static final VoxelShape field18967 = Block.makeCuboidShape(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final Class9673 field18968;

   public Class3373(Properties var1, Class9673 var2) {
      super(var1);
      this.field18968 = var2;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field18966)) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18967;
   }

   @Override
   public boolean method11564() {
      return true;
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class954();
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      ItemStack var9 = var4.getHeldItem(var5);
      boolean var10 = var9.getItem() instanceof Class3321 && var4.abilities.allowEdit;
      if (!var2.isRemote) {
         TileEntity var11 = var2.getTileEntity(var3);
         if (!(var11 instanceof Class954)) {
            return ActionResultType.field14820;
         } else {
            Class954 var12 = (Class954)var11;
            if (var10) {
               boolean var13 = var12.method3845(((Class3321)var9.getItem()).method11876());
               if (var13 && !var4.isCreative()) {
                  var9.shrink(1);
               }
            }

            return !var12.method3842(var4) ? ActionResultType.field14820 : ActionResultType.SUCCESS;
         }
      } else {
         return !var10 ? ActionResultType.field14819 : ActionResultType.SUCCESS;
      }
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field18966) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }

   public Class9673 method11967() {
      return this.field18968;
   }
}
