package remapped;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class class_4939 {
   private static String[] field_25588;
   private static Deque<class_4625<Object>> field_25589 = new ArrayDeque<class_4625<Object>>();

   public static Iterator<Object> method_22642(List var0) {
      synchronized (field_25589) {
         Object var4 = field_25589.pollFirst();
         if (var4 == null) {
            var4 = new class_7517();
         }

         ((class_4625)var4).method_21420(var0);
         return (Iterator<Object>)var4;
      }
   }

   private static void method_22641(class_4625<Object> var0) {
      synchronized (field_25589) {
         if (field_25589.size() <= 1000) {
            var0.method_21420((List)null);
            field_25589.addLast(var0);
         }
      }
   }

   static {
      for (int var2 = 0; var2 < 1000; var2++) {
         class_7517 var3 = new class_7517();
         field_25589.add(var3);
      }
   }
}
