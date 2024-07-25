package remapped;

import com.google.common.collect.ImmutableMap;

public class class_4623 extends class_5920<class_7666> {
   private static String[] field_22501;

   public class_4623() {
      super(ImmutableMap.of(class_6044.field_30883, class_561.field_3318));
   }

   public boolean method_21402(class_6331 var1, class_7666 var2) {
      class_3047 var5 = var2.method_15891();
      return var5.method_13910() != class_4466.field_21775
         && var5.method_13910() != class_4466.field_21771
         && var2.method_973() == 0
         && var5.method_13906() <= 1;
   }

   public void method_21401(class_6331 var1, class_7666 var2, long var3) {
      var2.method_34716(var2.method_15891().method_13909(class_4466.field_21775));
      var2.method_34706(var1);
   }
}
