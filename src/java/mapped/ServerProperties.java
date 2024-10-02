package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameType;

import java.nio.file.Path;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ServerProperties extends Class9436<ServerProperties> {
   public final boolean onlineMode = this.method36263("online-mode", true);
   public final boolean preventProxyConnections = this.method36263("prevent-proxy-connections", false);
   public final String serverIp = this.method36257("server-ip", "");
   public final boolean field43788 = this.method36263("spawn-animals", true);
   public final boolean field43789 = this.method36263("spawn-npcs", true);
   public final boolean allowPvp = this.method36263("pvp", true);
   public final boolean allowFlight = this.method36263("allow-flight", false);
   public final String resourcePack = this.method36257("resource-pack", "");
   public final String motd = this.method36257("motd", "A Minecraft Server");
   public final boolean forceGamemode = this.method36263("force-gamemode", false);
   public final boolean enforceWhitelist = this.method36263("enforce-whitelist", false);
   public final Difficulty field43796 = this.<Difficulty>method36252(
      "difficulty", method36249(Difficulty::byId, Difficulty::byName), Difficulty::getTranslationKey, Difficulty.EASY
   );
   public final GameType gamemode = this.<GameType>method36252(
      "gamemode", method36249(GameType::getByID, GameType::method8161), GameType::method8153, GameType.field11102
   );
   public final String field43798 = this.method36257("level-name", "world");
   public final int serverPort = this.method36259("server-port", 25565);
   public final int maxBuildHeight = this.method36261("max-build-height", var0 -> MathHelper.clamp((var0 + 8) / 16 * 16, 64, 256), 256);
   public final Boolean announceAdvancements = this.method36265("announce-player-achievements");
   public final boolean enableQuery = this.method36263("enable-query", false);
   public final int field43803 = this.method36259("query.port", 25565);
   public final boolean enableRcon = this.method36263("enable-rcon", false);
   public final int field43805 = this.method36259("rcon.port", 25575);
   public final String field43806 = this.method36257("rcon.password", "");
   public final String field43807 = this.method36258("resource-pack-hash");
   public final String field43808 = this.method36257("resource-pack-sha1", "");
   public final boolean field43809 = this.method36263("hardcore", false);
   public final boolean field43810 = this.method36263("allow-nether", true);
   public final boolean field43811 = this.method36263("spawn-monsters", true);
   public final boolean field43812;
   public final boolean field43813;
   public final boolean field43814;
   public final int field43815;
   public final int field43816;
   public final int field43817;
   public final long field43818;
   public final int field43819;
   public final int field43820;
   public final int field43821;
   public final int field43822;
   public final boolean field43823;
   public final boolean field43824;
   public final int field43825;
   public final boolean field43826;
   public final boolean field_241079_P_;
   public final boolean field43828;
   public final int field43829;
   public final String field43830;
   public final Class9436<ServerProperties>.Property<Integer> playerIdleTimeout;
   public final Class9436<ServerProperties>.Property<Boolean> field43832;
   public final DimensionGeneratorSettings field43833;

   public ServerProperties(Properties var1, DynamicRegistries var2) {
      super(var1);
      if (!this.method36263("snooper-enabled", true)) {
      }

      this.field43812 = false;
      this.field43813 = this.method36263("use-native-transport", true);
      this.field43814 = this.method36263("enable-command-block", false);
      this.field43815 = this.method36259("spawn-protection", 16);
      this.field43816 = this.method36259("op-permission-level", 4);
      this.field43817 = this.method36259("function-permission-level", 2);
      this.field43818 = this.method36262("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
      this.field43819 = this.method36259("rate-limit", 0);
      this.field43820 = this.method36259("view-distance", 10);
      this.field43821 = this.method36259("max-players", 20);
      this.field43822 = this.method36259("network-compression-threshold", 256);
      this.field43823 = this.method36263("broadcast-rcon-to-ops", true);
      this.field43824 = this.method36263("broadcast-console-to-ops", true);
      this.field43825 = this.method36261("max-world-size", var0 -> MathHelper.clamp(var0, 1, 29999984), 29999984);
      this.field43826 = this.method36263("sync-chunk-writes", true);
      this.field_241079_P_ = this.method36263("enable-jmx-monitoring", false);
      this.field43828 = this.method36263("enable-status", true);
      this.field43829 = this.method36261("entity-broadcast-range-percentage", var0 -> MathHelper.clamp(var0, 10, 1000), 100);
      this.field43830 = this.method36257("text-filtering-config", "");
      this.playerIdleTimeout = this.method36260("player-idle-timeout", 0);
      this.field43832 = this.method36264("white-list", false);
      this.field43833 = DimensionGeneratorSettings.method26273(var2, var1);
   }

   public static ServerProperties method36271(DynamicRegistries var0, Path var1) {
      return new ServerProperties(method36246(var1), var0);
   }

   public ServerProperties method36267(DynamicRegistries var1, Properties var2) {
      return new ServerProperties(var2, var1);
   }
}
