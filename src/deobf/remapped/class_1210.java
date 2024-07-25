package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;

public class class_1210 {
   public String field_6749;
   public String field_6748;
   public String field_6746;
   private final class_9075 field_6750;

   public class_1210(String var1, String var2, String var3, String var4) {
      this.field_6749 = var1;
      this.field_6748 = var2;
      this.field_6746 = var3;
      this.field_6750 = class_9075.method_41657(var4);
   }

   public String method_5369() {
      return "token:" + this.field_6746 + ":" + this.field_6748;
   }

   public String method_5367() {
      return this.field_6748;
   }

   public String method_5366() {
      return this.field_6749;
   }

   public String method_5365() {
      return this.field_6746;
   }

   public GameProfile method_5370() {
      try {
         UUID var3 = UUIDTypeAdapter.fromString(this.method_5367());
         return new GameProfile(var3, this.method_5366());
      } catch (IllegalArgumentException var4) {
         return new GameProfile((UUID)null, this.method_5366());
      }
   }
}
