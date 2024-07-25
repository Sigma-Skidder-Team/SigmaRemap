package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

public class class_418 {
   public static final String field_1771 = class_2909.field_14205 + "" + class_2909.field_14199 + "[ViaVersion] " + class_2909.field_14205;
   private static final String field_1773 = "https://api.spiget.org/v2/resources/";
   private static final int field_1772 = 19254;
   private static final String field_1774 = "/versions/latest";

   public static void method_2084(UUID var0) {
      class_3446.method_15886().method_34627(() -> {
         String var3 = method_2082(false);
         if (var3 != null) {
            class_3446.method_15886().method_34633(() -> class_3446.method_15886().method_34624(var0, field_1771 + var3));
         }
      });
   }

   public static void method_2083() {
      class_3446.method_15886().method_34627(() -> {
         String var2 = method_2082(true);
         if (var2 != null) {
            class_3446.method_15886().method_34633(() -> class_3446.method_15886().method_34617().warning(var2));
         }
      });
   }

   @Nullable
   private static String method_2082(boolean var0) {
      if (class_3446.method_15886().method_34619().equals("${project.version}")) {
         return "You are using a debug/custom version, consider updating.";
      } else {
         String var3 = method_2081();
         if (var3 == null) {
            return var0 ? "Could not check for updates, check your connection." : null;
         } else {
            class_2245 var4;
            try {
               var4 = new class_2245(class_3446.method_15886().method_34619());
            } catch (IllegalArgumentException var6) {
               return "You are using a custom version, consider updating.";
            }

            class_2245 var5 = new class_2245(var3);
            if (var4.compareTo(var5) < 0) {
               return "There is a newer version available: " + var5.toString() + ", you're on: " + var4.toString();
            } else if (var0 && var4.compareTo(var5) != 0) {
               return !var4.method_10324().toLowerCase(Locale.ROOT).startsWith("dev") && !var4.method_10324().toLowerCase(Locale.ROOT).startsWith("snapshot")
                  ? "You are running a newer version than is released!"
                  : "You are running a development version, please report any bugs to GitHub.";
            } else {
               return null;
            }
         }
      }
   }

   @Nullable
   private static String method_2081() {
      try {
         URL var2 = new URL("https://api.spiget.org/v2/resources/19254/versions/latest?" + System.currentTimeMillis());
         HttpURLConnection var3 = (HttpURLConnection)var2.openConnection();
         var3.setUseCaches(true);
         var3.addRequestProperty("User-Agent", "ViaVersion " + class_3446.method_15886().method_34619() + " " + class_3446.method_15886().method_34620());
         var3.setDoOutput(true);
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var3.getInputStream()));
         StringBuilder var5 = new StringBuilder();

         String var6;
         while ((var6 = var4.readLine()) != null) {
            var5.append(var6);
         }

         var4.close();

         JsonObject var7;
         try {
            var7 = (JsonObject)class_9012.method_41350().fromJson(var5.toString(), JsonObject.class);
         } catch (JsonParseException var9) {
            var9.printStackTrace();
            return null;
         }

         return var7.get("name").getAsString();
      } catch (MalformedURLException var10) {
         return null;
      } catch (IOException var11) {
         return null;
      }
   }
}
