package mapped;

import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.ChestType;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ChestBlock extends Class3346<ChestTileEntity> implements IWaterLoggable {
   private static String[] field18864;
   public static final DirectionProperty field18865 = HorizontalBlock.HORIZONTAL_FACING;
   public static final EnumProperty<ChestType> TYPE = BlockStateProperties.field39765;
   public static final BooleanProperty field18867 = BlockStateProperties.WATERLOGGED;
   public static final VoxelShape field18868 = Block.makeCuboidShape(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   public static final VoxelShape field18869 = Block.makeCuboidShape(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   public static final VoxelShape field18870 = Block.makeCuboidShape(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   public static final VoxelShape field18871 = Block.makeCuboidShape(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   public static final VoxelShape field18872 = Block.makeCuboidShape(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final Class6139<ChestTileEntity, Optional<IInventory>> field18873 = new Class6140();
   private static final Class6139<ChestTileEntity, Optional<Class949>> field18874 = new Class6142();

   public ChestBlock(Properties var1, Supplier<TileEntityType<? extends ChestTileEntity>> var2) {
      super(var1, var2);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field18865, Direction.NORTH)
            .with(TYPE, ChestType.field379)
            .with(field18867, Boolean.valueOf(false))
      );
   }

   public static Class1895 method11907(BlockState var0) {
      ChestType var3 = var0.<ChestType>get(TYPE);
      if (var3 != ChestType.field379) {
         return var3 != ChestType.RIGHT ? Class1895.field11111 : Class1895.field11110;
      } else {
         return Class1895.field11109;
      }
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9886;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field18867)) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      if (var3.isIn(this) && var2.getAxis().isHorizontal()) {
         ChestType var9 = var3.<ChestType>get(TYPE);
         if (var1.<ChestType>get(TYPE) == ChestType.field379
            && var9 != ChestType.field379
            && var1.<Direction>get(field18865) == var3.<Direction>get(field18865)
            && getDirectionToAttached(var3) == var2.getOpposite()) {
            return var1.with(TYPE, var9.method308());
         }
      } else if (getDirectionToAttached(var1) == var2) {
         return var1.with(TYPE, ChestType.field379);
      }

      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      if (var1.<ChestType>get(TYPE) == ChestType.field379) {
         return field18872;
      } else {
         switch (Class8810.field39644[getDirectionToAttached(var1).ordinal()]) {
            case 1:
            default:
               return field18868;
            case 2:
               return field18869;
            case 3:
               return field18870;
            case 4:
               return field18871;
         }
      }
   }

   public static Direction getDirectionToAttached(BlockState var0) {
      Direction var3 = var0.<Direction>get(field18865);
      return var0.get(TYPE) != ChestType.LEFT ? var3.rotateYCCW() : var3.rotateY();
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      ChestType var4 = ChestType.field379;
      Direction var5 = var1.getPlacementHorizontalFacing().getOpposite();
      FluidState var6 = var1.getWorld().getFluidState(var1.getPos());
      boolean var7 = var1.method18351();
      Direction var8 = var1.getFace();
      if (var8.getAxis().isHorizontal() && var7) {
         Direction var9 = this.method11909(var1, var8.getOpposite());
         if (var9 != null && var9.getAxis() != var8.getAxis()) {
            var5 = var9;
            var4 = var9.rotateYCCW() != var8.getOpposite() ? ChestType.LEFT : ChestType.RIGHT;
         }
      }

      if (var4 == ChestType.field379 && !var7) {
         if (var5 != this.method11909(var1, var5.rotateY())) {
            if (var5 == this.method11909(var1, var5.rotateYCCW())) {
               var4 = ChestType.RIGHT;
            }
         } else {
            var4 = ChestType.LEFT;
         }
      }

      return this.getDefaultState()
         .with(field18865, var5)
         .with(TYPE, var4)
         .with(field18867, Boolean.valueOf(var6.getFluid() == Fluids.WATER));
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field18867) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }

   @Nullable
   private Direction method11909(BlockItemUseContext var1, Direction var2) {
      BlockState var5 = var1.getWorld().getBlockState(var1.getPos().offset(var2));
      return var5.isIn(this) && var5.get(TYPE) == ChestType.field379 ? var5.<Direction>get(field18865) : null;
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof ChestTileEntity) {
            ((ChestTileEntity)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof IInventory) {
            Class7236.method22721(var2, var3, (IInventory)var8);
            var2.updateComparatorOutputLevel(var3, this);
         }

         super.onReplaced(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         Class949 var9 = this.method11528(var1, var2, var3);
         if (var9 != null) {
            var4.method2766(var9);
            var4.addStat(this.method11910());
            Class4388.method13832(var4, true);
         }

         return ActionResultType.field14819;
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   public Class9007<ResourceLocation> method11910() {
      return Stats.field40104.method172(Stats.field40161);
   }

   @Nullable
   public static IInventory method11911(ChestBlock var0, BlockState var1, World var2, BlockPos var3, boolean var4) {
      return var0.method11904(var1, var2, var3, var4).<Optional<IInventory>>method27292(field18873).orElse((IInventory)null);
   }

   @Override
   public Class7995<? extends ChestTileEntity> method11904(BlockState var1, World var2, BlockPos var3, boolean var4) {
      BiPredicate<IWorld, BlockPos> var7;
      if (!var4) {
         var7 = ChestBlock::method11913;
      } else {
         var7 = (var0, var1x) -> false;
      }

      return Class9324.method35243(this.field18859.get(), ChestBlock::method11907, ChestBlock::getDirectionToAttached, field18865, var1, var2, var3, var7);
   }

   @Nullable
   @Override
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      return this.method11904(var1, var2, var3, false).<Optional<Class949>>method27292(field18874).orElse((Class949)null);
   }

   public static Class6139<ChestTileEntity, Float2FloatFunction> method11912(Class942 var0) {
      return new Class6141(var0);
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new ChestTileEntity();
   }

   public static boolean method11913(IWorld var0, BlockPos var1) {
      return method11914(var0, var1) || method11915(var0, var1);
   }

   private static boolean method11914(IBlockReader var0, BlockPos var1) {
      BlockPos var4 = var1.up();
      return var0.getBlockState(var4).method23400(var0, var4);
   }

   private static boolean method11915(IWorld var0, BlockPos var1) {
      List<Class1098> var4 = var0.getEntitiesWithinAABB(
         Class1098.class,
         new AxisAlignedBB(
            (double)var1.getX(),
            (double)(var1.getY() + 1),
            (double)var1.getZ(),
            (double)(var1.getX() + 1),
            (double)(var1.getY() + 2),
            (double)(var1.getZ() + 1)
         )
      );
      if (!var4.isEmpty()) {
         for (Class1098 var6 : var4) {
            if (var6.method4395()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return Container.calcRedstoneFromInventory(method11911(this, var1, var2, var3, false));
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18865, var2.rotate(var1.<Direction>get(field18865)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18865)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18865, TYPE, field18867);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
