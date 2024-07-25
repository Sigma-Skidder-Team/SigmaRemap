package remapped;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class class_4109 extends class_5467 implements class_8129, class_9766, class_9378 {
   private static final Predicate<LivingEntity> field_20016 = var0 -> var0 instanceof class_4109 && ((class_4109)var0).method_19044();
   private static final class_4931 field_20015 = new class_4931().method_22607(16.0).method_22603().method_22601().method_22602().method_22606(field_20016);
   private static final class_8137 field_20029 = class_8137.method_37019(
      class_4897.field_24813,
      class_4897.field_24344,
      class_4783.field_23429.method_10803(),
      class_4897.field_24753,
      class_4897.field_25070,
      class_4897.field_25037,
      class_4897.field_24966
   );
   private static final class_7821<Byte> field_20020 = class_8073.<Byte>method_36641(class_4109.class, class_2734.field_13361);
   private static final class_7821<Optional<UUID>> field_20030 = class_8073.<Optional<UUID>>method_36641(class_4109.class, class_2734.field_13348);
   private int field_20024;
   private int field_20011;
   private int field_20026;
   public int field_20009;
   public int field_20013;
   public boolean field_20025;
   public class_4657 field_20021;
   public int field_20012;
   public float field_20019;
   private boolean field_20014;
   private float field_20008;
   private float field_20017;
   private float field_20018;
   private float field_20010;
   private float field_20027;
   private float field_20022;
   public boolean field_20028 = true;
   public int field_20023;

   public class_4109(EntityType<? extends class_4109> var1, World var2) {
      super(var1, var2);
      this.field_41733 = 1.0F;
      this.method_19072();
   }

   @Override
   public void registerGoals() {
      this.goalSelector.addGoal(1, new class_518(this, 1.2));
      this.goalSelector.addGoal(1, new class_9169(this, 1.2));
      this.goalSelector.addGoal(2, new class_9513(this, 1.0, class_4109.class));
      this.goalSelector.addGoal(4, new class_8676(this, 1.0));
      this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 0.7));
      this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0F));
      this.goalSelector.addGoal(8, new class_9691(this));
      this.method_19063();
   }

   public void method_19063() {
      this.goalSelector.addGoal(0, new SwimGoal(this));
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_20020, (byte)0);
      this.field_41735.method_36634(field_20030, Optional.<UUID>empty());
   }

   public boolean method_19089(int var1) {
      return (this.field_41735.<Byte>method_36640(field_20020) & var1) != 0;
   }

   public void method_19077(int var1, boolean var2) {
      byte var5 = this.field_41735.<Byte>method_36640(field_20020);
      if (!var2) {
         this.field_41735.method_36633(field_20020, (byte)(var5 & ~var1));
      } else {
         this.field_41735.method_36633(field_20020, (byte)(var5 | var1));
      }
   }

   public boolean method_19043() {
      return this.method_19089(2);
   }

   @Nullable
   public UUID method_19081() {
      return this.field_41735.<Optional<UUID>>method_36640(field_20030).orElse((UUID)null);
   }

   public void method_19051(UUID var1) {
      this.field_41735.method_36633(field_20030, Optional.<UUID>ofNullable(var1));
   }

   public boolean method_19047() {
      return this.field_20025;
   }

   public void method_19041(boolean var1) {
      this.method_19077(2, var1);
   }

   public void method_19080(boolean var1) {
      this.field_20025 = var1;
   }

   @Override
   public void method_21377(float var1) {
      if (var1 > 6.0F && this.method_19086()) {
         this.method_19054(false);
      }
   }

   public boolean method_19086() {
      return this.method_19089(16);
   }

   public boolean method_19057() {
      return this.method_19089(32);
   }

   public boolean method_19044() {
      return this.method_19089(8);
   }

   public void method_19066(boolean var1) {
      this.method_19077(8, var1);
   }

   @Override
   public boolean method_43356() {
      return this.isAlive() && !this.method_26449() && this.method_19043();
   }

   @Override
   public void method_43358(class_562 var1) {
      this.field_20021.method_31503(0, new ItemStack(class_4897.field_24836));
      if (var1 != null) {
         this.world.method_29540((PlayerEntity)null, this, SoundEvents.field_2063, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public boolean method_43357() {
      return this.method_19089(4);
   }

   public int method_19062() {
      return this.field_20012;
   }

   public void method_19071(int var1) {
      this.field_20012 = var1;
   }

   public int method_19074(int var1) {
      int var4 = MathHelper.clamp(this.method_19062() + var1, 0, this.method_19075());
      this.method_19071(var4);
      return var4;
   }

   @Override
   public boolean method_37177() {
      return !this.method_37151();
   }

   private void method_19049() {
      this.method_19050();
      if (!this.method_37378()) {
         SoundEvent var3 = this.method_19083();
         if (var3 != null) {
            this.world
               .method_29528(
                  (PlayerEntity)null,
                  this.getPosX(),
                  this.method_37309(),
                  this.getPosZ(),
                  var3,
                  this.method_37197(),
                  1.0F,
                  1.0F + (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F
               );
         }
      }
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      if (var1 > 1.0F) {
         this.method_37155(SoundEvents.field_2121, 0.4F, 1.0F);
      }

      int var5 = this.method_26490(var1, var2);
      if (var5 <= 0) {
         return false;
      } else {
         this.attackEntityFrom(DamageSource.field_31684, (float)var5);
         if (this.method_37151()) {
            for (Entity var7 : this.method_37379()) {
               var7.attackEntityFrom(DamageSource.field_31684, (float)var5);
            }
         }

         this.method_26512();
         return true;
      }
   }

   @Override
   public int method_26490(float var1, float var2) {
      return MathHelper.ceil((var1 * 0.5F - 3.0F) * var2);
   }

   public int method_19085() {
      return 2;
   }

   public void method_19072() {
      class_4657 var3 = this.field_20021;
      this.field_20021 = new class_4657(this.method_19085());
      if (var3 != null) {
         var3.method_21543(this);
         int var4 = Math.min(var3.method_31505(), this.field_20021.method_31505());

         for (int var5 = 0; var5 < var4; var5++) {
            ItemStack var6 = var3.method_31498(var5);
            if (!var6.method_28022()) {
               this.field_20021.method_31503(var5, var6.method_27973());
            }
         }
      }

      this.field_20021.method_21548(this);
      this.method_19070();
   }

   public void method_19070() {
      if (!this.world.field_33055) {
         this.method_19077(4, !this.field_20021.method_31498(0).method_28022());
      }
   }

   @Override
   public void method_36982(class_6867 var1) {
      boolean var4 = this.method_43357();
      this.method_19070();
      if (this.field_41697 > 20 && !var4 && this.method_43357()) {
         this.method_37155(SoundEvents.field_2063, 0.5F, 1.0F);
      }
   }

   public double method_19078() {
      return this.method_26575(Attributes.field_37464);
   }

   @Nullable
   public SoundEvent method_19083() {
      return null;
   }

   @Nullable
   @Override
   public SoundEvent method_26599() {
      return null;
   }

   @Nullable
   @Override
   public SoundEvent method_26541(DamageSource var1) {
      if (this.field_41717.nextInt(3) == 0) {
         this.method_19065();
      }

      return null;
   }

   @Nullable
   @Override
   public SoundEvent method_26918() {
      if (this.field_41717.nextInt(10) == 0 && !this.isMovementBlocked()) {
         this.method_19065();
      }

      return null;
   }

   @Nullable
   public SoundEvent method_19056() {
      this.method_19065();
      return null;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      if (!var2.method_8362().method_24494()) {
         class_2522 var5 = this.world.method_28262(var1.method_6081());
         class_4618 var6 = var2.method_8316();
         if (var5.method_8350(class_4783.field_23552)) {
            var6 = var5.method_8316();
         }

         if (this.method_37151() && this.field_20028) {
            this.field_20023++;
            if (this.field_20023 > 5 && this.field_20023 % 3 == 0) {
               this.method_19053(var6);
            } else if (this.field_20023 <= 5) {
               this.method_37155(SoundEvents.field_2285, var6.method_21395() * 0.15F, var6.method_21393());
            }
         } else if (var6 != class_4618.field_22468) {
            this.method_37155(SoundEvents.field_2453, var6.method_21395() * 0.15F, var6.method_21393());
         } else {
            this.method_37155(SoundEvents.field_2285, var6.method_21395() * 0.15F, var6.method_21393());
         }
      }
   }

   public void method_19053(class_4618 var1) {
      this.method_37155(SoundEvents.field_2335, var1.method_21395() * 0.15F, var1.method_21393());
   }

   public static MutableAttribute method_19064() {
      return MobEntity.method_26846()
         .method_5983(Attributes.field_37464)
         .createMutableAttribute(Attributes.MAX_HEALTH, 53.0)
         .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.225F);
   }

   @Override
   public int method_26856() {
      return 6;
   }

   public int method_19075() {
      return 100;
   }

   @Override
   public float method_26439() {
      return 0.8F;
   }

   @Override
   public int method_26850() {
      return 400;
   }

   public void method_19076(PlayerEntity var1) {
      if (!this.world.field_33055 && (!this.method_37151() || this.method_37072(var1)) && this.method_19043()) {
         var1.method_3191(this, this.field_20021);
      }
   }

   public class_6910 method_19079(PlayerEntity var1, ItemStack var2) {
      boolean var5 = this.method_19060(var1, var2);
      if (!var1.playerAbilities.isCreativeMode) {
         var2.method_27970(1);
      }

      if (!this.world.field_33055) {
         return !var5 ? class_6910.field_35521 : class_6910.field_35520;
      } else {
         return class_6910.field_35518;
      }
   }

   public boolean method_19060(PlayerEntity var1, ItemStack var2) {
      boolean var5 = false;
      float var6 = 0.0F;
      short var7 = 0;
      byte var8 = 0;
      class_2451 var9 = var2.method_27960();
      if (var9 != class_4897.field_24813) {
         if (var9 != class_4897.field_24344) {
            if (var9 != class_4783.field_23429.method_10803()) {
               if (var9 != class_4897.field_24753) {
                  if (var9 != class_4897.field_25070) {
                     if (var9 == class_4897.field_25037 || var9 == class_4897.field_24966) {
                        var6 = 10.0F;
                        var7 = 240;
                        var8 = 10;
                        if (!this.world.field_33055 && this.method_19043() && this.method_8634() == 0 && !this.method_24875()) {
                           var5 = true;
                           this.method_24869(var1);
                        }
                     }
                  } else {
                     var6 = 4.0F;
                     var7 = 60;
                     var8 = 5;
                     if (!this.world.field_33055 && this.method_19043() && this.method_8634() == 0 && !this.method_24875()) {
                        var5 = true;
                        this.method_24869(var1);
                     }
                  }
               } else {
                  var6 = 3.0F;
                  var7 = 60;
                  var8 = 3;
               }
            } else {
               var6 = 20.0F;
               var7 = 180;
            }
         } else {
            var6 = 1.0F;
            var7 = 30;
            var8 = 3;
         }
      } else {
         var6 = 2.0F;
         var7 = 20;
         var8 = 3;
      }

      if (this.method_26551() < this.method_26465() && var6 > 0.0F) {
         this.heal(var6);
         var5 = true;
      }

      if (this.method_26449() && var7 > 0) {
         this.world.method_43361(class_3090.field_15361, this.method_37361(1.0), this.method_37255() + 0.5, this.method_37383(1.0), 0.0, 0.0, 0.0);
         if (!this.world.field_33055) {
            this.method_8632(var7);
         }

         var5 = true;
      }

      if (var8 > 0 && (var5 || !this.method_19043()) && this.method_19062() < this.method_19075()) {
         var5 = true;
         if (!this.world.field_33055) {
            this.method_19074(var8);
         }
      }

      if (var5) {
         this.method_19049();
      }

      return var5;
   }

   public void method_19039(PlayerEntity var1) {
      this.method_19054(false);
      this.method_19068(false);
      if (!this.world.field_33055) {
         var1.rotationYaw = this.rotationYaw;
         var1.rotationPitch = this.rotationPitch;
         var1.method_37353(this);
      }
   }

   @Override
   public boolean isMovementBlocked() {
      return super.isMovementBlocked() && this.method_37151() && this.method_43357() || this.method_19086() || this.method_19057();
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      return field_20029.test(var1);
   }

   private void method_19061() {
      this.field_20009 = 1;
   }

   @Override
   public void method_26522() {
      super.method_26522();
      if (this.field_20021 != null) {
         for (int var3 = 0; var3 < this.field_20021.method_31505(); var3++) {
            ItemStack var4 = this.field_20021.method_31498(var3);
            if (!var4.method_28022() && !class_2931.method_13408(var4)) {
               this.method_37310(var4);
            }
         }
      }
   }

   @Override
   public void livingTick() {
      if (this.field_41717.nextInt(200) == 0) {
         this.method_19061();
      }

      super.livingTick();
      if (!this.world.field_33055 && this.isAlive()) {
         if (this.field_41717.nextInt(900) == 0 && this.field_29677 == 0) {
            this.heal(1.0F);
         }

         if (this.method_19042()) {
            if (!this.method_19086()
               && !this.method_37151()
               && this.field_41717.nextInt(300) == 0
               && this.world.method_28262(this.method_37075().method_6100()).method_8350(class_4783.field_23259)) {
               this.method_19054(true);
            }

            if (this.method_19086() && ++this.field_20024 > 50) {
               this.field_20024 = 0;
               this.method_19054(false);
            }
         }

         this.method_19088();
      }
   }

   public void method_19088() {
      if (this.method_19044() && this.method_26449() && !this.method_19086()) {
         LivingEntity var3 = this.world
            .<class_4109>method_25865(
               class_4109.class, field_20015, this, this.getPosX(), this.method_37309(), this.getPosZ(), this.getBoundingBox().grow(16.0)
            );
         if (var3 != null && this.method_37275(var3) > 4.0) {
            this.field_29904.method_5598(var3, 0);
         }
      }
   }

   public boolean method_19042() {
      return true;
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.field_20011 > 0 && ++this.field_20011 > 30) {
         this.field_20011 = 0;
         this.method_19077(64, false);
      }

      if ((this.canPassengerSteer() || this.method_26530()) && this.field_20026 > 0 && ++this.field_20026 > 20) {
         this.field_20026 = 0;
         this.method_19068(false);
      }

      if (this.field_20009 > 0 && ++this.field_20009 > 8) {
         this.field_20009 = 0;
      }

      if (this.field_20013 > 0) {
         this.field_20013++;
         if (this.field_20013 > 300) {
            this.field_20013 = 0;
         }
      }

      this.field_20017 = this.field_20008;
      if (!this.method_19086()) {
         this.field_20008 = this.field_20008 + ((0.0F - this.field_20008) * 0.4F - 0.05F);
         if (this.field_20008 < 0.0F) {
            this.field_20008 = 0.0F;
         }
      } else {
         this.field_20008 = this.field_20008 + (1.0F - this.field_20008) * 0.4F + 0.05F;
         if (this.field_20008 > 1.0F) {
            this.field_20008 = 1.0F;
         }
      }

      this.field_20010 = this.field_20018;
      if (!this.method_19057()) {
         this.field_20014 = false;
         this.field_20018 = this.field_20018 + ((0.8F * this.field_20018 * this.field_20018 * this.field_20018 - this.field_20018) * 0.6F - 0.05F);
         if (this.field_20018 < 0.0F) {
            this.field_20018 = 0.0F;
         }
      } else {
         this.field_20008 = 0.0F;
         this.field_20017 = this.field_20008;
         this.field_20018 = this.field_20018 + (1.0F - this.field_20018) * 0.4F + 0.05F;
         if (this.field_20018 > 1.0F) {
            this.field_20018 = 1.0F;
         }
      }

      this.field_20022 = this.field_20027;
      if (!this.method_19089(64)) {
         this.field_20027 = this.field_20027 + ((0.0F - this.field_20027) * 0.7F - 0.05F);
         if (this.field_20027 < 0.0F) {
            this.field_20027 = 0.0F;
         }
      } else {
         this.field_20027 = this.field_20027 + (1.0F - this.field_20027) * 0.7F + 0.05F;
         if (this.field_20027 > 1.0F) {
            this.field_20027 = 1.0F;
         }
      }
   }

   private void method_19050() {
      if (!this.world.field_33055) {
         this.field_20011 = 1;
         this.method_19077(64, true);
      }
   }

   public void method_19054(boolean var1) {
      this.method_19077(16, var1);
   }

   public void method_19068(boolean var1) {
      if (var1) {
         this.method_19054(false);
      }

      this.method_19077(32, var1);
   }

   private void method_19065() {
      if (this.canPassengerSteer() || this.method_26530()) {
         this.field_20026 = 1;
         this.method_19068(true);
      }
   }

   public void method_19037() {
      if (!this.method_19057()) {
         this.method_19065();
         SoundEvent var3 = this.method_19056();
         if (var3 != null) {
            this.method_37155(var3, this.method_26439(), this.method_26547());
         }
      }
   }

   public boolean method_19038(PlayerEntity var1) {
      this.method_19051(var1.method_37328());
      this.method_19041(true);
      if (var1 instanceof class_9359) {
         class_8807.field_45047.method_36292((class_9359)var1, this);
      }

      this.world.method_29587(this, (byte)7);
      return true;
   }

   @Override
   public void method_26431(class_1343 var1) {
      if (this.isAlive()) {
         if (this.method_37151() && this.canBeSteered() && this.method_43357()) {
            LivingEntity var4 = (LivingEntity)this.getControllingPassenger();
            this.rotationYaw = var4.rotationYaw;
            this.prevRotationYaw = this.rotationYaw;
            this.rotationPitch = var4.rotationPitch * 0.5F;
            this.method_37395(this.rotationYaw, this.rotationPitch);
            this.field_29605 = this.rotationYaw;
            this.field_29618 = this.field_29605;
            float var5 = var4.field_29676 * 0.5F;
            float var6 = var4.field_29673;
            if (var6 <= 0.0F) {
               var6 *= 0.25F;
               this.field_20023 = 0;
            }

            if (this.onGround && this.field_20019 == 0.0F && this.method_19057() && !this.field_20014) {
               var5 = 0.0F;
               var6 = 0.0F;
            }

            if (this.field_20019 > 0.0F && !this.method_19047() && this.onGround) {
               double var7 = this.method_19078() * (double)this.field_20019 * (double)this.method_37281();
               double var9;
               if (!this.isPotionActive(Effects.field_19730)) {
                  var9 = var7;
               } else {
                  var9 = var7 + (double)((float)(this.method_26553(Effects.field_19730).method_10333() + 1) * 0.1F);
               }

               class_1343 var11 = this.method_37098();
               this.method_37214(var11.field_7336, var9, var11.field_7334);
               this.method_19080(true);
               this.field_41763 = true;
               if (var6 > 0.0F) {
                  float var12 = MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0));
                  float var13 = MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0));
                  this.method_37215(this.method_37098().method_6214((double)(-0.4F * var12 * this.field_20019), 0.0, (double)(0.4F * var13 * this.field_20019)));
               }

               this.field_20019 = 0.0F;
            }

            this.field_29674 = this.method_26423() * 0.1F;
            if (!this.canPassengerSteer()) {
               if (var4 instanceof PlayerEntity) {
                  this.method_37215(class_1343.field_7335);
               }
            } else {
               this.method_26461((float)this.method_26575(Attributes.MOVEMENT_SPEED));
               super.method_26431(new class_1343((double)var5, var1.field_7333, (double)var6));
            }

            if (this.onGround) {
               this.field_20019 = 0.0F;
               this.method_19080(false);
            }

            this.method_26418(this, false);
         } else {
            this.field_29674 = 0.02F;
            super.method_26431(var1);
         }
      }
   }

   public void method_19048() {
      this.method_37155(SoundEvents.field_2911, 0.4F, 1.0F);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putBoolean("EatingHaystack", this.method_19086());
      var1.putBoolean("Bred", this.method_19044());
      var1.putInt("Temper", this.method_19062());
      var1.putBoolean("Tame", this.method_19043());
      if (this.method_19081() != null) {
         var1.method_25964("Owner", this.method_19081());
      }

      if (!this.field_20021.method_31498(0).method_28022()) {
         var1.put("SaddleItem", this.field_20021.method_31498(0).method_27998(new CompoundNBT()));
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method_19054(var1.getBoolean("EatingHaystack"));
      this.method_19066(var1.getBoolean("Bred"));
      this.method_19071(var1.method_25947("Temper"));
      this.method_19041(var1.getBoolean("Tame"));
      UUID var5;
      if (!var1.method_25954("Owner")) {
         String var4 = var1.method_25965("Owner");
         var5 = class_6860.method_31462(this.method_37268(), var4);
      } else {
         var5 = var1.method_25926("Owner");
      }

      if (var5 != null) {
         this.method_19051(var5);
      }

      if (var1.contains("SaddleItem", 10)) {
         ItemStack var6 = ItemStack.method_28015(var1.getCompound("SaddleItem"));
         if (var6.method_27960() == class_4897.field_24836) {
            this.field_20021.method_31503(0, var6);
         }
      }

      this.method_19070();
   }

   @Override
   public boolean method_24873(class_5467 var1) {
      return false;
   }

   public boolean method_19058() {
      return !this.method_37151()
         && !this.isPassenger()
         && this.method_19043()
         && !this.method_26449()
         && this.method_26551() >= this.method_26465()
         && this.method_24875();
   }

   @Nullable
   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      return null;
   }

   public void method_19055(class_1899 var1, class_4109 var2) {
      double var5 = this.method_26419(Attributes.MAX_HEALTH) + var1.method_26419(Attributes.MAX_HEALTH) + (double)this.method_19082();
      var2.getAttribute(Attributes.MAX_HEALTH).setBaseValue(var5 / 3.0);
      double var7 = this.method_26419(Attributes.field_37464) + var1.method_26419(Attributes.field_37464) + this.method_19046();
      var2.getAttribute(Attributes.field_37464).setBaseValue(var7 / 3.0);
      double var9 = this.method_26419(Attributes.MOVEMENT_SPEED) + var1.method_26419(Attributes.MOVEMENT_SPEED) + this.method_19087();
      var2.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(var9 / 3.0);
   }

   @Override
   public boolean canBeSteered() {
      return this.getControllingPassenger() instanceof LivingEntity;
   }

   public float method_19045(float var1) {
      return MathHelper.lerp(var1, this.field_20017, this.field_20008);
   }

   public float method_19040(float var1) {
      return MathHelper.lerp(var1, this.field_20010, this.field_20018);
   }

   public float method_19073(float var1) {
      return MathHelper.lerp(var1, this.field_20022, this.field_20027);
   }

   @Override
   public void method_45069(int var1) {
      if (this.method_43357()) {
         if (var1 >= 0) {
            this.field_20014 = true;
            this.method_19065();
         } else {
            var1 = 0;
         }

         if (var1 < 90) {
            this.field_20019 = 0.4F + 0.4F * (float)var1 / 90.0F;
         } else {
            this.field_20019 = 1.0F;
         }
      }
   }

   @Override
   public boolean method_45066() {
      return this.method_43357();
   }

   @Override
   public void method_45067(int var1) {
      this.field_20014 = true;
      this.method_19065();
      this.method_19048();
   }

   @Override
   public void method_45068() {
   }

   public void method_19090(boolean var1) {
      class_2427 var4 = !var1 ? class_3090.field_15376 : class_3090.field_15348;

      for (int var5 = 0; var5 < 7; var5++) {
         double var6 = this.field_41717.nextGaussian() * 0.02;
         double var8 = this.field_41717.nextGaussian() * 0.02;
         double var10 = this.field_41717.nextGaussian() * 0.02;
         this.world.method_43361(var4, this.method_37361(1.0), this.method_37255() + 0.5, this.method_37383(1.0), var6, var8, var10);
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 7) {
         if (var1 != 6) {
            super.method_37336(var1);
         } else {
            this.method_19090(false);
         }
      } else {
         this.method_19090(true);
      }
   }

   @Override
   public void method_37340(Entity var1) {
      super.method_37340(var1);
      if (var1 instanceof MobEntity) {
         MobEntity var4 = (MobEntity)var1;
         this.field_29605 = var4.field_29605;
      }

      if (this.field_20010 > 0.0F) {
         float var8 = MathHelper.sin(this.field_29605 * (float) (Math.PI / 180.0));
         float var5 = MathHelper.cos(this.field_29605 * (float) (Math.PI / 180.0));
         float var6 = 0.7F * this.field_20010;
         float var7 = 0.15F * this.field_20010;
         var1.method_37256(
            this.getPosX() + (double)(var6 * var8),
            this.method_37309() + this.getMountedYOffset() + var1.method_37106() + (double)var7,
            this.getPosZ() - (double)(var6 * var5)
         );
         if (var1 instanceof LivingEntity) {
            ((LivingEntity)var1).field_29605 = this.field_29605;
         }
      }
   }

   public float method_19082() {
      return 15.0F + (float)this.field_41717.nextInt(8) + (float)this.field_41717.nextInt(9);
   }

   public double method_19046() {
      return 0.4F + this.field_41717.nextDouble() * 0.2 + this.field_41717.nextDouble() * 0.2 + this.field_41717.nextDouble() * 0.2;
   }

   public double method_19087() {
      return (0.45F + this.field_41717.nextDouble() * 0.3 + this.field_41717.nextDouble() * 0.3 + this.field_41717.nextDouble() * 0.3) * 0.25;
   }

   @Override
   public boolean method_26505() {
      return false;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return var2.field_31200 * 0.95F;
   }

   public boolean method_19052() {
      return false;
   }

   public boolean method_19067() {
      return !this.method_26520(class_6943.field_35708).method_28022();
   }

   public boolean method_19069(ItemStack var1) {
      return false;
   }

   @Override
   public boolean method_37166(int var1, ItemStack var2) {
      int var5 = var1 - 400;
      if (var5 >= 0 && var5 < 2 && var5 < this.field_20021.method_31505()) {
         if (var5 == 0 && var2.method_27960() != class_4897.field_24836) {
            return false;
         } else if (var5 == 1 && (!this.method_19052() || !this.method_19069(var2))) {
            return false;
         } else {
            this.field_20021.method_31503(var5, var2);
            this.method_19070();
            return true;
         }
      } else {
         int var6 = var1 - 500 + 2;
         if (var6 >= 2 && var6 < this.field_20021.method_31505()) {
            this.field_20021.method_31503(var6, var2);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public Entity getControllingPassenger() {
      return !this.getPassengers().isEmpty() ? this.getPassengers().get(0) : null;
   }

   @Nullable
   private class_1343 method_19059(class_1343 var1, LivingEntity var2) {
      double var5 = this.getPosX() + var1.field_7336;
      double var7 = this.getBoundingBox().field_19937;
      double var9 = this.getPosZ() + var1.field_7334;
      class_2921 var11 = new class_2921();
      UnmodifiableIterator var12 = var2.method_26454().iterator();

      while (var12.hasNext()) {
         class_7653 var13 = (class_7653)var12.next();
         var11.method_13361(var5, var7, var9);
         double var14 = this.getBoundingBox().field_19939 + 0.75;

         do {
            double var16 = this.world.method_28259(var11);
            if ((double)var11.getY() + var16 > var14) {
               break;
            }

            if (class_160.method_648(var16)) {
               Box var18 = var2.method_26549(var13);
               class_1343 var19 = new class_1343(var5, (double)var11.getY() + var16, var9);
               if (class_160.method_647(this.world, var2, var18.method_18920(var19))) {
                  var2.method_37356(var13);
                  return var19;
               }
            }

            var11.method_13368(Direction.field_817);
         } while (!((double)var11.getY() < var14));
      }

      return null;
   }

   @Override
   public class_1343 method_37282(LivingEntity var1) {
      class_1343 var4 = method_37373(
         (double)this.method_37086(), (double)var1.method_37086(), this.rotationYaw + (var1.method_26432() != class_1736.field_8943 ? -90.0F : 90.0F)
      );
      class_1343 var5 = this.method_19059(var4, var1);
      if (var5 == null) {
         class_1343 var6 = method_37373(
            (double)this.method_37086(), (double)var1.method_37086(), this.rotationYaw + (var1.method_26432() != class_1736.field_8940 ? -90.0F : 90.0F)
         );
         class_1343 var7 = this.method_19059(var6, var1);
         return var7 == null ? this.method_37245() : var7;
      } else {
         return var5;
      }
   }

   public void method_19084() {
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      if (var4 == null) {
         var4 = new class_1821(0.2F);
      }

      this.method_19084();
      return super.method_26864(var1, var2, var3, (class_8733)var4, var5);
   }
}
