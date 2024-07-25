package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class class_5805 implements class_7279 {
   private static String[] field_29309;
   private final class_6414 field_29310;
   private final class_1827 field_29311;

   private class_5805(class_6414 var1, class_1827 var2) {
      this.field_29310 = var1;
      this.field_29311 = var2;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26346;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(class_8712.field_44677);
   }

   public boolean test(class_2792 var1) {
      class_2522 var4 = var1.<class_2522>method_12698(class_8712.field_44677);
      return var4 != null && this.field_29310 == var4.method_8360() && this.field_29311.method_8076(var4);
   }

   public static class_3029 method_26299(class_6414 var0) {
      return new class_3029(var0);
   }
}
