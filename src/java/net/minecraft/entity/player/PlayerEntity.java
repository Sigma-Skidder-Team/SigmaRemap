package net.minecraft.entity.player;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.SafeWalkEvent;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.client.PlayerAbilities;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import net.minecraft.particles.IParticleData;
import net.minecraft.tileentity.CommandBlockTileEntity;
import net.minecraft.tileentity.JigsawTileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Predicate;

public abstract class PlayerEntity extends LivingEntity {
   public static final EntitySize field4893 = EntitySize.method32101(0.6F, 1.8F);
   private static final Map<Pose, EntitySize> field4894 = ImmutableMap.<Pose, EntitySize>builder()
      .put(Pose.STANDING, field4893)
      .put(Pose.field13621, field4941)
      .put(Pose.field13620, EntitySize.method32101(0.6F, 0.6F))
      .put(Pose.field13622, EntitySize.method32101(0.6F, 0.6F))
      .put(Pose.field13623, EntitySize.method32101(0.6F, 0.6F))
      .put(Pose.field13624, EntitySize.method32101(0.6F, 1.5F))
      .put(Pose.field13625, EntitySize.method32102(0.2F, 0.2F))
      .build();
   private static final DataParameter<Float> field4895 = EntityDataManager.<Float>createKey(PlayerEntity.class, DataSerializers.field33392);
   private static final DataParameter<Integer> field4896 = EntityDataManager.<Integer>createKey(PlayerEntity.class, DataSerializers.field33391);
   public static final DataParameter<Byte> field4897 = EntityDataManager.<Byte>createKey(PlayerEntity.class, DataSerializers.field33390);
   public static final DataParameter<Byte> field4898 = EntityDataManager.<Byte>createKey(PlayerEntity.class, DataSerializers.field33390);
   public static final DataParameter<CompoundNBT> field4899 = EntityDataManager.<CompoundNBT>createKey(PlayerEntity.class, DataSerializers.field33405);
   public static final DataParameter<CompoundNBT> field4900 = EntityDataManager.<CompoundNBT>createKey(PlayerEntity.class, DataSerializers.field33405);
   private long field4901;
   public PlayerInventory inventory = new PlayerInventory(this);
   public Class980 field4903 = new Class980();
   public final Class5830 field4904;
   public Class5812 field4905;
   public Class9640 field4906 = new Class9640();
   public int field4907;
   public float field4908;
   public float field4909;
   public int field4910;
   public double field4911;
   public double field4912;
   public double field4913;
   public double field4914;
   public double field4915;
   public double field4916;
   private int field4917;
   public boolean field4918;
   public final PlayerAbilities abilities = new PlayerAbilities();
   public int field4920;
   public int field4921;
   public float field4922;
   public int field4923;
   public final float field4924 = 0.02F;
   private int field4925;
   private final GameProfile field4926;
   private boolean field4927;
   private ItemStack field4928 = ItemStack.EMPTY;
   private final Class6462 field4929 = this.method2733();
   public Class904 field4930;

   public PlayerEntity(World var1, BlockPos var2, float var3, GameProfile var4) {
      super(EntityType.PLAYER, var1);
      this.method3374(method2960(var4));
      this.field4926 = var4;
      this.field4904 = new Class5830(this.inventory, !var1.isRemote, this);
      this.field4905 = this.field4904;
      this.method3273((double)var2.getX() + 0.5, (double)(var2.getY() + 1), (double)var2.getZ() + 0.5, var3, 0.0F);
      this.field4978 = 180.0F;
   }

   public boolean method2848(World var1, BlockPos var2, Class1894 var3) {
      if (!var3.method8156()) {
         return false;
      } else if (var3 != Class1894.field11105) {
         if (this.method2935()) {
            return false;
         } else {
            ItemStack var6 = this.getHeldItemMainhand();
            return var6.isEmpty() || !var6.method32175(var1.method6817(), new Class9632(var1, var2, false));
         }
      } else {
         return true;
      }
   }

   public static Class7037 method2849() {
      return LivingEntity.method2997()
         .method21849(Attributes.field42110, 1.0)
         .method21849(Attributes.MOVEMENT_SPEED, 0.1F)
         .method21848(Attributes.ATTACK_SPEED)
         .method21848(Attributes.LUCK);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field4895, 0.0F);
      this.dataManager.register(field4896, 0);
      this.dataManager.register(field4897, (byte)0);
      this.dataManager.register(field4898, (byte)1);
      this.dataManager.register(field4899, new CompoundNBT());
      this.dataManager.register(field4900, new CompoundNBT());
   }

   @Override
   public void tick() {
      this.noClip = this.isSpectator();
      if (this.isSpectator()) {
         this.onGround = false;
      }

      if (this.field4910 > 0) {
         this.field4910--;
      }

      if (!this.isSleeping()) {
         if (this.field4917 > 0) {
            this.field4917++;
            if (this.field4917 >= 110) {
               this.field4917 = 0;
            }
         }
      } else {
         this.field4917++;
         if (this.field4917 > 100) {
            this.field4917 = 100;
         }

         if (!this.world.isRemote && this.world.method6740()) {
            this.stopSleepInBed(false, true);
         }
      }

      this.method2854();
      super.tick();
      if (!this.world.isRemote && this.field4905 != null && !this.field4905.method18103(this)) {
         this.method2772();
         this.field4905 = this.field4904;
      }

      this.method2856();
      if (!this.world.isRemote) {
         this.field4906.method37571(this);
         this.method2911(Class8876.field40106);
         if (this.isAlive()) {
            this.method2911(Class8876.field40107);
         }

         if (this.method3334()) {
            this.method2911(Class8876.field40109);
         }

         if (!this.isSleeping()) {
            this.method2911(Class8876.field40108);
         }
      }

      double var4 = MathHelper.method37778(this.getPosX(), -2.9999999E7, 2.9999999E7);
      double var6 = MathHelper.method37778(this.getPosZ(), -2.9999999E7, 2.9999999E7);
      if (var4 != this.getPosX() || var6 != this.getPosZ()) {
         this.setPosition(var4, this.getPosY(), var6);
      }

      this.field4958++;
      ItemStack var8 = this.getHeldItemMainhand();
      if (!ItemStack.method32128(this.field4928, var8)) {
         if (!ItemStack.method32131(this.field4928, var8)) {
            this.resetCooldown();
         }

         this.field4928 = var8.copy();
      }

      this.method2855();
      this.field4929.method19637();
      this.method2857();
   }

   public boolean method2851() {
      return this.method3331();
   }

   public boolean method2852() {
      return this.method3331();
   }

   public boolean method2853() {
      return this.method3331();
   }

   public boolean method2854() {
      this.field4918 = this.method3263(Class8953.field40469);
      return this.field4918;
   }

   private void method2855() {
      ItemStack var3 = this.method2943(Class2106.field13736);
      if (var3.getItem() == Items.field37792 && !this.method3263(Class8953.field40469)) {
         this.method3035(new Class2023(Effects.WATER_BREATHING, 200, 0, false, false, true));
      }
   }

   public Class6462 method2733() {
      return new Class6462();
   }

   private void method2856() {
      this.field4911 = this.field4914;
      this.field4912 = this.field4915;
      this.field4913 = this.field4916;
      double var3 = this.getPosX() - this.field4914;
      double var5 = this.getPosY() - this.field4915;
      double var7 = this.getPosZ() - this.field4916;
      double var9 = 10.0;
      if (var3 > 10.0) {
         this.field4914 = this.getPosX();
         this.field4911 = this.field4914;
      }

      if (var7 > 10.0) {
         this.field4916 = this.getPosZ();
         this.field4913 = this.field4916;
      }

      if (var5 > 10.0) {
         this.field4915 = this.getPosY();
         this.field4912 = this.field4915;
      }

      if (var3 < -10.0) {
         this.field4914 = this.getPosX();
         this.field4911 = this.field4914;
      }

      if (var7 < -10.0) {
         this.field4916 = this.getPosZ();
         this.field4913 = this.field4916;
      }

      if (var5 < -10.0) {
         this.field4915 = this.getPosY();
         this.field4912 = this.field4915;
      }

      this.field4914 += var3 * 0.25;
      this.field4916 += var7 * 0.25;
      this.field4915 += var5 * 0.25;
   }

   public void method2857() {
      if (this.method3314(Pose.field13622)) {
         Pose var3;
         if (!this.method3165()) {
            if (!this.isSleeping()) {
               if (!this.method2951()) {
                  if (!this.method3130()) {
                     if (this.method3331() && !this.abilities.isFlying) {
                        var3 = Pose.field13624;
                     } else {
                        var3 = Pose.STANDING;
                     }
                  } else {
                     var3 = Pose.field13623;
                  }
               } else {
                  var3 = Pose.field13622;
               }
            } else {
               var3 = Pose.field13621;
            }
         } else {
            var3 = Pose.field13620;
         }

         Pose var4;
         if (this.isSpectator() || this.isPassenger() || this.method3314(var3)) {
            var4 = var3;
         } else if (!this.method3314(Pose.field13624)) {
            var4 = Pose.field13622;
         } else {
            var4 = Pose.field13624;
         }

         this.method3211(var4);
      }
   }

   @Override
   public int method2858() {
      return !this.abilities.disableDamage ? 80 : 1;
   }

   @Override
   public SoundEvent method2859() {
      return Sounds.field26969;
   }

   @Override
   public SoundEvent method2860() {
      return Sounds.field26967;
   }

   @Override
   public SoundEvent method2861() {
      return Sounds.field26968;
   }

   @Override
   public int method2862() {
      return 10;
   }

   @Override
   public void method2863(SoundEvent var1, float var2, float var3) {
      this.world.method6743(this, this.getPosX(), this.getPosY(), this.getPosZ(), var1, this.method2864(), var2, var3);
   }

   public void method2834(SoundEvent var1, Class2266 var2, float var3, float var4) {
   }

   @Override
   public Class2266 method2864() {
      return Class2266.field14735;
   }

   @Override
   public int getFireImmuneTicks() {
      return 20;
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 9) {
         if (var1 != 23) {
            if (var1 != 22) {
               if (var1 != 43) {
                  super.method2866(var1);
               } else {
                  this.method2867(ParticleTypes.field34053);
               }
            } else {
               this.field4927 = true;
            }
         } else {
            this.field4927 = false;
         }
      } else {
         this.method2786();
      }
   }

   private void method2867(IParticleData var1) {
      for (int var4 = 0; var4 < 5; var4++) {
         double var5 = this.rand.nextGaussian() * 0.02;
         double var7 = this.rand.nextGaussian() * 0.02;
         double var9 = this.rand.nextGaussian() * 0.02;
         this.world.method6746(var1, this.method3438(1.0), this.method3441() + 1.0, this.method3445(1.0), var5, var7, var9);
      }
   }

   public void method2772() {
      this.field4905 = this.field4904;
   }

   @Override
   public void method2868() {
      if (this.method2852() && this.isPassenger()) {
         this.stopRiding();
         this.setSneaking(false);
      } else {
         double var3 = this.getPosX();
         double var5 = this.getPosY();
         double var7 = this.getPosZ();
         super.method2868();
         this.field4908 = this.field4909;
         this.field4909 = 0.0F;
         this.method2920(this.getPosX() - var3, this.getPosY() - var5, this.getPosZ() - var7);
      }
   }

   @Override
   public void method2869() {
      this.method3211(Pose.STANDING);
      super.method2869();
      this.method3043(this.method3075());
      this.field4955 = 0;
   }

   @Override
   public void updateEntityActionState() {
      super.updateEntityActionState();
      this.method3084();
      this.field4967 = this.rotationYaw;
   }

   @Override
   public void method2871() {
      if (this.field4907 > 0) {
         this.field4907--;
      }

      if (this.world.method6997() == Difficulty.field14351 && this.world.method6789().method17135(Class5462.field24231)) {
         if (this.getHealth() < this.method3075() && this.ticksExisted % 20 == 0) {
            this.method3041(1.0F);
         }

         if (this.field4906.method37575() && this.ticksExisted % 10 == 0) {
            this.field4906.method37578(this.field4906.method37574() + 1);
         }
      }

      this.inventory.method4044();
      this.field4908 = this.field4909;
      super.method2871();
      this.field4969 = 0.02F;
      if (this.method3337()) {
         this.field4969 = (float)((double)this.field4969 + 0.005999999865889549);
      }

      this.method3113((float)this.method3086(Attributes.MOVEMENT_SPEED));
      float var3;
      if (this.onGround && !this.getShouldBeDead() && !this.method2951()) {
         var3 = Math.min(0.1F, MathHelper.method37766(method3234(this.method3433())));
      } else {
         var3 = 0.0F;
      }

      this.field4909 = this.field4909 + (var3 - this.field4909) * 0.4F;
      if (this.getHealth() > 0.0F && !this.isSpectator()) {
         AxisAlignedBB var4;
         if (this.isPassenger() && !this.getRidingEntity().removed) {
            var4 = this.getBoundingBox().method19666(this.getRidingEntity().getBoundingBox()).method19663(1.0, 0.0, 1.0);
         } else {
            var4 = this.getBoundingBox().method19663(1.0, 0.5, 1.0);
         }

         List var5 = this.world.method7181(this, var4);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            Entity var7 = (Entity)var5.get(var6);
            if (!var7.removed) {
               this.method2873(var7);
            }
         }
      }

      this.method2872(this.method2969());
      this.method2872(this.method2971());
      if (!this.world.isRemote && (this.fallDistance > 0.5F || this.method3250()) || this.abilities.isFlying || this.isSleeping()) {
         this.method2949();
      }
   }

   private void method2872(CompoundNBT var1) {
      if (var1 != null && (!var1.contains("Silent") || !var1.getBoolean("Silent")) && this.world.rand.nextInt(200) == 0) {
         String var4 = var1.getString("id");
         EntityType.method33199(var4)
            .filter(var0 -> var0 == EntityType.field41062)
            .ifPresent(
               var1x -> {
                  if (!Class1015.method4409(this.world, this)) {
                     this.world
                        .method6743(
                           (PlayerEntity)null,
                           this.getPosX(),
                           this.getPosY(),
                           this.getPosZ(),
                           Class1015.method4411(this.world, this.world.rand),
                           this.method2864(),
                           1.0F,
                           Class1015.method4413(this.world.rand)
                        );
                  }
               }
            );
      }
   }

   private void method2873(Entity var1) {
      var1.method3279(this);
   }

   public int method2874() {
      return this.dataManager.<Integer>method35445(field4896);
   }

   public void method2875(int var1) {
      this.dataManager.method35446(field4896, var1);
   }

   public void method2876(int var1) {
      int var4 = this.method2874();
      this.dataManager.method35446(field4896, var4 + var1);
   }

   @Override
   public void method2737(Class8654 var1) {
      super.method2737(var1);
      this.method3216();
      if (!this.isSpectator()) {
         this.method3052(var1);
      }

      if (var1 == null) {
         this.method3435(0.0, 0.1, 0.0);
      } else {
         this.method3435(
            (double)(-MathHelper.cos((this.field4954 + this.rotationYaw) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-MathHelper.sin((this.field4954 + this.rotationYaw) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      }

      this.method2911(Class8876.field40134);
      this.method2777(Class8876.field40104.method172(Class8876.field40107));
      this.method2777(Class8876.field40104.method172(Class8876.field40108));
      this.method3223();
      this.method3349(0, false);
   }

   @Override
   public void method2877() {
      super.method2877();
      if (!this.world.method6789().method17135(Class5462.field24225)) {
         this.method2878();
         this.inventory.method4054();
      }
   }

   public void method2878() {
      for (int var3 = 0; var3 < this.inventory.method3629(); var3++) {
         ItemStack var4 = this.inventory.method3618(var3);
         if (!var4.isEmpty() && Class7858.method26335(var4)) {
            this.inventory.method3620(var3);
         }
      }
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      if (var1 != Class8654.field38994) {
         if (var1 != Class8654.field38999) {
            return var1 != Class8654.field39012 ? Sounds.field26961 : Sounds.field26964;
         } else {
            return Sounds.field26962;
         }
      } else {
         return Sounds.field26963;
      }
   }

   @Override
   public SoundEvent method2880() {
      return Sounds.field26960;
   }

   public boolean drop(boolean var1) {
      return this.method2836(
            this.inventory
               .method3619(this.inventory.currentItem, var1 && !this.inventory.method4028().isEmpty() ? this.inventory.method4028().getCount() : 1),
            false,
            true
         )
         != null;
   }

   @Nullable
   public ItemEntity method2882(ItemStack var1, boolean var2) {
      return this.method2836(var1, false, var2);
   }

   @Nullable
   public ItemEntity method2836(ItemStack var1, boolean var2, boolean var3) {
      if (!var1.isEmpty()) {
         if (this.world.isRemote && Class8005.method27372().method18582() >= Class5989.field26151.method18582()) {
            this.swingArm(Hand.MAIN_HAND);
         }

         double var6 = this.method3442() - 0.3F;
         ItemEntity var8 = new ItemEntity(this.world, this.getPosX(), var6, this.getPosZ(), var1);
         var8.method4134(40);
         if (var3) {
            var8.method4129(this.getUniqueID());
         }

         if (!var2) {
            float var9 = 0.3F;
            float var10 = MathHelper.sin(this.rotationPitch * (float) (Math.PI / 180.0));
            float var11 = MathHelper.cos(this.rotationPitch * (float) (Math.PI / 180.0));
            float var12 = MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0));
            float var13 = MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0));
            float var14 = this.rand.nextFloat() * (float) (Math.PI * 2);
            float var15 = 0.02F * this.rand.nextFloat();
            var8.method3435(
               (double)(-var12 * var11 * 0.3F) + Math.cos((double)var14) * (double)var15,
               (double)(-var10 * 0.3F + 0.1F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F),
               (double)(var13 * var11 * 0.3F) + Math.sin((double)var14) * (double)var15
            );
         } else {
            float var16 = this.rand.nextFloat() * 0.5F;
            float var17 = this.rand.nextFloat() * (float) (Math.PI * 2);
            var8.method3435((double)(-MathHelper.sin(var17) * var16), 0.2F, (double)(MathHelper.cos(var17) * var16));
         }

         return var8;
      } else {
         return null;
      }
   }

   public float method2883(BlockState var1) {
      float var4 = this.inventory.method4049(var1);
      if (var4 > 1.0F) {
         int var5 = Class7858.method26327(this);
         ItemStack var6 = this.getHeldItemMainhand();
         if (var5 > 0 && !var6.isEmpty()) {
            var4 += (float)(var5 * var5 + 1);
         }
      }

      if (Class7182.method22536(this)) {
         var4 *= 1.0F + (float)(Class7182.method22537(this) + 1) * 0.2F;
      }

      if (this.method3033(Effects.MINING_FATIGUE)) {
         float var7;
         switch (this.method3034(Effects.MINING_FATIGUE).method8629()) {
            case 0:
               var7 = 0.3F;
               break;
            case 1:
               var7 = 0.09F;
               break;
            case 2:
               var7 = 0.0027F;
               break;
            case 3:
            default:
               var7 = 8.1E-4F;
         }

         var4 *= var7;
      }

      if (this.method3263(Class8953.field40469) && !Class7858.method26331(this)) {
         var4 /= 5.0F;
      }

      if (!this.onGround) {
         var4 /= 5.0F;
      }

      return var4;
   }

   public boolean method2884(BlockState var1) {
      return !var1.method23458() || this.inventory.method4028().method32124(var1);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.method3374(method2960(this.field4926));
      ListNBT var4 = var1.method131("Inventory", 10);
      this.inventory.method4051(var4);
      this.inventory.currentItem = var1.getInt("SelectedItemSlot");
      this.field4917 = var1.getShort("SleepTimer");
      this.field4922 = var1.getFloat("XpP");
      this.field4920 = var1.getInt("XpLevel");
      this.field4921 = var1.getInt("XpTotal");
      this.field4923 = var1.getInt("XpSeed");
      if (this.field4923 == 0) {
         this.field4923 = this.rand.nextInt();
      }

      this.method2875(var1.getInt("Score"));
      this.field4906.method37572(var1);
      this.abilities.read(var1);
      this.method3085(Attributes.MOVEMENT_SPEED).method38661((double)this.abilities.getWalkSpeed());
      if (var1.contains("EnderItems", 9)) {
         this.field4903.method3682(var1.method131("EnderItems", 10));
      }

      if (var1.contains("ShoulderEntityLeft", 10)) {
         this.method2970(var1.getCompound("ShoulderEntityLeft"));
      }

      if (var1.contains("ShoulderEntityRight", 10)) {
         this.method2972(var1.getCompound("ShoulderEntityRight"));
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("DataVersion", SharedConstants.getVersion().getWorldVersion());
      var1.put("Inventory", this.inventory.method4050(new ListNBT()));
      var1.method102("SelectedItemSlot", this.inventory.currentItem);
      var1.method101("SleepTimer", (short)this.field4917);
      var1.putFloat("XpP", this.field4922);
      var1.method102("XpLevel", this.field4920);
      var1.method102("XpTotal", this.field4921);
      var1.method102("XpSeed", this.field4923);
      var1.method102("Score", this.method2874());
      this.field4906.method37573(var1);
      this.abilities.method20712(var1);
      var1.put("EnderItems", this.field4903.method3683());
      if (!this.method2969().method134()) {
         var1.put("ShoulderEntityLeft", this.method2969());
      }

      if (!this.method2971().method134()) {
         var1.put("ShoulderEntityRight", this.method2971());
      }
   }

   @Override
   public boolean method2760(Class8654 var1) {
      if (!super.method2760(var1)) {
         if (var1 != Class8654.field38999) {
            if (var1 != Class8654.field39002) {
               return !var1.method31141() ? false : !this.world.method6789().method17135(Class5462.field24251);
            } else {
               return !this.world.method6789().method17135(Class5462.field24250);
            }
         } else {
            return !this.world.method6789().method17135(Class5462.field24249);
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         if (this.abilities.disableDamage && !var1.method31135()) {
            return false;
         } else {
            this.field4973 = 0;
            if (!this.getShouldBeDead()) {
               this.method2949();
               if (var1.method31111()) {
                  if (this.world.method6997() == Difficulty.field14351) {
                     var2 = 0.0F;
                  }

                  if (this.world.method6997() == Difficulty.field14352) {
                     var2 = Math.min(var2 / 2.0F + 1.0F, var2);
                  }

                  if (this.world.method6997() == Difficulty.field14354) {
                     var2 = var2 * 3.0F / 2.0F;
                  }
               }

               return var2 != 0.0F ? super.method2741(var1, var2) : false;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public void method2885(LivingEntity var1) {
      super.method2885(var1);
      if (var1.getHeldItemMainhand().getItem() instanceof Class3265) {
         this.method2901(true);
      }
   }

   public boolean method2742(PlayerEntity var1) {
      Team var4 = this.getTeam();
      Team var5 = var1.getTeam();
      if (var4 != null) {
         return var4.method28592(var5) ? var4.method28578() : true;
      } else {
         return true;
      }
   }

   @Override
   public void method2886(Class8654 var1, float var2) {
      this.inventory.method4053(var1, var2);
   }

   @Override
   public void method2887(float var1) {
      if (this.field5001.getItem() == Items.field38119) {
         if (!this.world.isRemote) {
            this.method2913(Class8876.field40098.method172(this.field5001.getItem()));
         }

         if (var1 >= 3.0F) {
            int var4 = 1 + MathHelper.method37767(var1);
            Hand var5 = this.method3149();
            this.field5001.method32121(var4, this, var1x -> var1x.method3185(var5));
            if (this.field5001.isEmpty()) {
               if (var5 != Hand.MAIN_HAND) {
                  this.method2944(Class2106.field13732, ItemStack.EMPTY);
               } else {
                  this.method2944(Class2106.field13731, ItemStack.EMPTY);
               }

               this.field5001 = ItemStack.EMPTY;
               this.method2863(Sounds.field27036, 0.8F, 0.8F + this.world.rand.nextFloat() * 0.4F);
            }
         }
      }
   }

   @Override
   public void method2888(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         var2 = this.method3071(var1, var2);
         var2 = this.method3072(var1, var2);
         float var5 = Math.max(var2 - this.method2959(), 0.0F);
         this.method2958(this.method2959() - (var2 - var5));
         float var6 = var2 - var5;
         if (var6 > 0.0F && var6 < 3.4028235E37F) {
            this.method2912(Class8876.field40132, Math.round(var6 * 10.0F));
         }

         if (var5 != 0.0F) {
            this.method2931(var1.method31134());
            float var7 = this.getHealth();
            this.method3043(this.getHealth() - var5);
            this.method3073().method27599(var1, var7, var5);
            if (var5 < 3.4028235E37F) {
               this.method2912(Class8876.field40130, Math.round(var5 * 10.0F));
            }
         }
      }
   }

   @Override
   public boolean method2889() {
      return !this.abilities.isFlying && super.method2889();
   }

   public void method2764(Class954 var1) {
   }

   public void method2890(CommandBlockLogic var1) {
   }

   public void method2770(CommandBlockTileEntity var1) {
   }

   public void method2891(Class964 var1) {
   }

   public void method2892(JigsawTileEntity var1) {
   }

   public void method2768(AbstractHorseEntity var1, Class920 var2) {
   }

   public OptionalInt method2766(Class949 var1) {
      return OptionalInt.empty();
   }

   public void method2767(int var1, Class46 var2, int var3, int var4, boolean var5, boolean var6) {
   }

   public void method2769(ItemStack var1, Hand var2) {
   }

   public ActionResultType interactOn(Entity var1, Hand var2) {
      if (!this.isSpectator()) {
         ItemStack var5 = this.getHeldItem(var2);
         ItemStack var6 = var5.copy();
         ActionResultType var7 = var1.method3304(this, var2);
         if (!var7.isSuccessOrConsume()) {
            if (!var5.isEmpty() && var1 instanceof LivingEntity) {
               if (this.abilities.isCreativeMode) {
                  var5 = var6;
               }

               ActionResultType var8 = var5.method32125(this, (LivingEntity)var1, var2);
               if (var8.isSuccessOrConsume()) {
                  if (var5.isEmpty() && !this.abilities.isCreativeMode) {
                     this.method3095(var2, ItemStack.EMPTY);
                  }

                  return var8;
               }
            }

            return ActionResultType.field14820;
         } else {
            if (this.abilities.isCreativeMode && var5 == this.getHeldItem(var2) && var5.getCount() < var6.getCount()) {
               var5.method32180(var6.getCount());
            }

            return var7;
         }
      } else {
         if (var1 instanceof Class949) {
            this.method2766((Class949)var1);
         }

         return ActionResultType.field14820;
      }
   }

   @Override
   public double method2894() {
      return -0.35;
   }

   @Override
   public void method2895() {
      super.method2895();
      this.rideCooldown = 0;
   }

   @Override
   public boolean method2896() {
      return super.method2896() || this.isSleeping();
   }

   @Override
   public boolean method2897() {
      return !this.abilities.isFlying;
   }

   @Override
   public Vector3d method2898(Vector3d var1, Class2107 var2) {
      SafeWalkEvent event = new SafeWalkEvent(true);
      Client.getInstance().getEventManager().call(event);
      if (event.method13965() == Class1893.field11098
         || !this.abilities.isFlying && (var2 == Class2107.field13742 || var2 == Class2107.field13743) && this.method2853() && this.method2899()) {
         double var6 = var1.x;
         double var8 = var1.z;
         double var10 = 0.05;

         while (var6 != 0.0 && this.world.method7053(this, this.getBoundingBox().method19667(var6, (double)(-this.stepHeight), 0.0))) {
            if (var6 < 0.05 && var6 >= -0.05) {
               var6 = 0.0;
            } else if (!(var6 > 0.0)) {
               var6 += 0.05;
            } else {
               var6 -= 0.05;
            }
         }

         while (var8 != 0.0 && this.world.method7053(this, this.getBoundingBox().method19667(0.0, (double)(-this.stepHeight), var8))) {
            if (var8 < 0.05 && var8 >= -0.05) {
               var8 = 0.0;
            } else if (!(var8 > 0.0)) {
               var8 += 0.05;
            } else {
               var8 -= 0.05;
            }
         }

         while (var6 != 0.0 && var8 != 0.0 && this.world.method7053(this, this.getBoundingBox().method19667(var6, (double)(-this.stepHeight), var8))) {
            if (var6 < 0.05 && var6 >= -0.05) {
               var6 = 0.0;
            } else if (!(var6 > 0.0)) {
               var6 += 0.05;
            } else {
               var6 -= 0.05;
            }

            if (var8 < 0.05 && var8 >= -0.05) {
               var8 = 0.0;
            } else if (!(var8 > 0.0)) {
               var8 += 0.05;
            } else {
               var8 -= 0.05;
            }
         }

         var1 = new Vector3d(var6, var1.y, var8);
      }

      SafeWalkEvent var12 = new SafeWalkEvent(false);
      Client.getInstance().getEventManager().call(var12);
      return var1;
   }

   private boolean method2899() {
      return this.onGround
         || this.fallDistance < this.stepHeight
            && !this.world.method7053(this, this.getBoundingBox().method19667(0.0, (double)(this.fallDistance - this.stepHeight), 0.0));
   }

   public void method2817(Entity var1) {
      if (var1.method3360() && !var1.method3361(this)) {
         float var4 = (float)this.method3086(Attributes.field42110);
         float var5;
         if (!(var1 instanceof LivingEntity)) {
            var5 = Class7858.method26318(this.getHeldItemMainhand(), Class7809.field33505);
         } else {
            var5 = Class7858.method26318(this.getHeldItemMainhand(), ((LivingEntity)var1).method3089());
         }

         float var6 = this.method2974(0.5F);
         var4 *= 0.2F + var6 * var6 * 0.8F;
         var5 *= var6;
         this.resetCooldown();
         if (var4 > 0.0F || var5 > 0.0F) {
            boolean var7 = var6 > 0.9F;
            boolean var8 = false;
            int var9 = 0;
            var9 += Class7858.method26323(this);
            if (this.method3337() && var7) {
               this.world
                  .method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), Sounds.field26952, this.method2864(), 1.0F, 1.0F);
               var9++;
               var8 = true;
            }

            boolean var10 = var7
               && this.fallDistance > 0.0F
               && !this.onGround
               && !this.method3063()
               && !this.method3250()
               && !this.method3033(Effects.BLINDNESS)
               && !this.isPassenger()
               && var1 instanceof LivingEntity;
            var10 = var10 && !this.method3337();
            if (var10) {
               var4 *= 1.5F;
            }

            var4 += var5;
            boolean var11 = false;
            double var12 = (double)(this.distanceWalkedModified - this.prevDistanceWalkedModified);
            if (var7 && !var10 && !var8 && this.onGround && var12 < (double)this.method2918()) {
               ItemStack var14 = this.getHeldItem(Hand.MAIN_HAND);
               if (var14.getItem() instanceof ItemSword) {
                  var11 = true;
               }
            }

            float var28 = 0.0F;
            boolean var15 = false;
            int var16 = Class7858.method26324(this);
            if (var1 instanceof LivingEntity) {
               var28 = ((LivingEntity)var1).getHealth();
               if (var16 > 0 && !var1.method3327()) {
                  var15 = true;
                  var1.method3221(1);
               }
            }

            Vector3d var17 = var1.method3433();
            boolean var18 = var1.method2741(Class8654.method31117(this), var4);
            if (!var18) {
               this.world
                  .method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), Sounds.field26953, this.method2864(), 1.0F, 1.0F);
               if (var15) {
                  var1.method3223();
               }
            } else {
               if (var9 > 0) {
                  if (!(var1 instanceof LivingEntity)) {
                     var1.method3280(
                        (double)(-MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0)) * (float)var9 * 0.5F),
                        0.1,
                        (double)(MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0)) * (float)var9 * 0.5F)
                     );
                  } else {
                     ((LivingEntity)var1)
                        .method3058(
                           (float)var9 * 0.5F,
                           (double) MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0)),
                           (double)(-MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0)))
                        );
                  }

                  this.method3434(this.method3433().method11347(0.6, 1.0, 0.6));
                  this.setSprinting(false);
               }

               if (var11) {
                  float var19 = 1.0F + Class7858.method26319(this) * var4;

                  for (LivingEntity var21 : this.world.<LivingEntity>method7182(LivingEntity.class, var1.getBoundingBox().method19663(1.0, 0.25, 1.0))) {
                     if (var21 != this
                        && var21 != var1
                        && !this.method3345(var21)
                        && (!(var21 instanceof ArmorStandEntity) || !((ArmorStandEntity)var21).method4203())
                        && this.getDistanceSq(var21) < 9.0) {
                        var21.method3058(
                           0.4F,
                           (double) MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0)),
                           (double)(-MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0)))
                        );
                        var21.method2741(Class8654.method31117(this), var19);
                     }
                  }

                  this.world
                     .method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), Sounds.field26955, this.method2864(), 1.0F, 1.0F);
                  this.method2902();
               }

               if (var1 instanceof ServerPlayerEntity && var1.velocityChanged) {
                  ((ServerPlayerEntity)var1).field4855.sendPacket(new SEntityVelocityPacket(var1));
                  var1.velocityChanged = false;
                  var1.method3434(var17);
               }

               if (var10) {
                  this.world
                     .method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), Sounds.field26951, this.method2864(), 1.0F, 1.0F);
                  this.method2795(var1);
               }

               if (!var10 && !var11) {
                  if (!var7) {
                     this.world
                        .method6743(
                           (PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), Sounds.field26956, this.method2864(), 1.0F, 1.0F
                        );
                  } else {
                     this.world
                        .method6743(
                           (PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), Sounds.field26954, this.method2864(), 1.0F, 1.0F
                        );
                  }
               }

               if (var5 > 0.0F) {
                  this.method2796(var1);
               }

               this.method3020(var1);
               if (var1 instanceof LivingEntity) {
                  Class7858.method26320((LivingEntity)var1, this);
               }

               Class7858.method26321(this, var1);
               ItemStack var29 = this.getHeldItemMainhand();
               Object var30 = var1;
               if (var1 instanceof Class908) {
                  var30 = ((Class908)var1).field5186;
               }

               if (!this.world.isRemote && !var29.isEmpty() && var30 instanceof LivingEntity) {
                  var29.method32122((LivingEntity)var30, this);
                  if (var29.isEmpty()) {
                     this.method3095(Hand.MAIN_HAND, ItemStack.EMPTY);
                  }
               }

               if (var1 instanceof LivingEntity) {
                  float var31 = var28 - ((LivingEntity)var1).getHealth();
                  this.method2912(Class8876.field40127, Math.round(var31 * 10.0F));
                  if (var16 > 0) {
                     var1.method3221(var16 * 4);
                  }

                  if (this.world instanceof ServerWorld && var31 > 2.0F) {
                     int var22 = (int)((double)var31 * 0.5);
                     ((ServerWorld)this.world)
                        .method6939(ParticleTypes.field34055, var1.getPosX(), var1.method3440(0.5), var1.getPosZ(), var22, 0.1, 0.0, 0.1, 0.2);
                  }
               }

               this.method2931(0.1F);
            }
         }
      }
   }

   @Override
   public void method2900(LivingEntity var1) {
      this.method2817(var1);
   }

   public void method2901(boolean var1) {
      float var4 = 0.25F + (float)Class7858.method26327(this) * 0.05F;
      if (var1) {
         var4 += 0.75F;
      }

      if (this.rand.nextFloat() < var4) {
         this.method2976().method19638(Items.field38119, 100);
         this.method3162();
         this.world.method6786(this, (byte)30);
      }
   }

   public void method2795(Entity var1) {
   }

   public void method2796(Entity var1) {
   }

   public void method2902() {
      double var3 = (double)(-MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0)));
      double var5 = (double) MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0));
      if (this.world instanceof ServerWorld) {
         ((ServerWorld)this.world)
            .method6939(ParticleTypes.field34096, this.getPosX() + var3, this.method3440(0.5), this.getPosZ() + var5, 0, var3, 0.0, var5, 0.0);
      }
   }

   public void respawnPlayer() {
   }

   @Override
   public void method2904() {
      super.method2904();
      this.field4904.method18113(this);
      if (this.field4905 != null) {
         this.field4905.method18113(this);
      }
   }

   public boolean method2905() {
      return false;
   }

   public GameProfile getGameProfile() {
      return this.field4926;
   }

   public Either<Class2104, Class2341> method2752(BlockPos var1) {
      this.method2753(var1);
      this.field4917 = 0;
      return Either.right(Class2341.field16010);
   }

   public void stopSleepInBed(boolean var1, boolean var2) {
      super.method2907();
      if (this.world instanceof ServerWorld && var2) {
         ((ServerWorld)this.world).method6902();
      }

      this.field4917 = !var1 ? 100 : 0;
   }

   @Override
   public void method2907() {
      this.stopSleepInBed(true, true);
   }

   public static Optional<Vector3d> method2908(ServerWorld var0, BlockPos var1, float var2, boolean var3, boolean var4) {
      BlockState var7 = var0.getBlockState(var1);
      Block var8 = var7.getBlock();
      if (var8 instanceof Class3389 && var7.<Integer>method23463(Class3389.field19000) > 0 && Class3389.method11988(var0)) {
         Optional var11 = Class3389.method11991(EntityType.PLAYER, var0, var1);
         if (!var4 && var11.isPresent()) {
            var0.setBlockState(var1, var7.method23465(Class3389.field19000, Integer.valueOf(var7.<Integer>method23463(Class3389.field19000) - 1)), 3);
         }

         return var11;
      } else if (var8 instanceof Class3250 && Class3250.method11679(var0)) {
         return Class3250.method11686(EntityType.PLAYER, var0, var1, var2);
      } else if (!var3) {
         return Optional.<Vector3d>empty();
      } else {
         boolean var9 = var8.method11564();
         boolean var10 = var0.getBlockState(var1.up()).getBlock().method11564();
         return var9 && var10
            ? Optional.<Vector3d>of(new Vector3d((double)var1.getX() + 0.5, (double)var1.getY() + 0.1, (double)var1.getZ() + 0.5))
            : Optional.<Vector3d>empty();
      }
   }

   public boolean method2909() {
      return this.isSleeping() && this.field4917 >= 100;
   }

   public int method2910() {
      return this.field4917;
   }

   public void sendStatusMessage(ITextComponent var1, boolean var2) {
   }

   public void method2911(ResourceLocation var1) {
      this.method2913(Class8876.field40104.method172(var1));
   }

   public void method2912(ResourceLocation var1, int var2) {
      this.method2776(Class8876.field40104.method172(var1), var2);
   }

   public void method2913(Class9007<?> var1) {
      this.method2776(var1, 1);
   }

   public void method2776(Class9007<?> var1, int var2) {
   }

   public void method2777(Class9007<?> var1) {
   }

   public int method2778(Collection<IRecipe<?>> var1) {
      return 0;
   }

   public void method2779(ResourceLocation[] var1) {
   }

   public int method2780(Collection<IRecipe<?>> var1) {
      return 0;
   }

   @Override
   public void method2914() {
      super.method2914();
      this.method2911(Class8876.field40125);
      if (!this.method3337()) {
         this.method2931(0.05F);
      } else {
         this.method2931(0.2F);
      }
   }

   @Override
   public void method2915(Vector3d var1) {
      double var4 = this.getPosX();
      double var6 = this.getPosY();
      double var8 = this.getPosZ();
      if (this.method2951() && !this.isPassenger()) {
         double var10 = this.method3320().y;
         double var12 = !(var10 < -0.2) ? 0.06 : 0.085;
         if (var10 <= 0.0
            || this.field4981
            || !this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() + 1.0 - 0.1, this.getPosZ())).method23449().method23474()) {
            Vector3d var14 = this.method3433();
            this.method3434(var14.method11339(0.0, (var10 - var14.y) * var12, 0.0));
         }
      }

      if (this.abilities.isFlying && !this.isPassenger()) {
         double var17 = this.method3433().y;
         float var15 = this.field4969;
         this.field4969 = this.abilities.getFlySpeed() * (float)(!this.method3337() ? 1 : 2);
         super.method2915(var1);
         Vector3d var16 = this.method3433();
         this.method3435(var16.x, var17 * 0.6, var16.z);
         this.field4969 = var15;
         this.fallDistance = 0.0F;
         this.method3349(7, false);
      } else {
         super.method2915(var1);
      }

      this.method2919(this.getPosX() - var4, this.getPosY() - var6, this.getPosZ() - var8);
   }

   @Override
   public void method2916() {
      if (!this.abilities.isFlying) {
         super.method2916();
      } else {
         this.method3339(false);
      }
   }

   public boolean method2917(BlockPos var1) {
      return !this.world.getBlockState(var1).method23437(this.world, var1);
   }

   @Override
   public float method2918() {
      return (float)this.method3086(Attributes.MOVEMENT_SPEED);
   }

   public void method2919(double var1, double var3, double var5) {
      if (!this.isPassenger()) {
         if (!this.method2951()) {
            if (!this.method3263(Class8953.field40469)) {
               if (!this.method3250()) {
                  if (!this.method3063()) {
                     if (!this.onGround) {
                        if (!this.method3165()) {
                           int var9 = Math.round(MathHelper.method37766(var1 * var1 + var5 * var5) * 100.0F);
                           if (var9 > 25) {
                              this.method2912(Class8876.field40116, var9);
                           }
                        } else {
                           int var10 = Math.round(MathHelper.method37766(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
                           this.method2912(Class8876.field40122, var10);
                        }
                     } else {
                        int var11 = Math.round(MathHelper.method37766(var1 * var1 + var5 * var5) * 100.0F);
                        if (var11 > 0) {
                           if (!this.method3337()) {
                              if (!this.method3336()) {
                                 this.method2912(Class8876.field40110, var11);
                                 this.method2931(0.0F * (float)var11 * 0.01F);
                              } else {
                                 this.method2912(Class8876.field40111, var11);
                                 this.method2931(0.0F * (float)var11 * 0.01F);
                              }
                           } else {
                              this.method2912(Class8876.field40112, var11);
                              this.method2931(0.1F * (float)var11 * 0.01F);
                           }
                        }
                     }
                  } else if (var3 > 0.0) {
                     this.method2912(Class8876.field40115, (int)Math.round(var3 * 100.0));
                  }
               } else {
                  int var12 = Math.round(MathHelper.method37766(var1 * var1 + var5 * var5) * 100.0F);
                  if (var12 > 0) {
                     this.method2912(Class8876.field40113, var12);
                     this.method2931(0.01F * (float)var12 * 0.01F);
                  }
               }
            } else {
               int var13 = Math.round(MathHelper.method37766(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
               if (var13 > 0) {
                  this.method2912(Class8876.field40117, var13);
                  this.method2931(0.01F * (float)var13 * 0.01F);
               }
            }
         } else {
            int var14 = Math.round(MathHelper.method37766(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if (var14 > 0) {
               this.method2912(Class8876.field40123, var14);
               this.method2931(0.01F * (float)var14 * 0.01F);
            }
         }
      }
   }

   private void method2920(double var1, double var3, double var5) {
      if (this.isPassenger()) {
         int var9 = Math.round(MathHelper.method37766(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         if (var9 > 0) {
            Entity var10 = this.getRidingEntity();
            if (!(var10 instanceof AbstractMinecartEntity)) {
               if (!(var10 instanceof BoatEntity)) {
                  if (!(var10 instanceof Class1072)) {
                     if (!(var10 instanceof AbstractHorseEntity)) {
                        if (var10 instanceof Class1070) {
                           this.method2912(Class8876.field40124, var9);
                        }
                     } else {
                        this.method2912(Class8876.field40121, var9);
                     }
                  } else {
                     this.method2912(Class8876.field40120, var9);
                  }
               } else {
                  this.method2912(Class8876.field40119, var9);
               }
            } else {
               this.method2912(Class8876.field40118, var9);
            }
         }
      }
   }

   @Override
   public boolean method2921(float var1, float var2) {
      if (!this.abilities.allowFlying) {
         if (var1 >= 2.0F) {
            this.method2912(Class8876.field40114, (int)Math.round((double)var1 * 100.0));
         }

         return super.method2921(var1, var2);
      } else {
         return false;
      }
   }

   public boolean tryToStartFallFlying() {
      if (!this.onGround && !this.method3165() && !this.method3250() && !this.method3033(Effects.LEVITATION)) {
         ItemStack var3 = this.method2943(Class2106.field13735);
         if (var3.getItem() == Items.field38120 && Class3256.method11698(var3)) {
            this.method2923();
            return true;
         }
      }

      return false;
   }

   public void method2923() {
      this.method3349(7, true);
   }

   public void stopFallFlying() {
      this.method3349(7, true);
      this.method3349(7, false);
   }

   @Override
   public void method2925() {
      if (!this.isSpectator()) {
         super.method2925();
      }
   }

   @Override
   public SoundEvent method2926(int var1) {
      return var1 <= 4 ? Sounds.field26966 : Sounds.field26957;
   }

   @Override
   public void method2927(ServerWorld var1, LivingEntity var2) {
      this.method2913(Class8876.field40102.method172(var2.getType()));
   }

   @Override
   public void method2928(BlockState var1, Vector3d var2) {
      if (!this.abilities.isFlying) {
         super.method2928(var1, var2);
      }
   }

   public void method2781(int var1) {
      this.method2876(var1);
      this.field4922 = this.field4922 + (float)var1 / (float)this.method2930();
      this.field4921 = MathHelper.method37775(this.field4921 + var1, 0, Integer.MAX_VALUE);

      while (this.field4922 < 0.0F) {
         float var4 = this.field4922 * (float)this.method2930();
         if (this.field4920 <= 0) {
            this.method2727(-1);
            this.field4922 = 0.0F;
         } else {
            this.method2727(-1);
            this.field4922 = 1.0F + var4 / (float)this.method2930();
         }
      }

      while (this.field4922 >= 1.0F) {
         this.field4922 = (this.field4922 - 1.0F) * (float)this.method2930();
         this.method2727(1);
         this.field4922 = this.field4922 / (float)this.method2930();
      }
   }

   public int method2929() {
      return this.field4923;
   }

   public void method2728(ItemStack var1, int var2) {
      this.field4920 -= var2;
      if (this.field4920 < 0) {
         this.field4920 = 0;
         this.field4922 = 0.0F;
         this.field4921 = 0;
      }

      this.field4923 = this.rand.nextInt();
   }

   public void method2727(int var1) {
      this.field4920 += var1;
      if (this.field4920 < 0) {
         this.field4920 = 0;
         this.field4922 = 0.0F;
         this.field4921 = 0;
      }

      if (var1 > 0 && this.field4920 % 5 == 0 && (float)this.field4925 < (float)this.ticksExisted - 100.0F) {
         float var4 = this.field4920 <= 30 ? (float)this.field4920 / 30.0F : 1.0F;
         this.world
            .method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), Sounds.field26965, this.method2864(), var4 * 0.75F, 1.0F);
         this.field4925 = this.ticksExisted;
      }
   }

   public int method2930() {
      if (this.field4920 < 30) {
         return this.field4920 < 15 ? 7 + this.field4920 * 2 : 37 + (this.field4920 - 15) * 5;
      } else {
         return 112 + (this.field4920 - 30) * 9;
      }
   }

   public void method2931(float var1) {
      if (!this.abilities.disableDamage && !this.world.isRemote) {
         this.field4906.method37576(var1);
      }
   }

   public Class9640 method2932() {
      return this.field4906;
   }

   public boolean method2933(boolean var1) {
      return this.abilities.disableDamage || var1 || this.field4906.method37575();
   }

   public boolean method2934() {
      return this.getHealth() > 0.0F && this.getHealth() < this.method3075();
   }

   public boolean method2935() {
      return this.abilities.allowEdit;
   }

   public boolean method2936(BlockPos var1, Direction var2, ItemStack var3) {
      if (!this.abilities.allowEdit) {
         BlockPos var6 = var1.method8349(var2.method536());
         Class9632 var7 = new Class9632(this.world, var6, false);
         return var3.method32176(this.world.method6817(), var7);
      } else {
         return true;
      }
   }

   @Override
   public int method2937(PlayerEntity var1) {
      if (!this.world.method6789().method17135(Class5462.field24225) && !this.isSpectator()) {
         int var4 = this.field4920 * 7;
         return var4 <= 100 ? var4 : 100;
      } else {
         return 0;
      }
   }

   @Override
   public boolean method2938() {
      return true;
   }

   @Override
   public boolean method2939() {
      return true;
   }

   @Override
   public boolean method2940() {
      return !this.abilities.isFlying && (!this.onGround || !this.method3334());
   }

   public void method2797() {
   }

   public void method2799(Class1894 var1) {
   }

   @Override
   public ITextComponent getName() {
      return new StringTextComponent(this.field4926.getName());
   }

   public Class980 method2942() {
      return this.field4903;
   }

   @Override
   public ItemStack method2943(Class2106 var1) {
      if (var1 != Class2106.field13731) {
         if (var1 != Class2106.field13732) {
            return var1.method8772() != Class1969.field12837 ? ItemStack.EMPTY : this.inventory.field5440.get(var1.method8773());
         } else {
            return this.inventory.field5441.get(0);
         }
      } else {
         return this.inventory.method4028();
      }
   }

   @Override
   public void method2944(Class2106 var1, ItemStack var2) {
      if (var1 != Class2106.field13731) {
         if (var1 != Class2106.field13732) {
            if (var1.method8772() == Class1969.field12837) {
               this.method3023(var2);
               this.inventory.field5440.set(var1.method8773(), var2);
            }
         } else {
            this.method3023(var2);
            this.inventory.field5441.set(0, var2);
         }
      } else {
         this.method3023(var2);
         this.inventory.field5439.set(this.inventory.currentItem, var2);
      }
   }

   public boolean method2945(ItemStack var1) {
      this.method3023(var1);
      return this.inventory.method4045(var1);
   }

   @Override
   public Iterable<ItemStack> method2946() {
      return Lists.newArrayList(new ItemStack[]{this.getHeldItemMainhand(), this.method3091()});
   }

   @Override
   public Iterable<ItemStack> method2947() {
      return this.inventory.field5440;
   }

   public boolean method2948(CompoundNBT var1) {
      if (this.isPassenger() || !this.onGround || this.method3250()) {
         return false;
      } else if (this.method2969().method134()) {
         this.method2970(var1);
         this.field4901 = this.world.method6783();
         return true;
      } else if (!this.method2971().method134()) {
         return false;
      } else {
         this.method2972(var1);
         this.field4901 = this.world.method6783();
         return true;
      }
   }

   public void method2949() {
      if (this.field4901 + 20L < this.world.method6783()) {
         this.method2950(this.method2969());
         this.method2970(new CompoundNBT());
         this.method2950(this.method2971());
         this.method2972(new CompoundNBT());
      }
   }

   private void method2950(CompoundNBT var1) {
      if (!this.world.isRemote && !var1.method134()) {
         EntityType.method33217(var1, this.world).ifPresent(var1x -> {
            if (var1x instanceof Class1013) {
               ((Class1013)var1x).method4398(this.entityUniqueID);
            }

            var1x.setPosition(this.getPosX(), this.getPosY() + 0.7F, this.getPosZ());
            ((ServerWorld)this.world).method6917(var1x);
         });
      }
   }

   @Override
   public abstract boolean isSpectator();

   @Override
   public boolean method2951() {
      return !this.abilities.isFlying && !this.isSpectator() && super.method2951();
   }

   public abstract boolean isCreative();

   @Override
   public boolean method2952() {
      return !this.abilities.isFlying;
   }

   public Class6886 method2953() {
      return this.world.method6805();
   }

   @Override
   public ITextComponent getDisplayName() {
      IFormattableTextComponent var3 = Class8218.method28577(this.getTeam(), this.getName());
      return this.method2955(var3);
   }

   private IFormattableTextComponent method2955(IFormattableTextComponent var1) {
      String var4 = this.getGameProfile().getName();
      return var1.modifyStyle(
         var2 -> var2.setClickEvent(new ClickEvent(ClickEvent$Action.SUGGEST_COMMAND, "/tell " + var4 + " "))
               .setHoverEvent(this.method3388())
               .setInsertion(var4)
      );
   }

   @Override
   public String method2956() {
      return this.getGameProfile().getName();
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      switch (Class9138.field41992[var1.ordinal()]) {
         case 1:
         case 2:
         case 3:
            return 0.4F;
         case 4:
            return 1.27F;
         default:
            return 1.62F;
      }
   }

   @Override
   public void method2958(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.method3210().method35446(field4895, var1);
   }

   @Override
   public float method2959() {
      return this.method3210().<Float>method35445(field4895);
   }

   public static UUID method2960(GameProfile var0) {
      UUID var3 = var0.getId();
      if (var3 == null) {
         var3 = method2961(var0.getName());
      }

      return var3;
   }

   public static UUID method2961(String var0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8));
   }

   public boolean method2962(Class2318 var1) {
      return (this.method3210().<Byte>method35445(field4897) & var1.method9090()) == var1.method9090();
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      if (var1 >= 0 && var1 < this.inventory.field5439.size()) {
         this.inventory.method3621(var1, var2);
         return true;
      } else {
         Class2106 var5;
         if (var1 != 100 + Class2106.field13736.method8773()) {
            if (var1 != 100 + Class2106.field13735.method8773()) {
               if (var1 != 100 + Class2106.field13734.method8773()) {
                  if (var1 != 100 + Class2106.field13733.method8773()) {
                     var5 = null;
                  } else {
                     var5 = Class2106.field13733;
                  }
               } else {
                  var5 = Class2106.field13734;
               }
            } else {
               var5 = Class2106.field13735;
            }
         } else {
            var5 = Class2106.field13736;
         }

         if (var1 == 98) {
            this.method2944(Class2106.field13731, var2);
            return true;
         } else if (var1 != 99) {
            if (var5 == null) {
               int var6 = var1 - 200;
               if (var6 >= 0 && var6 < this.field4903.method3629()) {
                  this.field4903.method3621(var6, var2);
                  return true;
               } else {
                  return false;
               }
            } else {
               if (!var2.isEmpty()) {
                  if (!(var2.getItem() instanceof Class3279) && !(var2.getItem() instanceof Class3256)) {
                     if (var5 != Class2106.field13736) {
                        return false;
                     }
                  } else if (Class1006.method4271(var2) != var5) {
                     return false;
                  }
               }

               this.inventory.method3621(var5.method8773() + this.inventory.field5439.size(), var2);
               return true;
            }
         } else {
            this.method2944(Class2106.field13732, var2);
            return true;
         }
      }
   }

   public boolean hasReducedDebug() {
      return this.field4927;
   }

   public void method2965(boolean var1) {
      this.field4927 = var1;
   }

   @Override
   public void method2966(int var1) {
      super.method2966(!this.abilities.disableDamage ? var1 : Math.min(var1, 1));
   }

   @Override
   public HandSide method2967() {
      return this.dataManager.<Byte>method35445(field4898) != 0 ? HandSide.field14418 : HandSide.field14417;
   }

   public void method2968(HandSide var1) {
      this.dataManager.method35446(field4898, (byte)(var1 != HandSide.field14417 ? 1 : 0));
   }

   public CompoundNBT method2969() {
      return this.dataManager.<CompoundNBT>method35445(field4899);
   }

   public void method2970(CompoundNBT var1) {
      this.dataManager.method35446(field4899, var1);
   }

   public CompoundNBT method2971() {
      return this.dataManager.<CompoundNBT>method35445(field4900);
   }

   public void method2972(CompoundNBT var1) {
      this.dataManager.method35446(field4900, var1);
   }

   public float method2973() {
      return (float)(1.0 / this.method3086(Attributes.ATTACK_SPEED) * 20.0);
   }

   public float method2974(float var1) {
      return MathHelper.clamp(((float)this.field4958 + var1) / this.method2973(), 0.0F, 1.0F);
   }

   public void resetCooldown() {
      this.field4958 = 0;
   }

   public Class6462 method2976() {
      return this.field4929;
   }

   @Override
   public float method2977() {
      return !this.abilities.isFlying && !this.method3165() ? super.method2977() : 1.0F;
   }

   public float method2978() {
      return (float)this.method3086(Attributes.LUCK);
   }

   public boolean method2979() {
      return this.abilities.isCreativeMode && this.method2807() >= 2;
   }

   @Override
   public boolean method2980(ItemStack var1) {
      Class2106 var4 = Class1006.method4271(var1);
      return this.method2943(var4).isEmpty();
   }

   @Override
   public EntitySize method2981(Pose var1) {
      return field4894.getOrDefault(var1, field4893);
   }

   @Override
   public ImmutableList<Pose> method2982() {
      return ImmutableList.of(Pose.STANDING, Pose.field13624, Pose.field13622);
   }

   @Override
   public ItemStack method2983(ItemStack var1) {
      if (!(var1.getItem() instanceof Class3262)) {
         return ItemStack.EMPTY;
      } else {
         Predicate var4 = ((Class3262)var1.getItem()).method11751();
         ItemStack var5 = Class3262.method11774(this, var4);
         if (!var5.isEmpty()) {
            return var5;
         } else {
            var4 = ((Class3262)var1.getItem()).method11752();

            for (int var6 = 0; var6 < this.inventory.method3629(); var6++) {
               ItemStack var7 = this.inventory.method3618(var6);
               if (var4.test(var7)) {
                  return var7;
               }
            }

            return !this.abilities.isCreativeMode ? ItemStack.EMPTY : new ItemStack(Items.field37797);
         }
      }
   }

   @Override
   public ItemStack method2984(World var1, ItemStack var2) {
      this.method2932().method37570(var2.getItem(), var2);
      this.method2913(Class8876.field40098.method172(var2.getItem()));
      var1.method6743(
         (PlayerEntity)null,
         this.getPosX(),
         this.getPosY(),
         this.getPosZ(),
         Sounds.field26959,
         Class2266.field14735,
         0.5F,
         var1.rand.nextFloat() * 0.1F + 0.9F
      );
      if (this instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44490.method15174((ServerPlayerEntity)this, var2);
      }

      return super.method2984(var1, var2);
   }

   @Override
   public boolean method2985(BlockState var1) {
      return this.abilities.isFlying || super.method2985(var1);
   }

   @Override
   public Vector3d method2986(float var1) {
      double var4 = 0.22 * (this.method2967() != HandSide.field14418 ? 1.0 : -1.0);
      float var6 = MathHelper.lerp(var1 * 0.5F, this.rotationPitch, this.prevRotationPitch) * (float) (Math.PI / 180.0);
      float var7 = MathHelper.lerp(var1, this.field4966, this.field4965) * (float) (Math.PI / 180.0);
      if (this.method3165() || this.method3130()) {
         Vector3d var8 = this.method3281(var1);
         Vector3d var9 = this.method3433();
         double var21 = Entity.method3234(var9);
         double var12 = Entity.method3234(var8);
         float var14;
         if (var21 > 0.0 && var12 > 0.0) {
            double var17 = (var9.x * var8.x + var9.z * var8.z) / Math.sqrt(var21 * var12);
            double var19 = var9.x * var8.z - var9.z * var8.x;
            var14 = (float)(Math.signum(var19) * Math.acos(var17));
         } else {
            var14 = 0.0F;
         }

         return this.method3288(var1).method11338(new Vector3d(var4, -0.11, 0.85).method11352(-var14).method11350(-var6).method11351(-var7));
      } else if (!this.method3166()) {
         double var15 = this.getBoundingBox().method19677() - 1.0;
         double var10 = !this.method3336() ? 0.07 : -0.2;
         return this.method3288(var1).method11338(new Vector3d(var4, var15, var10).method11351(-var7));
      } else {
         return this.method3288(var1).method11338(new Vector3d(var4, 0.2, -0.15).method11350(-var6).method11351(-var7));
      }
   }
}
