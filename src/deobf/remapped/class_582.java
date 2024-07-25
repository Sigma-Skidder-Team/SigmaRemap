package remapped;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface class_582 extends class_5719, class_4924, class_6755 {
   @Override
   default Stream<class_4190> method_6679(class_8145 var1, class_4092 var2, Predicate<class_8145> var3) {
      return class_5719.super.method_6679(var1, var2, var3);
   }

   @Override
   default boolean method_6678(class_8145 var1, class_4190 var2) {
      return class_5719.super.method_6678(var1, var2);
   }

   @Override
   default class_1331 method_22563(class_3801 var1, class_1331 var2) {
      return class_4924.super.method_22563(var1, var2);
   }

   class_6322 method_2755();

   default Optional<class_5621<class_6325>> method_2754(class_1331 var1) {
      return this.method_2755().<class_6325>method_28813(class_8669.field_44359).method_39800(this.method_22561(var1));
   }
}
