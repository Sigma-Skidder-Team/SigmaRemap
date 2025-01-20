package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.EffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerBossInfo;

import java.util.List;
import java.util.function.Predicate;

public class WitherEntity extends MonsterEntity implements Class1080, Class1022 {
   private static final DataParameter<Integer> field5923 = EntityDataManager.<Integer>createKey(WitherEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> field5924 = EntityDataManager.<Integer>createKey(WitherEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> field5925 = EntityDataManager.<Integer>createKey(WitherEntity.class, DataSerializers.VARINT);
   private static final List<DataParameter<Integer>> field5926 = ImmutableList.of(field5923, field5924, field5925);
   private static final DataParameter<Integer> field5927 = EntityDataManager.<Integer>createKey(WitherEntity.class, DataSerializers.VARINT);
   private final float[] field5928 = new float[2];
   private final float[] field5929 = new float[2];
   private final float[] field5930 = new float[2];
   private final float[] field5931 = new float[2];
   private final int[] field5932 = new int[2];
   private final int[] field5933 = new int[2];
   private int field5934;
   private final ServerBossInfo field5935 = (ServerBossInfo)new ServerBossInfo(this.getDisplayName(), BossInfo.Color.PURPLE, BossInfo.Overlay.PROGRESS).setDarkenSky(true);
   private static final Predicate<LivingEntity> field5936 = var0 -> var0.getCreatureAttribute() != CreatureAttribute.UNDEAD && var0.attackable();
   private static final EntityPredicate field5937 = new EntityPredicate().method30203(20.0).method30209(field5936);

   public WitherEntity(EntityType<? extends WitherEntity> var1, World var2) {
      super(var1, var2);
      this.setHealth(this.method3075());
      this.method4230().method21674(true);
      this.field5594 = 50;
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(0, new Class2733(this));
      this.field5600.addGoal(2, new Class2598(this, 1.0, 40, 20.0F));
      this.field5600.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.field5600.addGoal(6, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.addGoal(7, new Class2668(this));
      this.field5601.addGoal(1, new HurtByTargetGoal(this));
      this.field5601.addGoal(2, new NearestAttackableTargetGoal<MobEntity>(this, MobEntity.class, 0, false, false, field5936));
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5923, 0);
      this.dataManager.register(field5924, 0);
      this.dataManager.register(field5925, 0);
      this.dataManager.register(field5927, 0);
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      compound.putInt("Invul", this.method5012());
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.method5013(compound.getInt("Invul"));
      if (this.method3381()) {
         this.field5935.setName(this.getDisplayName());
      }
   }

   @Override
   public void method3379(ITextComponent var1) {
      super.method3379(var1);
      this.field5935.setName(this.getDisplayName());
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27239;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27242;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27241;
   }

   @Override
   public void livingTick() {
      Vector3d var3 = this.getMotion().mul(1.0, 0.6, 1.0);
      if (!this.world.isRemote && this.method5014(0) > 0) {
         Entity var4 = this.world.getEntityByID(this.method5014(0));
         if (var4 != null) {
            double var5 = var3.y;
            if (this.getPosY() < var4.getPosY() || !this.method5016() && this.getPosY() < var4.getPosY() + 5.0) {
               var5 = Math.max(0.0, var5);
               var5 += 0.3 - var5 * 0.6F;
            }

            var3 = new Vector3d(var3.x, var5, var3.z);
            Vector3d var7 = new Vector3d(var4.getPosX() - this.getPosX(), 0.0, var4.getPosZ() - this.getPosZ());
            if (horizontalMag(var7) > 9.0) {
               Vector3d var8 = var7.method11333();
               var3 = var3.add(var8.x * 0.3 - var3.x * 0.6, 0.0, var8.z * 0.3 - var3.z * 0.6);
            }
         }
      }

      this.setMotion(var3);
      if (horizontalMag(var3) > 0.05) {
         this.rotationYaw = (float) MathHelper.method37814(var3.z, var3.x) * (180.0F / (float)Math.PI) - 90.0F;
      }

      super.livingTick();

      for (int var33 = 0; var33 < 2; var33++) {
         this.field5931[var33] = this.field5929[var33];
         this.field5930[var33] = this.field5928[var33];
      }

      for (int var34 = 0; var34 < 2; var34++) {
         int var9 = this.method5014(var34 + 1);
         Entity var10 = null;
         if (var9 > 0) {
            var10 = this.world.getEntityByID(var9);
         }

         if (var10 == null) {
            this.field5929[var34] = this.method5007(this.field5929[var34], this.renderYawOffset, 10.0F);
         } else {
            double var11 = this.method5004(var34 + 1);
            double var13 = this.method5005(var34 + 1);
            double var15 = this.method5006(var34 + 1);
            double var17 = var10.getPosX() - var11;
            double var19 = var10.getPosYEye() - var13;
            double var21 = var10.getPosZ() - var15;
            double var23 = (double) MathHelper.sqrt(var17 * var17 + var21 * var21);
            float var25 = (float)(MathHelper.method37814(var21, var17) * 180.0F / (float)Math.PI) - 90.0F;
            float var26 = (float)(-(MathHelper.method37814(var19, var23) * 180.0F / (float)Math.PI));
            this.field5928[var34] = this.method5007(this.field5928[var34], var26, 40.0F);
            this.field5929[var34] = this.method5007(this.field5929[var34], var25, 10.0F);
         }
      }

      boolean var35 = this.method5016();

      for (int var37 = 0; var37 < 3; var37++) {
         double var27 = this.method5004(var37);
         double var29 = this.method5005(var37);
         double var31 = this.method5006(var37);
         this.world
            .addParticle(
               ParticleTypes.field34092,
               var27 + this.rand.nextGaussian() * 0.3F,
               var29 + this.rand.nextGaussian() * 0.3F,
               var31 + this.rand.nextGaussian() * 0.3F,
               0.0,
               0.0,
               0.0
            );
         if (var35 && this.world.rand.nextInt(4) == 0) {
            this.world
               .addParticle(
                  ParticleTypes.field34068,
                  var27 + this.rand.nextGaussian() * 0.3F,
                  var29 + this.rand.nextGaussian() * 0.3F,
                  var31 + this.rand.nextGaussian() * 0.3F,
                  0.7F,
                  0.7F,
                  0.5
               );
         }
      }

      if (this.method5012() > 0) {
         for (int var38 = 0; var38 < 3; var38++) {
            this.world
               .addParticle(
                  ParticleTypes.field34068,
                  this.getPosX() + this.rand.nextGaussian(),
                  this.getPosY() + (double)(this.rand.nextFloat() * 3.3F),
                  this.getPosZ() + this.rand.nextGaussian(),
                  0.7F,
                  0.7F,
                  0.9F
               );
         }
      }
   }

   @Override
   public void updateAITasks() {
      if (this.method5012() <= 0) {
         super.updateAITasks();

         for (int var3 = 1; var3 < 3; var3++) {
            if (this.ticksExisted >= this.field5932[var3 - 1]) {
               this.field5932[var3 - 1] = this.ticksExisted + 10 + this.rand.nextInt(10);
               if (this.world.method6997() == Difficulty.NORMAL || this.world.method6997() == Difficulty.HARD) {
                  int var4 = var3 - 1;
                  int var5 = this.field5933[var3 - 1];
                  this.field5933[var4] = this.field5933[var3 - 1] + 1;
                  if (var5 > 15) {
                     float var6 = 10.0F;
                     float var7 = 5.0F;
                     double var8 = MathHelper.method37784(this.rand, this.getPosX() - 10.0, this.getPosX() + 10.0);
                     double var10 = MathHelper.method37784(this.rand, this.getPosY() - 5.0, this.getPosY() + 5.0);
                     double var12 = MathHelper.method37784(this.rand, this.getPosZ() - 10.0, this.getPosZ() + 10.0);
                     this.method5009(var3 + 1, var8, var10, var12, true);
                     this.field5933[var3 - 1] = 0;
                  }
               }

               int var23 = this.method5014(var3);
               if (var23 <= 0) {
                  List var27 = this.world.<LivingEntity>method7195(LivingEntity.class, field5937, this, this.getBoundingBox().grow(20.0, 8.0, 20.0));

                  for (int var29 = 0; var29 < 10 && !var27.isEmpty(); var29++) {
                     LivingEntity var31 = (LivingEntity)var27.get(this.rand.nextInt(var27.size()));
                     if (var31 != this && var31.isAlive() && this.canEntityBeSeen(var31)) {
                        if (!(var31 instanceof PlayerEntity)) {
                           this.method5015(var3, var31.getEntityId());
                        } else if (!((PlayerEntity)var31).abilities.disableDamage) {
                           this.method5015(var3, var31.getEntityId());
                        }
                        break;
                     }

                     var27.remove(var31);
                  }
               } else {
                  Entity var26 = this.world.getEntityByID(var23);
                  if (var26 == null || !var26.isAlive() || this.getDistanceSq(var26) > 900.0 || !this.canEntityBeSeen(var26)) {
                     this.method5015(var3, 0);
                  } else if (var26 instanceof PlayerEntity && ((PlayerEntity)var26).abilities.disableDamage) {
                     this.method5015(var3, 0);
                  } else {
                     this.method5008(var3 + 1, (LivingEntity)var26);
                     this.field5932[var3 - 1] = this.ticksExisted + 40 + this.rand.nextInt(20);
                     this.field5933[var3 - 1] = 0;
                  }
               }
            }
         }

         if (this.method4232() == null) {
            this.method5015(0, 0);
         } else {
            this.method5015(0, this.method4232().getEntityId());
         }

         if (this.field5934 > 0) {
            this.field5934--;
            if (this.field5934 == 0 && this.world.getGameRules().getBoolean(GameRules.field24224)) {
               int var21 = MathHelper.floor(this.getPosY());
               int var24 = MathHelper.floor(this.getPosX());
               int var28 = MathHelper.floor(this.getPosZ());
               boolean var30 = false;

               for (int var32 = -1; var32 <= 1; var32++) {
                  for (int var14 = -1; var14 <= 1; var14++) {
                     for (int var15 = 0; var15 <= 3; var15++) {
                        int var16 = var24 + var32;
                        int var17 = var21 + var15;
                        int var18 = var28 + var14;
                        BlockPos var19 = new BlockPos(var16, var17, var18);
                        BlockState var20 = this.world.getBlockState(var19);
                        if (method5002(var20)) {
                           var30 = this.world.destroyBlock(var19, true, this) || var30;
                        }
                     }
                  }
               }

               if (var30) {
                  this.world.method6869((PlayerEntity)null, 1022, this.getPosition(), 0);
               }
            }
         }

         if (this.ticksExisted % 20 == 0) {
            this.heal(1.0F);
         }

         this.field5935.setPercent(this.getHealth() / this.method3075());
      } else {
         int var22 = this.method5012() - 1;
         if (var22 <= 0) {
            Class2141 var25 = !this.world.getGameRules().getBoolean(GameRules.field24224) ? Class2141.field14014 : Class2141.field14016;
            this.world.method6756(this, this.getPosX(), this.getPosYEye(), this.getPosZ(), 7.0F, false, var25);
            if (!this.isSilent()) {
               this.world.method6801(1023, this.getPosition(), 0);
            }
         }

         this.method5013(var22);
         if (this.ticksExisted % 10 == 0) {
            this.heal(10.0F);
         }
      }
   }

   public static boolean method5002(BlockState var0) {
      return !var0.isAir() && !BlockTags.field32792.contains(var0.getBlock());
   }

   public void method5003() {
      this.method5013(220);
      this.setHealth(this.method3075() / 3.0F);
   }

   @Override
   public void setMotionMultiplier(BlockState var1, Vector3d var2) {
   }

   @Override
   public void method3400(ServerPlayerEntity var1) {
      super.method3400(var1);
      this.field5935.addPlayer(var1);
   }

   @Override
   public void method3401(ServerPlayerEntity var1) {
      super.method3401(var1);
      this.field5935.removePlayer(var1);
   }

   private double method5004(int var1) {
      if (var1 > 0) {
         float var4 = (this.renderYawOffset + (float)(180 * (var1 - 1))) * (float) (Math.PI / 180.0);
         float var5 = MathHelper.cos(var4);
         return this.getPosX() + (double)var5 * 1.3;
      } else {
         return this.getPosX();
      }
   }

   private double method5005(int var1) {
      return var1 > 0 ? this.getPosY() + 2.2 : this.getPosY() + 3.0;
   }

   private double method5006(int var1) {
      if (var1 > 0) {
         float var4 = (this.renderYawOffset + (float)(180 * (var1 - 1))) * (float) (Math.PI / 180.0);
         float var5 = MathHelper.sin(var4);
         return this.getPosZ() + (double)var5 * 1.3;
      } else {
         return this.getPosZ();
      }
   }

   private float method5007(float var1, float var2, float var3) {
      float var6 = MathHelper.wrapDegrees(var2 - var1);
      if (var6 > var3) {
         var6 = var3;
      }

      if (var6 < -var3) {
         var6 = -var3;
      }

      return var1 + var6;
   }

   private void method5008(int var1, LivingEntity var2) {
      this.method5009(
         var1, var2.getPosX(), var2.getPosY() + (double)var2.getEyeHeight() * 0.5, var2.getPosZ(), var1 == 0 && this.rand.nextFloat() < 0.001F
      );
   }

   private void method5009(int var1, double var2, double var4, double var6, boolean var8) {
      if (!this.isSilent()) {
         this.world.method6869((PlayerEntity)null, 1024, this.getPosition(), 0);
      }

      double var11 = this.method5004(var1);
      double var13 = this.method5005(var1);
      double var15 = this.method5006(var1);
      double var17 = var2 - var11;
      double var19 = var4 - var13;
      double var21 = var6 - var15;
      WitherSkullEntity var23 = new WitherSkullEntity(this.world, this, var17, var19, var21);
      var23.setShooter(this);
      if (var8) {
         var23.method3533(true);
      }

      var23.setRawPosition(var11, var13, var15);
      this.world.addEntity(var23);
   }

   @Override
   public void method4530(LivingEntity var1, float var2) {
      this.method5008(0, var1);
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      if (this.isInvulnerableTo(source)) {
         return false;
      } else if (source == DamageSource.DROWN || source.getTrueSource() instanceof WitherEntity) {
         return false;
      } else if (this.method5012() > 0 && source != DamageSource.OUT_OF_WORLD) {
         return false;
      } else {
         if (this.method5016()) {
            Entity var5 = source.getImmediateSource();
            if (var5 instanceof AbstractArrowEntity) {
               return false;
            }
         }

         Entity var7 = source.getTrueSource();
         if (var7 != null && !(var7 instanceof PlayerEntity) && var7 instanceof LivingEntity && ((LivingEntity)var7).getCreatureAttribute() == this.getCreatureAttribute()) {
            return false;
         } else {
            if (this.field5934 <= 0) {
               this.field5934 = 20;
            }

            for (int var6 = 0; var6 < this.field5933.length; var6++) {
               this.field5933[var6] = this.field5933[var6] + 3;
            }

            return super.attackEntityFrom(source, var2);
         }
      }
   }

   @Override
   public void dropSpecialItems(DamageSource var1, int var2, boolean var3) {
      super.dropSpecialItems(var1, var2, var3);
      ItemEntity var6 = this.entityDropItem(Items.field38066);
      if (var6 != null) {
         var6.method4136();
      }
   }

   @Override
   public void method3447() {
      if (this.world.method6997() == Difficulty.PEACEFUL && this.method4256()) {
         this.remove();
      } else {
         this.idleTime = 0;
      }
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      return false;
   }

   @Override
   public boolean addPotionEffect(EffectInstance var1) {
      return false;
   }

   public static MutableAttribute method2997() {
      return MonsterEntity.method4343()
         .method21849(Attributes.MAX_HEALTH, 300.0)
         .method21849(Attributes.MOVEMENT_SPEED, 0.6F)
         .method21849(Attributes.FOLLOW_RANGE, 40.0)
         .method21849(Attributes.ARMOR, 4.0);
   }

   public float method5010(int var1) {
      return this.field5929[var1];
   }

   public float method5011(int var1) {
      return this.field5928[var1];
   }

   public int method5012() {
      return this.dataManager.<Integer>method35445(field5927);
   }

   public void method5013(int var1) {
      this.dataManager.set(field5927, var1);
   }

   public int method5014(int var1) {
      return this.dataManager.<Integer>method35445(field5926.get(var1));
   }

   public void method5015(int var1, int var2) {
      this.dataManager.set(field5926.get(var1), var2);
   }

   @Override
   public boolean method5016() {
      return this.getHealth() <= this.method3075() / 2.0F;
   }

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.UNDEAD;
   }

   @Override
   public boolean canBeRidden(Entity var1) {
      return false;
   }

   @Override
   public boolean method3367() {
      return false;
   }

   @Override
   public boolean isPotionApplicable(EffectInstance potion) {
      return potion.getPotion() != Effects.WITHER ? super.isPotionApplicable(potion) : false;
   }
}
