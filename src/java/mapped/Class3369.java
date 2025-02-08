package mapped;

import net.minecraft.block.*;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BellAttachment;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3369 extends ContainerBlock {
   private static String[] field18942;
   public static final DirectionProperty field18943 = HorizontalBlock.HORIZONTAL_FACING;
   public static final EnumProperty<BellAttachment> field18944 = BlockStateProperties.BELL_ATTACHMENT;
   public static final BooleanProperty field18945 = BlockStateProperties.POWERED;
   private static final VoxelShape field18946 = Block.makeCuboidShape(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final VoxelShape field18947 = Block.makeCuboidShape(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final VoxelShape field18948 = Block.makeCuboidShape(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final VoxelShape field18949 = Block.makeCuboidShape(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final VoxelShape field18950 = VoxelShapes.or(field18949, field18948);
   private static final VoxelShape field18951 = VoxelShapes.or(field18950, Block.makeCuboidShape(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final VoxelShape field18952 = VoxelShapes.or(field18950, Block.makeCuboidShape(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final VoxelShape field18953 = VoxelShapes.or(field18950, Block.makeCuboidShape(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final VoxelShape field18954 = VoxelShapes.or(field18950, Block.makeCuboidShape(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final VoxelShape field18955 = VoxelShapes.or(field18950, Block.makeCuboidShape(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final VoxelShape field18956 = VoxelShapes.or(field18950, Block.makeCuboidShape(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final VoxelShape field18957 = VoxelShapes.or(field18950, Block.makeCuboidShape(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));

   public Class3369(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field18943, Direction.NORTH)
            .with(field18944, BellAttachment.field212)
            .with(field18945, Boolean.valueOf(false))
      );
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      boolean var9 = var2.method6780(var3);
      if (var9 != var1.<Boolean>get(field18945)) {
         if (var9) {
            this.method11962(var2, var3, (Direction)null);
         }

         var2.setBlockState(var3, var1.with(field18945, Boolean.valueOf(var9)), 3);
      }
   }

   @Override
   public void method11595(World var1, BlockState var2, BlockRayTraceResult var3, ProjectileEntity var4) {
      Entity var7 = var4.method3460();
      PlayerEntity var8 = !(var7 instanceof PlayerEntity) ? null : (PlayerEntity)var7;
      this.method11960(var1, var2, var3, var8, true);
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      return !this.method11960(var2, var1, var6, var4, true) ? ActionResultType.field14820 : ActionResultType.method9002(var2.isRemote);
   }

   public boolean method11960(World var1, BlockState var2, BlockRayTraceResult var3, PlayerEntity var4, boolean var5) {
      Direction var8 = var3.getFace();
      BlockPos var9 = var3.getPos();
      boolean var10 = !var5 || this.method11961(var2, var8, var3.getHitVec().y - (double)var9.getY());
      if (!var10) {
         return false;
      } else {
         boolean var11 = this.method11962(var1, var9, var8);
         if (var11 && var4 != null) {
            var4.method2911(Stats.field40172);
         }

         return true;
      }
   }

   private boolean method11961(BlockState var1, Direction var2, double var3) {
      if (var2.getAxis() != Direction.Axis.Y && !(var3 > 0.8124F)) {
         Direction var7 = var1.<Direction>get(field18943);
         BellAttachment var8 = var1.<BellAttachment>get(field18944);
         switch (Class7106.field30622[var8.ordinal()]) {
            case 1:
               return var7.getAxis() == var2.getAxis();
            case 2:
            case 3:
               return var7.getAxis() != var2.getAxis();
            case 4:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean method11962(World var1, BlockPos var2, Direction var3) {
      TileEntity var6 = var1.getTileEntity(var2);
      if (!var1.isRemote && var6 instanceof Class966) {
         if (var3 == null) {
            var3 = var1.getBlockState(var2).<Direction>get(field18943);
         }

         ((Class966)var6).method3991(var3);
         var1.playSound((PlayerEntity)null, var2, SoundEvents.field26400, SoundCategory.field14732, 2.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }

   private VoxelShape method11963(BlockState var1) {
      Direction var4 = var1.<Direction>get(field18943);
      BellAttachment var5 = var1.<BellAttachment>get(field18944);
      if (var5 != BellAttachment.field212) {
         if (var5 != BellAttachment.field213) {
            if (var5 != BellAttachment.field215) {
               if (var4 != Direction.NORTH) {
                  if (var4 != Direction.SOUTH) {
                     return var4 != Direction.EAST ? field18953 : field18954;
                  } else {
                     return field18956;
                  }
               } else {
                  return field18955;
               }
            } else {
               return var4 != Direction.NORTH && var4 != Direction.SOUTH ? field18952 : field18951;
            }
         } else {
            return field18957;
         }
      } else {
         return var4 != Direction.NORTH && var4 != Direction.SOUTH ? field18947 : field18946;
      }
   }

   @Override
   public VoxelShape getCollisionShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.method11963(var1);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.method11963(var1);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      Direction var4 = var1.getFace();
      BlockPos var5 = var1.getPos();
      World var6 = var1.getWorld();
      Direction.Axis var7 = var4.getAxis();
      if (var7 != Direction.Axis.Y) {
         boolean var8 = var7 == Direction.Axis.X
               && var6.getBlockState(var5.west()).method23454(var6, var5.west(), Direction.EAST)
               && var6.getBlockState(var5.east()).method23454(var6, var5.east(), Direction.WEST)
            || var7 == Direction.Axis.Z
               && var6.getBlockState(var5.north()).method23454(var6, var5.north(), Direction.SOUTH)
               && var6.getBlockState(var5.south()).method23454(var6, var5.south(), Direction.NORTH);
         BlockState var9 = this.getDefaultState().with(field18943, var4.getOpposite()).with(field18944, !var8 ? BellAttachment.field214 : BellAttachment.field215);
         if (var9.isValidPosition(var1.getWorld(), var1.getPos())) {
            return var9;
         }

         boolean var10 = var6.getBlockState(var5.down()).method23454(var6, var5.down(), Direction.UP);
         var9 = var9.with(field18944, !var10 ? BellAttachment.field213 : BellAttachment.field212);
         if (var9.isValidPosition(var1.getWorld(), var1.getPos())) {
            return var9;
         }
      } else {
         BlockState var11 = this.getDefaultState()
            .with(field18944, var4 != Direction.DOWN ? BellAttachment.field212 : BellAttachment.field213)
            .with(field18943, var1.getPlacementHorizontalFacing());
         if (var11.isValidPosition(var1.getWorld(), var5)) {
            return var11;
         }
      }

      return null;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      BellAttachment var9 = var1.<BellAttachment>get(field18944);
      Direction var10 = method11964(var1).getOpposite();
      if (var10 == var2 && !var1.isValidPosition(var4, var5) && var9 != BellAttachment.field215) {
         return Blocks.AIR.getDefaultState();
      } else {
         if (var2.getAxis() == var1.<Direction>get(field18943).getAxis()) {
            if (var9 == BellAttachment.field215 && !var3.method23454(var4, var6, var2)) {
               return var1.with(field18944, BellAttachment.field214).with(field18943, var2.getOpposite());
            }

            if (var9 == BellAttachment.field214 && var10.getOpposite() == var2 && var3.method23454(var4, var6, var1.<Direction>get(field18943))) {
               return var1.with(field18944, BellAttachment.field215);
            }
         }

         return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      Direction var6 = method11964(var1).getOpposite();
      return var6 != Direction.UP ? Class3200.method11508(var2, var3, var6) : Block.method11548(var2, var3.up(), Direction.DOWN);
   }

   private static Direction method11964(BlockState var0) {
      switch (Class7106.field30622[var0.<BellAttachment>get(field18944).ordinal()]) {
         case 1:
            return Direction.UP;
         case 4:
            return Direction.DOWN;
         default:
            return var0.<Direction>get(field18943).getOpposite();
      }
   }

   @Override
   public PushReaction method11689(BlockState var1) {
      return PushReaction.field15863;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18943, field18944, field18945);
   }

   @Nullable
   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class966();
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
