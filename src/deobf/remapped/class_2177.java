package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.List;

public class class_2177 implements class_857 {
   public class_2177(class_9353 var1) {
      this.field_10841 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_3790 var4 = var1.method_23255().method_6744();
      String var5 = var1.<String>method_23248(class_8039.field_41171, 0);

      try {
         Object var6 = (JsonElement)class_9012.method_41350().fromJson(var5, JsonElement.class);
         int var7 = 0;
         JsonObject var8;
         if (var6.isJsonObject()) {
            if (var6.getAsJsonObject().has("version")) {
               var8 = var6.getAsJsonObject().get("version").getAsJsonObject();
               if (var8.has("protocol")) {
                  var7 = Long.valueOf(var8.get("protocol").getAsLong()).intValue();
               }
            } else {
               var6.getAsJsonObject().add("version", var8 = new JsonObject());
            }
         } else {
            var6 = new JsonObject();
            var6.getAsJsonObject().add("version", var8 = new JsonObject());
         }

         if (class_3446.method_15884().method_25808()) {
            var8.add("supportedVersions", class_9012.method_41350().toJsonTree(class_3446.method_15885().method_38374()));
         }

         if (class_6710.field_34660 == -1) {
            class_6710.field_34660 = class_412.method_2051(var7).method_2056();
         }

         class_2070 var9 = class_3446.method_15883().method_33743().<class_2070>method_24490(class_2070.class);
         if (var9 == null) {
            var1.method_23255().method_6718(false);
            return;
         }

         int var10 = var9.method_9669(var1.method_23255());
         List var11 = null;
         if (var4.method_17604() >= var10 || class_3446.method_15886().method_34629()) {
            var11 = class_6710.method_30789(var4.method_17604(), var10);
         }

         if (var11 != null) {
            if (var7 == var10 || var7 == 0) {
               class_412 var12 = class_412.method_2051(var4.method_17604());
               var8.addProperty("protocol", var12.method_2047());
            }
         } else {
            var1.method_23255().method_6718(false);
         }

         if (class_3446.method_15884().method_25842().contains(var4.method_17604())) {
            var8.addProperty("protocol", -1);
         }

         var1.method_23257(class_8039.field_41171, 0, class_9012.method_41350().toJson((JsonElement)var6));
      } catch (JsonParseException var13) {
         var13.printStackTrace();
      }
   }
}
