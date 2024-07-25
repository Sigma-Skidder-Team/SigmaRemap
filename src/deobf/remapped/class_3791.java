package remapped;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class class_3791 extends class_8227<GameProfile> {
   private final int field_18516;
   private final boolean field_18518;

   public class_3791(GameProfile var1, int var2, boolean var3) {
      super(var1);
      this.field_18516 = var2;
      this.field_18518 = var3;
   }

   public class_3791(JsonObject var1) {
      super(method_17608(var1));
      this.field_18516 = !var1.has("level") ? 0 : var1.get("level").getAsInt();
      this.field_18518 = var1.has("bypassesPlayerLimit") && var1.get("bypassesPlayerLimit").getAsBoolean();
   }

   public int method_17607() {
      return this.field_18516;
   }

   public boolean method_17606() {
      return this.field_18518;
   }

   @Override
   public void method_37664(JsonObject var1) {
      if (this.method_37661() != null) {
         var1.addProperty("uuid", this.method_37661().getId() != null ? this.method_37661().getId().toString() : "");
         var1.addProperty("name", this.method_37661().getName());
         var1.addProperty("level", this.field_18516);
         var1.addProperty("bypassesPlayerLimit", this.field_18518);
      }
   }

   private static GameProfile method_17608(JsonObject var0) {
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
