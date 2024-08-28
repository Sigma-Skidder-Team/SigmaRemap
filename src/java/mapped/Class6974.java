package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;

public class Class6974 {
   public String field30184;
   public String field30185;
   public String field30186;
   private final Class2147 field30187;

   public Class6974(String var1, String var2, String var3, String var4) {
      this.field30184 = var1;
      this.field30185 = var2;
      this.field30186 = var3;
      this.field30187 = Class2147.method8850(var4);
   }

   public String method21524() {
      return "token:" + this.field30186 + ":" + this.field30185;
   }

   public String method21525() {
      return this.field30185;
   }

   public String method21526() {
      return this.field30184;
   }

   public String method21527() {
      return this.field30186;
   }

   public GameProfile method21528() {
      try {
         UUID var3 = UUIDTypeAdapter.fromString(this.method21525());
         return new GameProfile(var3, this.method21526());
      } catch (IllegalArgumentException var4) {
         return new GameProfile((UUID)null, this.method21526());
      }
   }
}
