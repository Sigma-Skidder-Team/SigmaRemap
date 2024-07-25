package remapped;

import java.util.function.Predicate;

public abstract class class_551 extends class_2451 {
   public static final Predicate<class_6098> field_3286 = var0 -> var0.method_27960().method_11250(class_391.field_1594);
   public static final Predicate<class_6098> field_3287 = field_3286.or(var0 -> var0.method_27960() == class_4897.field_24479);

   public class_551(class_317 var1) {
      super(var1);
   }

   public Predicate<class_6098> method_2653() {
      return this.method_2655();
   }

   public abstract Predicate<class_6098> method_2655();

   public static class_6098 method_2656(class_5834 var0, Predicate<class_6098> var1) {
      if (!var1.test(var0.method_26617(class_2584.field_12794))) {
         return !var1.test(var0.method_26617(class_2584.field_12791)) ? class_6098.field_31203 : var0.method_26617(class_2584.field_12791);
      } else {
         return var0.method_26617(class_2584.field_12794);
      }
   }

   @Override
   public int method_11213() {
      return 1;
   }

   public abstract int method_2654();
}
