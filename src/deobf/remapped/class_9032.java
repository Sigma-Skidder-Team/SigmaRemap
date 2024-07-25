package remapped;

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

public class class_9032 implements Runnable {
   public class_9032(class_1714 var1, class_7235 var2, class_1409 var3, class_2763 var4) {
      this.field_46218 = var1;
      this.field_46216 = var2;
      this.field_46214 = var3;
      this.field_46217 = var4;
   }

   @Override
   public void run() {
      HttpURLConnection var3 = null;

      try {
         var3 = (HttpURLConnection)new URL("https://dump.viaversion.com/documents").openConnection();
      } catch (IOException var7) {
         this.field_46216.method_33103(class_2909.field_14207 + "Failed to dump, please check the console for more information");
         class_3446.method_15886().method_34617().log(Level.WARNING, "Could not paste ViaVersion dump to ViaVersion Dump", (Throwable)var7);
         return;
      }

      try {
         var3.setRequestProperty("Content-Type", "text/plain");
         var3.addRequestProperty("User-Agent", "ViaVersion/" + this.field_46214.method_6495());
         var3.setRequestMethod("POST");
         var3.setDoOutput(true);
         OutputStream var4 = var3.getOutputStream();
         var4.write(class_9012.method_41351().setPrettyPrinting().create().toJson(this.field_46217).getBytes(StandardCharsets.UTF_8));
         var4.close();
         if (var3.getResponseCode() == 429) {
            this.field_46216.method_33103(class_2909.field_14207 + "You can only paste ones every minute to protect our systems.");
            return;
         }

         String var11 = CharStreams.toString(new InputStreamReader(var3.getInputStream()));
         var3.getInputStream().close();
         JsonObject var6 = (JsonObject)class_9012.method_41350().fromJson(var11, JsonObject.class);
         if (!var6.has("key")) {
            throw new InvalidObjectException("Key is not given in Hastebin output");
         }

         this.field_46216
            .method_33103(
               class_2909.field_14205
                  + "We've made a dump with useful information, report your issue and provide this url: "
                  + class_1714.method_7690(this.field_46218, var6.get("key").getAsString())
            );
      } catch (Exception var9) {
         this.field_46216.method_33103(class_2909.field_14207 + "Failed to dump, please check the console for more information");
         class_3446.method_15886().method_34617().log(Level.WARNING, "Could not paste ViaVersion dump to Hastebin", (Throwable)var9);

         try {
            if (var3.getResponseCode() < 200 || var3.getResponseCode() > 400) {
               String var5 = CharStreams.toString(new InputStreamReader(var3.getErrorStream()));
               var3.getErrorStream().close();
               class_3446.method_15886().method_34617().log(Level.WARNING, "Page returned: " + var5);
            }
         } catch (IOException var8) {
            class_3446.method_15886().method_34617().log(Level.WARNING, "Failed to capture further info", (Throwable)var8);
         }
      }
   }
}
