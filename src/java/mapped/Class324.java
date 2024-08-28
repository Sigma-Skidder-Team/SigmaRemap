package mapped;

import com.google.common.io.CharStreams;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InvalidObjectException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;

public class Class324 implements Runnable {
   public final Class9150 field1396;
   public final Class7133 field1397;
   public final Class7801 field1398;
   public final Class6258 field1399;

   public Class324(Class6258 var1, Class9150 var2, Class7133 var3, Class7801 var4) {
      this.field1399 = var1;
      this.field1396 = var2;
      this.field1397 = var3;
      this.field1398 = var4;
   }

   @Override
   public void run() {
      HttpURLConnection var3 = null;

      try {
         var3 = (HttpURLConnection)new URL("https://dump.viaversion.com/documents").openConnection();
      } catch (IOException var7) {
         this.field1396.method34169(Class2307.field15779 + "Failed to dump, please check the console for more information");
         Class8042.method27613().method27366().log(Level.WARNING, "Could not paste ViaVersion dump to ViaVersion Dump", (Throwable)var7);
         return;
      }

      try {
         var3.setRequestProperty("Content-Type", "text/plain");
         var3.addRequestProperty("User-Agent", "ViaVersion/" + this.field1397.method22248());
         var3.setRequestMethod("POST");
         var3.setDoOutput(true);
         OutputStream var4 = var3.getOutputStream();
         var4.write(Class9610.method37358().setPrettyPrinting().create().toJson(this.field1398).getBytes(StandardCharsets.UTF_8));
         var4.close();
         if (var3.getResponseCode() == 429) {
            this.field1396.method34169(Class2307.field15779 + "You can only paste ones every minute to protect our systems.");
            return;
         }

         String var11 = CharStreams.toString(new InputStreamReader(var3.getInputStream()));
         var3.getInputStream().close();
         JsonObject var6 = (JsonObject)Class9610.method37357().fromJson(var11, JsonObject.class);
         if (!var6.has("key")) {
            throw new InvalidObjectException("Key is not given in Hastebin output");
         }

         this.field1396
            .method34169(
               Class2307.field15777
                  + "We've made a dump with useful information, report your issue and provide this url: "
                  + Class6258.method19229(this.field1399, var6.get("key").getAsString())
            );
      } catch (Exception var9) {
         this.field1396.method34169(Class2307.field15779 + "Failed to dump, please check the console for more information");
         Class8042.method27613().method27366().log(Level.WARNING, "Could not paste ViaVersion dump to Hastebin", (Throwable)var9);

         try {
            if (var3.getResponseCode() < 200 || var3.getResponseCode() > 400) {
               String var5 = CharStreams.toString(new InputStreamReader(var3.getErrorStream()));
               var3.getErrorStream().close();
               Class8042.method27613().method27366().log(Level.WARNING, "Page returned: " + var5);
            }
         } catch (IOException var8) {
            Class8042.method27613().method27366().log(Level.WARNING, "Failed to capture further info", (Throwable)var8);
         }
      }
   }
}
