package remapped;

import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_9408 extends class_8990 implements class_6250 {
   private static final class_7821<Boolean> field_48114 = class_8073.<Boolean>method_36641(class_9408.class, class_2734.field_13347);
   private static final class_7821<Integer> field_48111 = class_8073.<Integer>method_36641(class_9408.class, class_2734.field_13366);
   private static final class_7821<Integer> field_48105 = class_8073.<Integer>method_36641(class_9408.class, class_2734.field_13366);
   public static final Predicate<class_5834> field_48108 = var0 -> {
      EntityType var3 = var0.method_37387();
      return var3 == EntityType.field_34321 || var3 == EntityType.field_34251 || var3 == EntityType.field_34250;
   };
   private float field_48102;
   private float field_48104;
   private boolean field_48106;
   private boolean field_48103;
   private float field_48110;
   private float field_48113;
   private static final class_4376 field_48107 = class_5804.method_26295(20, 39);
   private UUID field_48109;

   public class_9408(EntityType<? extends class_9408> var1, World var2) {
      super(var1, var2);
      this.method_41217(false);
   }

   @Override
   public void registerGoals() {
      this.goalSelector.addGoal(1, new class_787(this));
      this.goalSelector.addGoal(2, new class_8453(this));
      this.goalSelector.addGoal(3, new class_5160(this, this, (float)class_9310.class, (double)24.0F, 1.5, 1.5));
      this.goalSelector.addGoal(4, new class_1937(this, 0.4F));
      this.goalSelector.addGoal(5, new class_9037(this, 1.0, true));
      this.goalSelector.addGoal(6, new class_5591(this, 1.0, 10.0F, 2.0F, false));
      this.goalSelector.addGoal(7, new class_9513(this, 1.0));
      this.goalSelector.addGoal(8, new class_2889(this, 1.0));
      this.goalSelector.addGoal(9, new class_5809(this, 8.0F));
      this.goalSelector.addGoal(10, new LookAtGoal(this, PlayerEntity.class, 8.0F));
      this.goalSelector.addGoal(10, new class_9691(this));
      this.targetSelector.addGoal(1, new class_5184(this));
      this.targetSelector.addGoal(2, new class_3800(this));
      this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setCallsForHelp());
      this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method_28534));
      this.targetSelector.addGoal(5, new class_5327<class_5467>(this, class_5467.class, false, field_48108));
      this.targetSelector.addGoal(6, new class_5327<class_3845>(this, class_3845.class, false, class_3845.field_18768));
      this.targetSelector.addGoal(7, new NearestAttackableTargetGoal<class_1595>(this, class_1595.class, false));
      this.targetSelector.addGoal(8, new class_6474<class_9408>(this, true));
   }

   public static class_1313 method_43585() {
      return MobEntity.method_26846()
         .method_5984(class_7331.field_37465, 0.3F)
         .method_5984(class_7331.field_37468, 8.0)
         .method_5984(class_7331.field_37462, 2.0);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_48114, false);
      this.field_41735.method_36634(field_48111, class_9077.field_46494.method_41794());
      this.field_41735.method_36634(field_48105, 0);
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(class_463.field_2135, 0.15F, 1.0F);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25921("CollarColor", (byte)this.method_43584().method_41794());
      this.method_28528(var1);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      if (var1.contains("CollarColor", 99)) {
         this.method_43582(class_9077.method_41789(var1.method_25947("CollarColor")));
      }

      this.method_28533((class_6331)this.world, var1);
   }

   @Override
   public class_8461 method_26918() {
      if (!this.method_28537()) {
         if (this.field_41717.nextInt(3) != 0) {
            return class_463.field_2522;
         } else {
            return this.method_41215() && this.method_26551() < 10.0F ? class_463.field_2367 : class_463.field_1997;
         }
      } else {
         return class_463.field_2262;
      }
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2490;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2215;
   }

   @Override
   public float method_26439() {
      return 0.4F;
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (!this.world.field_33055 && this.field_48106 && !this.field_48103 && !this.method_21379() && this.onGround) {
         this.field_48103 = true;
         this.field_48110 = 0.0F;
         this.field_48113 = 0.0F;
         this.world.method_29587(this, (byte)8);
      }

      if (!this.world.field_33055) {
         this.method_28530((class_6331)this.world, true);
      }
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.isAlive()) {
         this.field_48104 = this.field_48102;
         if (!this.method_43583()) {
            this.field_48102 = this.field_48102 + (0.0F - this.field_48102) * 0.4F;
         } else {
            this.field_48102 = this.field_48102 + (1.0F - this.field_48102) * 0.4F;
         }

         if (!this.method_37110()) {
            if ((this.field_48106 || this.field_48103) && this.field_48103) {
               if (this.field_48110 == 0.0F) {
                  this.method_37155(class_463.field_2131, this.method_26439(), (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F);
               }

               this.field_48113 = this.field_48110;
               this.field_48110 += 0.05F;
               if (this.field_48113 >= 2.0F) {
                  this.field_48106 = false;
                  this.field_48103 = false;
                  this.field_48113 = 0.0F;
                  this.field_48110 = 0.0F;
               }

               if (this.field_48110 > 0.4F) {
                  float var3 = (float)this.method_37309();
                  int var4 = (int)(class_9299.method_42818((this.field_48110 - 0.4F) * (float) Math.PI) * 7.0F);
                  class_1343 var5 = this.method_37098();

                  for (int var6 = 0; var6 < var4; var6++) {
                     float var7 = (this.field_41717.nextFloat() * 2.0F - 1.0F) * this.method_37086() * 0.5F;
                     float var8 = (this.field_41717.nextFloat() * 2.0F - 1.0F) * this.method_37086() * 0.5F;
                     this.world
                        .method_43361(
                           class_3090.field_15346,
                           this.getPosX() + (double)var7,
                           (double)(var3 + 0.8F),
                           this.getPosZ() + (double)var8,
                           var5.field_7336,
                           var5.field_7333,
                           var5.field_7334
                        );
                  }
               }
            }
         } else {
            this.field_48106 = true;
            if (this.field_48103 && !this.world.field_33055) {
               this.world.method_29587(this, (byte)56);
               this.method_43576();
            }
         }
      }
   }

   private void method_43576() {
      this.field_48103 = false;
      this.field_48110 = 0.0F;
      this.field_48113 = 0.0F;
   }

   @Override
   public void method_26452(DamageSource var1) {
      this.field_48106 = false;
      this.field_48103 = false;
      this.field_48113 = 0.0F;
      this.field_48110 = 0.0F;
      super.method_26452(var1);
   }

   public boolean method_43588() {
      return this.field_48106;
   }

   public float method_43581(float var1) {
      return Math.min(0.5F + class_9299.method_42795(var1, this.field_48113, this.field_48110) / 2.0F * 0.5F, 1.0F);
   }

   public float method_43586(float var1, float var2) {
      float var5 = (class_9299.method_42795(var1, this.field_48113, this.field_48110) + var2) / 1.8F;
      if (!(var5 < 0.0F)) {
         if (var5 > 1.0F) {
            var5 = 1.0F;
         }
      } else {
         var5 = 0.0F;
      }

      return class_9299.method_42818(var5 * (float) Math.PI) * class_9299.method_42818(var5 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float method_43578(float var1) {
      return class_9299.method_42795(var1, this.field_48104, this.field_48102) * 0.15F * (float) Math.PI;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return var2.field_31200 * 0.8F;
   }

   @Override
   public int method_26862() {
      return !this.method_41209() ? super.method_26862() : 20;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!this.method_37180(var1)) {
         Entity var5 = var1.method_28372();
         this.method_41208(false);
         if (var5 != null && !(var5 instanceof PlayerEntity) && !(var5 instanceof class_6749)) {
            var2 = (var2 + 1.0F) / 2.0F;
         }

         return super.attackEntityFrom(var1, var2);
      } else {
         return false;
      }
   }

   @Override
   public boolean method_26442(Entity var1) {
      boolean var4 = var1.attackEntityFrom(DamageSource.method_28345(this), (float)((int)this.method_26575(class_7331.field_37462)));
      if (var4) {
         this.method_37096(this, var1);
      }

      return var4;
   }

   @Override
   public void method_41217(boolean var1) {
      super.method_41217(var1);
      if (!var1) {
         this.method_26561(class_7331.field_37468).method_45006(8.0);
      } else {
         this.method_26561(class_7331.field_37468).method_45006(20.0);
         this.method_26456(20.0F);
      }

      this.method_26561(class_7331.field_37462).method_45006(4.0);
   }

   @Override
   public class_6910 method_26857(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      class_2451 var6 = var5.method_27960();
      if (!this.world.field_33055) {
         if (!this.method_41215()) {
            if (var6 == class_4897.field_24384 && !this.method_28537()) {
               if (!var1.playerAbilities.isCreativeMode) {
                  var5.method_27970(1);
               }

               if (this.field_41717.nextInt(3) != 0) {
                  this.world.method_29587(this, (byte)6);
               } else {
                  this.method_41212(var1);
                  this.field_29904.method_5620();
                  this.method_26860((class_5834)null);
                  this.method_41208(true);
                  this.world.method_29587(this, (byte)7);
               }

               return class_6910.field_35520;
            }
         } else {
            if (this.method_24866(var5) && this.method_26551() < this.method_26465()) {
               if (!var1.playerAbilities.isCreativeMode) {
                  var5.method_27970(1);
               }

               this.heal((float)var6.method_11227().method_38406());
               return class_6910.field_35520;
            }

            if (!(var6 instanceof class_239)) {
               class_6910 var9 = super.method_26857(var1, var2);
               if ((!var9.method_31662() || this.method_26449()) && this.method_41206(var1)) {
                  this.method_41208(!this.method_41216());
                  this.field_29654 = false;
                  this.field_29904.method_5620();
                  this.method_26860((class_5834)null);
                  return class_6910.field_35520;
               }

               return var9;
            }

            class_9077 var8 = ((class_239)var6).method_1015();
            if (var8 != this.method_43584()) {
               this.method_43582(var8);
               if (!var1.playerAbilities.isCreativeMode) {
                  var5.method_27970(1);
               }

               return class_6910.field_35520;
            }
         }

         return super.method_26857(var1, var2);
      } else {
         boolean var7 = this.method_41206(var1) || this.method_41215() || var6 == class_4897.field_24384 && !this.method_41215() && !this.method_28537();
         return !var7 ? class_6910.field_35521 : class_6910.field_35518;
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 8) {
         if (var1 != 56) {
            super.method_37336(var1);
         } else {
            this.method_43576();
         }
      } else {
         this.field_48103 = true;
         this.field_48110 = 0.0F;
         this.field_48113 = 0.0F;
      }
   }

   public float method_43577() {
      if (!this.method_28537()) {
         return !this.method_41215() ? (float) (Math.PI / 5) : (0.55F - (this.method_26465() - this.method_26551()) * 0.02F) * (float) Math.PI;
      } else {
         return 1.5393804F;
      }
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      class_2451 var4 = var1.method_27960();
      return var4.method_11247() && var4.method_11227().method_38402();
   }

   @Override
   public int method_26856() {
      return 8;
   }

   @Override
   public int method_28539() {
      return this.field_41735.<Integer>method_36640(field_48105);
   }

   @Override
   public void method_28532(int var1) {
      this.field_41735.method_36633(field_48105, var1);
   }

   @Override
   public void method_28529() {
      this.method_28532(field_48107.method_20387(this.field_41717));
   }

   @Nullable
   @Override
   public UUID method_28535() {
      return this.field_48109;
   }

   @Override
   public void method_28531(UUID var1) {
      this.field_48109 = var1;
   }

   public class_9077 method_43584() {
      return class_9077.method_41789(this.field_41735.<Integer>method_36640(field_48111));
   }

   public void method_43582(class_9077 var1) {
      this.field_41735.method_36633(field_48111, var1.method_41794());
   }

   public class_9408 method_43587(class_6331 var1, class_1899 var2) {
      class_9408 var5 = EntityType.field_34225.method_30484(var1);
      UUID var6 = this.method_41211();
      if (var6 != null) {
         var5.method_41218(var6);
         var5.method_41217(true);
      }

      return var5;
   }

   public void method_43579(boolean var1) {
      this.field_41735.method_36633(field_48114, var1);
   }

   @Override
   public boolean method_24873(class_5467 var1) {
      if (var1 == this) {
         return false;
      } else if (this.method_41215()) {
         if (!(var1 instanceof class_9408)) {
            return false;
         } else {
            class_9408 var4 = (class_9408)var1;
            if (var4.method_41215()) {
               return var4.method_41209() ? false : this.method_24875() && var4.method_24875();
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public boolean method_43583() {
      return this.field_41735.<Boolean>method_36640(field_48114);
   }

   @Override
   public boolean method_41219(class_5834 var1, class_5834 var2) {
      if (var1 instanceof class_9490 || var1 instanceof class_4206) {
         return false;
      } else if (!(var1 instanceof class_9408)) {
         if (var1 instanceof PlayerEntity && var2 instanceof PlayerEntity && !((PlayerEntity)var2).method_3213((PlayerEntity)var1)) {
            return false;
         } else {
            return var1 instanceof class_4109 && ((class_4109)var1).method_19043()
               ? false
               : !(var1 instanceof class_8990) || !((class_8990)var1).method_41215();
         }
      } else {
         class_9408 var5 = (class_9408)var1;
         return !var5.method_41215() || var5.method_41207() != var2;
      }
   }

   @Override
   public boolean method_26887(PlayerEntity var1) {
      return !this.method_28537() && super.method_26887(var1);
   }

   @Override
   public class_1343 method_37323() {
      return new class_1343(0.0, (double)(0.6F * this.method_37277()), (double)(this.method_37086() * 0.4F));
   }
}
