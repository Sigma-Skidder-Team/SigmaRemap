package remapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Supplier;

public class class_383<T extends ArgumentType<?>> implements class_5590<T> {
   private static String[] field_1557;
   private final Supplier<T> field_1556;

   public class_383(Supplier<T> var1) {
      this.field_1556 = var1;
   }

   @Override
   public void method_25391(T var1, class_8248 var2) {
   }

   @Override
   public T method_25389(class_8248 var1) {
      return this.field_1556.get();
   }

   @Override
   public void method_25390(T var1, JsonObject var2) {
   }
}
