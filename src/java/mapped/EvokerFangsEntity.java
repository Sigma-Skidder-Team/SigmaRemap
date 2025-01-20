package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.UUID;

public class EvokerFangsEntity extends Entity {
   private int field5207;
   private boolean field5208;
   private int field5209 = 22;
   private boolean field5210;
   private LivingEntity field5211;
   private UUID field5212;

   public EvokerFangsEntity(EntityType<? extends EvokerFangsEntity> var1, World var2) {
      super(var1, var2);
   }

   public EvokerFangsEntity(World var1, double var2, double var4, double var6, float var8, int var9, LivingEntity var10) {
      this(EntityType.EVOKER_FANGS, var1);
      this.field5207 = var9;
      this.method3581(var10);
      this.rotationYaw = var8 * (180.0F / (float)Math.PI);
      this.setPosition(var2, var4, var6);
   }

   @Override
   public void registerData() {
   }

   public void method3581(LivingEntity var1) {
      this.field5211 = var1;
      this.field5212 = var1 != null ? var1.getUniqueID() : null;
   }

   @Nullable
   public LivingEntity method3582() {
      if (this.field5211 == null && this.field5212 != null && this.world instanceof ServerWorld) {
         Entity var3 = ((ServerWorld)this.world).getEntityByUuid(this.field5212);
         if (var3 instanceof LivingEntity) {
            this.field5211 = (LivingEntity)var3;
         }
      }

      return this.field5211;
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      this.field5207 = var1.getInt("Warmup");
      if (var1.hasUniqueID("Owner")) {
         this.field5212 = var1.getUniqueID("Owner");
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      var1.putInt("Warmup", this.field5207);
      if (this.field5212 != null) {
         var1.putUniqueID("Owner", this.field5212);
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.world.isRemote) {
         if (--this.field5207 < 0) {
            if (this.field5207 == -8) {
               for (LivingEntity var16 : this.world.<LivingEntity>getEntitiesWithinAABB(LivingEntity.class, this.getBoundingBox().grow(0.2, 0.0, 0.2))) {
                  this.method3583(var16);
               }
            }

            if (!this.field5208) {
               this.world.setEntityState(this, (byte)4);
               this.field5208 = true;
            }

            if (--this.field5209 < 0) {
               this.remove();
            }
         }
      } else if (this.field5210) {
         this.field5209--;
         if (this.field5209 == 14) {
            for (int var17 = 0; var17 < 12; var17++) {
               double var4 = this.getPosX() + (this.rand.nextDouble() * 2.0 - 1.0) * (double)this.getWidth() * 0.5;
               double var6 = this.getPosY() + 0.05 + this.rand.nextDouble();
               double var8 = this.getPosZ() + (this.rand.nextDouble() * 2.0 - 1.0) * (double)this.getWidth() * 0.5;
               double var10 = (this.rand.nextDouble() * 2.0 - 1.0) * 0.3;
               double var12 = 0.3 + this.rand.nextDouble() * 0.3;
               double var14 = (this.rand.nextDouble() * 2.0 - 1.0) * 0.3;
               this.world.addParticle(ParticleTypes.CRIT, var4, var6 + 1.0, var8, var10, var12, var14);
            }
         }
      }
   }

   private void method3583(LivingEntity var1) {
      LivingEntity var4 = this.method3582();
      if (var1.isAlive() && !var1.method3362() && var1 != var4) {
         if (var4 != null) {
            if (var4.isOnSameTeam(var1)) {
               return;
            }

            var1.attackEntityFrom(DamageSource.method31124(this, var4), 6.0F);
         } else {
            var1.attackEntityFrom(DamageSource.field39006, 6.0F);
         }
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      super.handleStatusUpdate(var1);
      if (var1 == 4) {
         this.field5210 = true;
         if (!this.isSilent()) {
            this.world
               .playSound(
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  SoundEvents.field26563,
                  this.getSoundCategory(),
                  1.0F,
                  this.rand.nextFloat() * 0.2F + 0.85F,
                  false
               );
         }
      }
   }

   public float method3584(float var1) {
      if (this.field5210) {
         int var4 = this.field5209 - 2;
         return var4 > 0 ? 1.0F - ((float)var4 - var1) / 20.0F : 1.0F;
      } else {
         return 0.0F;
      }
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnObjectPacket(this);
   }
}
