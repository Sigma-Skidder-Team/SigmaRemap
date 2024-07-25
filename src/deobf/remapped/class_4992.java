package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

public class class_4992 {
   private static String[] field_25837;

   public static class_1549 method_22956(Iterator<class_1549> var0, int var1) {
      if (var0 == null) {
         return null;
      } else if (var1 < 0) {
         return null;
      } else {
         for (int var4 = 0; var4 < var1; var4++) {
            if (!var0.hasNext()) {
               return null;
            }

            class_1549 var5 = (class_1549)var0.next();
         }

         return var0.hasNext() ? (class_1549)var0.next() : null;
      }
   }

   public static class_1549 method_22955(ImmutableList<class_1549> var0, int var1) {
      if (var0 != null) {
         if (var1 >= 0) {
            return var1 < var0.size() ? (class_1549)var0.get(var1) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
