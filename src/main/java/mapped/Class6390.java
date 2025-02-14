package mapped;

import java.util.Collections;
import java.util.List;

public class Class6390 {
   private static String[] field27971;

   private Class6390() {
   }

   public static <E> List<E> method19422(E[] var0) {
      return (List<E>)(var0.length != 0 ? new Class2358<E>((E[])var0) : Collections.<E>emptyList());
   }

   public static <E> List<E> method19423(E[] var0, E[] var1) {
      Object var4;
      if (var0.length != 0) {
         if (var1.length != 0) {
            var4 = new Class24<Object>(var0, var1);
         } else {
            var4 = method19422(var0);
         }
      } else {
         var4 = method19422(var1);
      }

      return (List<E>)var4;
   }
}
