package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.util.function.Predicate;

public class class_8938 {
   public static final class_8938 field_45798 = new class_8938(new class_7279[0]);
   private final class_7279[] field_45799;
   private final Predicate<class_2792> field_45797;

   private class_8938(class_7279[] var1) {
      this.field_45799 = var1;
      this.field_45797 = class_5110.<class_2792>method_23432(var1);
   }

   public static class_8938 method_41068(class_7279... var0) {
      return new class_8938(var0);
   }

   public static class_8938 method_41065(JsonObject var0, String var1, class_8096 var2) {
      JsonElement var5 = var0.get(var1);
      return method_41066(var1, var2, var5);
   }

   public static class_8938[] method_41070(JsonObject var0, String var1, class_8096 var2) {
      JsonElement var5 = var0.get(var1);
      if (var5 != null && !var5.isJsonNull()) {
         JsonArray var6 = class_6539.method_29786(var5, var1);
         class_8938[] var7 = new class_8938[var6.size()];

         for (int var8 = 0; var8 < var6.size(); var8++) {
            var7[var8] = method_41066(var1 + "[" + var8 + "]", var2, var6.get(var8));
         }

         return var7;
      } else {
         return new class_8938[0];
      }
   }

   private static class_8938 method_41066(String var0, class_8096 var1, JsonElement var2) {
      if (var2 != null && var2.isJsonArray()) {
         class_7279[] var6 = var1.method_36782(var2.getAsJsonArray(), var1.method_36783().toString() + "/" + var0, class_4933.field_25573);
         return new class_8938(var6);
      } else {
         class_865 var5 = class_865.method_3740(var2);
         return method_41064(var5);
      }
   }

   public static class_8938 method_41064(class_865 var0) {
      if (var0 != class_865.field_4485) {
         class_7279 var3 = class_2338.method_10704(class_5848.field_29714, var0).method_25791();
         return new class_8938(new class_7279[]{var3});
      } else {
         return field_45798;
      }
   }

   public boolean method_41071(class_2792 var1) {
      return this.field_45797.test(var1);
   }

   public JsonElement method_41067(class_3630 var1) {
      return (JsonElement)(this.field_45799.length != 0 ? var1.method_16920(this.field_45799) : JsonNull.INSTANCE);
   }

   public static JsonElement method_41072(class_8938[] var0, class_3630 var1) {
      if (var0.length == 0) {
         return JsonNull.INSTANCE;
      } else {
         JsonArray var4 = new JsonArray();

         for (class_8938 var8 : var0) {
            var4.add(var8.method_41067(var1));
         }

         return var4;
      }
   }
}
