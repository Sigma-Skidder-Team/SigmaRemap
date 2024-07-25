package remapped;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class class_9803 extends class_2526<List<class_5407>, List<class_5407>> {
   private static String[] field_49701;

   public class_9803(class_8039 var1) {
      super(var1);
   }

   public List<class_5407> method_45217(class_5051 var1, List<class_5407> var2) throws Exception {
      CopyOnWriteArrayList var5 = new CopyOnWriteArrayList(var2);

      for (class_5407 var7 : var5) {
         if (var7.method_24602() >= 5) {
            var7.method_24605(var7.method_24602() + 1);
         }
      }

      return var5;
   }
}
