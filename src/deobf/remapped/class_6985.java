package remapped;

import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class class_6985 extends class_1316 implements class_5714 {
   private static List<String> field_35868 = Arrays.<String>asList(
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

   public class_6985(File var1) {
      super(new File(var1, "config.yml"));
      this.鶊ᔎ哺葫롤䬾();
   }

   @Override
   public URL method_6012() {
      return this.getClass().getClassLoader().getResource("assets/viaversion/config.yml");
   }

   @Override
   public void method_6015(Map<String, Object> var1) {
      Object var4;
      if (!(var1.get("velocity-servers") instanceof Map)) {
         var4 = new HashMap();
      } else {
         var4 = (Map)var1.get("velocity-servers");
      }

      for (Entry var6 : new HashSet(var4.entrySet())) {
         if (!(var6.getValue() instanceof Integer)) {
            if (var6.getValue() instanceof String) {
               class_412 var7 = class_412.method_2048((String)var6.getValue());
               if (var7 != null) {
                  var4.put(var6.getKey(), var7.method_2055());
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
            var4.put("default", class_9879.method_45521());
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      var1.put("velocity-servers", var4);
   }

   @Override
   public List<String> method_6010() {
      return field_35868;
   }

   public boolean 驋洝䎰훔ꁈ䩜() {
      return this.method_6016("checkforupdates", false);
   }

   public boolean 挐㮃鶊躚㹔ꁈ() {
      return this.method_6016("prevent-collision", true);
   }

   public boolean 웨꿩䣓浣괠娍() {
      return this.method_6016("use-new-effect-indicator", true);
   }

   public boolean 㠠缰ᜄ甐侃鶲() {
      return this.method_6016("use-new-deathmessages", true);
   }

   public boolean 葫㞈䆧ꈍ圭뎫() {
      return true;
   }

   public boolean ᢻ酋陬㐈䡸捉() {
      return this.method_6016("shield-blocking", true);
   }

   public boolean 놣붛塱浣쥦쥦() {
      return true;
   }

   public boolean 侃姮묙塱欫韤() {
      return this.method_6016("piston-animation-patch", false);
   }

   public boolean 呓缰뫤卫퉧藸() {
      return true;
   }

   public boolean 埙韤롤浣펊顸() {
      return this.method_6016("bossbar-anti-flicker", false);
   }

   public double ᢻ쿨셴Ꮀ䢶ꈍ() {
      return this.method_6014("hologram-y", -0.96);
   }

   public int 쬷햖쇼缰웨쬫() {
      return this.method_6009("max-pps", 800);
   }

   public String 娍轐ꁈᙽ洝좯() {
      return this.method_6017("max-pps-kick-msg", "Sending packets too fast? lag?");
   }

   public int 嶗釒属ኞ阢陂() {
      return this.method_6009("tracking-period", 6);
   }

   public int ꈍ鶲낛圭걾螜() {
      return this.method_6009("tracking-warning-pps", 120);
   }

   public int Ⱋ侃놣쇽ಽ쬷() {
      return this.method_6009("tracking-max-warnings", 3);
   }

   public String 姮ꦱ堧钘鶊郝() {
      return this.method_6017("tracking-max-kick-msg", "You are sending too many packets, :(");
   }

   public boolean 쇽褕蛊쇽圭䩜() {
      return false;
   }

   public boolean 㐖뎫钘펊刃㔢() {
      return this.method_6016("send-supported-versions", false);
   }

   public boolean 㠠䴂웨ศ쥦䆧() {
      return false;
   }

   public boolean 姮瀳岋댠훔塱() {
      return false;
   }

   public boolean ᔎᜄ筕셴弻陬() {
      return this.method_6016("replace-pistons", false);
   }

   public int 㼜뗴낛훔曞鱀() {
      return this.method_6009("replacement-piston-id", 0);
   }

   public boolean 㼜觯待呓錌ᙽ() {
      return this.挐㮃鶊躚㹔ꁈ() && this.method_6016("auto-team", true);
   }

   public boolean 䣓䩉藸埙陬䆧() {
      return this.method_6016("force-json-transform", false);
   }

   public boolean ᔎ䴂뵯酭쬫曞() {
      return this.method_6016("chat-nbt-fix", true);
   }

   public boolean 阢㦖뼢ꁈᙽ阢() {
      return false;
   }

   public String 陬缰鷏綋佉䖼() {
      return this.method_6017("block-disconnect-msg", "You are using an unsupported Minecraft version!");
   }

   public String ᙽ쟗뼢㐖堍Ꮺ() {
      return this.method_6017("reload-disconnect-msg", "Server reload, please rejoin!");
   }

   public boolean 粤錌值酋늦蕃() {
      return this.method_6016("minimize-cooldown", true);
   }

   public int method_31961() {
      return this.method_6009("velocity-ping-interval", 60);
   }

   public boolean method_31959() {
      return this.method_6016("velocity-ping-save", true);
   }

   public Map<String, Integer> method_31960() {
      return this.<HashMap<String, Integer>>method_6013("velocity-servers", Map.class, new HashMap<String, Integer>());
   }

   public boolean 樽缰亟츚哝睬() {
      return this.method_6016("team-colour-fix", true);
   }

   public boolean 侃玑曞侃浣䎰() {
      return this.method_6016("disable-1_13-auto-complete", false);
   }

   public boolean ᙽ롤곻酭躚睬() {
      return false;
   }

   public String 眓댠哝睬浦쬷() {
      return "packet";
   }

   public boolean 㕠셴汌韤댠瀧() {
      return this.method_6016("reduce-blockstorage-memory", false);
   }

   public boolean 葫쇼鷏贞뚔Ꮤ() {
      return this.method_6016("flowerstem-when-block-above", false);
   }

   public boolean 掬蛊ꪕ㻣佉㻣() {
      return this.method_6016("fix-low-snow-collision", false);
   }

   public int 콗圭Ꮤ卫佉Ⱋ() {
      return this.method_6009("1_13-tab-complete-delay", 0);
   }

   public boolean 㹔좯ࡅ睬鷏딨() {
      return this.method_6016("truncate-1_14-books", false);
   }

   public boolean 뵯浣䬹浣ၝ轐() {
      return this.method_6016("left-handed-handling", true);
   }

   public boolean 呓㢸㥇筕ꈍ葫() {
      return true;
   }

   public boolean 핇쥦䢶瀧䁞韤() {
      return true;
   }

   public boolean 蒕ใ綋郝躚㔢() {
      return false;
   }

   public boolean 䆧室㹔陬쿨贞() {
      return true;
   }

   public boolean 㞈聛뼢쇽捉啖() {
      return false;
   }

   public boolean 卒픓퉧缰挐蛊() {
      return false;
   }

   public boolean 卫䬾ꈍ뚔ศぶ() {
      return false;
   }

   public boolean 䂷釒훔渺㝛酋() {
      return false;
   }

   public boolean 딨柿卫蚳㦖曞() {
      return true;
   }

   public IntSet 驋骰玑筕骰Ⱋ() {
      return IntSets.EMPTY_SET;
   }

   public boolean 묙睬䬾瀧ᢻ걾() {
      return true;
   }

   public void 㼜䎰圭曞娍ぶ(boolean var1) {
   }
}
