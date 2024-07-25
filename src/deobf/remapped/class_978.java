package remapped;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface class_978 {
   class_978 field_5004 = (var0, var1) -> false;
   class_978 field_5005 = (var0, var1) -> true;

   boolean method_4277(class_2792 var1, Consumer<class_2283> var2);

   default class_978 method_4279(class_978 var1) {
      Objects.<class_978>requireNonNull(var1);
      return (var2, var3) -> this.method_4277(var2, var3) && var1.method_4277(var2, var3);
   }

   default class_978 method_4278(class_978 var1) {
      Objects.<class_978>requireNonNull(var1);
      return (var2, var3) -> this.method_4277(var2, var3) || var1.method_4277(var2, var3);
   }
}
