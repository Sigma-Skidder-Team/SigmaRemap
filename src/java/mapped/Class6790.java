package mapped;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class Class6790 extends Class6789<GameProfile> {
   private final int field29585;
   private final boolean field29586;

   public Class6790(GameProfile var1, int var2, boolean var3) {
      super(var1);
      this.field29585 = var2;
      this.field29586 = var3;
   }

   public Class6790(JsonObject var1) {
      super(method20689(var1));
      this.field29585 = !var1.has("level") ? 0 : var1.get("level").getAsInt();
      this.field29586 = var1.has("bypassesPlayerLimit") && var1.get("bypassesPlayerLimit").getAsBoolean();
   }

   public int method20687() {
      return this.field29585;
   }

   public boolean method20688() {
      return this.field29586;
   }

   @Override
   public void method20678(JsonObject var1) {
      if (this.method20686() != null) {
         var1.addProperty("uuid", this.method20686().getId() != null ? this.method20686().getId().toString() : "");
         var1.addProperty("name", this.method20686().getName());
         var1.addProperty("level", this.field29585);
         var1.addProperty("bypassesPlayerLimit", this.field29586);
      }
   }

   private static GameProfile method20689(JsonObject var0) {
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
