package mapped;

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

public class Class6133 extends Class6109 {
   private static final Logger field27477 = LogManager.getLogger();
   private static final Pattern field27478 = Pattern.compile("^[a-zA-Z][-a-zA-Z0-9+.]+:");
   private final boolean field27479;
   private final String field27480;
   private final URI field27481;

   private Class6133(boolean var1, String var2, URI var3) {
      this.field27479 = var1;
      this.field27480 = var2;
      this.field27481 = var3;
   }

   @Nullable
   public static Class6133 method18927(String var0) {
      try {
         JsonParser var3 = new JsonParser();
         JsonObject var4 = var3.parse(var0).getAsJsonObject();
         String var5 = Class5420.method17016("uploadEndpoint", var4, (String)null);
         if (var5 != null) {
            int var6 = Class5420.method17017("port", var4, -1);
            URI var7 = method18928(var5, var6);
            if (var7 != null) {
               boolean var8 = Class5420.method17019("worldClosed", var4, false);
               String var9 = Class5420.method17016("token", var4, (String)null);
               return new Class6133(var8, var9, var7);
            }
         }
      } catch (Exception var10) {
         field27477.error("Could not parse UploadInfo: " + var10.getMessage());
      }

      return null;
   }

   @Nullable
   @VisibleForTesting
   public static URI method18928(String var0, int var1) {
      Matcher var4 = field27478.matcher(var0);
      String var5 = method18930(var0, var4);

      try {
         URI var6 = new URI(var5);
         int var7 = method18929(var1, var6.getPort());
         return var7 != var6.getPort()
            ? new URI(var6.getScheme(), var6.getUserInfo(), var6.getHost(), var7, var6.getPath(), var6.getQuery(), var6.getFragment())
            : var6;
      } catch (URISyntaxException var8) {
         field27477.warn("Failed to parse URI {}", var5, var8);
         return null;
      }
   }

   private static int method18929(int var0, int var1) {
      if (var0 == -1) {
         return var1 == -1 ? 8080 : var1;
      } else {
         return var0;
      }
   }

   private static String method18930(String var0, Matcher var1) {
      return !var1.find() ? "http://" + var0 : var0;
   }

   public static String method18931(String var0) {
      JsonObject var3 = new JsonObject();
      if (var0 != null) {
         var3.addProperty("token", var0);
      }

      return var3.toString();
   }

   @Nullable
   public String method18932() {
      return this.field27480;
   }

   public URI method18933() {
      return this.field27481;
   }

   public boolean method18934() {
      return this.field27479;
   }
}
