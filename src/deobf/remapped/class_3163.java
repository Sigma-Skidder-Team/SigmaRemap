package remapped;

import com.google.common.collect.ImmutableMap;

public class class_3163 extends class_5920<class_7666> {
   private static String[] field_15735;

   public class_3163() {
      super(ImmutableMap.of());
   }

   public boolean method_14599(class_6331 var1, class_7666 var2, long var3) {
      return method_14600(var2) || method_14598(var2);
   }

   public void method_14597(class_6331 var1, class_7666 var2, long var3) {
      if (method_14600(var2) || method_14598(var2)) {
         class_1150 var7 = var2.method_26525();
         if (!var7.method_5134(class_6275.field_32071)) {
            var7.method_5127(class_6044.field_30888);
            var7.method_5127(class_6044.field_30889);
            var7.method_5127(class_6044.field_30874);
            var7.method_5127(class_6044.field_30892);
            var7.method_5127(class_6044.field_30861);
         }

         var7.method_5113(class_6275.field_32071);
      }
   }

   public void method_14596(class_6331 var1, class_7666 var2, long var3) {
      if (var3 % 100L == 0L) {
         var2.method_34712(var1, var3, 3);
      }
   }

   public static boolean method_14598(class_5834 var0) {
      return var0.method_26525().method_5117(class_6044.field_30896);
   }

   public static boolean method_14600(class_5834 var0) {
      return var0.method_26525().method_5117(class_6044.field_30867);
   }
}
