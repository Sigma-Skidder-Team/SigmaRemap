package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class Class3491 extends Class3490 {
   private static String[] field19356;

   public Class3491(Effect var1, Properties var2) {
      super(var1, 8, var2);
   }

   @Override
   public boolean isValidGround(BlockState state, IBlockReader var2, BlockPos var3) {
      return super.isValidGround(state, var2, var3)
         || state.isIn(Blocks.NETHERRACK)
         || state.isIn(Blocks.SOUL_SAND)
         || state.isIn(Blocks.SOUL_SOIL);
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      VoxelShape var7 = this.getShape(var1, var2, var3, ISelectionContext.method14947());
      Vector3d var8 = var7.getBoundingBox().getCenter();
      double var9 = (double)var3.getX() + var8.x;
      double var11 = (double)var3.getZ() + var8.z;

      for (int var13 = 0; var13 < 3; var13++) {
         if (var4.nextBoolean()) {
            var2.addParticle(
               ParticleTypes.field34092,
               var9 + var4.nextDouble() / 5.0,
               (double)var3.getY() + (0.5 - var4.nextDouble()),
               var11 + var4.nextDouble() / 5.0,
               0.0,
               0.0,
               0.0
            );
         }
      }
   }

   @Override
   public void onEntityCollision(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (!var2.isRemote && var2.method6997() != Difficulty.PEACEFUL && var4 instanceof LivingEntity) {
         LivingEntity var7 = (LivingEntity)var4;
         if (!var7.isInvulnerableTo(DamageSource.field39007)) {
            var7.addPotionEffect(new EffectInstance(Effects.WITHER, 40));
         }
      }
   }
}
