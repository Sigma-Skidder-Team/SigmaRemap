package mapped;

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

public class Class8159 {
   private static final Map<String, JsonObject> field35115 = new ConcurrentHashMap<String, JsonObject>();
   private static boolean field35116;

   public static boolean method28354() {
      return field35116;
   }

   public static void method28355() {
      field35116 = true;
   }

   public static Map<String, JsonObject> method28356() {
      return field35115;
   }

   @Nullable
   public static JsonObject method28357(String var0) {
      File var3 = new File(Class8042.method27613().method27370(), var0);
      if (!var3.exists()) {
         return method28358(var0);
      } else {
         try (FileReader var4 = new FileReader(var3)) {
            return (JsonObject)Class9610.method37357().fromJson(var4, JsonObject.class);
         } catch (JsonSyntaxException var19) {
            Class8042.method27613().method27366().warning(var0 + " is badly formatted!");
            var19.printStackTrace();
         } catch (JsonIOException | IOException var20) {
            var20.printStackTrace();
         }

         return null;
      }
   }

   @Nullable
   public static JsonObject method28358(String var0) {
      return method28359(var0, false);
   }

   @Nullable
   public static JsonObject method28359(String var0, boolean var1) {
      if (field35116) {
         JsonObject var4 = field35115.get(var0);
         if (var4 != null) {
            return var4;
         }
      }

      InputStream var16 = method28368(var0);
      if (var16 == null) {
         return null;
      } else {
         InputStreamReader var5 = new InputStreamReader(var16);

         JsonObject var7;
         try {
            JsonObject var6 = (JsonObject)Class9610.method37357().fromJson(var5, JsonObject.class);
            if (var1 && field35116) {
               field35115.put(var0, var6);
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

   public static void method28360(Class11 var0, JsonObject var1, JsonObject var2, JsonObject var3) {
      Object2IntMap var6 = method28366(var2);

      for (Entry var8 : var1.entrySet()) {
         int var9 = method28363(var8, var6, var3);
         if (var9 != -1) {
            var0.put(Integer.parseInt((String)var8.getKey()), var9);
         }
      }
   }

   public static void method28361(short[] var0, JsonObject var1, JsonObject var2) {
      method28362(var0, var1, var2, null);
   }

   public static void method28362(short[] var0, JsonObject var1, JsonObject var2, JsonObject var3) {
      Object2IntMap var6 = method28366(var2);

      for (Entry var8 : var1.entrySet()) {
         int var9 = method28363(var8, var6, var3);
         if (var9 != -1) {
            var0[Integer.parseInt((String)var8.getKey())] = (short)var9;
         }
      }
   }

   private static int method28363(Entry<String, JsonElement> var0, Object2IntMap var1, JsonObject var2) {
      int var5 = var1.getInt(((JsonElement)var0.getValue()).getAsString());
      if (var5 == -1) {
         if (var2 != null) {
            JsonElement var6 = var2.get((String)var0.getKey());
            if (var6 != null) {
               var5 = var1.getInt(var6.getAsString());
            }
         }

         if (var5 == -1) {
            if (!Class8042.method27612().method21941() || Class8042.method27614().method34425()) {
               Class8042.method27613().method27366().warning("No key for " + var0.getValue() + " :( ");
            }

            return -1;
         }
      }

      return var5;
   }

   public static void method28364(short[] var0, JsonArray var1, JsonArray var2, boolean var3) {
      method28365(var0, var1, var2, null, var3);
   }

   public static void method28365(short[] var0, JsonArray var1, JsonArray var2, JsonObject var3, boolean var4) {
      Object2IntMap var7 = method28367(var2);

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
               if (var4 && !Class8042.method27612().method21941() || Class8042.method27614().method34425()) {
                  Class8042.method27613().method27366().warning("No key for " + var9 + " :( ");
               }
               continue;
            }
         }

         var0[var8] = (short)var10;
      }
   }

   public static Object2IntMap<String> method28366(JsonObject var0) {
      Object2IntOpenHashMap var3 = new Object2IntOpenHashMap(var0.size(), 1.0F);
      var3.defaultReturnValue(-1);

      for (Entry var5 : var0.entrySet()) {
         var3.put(((JsonElement)var5.getValue()).getAsString(), Integer.parseInt((String)var5.getKey()));
      }

      return var3;
   }

   public static Object2IntMap<String> method28367(JsonArray var0) {
      Object2IntOpenHashMap var3 = new Object2IntOpenHashMap(var0.size(), 1.0F);
      var3.defaultReturnValue(-1);

      for (int var4 = 0; var4 < var0.size(); var4++) {
         var3.put(var0.get(var4).getAsString(), var4);
      }

      return var3;
   }

   @Nullable
   public static InputStream method28368(String var0) {
      return Class8159.class.getClassLoader().getResourceAsStream("assets/viaversion/data/" + var0);
   }
}
