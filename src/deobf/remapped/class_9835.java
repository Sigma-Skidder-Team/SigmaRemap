package remapped;

import java.util.Arrays;
import java.util.HashSet;

public class class_9835 {
   private static String[] field_49810;

   public static void method_45329(class_5916[] var0, class_5916[] var1) {
      HashSet var4 = new HashSet();

      for (int var5 = 0; var5 < var1.length; var5++) {
         class_5916 var6 = var1[var5];
         var4.add(var6.method_27069());
      }

      HashSet var9 = new HashSet<class_5916>(Arrays.asList(var0));
      var9.removeAll(Arrays.<class_5916>asList(var1));

      for (class_5916 var7 : var9) {
         String var8 = var7.method_27069();
         if (var4.contains(var8)) {
            var7.method_27057(class_9732.field_49455);
         }
      }
   }
}
