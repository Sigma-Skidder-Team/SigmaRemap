package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public class Class1090 extends Class1018 {
   private static final Class120 field5972 = Class120.method339(Items.field37909, Items.field37910);
   private static final DataParameter<Boolean> field5973 = EntityDataManager.<Boolean>createKey(Class1090.class, DataSerializers.field33398);
   private Class2775<PlayerEntity> field5974;
   private Class2681 field5975;

   public Class1090(EntityType<? extends Class1090> var1, World var2) {
      super(var1, var2);
      this.method5077();
   }

   private boolean method5072() {
      return this.dataManager.<Boolean>method35445(field5973);
   }

   private void method5073(boolean var1) {
      this.dataManager.method35446(field5973, var1);
      this.method5077();
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putBoolean("Trusting", this.method5072());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method5073(var1.getBoolean("Trusting"));
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5973, false);
   }

   @Override
   public void method4219() {
      this.field5975 = new Class2681(this, 0.6, field5972, true);
      this.field5600.addGoal(1, new Class2603(this));
      this.field5600.addGoal(3, this.field5975);
      this.field5600.addGoal(7, new Class2745(this, 0.3F));
      this.field5600.addGoal(8, new Class2695(this));
      this.field5600.addGoal(9, new Class2785(this, 0.8));
      this.field5600.addGoal(10, new WaterAvoidingRandomWalkingGoal(this, 0.8, 1.0000001E-5F));
      this.field5600.addGoal(11, new Class2612(this, PlayerEntity.class, 10.0F));
      this.field5601.addGoal(1, new NearestAttackableTargetGoal<Class1089>(this, Class1089.class, false));
      this.field5601.addGoal(1, new NearestAttackableTargetGoal<Class1088>(this, Class1088.class, 10, false, false, Class1088.field5963));
   }

   @Override
   public void updateAITasks() {
      if (!this.method4228().method20811()) {
         this.setPose(Pose.STANDING);
         this.setSprinting(false);
      } else {
         double var3 = this.method4228().method20812();
         if (var3 != 0.6) {
            if (var3 != 1.33) {
               this.setPose(Pose.STANDING);
               this.setSprinting(false);
            } else {
               this.setPose(Pose.STANDING);
               this.setSprinting(true);
            }
         } else {
            this.setPose(Pose.field13624);
            this.setSprinting(false);
         }
      }
   }

   @Override
   public boolean method4254(double var1) {
      return !this.method5072() && this.ticksExisted > 2400;
   }

   public static MutableAttribute method5074() {
      return MobEntity.method4220().method21849(Attributes.MAX_HEALTH, 10.0).method21849(Attributes.MOVEMENT_SPEED, 0.3F).method21849(Attributes.ATTACK_DAMAGE, 3.0);
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      return false;
   }

   @Nullable
   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26865;
   }

   @Override
   public int method4236() {
      return 900;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26864;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26866;
   }

   private float method5075() {
      return (float)this.getAttributeValue(Attributes.ATTACK_DAMAGE);
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      return var1.attackEntityFrom(DamageSource.method31115(this), this.method5075());
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      return !this.isInvulnerableTo(source) ? super.attackEntityFrom(source, var2) : false;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if ((this.field5975 == null || this.field5975.method10900()) && !this.method5072() && this.method4381(var5) && var1.getDistanceSq(this) < 9.0) {
         this.method4501(var1, var5);
         if (!this.world.isRemote) {
            if (this.rand.nextInt(3) != 0) {
               this.method5076(false);
               this.world.setEntityState(this, (byte)40);
            } else {
               this.method5073(true);
               this.method5076(true);
               this.world.setEntityState(this, (byte)41);
            }
         }

         return ActionResultType.method9002(this.world.isRemote);
      } else {
         return super.method4285(var1, var2);
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 41) {
         if (var1 != 40) {
            super.handleStatusUpdate(var1);
         } else {
            this.method5076(false);
         }
      } else {
         this.method5076(true);
      }
   }

   private void method5076(boolean var1) {
      Class7435 var4 = ParticleTypes.field34080;
      if (!var1) {
         var4 = ParticleTypes.field34092;
      }

      for (int var5 = 0; var5 < 7; var5++) {
         double var6 = this.rand.nextGaussian() * 0.02;
         double var8 = this.rand.nextGaussian() * 0.02;
         double var10 = this.rand.nextGaussian() * 0.02;
         this.world.addParticle(var4, this.getPosXRandom(1.0), this.getPosYRandom() + 0.5, this.getPosZRandom(1.0), var6, var8, var10);
      }
   }

   public void method5077() {
      if (this.field5974 == null) {
         this.field5974 = new Class2775<PlayerEntity>(this, PlayerEntity.class, 16.0F, 0.8, 1.33);
      }

      this.field5600.method20003(this.field5974);
      if (!this.method5072()) {
         this.field5600.addGoal(4, this.field5974);
      }
   }

   public Class1090 method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.OCELOT.create(var1);
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return field5972.test(var1);
   }

   public static boolean method5078(EntityType<Class1090> var0, IWorld var1, Class2202 var2, BlockPos var3, Random var4) {
      return var4.nextInt(3) != 0;
   }

   @Override
   public boolean method4266(IWorldReader var1) {
      if (var1.checkNoEntityCollision(this) && !var1.method7014(this.getBoundingBox())) {
         BlockPos var4 = this.getPosition();
         if (var4.getY() < var1.getSeaLevel()) {
            return false;
         }

         BlockState var5 = var1.getBlockState(var4.down());
         if (var5.isIn(Blocks.GRASS_BLOCK) || var5.isIn(BlockTags.LEAVES)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      if (var4 == null) {
         var4 = new Class5097(1.0F);
      }

      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   @Override
   public Vector3d func_241205_ce_() {
      return new Vector3d(0.0, (double)(0.5F * this.getEyeHeight()), (double)(this.getWidth() * 0.4F));
   }

   // $VF: synthetic method
   public static boolean method5079(Class1090 var0) {
      return var0.method5072();
   }
}
