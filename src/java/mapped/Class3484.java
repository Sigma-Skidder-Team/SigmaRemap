package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.block.BushBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3484 extends BushBlock implements IGrowable {
   private static String[] field19341;
   public static final IntegerProperty field19342 = BlockStateProperties.AGE3;
   private static final VoxelShape field19343 = Block.makeCuboidShape(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final VoxelShape field19344 = Block.makeCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public Class3484(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19342, Integer.valueOf(0)));
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return new ItemStack(Items.field38170);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      if (var1.<Integer>get(field19342) != 0) {
         return var1.<Integer>get(field19342) >= 3 ? super.getShape(var1, var2, var3, var4) : field19344;
      } else {
         return field19343;
      }
   }

   @Override
   public boolean ticksRandomly(BlockState var1) {
      return var1.<Integer>get(field19342) < 3;
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      int var7 = var1.<Integer>get(field19342);
      if (var7 < 3 && var4.nextInt(5) == 0 && var2.method7021(var3.up(), 0) >= 9) {
         var2.setBlockState(var3, var1.with(field19342, Integer.valueOf(var7 + 1)), 2);
      }
   }

   @Override
   public void onEntityCollision(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (var4 instanceof LivingEntity && var4.getType() != EntityType.FOX && var4.getType() != EntityType.BEE) {
         var4.setMotionMultiplier(var1, new Vector3d(0.8F, 0.75, 0.8F));
         if (!var2.isRemote && var1.<Integer>get(field19342) > 0 && (var4.lastTickPosX != var4.getPosX() || var4.lastTickPosZ != var4.getPosZ())) {
            double var7 = Math.abs(var4.getPosX() - var4.lastTickPosX);
            double var9 = Math.abs(var4.getPosZ() - var4.lastTickPosZ);
            if (var7 >= 0.003F || var9 >= 0.003F) {
               var4.attackEntityFrom(DamageSource.field39012, 1.0F);
            }
         }
      }
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      int var9 = var1.<Integer>get(field19342);
      boolean var10 = var9 == 3;
      if (!var10 && var4.getHeldItem(var5).getItem() == Items.field37934) {
         return ActionResultType.field14820;
      } else if (var9 <= 1) {
         return super.onBlockActivated(var1, var2, var3, var4, var5, var6);
      } else {
         int var11 = 1 + var2.rand.nextInt(2);
         method11557(var2, var3, new ItemStack(Items.field38170, var11 + (!var10 ? 0 : 1)));
         var2.playSound((PlayerEntity)null, var3, SoundEvents.field27144, SoundCategory.field14732, 1.0F, 0.8F + var2.rand.nextFloat() * 0.4F);
         var2.setBlockState(var3, var1.with(field19342, Integer.valueOf(1)), 2);
         return ActionResultType.method9002(var2.isRemote);
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19342);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return var3.<Integer>get(field19342) < 3;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      int var7 = Math.min(3, var4.<Integer>get(field19342) + 1);
      var1.setBlockState(var3, var4.with(field19342, Integer.valueOf(var7)), 2);
   }
}
