package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_7617 extends class_5467 {
   private static final class_8137 field_38768 = class_8137.method_37019(class_4897.field_24814, class_4897.field_25201);
   private static final class_7821<Boolean> field_38770 = class_8073.<Boolean>method_36641(class_7617.class, class_2734.field_13347);
   private class_8836<PlayerEntity> field_38767;
   private class_9327 field_38766;

   public class_7617(EntityType<? extends class_7617> var1, World var2) {
      super(var1, var2);
      this.method_34543();
   }

   private boolean method_34544() {
      return this.field_41735.<Boolean>method_36640(field_38770);
   }

   private void method_34540(boolean var1) {
      this.field_41735.method_36633(field_38770, var1);
      this.method_34543();
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.putBoolean("Trusting", this.method_34544());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.method_34540(var1.getBoolean("Trusting"));
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_38770, false);
   }

   @Override
   public void registerGoals() {
      this.field_38766 = new class_9327(this, 0.6, field_38768, true);
      this.goalSelector.addGoal(1, new class_787(this));
      this.goalSelector.addGoal(3, this.field_38766);
      this.goalSelector.addGoal(7, new class_1937(this, 0.3F));
      this.goalSelector.addGoal(8, new class_7037(this));
      this.goalSelector.addGoal(9, new class_9513(this, 0.8));
      this.goalSelector.addGoal(10, new class_2889(this, 0.8, 1.0000001E-5F));
      this.goalSelector.addGoal(11, new LookAtGoal(this, PlayerEntity.class, 10.0F));
      this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<class_3024>(this, class_3024.class, false));
      this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<class_3845>(this, class_3845.class, 10, false, false, class_3845.field_18768));
   }

   @Override
   public void method_26919() {
      if (!this.method_26905().method_12877()) {
         this.method_37356(class_7653.field_38885);
         this.method_37140(false);
      } else {
         double var3 = this.method_26905().method_12880();
         if (var3 != 0.6) {
            if (var3 != 1.33) {
               this.method_37356(class_7653.field_38885);
               this.method_37140(false);
            } else {
               this.method_37356(class_7653.field_38885);
               this.method_37140(true);
            }
         } else {
            this.method_37356(class_7653.field_38881);
            this.method_37140(false);
         }
      }
   }

   @Override
   public boolean method_26911(double var1) {
      return !this.method_34544() && this.field_41697 > 2400;
   }

   public static class_1313 method_34541() {
      return MobEntity.method_26846()
         .method_5984(class_7331.field_37468, 10.0)
         .method_5984(class_7331.field_37465, 0.3F)
         .method_5984(class_7331.field_37462, 3.0);
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      return false;
   }

   @Nullable
   @Override
   public class_8461 method_26918() {
      return class_463.field_2777;
   }

   @Override
   public int method_26850() {
      return 900;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2638;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2122;
   }

   private float method_34545() {
      return (float)this.method_26575(class_7331.field_37462);
   }

   @Override
   public boolean method_26442(Entity var1) {
      return var1.attackEntityFrom(DamageSource.method_28345(this), this.method_34545());
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return !this.method_37180(var1) ? super.attackEntityFrom(var1, var2) : false;
   }

   @Override
   public class_6910 method_26857(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      if ((this.field_38766 == null || this.field_38766.method_33089()) && !this.method_34544() && this.method_24866(var5) && var1.method_37275(this) < 9.0) {
         this.method_24867(var1, var5);
         if (!this.world.field_33055) {
            if (this.field_41717.nextInt(3) != 0) {
               this.method_34539(false);
               this.world.method_29587(this, (byte)40);
            } else {
               this.method_34540(true);
               this.method_34539(true);
               this.world.method_29587(this, (byte)41);
            }
         }

         return class_6910.method_31659(this.world.field_33055);
      } else {
         return super.method_26857(var1, var2);
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 41) {
         if (var1 != 40) {
            super.method_37336(var1);
         } else {
            this.method_34539(false);
         }
      } else {
         this.method_34539(true);
      }
   }

   private void method_34539(boolean var1) {
      class_2427 var4 = class_3090.field_15348;
      if (!var1) {
         var4 = class_3090.field_15376;
      }

      for (int var5 = 0; var5 < 7; var5++) {
         double var6 = this.field_41717.nextGaussian() * 0.02;
         double var8 = this.field_41717.nextGaussian() * 0.02;
         double var10 = this.field_41717.nextGaussian() * 0.02;
         this.world.method_43361(var4, this.method_37361(1.0), this.method_37255() + 0.5, this.method_37383(1.0), var6, var8, var10);
      }
   }

   public void method_34543() {
      if (this.field_38767 == null) {
         this.field_38767 = new class_8836<PlayerEntity>(this, PlayerEntity.class, 16.0F, 0.8, 1.33);
      }

      this.goalSelector.method_3488(this.field_38767);
      if (!this.method_34544()) {
         this.goalSelector.addGoal(4, this.field_38767);
      }
   }

   public class_7617 method_34546(class_6331 var1, class_1899 var2) {
      return EntityType.field_34214.method_30484(var1);
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      return field_38768.test(var1);
   }

   public static boolean method_34538(EntityType<class_7617> var0, class_9379 var1, class_2417 var2, BlockPos var3, Random var4) {
      return var4.nextInt(3) != 0;
   }

   @Override
   public boolean method_26855(class_4924 var1) {
      if (var1.method_6677(this) && !var1.method_22550(this.method_37241())) {
         BlockPos var4 = this.method_37075();
         if (var4.method_12165() < var1.method_22552()) {
            return false;
         }

         class_2522 var5 = var1.method_28262(var4.method_6100());
         if (var5.method_8350(class_4783.field_23259) || var5.method_8349(class_2351.field_11737)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      if (var4 == null) {
         var4 = new class_1821(1.0F);
      }

      return super.method_26864(var1, var2, var3, (class_8733)var4, var5);
   }

   @Override
   public class_1343 method_37323() {
      return new class_1343(0.0, (double)(0.5F * this.method_37277()), (double)(this.method_37086() * 0.4F));
   }
}
