package remapped;

import java.util.Collections;
import java.util.List;

public class class_596 {
   private static String[] field_3438;

   private class_596() {
   }

   public static <E> List<E> method_2800(E[] var0) {
      return (List<E>)(var0.length != 0 ? new class_1416<E>((E[])var0) : Collections.<E>emptyList());
   }

   public static <E> List<E> method_2801(E[] var0, E[] var1) {
      Object var4;
      if (var0.length != 0) {
         if (var1.length != 0) {
            var4 = new class_6431<Object>(var0, var1);
         } else {
            var4 = method_2800(var0);
         }
      } else {
         var4 = method_2800(var1);
      }

      return (List<E>)var4;
   }
}
