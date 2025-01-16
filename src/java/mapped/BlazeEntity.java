package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class BlazeEntity extends MonsterEntity {
   private static String[] field6059;
   private float field6060 = 0.5F;
   private int field6061;
   private static final DataParameter<Byte> field6062 = EntityDataManager.<Byte>createKey(BlazeEntity.class, DataSerializers.field33390);

   public BlazeEntity(EntityType<? extends BlazeEntity> var1, World var2) {
      super(var1, var2);
      this.method4224(PathNodeType.WATER, -1.0F);
      this.method4224(PathNodeType.LAVA, 8.0F);
      this.method4224(PathNodeType.DANGER_FIRE, 0.0F);
      this.method4224(PathNodeType.DAMAGE_FIRE, 0.0F);
      this.field5594 = 10;
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(4, new Class2783(this));
      this.field5600.addGoal(5, new Class2660(this, 1.0));
      this.field5600.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0, 0.0F));
      this.field5600.addGoal(8, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.addGoal(8, new Class2668(this));
      this.field5601.addGoal(1, new HurtByTargetGoal(this).method10918());
      this.field5601.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
   }

   public static MutableAttribute method5292() {
      return MonsterEntity.method4343().method21849(Attributes.ATTACK_DAMAGE, 6.0).method21849(Attributes.MOVEMENT_SPEED, 0.23F).method21849(Attributes.FOLLOW_RANGE, 48.0);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6062, (byte)0);
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26402;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26405;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26404;
   }

   @Override
   public float getBrightness() {
      return 1.0F;
   }

   @Override
   public void livingTick() {
      if (!this.onGround && this.getMotion().y < 0.0) {
         this.setMotion(this.getMotion().mul(1.0, 0.6, 1.0));
      }

      if (this.world.isRemote) {
         if (this.rand.nextInt(24) == 0 && !this.isSilent()) {
            this.world
               .method6745(
                  this.getPosX() + 0.5,
                  this.getPosY() + 0.5,
                  this.getPosZ() + 0.5,
                  SoundEvents.field26403,
                  this.getSoundCategory(),
                  1.0F + this.rand.nextFloat(),
                  this.rand.nextFloat() * 0.7F + 0.3F,
                  false
               );
         }

         for (int var3 = 0; var3 < 2; var3++) {
            this.world.addParticle(ParticleTypes.field34085, this.getPosXRandom(0.5), this.getPosYRandom(), this.getPosZRandom(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.livingTick();
   }

   @Override
   public boolean method3124() {
      return true;
   }

   @Override
   public void updateAITasks() {
      this.field6061--;
      if (this.field6061 <= 0) {
         this.field6061 = 100;
         this.field6060 = 0.5F + (float)this.rand.nextGaussian() * 3.0F;
      }

      LivingEntity var3 = this.method4232();
      if (var3 != null && var3.getPosYEye() > this.getPosYEye() + (double)this.field6060 && this.canAttack(var3)) {
         Vector3d var4 = this.getMotion();
         this.setMotion(this.getMotion().add(0.0, (0.3F - var4.y) * 0.3F, 0.0));
         this.isAirBorne = true;
      }

      super.updateAITasks();
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      return false;
   }

   @Override
   public boolean isBurning() {
      return this.method5293();
   }

   private boolean method5293() {
      return (this.dataManager.<Byte>method35445(field6062) & 1) != 0;
   }

   private void method5294(boolean var1) {
      byte var4 = this.dataManager.method35445(field6062);
      if (!var1) {
         var4 = (byte)(var4 & -2);
      } else {
         var4 = (byte)(var4 | 1);
      }

      this.dataManager.method35446(field6062, var4);
   }

   // $VF: synthetic method
   public static void method5295(BlazeEntity var0, boolean var1) {
      var0.method5294(var1);
   }
}
