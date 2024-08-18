package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class class_5310 implements class_7279 {
   private static String[] field_27109;
   private final class_8772 field_27108;

   private class_5310(class_8772 var1) {
      this.field_27108 = var1;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26352;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(class_8712.field_44671, class_8712.field_44674);
   }

   public boolean test(class_2792 var1) {
      DamageSource var4 = var1.<DamageSource>method_12698(class_8712.field_44674);
      Vector3d var5 = var1.<Vector3d>method_12698(class_8712.field_44671);
      return var5 != null && var4 != null && this.field_27108.method_40299(var1.method_12694(), var5, var4);
   }

   public static class_5704 method_24240(class_9447 var0) {
      return () -> new class_5310(var0.method_43693());
   }
}
