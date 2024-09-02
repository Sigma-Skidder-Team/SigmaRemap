package net.minecraft.entity;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.Packet;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.*;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Predicate;

public abstract class LivingEntity extends Entity {
   private static final UUID field4931 = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
   private static final UUID field4932 = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final Class9689 field4933 = new Class9689(field4931, "Sprinting speed boost", 0.3F, AttributeModifierOperation.MULTIPLY_TOTAL);
   public static final DataParameter<Byte> field4934 = EntityDataManager.<Byte>createKey(LivingEntity.class, DataSerializers.field33390);
   private static final DataParameter<Float> field4935 = EntityDataManager.<Float>createKey(LivingEntity.class, DataSerializers.field33392);
   private static final DataParameter<Integer> field4936 = EntityDataManager.<Integer>createKey(LivingEntity.class, DataSerializers.field33391);
   private static final DataParameter<Boolean> field4937 = EntityDataManager.<Boolean>createKey(LivingEntity.class, DataSerializers.field33398);
   private static final DataParameter<Integer> field4938 = EntityDataManager.<Integer>createKey(LivingEntity.class, DataSerializers.field33391);
   private static final DataParameter<Integer> field4939 = EntityDataManager.<Integer>createKey(LivingEntity.class, DataSerializers.field33391);
   private static final DataParameter<Optional<BlockPos>> field4940 = EntityDataManager.<Optional<BlockPos>>createKey(LivingEntity.class, DataSerializers.field33402);
   public static final EntitySize field4941 = EntitySize.method32102(0.2F, 0.2F);
   private final Class9020 field4942;
   private final Class8039 field4943 = new Class8039(this);
   private final Map<Effect, Class2023> field4944 = Maps.newHashMap();
   private final NonNullList<ItemStack> field4945 = NonNullList.<ItemStack>method68(2, ItemStack.EMPTY);
   private final NonNullList<ItemStack> field4946 = NonNullList.<ItemStack>method68(4, ItemStack.EMPTY);
   public boolean field4947;
   public Hand field4948;
   public int field4949;
   public int field4950;
   public int field4951;
   public int field4952;
   public int field4953;
   public float field4954;
   public int field4955;
   public float field4956;
   public float field4957;
   public int field4958;
   public float field4959;
   public float field4960;
   public float field4961;
   public final int field4962 = 20;
   public final float field4963;
   public final float field4964;
   public float field4965;
   public float field4966;
   public float field4967;
   public float field4968;
   public float field4969 = 0.02F;
   public PlayerEntity field4970;
   public int field4971;
   public boolean field4972;
   public int field4973;
   public float field4974;
   public float field4975;
   public float field4976;
   public float field4977;
   public float field4978;
   public int field4979;
   public float field4980;
   public boolean field4981;
   public float field4982;
   public float field4983;
   public float field4984;
   public int field4985;
   public double field4986;
   public double field4987;
   public double field4988;
   public double field4989;
   public double field4990;
   public double field4991;
   public int field4992;
   private boolean field4993 = true;
   private LivingEntity field4994;
   private int field4995;
   private LivingEntity field4996;
   private int field4997;
   private float field4998;
   public int field4999;
   private float field5000;
   public ItemStack field5001 = ItemStack.EMPTY;
   public int field5002;
   public int field5003;
   private BlockPos field5004;
   private Optional<BlockPos> field5005 = Optional.<BlockPos>empty();
   private Class8654 field5006;
   private long field5007;
   public int field5008;
   private float field5009;
   private float field5010;
   public Class6947<?> field5011;

   public LivingEntity(EntityType<? extends LivingEntity> var1, World var2) {
      super(var1, var2);
      this.field4942 = new Class9020(Class9614.method37375(var1));
      this.method3043(this.method3075());
      this.preventEntitySpawning = true;
      this.field4964 = (float)((Math.random() + 1.0) * 0.01F);
      this.method3216();
      this.field4963 = (float)Math.random() * 12398.0F;
      this.rotationYaw = (float)(Math.random() * (float) (Math.PI * 2));
      this.field4967 = this.rotationYaw;
      this.stepHeight = 0.6F;
      NBTDynamicOps var5 = NBTDynamicOps.INSTANCE;
      this.field5011 = this.method2994(new Dynamic(var5, var5.createMap(ImmutableMap.of(var5.createString("memories"), var5.emptyMap()))));
   }

   public Class6947<?> method2992() {
      return this.field5011;
   }

   public Class6971<?> method2993() {
      return Class6947.method21400(ImmutableList.of(), ImmutableList.of());
   }

   public Class6947<?> method2994(Dynamic<?> var1) {
      return this.method2993().method21513(var1);
   }

   @Override
   public void method2995() {
      this.method2741(Class8654.field39004, Float.MAX_VALUE);
   }

   public boolean method2996(EntityType<?> var1) {
      return true;
   }

   @Override
   public void registerData() {
      this.dataManager.register(field4934, (byte)0);
      this.dataManager.register(field4936, 0);
      this.dataManager.register(field4937, false);
      this.dataManager.register(field4938, 0);
      this.dataManager.register(field4939, 0);
      this.dataManager.register(field4935, 1.0F);
      this.dataManager.register(field4940, Optional.<BlockPos>empty());
   }

   public static Class7037 method2997() {
      return Class9767.method38416()
         .method21848(Attributes.field42105)
         .method21848(Attributes.field42107)
         .method21848(Attributes.MOVEMENT_SPEED)
         .method21848(Attributes.field42113)
         .method21848(Attributes.field42114);
   }

   @Override
   public void method2761(double var1, boolean var3, BlockState var4, BlockPos var5) {
      if (!this.method3250()) {
         this.method3258();
      }

      if (!this.world.isRemote && var3 && this.fallDistance > 0.0F) {
         this.method3003();
         this.method3004();
      }

      if (!this.world.isRemote && this.fallDistance > 3.0F && var3) {
         float var8 = (float) MathHelper.method37773(this.fallDistance - 3.0F);
         if (!var4.isAir()) {
            double var9 = Math.min((double)(0.2F + var8 / 15.0F), 2.5);
            int var11 = (int)(150.0 * var9);
            ((ServerWorld)this.world)
               .method6939(new Class7439(ParticleTypes.field34051, var4), this.getPosX(), this.getPosY(), this.getPosZ(), var11, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.method2761(var1, var3, var4, var5);
   }

   public boolean method2998() {
      return this.method3089() == Class7809.field33506;
   }

   public float method2999(float var1) {
      return MathHelper.lerp(var1, this.field5010, this.field5009);
   }

   @Override
   public void method3000() {
      this.field4956 = this.field4957;
      if (this.firstUpdate) {
         this.method3173().ifPresent(this::method3177);
      }

      if (this.method3001()) {
         this.method3002();
      }

      super.method3000();
      this.world.getProfiler().startSection("livingEntityBaseTick");
      boolean var3 = this instanceof PlayerEntity;
      if (this.isAlive()) {
         if (!this.method3180()) {
            if (var3 && !this.world.method6810().method24525(this.getBoundingBox())) {
               double var4 = this.world.method6810().method24526(this) + this.world.method6810().method24546();
               if (var4 < 0.0) {
                  double var6 = this.world.method6810().method24548();
                  if (var6 > 0.0) {
                     this.method2741(Class8654.field38997, (float)Math.max(1, MathHelper.floor(-var4 * var6)));
                  }
               }
            }
         } else {
            this.method2741(Class8654.field38997, 1.0F);
         }
      }

      if (this.method3249() || this.world.isRemote) {
         this.method3223();
      }

      boolean var8 = var3 && ((PlayerEntity)this).abilities.disableDamage;
      if (this.isAlive()) {
         if (this.method3263(Class8953.field40469)
            && !this.world.getBlockState(new BlockPos(this.getPosX(), this.method3442(), this.getPosZ())).method23448(Blocks.field37013)) {
            if (!this.method2998() && !Class7182.method22538(this) && !var8) {
               this.method3352(this.method3011(this.method3351()));
               if (this.method3351() == -20) {
                  this.method3352(0);
                  Vector3d var9 = this.method3433();

                  for (int var10 = 0; var10 < 8; var10++) {
                     double var11 = this.rand.nextDouble() - this.rand.nextDouble();
                     double var13 = this.rand.nextDouble() - this.rand.nextDouble();
                     double var15 = this.rand.nextDouble() - this.rand.nextDouble();
                     this.world
                        .method6746(
                           ParticleTypes.field34052,
                           this.getPosX() + var11,
                           this.getPosY() + var13,
                           this.getPosZ() + var15,
                           var9.x,
                           var9.y,
                           var9.z
                        );
                  }

                  this.method2741(Class8654.field38999, 2.0F);
               }
            }

            if (!this.world.isRemote && this.isPassenger() && this.getRidingEntity() != null && !this.getRidingEntity().method3007()) {
               this.stopRiding();
            }
         } else if (this.method3351() < this.getMaxAir()) {
            this.method3352(this.method3012(this.method3351()));
         }

         if (!this.world.isRemote) {
            BlockPos var17 = this.getPosition();
            if (!Objects.equal(this.field5004, var17)) {
               this.field5004 = var17;
               this.method2762(var17);
            }
         }
      }

      if (this.isAlive() && this.method3254()) {
         this.method3223();
      }

      if (this.field4952 > 0) {
         this.field4952--;
      }

      if (this.hurtResistantTime > 0 && !(this instanceof ServerPlayerEntity)) {
         this.hurtResistantTime--;
      }

      if (this.getShouldBeDead()) {
         this.method3008();
      }

      if (this.field4971 <= 0) {
         this.field4970 = null;
      } else {
         this.field4971--;
      }

      if (this.field4996 != null && !this.field4996.isAlive()) {
         this.field4996 = null;
      }

      if (this.field4994 != null) {
         if (this.field4994.isAlive()) {
            if (this.ticksExisted - this.field4995 > 100) {
               this.method3017((LivingEntity)null);
            }
         } else {
            this.method3017((LivingEntity)null);
         }
      }

      this.method3024();
      this.field4977 = this.field4976;
      this.field4966 = this.field4965;
      this.field4968 = this.field4967;
      this.prevRotationYaw = this.rotationYaw;
      this.prevRotationPitch = this.rotationPitch;
      this.world.getProfiler().endSection();
   }

   public boolean method3001() {
      return this.ticksExisted % 5 == 0
         && this.method3433().x != 0.0
         && this.method3433().z != 0.0
         && !this.isSpectator()
         && Class7858.method26333(this)
         && this.method2889();
   }

   public void method3002() {
      Vector3d var3 = this.method3433();
      this.world
         .method6746(
            ParticleTypes.field34076,
            this.getPosX() + (this.rand.nextDouble() - 0.5) * (double)this.method3429(),
            this.getPosY() + 0.1,
            this.getPosZ() + (this.rand.nextDouble() - 0.5) * (double)this.method3429(),
            var3.x * -0.2,
            0.1,
            var3.z * -0.2
         );
      float var4 = !(this.rand.nextFloat() * 0.4F + this.rand.nextFloat() > 0.9F) ? 0.0F : 0.6F;
      this.method2863(Sounds.field27092, var4, 0.6F + this.rand.nextFloat() * 0.4F);
   }

   public boolean method2889() {
      return this.world.getBlockState(this.method3230()).method23446(BlockTags.field32802);
   }

   @Override
   public float method2977() {
      return this.method2889() && Class7858.method26322(Class8122.field34907, this) > 0 ? 1.0F : super.method2977();
   }

   public boolean method2985(BlockState var1) {
      return !var1.isAir() || this.method3165();
   }

   public void method3003() {
      Class9805 var3 = this.method3085(Attributes.MOVEMENT_SPEED);
      if (var3 != null && var3.method38664(field4932) != null) {
         var3.method38671(field4932);
      }
   }

   public void method3004() {
      if (!this.method3260().isAir()) {
         int var3 = Class7858.method26322(Class8122.field34907, this);
         if (var3 > 0 && this.method2889()) {
            Class9805 var4 = this.method3085(Attributes.MOVEMENT_SPEED);
            if (var4 == null) {
               return;
            }

            var4.method38667(new Class9689(field4932, "Soul speed boost", (double)(0.03F * (1.0F + (float)var3 * 0.35F)), AttributeModifierOperation.ADDITION));
            if (this.method3013().nextFloat() < 0.04F) {
               ItemStack var5 = this.method2943(Class2106.field13733);
               var5.method32121(1, this, var0 -> var0.method3184(Class2106.field13733));
            }
         }
      }
   }

   public void method2762(BlockPos var1) {
      int var4 = Class7858.method26322(Class8122.field34905, this);
      if (var4 > 0) {
         Class6089.method18829(this, this.world, var1, var4);
      }

      if (this.method2985(this.method3260())) {
         this.method3003();
      }

      this.method3004();
   }

   public boolean method3005() {
      return false;
   }

   public float method3006() {
      return !this.method3005() ? 1.0F : 0.5F;
   }

   public boolean method2897() {
      return true;
   }

   @Override
   public boolean method3007() {
      return false;
   }

   public void method3008() {
      this.field4955++;
      if (this.field4955 == 20) {
         this.method2904();

         for (int var3 = 0; var3 < 20; var3++) {
            double var4 = this.rand.nextGaussian() * 0.02;
            double var6 = this.rand.nextGaussian() * 0.02;
            double var8 = this.rand.nextGaussian() * 0.02;
            this.world.method6746(ParticleTypes.field34089, this.method3438(1.0), this.method3441(), this.method3445(1.0), var4, var6, var8);
         }
      }
   }

   public boolean method3009() {
      return !this.method3005();
   }

   public boolean method3010() {
      return !this.method3005();
   }

   public int method3011(int var1) {
      int var4 = Class7858.method26325(this);
      return var4 > 0 && this.rand.nextInt(var4 + 1) > 0 ? var1 : var1 - 1;
   }

   public int method3012(int var1) {
      return Math.min(var1 + 4, this.getMaxAir());
   }

   public int method2937(PlayerEntity var1) {
      return 0;
   }

   public boolean method2938() {
      return false;
   }

   public Random method3013() {
      return this.rand;
   }

   @Nullable
   public LivingEntity method3014() {
      return this.field4994;
   }

   public int method3015() {
      return this.field4995;
   }

   public void method3016(PlayerEntity var1) {
      this.field4970 = var1;
      this.field4971 = this.ticksExisted;
   }

   public void method3017(LivingEntity var1) {
      this.field4994 = var1;
      this.field4995 = this.ticksExisted;
   }

   @Nullable
   public LivingEntity method3018() {
      return this.field4996;
   }

   public int method3019() {
      return this.field4997;
   }

   public void method3020(Entity var1) {
      if (!(var1 instanceof LivingEntity)) {
         this.field4996 = null;
      } else {
         this.field4996 = (LivingEntity)var1;
      }

      this.field4997 = this.ticksExisted;
   }

   public int method3021() {
      return this.field4973;
   }

   public void method3022(int var1) {
      this.field4973 = var1;
   }

   public void method3023(ItemStack var1) {
      if (!var1.isEmpty()) {
         SoundEvent var4 = Sounds.field26351;
         Item var5 = var1.getItem();
         if (!(var5 instanceof Class3279)) {
            if (var5 == Items.field38120) {
               var4 = Sounds.field26350;
            }
         } else {
            var4 = ((Class3279)var5).method11806().method8788();
         }

         this.method2863(var4, 1.0F, 1.0F);
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      var1.putFloat("Health", this.getHealth());
      var1.method101("HurtTime", (short)this.field4952);
      var1.method102("HurtByTimestamp", this.field4995);
      var1.method101("DeathTime", (short)this.field4955);
      var1.putFloat("AbsorptionAmount", this.method2959());
      var1.put("Attributes", this.method3088().method33389());
      if (!this.field4944.isEmpty()) {
         ListNBT var4 = new ListNBT();

         for (Class2023 var6 : this.field4944.values()) {
            var4.add(var6.method8637(new CompoundNBT()));
         }

         var1.put("ActiveEffects", var4);
      }

      var1.putBoolean("FallFlying", this.method3165());
      this.method3173().ifPresent(var1x -> {
         var1.method102("SleepingX", var1x.getX());
         var1.method102("SleepingY", var1x.getY());
         var1.method102("SleepingZ", var1x.getZ());
      });
      DataResult var7 = this.field5011.method21402(NBTDynamicOps.INSTANCE);
      var7.resultOrPartial(LOGGER::error).ifPresent(var1x -> var1.put("Brain", (Class30) var1x));
   }

   @Override
   public void method2723(CompoundNBT var1) {
      this.method2958(var1.getFloat("AbsorptionAmount"));
      if (var1.contains("Attributes", 9) && this.world != null && !this.world.isRemote) {
         this.method3088().method33390(var1.method131("Attributes", 10));
      }

      if (var1.contains("ActiveEffects", 9)) {
         ListNBT var4 = var1.method131("ActiveEffects", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            CompoundNBT var6 = var4.method153(var5);
            Class2023 var7 = Class2023.method8639(var6);
            if (var7 != null) {
               this.field4944.put(var7.method8627(), var7);
            }
         }
      }

      if (var1.contains("Health", 99)) {
         this.method3043(var1.getFloat("Health"));
      }

      this.field4952 = var1.method121("HurtTime");
      this.field4955 = var1.method121("DeathTime");
      this.field4995 = var1.method122("HurtByTimestamp");
      if (var1.contains("Team", 8)) {
         String var8 = var1.method126("Team");
         Class8218 var10 = this.world.method6805().method20990(var8);
         boolean var11 = var10 != null && this.world.method6805().method20993(this.method3376(), var10);
         if (!var11) {
            LOGGER.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", var8);
         }
      }

      if (var1.getBoolean("FallFlying")) {
         this.method3349(7, true);
      }

      if (var1.contains("SleepingX", 99) && var1.contains("SleepingY", 99) && var1.contains("SleepingZ", 99)) {
         BlockPos var9 = new BlockPos(var1.method122("SleepingX"), var1.method122("SleepingY"), var1.method122("SleepingZ"));
         this.method3174(var9);
         this.dataManager.method35446(POSE, Pose.field13621);
         if (!this.firstUpdate) {
            this.method3177(var9);
         }
      }

      if (var1.contains("Brain", 10)) {
         this.field5011 = this.method2994(new Dynamic(NBTDynamicOps.INSTANCE, var1.method116("Brain")));
      }
   }

   public void method3024() {
      Iterator var3 = this.field4944.keySet().iterator();

      try {
         while (var3.hasNext()) {
            Effect var4 = (Effect)var3.next();
            Class2023 var5 = this.field4944.get(var4);
            if (!var5.method8633(this, () -> this.method2791(var5, true))) {
               if (!this.world.isRemote) {
                  var3.remove();
                  this.method2792(var5);
               }
            } else if (var5.method8628() % 600 == 0) {
               this.method2791(var5, false);
            }
         }
      } catch (ConcurrentModificationException var13) {
      }

      if (this.field4993) {
         if (!this.world.isRemote) {
            this.method2813();
         }

         this.field4993 = false;
      }

      int var14 = this.dataManager.<Integer>method35445(field4936);
      boolean var15 = this.dataManager.<Boolean>method35445(field4937);
      if (var14 > 0) {
         boolean var6;
         if (this.method3342()) {
            var6 = this.rand.nextInt(15) == 0;
         } else {
            var6 = this.rand.nextBoolean();
         }

         if (var15) {
            var6 &= this.rand.nextInt(5) == 0;
         }

         if (var6 && var14 > 0) {
            double var7 = (double)(var14 >> 16 & 0xFF) / 255.0;
            double var9 = (double)(var14 >> 8 & 0xFF) / 255.0;
            double var11 = (double)(var14 >> 0 & 0xFF) / 255.0;
            this.world
               .method6746(
                  var15 ? ParticleTypes.field34048 : ParticleTypes.field34068, this.method3438(0.5), this.method3441(), this.method3445(0.5), var7, var9, var11
               );
         }
      }
   }

   public void method2813() {
      if (!this.field4944.isEmpty()) {
         Collection var3 = this.field4944.values();
         this.dataManager.method35446(field4937, method3028(var3));
         this.dataManager.method35446(field4936, Class9741.method38184(var3));
         this.method3347(this.method3033(Effects.INVISIBILITY));
      } else {
         this.method3029();
         this.method3347(false);
      }
   }

   public double method3025(Entity var1) {
      double var4 = 1.0;
      if (this.method3334()) {
         var4 *= 0.8;
      }

      if (this.method3342()) {
         float var6 = this.method3097();
         if (var6 < 0.1F) {
            var6 = 0.1F;
         }

         var4 *= 0.7 * (double)var6;
      }

      if (var1 != null) {
         ItemStack var9 = this.method2943(Class2106.field13736);
         Item var7 = var9.getItem();
         EntityType var8 = var1.getType();
         if (var8 == EntityType.field41078 && var7 == Items.field38058
            || var8 == EntityType.field41107 && var7 == Items.field38061
            || var8 == EntityType.field41017 && var7 == Items.field38062) {
            var4 *= 0.5;
         }
      }

      return var4;
   }

   public boolean method3026(LivingEntity var1) {
      return true;
   }

   public boolean method3027(LivingEntity var1, Class8522 var2) {
      return var2.method30210(this, var1);
   }

   public static boolean method3028(Collection<Class2023> var0) {
      for (Class2023 var4 : var0) {
         if (!var4.method8630()) {
            return false;
         }
      }

      return true;
   }

   public void method3029() {
      this.dataManager.method35446(field4937, false);
      this.dataManager.method35446(field4936, 0);
   }

   public boolean method3030() {
      if (this.world.isRemote) {
         return false;
      } else {
         Iterator var3 = this.field4944.values().iterator();

         boolean var4;
         for (var4 = false; var3.hasNext(); var4 = true) {
            this.method2792((Class2023)var3.next());
            var3.remove();
         }

         return var4;
      }
   }

   public Collection<Class2023> method3031() {
      return this.field4944.values();
   }

   public Map<Effect, Class2023> method3032() {
      return this.field4944;
   }

   public boolean method3033(Effect var1) {
      return this.field4944.containsKey(var1);
   }

   @Nullable
   public Class2023 method3034(Effect var1) {
      return this.field4944.get(var1);
   }

   public boolean method3035(Class2023 var1) {
      if (this.method3036(var1)) {
         Class2023 var4 = this.field4944.get(var1.method8627());
         if (var4 != null) {
            if (!var4.method8626(var1)) {
               return false;
            } else {
               this.method2791(var4, true);
               return true;
            }
         } else {
            this.field4944.put(var1.method8627(), var1);
            this.method2790(var1);
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean method3036(Class2023 var1) {
      if (this.method3089() == Class7809.field33506) {
         Effect var4 = var1.method8627();
         if (var4 == Effects.REGENERATION || var4 == Effects.POISON) {
            return false;
         }
      }

      return true;
   }

   public void method3037(Class2023 var1) {
      if (this.method3036(var1)) {
         Class2023 var4 = this.field4944.put(var1.method8627(), var1);
         if (var4 != null) {
            this.method2791(var1, true);
         } else {
            this.method2790(var1);
         }
      }
   }

   public boolean method3038() {
      return this.method3089() == Class7809.field33506;
   }

   @Nullable
   public Class2023 method3039(Effect var1) {
      return this.field4944.remove(var1);
   }

   public boolean removeEffects(Effect var1) {
      Class2023 var4 = this.method3039(var1);
      if (var4 == null) {
         return false;
      } else {
         this.method2792(var4);
         return true;
      }
   }

   public void method2790(Class2023 var1) {
      this.field4993 = true;
      if (!this.world.isRemote) {
         var1.method8627().method22301(this, this.method3088(), var1.method8629());
      }
   }

   public void method2791(Class2023 var1, boolean var2) {
      this.field4993 = true;
      if (var2 && !this.world.isRemote) {
         Effect var5 = var1.method8627();
         var5.method22300(this, this.method3088(), var1.method8629());
         var5.method22301(this, this.method3088(), var1.method8629());
      }
   }

   public void method2792(Class2023 var1) {
      this.field4993 = true;
      if (!this.world.isRemote) {
         var1.method8627().method22300(this, this.method3088(), var1.method8629());
      }
   }

   public void method3041(float var1) {
      float var4 = this.getHealth();
      if (var4 > 0.0F) {
         this.method3043(var4 + var1);
      }
   }

   public float getHealth() {
      return this.dataManager.<Float>method35445(field4935);
   }

   public void method3043(float var1) {
      this.dataManager.method35446(field4935, MathHelper.clamp(var1, 0.0F, this.method3075()));
   }

   public boolean getShouldBeDead() {
      return this.getHealth() <= 0.0F;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.method2760(var1)) {
         return false;
      } else if (!this.world.isRemote) {
         if (this.getShouldBeDead()) {
            return false;
         } else if (var1.method31141() && this.method3033(Effects.FIRE_RESISTANCE)) {
            return false;
         } else {
            if (this.isSleeping() && !this.world.isRemote) {
               this.method2907();
            }

            this.field4973 = 0;
            float var5 = var2;
            if ((var1 == Class8654.field39008 || var1 == Class8654.field39009) && !this.method2943(Class2106.field13736).isEmpty()) {
               this.method2943(Class2106.field13736)
                  .method32121((int)(var2 * 4.0F + this.rand.nextFloat() * var2 * 2.0F), this, var0 -> var0.method3184(Class2106.field13736));
               var2 *= 0.75F;
            }

            boolean var6 = false;
            float var7 = 0.0F;
            if (var2 > 0.0F && this.method3049(var1)) {
               this.method2887(var2);
               var7 = var2;
               var2 = 0.0F;
               if (!var1.method31129()) {
                  Entity var8 = var1.method31113();
                  if (var8 instanceof LivingEntity) {
                     this.method2885((LivingEntity)var8);
                  }
               }

               var6 = true;
            }

            this.field4960 = 1.5F;
            boolean var16 = true;
            if (!((float)this.hurtResistantTime > 10.0F)) {
               this.field4980 = var2;
               this.hurtResistantTime = 20;
               this.method2888(var1, var2);
               this.field4953 = 10;
               this.field4952 = this.field4953;
            } else {
               if (var2 <= this.field4980) {
                  return false;
               }

               this.method2888(var1, var2 - this.field4980);
               this.field4980 = var2;
               var16 = false;
            }

            this.field4954 = 0.0F;
            Entity var9 = var1.method31109();
            if (var9 != null) {
               if (var9 instanceof LivingEntity) {
                  this.method3017((LivingEntity)var9);
               }

               if (!(var9 instanceof PlayerEntity)) {
                  if (var9 instanceof Class1012) {
                     Class1012 var10 = (Class1012)var9;
                     if (var10.method4393()) {
                        this.field4971 = 100;
                        LivingEntity var11 = var10.method4400();
                        if (var11 != null && var11.getType() == EntityType.PLAYER) {
                           this.field4970 = (PlayerEntity)var11;
                        } else {
                           this.field4970 = null;
                        }
                     }
                  }
               } else {
                  this.field4971 = 100;
                  this.field4970 = (PlayerEntity)var9;
               }
            }

            if (var16) {
               if (!var6) {
                  if (var1 instanceof Class8652 && ((Class8652)var1).method31108()) {
                     this.world.method6786(this, (byte)33);
                  } else {
                     byte var17;
                     if (var1 != Class8654.field38999) {
                        if (!var1.method31141()) {
                           if (var1 != Class8654.field39012) {
                              var17 = 2;
                           } else {
                              var17 = 44;
                           }
                        } else {
                           var17 = 37;
                        }
                     } else {
                        var17 = 36;
                     }

                     this.world.method6786(this, var17);
                  }
               } else {
                  this.world.method6786(this, (byte)29);
               }

               if (var1 != Class8654.field38999 && (!var6 || var2 > 0.0F)) {
                  this.method3141();
               }

               if (var9 == null) {
                  this.field4954 = (float)((int)(Math.random() * 2.0) * 180);
               } else {
                  double var12 = var9.getPosX() - this.getPosX();

                  double var14;
                  for (var14 = var9.getPosZ() - this.getPosZ(); var12 * var12 + var14 * var14 < 1.0E-4; var14 = (Math.random() - Math.random()) * 0.01) {
                     var12 = (Math.random() - Math.random()) * 0.01;
                  }

                  this.field4954 = (float)(MathHelper.method37814(var14, var12) * 180.0F / (float)Math.PI - (double)this.rotationYaw);
                  this.method3058(0.4F, var12, var14);
               }
            }

            if (!this.getShouldBeDead()) {
               if (var16) {
                  this.method3048(var1);
               }
            } else if (!this.method3046(var1)) {
               SoundEvent var18 = this.method2880();
               if (var16 && var18 != null) {
                  this.method2863(var18, this.method3099(), this.method3100());
               }

               this.method2737(var1);
            }

            boolean var19 = !var6 || var2 > 0.0F;
            if (var19) {
               this.field5006 = var1;
               this.field5007 = this.world.method6783();
            }

            if (this instanceof ServerPlayerEntity) {
               CriteriaTriggers.field44472.method15165((ServerPlayerEntity)this, var1, var5, var2, var6);
               if (var7 > 0.0F && var7 < 3.4028235E37F) {
                  ((ServerPlayerEntity)this).method2912(Class8876.field40131, Math.round(var7 * 10.0F));
               }
            }

            if (var9 instanceof ServerPlayerEntity) {
               CriteriaTriggers.field44471.method15093((ServerPlayerEntity)var9, this, var1, var5, var2, var6);
            }

            return var19;
         }
      } else {
         return false;
      }
   }

   public void method2885(LivingEntity var1) {
      var1.method3045(this);
   }

   public void method3045(LivingEntity var1) {
      var1.method3058(0.5F, var1.getPosX() - this.getPosX(), var1.getPosZ() - this.getPosZ());
   }

   private boolean method3046(Class8654 var1) {
      if (var1.method31135()) {
         return false;
      } else {
         ItemStack var4 = null;

         for (Hand var8 : Hand.values()) {
            ItemStack var9 = this.getHeldItem(var8);
            if (var9.getItem() == Items.field38126) {
               var4 = var9.copy();
               var9.method32182(1);
               break;
            }
         }

         if (var4 != null) {
            if (this instanceof ServerPlayerEntity) {
               ServerPlayerEntity var10 = (ServerPlayerEntity)this;
               var10.method2913(Class8876.field40098.method172(Items.field38126));
               CriteriaTriggers.field44492.method15068(var10, var4);
            }

            this.method3043(1.0F);
            this.method3030();
            this.method3035(new Class2023(Effects.REGENERATION, 900, 1));
            this.method3035(new Class2023(Effects.ABSORPTION, 100, 1));
            this.method3035(new Class2023(Effects.FIRE_RESISTANCE, 800, 0));
            this.world.method6786(this, (byte)35);
         }

         return var4 != null;
      }
   }

   @Nullable
   public Class8654 method3047() {
      if (this.world.method6783() - this.field5007 > 40L) {
         this.field5006 = null;
      }

      return this.field5006;
   }

   public void method3048(Class8654 var1) {
      SoundEvent var4 = this.method2879(var1);
      if (var4 != null) {
         this.method2863(var4, this.method3099(), this.method3100());
      }
   }

   private boolean method3049(Class8654 var1) {
      Entity var4 = var1.method31113();
      boolean var5 = false;
      if (var4 instanceof AbstractArrowEntity) {
         AbstractArrowEntity var6 = (AbstractArrowEntity)var4;
         if (var6.method3489() > 0) {
            var5 = true;
         }
      }

      if (!var1.method31133() && this.method3163() && !var5) {
         Vector3d var9 = var1.method31112();
         if (var9 != null) {
            Vector3d var7 = this.method3281(1.0F);
            Vector3d var8 = var9.method11332(this.getPositionVec()).method11333();
            var8 = new Vector3d(var8.x, 0.0, var8.z);
            if (var8.method11334(var7) < 0.0) {
               return true;
            }
         }
      }

      return false;
   }

   private void method3050(ItemStack var1) {
      if (!var1.isEmpty()) {
         if (!this.method3245()) {
            this.world
               .method6745(
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  Sounds.field26713,
                  this.method2864(),
                  0.8F,
                  0.8F + this.world.rand.nextFloat() * 0.4F,
                  false
               );
         }

         this.method3157(var1, 5);
      }
   }

   public void method2737(Class8654 var1) {
      if (!this.removed && !this.field4972) {
         Entity var4 = var1.method31109();
         LivingEntity var5 = this.method3074();
         if (this.field4979 >= 0 && var5 != null) {
            var5.method2739(this, this.field4979, var1);
         }

         if (this.isSleeping()) {
            this.method2907();
         }

         this.field4972 = true;
         this.method3073().method27606();
         if (this.world instanceof ServerWorld) {
            if (var4 != null) {
               var4.method2927((ServerWorld)this.world, this);
            }

            this.method3052(var1);
            this.method3051(var5);
         }

         this.world.method6786(this, (byte)3);
         this.method3211(Pose.field13625);
      }
   }

   public void method3051(LivingEntity var1) {
      if (!this.world.isRemote) {
         boolean var4 = false;
         if (var1 instanceof Class1079) {
            if (this.world.method6789().method17135(Class5462.field24224)) {
               BlockPos var5 = this.getPosition();
               BlockState var6 = Blocks.WITHER_ROSE.method11579();
               if (this.world.getBlockState(var5).isAir() && var6.method23443(this.world, var5)) {
                  this.world.setBlockState(var5, var6, 3);
                  var4 = true;
               }
            }

            if (!var4) {
               ItemEntity var7 = new ItemEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), new ItemStack(Items.field37345));
               this.world.method6916(var7);
            }
         }
      }
   }

   public void method3052(Class8654 var1) {
      Entity var4 = var1.method31109();
      int var5;
      if (!(var4 instanceof PlayerEntity)) {
         var5 = 0;
      } else {
         var5 = Class7858.method26330((LivingEntity)var4);
      }

      boolean var6 = this.field4971 > 0;
      if (this.method3010() && this.world.method6789().method17135(Class5462.field24227)) {
         this.method3056(var1, var6);
         this.method3054(var1, var5, var6);
      }

      this.method2877();
      this.method3053();
   }

   public void method2877() {
   }

   public void method3053() {
      if (!this.world.isRemote
         && (this.method2938() || this.field4971 > 0 && this.method3009() && this.world.method6789().method17135(Class5462.field24227))) {
         int var3 = this.method2937(this.field4970);

         while (var3 > 0) {
            int var4 = ExperienceOrbEntity.method4179(var3);
            var3 -= var4;
            this.world.method6916(new ExperienceOrbEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), var4));
         }
      }
   }

   public void method3054(Class8654 var1, int var2, boolean var3) {
   }

   public ResourceLocation method3055() {
      return this.getType().method33212();
   }

   public void method3056(Class8654 var1, boolean var2) {
      ResourceLocation var5 = this.method3055();
      Class7318 var6 = this.world.getServer().method1411().method1058(var5);
      Class9464 var7 = this.method3057(var2, var1);
      var6.method23181(var7.method36460(Class8524.field38286), this::method3302);
   }

   public Class9464 method3057(boolean var1, Class8654 var2) {
      Class9464 var5 = new Class9464((ServerWorld)this.world)
         .method36450(this.rand)
         .method36454(Class9525.field44330, this)
         .method36454(Class9525.field44335, this.getPositionVec())
         .method36454(Class9525.field44332, var2)
         .method36455(Class9525.field44333, var2.method31109())
         .method36455(Class9525.field44334, var2.method31113());
      if (var1 && this.field4970 != null) {
         var5 = var5.method36454(Class9525.field44331, this.field4970).method36453(this.field4970.method2978());
      }

      return var5;
   }

   public void method3058(float var1, double var2, double var4) {
      var1 = (float)((double)var1 * (1.0 - this.method3086(Attributes.field42107)));
      if (!(var1 <= 0.0F)) {
         this.isAirBorne = true;
         Vector3d var8 = this.method3433();
         Vector3d var9 = new Vector3d(var2, 0.0, var4).method11333().method11344((double)var1);
         this.method3435(
            var8.x / 2.0 - var9.x,
            !this.onGround ? var8.y : Math.min(0.4, var8.y / 2.0 + (double)var1),
            var8.z / 2.0 - var9.z
         );
      }
   }

   @Nullable
   public SoundEvent method2879(Class8654 var1) {
      return Sounds.field26612;
   }

   @Nullable
   public SoundEvent method2880() {
      return Sounds.field26607;
   }

   public SoundEvent method2926(int var1) {
      return var1 <= 4 ? Sounds.field26613 : Sounds.field26605;
   }

   public SoundEvent method3059(ItemStack var1) {
      return var1.method32185();
   }

   public SoundEvent method3060(ItemStack var1) {
      return var1.method32186();
   }

   @Override
   public void method3061(boolean var1) {
      super.method3061(var1);
      if (var1) {
         this.field5005 = Optional.<BlockPos>empty();
      }
   }

   public Optional<BlockPos> method3062() {
      return this.field5005;
   }

   public boolean method3063() {
      if (!this.isSpectator()) {
         BlockPos var3 = this.getPosition();
         BlockState var4 = this.method3064();
         Block var5 = var4.getBlock();
         if (!var5.method11540(BlockTags.field32804)) {
            if (var5 instanceof Class3206 && this.method3065(var3, var4)) {
               this.field5005 = Optional.<BlockPos>of(var3);
               return true;
            } else {
               return false;
            }
         } else {
            this.field5005 = Optional.<BlockPos>of(var3);
            return true;
         }
      } else {
         return false;
      }
   }

   public BlockState method3064() {
      return this.world.getBlockState(this.getPosition());
   }

   private boolean method3065(BlockPos var1, BlockState var2) {
      if (var2.<Boolean>method23463(Class3206.field18594)) {
         BlockState var5 = this.world.getBlockState(var1.down());
         if (var5.method23448(Blocks.LADDER) && var5.<Direction>method23463(Class3423.field19154) == var2.<Direction>method23463(Class3206.field18484)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean isAlive() {
      return !this.removed && this.getHealth() > 0.0F;
   }

   @Override
   public boolean method2921(float var1, float var2) {
      boolean var5 = super.method2921(var1, var2);
      int var6 = this.method3067(var1, var2);
      if (var6 <= 0) {
         return var5;
      } else {
         this.method2863(this.method2926(var6), 1.0F, 1.0F);
         this.method3068();
         this.method2741(Class8654.field39002, (float)var6);
         return true;
      }
   }

   public int method3067(float var1, float var2) {
      Class2023 var5 = this.method3034(Effects.JUMP_BOOST);
      float var6 = var5 != null ? (float)(var5.method8629() + 1) : 0.0F;
      return MathHelper.method37773((var1 - 3.0F - var6) * var2);
   }

   public void method3068() {
      if (!this.method3245()) {
         int var3 = MathHelper.floor(this.getPosX());
         int var4 = MathHelper.floor(this.getPosY() - 0.2F);
         int var5 = MathHelper.floor(this.getPosZ());
         BlockState var6 = this.world.getBlockState(new BlockPos(var3, var4, var5));
         if (!var6.isAir()) {
            Class8447 var7 = var6.method23452();
            this.method2863(var7.method29716(), var7.method29710() * 0.5F, var7.method29711() * 0.75F);
         }
      }
   }

   @Override
   public void method3069() {
      this.field4953 = 10;
      this.field4952 = this.field4953;
      this.field4954 = 0.0F;
   }

   public int method3070() {
      return MathHelper.floor(this.method3086(Attributes.field42113));
   }

   public void method2886(Class8654 var1, float var2) {
   }

   public void method2887(float var1) {
   }

   public float method3071(Class8654 var1, float var2) {
      if (!var1.method31133()) {
         this.method2886(var1, var2);
         var2 = Class8913.method32581(var2, (float)this.method3070(), (float)this.method3086(Attributes.field42114));
      }

      return var2;
   }

   public float method3072(Class8654 var1, float var2) {
      if (!var1.method31136()) {
         if (this.method3033(Effects.RESISTANCE) && var1 != Class8654.field39004) {
            int var5 = (this.method3034(Effects.RESISTANCE).method8629() + 1) * 5;
            int var6 = 25 - var5;
            float var7 = var2 * (float)var6;
            float var8 = var2;
            var2 = Math.max(var7 / 25.0F, 0.0F);
            float var9 = var8 - var2;
            if (var9 > 0.0F && var9 < 3.4028235E37F) {
               if (!(this instanceof ServerPlayerEntity)) {
                  if (var1.method31109() instanceof ServerPlayerEntity) {
                     ((ServerPlayerEntity)var1.method31109()).method2912(Class8876.field40129, Math.round(var9 * 10.0F));
                  }
               } else {
                  ((ServerPlayerEntity)this).method2912(Class8876.field40133, Math.round(var9 * 10.0F));
               }
            }
         }

         if (!(var2 <= 0.0F)) {
            int var10 = Class7858.method26317(this.method2947(), var1);
            if (var10 > 0) {
               var2 = Class8913.method32582(var2, (float)var10);
            }

            return var2;
         } else {
            return 0.0F;
         }
      } else {
         return var2;
      }
   }

   public void method2888(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         var2 = this.method3071(var1, var2);
         var2 = this.method3072(var1, var2);
         float var5 = Math.max(var2 - this.method2959(), 0.0F);
         this.method2958(this.method2959() - (var2 - var5));
         float var6 = var2 - var5;
         if (var6 > 0.0F && var6 < 3.4028235E37F && var1.method31109() instanceof ServerPlayerEntity) {
            ((ServerPlayerEntity)var1.method31109()).method2912(Class8876.field40128, Math.round(var6 * 10.0F));
         }

         if (var5 != 0.0F) {
            float var7 = this.getHealth();
            this.method3043(var7 - var5);
            this.method3073().method27599(var1, var7, var5);
            this.method2958(this.method2959() - var5);
         }
      }
   }

   public Class8039 method3073() {
      return this.field4943;
   }

   @Nullable
   public LivingEntity method3074() {
      if (this.field4943.method27601() == null) {
         if (this.field4970 == null) {
            return this.field4994 == null ? null : this.field4994;
         } else {
            return this.field4970;
         }
      } else {
         return this.field4943.method27601();
      }
   }

   public final float method3075() {
      return (float)this.method3086(Attributes.field42105);
   }

   public final int method3076() {
      return this.dataManager.<Integer>method35445(field4938);
   }

   public final void method3077(int var1) {
      this.dataManager.method35446(field4938, var1);
   }

   public final int method3078() {
      return this.dataManager.<Integer>method35445(field4939);
   }

   public final void method3079(int var1) {
      this.dataManager.method35446(field4939, var1);
   }

   private int method3080() {
      if (!Class7182.method22536(this)) {
         return !this.method3033(Effects.MINING_FATIGUE) ? 6 : 6 + (1 + this.method3034(Effects.MINING_FATIGUE).method8629()) * 2;
      } else {
         return 6 - (1 + Class7182.method22537(this));
      }
   }

   public void swingArm(Hand var1) {
      this.swing(var1, false);
   }

   public void swing(Hand var1, boolean var2) {
      if (!this.field4947 || this.field4949 >= this.method3080() / 2 || this.field4949 < 0) {
         this.field4949 = -1;
         this.field4947 = true;
         this.field4948 = var1;
         if (this.world instanceof ServerWorld) {
            SAnimateHandPacket var5 = new SAnimateHandPacket(this, var1 != Hand.MAIN_HAND ? 3 : 0);
            Class1703 var6 = ((ServerWorld)this.world).getChunkProvider();
            if (!var2) {
               var6.method7380(this, var5);
            } else {
               var6.method7379(this, var5);
            }
         }
      }
   }

   @Override
   public void method2866(byte var1) {
      switch (var1) {
         case 2:
         case 33:
         case 36:
         case 37:
         case 44:
            boolean var4 = var1 == 33;
            boolean var5 = var1 == 36;
            boolean var6 = var1 == 37;
            boolean var7 = var1 == 44;
            this.field4960 = 1.5F;
            this.hurtResistantTime = 20;
            this.field4953 = 10;
            this.field4952 = this.field4953;
            this.field4954 = 0.0F;
            if (var4) {
               this.method2863(Sounds.field27145, this.method3099(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
            }

            Class8654 var8;
            if (var6) {
               var8 = Class8654.field38994;
            } else if (var5) {
               var8 = Class8654.field38999;
            } else if (var7) {
               var8 = Class8654.field39012;
            } else {
               var8 = Class8654.field39005;
            }

            SoundEvent var9 = this.method2879(var8);
            if (var9 != null) {
               this.method2863(var9, this.method3099(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
            }

            this.method2741(Class8654.field39005, 0.0F);
            break;
         case 3:
            SoundEvent var10 = this.method2880();
            if (var10 != null) {
               this.method2863(var10, this.method3099(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
            }

            if (!(this instanceof PlayerEntity)) {
               this.method3043(0.0F);
               this.method2737(Class8654.field39005);
            }
            break;
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 31:
         case 32:
         case 34:
         case 35:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 45:
         case 53:
         default:
            super.method2866(var1);
            break;
         case 29:
            this.method2863(Sounds.field27035, 1.0F, 0.8F + this.world.rand.nextFloat() * 0.4F);
            break;
         case 30:
            this.method2863(Sounds.field27036, 0.8F, 0.8F + this.world.rand.nextFloat() * 0.4F);
            break;
         case 46:
            short var11 = 128;

            for (int var12 = 0; var12 < 128; var12++) {
               double var13 = (double)var12 / 127.0;
               float var15 = (this.rand.nextFloat() - 0.5F) * 0.2F;
               float var16 = (this.rand.nextFloat() - 0.5F) * 0.2F;
               float var17 = (this.rand.nextFloat() - 0.5F) * 0.2F;
               double var18 = MathHelper.method37822(var13, this.prevPosX, this.getPosX())
                  + (this.rand.nextDouble() - 0.5) * (double)this.method3429() * 2.0;
               double var20 = MathHelper.method37822(var13, this.prevPosY, this.getPosY()) + this.rand.nextDouble() * (double)this.method3430();
               double var22 = MathHelper.method37822(var13, this.prevPosZ, this.getPosZ())
                  + (this.rand.nextDouble() - 0.5) * (double)this.method3429() * 2.0;
               this.world.method6746(ParticleTypes.field34090, var18, var20, var22, (double)var15, (double)var16, (double)var17);
            }
            break;
         case 47:
            this.method3050(this.method2943(Class2106.field13731));
            break;
         case 48:
            this.method3050(this.method2943(Class2106.field13732));
            break;
         case 49:
            this.method3050(this.method2943(Class2106.field13736));
            break;
         case 50:
            this.method3050(this.method2943(Class2106.field13735));
            break;
         case 51:
            this.method3050(this.method2943(Class2106.field13734));
            break;
         case 52:
            this.method3050(this.method2943(Class2106.field13733));
            break;
         case 54:
            Class3379.method11977(this);
            break;
         case 55:
            this.method3082();
      }
   }

   private void method3082() {
      ItemStack var3 = this.method2943(Class2106.field13732);
      this.method2944(Class2106.field13732, this.method2943(Class2106.field13731));
      this.method2944(Class2106.field13731, var3);
   }

   @Override
   public void method3083() {
      this.method2741(Class8654.field39004, 4.0F);
   }

   public void method3084() {
      int var3 = this.method3080();
      if (!this.field4947) {
         this.field4949 = 0;
      } else {
         this.field4949++;
         if (this.field4949 >= var3) {
            this.field4949 = 0;
            this.field4947 = false;
         }
      }

      this.field4957 = (float)this.field4949 / (float)var3;
   }

   @Nullable
   public Class9805 method3085(Class4869 var1) {
      return this.method3088().method33380(var1);
   }

   public double method3086(Class4869 var1) {
      return this.method3088().method33383(var1);
   }

   public double method3087(Class4869 var1) {
      return this.method3088().method33384(var1);
   }

   public Class9020 method3088() {
      return this.field4942;
   }

   public Class7809 method3089() {
      return Class7809.field33505;
   }

   public ItemStack getHeldItemMainhand() {
      return this.method2943(Class2106.field13731);
   }

   public ItemStack method3091() {
      return this.method2943(Class2106.field13732);
   }

   public boolean method3092(Item var1) {
      return this.method3093(var1x -> var1x == var1);
   }

   public boolean method3093(Predicate<Item> var1) {
      return var1.test(this.getHeldItemMainhand().getItem()) || var1.test(this.method3091().getItem());
   }

   public ItemStack getHeldItem(Hand var1) {
      if (var1 != Hand.MAIN_HAND) {
         if (var1 != Hand.field183) {
            throw new IllegalArgumentException("Invalid hand " + var1);
         } else {
            return this.method2943(Class2106.field13732);
         }
      } else {
         return this.method2943(Class2106.field13731);
      }
   }

   public void method3095(Hand var1, ItemStack var2) {
      if (var1 != Hand.MAIN_HAND) {
         if (var1 != Hand.field183) {
            throw new IllegalArgumentException("Invalid hand " + var1);
         }

         this.method2944(Class2106.field13732, var2);
      } else {
         this.method2944(Class2106.field13731, var2);
      }
   }

   public boolean method3096(Class2106 var1) {
      return !this.method2943(var1).isEmpty();
   }

   @Override
   public abstract Iterable<ItemStack> method2947();

   public abstract ItemStack method2943(Class2106 var1);

   @Override
   public abstract void method2944(Class2106 var1, ItemStack var2);

   public float method3097() {
      Iterable<ItemStack> var3 = this.method2947();
      int var4 = 0;
      int var5 = 0;

      for (ItemStack var7 : var3) {
         if (!var7.isEmpty()) {
            var5++;
         }

         var4++;
      }

      return var4 <= 0 ? 0.0F : (float)var5 / (float)var4;
   }

   @Override
   public void setSprinting(boolean var1) {
      super.setSprinting(var1);
      Class9805 var4 = this.method3085(Attributes.MOVEMENT_SPEED);
      if (var4.method38664(field4931) != null) {
         var4.method38670(field4933);
      }

      if (var1) {
         var4.method38667(field4933);
      }
   }

   public float method3099() {
      return 1.0F;
   }

   public float method3100() {
      return !this.method3005()
         ? (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F
         : (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.5F;
   }

   public boolean method2896() {
      return this.getShouldBeDead();
   }

   @Override
   public void method3101(Entity var1) {
      if (!this.isSleeping()) {
         super.method3101(var1);
      }
   }

   private void method3102(Entity var1) {
      Vector3d var4;
      if (!var1.removed && !this.world.getBlockState(var1.getPosition()).getBlock().method11540(BlockTags.field32797)) {
         var4 = var1.method3420(this);
      } else {
         var4 = new Vector3d(var1.getPosX(), var1.getPosY() + (double)var1.method3430(), var1.getPosZ());
      }

      this.method2793(var4.x, var4.y, var4.z);
   }

   @Override
   public boolean method2939() {
      return this.method3383();
   }

   public float method3103() {
      return 0.42F * this.method3229();
   }

   public void method2914() {
      float var3 = this.method3103();
      if (this.method3033(Effects.JUMP_BOOST)) {
         var3 += 0.1F * (float)(this.method3034(Effects.JUMP_BOOST).method8629() + 1);
      }

      Vector3d var4 = this.method3433();
      Class4436 var5 = new Class4436(new Vector3d(var4.x, (double)var3, var4.z));
      if (this instanceof ClientPlayerEntity) {
         Client.getInstance().getEventManager().call(var5);
      }

      if (!var5.isCancelled()) {
         this.method3434(var5.method14001());
         if (this.method3337() && !var5.method14000()) {
            float var6 = this.rotationYaw * (float) (Math.PI / 180.0);
            this.method3434(this.method3433().method11339((double)(-MathHelper.sin(var6) * 0.2F), 0.0, (double)(MathHelper.cos(var6) * 0.2F)));
         }

         this.isAirBorne = true;
      }
   }

   public void method3104() {
      this.method3434(this.method3433().method11339(0.0, -0.04F, 0.0));
   }

   public void method3105(ITag<Fluid> var1) {
      this.method3434(this.method3433().method11339(0.0, 0.04F, 0.0));
   }

   public float method3106() {
      return 0.8F;
   }

   public boolean method3107(Fluid var1) {
      return false;
   }

   public void method2915(Vector3d var1) {
      if (this.method3138() || this.method3418()) {
         double var4 = 0.08;
         boolean var6 = this.method3433().y <= 0.0;
         if (var6 && this.method3033(Effects.SLOW_FALLING)) {
            var4 = 0.01;
            this.fallDistance = 0.0F;
         }

         FluidState var7 = this.world.getFluidState(this.getPosition());
         if (this.method3250() && this.method2897() && !this.method3107(var7.method23472())) {
            double var34 = this.getPosY();
            float var38 = !this.method3337() ? this.method3106() : 0.9F;
            float var39 = 0.02F;
            float var14 = (float)Class7858.method26326(this);
            if (var14 > 3.0F) {
               var14 = 3.0F;
            }

            if (!this.onGround) {
               var14 *= 0.5F;
            }

            if (var14 > 0.0F) {
               var38 += (0.54600006F - var38) * var14 / 3.0F;
               var39 += (this.method2918() - var39) * var14 / 3.0F;
            }

            if (this.method3033(Effects.DOLPHINS_GRACE)) {
               var38 = 0.96F;
            }

            this.method3265(var39, var1);
            this.move(Class2107.field13742, this.method3433());
            Vector3d var15 = this.method3433();
            if (this.collidedHorizontally && this.method3063()) {
               var15 = new Vector3d(var15.x, 0.2, var15.z);
            }

            this.method3434(var15.method11347((double)var38, 0.8F, (double)var38));
            Vector3d var16 = this.method3110(var4, var6, this.method3433());
            this.method3434(var16);
            if (this.collidedHorizontally && this.method3224(var16.x, var16.y + 0.6F - this.getPosY() + var34, var16.z)) {
               this.method3435(var16.x, 0.3F, var16.z);
            }
         } else if (this.method3264() && this.method2897() && !this.method3107(var7.method23472())) {
            double var10 = this.getPosY();
            this.method3265(0.02F, var1);
            this.move(Class2107.field13742, this.method3433());
            if (!(this.method3427(Class8953.field40470) <= this.method3428())) {
               this.method3434(this.method3433().method11344(0.5));
            } else {
               this.method3434(this.method3433().method11347(0.5, 0.8F, 0.5));
               Vector3d var36 = this.method3110(var4, var6, this.method3433());
               this.method3434(var36);
            }

            if (!this.method3247()) {
               this.method3434(this.method3433().method11339(0.0, -var4 / 4.0, 0.0));
            }

            Vector3d var37 = this.method3433();
            if (this.collidedHorizontally && this.method3224(var37.x, var37.y + 0.6F - this.getPosY() + var10, var37.z)) {
               this.method3435(var37.x, 0.3F, var37.z);
            }
         } else if (!this.method3165()) {
            BlockPos var8 = this.method3230();
            float var9 = this.world.getBlockState(var8).getBlock().method11571();
            float var12 = !this.onGround ? 0.91F : var9 * 0.91F;
            Vector3d var13 = this.method3109(var1, var9);
            double var29 = var13.y;
            if (!this.method3033(Effects.LEVITATION)) {
               if (this.world.isRemote && !this.world.method7017(var8)) {
                  if (!(this.getPosY() > 0.0)) {
                     var29 = 0.0;
                  } else {
                     var29 = -0.1;
                  }
               } else if (!this.method3247()) {
                  var29 -= var4;
               }
            } else {
               var29 += (0.05 * (double)(this.method3034(Effects.LEVITATION).method8629() + 1) - var13.y) * 0.2;
               this.fallDistance = 0.0F;
            }

            this.method3435(var13.x * (double)var12, var29 * 0.98F, var13.z * (double)var12);
         } else {
            Vector3d var31 = this.method3433();
            if (var31.y > -0.5) {
               this.fallDistance = 1.0F;
            }

            Vector3d var33 = this.method3320();
            float var35 = this.rotationPitch * (float) (Math.PI / 180.0);
            double var17 = Math.sqrt(var33.x * var33.x + var33.z * var33.z);
            double var19 = Math.sqrt(method3234(var31));
            double var21 = var33.method11348();
            float var23 = MathHelper.cos(var35);
            var23 = (float)((double)var23 * (double)var23 * Math.min(1.0, var21 / 0.4));
            var31 = this.method3433().method11339(0.0, var4 * (-1.0 + (double)var23 * 0.75), 0.0);
            if (var31.y < 0.0 && var17 > 0.0) {
               double var24 = var31.y * -0.1 * (double)var23;
               var31 = var31.method11339(var33.x * var24 / var17, var24, var33.z * var24 / var17);
            }

            if (var35 < 0.0F && var17 > 0.0) {
               double var41 = var19 * (double)(-MathHelper.sin(var35)) * 0.04;
               var31 = var31.method11339(-var33.x * var41 / var17, var41 * 3.2, -var33.z * var41 / var17);
            }

            if (var17 > 0.0) {
               var31 = var31.method11339(
                  (var33.x / var17 * var19 - var31.x) * 0.1, 0.0, (var33.z / var17 * var19 - var31.z) * 0.1
               );
            }

            this.method3434(var31.method11347(0.99F, 0.98F, 0.99F));
            this.move(Class2107.field13742, this.method3433());
            if (this.collidedHorizontally && !this.world.isRemote) {
               double var42 = Math.sqrt(method3234(this.method3433()));
               double var26 = var19 - var42;
               float var28 = (float)(var26 * 10.0 - 3.0);
               if (var28 > 0.0F) {
                  this.method2863(this.method2926((int)var28), 1.0F, 1.0F);
                  this.method2741(Class8654.field39003, var28);
               }
            }

            if (this.onGround && !this.world.isRemote) {
               this.method3349(7, false);
            }
         }
      }

      this.method3108(this, this instanceof Class1016);
   }

   public void method3108(LivingEntity var1, boolean var2) {
      var1.field4959 = var1.field4960;
      double var5 = var1.getPosX() - var1.prevPosX;
      double var7 = !var2 ? 0.0 : var1.getPosY() - var1.prevPosY;
      double var9 = var1.getPosZ() - var1.prevPosZ;
      float var11 = MathHelper.method37766(var5 * var5 + var7 * var7 + var9 * var9) * 4.0F;
      if (var11 > 1.0F) {
         var11 = 1.0F;
      }

      var1.field4960 = var1.field4960 + (var11 - var1.field4960) * 0.4F;
      var1.field4961 = var1.field4961 + var1.field4960;
   }

   public Vector3d method3109(Vector3d var1, float var2) {
      this.method3265(this.method3112(var2), var1);
      this.method3434(this.method3111(this.method3433()));
      this.move(Class2107.field13742, this.method3433());
      Vector3d var5 = this.method3433();
      if ((this.collidedHorizontally || this.field4981) && this.method3063()) {
         var5 = new Vector3d(var5.x, 0.2, var5.z);
      }

      return var5;
   }

   public Vector3d method3110(double var1, boolean var3, Vector3d var4) {
      if (!this.method3247() && !this.method3337()) {
         double var7;
         if (var3 && Math.abs(var4.y - 0.005) >= 0.003 && Math.abs(var4.y - var1 / 16.0) < 0.003) {
            var7 = -0.003;
         } else {
            var7 = var4.y - var1 / 16.0;
         }

         return new Vector3d(var4.x, var7, var4.z);
      } else {
         return var4;
      }
   }

   private Vector3d method3111(Vector3d var1) {
      if (this.method3063()) {
         this.fallDistance = 0.0F;
         float var4 = 0.15F;
         double var5 = MathHelper.method37778(var1.x, -0.15F, 0.15F);
         double var7 = MathHelper.method37778(var1.z, -0.15F, 0.15F);
         double var9 = Math.max(var1.y, -0.15F);
         if (var9 < 0.0 && !this.method3064().method23448(Blocks.field37053) && this.method3164() && this instanceof PlayerEntity) {
            var9 = 0.0;
         }

         var1 = new Vector3d(var5, var9, var7);
      }

      return var1;
   }

   private float method3112(float var1) {
      return !this.onGround ? this.field4969 : this.method2918() * (0.21600002F / (var1 * var1 * var1));
   }

   public float method2918() {
      return this.field4998;
   }

   public void method3113(float var1) {
      this.field4998 = var1;
   }

   public boolean method3114(Entity var1) {
      this.method3020(var1);
      return false;
   }

   @Override
   public void tick() {
      super.tick();
      this.method3150();
      this.method3152();
      if (!this.world.isRemote) {
         int var11 = this.method3076();
         if (var11 > 0) {
            if (this.field4950 <= 0) {
               this.field4950 = 20 * (30 - var11);
            }

            this.field4950--;
            if (this.field4950 <= 0) {
               this.method3077(var11 - 1);
            }
         }

         int var12 = this.method3078();
         if (var12 > 0) {
            if (this.field4951 <= 0) {
               this.field4951 = 20 * (30 - var12);
            }

            this.field4951--;
            if (this.field4951 <= 0) {
               this.method3079(var12 - 1);
            }
         }

         this.method3115();
         if (this.ticksExisted % 20 == 0) {
            this.method3073().method27606();
         }

         if (!this.glowing) {
            boolean var13 = this.method3033(Effects.GLOWING);
            if (this.method3348(6) != var13) {
               this.method3349(6, var13);
            }
         }

         if (this.isSleeping() && !this.method3178()) {
            this.method2907();
         }
      }

      this.method2871();
      double var3 = this.getPosX() - this.prevPosX;
      double var5 = this.getPosZ() - this.prevPosZ;
      float var7 = (float)(var3 * var3 + var5 * var5);
      float var8 = this.field4965;
      float var9 = 0.0F;
      this.field4974 = this.field4975;
      float var10 = 0.0F;
      if (var7 > 0.0025000002F) {
         var10 = 1.0F;
         var9 = (float)Math.sqrt((double)var7) * 3.0F;
         float var14 = (float) MathHelper.method37814(var5, var3) * (180.0F / (float)Math.PI) - 90.0F;
         float var15 = MathHelper.method37771(MathHelper.method37792(this.rotationYaw) - var14);
         if (95.0F < var15 && var15 < 265.0F) {
            var8 = var14 - 180.0F;
         } else {
            var8 = var14;
         }
      }

      if (this.field4957 > 0.0F) {
         var8 = this.rotationYaw;
      }

      if (!this.onGround) {
         var10 = 0.0F;
      }

      this.field4975 = this.field4975 + (var10 - this.field4975) * 0.3F;
      this.world.getProfiler().startSection("headTurn");
      var9 = this.method3123(var8, var9);
      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("rangeChecks");

      while (this.rotationYaw - this.prevRotationYaw < -180.0F) {
         this.prevRotationYaw -= 360.0F;
      }

      while (this.rotationYaw - this.prevRotationYaw >= 180.0F) {
         this.prevRotationYaw += 360.0F;
      }

      while (this.field4965 - this.field4966 < -180.0F) {
         this.field4966 -= 360.0F;
      }

      while (this.field4965 - this.field4966 >= 180.0F) {
         this.field4966 += 360.0F;
      }

      while (this.rotationPitch - this.prevRotationPitch < -180.0F) {
         this.prevRotationPitch -= 360.0F;
      }

      while (this.rotationPitch - this.prevRotationPitch >= 180.0F) {
         this.prevRotationPitch += 360.0F;
      }

      while (this.field4967 - this.field4968 < -180.0F) {
         this.field4968 -= 360.0F;
      }

      while (this.field4967 - this.field4968 >= 180.0F) {
         this.field4968 += 360.0F;
      }

      this.world.getProfiler().endSection();
      this.field4976 += var9;
      if (!this.method3165()) {
         this.field5003 = 0;
      } else {
         this.field5003++;
      }

      if (this.isSleeping()) {
         this.rotationPitch = 0.0F;
      }
   }

   private void method3115() {
      Map var3 = this.method3116();
      if (var3 != null) {
         this.method3117(var3);
         if (!var3.isEmpty()) {
            this.method3118(var3);
         }
      }
   }

   @Nullable
   private Map<Class2106, ItemStack> method3116() {
      EnumMap var3 = null;

      for (Class2106 var7 : Class2106.values()) {
         ItemStack var8;
         switch (Class8717.field39333[var7.method8772().ordinal()]) {
            case 1:
               var8 = this.method3121(var7);
               break;
            case 2:
               var8 = this.method3119(var7);
               break;
            default:
               continue;
         }

         ItemStack var9 = this.method2943(var7);
         if (!ItemStack.method32128(var9, var8)) {
            if (var3 == null) {
               var3 = Maps.newEnumMap(Class2106.class);
            }

            var3.put(var7, var9);
            if (!var8.isEmpty()) {
               this.method3088().method33386(var8.method32171(var7));
            }

            if (!var9.isEmpty()) {
               this.method3088().method33387(var9.method32171(var7));
            }
         }
      }

      return var3;
   }

   private void method3117(Map<Class2106, ItemStack> var1) {
      ItemStack var4 = (ItemStack)var1.get(Class2106.field13731);
      ItemStack var5 = (ItemStack)var1.get(Class2106.field13732);
      if (var4 != null
         && var5 != null
         && ItemStack.method32128(var4, this.method3121(Class2106.field13732))
         && ItemStack.method32128(var5, this.method3121(Class2106.field13731))) {
         ((ServerWorld)this.world).getChunkProvider().method7380(this, new SEntityStatusPacket(this, (byte)55));
         var1.remove(Class2106.field13731);
         var1.remove(Class2106.field13732);
         this.method3122(Class2106.field13731, var4.copy());
         this.method3122(Class2106.field13732, var5.copy());
      }
   }

   private void method3118(Map<Class2106, ItemStack> var1) {
      ArrayList var4 = Lists.newArrayListWithCapacity(var1.size());
      var1.forEach((var2, var3) -> {
         ItemStack var6 = var3.copy();
         var4.add(Pair.of(var2, var6));
         switch (Class8717.field39333[var2.method8772().ordinal()]) {
            case 1:
               this.method3122(var2, var6);
               break;
            case 2:
               this.method3120(var2, var6);
         }
      });
      ((ServerWorld)this.world).getChunkProvider().method7380(this, new SEntityEquipmentPacket(this.getEntityId(), var4));
   }

   private ItemStack method3119(Class2106 var1) {
      return this.field4946.get(var1.method8773());
   }

   private void method3120(Class2106 var1, ItemStack var2) {
      this.field4946.set(var1.method8773(), var2);
   }

   private ItemStack method3121(Class2106 var1) {
      return this.field4945.get(var1.method8773());
   }

   private void method3122(Class2106 var1, ItemStack var2) {
      this.field4945.set(var1.method8773(), var2);
   }

   public float method3123(float var1, float var2) {
      float var5 = MathHelper.method37792(var1 - this.field4965);
      this.field4965 += var5 * 0.3F;
      float var6 = MathHelper.method37792(this.rotationYaw - this.field4965);
      boolean var7 = var6 < -90.0F || var6 >= 90.0F;
      if (var6 < -75.0F) {
         var6 = -75.0F;
      }

      if (var6 >= 75.0F) {
         var6 = 75.0F;
      }

      this.field4965 = this.rotationYaw - var6;
      if (var6 * var6 > 2500.0F) {
         this.field4965 += var6 * 0.2F;
      }

      if (var7) {
         var2 *= -1.0F;
      }

      return var2;
   }

   public void method2871() {
      if (this.field4999 > 0) {
         this.field4999--;
      }

      if (this.method3418()) {
         this.field4985 = 0;
         this.setPacketCoordinates(this.getPosX(), this.getPosY(), this.getPosZ());
      }

      if (this.field4985 <= 0) {
         if (!this.method3138()) {
            this.method3434(this.method3433().method11344(0.98));
         }
      } else {
         double var10 = this.getPosX() + (this.field4986 - this.getPosX()) / (double)this.field4985;
         double var12 = this.getPosY() + (this.field4987 - this.getPosY()) / (double)this.field4985;
         double var14 = this.getPosZ() + (this.field4988 - this.getPosZ()) / (double)this.field4985;
         double var16 = MathHelper.method37793(this.field4989 - (double)this.rotationYaw);
         this.rotationYaw = (float)((double)this.rotationYaw + var16 / (double)this.field4985);
         this.rotationPitch = (float)((double)this.rotationPitch + (this.field4990 - (double)this.rotationPitch) / (double)this.field4985);
         this.field4985--;
         this.setPosition(var10, var12, var14);
         this.setRotation(this.rotationYaw, this.rotationPitch);
      }

      if (this.field4992 > 0) {
         this.field4967 = (float)((double)this.field4967 + MathHelper.method37793(this.field4991 - (double)this.field4967) / (double)this.field4992);
         this.field4992--;
      }

      Vector3d var3 = this.method3433();
      double var4 = var3.x;
      double var6 = var3.y;
      double var8 = var3.z;
      if (Math.abs(var3.x) < 0.003) {
         var4 = 0.0;
      }

      if (Math.abs(var3.y) < 0.003) {
         var6 = 0.0;
      }

      if (Math.abs(var3.z) < 0.003) {
         var8 = 0.0;
      }

      this.method3435(var4, var6, var8);
      this.world.getProfiler().startSection("ai");
      if (!this.method2896()) {
         if (this.method3138()) {
            this.world.getProfiler().startSection("newAi");
            this.updateEntityActionState();
            this.world.getProfiler().endSection();
         }
      } else {
         this.field4981 = false;
         this.field4982 = 0.0F;
         this.field4984 = 0.0F;
      }

      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("jump");
      if (this.field4981 && this.method2897()) {
         double var18;
         if (!this.method3264()) {
            var18 = this.method3427(Class8953.field40469);
         } else {
            var18 = this.method3427(Class8953.field40470);
         }

         boolean var20 = this.method3250() && var18 > 0.0;
         double var21 = this.method3428();
         if (!var20 || this.onGround && !(var18 > var21)) {
            if (!this.method3264() || this.onGround && !(var18 > var21)) {
               if ((this.onGround || var20 && var18 <= var21) && this.field4999 == 0) {
                  this.method2914();
                  this.field4999 = 10;
               }
            } else {
               this.method3105(Class8953.field40470);
            }
         } else {
            this.method3105(Class8953.field40469);
         }
      } else {
         this.field4999 = 0;
      }

      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("travel");
      this.field4982 *= 0.98F;
      this.field4984 *= 0.98F;
      this.method3125();
      AxisAlignedBB var23 = this.getBoundingBox();
      this.method2915(new Vector3d((double)this.field4982, (double)this.field4983, (double)this.field4984));
      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("push");
      if (this.field5008 > 0) {
         this.field5008--;
         this.method3127(var23, this.getBoundingBox());
      }

      this.method3126();
      this.world.getProfiler().endSection();
      if (!this.world.isRemote && this.method3124() && this.method3254()) {
         this.method2741(Class8654.field38999, 1.0F);
      }
   }

   public boolean method3124() {
      return false;
   }

   private void method3125() {
      boolean var3 = this.method3348(7);
      if (var3 && !this.onGround && !this.isPassenger() && !this.method3033(Effects.LEVITATION)) {
         ItemStack var4 = this.method2943(Class2106.field13735);
         if (var4.getItem() == Items.field38120 && Class3256.method11698(var4)) {
            var3 = true;
            if (!this.world.isRemote && (this.field5003 + 1) % 20 == 0) {
               var4.method32121(1, this, var0 -> var0.method3184(Class2106.field13735));
            }
         } else {
            var3 = false;
         }
      } else {
         var3 = false;
      }

      if (!this.world.isRemote) {
         this.method3349(7, var3);
      }
   }

   public void updateEntityActionState() {
   }

   public void method3126() {
      List var3 = this.world.method6770(this, this.getBoundingBox(), Class8088.method27981(this));
      if (!var3.isEmpty()) {
         int var4 = this.world.method6789().method17136(Class5462.field24241);
         if (var4 > 0 && var3.size() > var4 - 1 && this.rand.nextInt(4) == 0) {
            int var5 = 0;

            for (int var6 = 0; var6 < var3.size(); var6++) {
               if (!((Entity)var3.get(var6)).isPassenger()) {
                  var5++;
               }
            }

            if (var5 > var4 - 1) {
               this.method2741(Class8654.field38998, 6.0F);
            }
         }

         for (int var7 = 0; var7 < var3.size(); var7++) {
            Entity var8 = (Entity)var3.get(var7);
            this.method3128(var8);
         }
      }
   }

   public void method3127(AxisAlignedBB var1, AxisAlignedBB var2) {
      AxisAlignedBB var5 = var1.method19666(var2);
      List var6 = this.world.method7181(this, var5);
      if (var6.isEmpty()) {
         if (this.collidedHorizontally) {
            this.field5008 = 0;
         }
      } else {
         for (int var7 = 0; var7 < var6.size(); var7++) {
            Entity var8 = (Entity)var6.get(var7);
            if (var8 instanceof LivingEntity) {
               this.method2900((LivingEntity)var8);
               this.field5008 = 0;
               this.method3434(this.method3433().method11344(-0.2));
               break;
            }
         }
      }

      if (!this.world.isRemote && this.field5008 <= 0) {
         this.method3153(4, false);
      }
   }

   public void method3128(Entity var1) {
      var1.method3101(this);
   }

   public void method2900(LivingEntity var1) {
   }

   public void method3129(int var1) {
      this.field5008 = var1;
      if (!this.world.isRemote) {
         this.method3153(4, true);
      }
   }

   public boolean method3130() {
      return (this.dataManager.<Byte>method35445(field4934) & 4) != 0;
   }

   @Override
   public void stopRiding() {
      Entity var3 = this.getRidingEntity();
      super.stopRiding();
      if (var3 != null && var3 != this.getRidingEntity() && !this.world.isRemote) {
         this.method3102(var3);
      }
   }

   @Override
   public void method2868() {
      super.method2868();
      this.field4974 = this.field4975;
      this.field4975 = 0.0F;
      this.fallDistance = 0.0F;
   }

   @Override
   public void setPositionAndRotationDirect(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.field4986 = var1;
      this.field4987 = var3;
      this.field4988 = var5;
      this.field4989 = (double)var7;
      this.field4990 = (double)var8;
      this.field4985 = var9;
   }

   @Override
   public void method3132(float var1, int var2) {
      this.field4991 = (double)var1;
      this.field4992 = var2;
   }

   public void method3133(boolean var1) {
      this.field4981 = var1;
   }

   public void method3134(ItemEntity var1) {
      PlayerEntity var4 = var1.method4128() == null ? null : this.world.method7196(var1.method4128());
      if (var4 instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44505.method15090((ServerPlayerEntity)var4, var1.method4124(), this);
      }
   }

   public void method2751(Entity var1, int var2) {
      if (!var1.removed && !this.world.isRemote && (var1 instanceof ItemEntity || var1 instanceof AbstractArrowEntity || var1 instanceof ExperienceOrbEntity)) {
         ((ServerWorld)this.world).getChunkProvider().method7380(var1, new SCollectItemPacket(var1.getEntityId(), this.getEntityId(), var2));
      }
   }

   public boolean method3135(Entity var1) {
      Vector3d var4 = new Vector3d(this.getPosX(), this.method3442(), this.getPosZ());
      Vector3d var5 = new Vector3d(var1.getPosX(), var1.method3442(), var1.getPosZ());
      return this.world.method7036(new Class6809(var4, var5, Class2271.field14774, Class1985.field12962, this)).getType() == RayTraceResult.Type.MISS;
   }

   @Override
   public float method3136(float var1) {
      return var1 != 1.0F ? MathHelper.lerp(var1, this.field4968, this.field4967) : this.field4967;
   }

   public float method3137(float var1) {
      float var4 = this.field4957 - this.field4956;
      if (var4 < 0.0F) {
         var4++;
      }

      return this.field4956 + var4 * var1;
   }

   public boolean method3138() {
      return !this.world.isRemote;
   }

   @Override
   public boolean method3139() {
      return !this.removed;
   }

   @Override
   public boolean method3140() {
      return this.isAlive() && !this.isSpectator() && !this.method3063();
   }

   @Override
   public void method3141() {
      this.velocityChanged = this.rand.nextDouble() >= this.method3086(Attributes.field42107);
   }

   @Override
   public float method3142() {
      return this.field4967;
   }

   @Override
   public void method3143(float var1) {
      this.field4967 = var1;
   }

   @Override
   public void method3144(float var1) {
      this.field4965 = var1;
   }

   @Override
   public Vector3d method3145(Class113 var1, Class9502 var2) {
      return method3146(super.method3145(var1, var2));
   }

   public static Vector3d method3146(Vector3d var0) {
      return new Vector3d(var0.x, var0.y, 0.0);
   }

   public float method2959() {
      return this.field5000;
   }

   public void method2958(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.field5000 = var1;
   }

   public void method2730() {
   }

   public void method2731() {
   }

   public void method3147() {
      this.field4993 = true;
   }

   public abstract HandSide method2967();

   public boolean isHandActive() {
      return (this.dataManager.<Byte>method35445(field4934) & 1) > 0;
   }

   public Hand method3149() {
      return (this.dataManager.<Byte>method35445(field4934) & 2) <= 0 ? Hand.MAIN_HAND : Hand.field183;
   }

   private void method3150() {
      if (this.isHandActive()) {
         if (!ItemStack.method32131(this.getHeldItem(this.method3149()), this.field5001)) {
            this.method3162();
         } else {
            this.field5001 = this.getHeldItem(this.method3149());
            this.field5001.method32183(this.world, this, this.method3159());
            if (this.method3151()) {
               this.method3156(this.field5001, 5);
            }

            if (--this.field5002 == 0 && !this.world.isRemote && !this.field5001.method32140()) {
               this.method2786();
            }
         }
      }
   }

   private boolean method3151() {
      int var3 = this.method3159();
      Class9427 var4 = this.field5001.getItem().method11745();
      boolean var5 = var4 != null && var4.method36161();
      var5 |= var3 <= this.field5001.method32137() - 7;
      return var5 && var3 % 4 == 0;
   }

   private void method3152() {
      this.field5010 = this.field5009;
      if (!this.method3166()) {
         this.field5009 = Math.max(0.0F, this.field5009 - 0.09F);
      } else {
         this.field5009 = Math.min(1.0F, this.field5009 + 0.09F);
      }
   }

   public void method3153(int var1, boolean var2) {
      int var5 = this.dataManager.<Byte>method35445(field4934);
      if (!var2) {
         var5 &= ~var1;
      } else {
         var5 |= var1;
      }

      this.dataManager.method35446(field4934, (byte)var5);
   }

   public void method3154(Hand var1) {
      ItemStack var4 = this.getHeldItem(var1);
      if (!var4.isEmpty() && !this.isHandActive()) {
         this.field5001 = var4;
         this.field5002 = var4.method32137();
         if (!this.world.isRemote) {
            this.method3153(1, true);
            this.method3153(2, var1 == Hand.field183);
         }
      }
   }

   @Override
   public void method3155(DataParameter<?> var1) {
      super.method3155(var1);
      if (!field4940.equals(var1)) {
         if (field4934.equals(var1) && this.world.isRemote) {
            if (this.isHandActive() && this.field5001.isEmpty()) {
               this.field5001 = this.getHeldItem(this.method3149());
               if (!this.field5001.isEmpty()) {
                  this.field5002 = this.field5001.method32137();
               }
            } else if (!this.isHandActive() && !this.field5001.isEmpty()) {
               this.field5001 = ItemStack.EMPTY;
               this.field5002 = 0;
            }
         }
      } else if (this.world.isRemote) {
         this.method3173().ifPresent(this::method3177);
      }
   }

   @Override
   public void method2787(Class2062 var1, Vector3d var2) {
      super.method2787(var1, var2);
      this.field4968 = this.field4967;
      this.field4965 = this.field4967;
      this.field4966 = this.field4965;
   }

   public void method3156(ItemStack var1, int var2) {
      if (!var1.isEmpty() && this.isHandActive()) {
         if (var1.method32138() == Class2103.field13708) {
            this.method2863(this.method3059(var1), 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
         }

         if (var1.method32138() == Class2103.field13707) {
            this.method3157(var1, var2);
            this.method2863(
               this.method3060(var1), 0.5F + 0.5F * (float)this.rand.nextInt(2), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F
            );
         }
      }
   }

   private void method3157(ItemStack var1, int var2) {
      for (int var5 = 0; var5 < var2; var5++) {
         Vector3d var6 = new Vector3d(((double)this.rand.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         var6 = var6.method11350(-this.rotationPitch * (float) (Math.PI / 180.0));
         var6 = var6.method11351(-this.rotationYaw * (float) (Math.PI / 180.0));
         double var7 = (double)(-this.rand.nextFloat()) * 0.6 - 0.3;
         Vector3d var9 = new Vector3d(((double)this.rand.nextFloat() - 0.5) * 0.3, var7, 0.6);
         var9 = var9.method11350(-this.rotationPitch * (float) (Math.PI / 180.0));
         var9 = var9.method11351(-this.rotationYaw * (float) (Math.PI / 180.0));
         var9 = var9.method11339(this.getPosX(), this.method3442(), this.getPosZ());
         this.world
            .method6746(
               new Class7438(ParticleTypes.field34082, var1),
               var9.x,
               var9.y,
               var9.z,
               var6.x,
               var6.y + 0.05,
               var6.z
            );
      }
   }

   public void method2786() {
      Hand var3 = this.method3149();
      if (this.field5001.equals(this.getHeldItem(var3))) {
         if (!this.field5001.isEmpty() && this.isHandActive()) {
            this.method3156(this.field5001, 16);
            ItemStack var4 = this.field5001.method32111(this.world, this);
            if (var4 != this.field5001) {
               this.method3095(var3, var4);
            }

            this.method3162();
         }
      } else {
         this.method3161();
      }
   }

   public ItemStack method3158() {
      return this.field5001;
   }

   public int method3159() {
      return this.field5002;
   }

   public int method3160() {
      return !this.isHandActive() ? 0 : this.field5001.method32137() - this.method3159();
   }

   public void method3161() {
      if (!this.field5001.isEmpty()) {
         this.field5001.method32139(this.world, this, this.method3159());
         if (this.field5001.method32140()) {
            this.method3150();
         }
      }

      this.method3162();
   }

   public void method3162() {
      if (!this.world.isRemote) {
         this.method3153(1, false);
      }

      this.field5001 = ItemStack.EMPTY;
      this.field5002 = 0;
   }

   public boolean method3163() {
      if (this.isHandActive() && !this.field5001.isEmpty()) {
         Item var3 = this.field5001.getItem();
         return var3.method11727(this.field5001) == Class2103.field13709 ? var3.method11728(this.field5001) - this.field5002 >= 5 : false;
      } else {
         return false;
      }
   }

   public boolean method3164() {
      return this.method3331();
   }

   public boolean method3165() {
      return this.method3348(7);
   }

   @Override
   public boolean method3166() {
      return super.method3166() || !this.method3165() && this.method3212() == Pose.field13620;
   }

   public int method3167() {
      return this.field5003;
   }

   public boolean method3168(double var1, double var3, double var5, boolean var7) {
      double var10 = this.getPosX();
      double var12 = this.getPosY();
      double var14 = this.getPosZ();
      double var16 = var3;
      boolean var18 = false;
      BlockPos var19 = new BlockPos(var1, var3, var5);
      World var20 = this.world;
      if (var20.method7017(var19)) {
         boolean var21 = false;

         while (!var21 && var19.getY() > 0) {
            BlockPos var22 = var19.down();
            BlockState var23 = var20.getBlockState(var22);
            if (!var23.method23384().method31087()) {
               var16--;
               var19 = var22;
            } else {
               var21 = true;
            }
         }

         if (var21) {
            this.method2793(var1, var16, var5);
            if (var20.method7052(this) && !var20.method7014(this.getBoundingBox())) {
               var18 = true;
            }
         }
      }

      if (var18) {
         if (var7) {
            var20.method6786(this, (byte)46);
         }

         if (this instanceof Class1046) {
            ((Class1046)this).method4230().method21666();
         }

         return true;
      } else {
         this.method2793(var10, var12, var14);
         return false;
      }
   }

   public boolean method3169() {
      return true;
   }

   public boolean method3170() {
      return true;
   }

   public void method3171(BlockPos var1, boolean var2) {
   }

   public boolean method2980(ItemStack var1) {
      return false;
   }

   @Override
   public Packet<?> method2835() {
      return new SSpawnMobPacket(this);
   }

   @Override
   public EntitySize method2981(Pose var1) {
      return var1 != Pose.field13621 ? super.method2981(var1).method32099(this.method3006()) : field4941;
   }

   public ImmutableList<Pose> method2982() {
      return ImmutableList.of(Pose.STANDING);
   }

   public AxisAlignedBB method3172(Pose var1) {
      EntitySize var4 = this.method2981(var1);
      return new AxisAlignedBB(
         (double)(-var4.field39968 / 2.0F),
         0.0,
         (double)(-var4.field39968 / 2.0F),
         (double)(var4.field39968 / 2.0F),
         (double)var4.field39969,
         (double)(var4.field39968 / 2.0F)
      );
   }

   public Optional<BlockPos> method3173() {
      return this.dataManager.<Optional<BlockPos>>method35445(field4940);
   }

   public void method3174(BlockPos var1) {
      this.dataManager.method35446(field4940, Optional.<BlockPos>of(var1));
   }

   public void method3175() {
      this.dataManager.method35446(field4940, Optional.<BlockPos>empty());
   }

   public boolean isSleeping() {
      return this.method3173().isPresent();
   }

   public void method2753(BlockPos var1) {
      if (this.isPassenger()) {
         this.stopRiding();
      }

      BlockState var4 = this.world.getBlockState(var1);
      if (var4.getBlock() instanceof Class3250) {
         this.world.setBlockState(var1, var4.method23465(Class3250.field18714, Boolean.valueOf(true)), 3);
      }

      this.method3211(Pose.field13621);
      this.method3177(var1);
      this.method3174(var1);
      this.method3434(Vector3d.ZERO);
      this.isAirBorne = true;
   }

   private void method3177(BlockPos var1) {
      this.setPosition((double)var1.getX() + 0.5, (double)var1.getY() + 0.6875, (double)var1.getZ() + 0.5);
   }

   private boolean method3178() {
      return this.method3173().<Boolean>map(var1 -> this.world.getBlockState(var1).getBlock() instanceof Class3250).orElse(false);
   }

   public void method2907() {
      this.method3173().filter(this.world::method7017).ifPresent(var1 -> {
         BlockState var4 = this.world.getBlockState(var1);
         if (var4.getBlock() instanceof Class3250) {
            this.world.setBlockState(var1, var4.method23465(Class3250.field18714, Boolean.valueOf(false)), 3);
            Vector3d var5 = Class3250.method11686(this.getType(), this.world, var1, this.rotationYaw).orElseGet(() -> {
               BlockPos var3x = var1.up();
               return new Vector3d((double)var3x.getX() + 0.5, (double)var3x.getY() + 0.1, (double)var3x.getZ() + 0.5);
            });
            Vector3d var6 = Vector3d.method11330(var1).method11336(var5).method11333();
            float var7 = (float) MathHelper.method37793(MathHelper.method37814(var6.z, var6.x) * 180.0F / (float)Math.PI - 90.0);
            this.setPosition(var5.x, var5.y, var5.z);
            this.rotationYaw = var7;
            this.rotationPitch = 0.0F;
         }
      });
      Vector3d var3 = this.getPositionVec();
      this.method3211(Pose.STANDING);
      this.setPosition(var3.x, var3.y, var3.z);
      this.method3175();
   }

   @Nullable
   public Direction method3179() {
      BlockPos var3 = this.method3173().orElse((BlockPos)null);
      return var3 == null ? null : Class3250.method11678(this.world, var3);
   }

   @Override
   public boolean method3180() {
      return !this.isSleeping() && super.method3180();
   }

   @Override
   public final float method3181(Pose var1, EntitySize var2) {
      return var1 != Pose.field13621 ? this.method2957(var1, var2) : 0.2F;
   }

   public float method2957(Pose var1, EntitySize var2) {
      return super.method3181(var1, var2);
   }

   public ItemStack method2983(ItemStack var1) {
      return ItemStack.EMPTY;
   }

   public ItemStack method2984(World var1, ItemStack var2) {
      if (var2.method32184()) {
         var1.method6743(
            (PlayerEntity)null,
            this.getPosX(),
            this.getPosY(),
            this.getPosZ(),
            this.method3060(var2),
            Class2266.field14734,
            1.0F,
            1.0F + (var1.rand.nextFloat() - var1.rand.nextFloat()) * 0.4F
         );
         this.method3182(var2, var1, this);
         if (!(this instanceof PlayerEntity) || !((PlayerEntity)this).abilities.isCreativeMode) {
            var2.method32182(1);
         }
      }

      return var2;
   }

   private void method3182(ItemStack var1, World var2, LivingEntity var3) {
      Item var6 = var1.getItem();
      if (var6.method11744()) {
         for (Pair var8 : var6.method11745().method36162()) {
            if (!var2.isRemote && var8.getFirst() != null && var2.rand.nextFloat() < (Float)var8.getSecond()) {
               var3.method3035(new Class2023((Class2023)var8.getFirst()));
            }
         }
      }
   }

   private static byte method3183(Class2106 var0) {
      switch (Class8717.field39334[var0.ordinal()]) {
         case 1:
            return 47;
         case 2:
            return 48;
         case 3:
            return 49;
         case 4:
            return 50;
         case 5:
            return 52;
         case 6:
            return 51;
         default:
            return 47;
      }
   }

   public void method3184(Class2106 var1) {
      this.world.method6786(this, method3183(var1));
   }

   public void method3185(Hand var1) {
      this.method3184(var1 != Hand.MAIN_HAND ? Class2106.field13732 : Class2106.field13731);
   }

   @Override
   public AxisAlignedBB method3186() {
      if (this.method2943(Class2106.field13736).getItem() != Items.field38063) {
         return super.method3186();
      } else {
         float var3 = 0.5F;
         return this.getBoundingBox().method19663(0.5, 0.5, 0.5);
      }
   }
}
