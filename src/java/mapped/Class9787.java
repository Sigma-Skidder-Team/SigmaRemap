package mapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class9787 {
   private static String[] field45757;
   private static final List<Class6632> field45758 = Collections.<Class6632>synchronizedList(new ArrayList<Class6632>());
   private static boolean field45759 = false;

   public static void method38574(Class6632 var0) {
      if (field45759) {
         var0.method20232();
      } else {
         field45758.add(var0);
      }
   }

   public static void method38575() {
      if (!field45759) {
         for (Class6632 var3 : field45758) {
            var3.method20232();
         }

         field45759 = true;
      }
   }
}
