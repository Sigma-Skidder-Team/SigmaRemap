package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class class_1827 {
   public static final class_1827 field_9269 = new class_1827(ImmutableList.of());
   private final List<class_9111> field_9268;

   private static class_9111 method_8083(String var0, JsonElement var1) {
      if (!var1.isJsonPrimitive()) {
         JsonObject var7 = class_6539.method_29782(var1, "value");
         String var5 = !var7.has("min") ? null : method_8080(var7.get("min"));
         String var6 = !var7.has("max") ? null : method_8080(var7.get("max"));
         return (class_9111)(var5 != null && var5.equals(var6) ? new class_9817(var0, var5) : new class_5366(var0, var5, var6));
      } else {
         String var4 = var1.getAsString();
         return new class_9817(var0, var4);
      }
   }

   @Nullable
   private static String method_8080(JsonElement var0) {
      return !var0.isJsonNull() ? var0.getAsString() : null;
   }

   private class_1827(List<class_9111> var1) {
      this.field_9268 = ImmutableList.copyOf(var1);
   }

   public <S extends class_2243<?, S>> boolean method_8082(class_8021<?, S> var1, S var2) {
      for (class_9111 var6 : this.field_9268) {
         if (!var6.method_41961(var1, (S)var2)) {
            return false;
         }
      }

      return true;
   }

   public boolean method_8076(class_2522 var1) {
      return this.method_8082(var1.method_8360().method_29306(), var1);
   }

   public boolean method_8077(class_4774 var1) {
      return this.method_8082(var1.method_22005().method_10720(), var1);
   }

   public void method_8075(class_8021<?, ?> var1, Consumer<String> var2) {
      this.field_9268.forEach(var2x -> var2x.method_41956(var1, var2));
   }

   public static class_1827 method_8079(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "properties");
         ArrayList var4 = Lists.newArrayList();

         for (Entry var6 : var3.entrySet()) {
            var4.add(method_8083((String)var6.getKey(), (JsonElement)var6.getValue()));
         }

         return new class_1827(var4);
      } else {
         return field_9269;
      }
   }

   public JsonElement method_8078() {
      if (this != field_9269) {
         JsonObject var3 = new JsonObject();
         if (!this.field_9268.isEmpty()) {
            this.field_9268.forEach(var1 -> var3.add(var1.method_41957(), var1.method_41960()));
         }

         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
