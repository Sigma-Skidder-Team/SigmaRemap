package remapped;

public class class_8399 extends class_3599 {
   private static String[] field_42976;
   private final class_496 field_42977;

   public class_8399(class_496 var1) {
      this.field_42977 = var1;
   }

   @Override
   public boolean method_16795() {
      if (this.field_42977.method_26449() && this.field_42977.method_2451()) {
         return this.field_42977.method_2416() && class_496.method_2431(this.field_42977).nextInt(500) == 1
            ? true
            : class_496.method_2414(this.field_42977).nextInt(6000) == 1;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return false;
   }

   @Override
   public void method_16796() {
      this.field_42977.method_2418(true);
   }
}
