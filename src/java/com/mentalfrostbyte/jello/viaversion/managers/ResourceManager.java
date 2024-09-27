package com.mentalfrostbyte.jello.viaversion.managers;

import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import com.mentalfrostbyte.jello.viaversion.commands.CustomCommandExecutor;
import mapped.Class7039;
import mapped.ViaVerList;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ResourceManager extends Class7039 implements AbstractResourceManager {
   private static List<String> field30379 = Arrays.<String>asList(
      "nms-player-ticking",
      "item-cache",
      "anti-xray-patch",
      "quick-move-action-fix",
      "bungee-ping-interval",
      "bungee-ping-save",
      "bungee-servers",
      "blockconnection-method",
      "change-1_9-hitbox",
      "change-1_14-hitbox"
   );

   public ResourceManager(File var1) {
      super(new File(var1, "config.yml"));
      this.method21881();
   }

   @Override
   public URL ViaVersionPlatformImpl() {
      return this.getClass().getClassLoader().getResource("assets/viaversion/config.yml");
   }

   @Override
   public void method21876(Map<String, Object> var1) {
      Map<String, Object> var4;
      if (!(var1.get("velocity-servers") instanceof Map)) {
         var4 = new HashMap<>();
      } else {
         var4 = (Map<String, Object>) var1.get("velocity-servers");
      }

      for (Entry<String, Object> var6 : new HashSet<>(var4.entrySet())) {
         if (!(var6.getValue() instanceof Integer)) {
            if (var6.getValue() instanceof String) {
               ViaVerList var7 = ViaVerList.getVersionByName((String)var6.getValue());
               if (var7 != null) {
                  var4.put(var6.getKey(), var7.getVersionNumber());
               } else {
                  var4.remove(var6.getKey());
               }
            } else {
               var4.remove(var6.getKey());
            }
         }
      }

      if (!var4.containsKey("default")) {
         try {
            var4.put("default", CustomCommandExecutor.method20579());
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      var1.put("velocity-servers", var4);
   }

   @Override
   public List<String> method21878() {
      return field30379;
   }

   @Override
   public boolean method21890() {
      return this.setUnsupported("checkforupdates", false);
   }

   @Override
   public boolean method21891() {
      return this.setUnsupported("prevent-collision", true);
   }

   @Override
   public boolean method21892() {
      return this.setUnsupported("use-new-effect-indicator", true);
   }

   @Override
   public boolean method21893() {
      return this.setUnsupported("use-new-deathmessages", true);
   }

   @Override
   public boolean method21894() {
      return true;
   }

   @Override
   public boolean method21895() {
      return this.setUnsupported("shield-blocking", true);
   }

   @Override
   public boolean method21896() {
      return true;
   }

   @Override
   public boolean method21897() {
      return this.setUnsupported("piston-animation-patch", false);
   }

   @Override
   public boolean method21898() {
      return true;
   }

   @Override
   public boolean method21899() {
      return this.setUnsupported("bossbar-anti-flicker", false);
   }

   @Override
   public double method21900() {
      return this.method21887("hologram-y", -0.96);
   }

   @Override
   public int method21901() {
      return this.setUnsupported("max-pps", 800);
   }

   @Override
   public String method21902() {
      return this.setUnsupported("max-pps-kick-msg", "Sending packets too fast? lag?");
   }

   @Override
   public int method21903() {
      return this.setUnsupported("tracking-period", 6);
   }

   @Override
   public int method21904() {
      return this.setUnsupported("tracking-warning-pps", 120);
   }

   @Override
   public int method21905() {
      return this.setUnsupported("tracking-max-warnings", 3);
   }

   @Override
   public String method21906() {
      return this.setUnsupported("tracking-max-kick-msg", "You are sending too many packets, :(");
   }

   @Override
   public boolean method21907() {
      return false;
   }

   @Override
   public boolean method21908() {
      return this.setUnsupported("send-supported-versions", false);
   }

   @Override
   public boolean method21909() {
      return false;
   }

   @Override
   public boolean method21910() {
      return false;
   }

   @Override
   public boolean method21911() {
      return this.setUnsupported("replace-pistons", false);
   }

   @Override
   public int method21912() {
      return this.setUnsupported("replacement-piston-id", 0);
   }

   @Override
   public boolean method21913() {
      return this.method21891() && this.setUnsupported("auto-team", true);
   }

   @Override
   public boolean method21914() {
      return this.setUnsupported("force-json-transform", false);
   }

   @Override
   public boolean method21915() {
      return this.setUnsupported("chat-nbt-fix", true);
   }

   @Override
   public boolean method21916() {
      return false;
   }

   @Override
   public String setBlockDisconnectMsg() {
      return this.setUnsupported("block-disconnect-msg", "You are using an unsupported Minecraft version!");
   }

   @Override
   public String setReloadDisconnectMsg() {
      return this.setUnsupported("reload-disconnect-msg", "Server reload, please rejoin!");
   }

   @Override
   public boolean setMinimizeCooldown() {
      return this.setUnsupported("minimize-cooldown", true);
   }

   public int setVelocityPingInterval() {
      return this.setUnsupported("velocity-ping-interval", 60);
   }

   public boolean setVelocitPingSave() {
      return this.setUnsupported("velocity-ping-save", true);
   }

   public Map<String, Integer> setVelocityServers() {
      return this.setUnsupported("velocity-servers", Map.class, new HashMap<String, Integer>());
   }

   @Override
   public boolean setTeamColourFix() {
      return this.setUnsupported("team-colour-fix", true);
   }

   @Override
   public boolean setDisable113AutoComplete() {
      return this.setUnsupported("disable-1_13-auto-complete", false);
   }

   @Override
   public boolean method21925() {
      return false;
   }

   @Override
   public String getPacketStringLiteral() {
      return "packet";
   }

   @Override
   public boolean setReduceBlockstorageMemory() {
      return this.setUnsupported("reduce-blockstorage-memory", false);
   }

   @Override
   public boolean setFlowerStemWhenBlockAbove() {
      return this.setUnsupported("flowerstem-when-block-above", false);
   }

   @Override
   public boolean setFixLowSnowCollision() {
      return this.setUnsupported("fix-low-snow-collision", false);
   }

   @Override
   public int set113TabCompleteDelay() {
      return this.setUnsupported("1_13-tab-complete-delay", 0);
   }

   @Override
   public boolean setTruncate114books() {
      return this.setUnsupported("truncate-1_14-books", false);
   }

   @Override
   public boolean setLeftHandedHandling() {
      return this.setUnsupported("left-handed-handling", true);
   }

   @Override
   public boolean method21933() {
      return true;
   }

   @Override
   public boolean method21934() {
      return true;
   }

   @Override
   public boolean method21935() {
      return false;
   }

   @Override
   public boolean method21936() {
      return true;
   }

   @Override
   public boolean method21937() {
      return false;
   }

   @Override
   public boolean method21938() {
      return false;
   }

   @Override
   public boolean method21939() {
      return false;
   }

   @Override
   public boolean method21940() {
      return false;
   }

   @Override
   public boolean method21941() {
      return true;
   }

   @Override
   public IntSet method21942() {
      return IntSets.EMPTY_SET;
   }

   @Override
   public boolean method21943() {
      return true;
   }

   @Override
   public void method21944(boolean var1) {
   }
}
