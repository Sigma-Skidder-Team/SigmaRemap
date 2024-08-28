package mapped;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class Class3038 extends Class3032<List<Class8656>, List<Class8656>> {
   private static String[] field18190;

   public Class3038(Class4750 var1) {
      super(var1);
   }

   public List<Class8656> method11402(Class8563 var1, List<Class8656> var2) throws Exception {
      List<Class8656> var5 = new CopyOnWriteArrayList(var2);

      for (Class8656 var7 : var5) {
         if (var7.method31148() >= 5) {
            var7.method31149(var7.method31148() + 1);
         }
      }

      return var5;
   }
}
