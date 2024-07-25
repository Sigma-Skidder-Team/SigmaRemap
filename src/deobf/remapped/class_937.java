package remapped;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_937 extends class_4424<GameProfile> {
   public class_937(GameProfile var1) {
      this(var1, (Date)null, (String)null, (Date)null, (String)null);
   }

   public class_937(GameProfile var1, Date var2, String var3, Date var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   public class_937(JsonObject var1) {
      super(method_4058(var1), var1);
   }

   @Override
   public void method_37664(JsonObject var1) {
      if (this.method_37661() != null) {
         var1.addProperty("uuid", this.method_37661().getId() != null ? this.method_37661().getId().toString() : "");
         var1.addProperty("name", this.method_37661().getName());
         super.method_37664(var1);
      }
   }

   @Override
   public ITextComponent method_20565() {
      GameProfile var3 = this.method_37661();
      return new StringTextComponent(var3.getName() == null ? Objects.toString(var3.getId(), "(Unknown)") : var3.getName());
   }

   private static GameProfile method_4058(JsonObject var0) {
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
