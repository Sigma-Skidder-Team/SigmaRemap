package net.minecraft.block;

import mapped.*;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ICollisionReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

public class BedBlock extends HorizontalBlock implements ITileEntityProvider {
   public static final EnumProperty<BedPart> PART = BlockStateProperties.PART;
   public static final BooleanProperty field18714 = BlockStateProperties.OCCUPIED;
   public static final VoxelShape field18715 = Block.makeCuboidShape(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   public static final VoxelShape field18716 = Block.makeCuboidShape(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   public static final VoxelShape field18717 = Block.makeCuboidShape(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   public static final VoxelShape field18718 = Block.makeCuboidShape(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   public static final VoxelShape field18719 = Block.makeCuboidShape(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   public static final VoxelShape field18720 = VoxelShapes.method27432(field18715, field18716, field18718);
   public static final VoxelShape field18721 = VoxelShapes.method27432(field18715, field18717, field18719);
   public static final VoxelShape field18722 = VoxelShapes.method27432(field18715, field18716, field18717);
   public static final VoxelShape field18723 = VoxelShapes.method27432(field18715, field18718, field18719);
   private final DyeColor field18724;

   public BedBlock(DyeColor var1, Properties var2) {
      super(var2);
      this.field18724 = var1;
      this.setDefaultState(this.stateContainer.getBaseState().with(PART, BedPart.FOOT).with(field18714, Boolean.valueOf(false)));
   }

   @Nullable
   public static Direction method11678(IBlockReader var0, BlockPos var1) {
      BlockState var4 = var0.getBlockState(var1);
      return !(var4.getBlock() instanceof BedBlock) ? null : var4.<Direction>get(HORIZONTAL_FACING);
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         if (var1.<BedPart>get(PART) != BedPart.HEAD) {
            var3 = var3.offset(var1.<Direction>get(HORIZONTAL_FACING));
            var1 = var2.getBlockState(var3);
            if (!var1.isIn(this)) {
               return ActionResultType.field14819;
            }
         }

         if (method11679(var2)) {
            if (!var1.<Boolean>get(field18714)) {
               var4.method2752(var3).ifLeft(var1x -> {
                  if (var1x != null) {
                     var4.sendStatusMessage(var1x.method8769(), true);
                  }
               });
               return ActionResultType.SUCCESS;
            } else {
               if (!this.method11680(var2, var3)) {
                  var4.sendStatusMessage(new TranslationTextComponent("block.minecraft.bed.occupied"), true);
               }

               return ActionResultType.SUCCESS;
            }
         } else {
            var2.removeBlock(var3, false);
            BlockPos var9 = var3.offset(var1.<Direction>get(HORIZONTAL_FACING).getOpposite());
            if (var2.getBlockState(var9).isIn(this)) {
               var2.removeBlock(var9, false);
            }

            var2.method6757(
               (Entity)null,
               DamageSource.method31128(),
               (Class5924)null,
               (double)var3.getX() + 0.5,
               (double)var3.getY() + 0.5,
               (double)var3.getZ() + 0.5,
               5.0F,
               true,
               Class2141.field14016
            );
            return ActionResultType.SUCCESS;
         }
      } else {
         return ActionResultType.field14819;
      }
   }

   public static boolean method11679(World var0) {
      return var0.getDimensionType().doesBedWork();
   }

   private boolean method11680(World var1, BlockPos var2) {
      List var5 = var1.<VillagerEntity>getEntitiesInAABBexcluding(VillagerEntity.class, new AxisAlignedBB(var2), LivingEntity::isSleeping);
      if (!var5.isEmpty()) {
         ((VillagerEntity)var5.get(0)).wakeUp();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void onFallenUpon(World var1, BlockPos var2, Entity var3, float var4) {
      super.onFallenUpon(var1, var2, var3, var4 * 0.5F);
   }

   @Override
   public void method11568(IBlockReader var1, Entity var2) {
      if (!var2.method3333()) {
         this.method11681(var2);
      } else {
         super.method11568(var1, var2);
      }
   }

   private void method11681(Entity var1) {
      Vector3d var4 = var1.getMotion();
      if (var4.y < 0.0) {
         double var5 = !(var1 instanceof LivingEntity) ? 0.8 : 1.0;
         var1.setMotion(var4.x, -var4.y * 0.66F * var5, var4.z);
      }
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var2 != method11682(var1.<BedPart>get(PART), var1.<Direction>get(HORIZONTAL_FACING))) {
         return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      } else {
         return var3.isIn(this) && var3.get(PART) != var1.get(PART)
            ? var1.with(field18714, var3.<Boolean>get(field18714))
            : Blocks.AIR.getDefaultState();
      }
   }

   private static Direction method11682(BedPart var0, Direction var1) {
      return var0 != BedPart.FOOT ? var1.getOpposite() : var1;
   }

   @Override
   public void onBlockHarvested(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      if (!var1.isRemote && var4.isCreative()) {
         BedPart var7 = var3.<BedPart>get(PART);
         if (var7 == BedPart.FOOT) {
            BlockPos var8 = var2.offset(method11682(var7, var3.<Direction>get(HORIZONTAL_FACING)));
            BlockState var9 = var1.getBlockState(var8);
            if (var9.getBlock() == this && var9.<BedPart>get(PART) == BedPart.HEAD) {
               var1.setBlockState(var8, Blocks.AIR.getDefaultState(), 35);
               var1.method6869(var4, 2001, var8, Block.getStateId(var9));
            }
         }
      }

      super.onBlockHarvested(var1, var2, var3, var4);
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      Direction var4 = var1.getPlacementHorizontalFacing();
      BlockPos var5 = var1.getPos();
      BlockPos var6 = var5.offset(var4);
      return !var1.getWorld().getBlockState(var6).method23441(var1) ? null : this.getDefaultState().with(HORIZONTAL_FACING, var4);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      Direction var7 = method11683(var1).getOpposite();
      switch (Class8903.field40297[var7.ordinal()]) {
         case 1:
            return field18720;
         case 2:
            return field18721;
         case 3:
            return field18722;
         default:
            return field18723;
      }
   }

   public static Direction method11683(BlockState var0) {
      Direction var3 = var0.<Direction>get(HORIZONTAL_FACING);
      return var0.get(PART) != BedPart.HEAD ? var3 : var3.getOpposite();
   }

   public static Class1895 method11684(BlockState var0) {
      BedPart var3 = var0.<BedPart>get(PART);
      return var3 != BedPart.HEAD ? Class1895.field11111 : Class1895.field11110;
   }

   private static boolean method11685(IBlockReader var0, BlockPos var1) {
      return var0.getBlockState(var1.down()).getBlock() instanceof BedBlock;
   }

   public static Optional<Vector3d> method11686(EntityType<?> var0, ICollisionReader var1, BlockPos var2, float var3) {
      Direction var6 = var1.getBlockState(var2).<Direction>get(HORIZONTAL_FACING);
      Direction var7 = var6.rotateY();
      Direction var8 = !var7.hasOrientation(var3) ? var7 : var7.getOpposite();
      if (!method11685(var1, var2)) {
         int[][] var9 = method11692(var6, var8);
         Optional var10 = method11688(var0, var1, var2, var9, true);
         return !var10.isPresent() ? method11688(var0, var1, var2, var9, false) : var10;
      } else {
         return method11687(var0, var1, var2, var6, var8);
      }
   }

   private static Optional<Vector3d> method11687(EntityType<?> var0, ICollisionReader var1, BlockPos var2, Direction var3, Direction var4) {
      int[][] var7 = method11693(var3, var4);
      Optional var8 = method11688(var0, var1, var2, var7, true);
      if (!var8.isPresent()) {
         BlockPos var9 = var2.down();
         Optional var10 = method11688(var0, var1, var9, var7, true);
         if (!var10.isPresent()) {
            int[][] var11 = method11694(var3);
            Optional var12 = method11688(var0, var1, var2, var11, true);
            if (!var12.isPresent()) {
               Optional var13 = method11688(var0, var1, var2, var7, false);
               if (!var13.isPresent()) {
                  Optional var14 = method11688(var0, var1, var9, var7, false);
                  return !var14.isPresent() ? method11688(var0, var1, var2, var11, false) : var14;
               } else {
                  return var13;
               }
            } else {
               return var12;
            }
         } else {
            return var10;
         }
      } else {
         return var8;
      }
   }

   private static Optional<Vector3d> method11688(EntityType<?> var0, ICollisionReader var1, BlockPos var2, int[][] var3, boolean var4) {
      BlockPos.Mutable var7 = new BlockPos.Mutable();

      for (int[] var11 : var3) {
         var7.setPos(var2.getX() + var11[0], var2.getY(), var2.getZ() + var11[1]);
         Vector3d var12 = Class4527.method14428(var0, var1, var7, var4);
         if (var12 != null) {
            return Optional.<Vector3d>of(var12);
         }
      }

      return Optional.<Vector3d>empty();
   }

   @Override
   public PushReaction method11689(BlockState var1) {
      return PushReaction.field15863;
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9886;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(HORIZONTAL_FACING, PART, field18714);
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class967(this.field18724);
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      super.method11563(var1, var2, var3, var4, var5);
      if (!var1.isRemote) {
         BlockPos var8 = var2.offset(var3.<Direction>get(HORIZONTAL_FACING));
         var1.setBlockState(var8, var3.with(PART, BedPart.HEAD), 3);
         var1.func_230547_a_(var2, Blocks.AIR);
         var3.method23424(var1, var2, 3);
      }
   }

   public DyeColor method11690() {
      return this.field18724;
   }

   @Override
   public long method11691(BlockState var1, BlockPos var2) {
      BlockPos var5 = var2.method8350(var1.<Direction>get(HORIZONTAL_FACING), var1.get(PART) != BedPart.HEAD ? 1 : 0);
      return MathHelper.method37810(var5.getX(), var2.getY(), var5.getZ());
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }

   private static int[][] method11692(Direction var0, Direction var1) {
      return (int[][])ArrayUtils.addAll(method11693(var0, var1), method11694(var0));
   }

   private static int[][] method11693(Direction var0, Direction var1) {
      return new int[][]{
         {var1.getXOffset(), var1.getZOffset()},
         {var1.getXOffset() - var0.getXOffset(), var1.getZOffset() - var0.getZOffset()},
         {var1.getXOffset() - var0.getXOffset() * 2, var1.getZOffset() - var0.getZOffset() * 2},
         {-var0.getXOffset() * 2, -var0.getZOffset() * 2},
         {-var1.getXOffset() - var0.getXOffset() * 2, -var1.getZOffset() - var0.getZOffset() * 2},
         {-var1.getXOffset() - var0.getXOffset(), -var1.getZOffset() - var0.getZOffset()},
         {-var1.getXOffset(), -var1.getZOffset()},
         {-var1.getXOffset() + var0.getXOffset(), -var1.getZOffset() + var0.getZOffset()},
         {var0.getXOffset(), var0.getZOffset()},
         {var1.getXOffset() + var0.getXOffset(), var1.getZOffset() + var0.getZOffset()}
      };
   }

   private static int[][] method11694(Direction var0) {
      return new int[][]{{0, 0}, {-var0.getXOffset(), -var0.getZOffset()}};
   }
}
