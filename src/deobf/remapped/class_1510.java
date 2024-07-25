package remapped;

import java.util.Optional;

public interface class_1510<T extends class_8932<?>> {
   class_1510<class_1504> field_7997 = method_6915("crafting");
   class_1510<class_3001> field_7995 = method_6915("smelting");
   class_1510<class_1422> field_7999 = method_6915("blasting");
   class_1510<class_4317> field_7994 = method_6915("smoking");
   class_1510<class_5917> field_7996 = method_6915("campfire_cooking");
   class_1510<class_5638> field_8000 = method_6915("stonecutting");
   class_1510<class_667> field_7998 = method_6915("smithing");

   static <T extends class_8932<?>> class_1510<T> method_6915(String var0) {
      return class_8669.<class_1510<?>, class_1510<T>>method_39792(class_8669.field_44435, new Identifier(var0), new class_6256(var0));
   }

   default <C extends class_6867> Optional<T> method_6914(class_8932<C> var1, class_6486 var2, C var3) {
      return !var1.method_41052(var3, var2) ? Optional.<T>empty() : Optional.<T>of((T)var1);
   }
}
