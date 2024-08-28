package mapped;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

public class Class8542 {
   private static String[] field38399;

   public static Class7219 method30390(Iterator<Class7219> var0, int var1) {
      if (var0 == null) {
         return null;
      } else if (var1 < 0) {
         return null;
      } else {
         for (int var4 = 0; var4 < var1; var4++) {
            if (!var0.hasNext()) {
               return null;
            }

            Class7219 var5 = (Class7219)var0.next();
         }

         return var0.hasNext() ? (Class7219)var0.next() : null;
      }
   }

   public static Class7219 method30391(ImmutableList<Class7219> var0, int var1) {
      if (var0 != null) {
         if (var1 >= 0) {
            return var1 < var0.size() ? (Class7219)var0.get(var1) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
