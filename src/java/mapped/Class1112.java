package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class Class1112 extends Class1111 implements IMob {
   private static final DataParameter<Boolean> field6091 = EntityDataManager.<Boolean>createKey(Class1112.class, DataSerializers.field33398);
   private int field6092 = 1;

   public Class1112(EntityType<? extends Class1112> var1, World var2) {
      super(var1, var2);
      this.field5594 = 5;
      this.field5596 = new Class6837(this);
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(5, new Class2684(this));
      this.field5600.addGoal(7, new Class2757(this));
      this.field5600.addGoal(7, new Class2639(this));
      this.field5601
         .addGoal(1, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, 10, true, false, var1 -> Math.abs(var1.getPosY() - this.getPosY()) <= 4.0));
   }

   public boolean method5357() {
      return this.dataManager.<Boolean>method35445(field6091);
   }

   public void method5358(boolean var1) {
      this.dataManager.method35446(field6091, var1);
   }

   public int method5359() {
      return this.field6092;
   }

   @Override
   public boolean method4256() {
      return true;
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      if (!this.isInvulnerableTo(source)) {
         if (source.getImmediateSource() instanceof Class899 && source.getTrueSource() instanceof PlayerEntity) {
            super.attackEntityFrom(source, 1000.0F);
            return true;
         } else {
            return super.attackEntityFrom(source, var2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6091, false);
   }

   public static MutableAttribute method5360() {
      return MobEntity.method4220().method21849(Attributes.MAX_HEALTH, 10.0).method21849(Attributes.FOLLOW_RANGE, 100.0);
   }

   @Override
   public SoundCategory getSoundCategory() {
      return SoundCategory.field14733;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26616;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26618;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26617;
   }

   @Override
   public float getSoundVolume() {
      return 5.0F;
   }

   public static boolean method5361(EntityType<Class1112> var0, IWorld var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.method6997() != Difficulty.PEACEFUL && var4.nextInt(20) == 0 && method4264(var0, var1, var2, var3, var4);
   }

   @Override
   public int method4267() {
      return 1;
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("ExplosionPower", this.field6092);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("ExplosionPower", 99)) {
         this.field6092 = var1.getInt("ExplosionPower");
      }
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 2.6F;
   }
}
