package remapped;

import java.nio.file.Path;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class class_9882 extends class_8377<class_9882> {
   public final boolean field_50091 = this.method_38605("online-mode", true);
   public final boolean field_50094 = this.method_38605("prevent-proxy-connections", false);
   public final String field_50124 = this.method_38611("server-ip", "");
   public final boolean field_50118 = this.method_38605("spawn-animals", true);
   public final boolean field_50126 = this.method_38605("spawn-npcs", true);
   public final boolean field_50101 = this.method_38605("pvp", true);
   public final boolean field_50119 = this.method_38605("allow-flight", false);
   public final String field_50099 = this.method_38611("resource-pack", "");
   public final String field_50111 = this.method_38611("motd", "A Minecraft Server");
   public final boolean field_50132 = this.method_38605("force-gamemode", false);
   public final boolean field_50131 = this.method_38605("enforce-whitelist", false);
   public final class_423 field_50123 = this.<class_423>method_38602(
      "difficulty", method_38607(class_423::method_2100, class_423::method_2095), class_423::method_2098, class_423.field_1784
   );
   public final class_4666 field_50117 = this.<class_4666>method_38602(
      "gamemode", method_38607(class_4666::method_21590, class_4666::method_21586), class_4666::method_21588, class_4666.field_22764
   );
   public final String field_50129 = this.method_38611("level-name", "world");
   public final int field_50092 = this.method_38600("server-port", 25565);
   public final int field_50108 = this.method_38603("max-build-height", var0 -> class_9299.method_42829((var0 + 8) / 16 * 16, 64, 256), 256);
   public final Boolean field_50107 = this.method_38599("announce-player-achievements");
   public final boolean field_50090 = this.method_38605("enable-query", false);
   public final int field_50114 = this.method_38600("query.port", 25565);
   public final boolean field_50089 = this.method_38605("enable-rcon", false);
   public final int field_50095 = this.method_38600("rcon.port", 25575);
   public final String field_50102 = this.method_38611("rcon.password", "");
   public final String field_50127 = this.method_38614("resource-pack-hash");
   public final String field_50083 = this.method_38611("resource-pack-sha1", "");
   public final boolean field_50096 = this.method_38605("hardcore", false);
   public final boolean field_50120 = this.method_38605("allow-nether", true);
   public final boolean field_50109 = this.method_38605("spawn-monsters", true);
   public final boolean field_50125;
   public final boolean field_50088;
   public final boolean field_50112;
   public final int field_50115;
   public final int field_50103;
   public final int field_50086;
   public final long field_50121;
   public final int field_50100;
   public final int field_50116;
   public final int field_50097;
   public final int field_50084;
   public final boolean field_50093;
   public final boolean field_50130;
   public final int field_50106;
   public final boolean field_50105;
   public final boolean field_50128;
   public final boolean field_50087;
   public final int field_50110;
   public final String field_50104;
   public final class_8377<class_9882>.Property<Integer> field_50113;
   public final class_8377<class_9882>.Property<Boolean> field_50098;
   public final class_2904 field_50122;

   public class_9882(Properties var1, class_6322 var2) {
      super(var1);
      if (!this.method_38605("snooper-enabled", true)) {
      }

      this.field_50125 = false;
      this.field_50088 = this.method_38605("use-native-transport", true);
      this.field_50112 = this.method_38605("enable-command-block", false);
      this.field_50115 = this.method_38600("spawn-protection", 16);
      this.field_50103 = this.method_38600("op-permission-level", 4);
      this.field_50086 = this.method_38600("function-permission-level", 2);
      this.field_50121 = this.method_38616("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
      this.field_50100 = this.method_38600("rate-limit", 0);
      this.field_50116 = this.method_38600("view-distance", 10);
      this.field_50097 = this.method_38600("max-players", 20);
      this.field_50084 = this.method_38600("network-compression-threshold", 256);
      this.field_50093 = this.method_38605("broadcast-rcon-to-ops", true);
      this.field_50130 = this.method_38605("broadcast-console-to-ops", true);
      this.field_50106 = this.method_38603("max-world-size", var0 -> class_9299.method_42829(var0, 1, 29999984), 29999984);
      this.field_50105 = this.method_38605("sync-chunk-writes", true);
      this.field_50128 = this.method_38605("enable-jmx-monitoring", false);
      this.field_50087 = this.method_38605("enable-status", true);
      this.field_50110 = this.method_38603("entity-broadcast-range-percentage", var0 -> class_9299.method_42829(var0, 10, 1000), 100);
      this.field_50104 = this.method_38611("text-filtering-config", "");
      this.field_50113 = this.method_38608("player-idle-timeout", 0);
      this.field_50098 = this.method_38606("white-list", false);
      this.field_50122 = class_2904.method_13299(var2, var1);
   }

   public static class_9882 method_45531(class_6322 var0, Path var1) {
      return new class_9882(method_38613(var1), var0);
   }

   public class_9882 method_45530(class_6322 var1, Properties var2) {
      return new class_9882(var2, var1);
   }
}
