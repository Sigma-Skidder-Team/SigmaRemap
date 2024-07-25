package remapped;

import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.HashSet;
import java.util.Map.Entry;

public class class_9132 implements class_6146<class_7317> {
   public class_7317 method_42033(JsonObject var1) {
      HashSet var4 = Sets.newHashSet();

      for (Entry var6 : var1.entrySet()) {
         String var7 = (String)var6.getKey();
         if (var7.length() > 16) {
            throw new JsonParseException("Invalid language->'" + var7 + "': language code must not be more than " + 16 + " characters long");
         }

         JsonObject var8 = class_6539.method_29782((JsonElement)var6.getValue(), "language");
         String var9 = class_6539.method_29796(var8, "region");
         String var10 = class_6539.method_29796(var8, "name");
         boolean var11 = class_6539.method_29772(var8, "bidirectional", false);
         if (var9.isEmpty()) {
            throw new JsonParseException("Invalid language->'" + var7 + "'->region: empty value");
         }

         if (var10.isEmpty()) {
            throw new JsonParseException("Invalid language->'" + var7 + "'->name: empty value");
         }

         if (!var4.add(new class_7395(var7, var9, var10, var11))) {
            throw new JsonParseException("Duplicate language->'" + var7 + "' defined");
         }
      }

      return new class_7317(var4);
   }

   @Override
   public String method_28196() {
      return "language";
   }
}
