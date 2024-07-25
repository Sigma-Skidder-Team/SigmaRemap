package remapped;

import com.google.common.collect.ImmutableMap;

public class class_3631 extends class_5920<class_5834> {
   private static String[] field_17725;
   private final int field_17724;

   public class_3631(class_6044<?> var1, int var2) {
      super(ImmutableMap.of(class_6044.field_30884, class_561.field_3319, class_6044.field_30860, class_561.field_3318, var1, class_561.field_3320));
      this.field_17724 = var2;
   }

   @Override
   public void method_27080(class_6331 var1, class_5834 var2, long var3) {
      var2.method_26525().method_5107(class_6044.field_30860, true, (long)this.field_17724);
      var2.method_26525().method_5127(class_6044.field_30884);
   }
}
