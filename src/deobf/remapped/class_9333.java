package remapped;

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

public class class_9333 extends class_6150 {
   private final Map<String, Integer[]> field_47646 = new HashMap<String, Integer[]>();
   private final Map<String, Integer[]> field_47645 = new HashMap<String, Integer[]>();
   private final Map<String, Integer[]> field_47647 = new HashMap<String, Integer[]>();
   public static final BiMap<Short, String> field_47642 = HashBiMap.create();
   private final Map<String, String> field_47641 = new HashMap<String, String>();
   private final Map<String, String> field_47649 = new HashMap<String, String>();
   private final BiMap<String, String> field_47644 = HashBiMap.create();
   private class_1392 field_47648;

   public class_9333() {
      super("1.12", "1.13");
   }

   @Override
   public void method_28216(JsonObject var1, JsonObject var2, JsonObject var3) {
      this.method_43101(this.field_47646, var2.getAsJsonObject("block_tags"));
      this.method_43101(this.field_47645, var2.getAsJsonObject("item_tags"));
      this.method_43101(this.field_47647, var2.getAsJsonObject("fluid_tags"));
      this.method_43096(field_47642, var1.getAsJsonObject("enchantments"));
      this.field_47648 = new class_1392(72, var1.getAsJsonObject("enchantments"), var2.getAsJsonObject("enchantments"));
      if (class_3446.method_15884().method_25832()) {
         this.field_31510.method_6436()[1248] = 3416;
      }

      if (class_3446.method_15884().method_25822()) {
         short[] var6 = this.field_31510.method_6436();
         var6[1552] = 1;
         var6[1553] = 14;
         var6[1554] = 3983;
         var6[1555] = 3984;
         var6[1556] = 3985;
         var6[1557] = 3986;
      }

      JsonObject var25 = class_3792.method_17622("channelmappings-1.13.json");
      if (var25 != null) {
         for (Entry var8 : var25.entrySet()) {
            String var9 = (String)var8.getKey();
            String var10 = ((JsonElement)var8.getValue()).getAsString();
            if (!method_43099(var10)) {
               class_3446.method_15886().method_34617().warning("Channel '" + var10 + "' is not a valid 1.13 plugin channel, please check your configuration!");
            } else {
               this.field_47644.put(var9, var10);
            }
         }
      }

      Map var26 = (Map)class_9012.method_41350()
         .fromJson(
            new InputStreamReader(class_9333.class.getClassLoader().getResourceAsStream("assets/viaversion/data/mapping-lang-1.12-1.13.json")),
            new class_5337(this).getType()
         );

      try (InputStreamReader var28 = new InputStreamReader(
            class_9333.class.getClassLoader().getResourceAsStream("mojang-translations/en_US.properties"), StandardCharsets.UTF_8
         )) {
         String[] var27 = CharStreams.toString(var28).split("\n");

         for (String var12 : var27) {
            if (!var12.isEmpty()) {
               String[] var13 = var12.split("=", 2);
               if (var13.length == 2) {
                  String var14 = var13[0];
                  if (!var26.containsKey(var14)) {
                     String var15 = var13[1].replaceAll("%(\\d\\$)?d", "%$1s");
                     this.field_47649.put(var14, var15);
                  } else {
                     String var32 = (String)var26.get(var14);
                     if (var32 != null) {
                        this.field_47641.put(var14, var32);
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
   public class_1392 method_28209(JsonObject var1, JsonObject var2, JsonObject var3, String var4) {
      return !var4.equals("blocks")
         ? super.method_28209(var1, var2, var3, var4)
         : new class_1392(4084, var1.getAsJsonObject("blocks"), var2.getAsJsonObject("blockstates"));
   }

   public static String method_43090(String var0) {
      if (!method_43099(var0)) {
         return null;
      } else {
         int var3 = var0.indexOf(58);
         if ((var3 == -1 || var3 == 0) && var0.length() <= 10) {
            var0 = "minecraft:" + var0;
         }

         return var0;
      }
   }

   public static boolean method_43099(String var0) {
      return var0.matches("([0-9a-z_.-]+):([0-9a-z_/.-]+)");
   }

   private void method_43101(Map<String, Integer[]> var1, JsonObject var2) {
      for (Entry var6 : var2.entrySet()) {
         JsonArray var7 = ((JsonElement)var6.getValue()).getAsJsonArray();
         Integer[] var8 = new Integer[var7.size()];

         for (int var9 = 0; var9 < var7.size(); var9++) {
            var8[var9] = var7.get(var9).getAsInt();
         }

         var1.put(var6.getKey(), var8);
      }
   }

   private void method_43096(Map<Short, String> var1, JsonObject var2) {
      for (Entry var6 : var2.entrySet()) {
         var1.put(Short.parseShort((String)var6.getKey()), ((JsonElement)var6.getValue()).getAsString());
      }
   }

   public Map<String, Integer[]> method_43098() {
      return this.field_47646;
   }

   public Map<String, Integer[]> method_43094() {
      return this.field_47645;
   }

   public Map<String, Integer[]> method_43095() {
      return this.field_47647;
   }

   public BiMap<Short, String> method_43100() {
      return field_47642;
   }

   public Map<String, String> method_43092() {
      return this.field_47641;
   }

   public Map<String, String> method_43097() {
      return this.field_47649;
   }

   public BiMap<String, String> method_43091() {
      return this.field_47644;
   }

   public class_1392 method_43093() {
      return this.field_47648;
   }
}
