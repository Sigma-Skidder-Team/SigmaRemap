package mapped;

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

public class Class5994 {
   public static final String field26167 = Class2307.field15777 + "" + Class2307.field15784 + "[ViaVersion] " + Class2307.field15777;
   private static final String field26168 = "https://api.spiget.org/v2/resources/";
   private static final int field26169 = 19254;
   private static final String field26170 = "/versions/latest";

   public static void method18596(UUID var0) {
      Class8042.method27613().method27353(() -> {
         String var3 = method18598(false);
         if (var3 != null) {
            Class8042.method27613().method27354(() -> Class8042.method27613().method27359(var0, field26167 + var3));
         }
      });
   }

   public static void method18597() {
      Class8042.method27613().method27353(() -> {
         String var2 = method18598(true);
         if (var2 != null) {
            Class8042.method27613().method27354(() -> Class8042.method27613().method27366().warning(var2));
         }
      });
   }

   @Nullable
   private static String method18598(boolean var0) {
      if (Class8042.method27613().getVersion().equals("${project.version}")) {
         return "You are using a debug/custom version, consider updating.";
      } else {
         String var3 = method18599();
         if (var3 == null) {
            return var0 ? "Could not check for updates, check your connection." : null;
         } else {
            Class2025 var4;
            try {
               var4 = new Class2025(Class8042.method27613().getVersion());
            } catch (IllegalArgumentException var6) {
               return "You are using a custom version, consider updating.";
            }

            Class2025 var5 = new Class2025(var3);
            if (var4.compareTo(var5) < 0) {
               return "There is a newer version available: " + var5.toString() + ", you're on: " + var4.toString();
            } else if (var0 && var4.compareTo(var5) != 0) {
               return !var4.method8660().toLowerCase(Locale.ROOT).startsWith("dev") && !var4.method8660().toLowerCase(Locale.ROOT).startsWith("snapshot")
                  ? "You are running a newer version than is released!"
                  : "You are running a development version, please report any bugs to GitHub.";
            } else {
               return null;
            }
         }
      }
   }

   @Nullable
   private static String method18599() {
      try {
         URL var2 = new URL("https://api.spiget.org/v2/resources/19254/versions/latest?" + System.currentTimeMillis());
         HttpURLConnection var3 = (HttpURLConnection)var2.openConnection();
         var3.setUseCaches(true);
         var3.addRequestProperty("User-Agent", "ViaVersion " + Class8042.method27613().getVersion() + " " + Class8042.method27613().getClientName());
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
            var7 = (JsonObject)Class9610.method37357().fromJson(var5.toString(), JsonObject.class);
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
