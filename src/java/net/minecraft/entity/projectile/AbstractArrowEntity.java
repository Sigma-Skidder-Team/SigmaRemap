package net.minecraft.entity.projectile;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import mapped.*;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.*;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractArrowEntity extends ProjectileEntity {
   private static final DataParameter<Byte> CRITICAL = EntityDataManager.<Byte>createKey(AbstractArrowEntity.class, DataSerializers.field33390);
   private static final DataParameter<Byte> PIERCE_LEVEL = EntityDataManager.<Byte>createKey(AbstractArrowEntity.class, DataSerializers.field33390);
   private BlockState field5099;
   public boolean field5100;
   public int field5101;
   public AbstractArrowEntityPickupStatus pickupStatus = AbstractArrowEntityPickupStatus.DISALLOWED;
   public int field5103;
   private int ticksInGround;
   private double field5105 = 2.0;
   private int field5106;
   private SoundEvent hitSound = this.getHitEntitySound();
   private IntOpenHashSet field5108;
   private List<Entity> field5109;

   public AbstractArrowEntity(EntityType<? extends AbstractArrowEntity> var1, World var2) {
      super(var1, var2);
   }

   public AbstractArrowEntity(EntityType<? extends AbstractArrowEntity> var1, double var2, double var4, double var6, World var8) {
      this(var1, var8);
      this.setPosition(var2, var4, var6);
   }

   public AbstractArrowEntity(EntityType<? extends AbstractArrowEntity> var1, LivingEntity var2, World var3) {
      this(var1, var2.getPosX(), var2.getPosYEye() - 0.1F, var2.getPosZ(), var3);
      this.setShooter(var2);
      if (var2 instanceof PlayerEntity) {
         this.pickupStatus = AbstractArrowEntityPickupStatus.ALLOWED;
      }
   }

   public void setHitSound(SoundEvent var1) {
      this.hitSound = var1;
   }

   @Override
   public boolean isInRangeToRenderDist(double var1) {
      double var5 = this.getBoundingBox().getAverageEdgeLength() * 10.0;
      if (Double.isNaN(var5)) {
         var5 = 1.0;
      }

      var5 = var5 * 64.0 * getRenderDistanceWeight();
      return var1 < var5 * var5;
   }

   @Override
   public void registerData() {
      this.dataManager.register(CRITICAL, (byte)0);
      this.dataManager.register(PIERCE_LEVEL, (byte)0);
   }

   @Override
   public void shoot(double var1, double var3, double var5, float var7, float var8) {
      super.shoot(var1, var3, var5, var7, var8);
      this.ticksInGround = 0;
   }

   @Override
   public void setPositionAndRotationDirect(double var1, double var3, double var5, float yaw, float pitch, int var9, boolean var10) {
      this.setPosition(var1, var3, var5);
      this.setRotation(yaw, pitch);
   }

   @Override
   public void method3325(double var1, double var3, double var5) {
      super.method3325(var1, var3, var5);
      this.ticksInGround = 0;
   }

   @Override
   public void tick() {
      super.tick();
      boolean var3 = this.method3493();
      Vector3d var4 = this.getMotion();
      if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
         float var5 = MathHelper.sqrt(horizontalMag(var4));
         this.rotationYaw = (float)(MathHelper.method37814(var4.x, var4.z) * 180.0F / (float)Math.PI);
         this.rotationPitch = (float)(MathHelper.method37814(var4.y, (double)var5) * 180.0F / (float)Math.PI);
         this.prevRotationYaw = this.rotationYaw;
         this.prevRotationPitch = this.rotationPitch;
      }

      BlockPos var32 = this.getPosition();
      BlockState var6 = this.world.getBlockState(var32);
      if (!var6.isAir() && !var3) {
         VoxelShape var7 = var6.method23414(this.world, var32);
         if (!var7.isEmpty()) {
            Vector3d var8 = this.getPositionVec();

            for (AxisAlignedBB var23 : var7.method19521()) {
               if (var23.method19668(var32).method19673(var8)) {
                  this.field5100 = true;
                  break;
               }
            }
         }
      }

      if (this.field5103 > 0) {
         this.field5103--;
      }

      if (this.method3253()) {
         this.extinguish();
      }

      if (this.field5100 && !var3) {
         if (this.field5099 != var6 && this.method3472()) {
            this.method3473();
         } else if (!this.world.isRemote) {
            this.method3474();
         }

         this.field5101++;
      } else {
         this.field5101 = 0;
         Vector3d var33 = this.getPositionVec();
         Vector3d var34 = var33.add(var4);
         Object var35 = this.world.rayTraceBlocks(new RayTraceContext(var33, var34, RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, this));
         if (((RayTraceResult)var35).getType() != RayTraceResult.Type.MISS) {
            var34 = ((RayTraceResult)var35).getHitVec();
         }

         while (!this.removed) {
            EntityRayTraceResult var36 = this.method3479(var33, var34);
            if (var36 != null) {
               var35 = var36;
            }

            if (var35 != null && ((RayTraceResult)var35).getType() == RayTraceResult.Type.ENTITY) {
               Entity var24 = ((EntityRayTraceResult)var35).getEntity();
               Entity var25 = this.method3460();
               if (var24 instanceof PlayerEntity && var25 instanceof PlayerEntity && !((PlayerEntity)var25).method2742((PlayerEntity)var24)) {
                  var35 = null;
                  var36 = null;
               }
            }

            if (var35 != null && !var3) {
               this.method3464((RayTraceResult)var35);
               this.isAirBorne = true;
            }

            if (var36 == null || this.method3489() <= 0) {
               break;
            }

            var35 = null;
         }

         var4 = this.getMotion();
         double var10 = var4.x;
         double var12 = var4.y;
         double var14 = var4.z;
         if (this.method3487()) {
            for (int var26 = 0; var26 < 4; var26++) {
               this.world
                  .addParticle(
                     ParticleTypes.CRIT,
                     this.getPosX() + var10 * (double)var26 / 4.0,
                     this.getPosY() + var12 * (double)var26 / 4.0,
                     this.getPosZ() + var14 * (double)var26 / 4.0,
                     -var10,
                     -var12 + 0.2,
                     -var14
                  );
            }
         }

         double var16 = this.getPosX() + var10;
         double var18 = this.getPosY() + var12;
         double var20 = this.getPosZ() + var14;
         float var22 = MathHelper.sqrt(horizontalMag(var4));
         if (!var3) {
            this.rotationYaw = (float)(MathHelper.method37814(var10, var14) * 180.0F / (float)Math.PI);
         } else {
            this.rotationYaw = (float)(MathHelper.method37814(-var10, -var14) * 180.0F / (float)Math.PI);
         }

         this.rotationPitch = (float)(MathHelper.method37814(var12, (double)var22) * 180.0F / (float)Math.PI);
         this.rotationPitch = method3469(this.prevRotationPitch, this.rotationPitch);
         this.rotationYaw = method3469(this.prevRotationYaw, this.rotationYaw);
         float var27 = 0.99F;
         float var28 = 0.05F;
         if (this.isInWater()) {
            for (int var29 = 0; var29 < 4; var29++) {
               float var30 = 0.25F;
               this.world.addParticle(ParticleTypes.field34052, var16 - var10 * 0.25, var18 - var12 * 0.25, var20 - var14 * 0.25, var10, var12, var14);
            }

            var27 = this.method3491();
         }

         this.setMotion(var4.scale((double)var27));
         if (!this.method3247() && !var3) {
            Vector3d var37 = this.getMotion();
            this.setMotion(var37.x, var37.y - 0.05F, var37.z);
         }

         this.setPosition(var16, var18, var20);
         this.doBlockCollisions();
      }
   }

   private boolean method3472() {
      return this.field5100 && this.world.hasNoCollisions(new AxisAlignedBB(this.getPositionVec(), this.getPositionVec()).grow(0.06));
   }

   private void method3473() {
      this.field5100 = false;
      Vector3d var3 = this.getMotion();
      this.setMotion(
         var3.mul((double)(this.rand.nextFloat() * 0.2F), (double)(this.rand.nextFloat() * 0.2F), (double)(this.rand.nextFloat() * 0.2F))
      );
      this.ticksInGround = 0;
   }

   @Override
   public void move(MoverType var1, Vector3d var2) {
      super.move(var1, var2);
      if (var1 != MoverType.SELF && this.method3472()) {
         this.method3473();
      }
   }

   public void method3474() {
      this.ticksInGround++;
      if (this.ticksInGround >= 1200) {
         this.remove();
      }
   }

   private void method3475() {
      if (this.field5109 != null) {
         this.field5109.clear();
      }

      if (this.field5108 != null) {
         this.field5108.clear();
      }
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      Entity var4 = var1.getEntity();
      float var5 = (float)this.getMotion().length();
      int var6 = MathHelper.method37774(MathHelper.clamp((double)var5 * this.field5105, 0.0, 2.147483647E9));
      if (this.method3489() > 0) {
         if (this.field5108 == null) {
            this.field5108 = new IntOpenHashSet(5);
         }

         if (this.field5109 == null) {
            this.field5109 = Lists.newArrayListWithCapacity(5);
         }

         if (this.field5108.size() >= this.method3489() + 1) {
            this.remove();
            return;
         }

         this.field5108.add(var4.getEntityId());
      }

      if (this.method3487()) {
         long var9 = (long)this.rand.nextInt(var6 / 2 + 2);
         var6 = (int)Math.min(var9 + (long)var6, 2147483647L);
      }

      Entity var7 = this.method3460();
      DamageSource var8;
      if (var7 != null) {
         var8 = DamageSource.method31118(this, var7);
         if (var7 instanceof LivingEntity) {
            ((LivingEntity)var7).setLastAttackedEntity(var4);
         }
      } else {
         var8 = DamageSource.method31118(this, this);
      }

      boolean var11 = var4.getType() == EntityType.ENDERMAN;
      int var12 = var4.getFireTimer();
      if (this.isBurning() && !var11) {
         var4.setFire(5);
      }

      if (!var4.attackEntityFrom(var8, (float)var6)) {
         var4.forceFireTicks(var12);
         this.setMotion(this.getMotion().scale(-0.1));
         this.rotationYaw += 180.0F;
         this.prevRotationYaw += 180.0F;
         if (!this.world.isRemote && this.getMotion().lengthSquared() < 1.0E-7) {
            if (this.pickupStatus == AbstractArrowEntityPickupStatus.ALLOWED) {
               this.method3303(this.method3480(), 0.1F);
            }

            this.remove();
         }
      } else {
         if (var11) {
            return;
         }

         if (var4 instanceof LivingEntity) {
            LivingEntity var13 = (LivingEntity)var4;
            if (!this.world.isRemote && this.method3489() <= 0) {
               var13.method3077(var13.method3076() + 1);
            }

            if (this.field5106 > 0) {
               Vector3d var14 = this.getMotion().mul(1.0, 0.0, 1.0).method11333().scale((double)this.field5106 * 0.6);
               if (var14.lengthSquared() > 0.0) {
                  var13.addVelocity(var14.x, 0.1, var14.z);
               }
            }

            if (!this.world.isRemote && var7 instanceof LivingEntity) {
               EnchantmentHelper.applyThornEnchantments(var13, var7);
               EnchantmentHelper.applyArthropodEnchantments((LivingEntity)var7, var13);
            }

            this.method3478(var13);
            if (var7 != null && var13 != var7 && var13 instanceof PlayerEntity && var7 instanceof ServerPlayerEntity && !this.isSilent()) {
               ((ServerPlayerEntity)var7).connection.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field24566, 0.0F));
            }

            if (!var4.isAlive() && this.field5109 != null) {
               this.field5109.add(var13);
            }

            if (!this.world.isRemote && var7 instanceof ServerPlayerEntity) {
               ServerPlayerEntity var15 = (ServerPlayerEntity)var7;
               if (this.field5109 != null && this.method3488()) {
                  CriteriaTriggers.field44497.method15149(var15, this.field5109);
               } else if (!var4.isAlive() && this.method3488()) {
                  CriteriaTriggers.field44497.method15149(var15, Arrays.<Entity>asList(var4));
               }
            }
         }

         this.playSound(this.hitSound, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
         if (this.method3489() <= 0) {
            this.remove();
         }
      }
   }

   @Override
   public void method3466(BlockRayTraceResult var1) {
      this.field5099 = this.world.getBlockState(var1.getPos());
      super.method3466(var1);
      Vector3d var4 = var1.getHitVec().method11337(this.getPosX(), this.getPosY(), this.getPosZ());
      this.setMotion(var4);
      Vector3d var5 = var4.method11333().scale(0.05F);
      this.setRawPosition(this.getPosX() - var5.x, this.getPosY() - var5.y, this.getPosZ() - var5.z);
      this.playSound(this.method3477(), 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
      this.field5100 = true;
      this.field5103 = 7;
      this.method3484(false);
      this.method3485((byte)0);
      this.setHitSound(SoundEvents.field26361);
      this.method3494(false);
      this.method3475();
   }

   public SoundEvent getHitEntitySound() {
      return SoundEvents.field26361;
   }

   public final SoundEvent method3477() {
      return this.hitSound;
   }

   public void method3478(LivingEntity var1) {
   }

   @Nullable
   public EntityRayTraceResult method3479(Vector3d var1, Vector3d var2) {
      return ProjectileHelper.method36387(this.world, this, var1, var2, this.getBoundingBox().expand(this.getMotion()).grow(1.0), this::method3467);
   }

   @Override
   public boolean method3467(Entity var1) {
      return super.method3467(var1) && (this.field5108 == null || !this.field5108.contains(var1.getEntityId()));
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putShort("life", (short)this.ticksInGround);
      if (this.field5099 != null) {
         var1.put("inBlockState", NBTUtil.writeBlockState(this.field5099));
      }

      var1.putByte("shake", (byte)this.field5103);
      var1.putBoolean("inGround", this.field5100);
      var1.putByte("pickup", (byte)this.pickupStatus.ordinal());
      var1.putDouble("damage", this.field5105);
      var1.putBoolean("crit", this.method3487());
      var1.putByte("PierceLevel", this.method3489());
      var1.putString("SoundEvent", Registry.field16069.getKey(this.hitSound).toString());
      var1.putBoolean("ShotFromCrossbow", this.method3488());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.ticksInGround = var1.getShort("life");
      if (var1.contains("inBlockState", 10)) {
         this.field5099 = NBTUtil.readBlockState(var1.getCompound("inBlockState"));
      }

      this.field5103 = var1.getByte("shake") & 255;
      this.field5100 = var1.getBoolean("inGround");
      if (var1.contains("damage", 99)) {
         this.field5105 = var1.getDouble("damage");
      }

      if (!var1.contains("pickup", 99)) {
         if (var1.contains("player", 99)) {
            this.pickupStatus = !var1.getBoolean("player") ? AbstractArrowEntityPickupStatus.DISALLOWED : AbstractArrowEntityPickupStatus.ALLOWED;
         }
      } else {
         this.pickupStatus = AbstractArrowEntityPickupStatus.method8902(var1.getByte("pickup"));
      }

      this.method3484(var1.getBoolean("crit"));
      this.method3485(var1.getByte("PierceLevel"));
      if (var1.contains("SoundEvent", 8)) {
         this.hitSound = Registry.field16069.method9187(new ResourceLocation(var1.getString("SoundEvent"))).orElse(this.getHitEntitySound());
      }

      this.method3494(var1.getBoolean("ShotFromCrossbow"));
   }

   @Override
   public void setShooter(Entity var1) {
      super.setShooter(var1);
      if (var1 instanceof PlayerEntity) {
         this.pickupStatus = !((PlayerEntity)var1).abilities.isCreativeMode ? AbstractArrowEntityPickupStatus.ALLOWED : AbstractArrowEntityPickupStatus.field14333;
      }
   }

   @Override
   public void onCollideWithPlayer(PlayerEntity var1) {
      if (!this.world.isRemote && (this.field5100 || this.method3493()) && this.field5103 <= 0) {
         boolean var4 = this.pickupStatus == AbstractArrowEntityPickupStatus.ALLOWED
            || this.pickupStatus == AbstractArrowEntityPickupStatus.field14333 && var1.abilities.isCreativeMode
            || this.method3493() && this.method3460().getUniqueID() == var1.getUniqueID();
         if (this.pickupStatus == AbstractArrowEntityPickupStatus.ALLOWED && !var1.inventory.method4045(this.method3480())) {
            var4 = false;
         }

         if (var4) {
            var1.onItemPickup(this, 1);
            this.remove();
         }
      }
   }

   public abstract ItemStack method3480();

   @Override
   public boolean canTriggerWalking() {
      return false;
   }

   public void method3481(double var1) {
      this.field5105 = var1;
   }

   public double method3482() {
      return this.field5105;
   }

   public void method3483(int var1) {
      this.field5106 = var1;
   }

   @Override
   public boolean canBeAttackedWithItem() {
      return false;
   }

   @Override
   public float getEyeHeight(Pose var1, EntitySize var2) {
      return 0.13F;
   }

   public void method3484(boolean var1) {
      this.method3486(1, var1);
   }

   public void method3485(byte var1) {
      this.dataManager.method35446(PIERCE_LEVEL, var1);
   }

   private void method3486(int var1, boolean var2) {
      byte var5 = this.dataManager.<Byte>method35445(CRITICAL);
      if (!var2) {
         this.dataManager.method35446(CRITICAL, (byte)(var5 & ~var1));
      } else {
         this.dataManager.method35446(CRITICAL, (byte)(var5 | var1));
      }
   }

   public boolean method3487() {
      byte var3 = this.dataManager.<Byte>method35445(CRITICAL);
      return false;
   }

   public boolean method3488() {
      byte var3 = this.dataManager.<Byte>method35445(CRITICAL);
      return false;
   }

   public byte method3489() {
      return this.dataManager.<Byte>method35445(PIERCE_LEVEL);
   }

   public void method3490(LivingEntity var1, float var2) {
      int var5 = EnchantmentHelper.method26322(Enchantments.POWER, var1);
      int var6 = EnchantmentHelper.method26322(Enchantments.PUNCH, var1);
      this.method3481((double)(var2 * 2.0F) + this.rand.nextGaussian() * 0.25 + (double)((float)this.world.method6997().getId() * 0.11F));
      if (var5 > 0) {
         this.method3481(this.method3482() + (double)var5 * 0.5 + 0.5);
      }

      if (var6 > 0) {
         this.method3483(var6);
      }

      if (EnchantmentHelper.method26322(Enchantments.FLAME, var1) > 0) {
         this.setFire(100);
      }
   }

   public float method3491() {
      return 0.6F;
   }

   public void method3492(boolean var1) {
      this.noClip = var1;
      this.method3486(2, var1);
   }

   public boolean method3493() {
      return this.world.isRemote ? (this.dataManager.<Byte>method35445(CRITICAL) & 2) != 0 : this.noClip;
   }

   public void method3494(boolean var1) {
      this.method3486(4, var1);
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      Entity var3 = this.method3460();
      return new SSpawnObjectPacket(this, var3 != null ? var3.getEntityId() : 0);
   }
}
