package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class class_6579 extends class_5837 {
   private static String[] field_33557;
   private final class_9597 field_33556;

   private class_6579(class_7279[] var1, class_9597 var2) {
      super(var1);
      this.field_33556 = var2;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26383;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(this.field_33556.field_48907);
   }

   @Override
   public class_6098 method_26627(class_6098 var1, class_2792 var2) {
      Object var5 = var2.method_12698(this.field_33556.field_48907);
      if (var5 instanceof class_9875) {
         class_9875 var6 = (class_9875)var5;
         if (var6.method_45507()) {
            var1.method_28032(var6.method_19839());
         }
      }

      return var1;
   }

   public static class_5363<?> method_30077(class_9597 var0) {
      return method_26628(var1 -> new class_6579(var1, var0));
   }
}
