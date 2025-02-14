package mapped;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class Class6786 extends Class6787<GameProfile> {
   public Class6786(GameProfile var1) {
      this(var1, (Date)null, (String)null, (Date)null, (String)null);
   }

   public Class6786(GameProfile var1, Date var2, String var3, Date var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   public Class6786(JsonObject var1) {
      super(method20680(var1), var1);
   }

   @Override
   public void method20678(JsonObject var1) {
      if (this.method20686() != null) {
         var1.addProperty("uuid", this.method20686().getId() != null ? this.method20686().getId().toString() : "");
         var1.addProperty("name", this.method20686().getName());
         super.method20678(var1);
      }
   }

   @Override
   public ITextComponent method20679() {
      GameProfile var3 = this.method20686();
      return new StringTextComponent(var3.getName() == null ? Objects.toString(var3.getId(), "(Unknown)") : var3.getName());
   }

   private static GameProfile method20680(JsonObject var0) {
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
