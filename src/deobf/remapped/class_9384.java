package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9384 {
   private static final Logger field_47965 = LogManager.getLogger();
   private final File field_47960;
   private final long field_47967;
   private final int field_47964;
   private final class_7219 field_47955;
   private final String field_47966;
   private final String field_47957;
   private final String field_47958;
   private final class_1938 field_47959;
   private final AtomicBoolean field_47962 = new AtomicBoolean(false);
   private CompletableFuture<class_5253> field_47963;
   private final RequestConfig field_47956 = RequestConfig.custom()
      .setSocketTimeout((int)TimeUnit.MINUTES.toMillis(10L))
      .setConnectTimeout((int)TimeUnit.SECONDS.toMillis(15L))
      .build();

   public class_9384(File var1, long var2, int var4, class_7219 var5, class_1210 var6, String var7, class_1938 var8) {
      this.field_47960 = var1;
      this.field_47967 = var2;
      this.field_47964 = var4;
      this.field_47955 = var5;
      this.field_47966 = var6.method_5369();
      this.field_47957 = var6.method_5366();
      this.field_47958 = var7;
      this.field_47959 = var8;
   }

   public void method_43392(Consumer<class_5253> var1) {
      if (this.field_47963 == null) {
         this.field_47963 = CompletableFuture.<class_5253>supplyAsync(() -> this.method_43396(0));
         this.field_47963.thenAccept(var1);
      }
   }

   public void method_43398() {
      this.field_47962.set(true);
      if (this.field_47963 != null) {
         this.field_47963.cancel(false);
         this.field_47963 = null;
      }
   }

   private class_5253 method_43396(int var1) {
      class_7223 var4 = new class_7223();
      if (this.field_47962.get()) {
         return var4.method_33078();
      } else {
         this.field_47959.field_9902 = this.field_47960.length();
         HttpPost var5 = new HttpPost(this.field_47955.method_33067().resolve("/upload/" + this.field_47967 + "/" + this.field_47964));
         CloseableHttpClient var6 = HttpClientBuilder.create().setDefaultRequestConfig(this.field_47956).build();

         class_5253 var10;
         try {
            this.method_43391(var5);
            CloseableHttpResponse var7 = var6.execute(var5);
            long var8 = this.method_43395(var7);
            if (this.method_43389(var8, var1)) {
               return this.method_43388(var8, var1);
            }

            this.method_43393(var7, var4);
            var10 = var4.method_33078();
         } catch (Exception var16) {
            if (!this.field_47962.get()) {
               field_47965.error("Caught exception while uploading: ", var16);
            }

            return var4.method_33078();
         } finally {
            this.method_43394(var5, var6);
         }

         return var10;
      }
   }

   private void method_43394(HttpPost var1, CloseableHttpClient var2) {
      var1.releaseConnection();
      if (var2 != null) {
         try {
            var2.close();
         } catch (IOException var6) {
            field_47965.error("Failed to close Realms upload client");
         }
      }
   }

   private void method_43391(HttpPost var1) throws FileNotFoundException {
      var1.setHeader(
         "Cookie", "sid=" + this.field_47966 + ";token=" + this.field_47955.method_33066() + ";user=" + this.field_47957 + ";version=" + this.field_47958
      );
      class_1122 var4 = new class_1122(new FileInputStream(this.field_47960), this.field_47960.length(), this.field_47959);
      var4.setContentType("application/octet-stream");
      var1.setEntity(var4);
   }

   private void method_43393(HttpResponse var1, class_7223 var2) throws IOException {
      int var5 = var1.getStatusLine().getStatusCode();
      if (var5 == 401) {
         field_47965.debug("Realms server returned 401: " + var1.getFirstHeader("WWW-Authenticate"));
      }

      var2.method_33076(var5);
      if (var1.getEntity() != null) {
         String var6 = EntityUtils.toString(var1.getEntity(), "UTF-8");
         if (var6 != null) {
            try {
               JsonParser var7 = new JsonParser();
               JsonElement var8 = var7.parse(var6).getAsJsonObject().get("errorMsg");
               Optional var9 = Optional.<JsonElement>ofNullable(var8).map(JsonElement::getAsString);
               var2.method_33077((String)var9.orElse((String)null));
            } catch (Exception var10) {
            }
         }
      }
   }

   private boolean method_43389(long var1, int var3) {
      return var1 > 0L && var3 + 1 < 5;
   }

   private class_5253 method_43388(long var1, int var3) throws InterruptedException {
      Thread.sleep(Duration.ofSeconds(var1).toMillis());
      return this.method_43396(var3 + 1);
   }

   private long method_43395(HttpResponse var1) {
      return Optional.<Header>ofNullable(var1.getFirstHeader("Retry-After")).<String>map(Header::getValue).<Long>map(Long::valueOf).orElse(0L);
   }

   public boolean method_43397() {
      return this.field_47963.isDone() || this.field_47963.isCancelled();
   }
}
