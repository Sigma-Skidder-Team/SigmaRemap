package mapped;

import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class Class1108 extends MobEntity implements Class1008 {
   private static final DataParameter<Integer> field6081 = EntityDataManager.<Integer>createKey(Class1108.class, DataSerializers.VARINT);
   public float field6082;
   public float field6083;
   public float field6084;
   private boolean field6085;

   public Class1108(EntityType<? extends Class1108> var1, World var2) {
      super(var1, var2);
      this.field5596 = new Class6841(this);
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(1, new Class2735(this));
      this.field5600.addGoal(2, new Class2620(this));
      this.field5600.addGoal(3, new Class2621(this));
      this.field5600.addGoal(5, new Class2601(this));
      this.field5601
         .addGoal(1, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, 10, true, false, var1 -> Math.abs(var1.getPosY() - this.getPosY()) <= 4.0));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<Class1058>(this, Class1058.class, true));
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6081, 1);
   }

   public void method5318(int var1, boolean var2) {
      this.dataManager.method35446(field6081, var1);
      this.recenterBoundingBox();
      this.recalculateSize();
      this.getAttribute(Attributes.field42105).method38661((double)(var1 * var1));
      this.getAttribute(Attributes.MOVEMENT_SPEED).method38661((double)(0.2F + 0.1F * (float)var1));
      this.getAttribute(Attributes.ATTACK_DAMAGE).method38661((double)var1);
      if (var2) {
         this.setHealth(this.method3075());
      }

      this.field5594 = var1;
   }

   public int method5319() {
      return this.dataManager.<Integer>method35445(field6081);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("Size", this.method5319() - 1);
      var1.putBoolean("wasOnGround", this.field6085);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      int var4 = var1.getInt("Size");
      if (var4 < 0) {
         var4 = 0;
      }

      this.method5318(var4 + 1, false);
      super.readAdditional(var1);
      this.field6085 = var1.getBoolean("wasOnGround");
   }

   public boolean method5320() {
      return this.method5319() <= 1;
   }

   public IParticleData method5321() {
      return ParticleTypes.field34083;
   }

   @Override
   public boolean method4256() {
      return this.method5319() > 0;
   }

   @Override
   public void tick() {
      this.field6083 = this.field6083 + (this.field6082 - this.field6083) * 0.5F;
      this.field6084 = this.field6083;
      super.tick();
      if (this.onGround && !this.field6085) {
         int var3 = this.method5319();

         for (int var4 = 0; var4 < var3 * 8; var4++) {
            float var5 = this.rand.nextFloat() * (float) (Math.PI * 2);
            float var6 = this.rand.nextFloat() * 0.5F + 0.5F;
            float var7 = MathHelper.sin(var5) * (float)var3 * 0.5F * var6;
            float var8 = MathHelper.cos(var5) * (float)var3 * 0.5F * var6;
            this.world.addParticle(this.method5321(), this.getPosX() + (double)var7, this.getPosY(), this.getPosZ() + (double)var8, 0.0, 0.0, 0.0);
         }

         this.playSound(this.method5327(), this.getSoundVolume(), ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         this.field6082 = -0.5F;
      } else if (!this.onGround && this.field6085) {
         this.field6082 = 1.0F;
      }

      this.field6085 = this.onGround;
      this.method5322();
   }

   public void method5322() {
      this.field6082 *= 0.6F;
   }

   public int method5323() {
      return this.rand.nextInt(20) + 10;
   }

   @Override
   public void recalculateSize() {
      double var3 = this.getPosX();
      double var5 = this.getPosY();
      double var7 = this.getPosZ();
      super.recalculateSize();
      this.setPosition(var3, var5, var7);
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (field6081.equals(var1)) {
         this.recalculateSize();
         this.rotationYaw = this.rotationYawHead;
         this.renderYawOffset = this.rotationYawHead;
         if (this.isInWater() && this.rand.nextInt(20) == 0) {
            this.doWaterSplashEffect();
         }
      }

      super.notifyDataManagerChange(var1);
   }

   @Override
   public EntityType<? extends Class1108> getType() {
      return (EntityType<? extends Class1108>)super.getType();
   }

   @Override
   public void remove() {
      int var3 = this.method5319();
      if (!this.world.isRemote && var3 > 1 && this.getShouldBeDead()) {
         ITextComponent var4 = this.method3380();
         boolean var5 = this.method4305();
         float var6 = (float)var3 / 4.0F;
         int var7 = var3 / 2;
         int var8 = 2 + this.rand.nextInt(3);

         for (int var9 = 0; var9 < var8; var9++) {
            float var10 = ((float)(var9 % 2) - 0.5F) * var6;
            float var11 = ((float)(var9 / 2) - 0.5F) * var6;
            Class1108 var12 = this.getType().create(this.world);
            if (this.method4282()) {
               var12.method4278();
            }

            var12.method3379(var4);
            var12.method4302(var5);
            var12.method3363(this.method3362());
            var12.method5318(var7, true);
            var12.setLocationAndAngles(
               this.getPosX() + (double)var10, this.getPosY() + 0.5, this.getPosZ() + (double)var11, this.rand.nextFloat() * 360.0F, 0.0F
            );
            this.world.addEntity(var12);
         }
      }

      super.remove();
   }

   @Override
   public void applyEntityCollision(Entity var1) {
      super.applyEntityCollision(var1);
      if (var1 instanceof Class1058 && this.method5325()) {
         this.method5324((LivingEntity)var1);
      }
   }

   @Override
   public void onCollideWithPlayer(PlayerEntity var1) {
      if (this.method5325()) {
         this.method5324(var1);
      }
   }

   public void method5324(LivingEntity var1) {
      if (this.isAlive()) {
         int var4 = this.method5319();
         if (this.getDistanceSq(var1) < 0.6 * (double)var4 * 0.6 * (double)var4
            && this.canEntityBeSeen(var1)
            && var1.attackEntityFrom(DamageSource.method31115(this), this.method5326())) {
            this.playSound(SoundEvents.field27072, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
            this.applyEnchantments(this, var1);
         }
      }
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 0.625F * var2.field39969;
   }

   public boolean method5325() {
      return !this.method5320() && this.isServerWorld();
   }

   public float method5326() {
      return (float)this.getAttributeValue(Attributes.ATTACK_DAMAGE);
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return !this.method5320() ? SoundEvents.field27074 : SoundEvents.field27103;
   }

   @Override
   public SoundEvent getDeathSound() {
      return !this.method5320() ? SoundEvents.field27073 : SoundEvents.field27102;
   }

   public SoundEvent method5327() {
      return !this.method5320() ? SoundEvents.field27076 : SoundEvents.field27105;
   }

   @Override
   public ResourceLocation method4242() {
      return this.method5319() != 1 ? Class8793.field39533 : this.getType().method33212();
   }

   public static boolean method5328(EntityType<Class1108> var0, IWorld var1, Class2202 var2, BlockPos var3, Random var4) {
      if (var1.method6997() != Difficulty.PEACEFUL) {
         if (Objects.equals(var1.method7178(var3), Optional.<RegistryKey<Biome>>of(Biomes.SWAMP))
            && var3.getY() > 50
            && var3.getY() < 70
            && var4.nextFloat() < 0.5F
            && var4.nextFloat() < var1.method7000()
            && var1.method7015(var3) <= var4.nextInt(8)) {
            return method4264(var0, var1, var2, var3, var4);
         }

         if (!(var1 instanceof ISeedReader)) {
            return false;
         }

         ChunkPos var7 = new ChunkPos(var3);
         boolean var8 = SharedSeedRandom.method10375(var7.x, var7.z, ((ISeedReader)var1).getSeed(), 987234911L).nextInt(10) == 0;
         if (var4.nextInt(10) == 0 && var8 && var3.getY() < 40) {
            return method4264(var0, var1, var2, var3, var4);
         }
      }

      return false;
   }

   @Override
   public float getSoundVolume() {
      return 0.4F * (float)this.method5319();
   }

   @Override
   public int method4259() {
      return 0;
   }

   public boolean method5329() {
      return this.method5319() > 0;
   }

   @Override
   public void jump() {
      Vector3d var3 = this.getMotion();
      this.setMotion(var3.x, (double)this.getJumpUpwardsMotion(), var3.z);
      this.isAirBorne = true;
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      int var8 = this.rand.nextInt(3);
      if (var8 < 2 && this.rand.nextFloat() < 0.5F * var2.method38330()) {
         var8++;
      }

      int var9 = 1 << var8;
      this.method5318(var9, true);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   private float method5330() {
      float var3 = !this.method5320() ? 0.8F : 1.4F;
      return ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) * var3;
   }

   public SoundEvent method5331() {
      return !this.method5320() ? SoundEvents.field27075 : SoundEvents.field27104;
   }

   @Override
   public EntitySize getSize(Pose var1) {
      return super.getSize(var1).method32099(0.255F * (float)this.method5319());
   }

   // $VF: synthetic method
   public static float method5333(Class1108 var0) {
      return var0.method5330();
   }
}
