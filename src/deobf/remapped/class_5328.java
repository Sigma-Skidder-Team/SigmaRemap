package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class class_5328 implements class_7279 {
   private static String[] field_27179;
   private final class_5319 field_27180;

   public class_5328(class_5319 var1) {
      this.field_27180 = var1;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26362;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(class_8712.field_44670);
   }

   public boolean test(class_2792 var1) {
      ItemStack var4 = var1.<ItemStack>method_12698(class_8712.field_44670);
      return var4 != null && this.field_27180.method_24266(var4);
   }

   public static class_5704 method_24286(class_9518 var0) {
      return () -> new class_5328(var0.method_43921());
   }
}
