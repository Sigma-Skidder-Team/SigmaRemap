package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;

public class Class1048 extends WaterMobEntity {
   private static final DataParameter<BlockPos> field5804 = EntityDataManager.<BlockPos>createKey(Class1048.class, DataSerializers.field33401);
   private static final DataParameter<Boolean> field5805 = EntityDataManager.<Boolean>createKey(Class1048.class, DataSerializers.field33398);
   private static final DataParameter<Integer> field5806 = EntityDataManager.<Integer>createKey(Class1048.class, DataSerializers.VARINT);
   private static final Class8522 field5807 = new Class8522().method30203(10.0).method30205().method30204().method30206();
   public static final Predicate<ItemEntity> field5808 = var0 -> !var0.method4135() && var0.isAlive() && var0.isInWater();

   public Class1048(EntityType<? extends Class1048> var1, World var2) {
      super(var1, var2);
      this.field5596 = new Class6836(this);
      this.field5595 = new Class8093(this, 10);
      this.method4281(true);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      this.setAir(this.getMaxAir());
      this.rotationPitch = 0.0F;
      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean canBreatheUnderwater() {
      return false;
   }

   @Override
   public void method4775(int var1) {
   }

   public void method4776(BlockPos var1) {
      this.dataManager.method35446(field5804, var1);
   }

   public BlockPos method4777() {
      return this.dataManager.<BlockPos>method35445(field5804);
   }

   public boolean method4778() {
      return this.dataManager.<Boolean>method35445(field5805);
   }

   public void method4779(boolean var1) {
      this.dataManager.method35446(field5805, var1);
   }

   public int method4780() {
      return this.dataManager.<Integer>method35445(field5806);
   }

   public void method4781(int var1) {
      this.dataManager.method35446(field5806, var1);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5804, BlockPos.ZERO);
      this.dataManager.register(field5805, false);
      this.dataManager.register(field5806, 2400);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("TreasurePosX", this.method4777().getX());
      var1.putInt("TreasurePosY", this.method4777().getY());
      var1.putInt("TreasurePosZ", this.method4777().getZ());
      var1.putBoolean("GotFish", this.method4778());
      var1.putInt("Moistness", this.method4780());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      int var4 = var1.getInt("TreasurePosX");
      int var5 = var1.getInt("TreasurePosY");
      int var6 = var1.getInt("TreasurePosZ");
      this.method4776(new BlockPos(var4, var5, var6));
      super.readAdditional(var1);
      this.method4779(var1.getBoolean("GotFish"));
      this.method4781(var1.getInt("Moistness"));
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(0, new Class2727(this));
      this.field5600.addGoal(0, new Class2763(this));
      this.field5600.addGoal(1, new Class2683(this));
      this.field5600.addGoal(2, new Class2776(this, 4.0));
      this.field5600.addGoal(4, new Class2740(this, 1.0, 10));
      this.field5600.addGoal(4, new Class2668(this));
      this.field5600.addGoal(5, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.addGoal(5, new Class2756(this, 10));
      this.field5600.addGoal(6, new Class2647(this, 1.2F, true));
      this.field5600.addGoal(8, new Class2688(this));
      this.field5600.addGoal(8, new Class2602(this));
      this.field5600.addGoal(9, new Class2770<Class1105>(this, Class1105.class, 8.0F, 1.0, 1.0));
      this.field5601.addGoal(1, new HurtByTargetGoal(this, Class1105.class).method10918());
   }

   public static Class7037 method4782() {
      return MobEntity.method4220().method21849(Attributes.field42105, 10.0).method21849(Attributes.MOVEMENT_SPEED, 1.2F).method21849(Attributes.ATTACK_DAMAGE, 3.0);
   }

   @Override
   public Class6990 method4221(World var1) {
      return new Class6997(this, var1);
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      boolean var4 = var1.attackEntityFrom(DamageSource.method31115(this), (float)((int)this.getAttributeValue(Attributes.ATTACK_DAMAGE)));
      if (var4) {
         this.applyEnchantments(this, var1);
         this.playSound(SoundEvents.field26500, 1.0F, 1.0F);
      }

      return var4;
   }

   @Override
   public int getMaxAir() {
      return 4800;
   }

   @Override
   public int determineNextAir(int var1) {
      return this.getMaxAir();
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 0.3F;
   }

   @Override
   public int method4259() {
      return 1;
   }

   @Override
   public int method4260() {
      return 1;
   }

   @Override
   public boolean canBeRidden(Entity var1) {
      return true;
   }

   @Override
   public boolean canPickUpItem(ItemStack var1) {
      EquipmentSlotType var4 = MobEntity.method4271(var1);
      return !this.getItemStackFromSlot(var4).isEmpty() ? false : var4 == EquipmentSlotType.MAINHAND && super.canPickUpItem(var1);
   }

   @Override
   public void method4246(ItemEntity var1) {
      if (this.getItemStackFromSlot(EquipmentSlotType.MAINHAND).isEmpty()) {
         ItemStack var4 = var1.method4124();
         if (this.method4252(var4)) {
            this.triggerItemPickupTrigger(var1);
            this.setItemStackToSlot(EquipmentSlotType.MAINHAND, var4);
            this.field5605[EquipmentSlotType.MAINHAND.getIndex()] = 2.0F;
            this.onItemPickup(var1, var4.getCount());
            var1.remove();
         }
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.method4305()) {
         if (!this.isInWaterRainOrBubbleColumn()) {
            this.method4781(this.method4780() - 1);
            if (this.method4780() <= 0) {
               this.attackEntityFrom(DamageSource.field39011, 1.0F);
            }

            if (this.onGround) {
               this.setMotion(
                  this.getMotion()
                     .add((double)((this.rand.nextFloat() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.rand.nextFloat() * 2.0F - 1.0F) * 0.2F))
               );
               this.rotationYaw = this.rand.nextFloat() * 360.0F;
               this.onGround = false;
               this.isAirBorne = true;
            }
         } else {
            this.method4781(2400);
         }

         if (this.world.isRemote && this.isInWater() && this.getMotion().lengthSquared() > 0.03) {
            Vector3d var3 = this.getLook(0.0F);
            float var4 = MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0)) * 0.3F;
            float var5 = MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0)) * 0.3F;
            float var6 = 1.2F - this.rand.nextFloat() * 0.7F;

            for (int var7 = 0; var7 < 2; var7++) {
               this.world
                  .addParticle(
                     ParticleTypes.field34105,
                     this.getPosX() - var3.x * (double)var6 + (double)var4,
                     this.getPosY() - var3.y,
                     this.getPosZ() - var3.z * (double)var6 + (double)var5,
                     0.0,
                     0.0,
                     0.0
                  );
               this.world
                  .addParticle(
                     ParticleTypes.field34105,
                     this.getPosX() - var3.x * (double)var6 - (double)var4,
                     this.getPosY() - var3.y,
                     this.getPosZ() - var3.z * (double)var6 - (double)var5,
                     0.0,
                     0.0,
                     0.0
                  );
            }
         }
      } else {
         this.setAir(this.getMaxAir());
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 38) {
         super.handleStatusUpdate(var1);
      } else {
         this.method4783(ParticleTypes.field34078);
      }
   }

   private void method4783(IParticleData var1) {
      for (int var4 = 0; var4 < 7; var4++) {
         double var5 = this.rand.nextGaussian() * 0.01;
         double var7 = this.rand.nextGaussian() * 0.01;
         double var9 = this.rand.nextGaussian() * 0.01;
         this.world.addParticle(var1, this.getPosXRandom(1.0), this.getPosYRandom() + 0.2, this.getPosZRandom(1.0), var5, var7, var9);
      }
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (!var5.isEmpty() && var5.getItem().method11743(Class5985.field26114)) {
         if (!this.world.isRemote) {
            this.playSound(SoundEvents.field26502, 1.0F, 1.0F);
         }

         this.method4779(true);
         if (!var1.abilities.isCreativeMode) {
            var5.shrink(1);
         }

         return ActionResultType.method9002(this.world.isRemote);
      } else {
         return super.method4285(var1, var2);
      }
   }

   public static boolean method4784(EntityType<Class1048> var0, IWorld var1, Class2202 var2, BlockPos var3, Random var4) {
      if (var3.getY() > 45 && var3.getY() < var1.method6776()) {
         Optional var7 = var1.method7178(var3);
         return (
               !Objects.equals(var7, Optional.<RegistryKey<Biome>>of(Class9495.field44121))
                  || !Objects.equals(var7, Optional.<RegistryKey<Biome>>of(Class9495.field44145))
            )
            && var1.getFluidState(var3).method23486(FluidTags.field40469);
      } else {
         return false;
      }
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26503;
   }

   @Nullable
   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26501;
   }

   @Nullable
   @Override
   public SoundEvent getAmbientSound() {
      return !this.isInWater() ? SoundEvents.field26498 : SoundEvents.field26499;
   }

   @Override
   public SoundEvent method2860() {
      return SoundEvents.field26506;
   }

   @Override
   public SoundEvent method2859() {
      return SoundEvents.field26507;
   }

   public boolean method4785() {
      BlockPos var3 = this.method4230().method21643();
      return var3 == null ? false : var3.method8317(this.getPositionVec(), 12.0);
   }

   @Override
   public void travel(Vector3d var1) {
      if (this.isServerWorld() && this.isInWater()) {
         this.moveRelative(this.getAIMoveSpeed(), var1);
         this.move(MoverType.SELF, this.getMotion());
         this.setMotion(this.getMotion().scale(0.9));
         if (this.method4232() == null) {
            this.setMotion(this.getMotion().add(0.0, -0.005, 0.0));
         }
      } else {
         super.travel(var1);
      }
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return true;
   }

   // $VF: synthetic method
   public static Random method4787(Class1048 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4788(Class1048 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4789(Class1048 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Class8522 method4790() {
      return field5807;
   }
}
