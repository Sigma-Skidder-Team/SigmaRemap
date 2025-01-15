package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3210 extends Block {
   private static String[] field18617;

   public Class3210(Properties var1) {
      super(var1);
   }

   @Override
   public void onEntityWalk(World var1, BlockPos var2, Entity var3) {
      if (!var3.isImmuneToFire() && var3 instanceof LivingEntity && !EnchantmentHelper.method26332((LivingEntity)var3)) {
         var3.attackEntityFrom(DamageSource.field38996, 1.0F);
      }

      super.onEntityWalk(var1, var2, var3);
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      Class3406.method12045(var2, var3.up(), true);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var2 == Direction.UP && var3.isIn(Blocks.WATER)) {
         var4.getBlockTickScheduler().scheduleTick(var5, this, 20);
      }

      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      BlockPos var7 = var3.up();
      if (var2.getFluidState(var3).method23486(FluidTags.field40469)) {
         var2.playSound(
            (PlayerEntity)null, var3, SoundEvents.field26582, SoundCategory.field14732, 0.5F, 2.6F + (var2.rand.nextFloat() - var2.rand.nextFloat()) * 0.8F
         );
         var2.spawnParticle(
            ParticleTypes.field34085, (double)var7.getX() + 0.5, (double)var7.getY() + 0.25, (double)var7.getZ() + 0.5, 8, 0.5, 0.25, 0.5, 0.0
         );
      }
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      var2.getBlockTickScheduler().scheduleTick(var3, this, 20);
   }
}
