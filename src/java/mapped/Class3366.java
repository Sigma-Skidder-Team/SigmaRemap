package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Util;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.GameRules;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class Class3366 extends Class3241 {
   private static final Direction[] field18934 = new Direction[]{Direction.WEST, Direction.EAST, Direction.SOUTH};
   public static final DirectionProperty field18935 = HorizontalBlock.HORIZONTAL_FACING;
   public static final IntegerProperty field18936 = BlockStateProperties.HONEY_LEVEL;

   public Class3366(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18936, Integer.valueOf(0)).with(field18935, Direction.NORTH));
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return var1.<Integer>get(field18936);
   }

   @Override
   public void method11562(World var1, PlayerEntity var2, BlockPos var3, BlockState var4, TileEntity var5, ItemStack var6) {
      super.method11562(var1, var2, var3, var4, var5, var6);
      if (!var1.isRemote && var5 instanceof BeehiveTileEntity) {
         BeehiveTileEntity var9 = (BeehiveTileEntity)var5;
         if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, var6) == 0) {
            var9.method3915(var2, var4, Class2084.field13573);
            var1.updateComparatorOutputLevel(var3, this);
            this.method11943(var1, var3);
         }

         CriteriaTriggers.field44501.method15076((ServerPlayerEntity)var2, var4.getBlock(), var6, var9.method3918());
      }
   }

   private void method11943(World var1, BlockPos var2) {
      List<BeeEntity> var5 = var1.getEntitiesWithinAABB(BeeEntity.class, new AxisAlignedBB(var2).grow(8.0, 6.0, 8.0));
      if (!var5.isEmpty()) {
         List var6 = var1.<PlayerEntity>getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(var2).grow(8.0, 6.0, 8.0));
         int var7 = var6.size();

         for (BeeEntity var9 : var5) {
            if (var9.method4232() == null) {
               var9.method4233((LivingEntity)var6.get(var1.rand.nextInt(var7)));
            }
         }
      }
   }

   public static void method11944(World var0, BlockPos var1) {
      method11557(var0, var1, new ItemStack(Items.field38174, 3));
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      ItemStack var9 = var4.getHeldItem(var5);
      int var10 = var1.<Integer>get(field18936);
      boolean var11 = false;
      if (var10 >= 5) {
         if (var9.getItem() != Items.field37956) {
            if (var9.getItem() == Items.field37972) {
               var9.shrink(1);
               var2.playSound(var4, var4.getPosX(), var4.getPosY(), var4.getPosZ(), SoundEvents.field26418, SoundCategory.field14734, 1.0F, 1.0F);
               if (!var9.isEmpty()) {
                  if (!var4.inventory.method4045(new ItemStack(Items.field38177))) {
                     var4.dropItem(new ItemStack(Items.field38177), false);
                  }
               } else {
                  var4.setHeldItem(var5, new ItemStack(Items.field38177));
               }

               var11 = true;
            }
         } else {
            var2.playSound(var4, var4.getPosX(), var4.getPosY(), var4.getPosZ(), SoundEvents.field26398, SoundCategory.field14734, 1.0F, 1.0F);
            method11944(var2, var3);
            var9.damageItem(1, var4, var1x -> var1x.sendBreakAnimation(var5));
            var11 = true;
         }
      }

      if (!var11) {
         return super.onBlockActivated(var1, var2, var3, var4, var5, var6);
      } else {
         if (Class3244.method11654(var2, var3)) {
            this.method11947(var2, var1, var3);
         } else {
            if (this.method11945(var2, var3)) {
               this.method11943(var2, var3);
            }

            this.method11946(var2, var1, var3, var4, Class2084.field13573);
         }

         return ActionResultType.method9002(var2.isRemote);
      }
   }

   private boolean method11945(World var1, BlockPos var2) {
      TileEntity var5 = var1.getTileEntity(var2);
      if (!(var5 instanceof BeehiveTileEntity)) {
         return false;
      } else {
         BeehiveTileEntity var6 = (BeehiveTileEntity)var5;
         return !var6.method3913();
      }
   }

   public void method11946(World var1, BlockState var2, BlockPos var3, PlayerEntity var4, Class2084 var5) {
      this.method11947(var1, var2, var3);
      TileEntity var8 = var1.getTileEntity(var3);
      if (var8 instanceof BeehiveTileEntity) {
         BeehiveTileEntity var9 = (BeehiveTileEntity)var8;
         var9.method3915(var4, var2, var5);
      }
   }

   public void method11947(World var1, BlockState var2, BlockPos var3) {
      var1.setBlockState(var3, var2.with(field18936, Integer.valueOf(0)), 3);
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Integer>get(field18936) >= 5) {
         for (int var7 = 0; var7 < var4.nextInt(1) + 1; var7++) {
            this.method11948(var2, var3, var1);
         }
      }
   }

   private void method11948(World var1, BlockPos var2, BlockState var3) {
      if (var3.getFluidState().isEmpty() && !(var1.rand.nextFloat() < 0.3F)) {
         VoxelShape var6 = var3.method23414(var1, var2);
         double var7 = var6.getEnd(Direction.Axis.Y);
         if (var7 >= 1.0 && !var3.isIn(BlockTags.field32781)) {
            double var9 = var6.getStart(Direction.Axis.Y);
            if (!(var9 > 0.0)) {
               BlockPos var11 = var2.down();
               BlockState var12 = var1.getBlockState(var11);
               VoxelShape var13 = var12.method23414(var1, var11);
               double var14 = var13.getEnd(Direction.Axis.Y);
               if ((var14 < 1.0 || !var12.method23456(var1, var11)) && var12.getFluidState().isEmpty()) {
                  this.method11949(var1, var2, var6, (double)var2.getY() - 0.05);
               }
            } else {
               this.method11949(var1, var2, var6, (double)var2.getY() + var9 - 0.05);
            }
         }
      }
   }

   private void method11949(World var1, BlockPos var2, VoxelShape var3, double var4) {
      this.method11950(
         var1,
         (double)var2.getX() + var3.getStart(Direction.Axis.X),
         (double)var2.getX() + var3.getEnd(Direction.Axis.X),
         (double)var2.getZ() + var3.getStart(Direction.Axis.Z),
         (double)var2.getZ() + var3.getEnd(Direction.Axis.Z),
         var4
      );
   }

   private void method11950(World var1, double var2, double var4, double var6, double var8, double var10) {
      var1.addParticle(
         ParticleTypes.field34108,
         MathHelper.lerp(var1.rand.nextDouble(), var2, var4),
         var10,
         MathHelper.lerp(var1.rand.nextDouble(), var6, var8),
         0.0,
         0.0,
         0.0
      );
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(field18935, var1.getPlacementHorizontalFacing().getOpposite());
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18936, field18935);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Nullable
   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new BeehiveTileEntity();
   }

   @Override
   public void onBlockHarvested(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      if (!var1.isRemote && var4.isCreative() && var1.getGameRules().getBoolean(GameRules.field24228)) {
         TileEntity var7 = var1.getTileEntity(var2);
         if (var7 instanceof BeehiveTileEntity) {
            BeehiveTileEntity var8 = (BeehiveTileEntity)var7;
            ItemStack var9 = new ItemStack(this);
            int var10 = var3.<Integer>get(field18936);
            boolean var11 = !var8.method3913();
            if (!var11 && var10 == 0) {
               return;
            }

            if (var11) {
               CompoundNBT var12 = new CompoundNBT();
               var12.put("Bees", var8.method3927());
               var9.setTagInfo("BlockEntityTag", var12);
            }

            CompoundNBT var14 = new CompoundNBT();
            var14.putInt("honey_level", var10);
            var9.setTagInfo("BlockStateTag", var14);
            ItemEntity var13 = new ItemEntity(var1, (double)var2.getX(), (double)var2.getY(), (double)var2.getZ(), var9);
            var13.setDefaultPickupDelay();
            var1.addEntity(var13);
         }
      }

      super.onBlockHarvested(var1, var2, var3, var4);
   }

   @Override
   public List<ItemStack> method11697(BlockState var1, Class9464 var2) {
      Entity var5 = var2.<Entity>method36459(Class9525.field44330);
      if (var5 instanceof TntEntity || var5 instanceof CreeperEntity || var5 instanceof WitherSkullEntity || var5 instanceof WitherEntity || var5 instanceof TntMinecartEntity) {
         TileEntity var6 = var2.<TileEntity>method36459(Class9525.field44337);
         if (var6 instanceof BeehiveTileEntity) {
            BeehiveTileEntity var7 = (BeehiveTileEntity)var6;
            var7.method3915((PlayerEntity)null, var1, Class2084.field13573);
         }
      }

      return super.method11697(var1, var2);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var4.getBlockState(var6).getBlock() instanceof Class3399) {
         TileEntity var9 = var4.getTileEntity(var5);
         if (var9 instanceof BeehiveTileEntity) {
            BeehiveTileEntity var10 = (BeehiveTileEntity)var9;
            var10.method3915((PlayerEntity)null, var1, Class2084.field13573);
         }
      }

      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   public static Direction method11951(Random var0) {
      return Util.<Direction>getRandomObject(field18934, var0);
   }
}
