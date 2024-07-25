package remapped;

import com.google.common.collect.ImmutableMap;

public class class_5007<E extends class_5834> extends class_5920<E> {
   private static String[] field_25904;
   private final float field_25905;

   public class_5007(float var1) {
      super(
         ImmutableMap.of(
            class_6044.field_30874, class_561.field_3319, class_6044.field_30889, class_561.field_3318, class_6044.field_30903, class_561.field_3320
         )
      );
      this.field_25905 = var1;
   }

   @Override
   public boolean method_27088(class_6331 var1, E var2) {
      return !var2.isPassenger();
   }

   @Override
   public void method_27080(class_6331 var1, E var2, long var3) {
      if (!this.method_23050((E)var2)) {
         class_1225.method_5445(var2, this.method_23051((E)var2), this.field_25905, 1);
      } else {
         var2.method_37353(this.method_23051((E)var2));
      }
   }

   private boolean method_23050(E var1) {
      return this.method_23051((E)var1).method_37124(var1, 1.0);
   }

   private Entity method_23051(E var1) {
      return var1.method_26525().<Entity>method_5138(class_6044.field_30903).get();
   }
}
