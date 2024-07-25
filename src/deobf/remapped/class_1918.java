package remapped;

import java.util.Random;
import java.util.UUID;

public class class_1918 extends class_2811 implements class_6250 {
   private static final UUID field_9782 = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final class_9343 field_9785 = new class_9343(field_9782, "Attacking speed boost", 0.05, class_9342.field_47679);
   private static final class_4376 field_9788 = class_5804.method_26295(0, 1);
   private int field_9789;
   private static final class_4376 field_9786 = class_5804.method_26295(20, 39);
   private int field_9791;
   private UUID field_9784;
   private static final class_4376 field_9790 = class_5804.method_26295(4, 6);
   private int field_9783;

   public class_1918(EntityType<? extends class_1918> var1, World var2) {
      super(var1, var2);
      this.method_26895(class_1108.field_6360, 8.0F);
   }

   @Override
   public void method_28531(UUID var1) {
      this.field_9784 = var1;
   }

   @Override
   public double method_37106() {
      return !this.method_26449() ? -0.45 : -0.05;
   }

   @Override
   public void method_12800() {
      this.goalSelector.addGoal(2, new class_1277(this, 1.0, false));
      this.goalSelector.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setCallsForHelp());
      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method_28534));
      this.targetSelector.addGoal(3, new class_6474<class_1918>(this, true));
   }

   public static class_1313 method_8729() {
      return class_2811.method_12802()
         .method_5984(class_7331.field_37470, 0.0)
         .method_5984(class_7331.field_37465, 0.23F)
         .method_5984(class_7331.field_37462, 5.0);
   }

   @Override
   public boolean method_12795() {
      return false;
   }

   @Override
   public void method_26919() {
      class_9747 var3 = this.method_26561(class_7331.field_37465);
      if (!this.method_28537()) {
         if (var3.method_45007(field_9785)) {
            var3.method_45004(field_9785);
         }
      } else {
         if (!this.method_26449() && !var3.method_45007(field_9785)) {
            var3.method_45011(field_9785);
         }

         this.method_8727();
      }

      this.method_28530((class_6331)this.world, true);
      if (this.method_17809() != null) {
         this.method_8724();
      }

      if (this.method_28537()) {
         this.field_29665 = this.field_41697;
      }

      super.method_26919();
   }

   private void method_8727() {
      if (this.field_9789 > 0) {
         this.field_9789--;
         if (this.field_9789 == 0) {
            this.method_8728();
         }
      }
   }

   private void method_8724() {
      if (this.field_9783 <= 0) {
         if (this.method_26928().method_36736(this.method_17809())) {
            this.method_8725();
         }

         this.field_9783 = field_9790.method_20387(this.field_41717);
      } else {
         this.field_9783--;
      }
   }

   private void method_8725() {
      double var3 = this.method_26575(class_7331.field_37471);
      Box var5 = Box.method_18911(this.method_37245()).method_18899(var3, 10.0, var3);
      this.world
         .<class_1918>method_25874(class_1918.class, var5)
         .stream()
         .filter(var1 -> var1 != this)
         .filter(var0 -> var0.method_17809() == null)
         .filter(var1 -> !var1.method_37344(this.method_17809()))
         .forEach(var1 -> var1.method_26860(this.method_17809()));
   }

   private void method_8728() {
      this.method_37155(class_463.field_2331, this.method_26439() * 2.0F, this.method_26547() * 1.8F);
   }

   @Override
   public void method_26860(class_5834 var1) {
      if (this.method_17809() == null && var1 != null) {
         this.field_9789 = field_9788.method_20387(this.field_41717);
         this.field_9783 = field_9790.method_20387(this.field_41717);
      }

      if (var1 instanceof PlayerEntity) {
         this.method_26580((PlayerEntity)var1);
      }

      super.method_26860(var1);
   }

   @Override
   public void method_28529() {
      this.method_28532(field_9786.method_20387(this.field_41717));
   }

   public static boolean method_8726(EntityType<class_1918> var0, class_9379 var1, class_2417 var2, BlockPos var3, Random var4) {
      return var1.method_43370() != class_423.field_1790 && var1.method_28262(var3.method_6100()).method_8360() != class_4783.field_23273;
   }

   @Override
   public boolean method_26855(class_4924 var1) {
      return var1.method_6677(this) && !var1.method_22550(this.method_37241());
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      this.method_28528(var1);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.method_28533((class_6331)this.world, var1);
   }

   @Override
   public void method_28532(int var1) {
      this.field_9791 = var1;
   }

   @Override
   public int method_28539() {
      return this.field_9791;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return !this.method_37180(var1) ? super.attackEntityFrom(var1, var2) : false;
   }

   @Override
   public class_8461 method_26918() {
      return !this.method_28537() ? class_463.field_2488 : class_463.field_2331;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2350;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_1935;
   }

   @Override
   public void method_26870(class_9589 var1) {
      this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_25057));
   }

   @Override
   public ItemStack method_12796() {
      return ItemStack.EMPTY;
   }

   @Override
   public void method_12801() {
      this.method_26561(class_7331.field_37470).method_45006(0.0);
   }

   @Override
   public UUID method_28535() {
      return this.field_9784;
   }

   @Override
   public boolean method_5202(PlayerEntity var1) {
      return this.method_28534(var1);
   }
}
