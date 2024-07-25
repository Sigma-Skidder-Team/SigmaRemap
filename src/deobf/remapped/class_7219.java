package remapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7219 extends class_8958 {
   private static final Logger field_37060 = LogManager.getLogger();
   private static final Pattern field_37065 = Pattern.compile("^[a-zA-Z][-a-zA-Z0-9+.]+:");
   private final boolean field_37063;
   private final String field_37061;
   private final URI field_37064;

   private class_7219(boolean var1, String var2, URI var3) {
      this.field_37063 = var1;
      this.field_37061 = var2;
      this.field_37064 = var3;
   }

   @Nullable
   public static class_7219 method_33063(String var0) {
      try {
         JsonParser var3 = new JsonParser();
         JsonObject var4 = var3.parse(var0).getAsJsonObject();
         String var5 = class_274.method_1243("uploadEndpoint", var4, (String)null);
         if (var5 != null) {
            int var6 = class_274.method_1245("port", var4, -1);
            URI var7 = method_33065(var5, var6);
            if (var7 != null) {
               boolean var8 = class_274.method_1246("worldClosed", var4, false);
               String var9 = class_274.method_1243("token", var4, (String)null);
               return new class_7219(var8, var9, var7);
            }
         }
      } catch (Exception var10) {
         field_37060.error("Could not parse UploadInfo: " + var10.getMessage());
      }

      return null;
   }

   @Nullable
   @VisibleForTesting
   public static URI method_33065(String var0, int var1) {
      Matcher var4 = field_37065.matcher(var0);
      String var5 = method_33064(var0, var4);

      try {
         URI var6 = new URI(var5);
         int var7 = method_33062(var1, var6.getPort());
         return var7 != var6.getPort()
            ? new URI(var6.getScheme(), var6.getUserInfo(), var6.getHost(), var7, var6.getPath(), var6.getQuery(), var6.getFragment())
            : var6;
      } catch (URISyntaxException var8) {
         field_37060.warn("Failed to parse URI {}", var5, var8);
         return null;
      }
   }

   private static int method_33062(int var0, int var1) {
      if (var0 == -1) {
         return var1 == -1 ? 8080 : var1;
      } else {
         return var0;
      }
   }

   private static String method_33064(String var0, Matcher var1) {
      return !var1.find() ? "http://" + var0 : var0;
   }

   public static String method_33068(String var0) {
      JsonObject var3 = new JsonObject();
      if (var0 != null) {
         var3.addProperty("token", var0);
      }

      return var3.toString();
   }

   @Nullable
   public String method_33066() {
      return this.field_37061;
   }

   public URI method_33067() {
      return this.field_37064;
   }

   public boolean method_33061() {
      return this.field_37063;
   }
}
