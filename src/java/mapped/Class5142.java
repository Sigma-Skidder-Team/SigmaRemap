package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class5142 implements Class5141 {
   private final Map<Class8550<?>, String> field23364 = Maps.newHashMap();

   private static <T extends Comparable<T>> String method15921(Class8550<T> var0, Stream<T> var1) {
      return var1.<CharSequence>map(var0::method30475).collect(Collectors.joining("|"));
   }

   private static <T extends Comparable<T>> String method15922(Class8550<T> var0, T var1, T[] var2) {
      return method15921(var0, Stream.<T>concat(Stream.of((T)var1), Stream.of((T[])var2)));
   }

   private <T extends Comparable<T>> void method15923(Class8550<T> var1, String var2) {
      String var5 = this.field23364.put(var1, var2);
      if (var5 != null) {
         throw new IllegalStateException("Tried to replace " + var1 + " value from " + var5 + " to " + var2);
      }
   }

   public final <T extends Comparable<T>> Class5142 method15924(Class8550<T> var1, T var2) {
      this.method15923(var1, var1.method30475((T)var2));
      return this;
   }

   @SafeVarargs
   public final <T extends Comparable<T>> Class5142 method15925(Class8550<T> var1, T var2, T... var3) {
      this.method15923(var1, method15922(var1, (T)var2, (T[])var3));
      return this;
   }

   public JsonElement get() {
      JsonObject var3 = new JsonObject();
      this.field23364.forEach((var1, var2) -> var3.addProperty(var1.method30472(), var2));
      return var3;
   }

   @Override
   public void method15918(Class9348<?, ?> var1) {
      List var4 = this.field23364.keySet().stream().filter(var1x -> var1.method35396(var1x.method30472()) != var1x).collect(Collectors.toList());
      if (!var4.isEmpty()) {
         throw new IllegalStateException("Properties " + var4 + " are missing from " + var1);
      }
   }
}
