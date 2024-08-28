package mapped;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class Class6791 extends Class6789<GameProfile> {
   public Class6791(GameProfile var1) {
      super(var1);
   }

   public Class6791(JsonObject var1) {
      super(method20690(var1));
   }

   @Override
   public void method20678(JsonObject var1) {
      if (this.method20686() != null) {
         var1.addProperty("uuid", this.method20686().getId() != null ? this.method20686().getId().toString() : "");
         var1.addProperty("name", this.method20686().getName());
      }
   }

   private static GameProfile method20690(JsonObject var0) {
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
