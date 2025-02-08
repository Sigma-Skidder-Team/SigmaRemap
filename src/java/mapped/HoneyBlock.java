package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Class3231;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class HoneyBlock extends Class3231 {
   private static String[] field18979;
   public static final VoxelShape field18980 = Block.makeCuboidShape(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   public HoneyBlock(Properties var1) {
      super(var1);
   }

   private static boolean method11971(Entity var0) {
      return var0 instanceof LivingEntity || var0 instanceof AbstractMinecartEntity || var0 instanceof TntEntity || var0 instanceof BoatEntity;
   }

   @Override
   public VoxelShape getCollisionShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18980;
   }

   @Override
   public void onFallenUpon(World var1, BlockPos var2, Entity var3, float var4) {
      var3.playSound(SoundEvents.field26664, 1.0F, 1.0F);
      if (!var1.isRemote) {
         var1.setEntityState(var3, (byte)54);
      }

      if (var3.onLivingFall(var4, 0.2F)) {
         var3.playSound(this.field19008.getFallSound(), this.field19008.getVolume() * 0.5F, this.field19008.getPitch() * 0.75F);
      }
   }

   @Override
   public void onEntityCollision(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (this.method11972(var3, var4)) {
         this.method11973(var4, var3);
         this.setSlideVelocity(var4);
         this.method11975(var2, var4);
      }

      super.onEntityCollision(var1, var2, var3, var4);
   }

   private boolean method11972(BlockPos var1, Entity var2) {
      if (var2.isOnGround()) {
         return false;
      } else if (!(var2.getPosY() > (double)var1.getY() + 0.9375 - 1.0E-7)) {
         if (var2.getMotion().y >= -0.08) {
            return false;
         } else {
            double var5 = Math.abs((double)var1.getX() + 0.5 - var2.getPosX());
            double var7 = Math.abs((double)var1.getZ() + 0.5 - var2.getPosZ());
            double var9 = 0.4375 + (double)(var2.getWidth() / 2.0F);
            return var5 + 1.0E-7 > var9 || var7 + 1.0E-7 > var9;
         }
      } else {
         return false;
      }
   }

   private void method11973(Entity var1, BlockPos var2) {
      if (var1 instanceof ServerPlayerEntity && var1.world.getGameTime() % 20L == 0L) {
         CriteriaTriggers.field44500.method15057((ServerPlayerEntity)var1, var1.world.getBlockState(var2));
      }
   }

   private void setSlideVelocity(Entity entity) {
      Vector3d vector3d = entity.getMotion();
      if (!(vector3d.y < -0.13)) {
         entity.setMotion(new Vector3d(vector3d.x, -0.05, vector3d.z));
      } else {
         double d0 = -0.05 / vector3d.y;
         entity.setMotion(new Vector3d(vector3d.x * d0, -0.05, vector3d.z * d0));
      }

      entity.fallDistance = 0.0F;
   }

   private void method11975(World var1, Entity var2) {
      if (method11971(var2)) {
         if (var1.rand.nextInt(5) == 0) {
            var2.playSound(SoundEvents.field26664, 1.0F, 1.0F);
         }

         if (!var1.isRemote && var1.rand.nextInt(5) == 0) {
            var1.setEntityState(var2, (byte)53);
         }
      }
   }

   public static void method11976(Entity var0) {
      method11978(var0, 5);
   }

   public static void livingSlideParticles(Entity var0) {
      method11978(var0, 10);
   }

   private static void method11978(Entity var0, int var1) {
      if (var0.world.isRemote) {
         BlockState var4 = Blocks.HONEY_BLOCK.getDefaultState();

         for (int var5 = 0; var5 < var1; var5++) {
            var0.world.addParticle(new BlockParticleData(ParticleTypes.BLOCK, var4), var0.getPosX(), var0.getPosY(), var0.getPosZ(), 0.0, 0.0, 0.0);
         }
      }
   }
}
