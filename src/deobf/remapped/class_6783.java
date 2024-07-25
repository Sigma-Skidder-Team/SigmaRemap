package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class class_6783 implements class_7279 {
   private static String[] field_34982;
   private final class_4382 field_34983;
   private final float[] field_34984;

   private class_6783(class_4382 var1, float[] var2) {
      this.field_34983 = var1;
      this.field_34984 = var2;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26351;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(class_8712.field_44670);
   }

   public boolean test(class_2792 var1) {
      class_6098 var4 = var1.<class_6098>method_12698(class_8712.field_44670);
      int var5 = var4 == null ? 0 : class_2931.method_13423(this.field_34983, var4);
      float var6 = this.field_34984[Math.min(var5, this.field_34984.length - 1)];
      return var1.method_12693().nextFloat() < var6;
   }

   public static class_5704 method_31099(class_4382 var0, float... var1) {
      return () -> new class_6783(var0, var1);
   }
}
