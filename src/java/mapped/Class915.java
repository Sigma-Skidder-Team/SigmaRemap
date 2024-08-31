package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SSpawnObjectPacket;

import javax.annotation.Nullable;
import java.util.UUID;

public class Class915 extends Entity {
   private int field5207;
   private boolean field5208;
   private int field5209 = 22;
   private boolean field5210;
   private LivingEntity field5211;
   private UUID field5212;

   public Class915(EntityType<? extends Class915> var1, World var2) {
      super(var1, var2);
   }

   public Class915(World var1, double var2, double var4, double var6, float var8, int var9, LivingEntity var10) {
      this(EntityType.field41028, var1);
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
         Entity var3 = ((ServerWorld)this.world).method6942(this.field5212);
         if (var3 instanceof LivingEntity) {
            this.field5211 = (LivingEntity)var3;
         }
      }

      return this.field5211;
   }

   @Override
   public void method2723(CompoundNBT var1) {
      this.field5207 = var1.method122("Warmup");
      if (var1.method106("Owner")) {
         this.field5212 = var1.method105("Owner");
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      var1.method102("Warmup", this.field5207);
      if (this.field5212 != null) {
         var1.method104("Owner", this.field5212);
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.world.isRemote) {
         if (--this.field5207 < 0) {
            if (this.field5207 == -8) {
               for (LivingEntity var16 : this.world.<LivingEntity>method7182(LivingEntity.class, this.getBoundingBox().method19663(0.2, 0.0, 0.2))) {
                  this.method3583(var16);
               }
            }

            if (!this.field5208) {
               this.world.method6786(this, (byte)4);
               this.field5208 = true;
            }

            if (--this.field5209 < 0) {
               this.method2904();
            }
         }
      } else if (this.field5210) {
         this.field5209--;
         if (this.field5209 == 14) {
            for (int var17 = 0; var17 < 12; var17++) {
               double var4 = this.getPosX() + (this.rand.nextDouble() * 2.0 - 1.0) * (double)this.method3429() * 0.5;
               double var6 = this.getPosY() + 0.05 + this.rand.nextDouble();
               double var8 = this.getPosZ() + (this.rand.nextDouble() * 2.0 - 1.0) * (double)this.method3429() * 0.5;
               double var10 = (this.rand.nextDouble() * 2.0 - 1.0) * 0.3;
               double var12 = 0.3 + this.rand.nextDouble() * 0.3;
               double var14 = (this.rand.nextDouble() * 2.0 - 1.0) * 0.3;
               this.world.method6746(ParticleTypes.field34054, var4, var6 + 1.0, var8, var10, var12, var14);
            }
         }
      }
   }

   private void method3583(LivingEntity var1) {
      LivingEntity var4 = this.method3582();
      if (var1.isAlive() && !var1.method3362() && var1 != var4) {
         if (var4 != null) {
            if (var4.method3345(var1)) {
               return;
            }

            var1.method2741(Class8654.method31124(this, var4), 6.0F);
         } else {
            var1.method2741(Class8654.field39006, 6.0F);
         }
      }
   }

   @Override
   public void method2866(byte var1) {
      super.method2866(var1);
      if (var1 == 4) {
         this.field5210 = true;
         if (!this.method3245()) {
            this.world
               .method6745(
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  Sounds.field26563,
                  this.method2864(),
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
   public Packet<?> method2835() {
      return new SSpawnObjectPacket(this);
   }
}
