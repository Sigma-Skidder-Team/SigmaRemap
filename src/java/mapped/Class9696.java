package mapped;

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

public class Class9696 {
   private static final Logger field45317 = LogManager.getLogger();
   private final File field45318;
   private final long field45319;
   private final int field45320;
   private final Class6133 field45321;
   private final String field45322;
   private final String field45323;
   private final String field45324;
   private final Class7424 field45325;
   private final AtomicBoolean field45326 = new AtomicBoolean(false);
   private CompletableFuture<Class8619> field45327;
   private final RequestConfig field45328 = RequestConfig.custom()
      .setSocketTimeout((int)TimeUnit.MINUTES.toMillis(10L))
      .setConnectTimeout((int)TimeUnit.SECONDS.toMillis(15L))
      .build();

   public Class9696(File var1, long var2, int var4, Class6133 var5, Class6974 var6, String var7, Class7424 var8) {
      this.field45318 = var1;
      this.field45319 = var2;
      this.field45320 = var4;
      this.field45321 = var5;
      this.field45322 = var6.method21524();
      this.field45323 = var6.method21526();
      this.field45324 = var7;
      this.field45325 = var8;
   }

   public void method37965(Consumer<Class8619> var1) {
      if (this.field45327 == null) {
         this.field45327 = CompletableFuture.<Class8619>supplyAsync(() -> this.method37967(0));
         this.field45327.thenAccept(var1);
      }
   }

   public void method37966() {
      this.field45326.set(true);
      if (this.field45327 != null) {
         this.field45327.cancel(false);
         this.field45327 = null;
      }
   }

   private Class8619 method37967(int var1) {
      Class9146 var4 = new Class9146();
      if (this.field45326.get()) {
         return var4.method34164();
      } else {
         this.field45325.field31910 = this.field45318.length();
         HttpPost var5 = new HttpPost(this.field45321.method18933().resolve("/upload/" + this.field45319 + "/" + this.field45320));
         CloseableHttpClient var6 = HttpClientBuilder.create().setDefaultRequestConfig(this.field45328).build();

         Class8619 var10;
         try {
            this.method37969(var5);
            CloseableHttpResponse var7 = var6.execute(var5);
            long var8 = this.method37973(var7);
            if (this.method37971(var8, var1)) {
               return this.method37972(var8, var1);
            }

            this.method37970(var7, var4);
            var10 = var4.method34164();
         } catch (Exception var16) {
            if (!this.field45326.get()) {
               field45317.error("Caught exception while uploading: ", var16);
            }

            return var4.method34164();
         } finally {
            this.method37968(var5, var6);
         }

         return var10;
      }
   }

   private void method37968(HttpPost var1, CloseableHttpClient var2) {
      var1.releaseConnection();
      if (var2 != null) {
         try {
            var2.close();
         } catch (IOException var6) {
            field45317.error("Failed to close Realms upload client");
         }
      }
   }

   private void method37969(HttpPost var1) throws FileNotFoundException {
      var1.setHeader(
         "Cookie", "sid=" + this.field45322 + ";token=" + this.field45321.method18932() + ";user=" + this.field45323 + ";version=" + this.field45324
      );
      Class6892 var4 = new Class6892(new FileInputStream(this.field45318), this.field45318.length(), this.field45325);
      var4.setContentType("application/octet-stream");
      var1.setEntity(var4);
   }

   private void method37970(HttpResponse var1, Class9146 var2) throws IOException {
      int var5 = var1.getStatusLine().getStatusCode();
      if (var5 == 401) {
         field45317.debug("Realms server returned 401: " + var1.getFirstHeader("WWW-Authenticate"));
      }

      var2.method34162(var5);
      if (var1.getEntity() != null) {
         String var6 = EntityUtils.toString(var1.getEntity(), "UTF-8");
         if (var6 != null) {
            try {
               JsonParser var7 = new JsonParser();
               JsonElement var8 = var7.parse(var6).getAsJsonObject().get("errorMsg");
               Optional var9 = Optional.<JsonElement>ofNullable(var8).map(JsonElement::getAsString);
               var2.method34163((String)var9.orElse((String)null));
            } catch (Exception var10) {
            }
         }
      }
   }

   private boolean method37971(long var1, int var3) {
      return var1 > 0L && var3 + 1 < 5;
   }

   private Class8619 method37972(long var1, int var3) throws InterruptedException {
      Thread.sleep(Duration.ofSeconds(var1).toMillis());
      return this.method37967(var3 + 1);
   }

   private long method37973(HttpResponse var1) {
      return Optional.<Header>ofNullable(var1.getFirstHeader("Retry-After")).<String>map(Header::getValue).<Long>map(Long::valueOf).orElse(0L);
   }

   public boolean method37974() {
      return this.field45327.isDone() || this.field45327.isCancelled();
   }
}
