package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class class_7263 extends class_6993 {
   public static final ImmutableList<class_3172<? extends class_6127<? super class_7263>>> field_37210 = ImmutableList.of(
      class_3172.field_15861, class_3172.field_15860, class_3172.field_15866, class_3172.field_15865, class_3172.field_15872
   );
   public static final ImmutableList<class_6044<?>> field_37211 = ImmutableList.of(
      class_6044.field_30874,
      class_6044.field_30872,
      class_6044.field_30907,
      class_6044.field_30901,
      class_6044.field_30870,
      class_6044.field_30912,
      class_6044.field_30902,
      class_6044.field_30876,
      class_6044.field_30867,
      class_6044.field_30859,
      class_6044.field_30889,
      class_6044.field_30909,
      new class_6044[]{
         class_6044.field_30884,
         class_6044.field_30865,
         class_6044.field_30861,
         class_6044.field_30888,
         class_6044.field_30866,
         class_6044.field_30891,
         class_6044.field_30854
      }
   );

   public class_7263(class_6629<? extends class_7263> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 20;
   }

   public static class_1313 method_33190() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37468, 50.0)
         .method_5984(class_7331.field_37465, 0.35F)
         .method_5984(class_7331.field_37462, 7.0);
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      class_9544.method_44041(this);
      this.method_26870(var2);
      return super.method_26864(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_26870(class_9589 var1) {
      this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_24373));
   }

   @Override
   public class_1193<class_7263> method_26410() {
      return class_1150.<class_7263>method_5128(field_37211, field_37210);
   }

   @Override
   public class_1150<?> method_26585(Dynamic<?> var1) {
      return class_9544.method_44049(this, this.method_26410().method_5284(var1));
   }

   @Override
   public class_1150<class_7263> method_26525() {
      return (class_1150<class_7263>)super.method_26525();
   }

   @Override
   public boolean method_31988() {
      return false;
   }

   @Override
   public boolean method_26873(ItemStack var1) {
      return var1.method_27960() != class_4897.field_24373 ? false : super.method_26873(var1);
   }

   @Override
   public void method_26919() {
      this.world.method_29599().startSection("piglinBruteBrain");
      this.method_26525().method_5141((class_6331)this.world, this);
      this.world.method_29599().endSection();
      class_9544.method_44044(this);
      class_9544.method_44043(this);
      super.method_26919();
   }

   @Override
   public class_9316 method_31993() {
      return this.method_26892() && this.method_31987() ? class_9316.field_47570 : class_9316.field_47576;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      boolean var5 = super.attackEntityFrom(var1, var2);
      if (!this.world.field_33055) {
         if (var5 && var1.method_28372() instanceof class_5834) {
            class_9544.method_44048(this, (class_5834)var1.method_28372());
         }

         return var5;
      } else {
         return false;
      }
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2165;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2711;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2102;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(class_463.field_2066, 0.15F, 1.0F);
   }

   public void method_33189() {
      this.method_37155(class_463.field_1924, 1.0F, this.method_26547());
   }

   @Override
   public void method_31986() {
      this.method_37155(class_463.field_2401, 1.0F, this.method_26547());
   }
}
