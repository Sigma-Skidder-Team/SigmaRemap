package remapped;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class class_4359 extends class_2811 implements class_2354 {
   private static String[] field_21386;
   private boolean field_21387;
   public final class_9811 field_21388;
   public final class_8985 field_21389;

   public class_4359(EntityType<? extends class_4359> var1, World var2) {
      super(var1, var2);
      this.field_41733 = 1.0F;
      this.field_29900 = new class_2101(this);
      this.method_26895(class_1108.field_6359, 0.0F);
      this.field_21388 = new class_9811(this, var2);
      this.field_21389 = new class_8985(this, var2);
   }

   @Override
   public void method_12800() {
      this.goalSelector.addGoal(1, new class_7156(this, 1.0));
      this.goalSelector.addGoal(2, new class_8719(this, 1.0, 40, 10.0F));
      this.goalSelector.addGoal(2, new class_7264(this, 1.0, false));
      this.goalSelector.addGoal(5, new class_957(this, 1.0));
      this.goalSelector.addGoal(6, new class_5602(this, 1.0, this.world.method_22552()));
      this.goalSelector.addGoal(7, new class_8285(this, 1.0));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this, class_4359.class).setCallsForHelp(class_1918.class));
      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method_20226));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<AbstractVillagerEntity>(this, AbstractVillagerEntity.class, false));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<IronGolemEntity>(this, IronGolemEntity.class, true));
      this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<class_3845>(this, class_3845.class, 10, true, false, class_3845.field_18768));
   }

   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      var4 = super.method_26864(var1, var2, var3, var4, var5);
      if (this.method_26520(class_6943.field_35701).method_28022() && this.field_41717.nextFloat() < 0.03F) {
         this.method_37349(class_6943.field_35701, new ItemStack(class_4897.field_24828));
         this.field_29923[class_6943.field_35701.method_31767()] = 2.0F;
      }

      return var4;
   }

   public static boolean method_20225(EntityType<class_4359> var0, class_1556 var1, class_2417 var2, BlockPos var3, Random var4) {
      Optional var7 = var1.method_2754(var3);
      boolean var8 = var1.method_43370() != class_423.field_1790
         && method_5200(var1, var3, var4)
         && (var2 == class_2417.field_12024 || var1.method_28258(var3).method_22007(class_6503.field_33094));
      return !Objects.equals(var7, Optional.<class_5621<class_6325>>of(class_8606.field_44139))
            && !Objects.equals(var7, Optional.<class_5621<class_6325>>of(class_8606.field_44082))
         ? var4.nextInt(40) == 0 && method_20221(var1, var3) && var8
         : var4.nextInt(15) == 0 && var8;
   }

   private static boolean method_20221(class_9379 var0, BlockPos var1) {
      return var1.getY() < var0.method_22552() - 5;
   }

   @Override
   public boolean method_12792() {
      return false;
   }

   @Override
   public SoundEvent method_26918() {
      return !this.method_37285() ? SoundEvents.field_2566 : SoundEvents.field_2745;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return !this.method_37285() ? SoundEvents.field_2226 : SoundEvents.field_2088;
   }

   @Override
   public SoundEvent method_26599() {
      return !this.method_37285() ? SoundEvents.field_2813 : SoundEvents.field_1932;
   }

   @Override
   public SoundEvent method_12805() {
      return SoundEvents.field_2824;
   }

   @Override
   public SoundEvent method_37239() {
      return SoundEvents.field_2901;
   }

   @Override
   public ItemStack method_12796() {
      return ItemStack.EMPTY;
   }

   @Override
   public void method_26870(class_9589 var1) {
      if ((double)this.field_41717.nextFloat() > 0.9) {
         int var4 = this.field_41717.nextInt(16);
         if (var4 >= 10) {
            this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_24505));
         } else {
            this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_25086));
         }
      }
   }

   @Override
   public boolean method_26881(ItemStack var1, ItemStack var2) {
      if (var2.method_27960() != class_4897.field_24828) {
         if (var2.method_27960() != class_4897.field_25086) {
            return var1.method_27960() != class_4897.field_25086 ? super.method_26881(var1, var2) : true;
         } else {
            return var1.method_27960() != class_4897.field_25086 ? false : var1.method_28026() < var2.method_28026();
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_12795() {
      return false;
   }

   @Override
   public boolean method_26855(class_4924 var1) {
      return var1.method_6677(this);
   }

   public boolean method_20226(LivingEntity var1) {
      return var1 == null ? false : !this.world.method_29602() || var1.method_37285();
   }

   @Override
   public boolean method_37107() {
      return !this.method_37113();
   }

   private boolean method_20227() {
      if (this.field_21387) {
         return true;
      } else {
         LivingEntity var3 = this.getAttackTarget();
         return var3 != null && var3.method_37285();
      }
   }

   @Override
   public void method_26431(Vector3d var1) {
      if (this.method_26530() && this.method_37285() && this.method_20227()) {
         this.method_37092(0.01F, var1);
         this.method_37226(class_7412.field_37839, this.method_37098());
         this.method_37215(this.method_37098().method_6209(0.9));
      } else {
         super.method_26431(var1);
      }
   }

   @Override
   public void method_37337() {
      if (!this.world.field_33055) {
         if (this.method_26530() && this.method_37285() && this.method_20227()) {
            this.field_29904 = this.field_21388;
            this.method_37260(true);
         } else {
            this.field_29904 = this.field_21389;
            this.method_37260(false);
         }
      }
   }

   public boolean method_20223() {
      class_3998 var3 = this.method_26927().method_5594();
      if (var3 != null) {
         BlockPos var4 = var3.method_18426();
         if (var4 != null) {
            double var5 = this.method_37273((double)var4.getX(), (double)var4.getY(), (double)var4.getZ());
            if (var5 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void method_10805(LivingEntity var1, float var2) {
      class_3348 var5 = new class_3348(this.world, this, new ItemStack(class_4897.field_25086));
      double var6 = var1.getPosX() - this.getPosX();
      double var8 = var1.method_37080(0.3333333333333333) - var5.method_37309();
      double var10 = var1.getPosZ() - this.getPosZ();
      double var12 = (double) MathHelper.sqrt(var6 * var6 + var10 * var10);
      var5.method_26161(var6, var8 + var12 * 0.2F, var10, 1.6F, (float)(14 - this.world.method_43370().method_2097() * 4));
      this.method_37155(SoundEvents.field_2187, 1.0F, 1.0F / (this.method_26594().nextFloat() * 0.4F + 0.8F));
      this.world.method_7509(var5);
   }

   public void method_20220(boolean var1) {
      this.field_21387 = var1;
   }
}
