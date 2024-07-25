package remapped;

public class class_2933 implements class_7835 {
   private final class_1331 field_14279;
   private final class_1343 field_14278;

   public class_2933(class_1331 var1) {
      this.field_14279 = var1;
      this.field_14278 = class_1343.method_6216(var1);
   }

   @Override
   public class_1343 method_35464() {
      return this.field_14278;
   }

   @Override
   public class_1331 method_35462() {
      return this.field_14279;
   }

   @Override
   public boolean method_35463(class_5834 var1) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.field_14279 + ", centerPosition=" + this.field_14278 + '}';
   }
}
