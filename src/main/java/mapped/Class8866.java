package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.function.Function;

public class Class8866<T> {
   private final String field40058;
   private final Function<T, JsonElement> field40059;

   public Class8866(String var1, Function<T, JsonElement> var2) {
      this.field40058 = var1;
      this.field40059 = var2;
   }

   public Class8767 method32265(T var1) {
      return new Class8767(var1);
   }

   @Override
   public String toString() {
      return this.field40058;
   }

   // $VF: synthetic method
   public static String method32266(Class8866 var0) {
      return var0.field40058;
   }

   // $VF: synthetic method
   public static Function method32267(Class8866 var0) {
      return var0.field40059;
   }

   public class Class8767 {
      private final T field39459;

      public Class8767(T var1) {
         this.field39459 = var1;
      }

      public void method31624(JsonObject var1) {
         var1.add(method32266(Class8866.this), (JsonElement) method32267(Class8866.this).apply(this.field39459));
      }

      @Override
      public String toString() {
         return method32266(Class8866.this) + "=" + this.field39459;
      }
   }
}
