package remapped;

import java.util.Random;

public class class_8170 extends class_2811 {
   private static String[] field_41837;

   public class_8170(EntityType<? extends class_8170> var1, World var2) {
      super(var1, var2);
   }

   public static boolean method_37471(EntityType<class_8170> var0, class_1556 var1, class_2417 var2, BlockPos var3, Random var4) {
      return method_5199(var0, var1, var2, var3, var4) && (var2 == class_2417.field_12024 || var1.method_25263(var3));
   }

   @Override
   public boolean method_12803() {
      return false;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2825;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2107;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2213;
   }

   @Override
   public class_8461 method_12805() {
      return class_463.field_2647;
   }

   @Override
   public boolean method_26442(Entity var1) {
      boolean var4 = super.method_26442(var1);
      if (var4 && this.method_26446().method_28022() && var1 instanceof class_5834) {
         float var5 = this.world.method_43368(this.method_37075()).method_44283();
         ((class_5834)var1).method_26558(new class_2250(Effects.field_19747, 140 * (int)var5));
      }

      return var4;
   }

   @Override
   public boolean method_12795() {
      return true;
   }

   @Override
   public void method_12798() {
      this.method_12791(EntityType.field_34297);
      if (!this.method_37378()) {
         this.world.method_43365((class_704)null, 1041, this.method_37075(), 0);
      }
   }

   @Override
   public ItemStack method_12796() {
      return ItemStack.EMPTY;
   }
}
