package remapped;

public class class_6630 extends class_3599 {
   private static String[] field_34333;
   private final class_496 field_34331;
   private int field_34332;

   public class_6630(class_496 var1) {
      this.field_34331 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_34332 < this.field_34331.field_41697
         && this.field_34331.method_2468()
         && this.field_34331.method_2451()
         && class_496.method_2419(this.field_34331).nextInt(400) == 1;
   }

   @Override
   public boolean method_16799() {
      return !this.field_34331.method_37285() && (this.field_34331.method_2468() || class_496.method_2412(this.field_34331).nextInt(600) != 1)
         ? class_496.method_2434(this.field_34331).nextInt(2000) != 1
         : false;
   }

   @Override
   public void method_16796() {
      this.field_34331.method_2471(true);
      this.field_34332 = 0;
   }

   @Override
   public void method_16793() {
      this.field_34331.method_2471(false);
      this.field_34332 = this.field_34331.field_41697 + 200;
   }
}
