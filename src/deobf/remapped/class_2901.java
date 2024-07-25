package remapped;

import com.google.common.collect.ImmutableMap;

public class class_2901 extends class_5920<class_7666> {
   private static String[] field_14166;

   public class_2901() {
      super(ImmutableMap.of());
   }

   public void method_13269(class_6331 var1, class_7666 var2, long var3) {
      boolean var7 = class_3163.method_14600(var2) || class_3163.method_14598(var2) || method_13270(var2);
      if (!var7) {
         var2.method_26525().method_5127(class_6044.field_30867);
         var2.method_26525().method_5127(class_6044.field_30859);
         var2.method_26525().method_5132(var1.method_29584(), var1.method_29546());
      }
   }

   private static boolean method_13270(class_7666 var0) {
      return var0.method_26525().<LivingEntity>method_5138(class_6044.field_30859).filter(var1 -> var1.method_37275(var0) <= 36.0).isPresent();
   }
}
