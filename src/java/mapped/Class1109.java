package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;

public class Class1109 extends Class1108 {
   private static String[] field6086;

   public Class1109(EntityType<? extends Class1109> var1, World var2) {
      super(var1, var2);
   }

   public static Class7037 method5334() {
      return Class1009.method4343().method21849(Attributes.MOVEMENT_SPEED, 0.2F);
   }

   public static boolean method5335(EntityType<Class1109> var0, IWorld var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.method6997() != Difficulty.field14351;
   }

   @Override
   public boolean method4266(IWorldReader var1) {
      return var1.checkNoEntityCollision(this) && !var1.method7014(this.getBoundingBox());
   }

   @Override
   public void method5318(int var1, boolean var2) {
      super.method5318(var1, var2);
      this.getAttribute(Attributes.field42113).method38661((double)(var1 * 3));
   }

   @Override
   public float getBrightness() {
      return 1.0F;
   }

   @Override
   public IParticleData method5321() {
      return ParticleTypes.field34074;
   }

   @Override
   public ResourceLocation method4242() {
      return !this.method5320() ? this.getType().method33212() : Class8793.field39533;
   }

   @Override
   public boolean isBurning() {
      return false;
   }

   @Override
   public int method5323() {
      return super.method5323() * 4;
   }

   @Override
   public void method5322() {
      this.field6082 *= 0.9F;
   }

   @Override
   public void jump() {
      Vector3d var3 = this.getMotion();
      this.setMotion(var3.x, (double)(this.getJumpUpwardsMotion() + (float)this.method5319() * 0.1F), var3.z);
      this.isAirBorne = true;
   }

   @Override
   public void handleFluidJump(ITag<Fluid> var1) {
      if (var1 != FluidTags.field40470) {
         super.handleFluidJump(var1);
      } else {
         Vector3d var4 = this.getMotion();
         this.setMotion(var4.x, (double)(0.22F + (float)this.method5319() * 0.05F), var4.z);
         this.isAirBorne = true;
      }
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      return false;
   }

   @Override
   public boolean method5325() {
      return this.isServerWorld();
   }

   @Override
   public float method5326() {
      return super.method5326() + 2.0F;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return !this.method5320() ? SoundEvents.field26751 : SoundEvents.field26752;
   }

   @Override
   public SoundEvent getDeathSound() {
      return !this.method5320() ? SoundEvents.field26750 : SoundEvents.field26743;
   }

   @Override
   public SoundEvent method5327() {
      return !this.method5320() ? SoundEvents.field26754 : SoundEvents.field26755;
   }

   @Override
   public SoundEvent method5331() {
      return SoundEvents.field26753;
   }
}
