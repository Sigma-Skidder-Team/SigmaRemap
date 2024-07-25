package remapped;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class class_5090 extends class_8227<GameProfile> {
   public class_5090(GameProfile var1) {
      super(var1);
   }

   public class_5090(JsonObject var1) {
      super(method_23392(var1));
   }

   @Override
   public void method_37664(JsonObject var1) {
      if (this.method_37661() != null) {
         var1.addProperty("uuid", this.method_37661().getId() != null ? this.method_37661().getId().toString() : "");
         var1.addProperty("name", this.method_37661().getName());
      }
   }

   private static GameProfile method_23392(JsonObject var0) {
      if (var0.has("uuid") && var0.has("name")) {
         String var3 = var0.get("uuid").getAsString();

         UUID var4;
         try {
            var4 = UUID.fromString(var3);
         } catch (Throwable var6) {
            return null;
         }

         return new GameProfile(var4, var0.get("name").getAsString());
      } else {
         return null;
      }
   }
}
