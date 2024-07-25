package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public interface class_4885 {
   void method_22411(class_8406 var1, List<class_8406> var2);

   void method_22409(class_8406 var1, Supplier<class_8406> var2, List<class_8406> var3);

   class_8406 method_22407();

   int method_22412(class_8406 var1, Supplier<class_8406> var2);

   int method_22410(class_8406 var1);

   default List<class_8406> method_22413(List<class_8406> var1) {
      return this.method_22408(var1, this::method_22411);
   }

   default List<class_8406> method_22414(List<class_8406> var1, Supplier<class_8406> var2) {
      return this.method_22408(var1, (var2x, var3) -> this.method_22409(var2x, var2, var3));
   }

   default List<class_8406> method_22408(List<class_8406> var1, BiConsumer<class_8406, List<class_8406>> var2) {
      ArrayList var5 = Lists.newArrayList();

      for (class_8406 var7 : var1) {
         var2.accept(var7, var5);
      }

      return var5;
   }
}
