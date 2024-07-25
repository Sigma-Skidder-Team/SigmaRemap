package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.bridge.game.GameVersion;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4028 implements GameVersion {
   private static final Logger field_19569 = LogManager.getLogger();
   public static final GameVersion field_19567 = new class_4028();
   private final String field_19562;
   private final String field_19570;
   private final boolean field_19566;
   private final int field_19568;
   private final int field_19561;
   private final int field_19564;
   private final Date field_19560;
   private final String field_19565;

   private class_4028() {
      this.field_19562 = UUID.randomUUID().toString().replaceAll("-", "");
      this.field_19570 = "1.16.4";
      this.field_19566 = true;
      this.field_19568 = 2584;
      this.field_19561 = class_7665.method_34676();
      this.field_19564 = 6;
      this.field_19560 = new Date();
      this.field_19565 = "1.16.4";
   }

   private class_4028(JsonObject var1) {
      this.field_19562 = class_6539.method_29796(var1, "id");
      this.field_19570 = class_6539.method_29796(var1, "name");
      this.field_19565 = class_6539.method_29796(var1, "release_target");
      this.field_19566 = class_6539.method_29771(var1, "stable");
      this.field_19568 = class_6539.method_29767(var1, "world_version");
      this.field_19561 = class_6539.method_29767(var1, "protocol_version");
      this.field_19564 = class_6539.method_29767(var1, "pack_version");
      this.field_19560 = Date.from(ZonedDateTime.parse(class_6539.method_29796(var1, "build_time")).toInstant());
   }

   public static GameVersion method_18550() {
      try (InputStream var2 = class_4028.class.getResourceAsStream("/version.json")) {
         if (var2 != null) {
            class_4028 var37;
            try (InputStreamReader var5 = new InputStreamReader(var2)) {
               var37 = new class_4028(class_6539.method_29805(var5));
            }

            return var37;
         } else {
            field_19569.warn("Missing version information!");
            return field_19567;
         }
      } catch (IOException | JsonParseException var36) {
         throw new IllegalStateException("Game version information is corrupt", var36);
      }
   }

   public String getId() {
      return this.field_19562;
   }

   public String getName() {
      return this.field_19570;
   }

   public String getReleaseTarget() {
      return this.field_19565;
   }

   public int getWorldVersion() {
      return this.field_19568;
   }

   public int getProtocolVersion() {
      return this.field_19561;
   }

   public int getPackVersion() {
      return this.field_19564;
   }

   public Date getBuildTime() {
      return this.field_19560;
   }

   public boolean isStable() {
      return this.field_19566;
   }
}
