package mapped;

import com.google.common.collect.Lists;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.ArrayList;
import java.util.UUID;

public class Class905 extends ProjectileEntity {
   private Entity field5163;
   private Direction field5164;
   private int field5165;
   private double field5166;
   private double field5167;
   private double field5168;
   private UUID field5169;

   public Class905(EntityType<? extends Class905> var1, World var2) {
      super(var1, var2);
      this.noClip = true;
   }

   public Class905(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(EntityType.field41076, var1);
      this.setLocationAndAngles(var2, var4, var6, this.rotationYaw, this.rotationPitch);
      this.setMotion(var8, var10, var12);
   }

   public Class905(World var1, LivingEntity var2, Entity var3, Direction.Axis var4) {
      this(EntityType.field41076, var1);
      this.setShooter(var2);
      BlockPos var7 = var2.getPosition();
      double var8 = (double)var7.getX() + 0.5;
      double var10 = (double)var7.getY() + 0.5;
      double var12 = (double)var7.getZ() + 0.5;
      this.setLocationAndAngles(var8, var10, var12, this.rotationYaw, this.rotationPitch);
      this.field5163 = var3;
      this.field5164 = Direction.UP;
      this.method3548(var4);
   }

   @Override
   public Class2266 method2864() {
      return Class2266.field14733;
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.field5163 != null) {
         var1.method104("Target", this.field5163.getUniqueID());
      }

      if (this.field5164 != null) {
         var1.putInt("Dir", this.field5164.getIndex());
      }

      var1.putInt("Steps", this.field5165);
      var1.method108("TXD", this.field5166);
      var1.method108("TYD", this.field5167);
      var1.method108("TZD", this.field5168);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.field5165 = var1.getInt("Steps");
      this.field5166 = var1.getDouble("TXD");
      this.field5167 = var1.getDouble("TYD");
      this.field5168 = var1.getDouble("TZD");
      if (var1.contains("Dir", 99)) {
         this.field5164 = Direction.byIndex(var1.getInt("Dir"));
      }

      if (var1.method106("Target")) {
         this.field5169 = var1.method105("Target");
      }
   }

   @Override
   public void registerData() {
   }

   private void method3547(Direction var1) {
      this.field5164 = var1;
   }

   private void method3548(Direction.Axis var1) {
      double var4 = 0.5;
      BlockPos var6;
      if (this.field5163 != null) {
         var4 = (double)this.field5163.getHeight() * 0.5;
         var6 = new BlockPos(this.field5163.getPosX(), this.field5163.getPosY() + var4, this.field5163.getPosZ());
      } else {
         var6 = this.getPosition().down();
      }

      double var7 = (double)var6.getX() + 0.5;
      double var9 = (double)var6.getY() + var4;
      double var11 = (double)var6.getZ() + 0.5;
      Direction var13 = null;
      if (!var6.method8317(this.getPositionVec(), 2.0)) {
         BlockPos var22 = this.getPosition();
         ArrayList var23 = Lists.newArrayList();
         if (var1 != Direction.Axis.X) {
            if (var22.getX() < var6.getX() && this.world.method7007(var22.east())) {
               var23.add(Direction.EAST);
            } else if (var22.getX() > var6.getX() && this.world.method7007(var22.west())) {
               var23.add(Direction.WEST);
            }
         }

         if (var1 != Direction.Axis.Y) {
            if (var22.getY() < var6.getY() && this.world.method7007(var22.up())) {
               var23.add(Direction.UP);
            } else if (var22.getY() > var6.getY() && this.world.method7007(var22.down())) {
               var23.add(Direction.DOWN);
            }
         }

         if (var1 != Direction.Axis.Z) {
            if (var22.getZ() < var6.getZ() && this.world.method7007(var22.south())) {
               var23.add(Direction.SOUTH);
            } else if (var22.getZ() > var6.getZ() && this.world.method7007(var22.north())) {
               var23.add(Direction.NORTH);
            }
         }

         var13 = Direction.getRandomDirection(this.rand);
         if (!var23.isEmpty()) {
            var13 = (Direction)var23.get(this.rand.nextInt(var23.size()));
         } else {
            for (int var24 = 5; !this.world.method7007(var22.offset(var13)) && var24 > 0; var24--) {
               var13 = Direction.getRandomDirection(this.rand);
            }
         }

         var7 = this.getPosX() + (double)var13.getXOffset();
         var9 = this.getPosY() + (double)var13.getYOffset();
         var11 = this.getPosZ() + (double)var13.getZOffset();
      }

      this.method3547(var13);
      double var14 = var7 - this.getPosX();
      double var16 = var9 - this.getPosY();
      double var18 = var11 - this.getPosZ();
      double var20 = (double) MathHelper.sqrt(var14 * var14 + var16 * var16 + var18 * var18);
      if (var20 != 0.0) {
         this.field5166 = var14 / var20 * 0.15;
         this.field5167 = var16 / var20 * 0.15;
         this.field5168 = var18 / var20 * 0.15;
      } else {
         this.field5166 = 0.0;
         this.field5167 = 0.0;
         this.field5168 = 0.0;
      }

      this.isAirBorne = true;
      this.field5165 = 10 + this.rand.nextInt(5) * 10;
   }

   @Override
   public void method3447() {
      if (this.world.method6997() == Difficulty.field14351) {
         this.remove();
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.world.isRemote) {
         if (this.field5163 == null && this.field5169 != null) {
            this.field5163 = ((ServerWorld)this.world).getEntityByUuid(this.field5169);
            if (this.field5163 == null) {
               this.field5169 = null;
            }
         }

         if (this.field5163 == null || !this.field5163.isAlive() || this.field5163 instanceof PlayerEntity && ((PlayerEntity)this.field5163).isSpectator()) {
            if (!this.method3247()) {
               this.setMotion(this.getMotion().add(0.0, -0.04, 0.0));
            }
         } else {
            this.field5166 = MathHelper.clamp(this.field5166 * 1.025, -1.0, 1.0);
            this.field5167 = MathHelper.clamp(this.field5167 * 1.025, -1.0, 1.0);
            this.field5168 = MathHelper.clamp(this.field5168 * 1.025, -1.0, 1.0);
            Vector3d var3 = this.getMotion();
            this.setMotion(
               var3.add((this.field5166 - var3.x) * 0.2, (this.field5167 - var3.y) * 0.2, (this.field5168 - var3.z) * 0.2)
            );
         }

         RayTraceResult var7 = Class9456.method36385(this, this::method3467);
         if (var7.getType() != RayTraceResult.Type.MISS) {
            this.method3464(var7);
         }
      }

      this.doBlockCollisions();
      Vector3d var8 = this.getMotion();
      this.setPosition(this.getPosX() + var8.x, this.getPosY() + var8.y, this.getPosZ() + var8.z);
      Class9456.method36388(this, 0.5F);
      if (!this.world.isRemote) {
         if (this.field5163 != null && !this.field5163.removed) {
            if (this.field5165 > 0) {
               this.field5165--;
               if (this.field5165 == 0) {
                  this.method3548(this.field5164 != null ? this.field5164.getAxis() : null);
               }
            }

            if (this.field5164 != null) {
               BlockPos var4 = this.getPosition();
               Direction.Axis var5 = this.field5164.getAxis();
               if (!this.world.method6765(var4.offset(this.field5164), this)) {
                  BlockPos var6 = this.field5163.getPosition();
                  if (var5 == Direction.Axis.X && var4.getX() == var6.getX()
                     || var5 == Direction.Axis.Z && var4.getZ() == var6.getZ()
                     || var5 == Direction.Axis.Y && var4.getY() == var6.getY()) {
                     this.method3548(var5);
                  }
               } else {
                  this.method3548(var5);
               }
            }
         }
      } else {
         this.world
            .addParticle(
               ParticleTypes.field34067,
               this.getPosX() - var8.x,
               this.getPosY() - var8.y + 0.15,
               this.getPosZ() - var8.z,
               0.0,
               0.0,
               0.0
            );
      }
   }

   @Override
   public boolean method3467(Entity var1) {
      return super.method3467(var1) && !var1.noClip;
   }

   @Override
   public boolean isBurning() {
      return false;
   }

   @Override
   public boolean isInRangeToRenderDist(double var1) {
      return var1 < 16384.0;
   }

   @Override
   public float getBrightness() {
      return 1.0F;
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      Entity var4 = var1.getEntity();
      Entity var5 = this.method3460();
      LivingEntity var6 = !(var5 instanceof LivingEntity) ? null : (LivingEntity)var5;
      boolean var7 = var4.attackEntityFrom(DamageSource.method31116(this, var6).method31130(), 4.0F);
      if (var7) {
         this.applyEnchantments(var6, var4);
         if (var4 instanceof LivingEntity) {
            ((LivingEntity)var4).addPotionEffect(new EffectInstance(Effects.LEVITATION, 200));
         }
      }
   }

   @Override
   public void method3466(BlockRayTraceResult var1) {
      super.method3466(var1);
      ((ServerWorld)this.world).spawnParticle(ParticleTypes.field34070, this.getPosX(), this.getPosY(), this.getPosZ(), 2, 0.2, 0.2, 0.2, 0.0);
      this.playSound(SoundEvents.field27046, 1.0F, 1.0F);
   }

   @Override
   public void method3464(RayTraceResult var1) {
      super.method3464(var1);
      this.remove();
   }

   @Override
   public boolean canBeCollidedWith() {
      return true;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!this.world.isRemote) {
         this.playSound(SoundEvents.field27047, 1.0F, 1.0F);
         ((ServerWorld)this.world).spawnParticle(ParticleTypes.CRIT, this.getPosX(), this.getPosY(), this.getPosZ(), 15, 0.2, 0.2, 0.2, 0.0);
         this.remove();
      }

      return true;
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnObjectPacket(this);
   }
}
