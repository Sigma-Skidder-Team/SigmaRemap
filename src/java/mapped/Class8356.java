package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public interface Class8356 {
   void method29291(Class30 var1, List<Class30> var2);

   void method29292(Class30 var1, Supplier<Class30> var2, List<Class30> var3);

   Class30 method29293();

   int method29294(Class30 var1, Supplier<Class30> var2);

   int method29295(Class30 var1);

   default List<Class30> method29296(List<Class30> var1) {
      return this.method29298(var1, this::method29291);
   }

   default List<Class30> method29297(List<Class30> var1, Supplier<Class30> var2) {
      return this.method29298(var1, (var2x, var3) -> this.method29292(var2x, var2, var3));
   }

   default List<Class30> method29298(List<Class30> var1, BiConsumer<Class30, List<Class30>> var2) {
      ArrayList var5 = Lists.newArrayList();

      for (Class30 var7 : var1) {
         var2.accept(var7, var5);
      }

      return var5;
   }
}
