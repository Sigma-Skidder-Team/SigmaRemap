package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Random;
import java.util.Set;

public class class_5617 implements class_7279 {
   private static String[] field_28524;
   private static final class_5617 field_28523 = new class_5617();

   private class_5617() {
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26361;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(class_8712.field_44672);
   }

   public boolean test(class_2792 var1) {
      Float var4 = var1.<Float>method_12698(class_8712.field_44672);
      if (var4 == null) {
         return true;
      } else {
         Random var5 = var1.method_12693();
         float var6 = 1.0F / var4;
         return var5.nextFloat() <= var6;
      }
   }

   public static class_5704 method_25486() {
      return () -> field_28523;
   }
}
