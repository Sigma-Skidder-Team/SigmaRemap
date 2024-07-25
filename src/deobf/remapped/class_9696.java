package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_9696 {
   private static String[] field_49321;
   private static final List<class_8861> field_49320 = Collections.<class_8861>synchronizedList(new ArrayList<class_8861>());
   private static boolean field_49322 = false;

   public static void method_44804(class_8861 var0) {
      if (field_49322) {
         var0.method_40748();
      } else {
         field_49320.add(var0);
      }
   }

   public static void method_44802() {
      if (!field_49322) {
         for (class_8861 var3 : field_49320) {
            var3.method_40748();
         }

         field_49322 = true;
      }
   }
}
