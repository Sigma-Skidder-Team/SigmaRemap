package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class class_1079 {
   private final List<class_2749> field_5878 = Lists.newArrayList();

   public static class_1079 method_4726() {
      return new class_1079();
   }

   public class_1079 method_4722(class_2749 var1) {
      this.field_5878.add(var1);
      return this;
   }

   public class_1079 method_4729(class_5503 var1, String var2) {
      return this.method_4722(new class_2749(var1, var2, null));
   }

   public class_1079 method_4730(Identifier var1, String var2) {
      return this.method_4729(new class_4289(var1), var2);
   }

   public class_1079 method_4723(Identifier var1, String var2) {
      return this.method_4729(new class_5091(var1), var2);
   }

   public <T> Optional<class_2307<T>> method_4719(Function<Identifier, class_2307<T>> var1, Function<Identifier, T> var2) {
      Builder var5 = ImmutableSet.builder();

      for (class_2749 var7 : this.field_5878) {
         if (!var7.method_12388().method_24969(var1, var2, var5::add)) {
            return Optional.<class_2307<T>>empty();
         }
      }

      return Optional.<class_2307<T>>of(class_2307.<T>method_10607(var5.build()));
   }

   public Stream<class_2749> method_4720() {
      return this.field_5878.stream();
   }

   public <T> Stream<class_2749> method_4727(Function<Identifier, class_2307<T>> var1, Function<Identifier, T> var2) {
      return this.method_4720().filter(var2x -> !var2x.method_12388().method_24969(var1, var2, var0x -> {
         }));
   }

   public class_1079 method_4728(JsonObject var1, String var2) {
      JsonArray var5 = class_6539.method_29787(var1, "values");
      ArrayList var6 = Lists.newArrayList();

      for (JsonElement var8 : var5) {
         var6.add(method_4724(var8));
      }

      if (class_6539.method_29772(var1, "replace", false)) {
         this.field_5878.clear();
      }

      var6.forEach(var2x -> this.field_5878.add(new class_2749(var2x, var2, null)));
      return this;
   }

   private static class_5503 method_4724(JsonElement var0) {
      String var3;
      boolean var4;
      if (!var0.isJsonObject()) {
         var3 = class_6539.method_29795(var0, "id");
         var4 = true;
      } else {
         JsonObject var5 = var0.getAsJsonObject();
         var3 = class_6539.method_29796(var5, "id");
         var4 = class_6539.method_29772(var5, "required", true);
      }

      if (!var3.startsWith("#")) {
         Identifier var7 = new Identifier(var3);
         return (class_5503)(!var4 ? new class_3833(var7) : new class_4289(var7));
      } else {
         Identifier var6 = new Identifier(var3.substring(1));
         return (class_5503)(!var4 ? new class_9585(var6) : new class_5091(var6));
      }
   }

   public JsonObject method_4721() {
      JsonObject var3 = new JsonObject();
      JsonArray var4 = new JsonArray();

      for (class_2749 var6 : this.field_5878) {
         var6.method_12388().method_24970(var4);
      }

      var3.addProperty("replace", false);
      var3.add("values", var4);
      return var3;
   }
}
