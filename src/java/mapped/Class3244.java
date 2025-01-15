package mapped;

import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.crafting.CampfireCookingRecipe;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.GameRules;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.Random;

public class Class3244 extends Class3241 implements IWaterLoggable {
   private static String[] field18696;
   public static final VoxelShape field18697 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final BooleanProperty field18698 = BlockStateProperties.LIT;
   public static final BooleanProperty field18699 = BlockStateProperties.SIGNAL_FIRE;
   public static final BooleanProperty field18700 = BlockStateProperties.WATERLOGGED;
   public static final DirectionProperty field18701 = BlockStateProperties.HORIZONTAL_FACING;
   private static final VoxelShape field18702 = Block.makeCuboidShape(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private final boolean field18703;
   private final int field18704;

   public Class3244(boolean var1, int var2, Properties var3) {
      super(var3);
      this.field18703 = var1;
      this.field18704 = var2;
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field18698, Boolean.valueOf(true))
            .with(field18699, Boolean.valueOf(false))
            .with(field18700, Boolean.valueOf(false))
            .with(field18701, Direction.NORTH)
      );
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      TileEntity var9 = var2.getTileEntity(var3);
      if (var9 instanceof Class945) {
         Class945 var10 = (Class945)var9;
         ItemStack var11 = var4.getHeldItem(var5);
         Optional var12 = var10.method3797(var11);
         if (var12.isPresent()) {
            if (!var2.isRemote && var10.method3798(!var4.abilities.isCreativeMode ? var11 : var11.copy(), ((CampfireCookingRecipe)var12.get()).method14977())) {
               var4.method2911(Stats.field40168);
               return ActionResultType.SUCCESS;
            }

            return ActionResultType.field14819;
         }
      }

      return ActionResultType.field14820;
   }

   @Override
   public void onEntityCollision(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (!var4.isImmuneToFire() && var1.<Boolean>get(field18698) && var4 instanceof LivingEntity && !EnchantmentHelper.method26332((LivingEntity)var4)) {
         var4.attackEntityFrom(DamageSource.field38992, (float)this.field18704);
      }

      super.onEntityCollision(var1, var2, var3, var4);
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof Class945) {
            Class7236.method22724(var2, var3, ((Class945)var8).method3795());
         }

         super.onReplaced(var1, var2, var3, var4, var5);
      }
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      World var4 = var1.getWorld();
      BlockPos var5 = var1.getPos();
      boolean var6 = var4.getFluidState(var5).getFluid() == Fluids.WATER;
      return this.getDefaultState()
         .with(field18700, Boolean.valueOf(var6))
         .with(field18699, Boolean.valueOf(this.method11651(var4.getBlockState(var5.down()))))
         .with(field18698, Boolean.valueOf(!var6))
         .with(field18701, var1.getPlacementHorizontalFacing());
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field18700)) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      return var2 != Direction.DOWN
         ? super.updatePostPlacement(var1, var2, var3, var4, var5, var6)
         : var1.with(field18699, Boolean.valueOf(this.method11651(var3)));
   }

   private boolean method11651(BlockState var1) {
      return var1.isIn(Blocks.field36777);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18697;
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>get(field18698)) {
         if (var4.nextInt(10) == 0) {
            var2.method6745(
               (double)var3.getX() + 0.5,
               (double)var3.getY() + 0.5,
               (double)var3.getZ() + 0.5,
               SoundEvents.field26432,
               SoundCategory.field14732,
               0.5F + var4.nextFloat(),
               var4.nextFloat() * 0.7F + 0.6F,
               false
            );
         }

         if (this.field18703 && var4.nextInt(5) == 0) {
            for (int var7 = 0; var7 < var4.nextInt(1) + 1; var7++) {
               var2.addParticle(
                  ParticleTypes.field34086,
                  (double)var3.getX() + 0.5,
                  (double)var3.getY() + 0.5,
                  (double)var3.getZ() + 0.5,
                  (double)(var4.nextFloat() / 2.0F),
                  5.0E-5,
                  (double)(var4.nextFloat() / 2.0F)
               );
            }
         }
      }
   }

   public static void method11652(IWorld var0, BlockPos var1, BlockState var2) {
      if (var0.isRemote()) {
         for (int var5 = 0; var5 < 20; var5++) {
            method11653((World)var0, var1, var2.<Boolean>get(field18699), true);
         }
      }

      TileEntity var6 = var0.getTileEntity(var1);
      if (var6 instanceof Class945) {
         ((Class945)var6).method3800();
      }
   }

   @Override
   public boolean method11532(IWorld var1, BlockPos var2, BlockState var3, FluidState var4) {
      if (!var3.<Boolean>get(BlockStateProperties.WATERLOGGED) && var4.getFluid() == Fluids.WATER) {
         boolean var7 = var3.<Boolean>get(field18698);
         if (var7) {
            if (!var1.isRemote()) {
               var1.playSound((PlayerEntity)null, var2, SoundEvents.field26611, SoundCategory.field14732, 1.0F, 1.0F);
            }

            method11652(var1, var2, var3);
         }

         var1.setBlockState(var2, var3.with(field18700, Boolean.valueOf(true)).with(field18698, Boolean.valueOf(false)), 3);
         var1.getPendingFluidTicks().scheduleTick(var2, var4.getFluid(), var4.getFluid().getTickRate(var1));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method11595(World var1, BlockState var2, BlockRayTraceResult var3, ProjectileEntity var4) {
      if (!var1.isRemote && var4.isBurning()) {
         Entity var7 = var4.method3460();
         boolean var8 = var7 == null || var7 instanceof PlayerEntity || var1.getGameRules().getBoolean(GameRules.field24224);
         if (var8 && !var2.<Boolean>get(field18698) && !var2.<Boolean>get(field18700)) {
            BlockPos var9 = var3.getPos();
            var1.setBlockState(var9, var2.with(BlockStateProperties.LIT, Boolean.valueOf(true)), 11);
         }
      }
   }

   public static void method11653(World var0, BlockPos var1, boolean var2, boolean var3) {
      Random var6 = var0.method6814();
      Class7435 var7 = !var2 ? ParticleTypes.field34106 : ParticleTypes.field34107;
      var0.method6749(
         var7,
         true,
         (double)var1.getX() + 0.5 + var6.nextDouble() / 3.0 * (double)(!var6.nextBoolean() ? -1 : 1),
         (double)var1.getY() + var6.nextDouble() + var6.nextDouble(),
         (double)var1.getZ() + 0.5 + var6.nextDouble() / 3.0 * (double)(!var6.nextBoolean() ? -1 : 1),
         0.0,
         0.07,
         0.0
      );
      if (var3) {
         var0.addParticle(
            ParticleTypes.field34092,
            (double)var1.getX() + 0.25 + var6.nextDouble() / 2.0 * (double)(!var6.nextBoolean() ? -1 : 1),
            (double)var1.getY() + 0.4,
            (double)var1.getZ() + 0.25 + var6.nextDouble() / 2.0 * (double)(!var6.nextBoolean() ? -1 : 1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean method11654(World var0, BlockPos var1) {
      for (int var4 = 1; var4 <= 5; var4++) {
         BlockPos var5 = var1.method8340(var4);
         BlockState var6 = var0.getBlockState(var5);
         if (method11655(var6)) {
            return true;
         }

         boolean var7 = VoxelShapes.compare(field18702, var6.getCollisionShape(var0, var1, ISelectionContext.method14947()), IBooleanFunction.AND);
         if (var7) {
            BlockState var8 = var0.getBlockState(var5.down());
            return method11655(var8);
         }
      }

      return false;
   }

   public static boolean method11655(BlockState var0) {
      return var0.method23462(field18698) && var0.isIn(BlockTags.field32809) && var0.<Boolean>get(field18698);
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field18700) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18701, var2.rotate(var1.<Direction>get(field18701)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18701)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18698, field18699, field18700, field18701);
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class945();
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }

   public static boolean method11656(BlockState var0) {
      return var0.method23447(BlockTags.field32809, var0x -> var0x.method23462(BlockStateProperties.WATERLOGGED) && var0x.method23462(BlockStateProperties.LIT))
         && !var0.<Boolean>get(BlockStateProperties.WATERLOGGED)
         && !var0.<Boolean>get(BlockStateProperties.LIT);
   }
}
