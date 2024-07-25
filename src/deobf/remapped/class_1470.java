package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class_1470 implements class_5496 {
   private final Map<class_5019<?>, String> field_7891 = Maps.newHashMap();

   private static <T extends Comparable<T>> String method_6793(class_5019<T> var0, Stream<T> var1) {
      return var1.<CharSequence>map(var0::method_23110).collect(Collectors.joining("|"));
   }

   private static <T extends Comparable<T>> String method_6795(class_5019<T> var0, T var1, T[] var2) {
      return method_6793(var0, Stream.<T>concat(Stream.of((T)var1), Stream.of((T[])var2)));
   }

   private <T extends Comparable<T>> void method_6796(class_5019<T> var1, String var2) {
      String var5 = this.field_7891.put(var1, var2);
      if (var5 != null) {
         throw new IllegalStateException("Tried to replace " + var1 + " value from " + var5 + " to " + var2);
      }
   }

   public final <T extends Comparable<T>> class_1470 method_6792(class_5019<T> var1, T var2) {
      this.method_6796(var1, var1.method_23110((T)var2));
      return this;
   }

   @SafeVarargs
   public final <T extends Comparable<T>> class_1470 method_6797(class_5019<T> var1, T var2, T... var3) {
      this.method_6796(var1, method_6795(var1, (T)var2, (T[])var3));
      return this;
   }

   public JsonElement get() {
      JsonObject var3 = new JsonObject();
      this.field_7891.forEach((var1, var2) -> var3.addProperty(var1.method_23109(), var2));
      return var3;
   }

   @Override
   public void method_24963(class_8021<?, ?> var1) {
      List var4 = this.field_7891.keySet().stream().filter(var1x -> var1.method_36440(var1x.method_23109()) != var1x).collect(Collectors.toList());
      if (!var4.isEmpty()) {
         throw new IllegalStateException("Properties " + var4 + " are missing from " + var1);
      }
   }
}
