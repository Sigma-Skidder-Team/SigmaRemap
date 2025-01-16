package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.List;

public class LightningBoltEntity extends Entity {
   private static String[] field5170;
   private int field5171;
   public long field5172;
   private int field5173;
   private boolean field5174;
   private ServerPlayerEntity field5175;

   public LightningBoltEntity(EntityType<? extends LightningBoltEntity> var1, World var2) {
      super(var1, var2);
      this.ignoreFrustumCheck = true;
      this.field5171 = 2;
      this.field5172 = this.rand.nextLong();
      this.field5173 = this.rand.nextInt(3) + 1;
   }

   public void method3549(boolean var1) {
      this.field5174 = var1;
   }

   @Override
   public SoundCategory getSoundCategory() {
      return SoundCategory.field14731;
   }

   public void method3550(ServerPlayerEntity var1) {
      this.field5175 = var1;
   }

   @Override
   public void tick() {
      super.tick();
      if (this.field5171 == 2) {
         Difficulty var3 = this.world.method6997();
         if (var3 == Difficulty.NORMAL || var3 == Difficulty.HARD) {
            this.method3551(4);
         }

         this.world
            .playSound(
               (PlayerEntity)null,
               this.getPosX(),
               this.getPosY(),
               this.getPosZ(),
               SoundEvents.field26732,
               SoundCategory.field14731,
               10000.0F,
               0.8F + this.rand.nextFloat() * 0.2F
            );
         this.world
            .playSound(
               (PlayerEntity)null,
               this.getPosX(),
               this.getPosY(),
               this.getPosZ(),
               SoundEvents.field26731,
               SoundCategory.field14731,
               2.0F,
               0.5F + this.rand.nextFloat() * 0.2F
            );
      }

      this.field5171--;
      if (this.field5171 < 0) {
         if (this.field5173 != 0) {
            if (this.field5171 < -this.rand.nextInt(10)) {
               this.field5173--;
               this.field5171 = 1;
               this.field5172 = this.rand.nextLong();
               this.method3551(0);
            }
         } else {
            this.remove();
         }
      }

      if (this.field5171 >= 0) {
         if (this.world instanceof ServerWorld) {
            if (!this.field5174) {
               double var4 = 3.0;
               List<Entity> var6 = this.world
                  .getEntitiesInAABBexcluding(
                     this,
                     new AxisAlignedBB(
                        this.getPosX() - 3.0,
                        this.getPosY() - 3.0,
                        this.getPosZ() - 3.0,
                        this.getPosX() + 3.0,
                        this.getPosY() + 6.0 + 3.0,
                        this.getPosZ() + 3.0
                     ),
                     Entity::isAlive
                  );

               for (Entity var8 : var6) {
                  var8.method3353((ServerWorld)this.world, this);
               }

               if (this.field5175 != null) {
                  CriteriaTriggers.field44495.method15099(this.field5175, var6);
               }
            }
         } else {
            this.world.setTimeLightningFlash(2);
         }
      }
   }

   private void method3551(int var1) {
      if (!this.field5174 && !this.world.isRemote && this.world.getGameRules().getBoolean(GameRules.field24223)) {
         BlockPos var4 = this.getPosition();
         BlockState var5 = AbstractFireBlock.method12009(this.world, var4);
         if (this.world.getBlockState(var4).isAir() && var5.isValidPosition(this.world, var4)) {
            this.world.setBlockState(var4, var5);
         }

         for (int var6 = 0; var6 < var1; var6++) {
            BlockPos var7 = var4.add(this.rand.nextInt(3) - 1, this.rand.nextInt(3) - 1, this.rand.nextInt(3) - 1);
            var5 = AbstractFireBlock.method12009(this.world, var7);
            if (this.world.getBlockState(var7).isAir() && var5.isValidPosition(this.world, var7)) {
               this.world.setBlockState(var7, var5);
            }
         }
      }
   }

   @Override
   public boolean isInRangeToRenderDist(double var1) {
      double var5 = 64.0 * getRenderDistanceWeight();
      return var1 < var5 * var5;
   }

   @Override
   public void registerData() {
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnObjectPacket(this);
   }
}
