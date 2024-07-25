package remapped;

import com.mojang.bridge.game.GameSession;
import java.util.UUID;

public class class_7491 implements GameSession {
   private final int field_38223;
   private final boolean field_38222;
   private final String field_38227;
   private final String field_38226;
   private final UUID field_38225;

   public class_7491(class_174 var1, class_5989 var2, class_1092 var3) {
      this.field_38223 = var3.method_4798().size();
      this.field_38222 = !var3.method_9091().method_23500();
      this.field_38227 = var1.method_43370().method_2098();
      class_753 var6 = var3.method_4800(var2.method_37328());
      if (var6 == null) {
         this.field_38226 = "unknown";
      } else {
         this.field_38226 = var6.method_3393().getName();
      }

      this.field_38225 = var3.method_4815();
   }

   public int getPlayerCount() {
      return this.field_38223;
   }

   public boolean isRemoteServer() {
      return this.field_38222;
   }

   public String getDifficulty() {
      return this.field_38227;
   }

   public String getGameMode() {
      return this.field_38226;
   }

   public UUID getSessionId() {
      return this.field_38225;
   }
}
