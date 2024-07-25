package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;

public class class_3792 {
   private static final Map<String, JsonObject> field_18520 = new ConcurrentHashMap<String, JsonObject>();
   private static boolean field_18519;

   public static boolean method_17621() {
      return field_18519;
   }

   public static void method_17611() {
      field_18519 = true;
   }

   public static Map<String, JsonObject> method_17609() {
      return field_18520;
   }

   @Nullable
   public static JsonObject method_17622(String var0) {
      File var3 = new File(class_3446.method_15886().method_34623(), var0);
      if (!var3.exists()) {
         return method_17613(var0);
      } else {
         try (FileReader var4 = new FileReader(var3)) {
            return (JsonObject)class_9012.method_41350().fromJson(var4, JsonObject.class);
         } catch (JsonSyntaxException var19) {
            class_3446.method_15886().method_34617().warning(var0 + " is badly formatted!");
            var19.printStackTrace();
         } catch (JsonIOException | IOException var20) {
            var20.printStackTrace();
         }

         return null;
      }
   }

   @Nullable
   public static JsonObject method_17613(String var0) {
      return method_17614(var0, false);
   }

   @Nullable
   public static JsonObject method_17614(String var0, boolean var1) {
      if (field_18519) {
         JsonObject var4 = field_18520.get(var0);
         if (var4 != null) {
            return var4;
         }
      }

      InputStream var16 = method_17623(var0);
      if (var16 == null) {
         return null;
      } else {
         InputStreamReader var5 = new InputStreamReader(var16);

         JsonObject var7;
         try {
            JsonObject var6 = (JsonObject)class_9012.method_41350().fromJson(var5, JsonObject.class);
            if (var1 && field_18519) {
               field_18520.put(var0, var6);
            }

            var7 = var6;
         } finally {
            try {
               var5.close();
            } catch (IOException var14) {
            }
         }

         return var7;
      }
   }

   public static void method_17616(class_3020 var0, JsonObject var1, JsonObject var2, JsonObject var3) {
      Object2IntMap var6 = method_17615(var2);

      for (Entry var8 : var1.entrySet()) {
         int var9 = method_17612(var8, var6, var3);
         if (var9 != -1) {
            var0.put(Integer.parseInt((String)var8.getKey()), var9);
         }
      }
   }

   public static void method_17619(short[] var0, JsonObject var1, JsonObject var2) {
      method_17620(var0, var1, var2, null);
   }

   public static void method_17620(short[] var0, JsonObject var1, JsonObject var2, JsonObject var3) {
      Object2IntMap var6 = method_17615(var2);

      for (Entry var8 : var1.entrySet()) {
         int var9 = method_17612(var8, var6, var3);
         if (var9 != -1) {
            var0[Integer.parseInt((String)var8.getKey())] = (short)var9;
         }
      }
   }

   private static int method_17612(Entry<String, JsonElement> var0, Object2IntMap var1, JsonObject var2) {
      int var5 = var1.getInt(((JsonElement)var0.getValue()).getAsString());
      if (var5 == -1) {
         if (var2 != null) {
            JsonElement var6 = var2.get((String)var0.getKey());
            if (var6 != null) {
               var5 = var1.getInt(var6.getAsString());
            }
         }

         if (var5 == -1) {
            if (!class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731()) {
               class_3446.method_15886().method_34617().warning("No key for " + var0.getValue() + " :( ");
            }

            return -1;
         }
      }

      return var5;
   }

   public static void method_17618(short[] var0, JsonArray var1, JsonArray var2, boolean var3) {
      method_17617(var0, var1, var2, null, var3);
   }

   public static void method_17617(short[] var0, JsonArray var1, JsonArray var2, JsonObject var3, boolean var4) {
      Object2IntMap var7 = method_17610(var2);

      for (int var8 = 0; var8 < var1.size(); var8++) {
         JsonElement var9 = var1.get(var8);
         int var10 = var7.getInt(var9.getAsString());
         if (var10 == -1) {
            if (var3 != null) {
               JsonElement var11 = var3.get(var9.getAsString());
               if (var11 != null) {
                  String var12 = var11.getAsString();
                  if (var12.isEmpty()) {
                     continue;
                  }

                  var10 = var7.getInt(var12);
               }
            }

            if (var10 == -1) {
               if (var4 && !class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731()) {
                  class_3446.method_15886().method_34617().warning("No key for " + var9 + " :( ");
               }
               continue;
            }
         }

         var0[var8] = (short)var10;
      }
   }

   public static Object2IntMap<String> method_17615(JsonObject var0) {
      Object2IntOpenHashMap var3 = new Object2IntOpenHashMap(var0.size(), 1.0F);
      var3.defaultReturnValue(-1);

      for (Entry var5 : var0.entrySet()) {
         var3.put(((JsonElement)var5.getValue()).getAsString(), Integer.parseInt((String)var5.getKey()));
      }

      return var3;
   }

   public static Object2IntMap<String> method_17610(JsonArray var0) {
      Object2IntOpenHashMap var3 = new Object2IntOpenHashMap(var0.size(), 1.0F);
      var3.defaultReturnValue(-1);

      for (int var4 = 0; var4 < var0.size(); var4++) {
         var3.put(var0.get(var4).getAsString(), var4);
      }

      return var3;
   }

   @Nullable
   public static InputStream method_17623(String var0) {
      return class_3792.class.getClassLoader().getResourceAsStream("assets/viaversion/data/" + var0);
   }
}
