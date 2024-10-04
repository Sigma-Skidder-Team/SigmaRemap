package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.EffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Predicate;

public class Class1015 extends Class1014 implements Class1016 {
   private static final DataParameter<Integer> field5672 = EntityDataManager.<Integer>createKey(Class1015.class, DataSerializers.VARINT);
   private static final Predicate<MobEntity> field5673 = new Class119();
   private static final Item field5674 = Items.field37954;
   private static final Set<Item> field5675 = Sets.newHashSet(
      new Item[]{Items.field37841, Items.field37960, Items.field37959, Items.field38112}
   );
   private static final Map<EntityType<?>, SoundEvent> field5676 = Util.<Map<EntityType<?>, SoundEvent>>make(Maps.newHashMap(), var0 -> {
      var0.put(EntityType.field41010, SoundEvents.field26885);
      var0.put(EntityType.field41013, SoundEvents.field26907);
      var0.put(EntityType.field41017, SoundEvents.field26886);
      var0.put(EntityType.field41021, SoundEvents.field26887);
      var0.put(EntityType.field41022, SoundEvents.field26888);
      var0.put(EntityType.field41024, SoundEvents.field26889);
      var0.put(EntityType.field41026, SoundEvents.field26890);
      var0.put(EntityType.field41027, SoundEvents.field26891);
      var0.put(EntityType.field41034, SoundEvents.field26892);
      var0.put(EntityType.field41036, SoundEvents.field26893);
      var0.put(EntityType.field41037, SoundEvents.field26894);
      var0.put(EntityType.field41039, SoundEvents.field26895);
      var0.put(EntityType.field41040, SoundEvents.field26896);
      var0.put(EntityType.field41049, SoundEvents.field26897);
      var0.put(EntityType.field41063, SoundEvents.field26898);
      var0.put(EntityType.field41065, SoundEvents.field26899);
      var0.put(EntityType.field41066, SoundEvents.field26900);
      var0.put(EntityType.field41067, SoundEvents.field26901);
      var0.put(EntityType.field41072, SoundEvents.field26902);
      var0.put(EntityType.field41075, SoundEvents.field26903);
      var0.put(EntityType.field41077, SoundEvents.field26904);
      var0.put(EntityType.field41078, SoundEvents.field26905);
      var0.put(EntityType.field41080, SoundEvents.field26906);
      var0.put(EntityType.field41085, SoundEvents.field26907);
      var0.put(EntityType.field41087, SoundEvents.field26908);
      var0.put(EntityType.field41097, SoundEvents.field26909);
      var0.put(EntityType.field41099, SoundEvents.field26910);
      var0.put(EntityType.field41101, SoundEvents.field26911);
      var0.put(EntityType.field41102, SoundEvents.field26912);
      var0.put(EntityType.field41103, SoundEvents.field26913);
      var0.put(EntityType.field41106, SoundEvents.field26914);
      var0.put(EntityType.field41107, SoundEvents.field26915);
      var0.put(EntityType.field41109, SoundEvents.field26916);
   });
   public float field5677;
   public float field5678;
   public float field5679;
   public float field5680;
   private float field5681 = 1.0F;
   private boolean field5682;
   private BlockPos field5683;

   public Class1015(EntityType<? extends Class1015> var1, World var2) {
      super(var1, var2);
      this.field5596 = new Class6832(this, 10, false);
      this.method4224(Class2163.field14195, -1.0F);
      this.method4224(Class2163.field14196, -1.0F);
      this.method4224(Class2163.field14207, -1.0F);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      this.method4415(this.rand.nextInt(5));
      if (var4 == null) {
         var4 = new Class5097(false);
      }

      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   @Override
   public boolean isChild() {
      return false;
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(0, new Class2747(this, 1.25));
      this.field5600.addGoal(0, new Class2603(this));
      this.field5600.addGoal(1, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.addGoal(2, new Class2778(this));
      this.field5600.addGoal(2, new Class2725(this, 1.0, 5.0F, 1.0F, true));
      this.field5600.addGoal(2, new Class2738(this, 1.0));
      this.field5600.addGoal(3, new Class2619(this));
      this.field5600.addGoal(3, new Class2611(this, 1.0, 3.0F, 7.0F));
   }

   public static Class7037 method4406() {
      return MobEntity.method4220().method21849(Attributes.field42105, 6.0).method21849(Attributes.field42109, 0.4F).method21849(Attributes.MOVEMENT_SPEED, 0.2F);
   }

   @Override
   public Class6990 method4221(World var1) {
      Class6995 var4 = new Class6995(this, var1);
      var4.method21685(false);
      var4.method21674(true);
      var4.method21686(true);
      return var4;
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return var2.field39969 * 0.6F;
   }

   @Override
   public void livingTick() {
      if (this.field5683 == null
         || !this.field5683.method8317(this.getPositionVec(), 3.46)
         || !this.world.getBlockState(this.field5683).isIn(Blocks.JUKEBOX)) {
         this.field5682 = false;
         this.field5683 = null;
      }

      if (this.world.rand.nextInt(400) == 0) {
         method4409(this.world, this);
      }

      super.livingTick();
      this.method4408();
   }

   @Override
   public void setPartying(BlockPos var1, boolean var2) {
      this.field5683 = var1;
      this.field5682 = var2;
   }

   public boolean method4407() {
      return this.field5682;
   }

   private void method4408() {
      this.field5680 = this.field5677;
      this.field5679 = this.field5678;
      this.field5678 = (float)((double)this.field5678 + (double)(!this.onGround && !this.isPassenger() ? 4 : -1) * 0.3);
      this.field5678 = MathHelper.clamp(this.field5678, 0.0F, 1.0F);
      if (!this.onGround && this.field5681 < 1.0F) {
         this.field5681 = 1.0F;
      }

      this.field5681 = (float)((double)this.field5681 * 0.9);
      Vector3d var3 = this.getMotion();
      if (!this.onGround && var3.y < 0.0) {
         this.setMotion(var3.mul(1.0, 0.6, 1.0));
      }

      this.field5677 = this.field5677 + this.field5681 * 2.0F;
   }

   public static boolean method4409(World var0, Entity var1) {
      if (var1.isAlive() && !var1.isSilent() && var0.rand.nextInt(2) == 0) {
         List var4 = var0.<MobEntity>getEntitiesInAABBexcluding(MobEntity.class, var1.getBoundingBox().grow(20.0), field5673);
         if (!var4.isEmpty()) {
            MobEntity var5 = (MobEntity)var4.get(var0.rand.nextInt(var4.size()));
            if (!var5.isSilent()) {
               SoundEvent var6 = method4412(var5.getType());
               var0.playSound(
                  (PlayerEntity)null, var1.getPosX(), var1.getPosY(), var1.getPosZ(), var6, var1.getSoundCategory(), 0.7F, method4413(var0.rand)
               );
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (!this.method4393() && field5675.contains(var5.getItem())) {
         if (!var1.abilities.isCreativeMode) {
            var5.shrink(1);
         }

         if (!this.isSilent()) {
            this.world
               .playSound(
                  (PlayerEntity)null,
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  SoundEvents.field26882,
                  this.getSoundCategory(),
                  1.0F,
                  1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F
               );
         }

         if (!this.world.isRemote) {
            if (this.rand.nextInt(10) != 0) {
               this.world.setEntityState(this, (byte)6);
            } else {
               this.method4399(var1);
               this.world.setEntityState(this, (byte)7);
            }
         }

         return ActionResultType.method9002(this.world.isRemote);
      } else if (var5.getItem() != field5674) {
         if (!this.method4416() && this.method4393() && this.method4401(var1)) {
            if (!this.world.isRemote) {
               this.method4403(!this.method4402());
            }

            return ActionResultType.method9002(this.world.isRemote);
         } else {
            return super.method4285(var1, var2);
         }
      } else {
         if (!var1.abilities.isCreativeMode) {
            var5.shrink(1);
         }

         this.addPotionEffect(new EffectInstance(Effects.POISON, 900));
         if (var1.isCreative() || !this.method3362()) {
            this.attackEntityFrom(DamageSource.causePlayerDamage(var1), Float.MAX_VALUE);
         }

         return ActionResultType.method9002(this.world.isRemote);
      }
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return false;
   }

   public static boolean method4410(EntityType<Class1015> var0, IWorld var1, Class2202 var2, BlockPos var3, Random var4) {
      BlockState var7 = var1.getBlockState(var3.down());
      return (
            var7.isIn(BlockTags.LEAVES)
               || var7.isIn(Blocks.GRASS_BLOCK)
               || var7.isIn(BlockTags.field32751)
               || var7.isIn(Blocks.AIR)
         )
         && var1.method7021(var3, 0) > 8;
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      return false;
   }

   @Override
   public void updateFallState(double var1, boolean var3, BlockState var4, BlockPos var5) {
   }

   @Override
   public boolean method4386(Class1018 var1) {
      return false;
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return null;
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      return var1.attackEntityFrom(DamageSource.method31115(this), 3.0F);
   }

   @Nullable
   @Override
   public SoundEvent getAmbientSound() {
      return method4411(this.world, this.world.rand);
   }

   public static SoundEvent method4411(World var0, Random var1) {
      if (var0.method6997() != Difficulty.PEACEFUL && var1.nextInt(1000) == 0) {
         ArrayList var4 = Lists.newArrayList(field5676.keySet());
         return method4412((EntityType<?>)var4.get(var1.nextInt(var4.size())));
      } else {
         return SoundEvents.field26880;
      }
   }

   private static SoundEvent method4412(EntityType<?> var0) {
      return field5676.getOrDefault(var0, SoundEvents.field26880);
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26884;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26881;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field26917, 0.15F, 1.0F);
   }

   @Override
   public float playFlySound(float var1) {
      this.playSound(SoundEvents.field26883, 0.15F, 1.0F);
      return var1 + this.field5678 / 2.0F;
   }

   @Override
   public boolean makeFlySound() {
      return true;
   }

   @Override
   public float getSoundPitch() {
      return method4413(this.rand);
   }

   public static float method4413(Random var0) {
      return (var0.nextFloat() - var0.nextFloat()) * 0.2F + 1.0F;
   }

   @Override
   public Class2266 getSoundCategory() {
      return Class2266.field14734;
   }

   @Override
   public boolean canBePushed() {
      return true;
   }

   @Override
   public void collideWithEntity(Entity var1) {
      if (!(var1 instanceof PlayerEntity)) {
         super.collideWithEntity(var1);
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      if (!this.isInvulnerableTo(source)) {
         this.method4403(false);
         return super.attackEntityFrom(source, var2);
      } else {
         return false;
      }
   }

   public int method4414() {
      return MathHelper.clamp(this.dataManager.<Integer>method35445(field5672), 0, 4);
   }

   public void method4415(int var1) {
      this.dataManager.method35446(field5672, var1);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5672, 0);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("Variant", this.method4414());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method4415(var1.getInt("Variant"));
   }

   public boolean method4416() {
      return !this.onGround;
   }

   @Override
   public Vector3d func_241205_ce_() {
      return new Vector3d(0.0, (double)(0.5F * this.getEyeHeight()), (double)(this.getWidth() * 0.4F));
   }

   // $VF: synthetic method
   public static Map method4418() {
      return field5676;
   }
}
