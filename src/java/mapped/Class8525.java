package mapped;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class Class8525 {
   private static String[] field38293;
   private static Deque<Class4542<Object>> field38294 = new ArrayDeque<Class4542<Object>>();

   public static Iterator<Object> method30227(List var0) {
      synchronized (field38294) {
         Object var4 = field38294.pollFirst();
         if (var4 == null) {
            var4 = new Class4543();
         }

         ((Class4542)var4).method14496(var0);
         return (Iterator<Object>)var4;
      }
   }

   private static void method30228(Class4542<Object> var0) {
      synchronized (field38294) {
         if (field38294.size() <= 1000) {
            var0.method14496((List)null);
            field38294.addLast(var0);
         }
      }
   }

   // $VF: synthetic method
   public static void method30229(Class4542 var0) {
      method30228(var0);
   }

   static {
      for (int var2 = 0; var2 < 1000; var2++) {
         Class4543 var3 = new Class4543();
         field38294.add(var3);
      }
   }
}
