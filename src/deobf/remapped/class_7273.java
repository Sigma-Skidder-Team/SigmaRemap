package remapped;

import java.util.Set;

public class class_7273 implements class_7279 {
   private static String[] field_37241;
   private final class_7279 field_37240;

   private class_7273(class_7279 var1) {
      this.field_37240 = var1;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26353;
   }

   public final boolean test(class_2792 var1) {
      return !this.field_37240.test(var1);
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return this.field_37240.method_12681();
   }

   @Override
   public void method_12680(class_4737 var1) {
      class_7279.super.method_12680(var1);
      this.field_37240.method_12680(var1);
   }

   public static class_5704 method_33247(class_5704 var0) {
      class_7273 var3 = new class_7273(var0.method_25791());
      return () -> var3;
   }
}
