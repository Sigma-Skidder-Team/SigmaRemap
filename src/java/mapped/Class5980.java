package mapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.io.CharStreams;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Class5980 extends Class5979 {
   private final Map<String, Integer[]> field26048 = new HashMap<String, Integer[]>();
   private final Map<String, Integer[]> field26049 = new HashMap<String, Integer[]>();
   private final Map<String, Integer[]> field26050 = new HashMap<String, Integer[]>();
   public static final BiMap<Short, String> field26051 = HashBiMap.create();
   private final Map<String, String> field26052 = new HashMap<String, String>();
   private final Map<String, String> field26053 = new HashMap<String, String>();
   private final BiMap<String, String> field26054 = HashBiMap.create();
   private Class7112 field26055;

   public Class5980() {
      super("1.12", "1.13");
   }

   @Override
   public void method18524(JsonObject var1, JsonObject var2, JsonObject var3) {
      this.method18545(this.field26048, var2.getAsJsonObject("block_tags"));
      this.method18545(this.field26049, var2.getAsJsonObject("item_tags"));
      this.method18545(this.field26050, var2.getAsJsonObject("fluid_tags"));
      this.method18546(field26051, var1.getAsJsonObject("enchantments"));
      this.field26055 = new Class7112(72, var1.getAsJsonObject("enchantments"), var2.getAsJsonObject("enchantments"));
      if (ViaVersion3.method27612().setFixLowSnowCollision()) {
         this.field26043.method22148()[1248] = 3416;
      }

      if (ViaVersion3.method27612().method21938()) {
         short[] var6 = this.field26043.method22148();
         var6[1552] = 1;
         var6[1553] = 14;
         var6[1554] = 3983;
         var6[1555] = 3984;
         var6[1556] = 3985;
         var6[1557] = 3986;
      }

      JsonObject var25 = Class8159.method28357("channelmappings-1.13.json");
      if (var25 != null) {
         for (Entry var8 : var25.entrySet()) {
            String var9 = (String)var8.getKey();
            String var10 = ((JsonElement)var8.getValue()).getAsString();
            if (!method18544(var10)) {
               ViaVersion3.method27613().getLogger().warning("Channel '" + var10 + "' is not a valid 1.13 plugin channel, please check your configuration!");
            } else {
               this.field26054.put(var9, var10);
            }
         }
      }

      Map var26 = (Map)Class9610.method37357()
         .fromJson(
            new InputStreamReader(Class5980.class.getClassLoader().getResourceAsStream("assets/viaversion/data/mapping-lang-1.12-1.13.json")),
            new Class5797(this).getType()
         );

      try (InputStreamReader var28 = new InputStreamReader(
            Class5980.class.getClassLoader().getResourceAsStream("mojang-translations/en_US.properties"), StandardCharsets.UTF_8
         )) {
         String[] var27 = CharStreams.toString(var28).split("\n");

         for (String var12 : var27) {
            if (!var12.isEmpty()) {
               String[] var13 = var12.split("=", 2);
               if (var13.length == 2) {
                  String var14 = var13[0];
                  if (!var26.containsKey(var14)) {
                     String var15 = var13[1].replaceAll("%(\\d\\$)?d", "%$1s");
                     this.field26053.put(var14, var15);
                  } else {
                     String var32 = (String)var26.get(var14);
                     if (var32 != null) {
                        this.field26052.put(var14, var32);
                     }
                  }
               }
            }
         }
      } catch (IOException var24) {
         var24.printStackTrace();
      }
   }

   @Override
   public Class7112 method18540(JsonObject var1, JsonObject var2, JsonObject var3, String var4) {
      return !var4.equals("blocks")
         ? super.method18540(var1, var2, var3, var4)
         : new Class7112(4084, var1.getAsJsonObject("blocks"), var2.getAsJsonObject("blockstates"));
   }

   public static String method18543(String var0) {
      if (!method18544(var0)) {
         return null;
      } else {
         int var3 = var0.indexOf(58);
         if ((var3 == -1 || var3 == 0) && var0.length() <= 10) {
            var0 = "minecraft:" + var0;
         }

         return var0;
      }
   }

   public static boolean method18544(String var0) {
      return var0.matches("([0-9a-z_.-]+):([0-9a-z_/.-]+)");
   }

   private void method18545(Map<String, Integer[]> var1, JsonObject var2) {
      for (Entry<String, JsonElement> var6 : var2.entrySet()) {
         JsonArray var7 = var6.getValue().getAsJsonArray();
         Integer[] var8 = new Integer[var7.size()];

         for (int var9 = 0; var9 < var7.size(); var9++) {
            var8[var9] = var7.get(var9).getAsInt();
         }

         var1.put(var6.getKey(), var8);
      }
   }

   private void method18546(Map<Short, String> var1, JsonObject var2) {
      for (Entry var6 : var2.entrySet()) {
         var1.put(Short.parseShort((String)var6.getKey()), ((JsonElement)var6.getValue()).getAsString());
      }
   }

   public Map<String, Integer[]> method18547() {
      return this.field26048;
   }

   public Map<String, Integer[]> method18548() {
      return this.field26049;
   }

   public Map<String, Integer[]> method18549() {
      return this.field26050;
   }

   public BiMap<Short, String> method18550() {
      return field26051;
   }

   public Map<String, String> method18551() {
      return this.field26052;
   }

   public Map<String, String> method18552() {
      return this.field26053;
   }

   public BiMap<String, String> method18553() {
      return this.field26054;
   }

   public Class7112 method18554() {
      return this.field26055;
   }
}
