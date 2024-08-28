package mapped;

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

public class Class8245 implements GameVersion {
   private static final Logger field35423 = LogManager.getLogger();
   public static final GameVersion field35424 = new Class8245();
   private final String field35425;
   private final String field35426;
   private final boolean field35427;
   private final int field35428;
   private final int field35429;
   private final int field35430;
   private final Date field35431;
   private final String field35432;

   private Class8245() {
      this.field35425 = UUID.randomUUID().toString().replaceAll("-", "");
      this.field35426 = "1.16.4";
      this.field35427 = true;
      this.field35428 = 2584;
      this.field35429 = SharedConstants.method34774();
      this.field35430 = 6;
      this.field35431 = new Date();
      this.field35432 = "1.16.4";
   }

   private Class8245(JsonObject var1) {
      this.field35425 = JSONUtils.method32763(var1, "id");
      this.field35426 = JSONUtils.method32763(var1, "name");
      this.field35432 = JSONUtils.method32763(var1, "release_target");
      this.field35427 = JSONUtils.method32768(var1, "stable");
      this.field35428 = JSONUtils.method32777(var1, "world_version");
      this.field35429 = JSONUtils.method32777(var1, "protocol_version");
      this.field35430 = JSONUtils.method32777(var1, "pack_version");
      this.field35431 = Date.from(ZonedDateTime.parse(JSONUtils.method32763(var1, "build_time")).toInstant());
   }

   public static GameVersion method28760() {
      try (InputStream var2 = Class8245.class.getResourceAsStream("/version.json")) {
         if (var2 != null) {
            Class8245 var37;
            try (InputStreamReader var5 = new InputStreamReader(var2)) {
               var37 = new Class8245(JSONUtils.method32801(var5));
            }

            return var37;
         } else {
            field35423.warn("Missing version information!");
            return field35424;
         }
      } catch (IOException | JsonParseException var36) {
         throw new IllegalStateException("Game version information is corrupt", var36);
      }
   }

   public String getId() {
      return this.field35425;
   }

   public String getName() {
      return this.field35426;
   }

   public String getReleaseTarget() {
      return this.field35432;
   }

   public int getWorldVersion() {
      return this.field35428;
   }

   public int getProtocolVersion() {
      return this.field35429;
   }

   public int getPackVersion() {
      return this.field35430;
   }

   public Date getBuildTime() {
      return this.field35431;
   }

   public boolean isStable() {
      return this.field35427;
   }
}
