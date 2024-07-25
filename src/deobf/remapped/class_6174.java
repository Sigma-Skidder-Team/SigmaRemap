package remapped;

import java.util.Random;

public class class_6174 extends class_1173 {
   private static String[] field_31580;
   private class_128 field_31581;

   public class_6174(EntityType<? extends class_6174> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void registerGoals() {
      this.field_31581 = new class_128(this);
      this.goalSelector.addGoal(1, new class_787(this));
      this.goalSelector.addGoal(3, this.field_31581);
      this.goalSelector.addGoal(4, new class_9037(this, 1.0, false));
      this.goalSelector.addGoal(5, new class_7905(this));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setCallsForHelp());
      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
   }

   @Override
   public double method_37106() {
      return 0.1;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 0.13F;
   }

   public static class_1313 method_28294() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37468, 8.0)
         .method_5984(class_7331.field_37465, 0.25)
         .method_5984(class_7331.field_37462, 1.0);
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2437;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2559;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2009;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(class_463.field_2908, 0.15F, 1.0F);
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (this.method_37180(var1)) {
         return false;
      } else {
         if ((var1 instanceof class_5405 || var1 == DamageSource.field_31686) && this.field_31581 != null) {
            this.field_31581.method_395();
         }

         return super.attackEntityFrom(var1, var2);
      }
   }

   @Override
   public void method_37123() {
      this.field_29605 = this.rotationYaw;
      super.method_37123();
   }

   @Override
   public void method_37090(float var1) {
      this.rotationYaw = var1;
      super.method_37090(var1);
   }

   @Override
   public float method_21376(BlockPos var1, class_4924 var2) {
      return !class_6598.method_30380(var2.method_28262(var1.method_6100())) ? super.method_21376(var1, var2) : 10.0F;
   }

   public static boolean method_28293(EntityType<class_6174> var0, class_9379 var1, class_2417 var2, BlockPos var3, Random var4) {
      if (!method_5198(var0, var1, var2, var3, var4)) {
         return false;
      } else {
         PlayerEntity var7 = var1.method_25857((double)var3.method_12173() + 0.5, (double)var3.method_12165() + 0.5, (double)var3.method_12185() + 0.5, 5.0, true);
         return var7 == null;
      }
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13575;
   }
}
