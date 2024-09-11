package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class Class3491 extends Class3490 {
   private static String[] field19356;

   public Class3491(Effect var1, AbstractBlock var2) {
      super(var1, 8, var2);
   }

   @Override
   public boolean method11490(BlockState var1, IBlockReader var2, BlockPos var3) {
      return super.method11490(var1, var2, var3)
         || var1.isIn(Blocks.NETHERRACK)
         || var1.isIn(Blocks.SOUL_SAND)
         || var1.isIn(Blocks.SOUL_SOIL);
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      VoxelShape var7 = this.method11483(var1, var2, var3, ISelectionContext.method14947());
      Vector3d var8 = var7.method19514().method19685();
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
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (!var2.isRemote && var2.method6997() != Difficulty.field14351 && var4 instanceof LivingEntity) {
         LivingEntity var7 = (LivingEntity)var4;
         if (!var7.isInvulnerableTo(DamageSource.field39007)) {
            var7.addPotionEffect(new EffectInstance(Effects.WITHER, 40));
         }
      }
   }
}
