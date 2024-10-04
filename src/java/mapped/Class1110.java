package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.Random;

public class Class1110 extends Class1111 implements Class1008 {
   private static final DataParameter<Integer> field6087 = EntityDataManager.<Integer>createKey(Class1110.class, DataSerializers.VARINT);
   private Vector3d field6088 = Vector3d.ZERO;
   private BlockPos field6089 = BlockPos.ZERO;
   private Class2143 field6090 = Class2143.field14028;

   public Class1110(EntityType<? extends Class1110> var1, World var2) {
      super(var1, var2);
      this.field5594 = 5;
      this.field5596 = new Class6831(this, this);
      this.field5595 = new Class8095(this, this);
   }

   @Override
   public Class7395 method4226() {
      return new Class7397(this, this);
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(1, new Class2768(this));
      this.field5600.addGoal(2, new Class2607(this));
      this.field5600.addGoal(3, new Class2606(this));
      this.field5601.addGoal(1, new Class2690(this));
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6087, 0);
   }

   public void method5336(int var1) {
      this.dataManager.method35446(field6087, MathHelper.clamp(var1, 0, 64));
   }

   private void method5337() {
      this.recalculateSize();
      this.getAttribute(Attributes.ATTACK_DAMAGE).method38661((double)(6 + this.method5338()));
   }

   public int method5338() {
      return this.dataManager.<Integer>method35445(field6087);
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return var2.field39969 * 0.35F;
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (field6087.equals(var1)) {
         this.method5337();
      }

      super.notifyDataManagerChange(var1);
   }

   @Override
   public boolean method4256() {
      return true;
   }

   @Override
   public void tick() {
      super.tick();
      if (this.world.isRemote) {
         float var3 = MathHelper.cos((float)(this.getEntityId() * 3 + this.ticksExisted) * 0.13F + (float) Math.PI);
         float var4 = MathHelper.cos((float)(this.getEntityId() * 3 + this.ticksExisted + 1) * 0.13F + (float) Math.PI);
         if (var3 > 0.0F && var4 <= 0.0F) {
            this.world
               .method6745(
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  SoundEvents.field26921,
                  this.getSoundCategory(),
                  0.95F + this.rand.nextFloat() * 0.05F,
                  0.95F + this.rand.nextFloat() * 0.05F,
                  false
               );
         }

         int var5 = this.method5338();
         float var6 = MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)var5);
         float var7 = MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)var5);
         float var8 = (0.3F + var3 * 0.45F) * ((float)var5 * 0.2F + 1.0F);
         this.world
            .addParticle(
               ParticleTypes.field34087, this.getPosX() + (double)var6, this.getPosY() + (double)var8, this.getPosZ() + (double)var7, 0.0, 0.0, 0.0
            );
         this.world
            .addParticle(
               ParticleTypes.field34087, this.getPosX() - (double)var6, this.getPosY() + (double)var8, this.getPosZ() - (double)var7, 0.0, 0.0, 0.0
            );
      }
   }

   @Override
   public void livingTick() {
      if (this.isAlive() && this.method4310()) {
         this.setFire(8);
      }

      super.livingTick();
   }

   @Override
   public void updateAITasks() {
      super.updateAITasks();
   }

   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      this.field6089 = this.getPosition().up(5);
      this.method5336(0);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("AX")) {
         this.field6089 = new BlockPos(var1.getInt("AX"), var1.getInt("AY"), var1.getInt("AZ"));
      }

      this.method5336(var1.getInt("Size"));
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("AX", this.field6089.getX());
      var1.putInt("AY", this.field6089.getY());
      var1.putInt("AZ", this.field6089.getZ());
      var1.putInt("Size", this.method5338());
   }

   @Override
   public boolean isInRangeToRenderDist(double var1) {
      return true;
   }

   @Override
   public Class2266 getSoundCategory() {
      return Class2266.field14733;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26918;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26922;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26920;
   }

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.field33506;
   }

   @Override
   public float getSoundVolume() {
      return 1.0F;
   }

   @Override
   public boolean canAttack(EntityType<?> var1) {
      return true;
   }

   @Override
   public EntitySize getSize(Pose var1) {
      int var4 = this.method5338();
      EntitySize var5 = super.getSize(var1);
      float var6 = (var5.field39968 + 0.2F * (float)var4) / var5.field39968;
      return var5.method32099(var6);
   }

   // $VF: synthetic method
   public static Vector3d method5339(Class1110 var0) {
      return var0.field6088;
   }

   // $VF: synthetic method
   public static Class2143 method5340(Class1110 var0) {
      return var0.field6090;
   }

   // $VF: synthetic method
   public static Random method5341(Class1110 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5342(Class1110 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5343(Class1110 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5344(Class1110 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5345(Class1110 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5346(Class1110 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5347(Class1110 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5348(Class1110 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static BlockPos method5349(Class1110 var0) {
      return var0.field6089;
   }

   // $VF: synthetic method
   public static BlockPos method5350(Class1110 var0, BlockPos var1) {
      return var0.field6089 = var1;
   }

   // $VF: synthetic method
   public static Vector3d method5351(Class1110 var0, Vector3d var1) {
      return var0.field6088 = var1;
   }

   // $VF: synthetic method
   public static Class2143 method5352(Class1110 var0, Class2143 var1) {
      return var0.field6090 = var1;
   }

   // $VF: synthetic method
   public static Random method5353(Class1110 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5354(Class1110 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5355(Class1110 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5356(Class1110 var0) {
      return var0.rand;
   }
}
