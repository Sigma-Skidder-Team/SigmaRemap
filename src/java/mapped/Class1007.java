package mapped;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.boss.dragon.EnderDragonPartEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.EffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.end.DragonFightManager;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class Class1007 extends MobEntity implements IMob {
   private static final Logger field5618 = LogManager.getLogger();
   public static final DataParameter<Integer> field5619 = EntityDataManager.<Integer>createKey(Class1007.class, DataSerializers.VARINT);
   private static final Class8522 field5620 = new Class8522().method30203(64.0);
   public final double[][] field5621 = new double[64][3];
   public int field5622 = -1;
   private final EnderDragonPartEntity[] field5623;
   public final EnderDragonPartEntity field5624;
   private final EnderDragonPartEntity field5625;
   private final EnderDragonPartEntity field5626;
   private final EnderDragonPartEntity field5627;
   private final EnderDragonPartEntity field5628;
   private final EnderDragonPartEntity field5629;
   private final EnderDragonPartEntity field5630;
   private final EnderDragonPartEntity field5631;
   public float field5632;
   public float field5633;
   public boolean field5634;
   public int field5635;
   public float field5636;
   public EnderCrystalEntity field5637;
   private final DragonFightManager field5638;
   private final Class8942 field5639;
   private int field5640 = 100;
   private int field5641;
   private final Class7176[] field5642 = new Class7176[24];
   private final int[] field5643 = new int[24];
   private final Class8662 field5644 = new Class8662();

   public Class1007(EntityType<? extends Class1007> var1, World var2) {
      super(EntityType.ENDER_DRAGON, var2);
      this.field5624 = new EnderDragonPartEntity(this, "head", 1.0F, 1.0F);
      this.field5625 = new EnderDragonPartEntity(this, "neck", 3.0F, 3.0F);
      this.field5626 = new EnderDragonPartEntity(this, "body", 5.0F, 3.0F);
      this.field5627 = new EnderDragonPartEntity(this, "tail", 2.0F, 2.0F);
      this.field5628 = new EnderDragonPartEntity(this, "tail", 2.0F, 2.0F);
      this.field5629 = new EnderDragonPartEntity(this, "tail", 2.0F, 2.0F);
      this.field5630 = new EnderDragonPartEntity(this, "wing", 4.0F, 2.0F);
      this.field5631 = new EnderDragonPartEntity(this, "wing", 4.0F, 2.0F);
      this.field5623 = new EnderDragonPartEntity[]{
         this.field5624, this.field5625, this.field5626, this.field5627, this.field5628, this.field5629, this.field5630, this.field5631
      };
      this.setHealth(this.method3075());
      this.noClip = true;
      this.ignoreFrustumCheck = true;
      if (!(var2 instanceof ServerWorld)) {
         this.field5638 = null;
      } else {
         this.field5638 = ((ServerWorld)var2).method6968();
      }

      this.field5639 = new Class8942(this);
   }

   public static MutableAttribute method2997() {
      return MobEntity.method4220().method21849(Attributes.MAX_HEALTH, 200.0);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.getDataManager().register(field5619, Class9598.field44906.method37259());
   }

   public double[] method4317(int var1, float var2) {
      if (this.getShouldBeDead()) {
         var2 = 0.0F;
      }

      var2 = 1.0F - var2;
      int var5 = this.field5622 - var1 & 63;
      int var6 = this.field5622 - var1 - 1 & 63;
      double[] var7 = new double[3];
      double var8 = this.field5621[var5][0];
      double var10 = MathHelper.wrapDegrees(this.field5621[var6][0] - var8);
      var7[0] = var8 + var10 * (double)var2;
      var8 = this.field5621[var5][1];
      var10 = this.field5621[var6][1] - var8;
      var7[1] = var8 + var10 * (double)var2;
      var7[2] = MathHelper.lerp((double)var2, this.field5621[var5][2], this.field5621[var6][2]);
      return var7;
   }

   @Override
   public void livingTick() {
      if (this.world.isRemote) {
         this.setHealth(this.getHealth());
         if (!this.isSilent()) {
            float var3 = MathHelper.cos(this.field5633 * (float) (Math.PI * 2));
            float var4 = MathHelper.cos(this.field5632 * (float) (Math.PI * 2));
            if (var4 <= -0.3F && var3 >= -0.3F) {
               this.world
                  .method6745(
                     this.getPosX(),
                     this.getPosY(),
                     this.getPosZ(),
                     SoundEvents.field26539,
                     this.getSoundCategory(),
                     5.0F,
                     0.8F + this.rand.nextFloat() * 0.3F,
                     false
                  );
            }

            if (!this.field5639.method32672().method23358() && --this.field5640 < 0) {
               this.world
                  .method6745(
                     this.getPosX(),
                     this.getPosY(),
                     this.getPosZ(),
                     SoundEvents.field26540,
                     this.getSoundCategory(),
                     2.5F,
                     0.8F + this.rand.nextFloat() * 0.3F,
                     false
                  );
               this.field5640 = 200 + this.rand.nextInt(200);
            }
         }
      }

      this.field5632 = this.field5633;
      if (!this.getShouldBeDead()) {
         this.method4320();
         Vector3d var42 = this.getMotion();
         float var44 = 0.2F / (MathHelper.sqrt(horizontalMag(var42)) * 10.0F + 1.0F);
         var44 *= (float)Math.pow(2.0, var42.y);
         if (!this.field5639.method32672().method23358()) {
            if (!this.field5634) {
               this.field5633 += var44;
            } else {
               this.field5633 += var44 * 0.5F;
            }
         } else {
            this.field5633 += 0.1F;
         }

         this.rotationYaw = MathHelper.wrapDegrees(this.rotationYaw);
         if (!this.method4305()) {
            if (this.field5622 < 0) {
               for (int var5 = 0; var5 < this.field5621.length; var5++) {
                  this.field5621[var5][0] = (double)this.rotationYaw;
                  this.field5621[var5][1] = this.getPosY();
               }
            }

            if (++this.field5622 == this.field5621.length) {
               this.field5622 = 0;
            }

            this.field5621[this.field5622][0] = (double)this.rotationYaw;
            this.field5621[this.field5622][1] = this.getPosY();
            if (!this.world.isRemote) {
               Class7373 var47 = this.field5639.method32672();
               var47.method23360();
               if (this.field5639.method32672() != var47) {
                  var47 = this.field5639.method32672();
                  var47.method23360();
               }

               Vector3d var6 = var47.method23365();
               if (var6 != null) {
                  double var9 = var6.x - this.getPosX();
                  double var11 = var6.y - this.getPosY();
                  double var13 = var6.z - this.getPosZ();
                  double var15 = var9 * var9 + var11 * var11 + var13 * var13;
                  float var17 = var47.method23364();
                  double var18 = (double) MathHelper.sqrt(var9 * var9 + var13 * var13);
                  if (var18 > 0.0) {
                     var11 = MathHelper.clamp(var11 / var18, (double)(-var17), (double)var17);
                  }

                  this.setMotion(this.getMotion().add(0.0, var11 * 0.01, 0.0));
                  this.rotationYaw = MathHelper.wrapDegrees(this.rotationYaw);
                  double var20 = MathHelper.clamp(
                     MathHelper.wrapDegrees(180.0 - MathHelper.method37814(var9, var13) * 180.0F / (float)Math.PI - (double)this.rotationYaw), -50.0, 50.0
                  );
                  Vector3d var22 = var6.method11337(this.getPosX(), this.getPosY(), this.getPosZ()).method11333();
                  Vector3d var23 = new Vector3d(
                        (double) MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0)),
                        this.getMotion().y,
                        (double)(-MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0)))
                     )
                     .method11333();
                  float var24 = Math.max(((float)var23.dotProduct(var22) + 0.5F) / 1.5F, 0.0F);
                  this.field5636 *= 0.8F;
                  this.field5636 = (float)((double)this.field5636 + var20 * (double)var47.method23367());
                  this.rotationYaw = this.rotationYaw + this.field5636 * 0.1F;
                  float var25 = (float)(2.0 / (var15 + 1.0));
                  float var26 = 0.06F;
                  this.moveRelative(0.06F * (var24 * var25 + (1.0F - var25)), new Vector3d(0.0, 0.0, -1.0));
                  if (!this.field5634) {
                     this.move(MoverType.SELF, this.getMotion());
                  } else {
                     this.move(MoverType.SELF, this.getMotion().scale(0.8F));
                  }

                  Vector3d var27 = this.getMotion().method11333();
                  double var28 = 0.8 + 0.15 * (var27.dotProduct(var23) + 1.0) / 2.0;
                  this.setMotion(this.getMotion().mul(var28, 0.91F, var28));
               }
            } else {
               if (this.newPosRotationIncrements > 0) {
                  double var7 = this.getPosX() + (this.interpTargetX - this.getPosX()) / (double)this.newPosRotationIncrements;
                  double var52 = this.getPosY() + (this.interpTargetY - this.getPosY()) / (double)this.newPosRotationIncrements;
                  double var53 = this.getPosZ() + (this.interpTargetZ - this.getPosZ()) / (double)this.newPosRotationIncrements;
                  double var54 = MathHelper.wrapDegrees(this.interpTargetYaw - (double)this.rotationYaw);
                  this.rotationYaw = (float)((double)this.rotationYaw + var54 / (double)this.newPosRotationIncrements);
                  this.rotationPitch = (float)((double)this.rotationPitch + (this.interpTargetPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
                  this.newPosRotationIncrements--;
                  this.setPosition(var7, var52, var53);
                  this.setRotation(this.rotationYaw, this.rotationPitch);
               }

               this.field5639.method32672().method23359();
            }

            this.renderYawOffset = this.rotationYaw;
            Vector3d[] var48 = new Vector3d[this.field5623.length];

            for (int var50 = 0; var50 < this.field5623.length; var50++) {
               var48[var50] = new Vector3d(this.field5623[var50].getPosX(), this.field5623[var50].getPosY(), this.field5623[var50].getPosZ());
            }

            float var51 = (float)(this.method4317(5, 1.0F)[1] - this.method4317(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float var30 = MathHelper.cos(var51);
            float var31 = MathHelper.sin(var51);
            float var32 = this.rotationYaw * (float) (Math.PI / 180.0);
            float var33 = MathHelper.sin(var32);
            float var34 = MathHelper.cos(var32);
            this.method4318(this.field5626, (double)(var33 * 0.5F), 0.0, (double)(-var34 * 0.5F));
            this.method4318(this.field5630, (double)(var34 * 4.5F), 2.0, (double)(var33 * 4.5F));
            this.method4318(this.field5631, (double)(var34 * -4.5F), 2.0, (double)(var33 * -4.5F));
            if (!this.world.isRemote && this.hurtTime == 0) {
               this.method4321(
                  this.world.getEntitiesInAABBexcluding(this, this.field5630.getBoundingBox().grow(4.0, 2.0, 4.0).offset(0.0, -2.0, 0.0), EntityPredicates.field34761)
               );
               this.method4321(
                  this.world.getEntitiesInAABBexcluding(this, this.field5631.getBoundingBox().grow(4.0, 2.0, 4.0).offset(0.0, -2.0, 0.0), EntityPredicates.field34761)
               );
               this.method4322(this.world.getEntitiesInAABBexcluding(this, this.field5624.getBoundingBox().grow(1.0), EntityPredicates.field34761));
               this.method4322(this.world.getEntitiesInAABBexcluding(this, this.field5625.getBoundingBox().grow(1.0), EntityPredicates.field34761));
            }

            float var35 = MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0) - this.field5636 * 0.01F);
            float var36 = MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0) - this.field5636 * 0.01F);
            float var37 = this.method4319();
            this.method4318(this.field5624, (double)(var35 * 6.5F * var30), (double)(var37 + var31 * 6.5F), (double)(-var36 * 6.5F * var30));
            this.method4318(this.field5625, (double)(var35 * 5.5F * var30), (double)(var37 + var31 * 5.5F), (double)(-var36 * 5.5F * var30));
            double[] var55 = this.method4317(5, 1.0F);

            for (int var38 = 0; var38 < 3; var38++) {
               EnderDragonPartEntity var39 = null;
               if (var38 == 0) {
                  var39 = this.field5627;
               }

               if (var38 == 1) {
                  var39 = this.field5628;
               }

               if (var38 == 2) {
                  var39 = this.field5629;
               }

               double[] var40 = this.method4317(12 + var38 * 2, 1.0F);
               float var41 = this.rotationYaw * (float) (Math.PI / 180.0) + this.method4323(var40[0] - var55[0]) * (float) (Math.PI / 180.0);
               float var56 = MathHelper.sin(var41);
               float var57 = MathHelper.cos(var41);
               float var58 = 1.5F;
               float var59 = (float)(var38 + 1) * 2.0F;
               this.method4318(
                  var39,
                  (double)(-(var33 * 1.5F + var56 * var59) * var30),
                  var40[1] - var55[1] - (double)((var59 + 1.5F) * var31) + 1.5,
                  (double)((var34 * 1.5F + var57 * var59) * var30)
               );
            }

            if (!this.world.isRemote) {
               this.field5634 = this.method4324(this.field5624.getBoundingBox())
                  | this.method4324(this.field5625.getBoundingBox())
                  | this.method4324(this.field5626.getBoundingBox());
               if (this.field5638 != null) {
                  this.field5638.method26124(this);
               }
            }

            for (int var60 = 0; var60 < this.field5623.length; var60++) {
               this.field5623[var60].prevPosX = var48[var60].x;
               this.field5623[var60].prevPosY = var48[var60].y;
               this.field5623[var60].prevPosZ = var48[var60].z;
               this.field5623[var60].lastTickPosX = var48[var60].x;
               this.field5623[var60].lastTickPosY = var48[var60].y;
               this.field5623[var60].lastTickPosZ = var48[var60].z;
            }
         } else {
            this.field5633 = 0.5F;
         }
      } else {
         float var43 = (this.rand.nextFloat() - 0.5F) * 8.0F;
         float var46 = (this.rand.nextFloat() - 0.5F) * 4.0F;
         float var49 = (this.rand.nextFloat() - 0.5F) * 8.0F;
         this.world
            .addParticle(
               ParticleTypes.field34070,
               this.getPosX() + (double)var43,
               this.getPosY() + 2.0 + (double)var46,
               this.getPosZ() + (double)var49,
               0.0,
               0.0,
               0.0
            );
      }
   }

   private void method4318(EnderDragonPartEntity var1, double var2, double var4, double var6) {
      var1.setPosition(this.getPosX() + var2, this.getPosY() + var4, this.getPosZ() + var6);
   }

   private float method4319() {
      if (!this.field5639.method32672().method23358()) {
         double[] var3 = this.method4317(5, 1.0F);
         double[] var4 = this.method4317(0, 1.0F);
         return (float)(var3[1] - var4[1]);
      } else {
         return -1.0F;
      }
   }

   private void method4320() {
      if (this.field5637 != null) {
         if (!this.field5637.removed) {
            if (this.ticksExisted % 10 == 0 && this.getHealth() < this.method3075()) {
               this.setHealth(this.getHealth() + 1.0F);
            }
         } else {
            this.field5637 = null;
         }
      }

      if (this.rand.nextInt(10) == 0) {
         List<EnderCrystalEntity> var3 = this.world.<EnderCrystalEntity>getEntitiesWithinAABB(EnderCrystalEntity.class, this.getBoundingBox().grow(32.0));
         EnderCrystalEntity var4 = null;
         double var5 = Double.MAX_VALUE;

         for (EnderCrystalEntity var8 : var3) {
            double var9 = var8.getDistanceSq(this);
            if (var9 < var5) {
               var5 = var9;
               var4 = var8;
            }
         }

         this.field5637 = var4;
      }
   }

   private void method4321(List<Entity> var1) {
      double var4 = (this.field5626.getBoundingBox().minX + this.field5626.getBoundingBox().maxX) / 2.0;
      double var6 = (this.field5626.getBoundingBox().minZ + this.field5626.getBoundingBox().maxZ) / 2.0;

      for (Entity var9 : var1) {
         if (var9 instanceof LivingEntity) {
            double var10 = var9.getPosX() - var4;
            double var12 = var9.getPosZ() - var6;
            double var14 = Math.max(var10 * var10 + var12 * var12, 0.1);
            var9.addVelocity(var10 / var14 * 4.0, 0.2F, var12 / var14 * 4.0);
            if (!this.field5639.method32672().method23358() && ((LivingEntity)var9).method3015() < var9.ticksExisted - 2) {
               var9.attackEntityFrom(DamageSource.method31115(this), 5.0F);
               this.applyEnchantments(this, var9);
            }
         }
      }
   }

   private void method4322(List<Entity> var1) {
      for (Entity var5 : var1) {
         if (var5 instanceof LivingEntity) {
            var5.attackEntityFrom(DamageSource.method31115(this), 10.0F);
            this.applyEnchantments(this, var5);
         }
      }
   }

   private float method4323(double var1) {
      return (float) MathHelper.wrapDegrees(var1);
   }

   private boolean method4324(AxisAlignedBB var1) {
      int var4 = MathHelper.floor(var1.minX);
      int var5 = MathHelper.floor(var1.minY);
      int var6 = MathHelper.floor(var1.minZ);
      int var7 = MathHelper.floor(var1.maxX);
      int var8 = MathHelper.floor(var1.maxY);
      int var9 = MathHelper.floor(var1.maxZ);
      boolean var10 = false;
      boolean var11 = false;

      for (int var12 = var4; var12 <= var7; var12++) {
         for (int var13 = var5; var13 <= var8; var13++) {
            for (int var14 = var6; var14 <= var9; var14++) {
               BlockPos var15 = new BlockPos(var12, var13, var14);
               BlockState var16 = this.world.getBlockState(var15);
               Block var17 = var16.getBlock();
               if (!var16.isAir() && var16.getMaterial() != Material.field38945) {
                  if (this.world.getGameRules().getBoolean(GameRules.field24224) && !BlockTags.field32791.method24917(var17)) {
                     var11 = this.world.removeBlock(var15, false) || var11;
                  } else {
                     var10 = true;
                  }
               }
            }
         }
      }

      if (var11) {
         BlockPos var18 = new BlockPos(
            var4 + this.rand.nextInt(var7 - var4 + 1), var5 + this.rand.nextInt(var8 - var5 + 1), var6 + this.rand.nextInt(var9 - var6 + 1)
         );
         this.world.playEvent(2008, var18, 0);
      }

      return var10;
   }

   public boolean method4325(EnderDragonPartEntity var1, DamageSource var2, float var3) {
      if (this.field5639.method32672().method23368() == Class9598.field44905) {
         return false;
      } else {
         var3 = this.field5639.method32672().method23366(var2, var3);
         if (var1 != this.field5624) {
            var3 = var3 / 4.0F + Math.min(var3, 1.0F);
         }

         if (var3 < 0.01F) {
            return false;
         } else {
            if (var2.getTrueSource() instanceof PlayerEntity || var2.method31131()) {
               float var6 = this.getHealth();
               this.method4326(var2, var3);
               if (this.getShouldBeDead() && !this.field5639.method32672().method23358()) {
                  this.setHealth(1.0F);
                  this.field5639.method32671(Class9598.field44905);
               }

               if (this.field5639.method32672().method23358()) {
                  this.field5641 = (int)((float)this.field5641 + (var6 - this.getHealth()));
                  if ((float)this.field5641 > 0.25F * this.method3075()) {
                     this.field5641 = 0;
                     this.field5639.method32671(Class9598.field44900);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      if (source instanceof EntityDamageSource && ((EntityDamageSource) source).getIsThornsDamage()) {
         this.method4325(this.field5626, source, var2);
      }

      return false;
   }

   public boolean method4326(DamageSource var1, float var2) {
      return super.attackEntityFrom(var1, var2);
   }

   @Override
   public void onKillCommand() {
      this.remove();
      if (this.field5638 != null) {
         this.field5638.method26124(this);
         this.field5638.method26119(this);
      }
   }

   @Override
   public void method3008() {
      if (this.field5638 != null) {
         this.field5638.method26124(this);
      }

      this.field5635++;
      if (this.field5635 >= 180 && this.field5635 <= 200) {
         float var3 = (this.rand.nextFloat() - 0.5F) * 8.0F;
         float var4 = (this.rand.nextFloat() - 0.5F) * 4.0F;
         float var5 = (this.rand.nextFloat() - 0.5F) * 8.0F;
         this.world
            .addParticle(
               ParticleTypes.field34069, this.getPosX() + (double)var3, this.getPosY() + 2.0 + (double)var4, this.getPosZ() + (double)var5, 0.0, 0.0, 0.0
            );
      }

      boolean var6 = this.world.getGameRules().getBoolean(GameRules.field24227);
      float var7 = 500;
      if (this.field5638 != null && !this.field5638.method26127()) {
         var7 = 12000;
      }

      if (!this.world.isRemote) {
         if (this.field5635 > 150 && this.field5635 % 5 == 0 && var6) {
            this.method4327(MathHelper.floor(var7 * 0.08F));
         }

         if (this.field5635 == 1 && !this.isSilent()) {
            this.world.method6801(1028, this.getPosition(), 0);
         }
      }

      this.move(MoverType.SELF, new Vector3d(0.0, 0.1F, 0.0));
      this.rotationYaw += 20.0F;
      this.renderYawOffset = this.rotationYaw;
      if (this.field5635 == 200 && !this.world.isRemote) {
         if (var6) {
            this.method4327(MathHelper.floor(var7 * 0.2F));
         }

         if (this.field5638 != null) {
            this.field5638.method26119(this);
         }

         this.remove();
      }
   }

   private void method4327(int var1) {
      while (var1 > 0) {
         int var4 = ExperienceOrbEntity.getXPSplit(var1);
         var1 -= var4;
         this.world.addEntity(new ExperienceOrbEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), var4));
      }
   }

   public int method4328() {
      if (this.field5642[0] == null) {
         for (int var3 = 0; var3 < 24; var3++) {
            int var4 = 5;
            int var6;
            int var7;
            if (var3 >= 12) {
               if (var3 >= 20) {
                  int var5 = var3 - 20;
                  var6 = MathHelper.floor(20.0F * MathHelper.cos(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var5)));
                  var7 = MathHelper.floor(20.0F * MathHelper.sin(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var5)));
               } else {
                  int var8 = var3 - 12;
                  var6 = MathHelper.floor(40.0F * MathHelper.cos(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)var8)));
                  var7 = MathHelper.floor(40.0F * MathHelper.sin(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)var8)));
                  var4 += 10;
               }
            } else {
               var6 = MathHelper.floor(60.0F * MathHelper.cos(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)var3)));
               var7 = MathHelper.floor(60.0F * MathHelper.sin(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)var3)));
            }

            int var9 = Math.max(
               this.world.getSeaLevel() + 10, this.world.method7006(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, new BlockPos(var6, 0, var7)).getY() + var4
            );
            this.field5642[var3] = new Class7176(var6, var9, var7);
         }

         this.field5643[0] = 6146;
         this.field5643[1] = 8197;
         this.field5643[2] = 8202;
         this.field5643[3] = 16404;
         this.field5643[4] = 32808;
         this.field5643[5] = 32848;
         this.field5643[6] = 65696;
         this.field5643[7] = 131392;
         this.field5643[8] = 131712;
         this.field5643[9] = 263424;
         this.field5643[10] = 526848;
         this.field5643[11] = 525313;
         this.field5643[12] = 1581057;
         this.field5643[13] = 3166214;
         this.field5643[14] = 2138120;
         this.field5643[15] = 6373424;
         this.field5643[16] = 4358208;
         this.field5643[17] = 12910976;
         this.field5643[18] = 9044480;
         this.field5643[19] = 9706496;
         this.field5643[20] = 15216640;
         this.field5643[21] = 13688832;
         this.field5643[22] = 11763712;
         this.field5643[23] = 8257536;
      }

      return this.method4329(this.getPosX(), this.getPosY(), this.getPosZ());
   }

   public int method4329(double var1, double var3, double var5) {
      float var9 = 10000.0F;
      int var10 = 0;
      Class7176 var11 = new Class7176(MathHelper.floor(var1), MathHelper.floor(var3), MathHelper.floor(var5));
      int var12 = 0;
      if (this.field5638 == null || this.field5638.method26125() == 0) {
         var12 = 12;
      }

      for (int var13 = var12; var13 < 24; var13++) {
         if (this.field5642[var13] != null) {
            float var14 = this.field5642[var13].method22528(var11);
            if (var14 < var9) {
               var9 = var14;
               var10 = var13;
            }
         }
      }

      return var10;
   }

   @Nullable
   public Class8238 method4330(int var1, int var2, Class7176 var3) {
      for (int var6 = 0; var6 < 24; var6++) {
         Class7176 var7 = this.field5642[var6];
         var7.field30856 = false;
         var7.field30854 = 0.0F;
         var7.field30852 = 0.0F;
         var7.field30853 = 0.0F;
         var7.field30855 = null;
         var7.field30851 = -1;
      }

      Class7176 var15 = this.field5642[var1];
      Class7176 var16 = this.field5642[var2];
      var15.field30852 = 0.0F;
      var15.field30853 = var15.method22527(var16);
      var15.field30854 = var15.field30853;
      this.field5644.method31191();
      this.field5644.method31190(var15);
      Class7176 var8 = var15;
      int var9 = 0;
      if (this.field5638 == null || this.field5638.method26125() == 0) {
         var9 = 12;
      }

      while (!this.field5644.method31196()) {
         Class7176 var10 = this.field5644.method31192();
         if (var10.equals(var16)) {
            if (var3 != null) {
               var3.field30855 = var16;
               var16 = var3;
            }

            return this.method4331(var15, var16);
         }

         if (var10.method22527(var16) < var8.method22527(var16)) {
            var8 = var10;
         }

         var10.field30856 = true;
         int var11 = 0;

         for (int var12 = 0; var12 < 24; var12++) {
            if (this.field5642[var12] == var10) {
               var11 = var12;
               break;
            }
         }

         for (int var17 = var9; var17 < 24; var17++) {
            if ((this.field5643[var11] & 1 << var17) > 0) {
               Class7176 var13 = this.field5642[var17];
               if (!var13.field30856) {
                  float var14 = var10.field30852 + var10.method22527(var13);
                  if (!var13.method22532() || var14 < var13.field30852) {
                     var13.field30855 = var10;
                     var13.field30852 = var14;
                     var13.field30853 = var13.method22527(var16);
                     if (!var13.method22532()) {
                        var13.field30854 = var13.field30852 + var13.field30853;
                        this.field5644.method31190(var13);
                     } else {
                        this.field5644.method31193(var13, var13.field30852 + var13.field30853);
                     }
                  }
               }
            }
         }
      }

      if (var8 != var15) {
         field5618.debug("Failed to find path from {} to {}", var1, var2);
         if (var3 != null) {
            var3.field30855 = var8;
            var8 = var3;
         }

         return this.method4331(var15, var8);
      } else {
         return null;
      }
   }

   private Class8238 method4331(Class7176 var1, Class7176 var2) {
      ArrayList var5 = Lists.newArrayList();
      Class7176 var6 = var2;
      var5.add(0, var2);

      while (var6.field30855 != null) {
         var6 = var6.field30855;
         var5.add(0, var6);
      }

      return new Class8238(var5, new BlockPos(var2.field30847, var2.field30848, var2.field30849), true);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("DragonPhase", this.field5639.method32672().method23368().method37259());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("DragonPhase")) {
         this.field5639.method32671(Class9598.method37260(var1.getInt("DragonPhase")));
      }
   }

   @Override
   public void method3447() {
   }

   public EnderDragonPartEntity[] method4332() {
      return this.field5623;
   }

   @Override
   public boolean canBeCollidedWith() {
      return false;
   }

   @Override
   public SoundCategory getSoundCategory() {
      return SoundCategory.field14733;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26536;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26541;
   }

   @Override
   public float getSoundVolume() {
      return 5.0F;
   }

   public float method4333(int var1, double[] var2, double[] var3) {
      Class7373 var6 = this.field5639.method32672();
      Class9598 var7 = var6.method23368();
      double var10;
      if (var7 == Class9598.field44899 || var7 == Class9598.field44900) {
         BlockPos var8 = this.world.method7006(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class2909.field17994);
         float var9 = Math.max(MathHelper.sqrt(var8.method8319(this.getPositionVec(), true)) / 4.0F, 1.0F);
         var10 = (double)((float)var1 / var9);
      } else if (!var6.method23358()) {
         if (var1 != 6) {
            var10 = var3[1] - var2[1];
         } else {
            var10 = 0.0;
         }
      } else {
         var10 = (double)var1;
      }

      return (float)var10;
   }

   public Vector3d method4334(float var1) {
      Class7373 var4 = this.field5639.method32672();
      Class9598 var5 = var4.method23368();
      Vector3d var11;
      if (var5 == Class9598.field44899 || var5 == Class9598.field44900) {
         BlockPos var12 = this.world.method7006(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class2909.field17994);
         float var13 = Math.max(MathHelper.sqrt(var12.method8319(this.getPositionVec(), true)) / 4.0F, 1.0F);
         float var8 = 6.0F / var13;
         float var9 = this.rotationPitch;
         float var10 = 1.5F;
         this.rotationPitch = -var8 * 1.5F * 5.0F;
         var11 = this.getLook(var1);
         this.rotationPitch = var9;
      } else if (!var4.method23358()) {
         var11 = this.getLook(var1);
      } else {
         float var6 = this.rotationPitch;
         float var7 = 1.5F;
         this.rotationPitch = -45.0F;
         var11 = this.getLook(var1);
         this.rotationPitch = var6;
      }

      return var11;
   }

   public void method4335(EnderCrystalEntity var1, BlockPos var2, DamageSource var3) {
      PlayerEntity var6;
      if (!(var3.getTrueSource() instanceof PlayerEntity)) {
         var6 = this.world.method7190(field5620, (double)var2.getX(), (double)var2.getY(), (double)var2.getZ());
      } else {
         var6 = (PlayerEntity)var3.getTrueSource();
      }

      if (var1 == this.field5637) {
         this.method4325(this.field5624, DamageSource.method31127(var6), 10.0F);
      }

      this.field5639.method32672().method23361(var1, var2, var3, var6);
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (field5619.equals(var1) && this.world.isRemote) {
         this.field5639.method32671(Class9598.method37260(this.getDataManager().<Integer>method35445(field5619)));
      }

      super.notifyDataManagerChange(var1);
   }

   public Class8942 method4336() {
      return this.field5639;
   }

   @Nullable
   public DragonFightManager method4337() {
      return this.field5638;
   }

   @Override
   public boolean addPotionEffect(EffectInstance var1) {
      return false;
   }

   @Override
   public boolean canBeRidden(Entity var1) {
      return false;
   }

   @Override
   public boolean method3367() {
      return false;
   }
}
