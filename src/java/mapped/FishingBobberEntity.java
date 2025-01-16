package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FishingBobberEntity extends ProjectileEntity {
   private static String[] field5147;
   private final Random field5148 = new Random();
   private boolean field5149;
   private int field5150;
   private static final DataParameter<Integer> field5151 = EntityDataManager.<Integer>createKey(FishingBobberEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Boolean> field5152 = EntityDataManager.<Boolean>createKey(FishingBobberEntity.class, DataSerializers.field33398);
   private int field5153;
   private int field5154;
   private int field5155;
   private int field5156;
   private float field5157;
   private boolean field5158 = true;
   private Entity field5159;
   private Class2152 field5160 = Class2152.field14071;
   private final int field5161;
   private final int field5162;

   private FishingBobberEntity(World var1, PlayerEntity var2, int var3, int var4) {
      super(EntityType.FISHING_BOBBER, var1);
      this.ignoreFrustumCheck = true;
      this.setShooter(var2);
      var2.field4930 = this;
      this.field5161 = Math.max(0, var3);
      this.field5162 = Math.max(0, var4);
   }

   public FishingBobberEntity(World var1, PlayerEntity var2, double var3, double var5, double var7) {
      this(var1, var2, 0, 0);
      this.setPosition(var3, var5, var7);
      this.prevPosX = this.getPosX();
      this.prevPosY = this.getPosY();
      this.prevPosZ = this.getPosZ();
   }

   public FishingBobberEntity(PlayerEntity var1, World var2, int var3, int var4) {
      this(var2, var1, var3, var4);
      float var7 = var1.rotationPitch;
      float var8 = var1.rotationYaw;
      float var9 = MathHelper.cos(-var8 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var10 = MathHelper.sin(-var8 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var11 = -MathHelper.cos(-var7 * (float) (Math.PI / 180.0));
      float var12 = MathHelper.sin(-var7 * (float) (Math.PI / 180.0));
      double var13 = var1.getPosX() - (double)var10 * 0.3;
      double var15 = var1.getPosYEye();
      double var17 = var1.getPosZ() - (double)var9 * 0.3;
      this.setLocationAndAngles(var13, var15, var17, var8, var7);
      Vector3d var19 = new Vector3d((double)(-var10), (double) MathHelper.clamp(-(var12 / var11), -5.0F, 5.0F), (double)(-var9));
      double var20 = var19.length();
      var19 = var19.mul(
         0.6 / var20 + 0.5 + this.rand.nextGaussian() * 0.0045,
         0.6 / var20 + 0.5 + this.rand.nextGaussian() * 0.0045,
         0.6 / var20 + 0.5 + this.rand.nextGaussian() * 0.0045
      );
      this.setMotion(var19);
      this.rotationYaw = (float)(MathHelper.method37814(var19.x, var19.z) * 180.0F / (float)Math.PI);
      this.rotationPitch = (float)(MathHelper.method37814(var19.y, (double) MathHelper.sqrt(horizontalMag(var19))) * 180.0F / (float)Math.PI);
      this.prevRotationYaw = this.rotationYaw;
      this.prevRotationPitch = this.rotationPitch;
   }

   @Override
   public void registerData() {
      this.getDataManager().register(field5151, 0);
      this.getDataManager().register(field5152, false);
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (field5151.equals(var1)) {
         int var4 = this.getDataManager().<Integer>method35445(field5151);
         this.field5159 = var4 <= 0 ? null : this.world.getEntityByID(var4 - 1);
      }

      if (field5152.equals(var1)) {
         this.field5149 = this.getDataManager().<Boolean>method35445(field5152);
         if (this.field5149) {
            this.setMotion(this.getMotion().x, (double)(-0.4F * MathHelper.method37783(this.field5148, 0.6F, 1.0F)), this.getMotion().z);
         }
      }

      super.notifyDataManagerChange(var1);
   }

   @Override
   public boolean isInRangeToRenderDist(double var1) {
      double var5 = 64.0;
      return var1 < 4096.0;
   }

   @Override
   public void setPositionAndRotationDirect(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
   }

   @Override
   public void tick() {
      this.field5148.setSeed(this.getUniqueID().getLeastSignificantBits() ^ this.world.getGameTime());
      super.tick();
      PlayerEntity var3 = this.method3544();
      if (var3 != null) {
         if (this.world.isRemote || !this.method3534(var3)) {
            if (!this.onGround) {
               this.field5153 = 0;
            } else {
               this.field5153++;
               if (this.field5153 >= 1200) {
                  this.remove();
                  return;
               }
            }

            float var4 = 0.0F;
            BlockPos var5 = this.getPosition();
            FluidState var6 = this.world.getFluidState(var5);
            if (var6.method23486(FluidTags.field40469)) {
               var4 = var6.method23475(this.world, var5);
            }

            boolean var7 = var4 > 0.0F;
            if (this.field5160 != Class2152.field14071) {
               if (this.field5160 == Class2152.field14072) {
                  if (this.field5159 != null) {
                     if (!this.field5159.removed) {
                        this.setPosition(this.field5159.getPosX(), this.field5159.getPosYHeight(0.8), this.field5159.getPosZ());
                     } else {
                        this.field5159 = null;
                        this.field5160 = Class2152.field14071;
                     }
                  }

                  return;
               }

               if (this.field5160 == Class2152.field14073) {
                  Vector3d var10 = this.getMotion();
                  double var11 = this.getPosY() + var10.y - (double)var5.getY() - (double)var4;
                  if (Math.abs(var11) < 0.01) {
                     var11 += Math.signum(var11) * 0.1;
                  }

                  this.setMotion(var10.x * 0.9, var10.y - var11 * (double)this.rand.nextFloat() * 0.2, var10.z * 0.9);
                  if (this.field5154 <= 0 && this.field5156 <= 0) {
                     this.field5158 = true;
                  } else {
                     this.field5158 = this.field5158 && this.field5150 < 10 && this.method3538(var5);
                  }

                  if (!var7) {
                     this.field5150 = Math.min(10, this.field5150 + 1);
                  } else {
                     this.field5150 = Math.max(0, this.field5150 - 1);
                     if (this.field5149) {
                        this.setMotion(this.getMotion().add(0.0, -0.1 * (double)this.field5148.nextFloat() * (double)this.field5148.nextFloat(), 0.0));
                     }

                     if (!this.world.isRemote) {
                        this.method3537(var5);
                     }
                  }
               }
            } else {
               if (this.field5159 != null) {
                  this.setMotion(Vector3d.ZERO);
                  this.field5160 = Class2152.field14072;
                  return;
               }

               if (var7) {
                  this.setMotion(this.getMotion().mul(0.3, 0.2, 0.3));
                  this.field5160 = Class2152.field14073;
                  return;
               }

               this.method3535();
            }

            if (!var6.method23486(FluidTags.field40469)) {
               this.setMotion(this.getMotion().add(0.0, -0.03, 0.0));
            }

            this.move(MoverType.SELF, this.getMotion());
            this.method3468();
            if (this.field5160 == Class2152.field14071 && (this.onGround || this.collidedHorizontally)) {
               this.setMotion(Vector3d.ZERO);
            }

            double var8 = 0.92;
            this.setMotion(this.getMotion().scale(0.92));
            this.recenterBoundingBox();
         }
      } else {
         this.remove();
      }
   }

   private boolean method3534(PlayerEntity var1) {
      ItemStack var4 = var1.getHeldItemMainhand();
      ItemStack var5 = var1.getHeldItemOffhand();
      boolean var6 = var4.getItem() == Items.field37906;
      boolean var7 = var5.getItem() == Items.field37906;
      if (!var1.removed && var1.isAlive() && (var6 || var7) && !(this.getDistanceSq(var1) > 1024.0)) {
         return false;
      } else {
         this.remove();
         return true;
      }
   }

   private void method3535() {
      RayTraceResult var3 = ProjectileHelper.method36385(this, this::method3467);
      this.method3464(var3);
   }

   @Override
   public boolean method3467(Entity var1) {
      return super.method3467(var1) || var1.isAlive() && var1 instanceof ItemEntity;
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      if (!this.world.isRemote) {
         this.field5159 = var1.getEntity();
         this.method3536();
      }
   }

   @Override
   public void method3466(BlockRayTraceResult var1) {
      super.method3466(var1);
      this.setMotion(this.getMotion().method11333().scale(var1.method31418(this)));
   }

   private void method3536() {
      this.getDataManager().method35446(field5151, this.field5159.getEntityId() + 1);
   }

   private void method3537(BlockPos var1) {
      ServerWorld var4 = (ServerWorld)this.world;
      int var5 = 1;
      BlockPos var6 = var1.up();
      if (this.rand.nextFloat() < 0.25F && this.world.isRainingAt(var6)) {
         var5++;
      }

      if (this.rand.nextFloat() < 0.5F && !this.world.method7022(var6)) {
         var5--;
      }

      if (this.field5154 <= 0) {
         if (this.field5156 <= 0) {
            if (this.field5155 <= 0) {
               this.field5155 = MathHelper.method37782(this.rand, 100, 600);
               this.field5155 = this.field5155 - this.field5162 * 20 * 5;
            } else {
               this.field5155 -= var5;
               float var9 = 0.15F;
               if (this.field5155 >= 20) {
                  if (this.field5155 >= 40) {
                     if (this.field5155 < 60) {
                        var9 = (float)((double)var9 + (double)(60 - this.field5155) * 0.01);
                     }
                  } else {
                     var9 = (float)((double)var9 + (double)(40 - this.field5155) * 0.02);
                  }
               } else {
                  var9 = (float)((double)var9 + (double)(20 - this.field5155) * 0.05);
               }

               if (this.rand.nextFloat() < var9) {
                  float var10 = MathHelper.method37783(this.rand, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
                  float var11 = MathHelper.method37783(this.rand, 25.0F, 60.0F);
                  double var12 = this.getPosX() + (double)(MathHelper.sin(var10) * var11 * 0.1F);
                  double var14 = (double)((float) MathHelper.floor(this.getPosY()) + 1.0F);
                  double var16 = this.getPosZ() + (double)(MathHelper.cos(var10) * var11 * 0.1F);
                  BlockState var18 = var4.getBlockState(new BlockPos(var12, var14 - 1.0, var16));
                  if (var18.isIn(Blocks.WATER)) {
                     var4.spawnParticle(ParticleTypes.field34099, var12, var14, var16, 2 + this.rand.nextInt(2), 0.1F, 0.0, 0.1F, 0.0);
                  }
               }

               if (this.field5155 <= 0) {
                  this.field5157 = MathHelper.method37783(this.rand, 0.0F, 360.0F);
                  this.field5156 = MathHelper.method37782(this.rand, 20, 80);
               }
            }
         } else {
            this.field5156 -= var5;
            if (this.field5156 <= 0) {
               this.playSound(SoundEvents.field26585, 0.25F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
               double var7 = this.getPosY() + 0.5;
               var4.spawnParticle(
                  ParticleTypes.field34052,
                  this.getPosX(),
                  var7,
                  this.getPosZ(),
                  (int)(1.0F + this.getWidth() * 20.0F),
                  (double)this.getWidth(),
                  0.0,
                  (double)this.getWidth(),
                  0.2F
               );
               var4.spawnParticle(
                  ParticleTypes.field34073,
                  this.getPosX(),
                  var7,
                  this.getPosZ(),
                  (int)(1.0F + this.getWidth() * 20.0F),
                  (double)this.getWidth(),
                  0.0,
                  (double)this.getWidth(),
                  0.2F
               );
               this.field5154 = MathHelper.method37782(this.rand, 20, 40);
               this.getDataManager().method35446(field5152, true);
            } else {
               this.field5157 = (float)((double)this.field5157 + this.rand.nextGaussian() * 4.0);
               float var21 = this.field5157 * (float) (Math.PI / 180.0);
               float var22 = MathHelper.sin(var21);
               float var23 = MathHelper.cos(var21);
               double var24 = this.getPosX() + (double)(var22 * (float)this.field5156 * 0.1F);
               double var25 = (double)((float) MathHelper.floor(this.getPosY()) + 1.0F);
               double var26 = this.getPosZ() + (double)(var23 * (float)this.field5156 * 0.1F);
               BlockState var27 = var4.getBlockState(new BlockPos(var24, var25 - 1.0, var26));
               if (var27.isIn(Blocks.WATER)) {
                  if (this.rand.nextFloat() < 0.15F) {
                     var4.spawnParticle(ParticleTypes.field34052, var24, var25 - 0.1F, var26, 1, (double)var22, 0.1, (double)var23, 0.0);
                  }

                  float var19 = var22 * 0.04F;
                  float var20 = var23 * 0.04F;
                  var4.spawnParticle(ParticleTypes.field34073, var24, var25, var26, 0, (double)var20, 0.01, (double)(-var19), 1.0);
                  var4.spawnParticle(ParticleTypes.field34073, var24, var25, var26, 0, (double)(-var20), 0.01, (double)var19, 1.0);
               }
            }
         }
      } else {
         this.field5154--;
         if (this.field5154 <= 0) {
            this.field5155 = 0;
            this.field5156 = 0;
            this.getDataManager().method35446(field5152, false);
         }
      }
   }

   private boolean method3538(BlockPos var1) {
      Class2331 var4 = Class2331.field15949;

      for (int var5 = -1; var5 <= 2; var5++) {
         Class2331 var6 = this.method3539(var1.add(-2, var5, -2), var1.add(2, var5, 2));
         switch (Class8935.field40425[var6.ordinal()]) {
            case 1:
               return false;
            case 2:
               if (var4 == Class2331.field15949) {
                  return false;
               }
               break;
            case 3:
               if (var4 == Class2331.field15947) {
                  return false;
               }
         }

         var4 = var6;
      }

      return true;
   }

   private Class2331 method3539(BlockPos var1, BlockPos var2) {
      return BlockPos.method8360(var1, var2)
         .<Class2331>map(this::method3540)
         .reduce((var0, var1x) -> var0 != var1x ? Class2331.field15949 : var0)
         .orElse(Class2331.field15949);
   }

   private Class2331 method3540(BlockPos var1) {
      BlockState var4 = this.world.getBlockState(var1);
      if (!var4.isAir() && !var4.isIn(Blocks.LILY_PAD)) {
         FluidState var5 = var4.getFluidState();
         return var5.method23486(FluidTags.field40469) && var5.isSource() && var4.method23414(this.world, var1).isEmpty()
            ? Class2331.field15948
            : Class2331.field15949;
      } else {
         return Class2331.field15947;
      }
   }

   public boolean method3541() {
      return this.field5158;
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
   }

   public int method3542(ItemStack var1) {
      PlayerEntity var4 = this.method3544();
      if (!this.world.isRemote && var4 != null) {
         int var5 = 0;
         if (this.field5159 == null) {
            if (this.field5154 > 0) {
               Class9464 var6 = new Class9464((ServerWorld)this.world)
                  .method36454(Class9525.field44335, this.getPositionVec())
                  .method36454(Class9525.field44338, var1)
                  .method36454(Class9525.field44330, this)
                  .method36450(this.rand)
                  .method36453((float)this.field5161 + var4.method2978());
               Class7318 var7 = this.world.getServer().method1411().method1058(Class8793.field39591);
               List<ItemStack> var8 = var7.method23182(var6.method36460(Class8524.field38285));
               CriteriaTriggers.field44494.method15124((ServerPlayerEntity)var4, var1, this, var8);

               for (ItemStack var10 : var8) {
                  ItemEntity var11 = new ItemEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), var10);
                  double var12 = var4.getPosX() - this.getPosX();
                  double var14 = var4.getPosY() - this.getPosY();
                  double var16 = var4.getPosZ() - this.getPosZ();
                  double var18 = 0.1;
                  var11.setMotion(var12 * 0.1, var14 * 0.1 + Math.sqrt(Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16)) * 0.08, var16 * 0.1);
                  this.world.addEntity(var11);
                  var4.world
                     .addEntity(
                        new ExperienceOrbEntity(var4.world, var4.getPosX(), var4.getPosY() + 0.5, var4.getPosZ() + 0.5, this.rand.nextInt(6) + 1)
                     );
                  if (var10.getItem().method11743(ItemTags.field26114)) {
                     var4.addStat(Stats.field40138, 1);
                  }
               }

               var5 = 1;
            }
         } else {
            this.method3543();
            CriteriaTriggers.field44494.method15124((ServerPlayerEntity)var4, var1, this, Collections.<ItemStack>emptyList());
            this.world.setEntityState(this, (byte)31);
            var5 = !(this.field5159 instanceof ItemEntity) ? 5 : 3;
         }

         if (this.onGround) {
            var5 = 2;
         }

         this.remove();
         return var5;
      } else {
         return 0;
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 == 31 && this.world.isRemote && this.field5159 instanceof PlayerEntity && ((PlayerEntity)this.field5159).method2905()) {
         this.method3543();
      }

      super.handleStatusUpdate(var1);
   }

   public void method3543() {
      Entity var3 = this.method3460();
      if (var3 != null) {
         Vector3d var4 = new Vector3d(var3.getPosX() - this.getPosX(), var3.getPosY() - this.getPosY(), var3.getPosZ() - this.getPosZ())
            .scale(0.1);
         this.field5159.setMotion(this.field5159.getMotion().add(var4));
      }
   }

   @Override
   public boolean canTriggerWalking() {
      return false;
   }

   @Override
   public void remove() {
      super.remove();
      PlayerEntity var3 = this.method3544();
      if (var3 != null) {
         var3.field4930 = null;
      }
   }

   @Nullable
   public PlayerEntity method3544() {
      Entity var3 = this.method3460();
      return !(var3 instanceof PlayerEntity) ? null : (PlayerEntity)var3;
   }

   @Nullable
   public Entity method3545() {
      return this.field5159;
   }

   @Override
   public boolean method3367() {
      return false;
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      Entity var3 = this.method3460();
      return new SSpawnObjectPacket(this, var3 != null ? var3.getEntityId() : this.getEntityId());
   }
}
