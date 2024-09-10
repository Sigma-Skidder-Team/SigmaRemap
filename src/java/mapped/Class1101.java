package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class1101 extends Class1009 {
   private static String[] field6056;
   private static final DataParameter<Byte> field6057 = EntityDataManager.<Byte>createKey(Class1101.class, DataSerializers.field33390);

   public Class1101(EntityType<? extends Class1101> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(1, new Class2603(this));
      this.field5600.addGoal(3, new Class2745(this, 0.4F));
      this.field5600.addGoal(4, new Class2657(this));
      this.field5600.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 0.8));
      this.field5600.addGoal(6, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.addGoal(6, new Class2668(this));
      this.field5601.addGoal(1, new HurtByTargetGoal(this));
      this.field5601.addGoal(2, new Class2718<PlayerEntity>(this, PlayerEntity.class));
      this.field5601.addGoal(3, new Class2718<Class1058>(this, Class1058.class));
   }

   @Override
   public double method3310() {
      return (double)(this.getHeight() * 0.5F);
   }

   @Override
   public Class6990 method4221(World var1) {
      return new Class6993(this, var1);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6057, (byte)0);
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.world.isRemote) {
         this.method5290(this.collidedHorizontally);
      }
   }

   public static Class7037 method5288() {
      return Class1009.method4343().method21849(Attributes.field42105, 16.0).method21849(Attributes.MOVEMENT_SPEED, 0.3F);
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27119;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27121;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27120;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field27122, 0.15F, 1.0F);
   }

   @Override
   public boolean isOnLadder() {
      return this.method5289();
   }

   @Override
   public void setMotionMultiplier(BlockState var1, Vector3d var2) {
      if (!var1.isIn(Blocks.COBWEB)) {
         super.setMotionMultiplier(var1, var2);
      }
   }

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.field33507;
   }

   @Override
   public boolean isPotionApplicable(EffectInstance var1) {
      return var1.getPotion() != Effects.POISON ? super.isPotionApplicable(var1) : false;
   }

   public boolean method5289() {
      return (this.dataManager.<Byte>method35445(field6057) & 1) != 0;
   }

   public void method5290(boolean var1) {
      byte var4 = this.dataManager.<Byte>method35445(field6057);
      if (!var1) {
         var4 = (byte)(var4 & -2);
      } else {
         var4 = (byte)(var4 | 1);
      }

      this.dataManager.method35446(field6057, var4);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      var4 = super.method4276(var1, var2, var3, var4, var5);
      if (var1.method6814().nextInt(100) == 0) {
         Class1085 var8 = EntityType.field41078.create(this.world);
         var8.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, 0.0F);
         var8.method4276(var1, var2, var3, (Class5093)null, (CompoundNBT)null);
         var8.method3311(this);
      }

      if (var4 == null) {
         var4 = new Class5092();
         if (var1.method6997() == Difficulty.field14354 && var1.method6814().nextFloat() < 0.1F * var2.method38330()) {
            ((Class5092)var4).method15575(var1.method6814());
         }
      }

      if (var4 instanceof Class5092) {
         Effect var10 = ((Class5092)var4).field23180;
         if (var10 != null) {
            this.addPotionEffect(new EffectInstance(var10, Integer.MAX_VALUE));
         }
      }

      return var4;
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 0.65F;
   }
}
