package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.util.List;

public class Class3058 implements Class2982 {
   public final Class3914 field18221;

   public Class3058(Class3914 var1) {
      this.field18221 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class6038 var4 = var1.method30580().method22465();
      String var5 = var1.<String>method30555(Class4750.field22539, 0);

      try {
         JsonElement var6 = Class9610.method37357().fromJson(var5, JsonElement.class);
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

         if (ViaVersion3.method27612().method21908()) {
            var8.add("supportedVersions", Class9610.method37357().toJsonTree(ViaVersion3.method27611().method33422()));
         }

         if (Class9019.field41258 == -1) {
            Class9019.field41258 = ViaVerList.getVersionByNumber(var7).getVersionNumber();
         }

         Class5417 var9 = ViaVersion3.getInstance().method34424().<Class5417>method31084(Class5417.class);
         if (var9 == null) {
            var1.method30580().method22469(false);
            return;
         }

         int var10 = var9.method17012(var1.method30580());
         List var11 = null;
         if (var4.method18675() >= var10 || ViaVersion3.method27613().isConnectionSecure()) {
            var11 = Class9019.method33363(var4.method18675(), var10);
         }

         if (var11 != null) {
            if (var7 == var10 || var7 == 0) {
               ViaVerList var12 = ViaVerList.getVersionByNumber(var4.method18675());
               var8.addProperty("protocol", var12.getCombinedVersionNumber());
            }
         } else {
            var1.method30580().method22469(false);
         }

         if (ViaVersion3.method27612().method21942().contains(var4.method18675())) {
            var8.addProperty("protocol", -1);
         }

         var1.method30558(Class4750.field22539, 0, Class9610.method37357().toJson((JsonElement)var6));
      } catch (JsonParseException var13) {
         var13.printStackTrace();
      }
   }
}
