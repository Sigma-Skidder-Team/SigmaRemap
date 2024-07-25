package remapped;

import com.google.common.base.Joiner;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;

public abstract class class_6411 {
   public static final class_6411 field_32747 = new class_7678();
   private static final Joiner field_32748 = Joiner.on(", ");

   public abstract boolean method_29249(class_6629<?> var1);

   public abstract JsonElement method_29250();

   public static class_6411 method_29245(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         String var3 = class_6539.method_29795(var0, "type");
         if (!var3.startsWith("#")) {
            Identifier var6 = new Identifier(var3);
            class_6629 var5 = class_8669.field_44400
               .method_39794(var6)
               .orElseThrow(
                  () -> new JsonSyntaxException(
                        "Unknown entity type '" + var6 + "', valid types are: " + field_32748.join(class_8669.field_44400.method_39805())
                     )
               );
            return new class_7009(var5);
         } else {
            Identifier var4 = new Identifier(var3.substring(1));
            return new class_8118(class_8410.method_38721().method_29389().method_43145(var4));
         }
      } else {
         return field_32747;
      }
   }

   public static class_6411 method_29248(class_6629<?> var0) {
      return new class_7009(var0);
   }

   public static class_6411 method_29247(class_2307<class_6629<?>> var0) {
      return new class_8118(var0);
   }
}
