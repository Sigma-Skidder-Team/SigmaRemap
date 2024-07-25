package remapped;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_828 {
   private static final Logger field_4365 = LogManager.getLogger();
   public static final ListeningExecutorService field_4363 = MoreExecutors.listeningDecorator(
      Executors.newCachedThreadPool(
         new ThreadFactoryBuilder().setDaemon(true).setUncaughtExceptionHandler(new class_447(field_4365)).setNameFormat("Downloader %d").build()
      )
   );

   public static CompletableFuture<?> method_3612(File var0, String var1, Map<String, String> var2, int var3, class_1215 var4, Proxy var5) {
      return CompletableFuture.supplyAsync(() -> {
         HttpURLConnection var8 = null;
         InputStream var9 = null;
         DataOutputStream var10 = null;
         if (var4 != null) {
            var4.method_5389(new TranslationTextComponent("resourcepack.downloading"));
            var4.method_5388(new TranslationTextComponent("resourcepack.requesting"));
         }

         try {
            try {
               byte[] var11 = new byte[4096];
               URL var30 = new URL(var1);
               var8 = (HttpURLConnection)var30.openConnection(var5);
               var8.setInstanceFollowRedirects(true);
               float var13 = 0.0F;
               float var14 = (float)var2.entrySet().size();

               for (Entry var16 : var2.entrySet()) {
                  var8.setRequestProperty((String)var16.getKey(), (String)var16.getValue());
                  if (var4 != null) {
                     var4.method_5390((int)(++var13 / var14 * 100.0F));
                  }
               }

               var9 = var8.getInputStream();
               var14 = (float)var8.getContentLength();
               int var32 = var8.getContentLength();
               if (var4 != null) {
                  var4.method_5388(new TranslationTextComponent("resourcepack.progress", String.format(Locale.ROOT, "%.2f", var14 / 1000.0F / 1000.0F)));
               }

               if (var0.exists()) {
                  long var17 = var0.length();
                  if (var17 == (long)var32) {
                     if (var4 != null) {
                        var4.method_5392();
                     }

                     return null;
                  }

                  field_4365.warn("Deleting {} as it does not match what we currently have ({} vs our {}).", var0, var32, var17);
                  FileUtils.deleteQuietly(var0);
               } else if (var0.getParentFile() != null) {
                  var0.getParentFile().mkdirs();
               }

               var10 = new DataOutputStream(new FileOutputStream(var0));
               if (var3 > 0 && var14 > (float)var3) {
                  if (var4 != null) {
                     var4.method_5392();
                  }

                  throw new IOException("Filesize is bigger than maximum allowed (file is " + var13 + ", limit is " + var3 + ")");
               }

               int var33;
               while ((var33 = var9.read(var11)) >= 0) {
                  var13 += (float)var33;
                  if (var4 != null) {
                     var4.method_5390((int)(var13 / var14 * 100.0F));
                  }

                  if (var3 > 0 && var13 > (float)var3) {
                     if (var4 != null) {
                        var4.method_5392();
                     }

                     throw new IOException("Filesize was bigger than maximum allowed (got >= " + var13 + ", limit was " + var3 + ")");
                  }

                  if (Thread.interrupted()) {
                     field_4365.error("INTERRUPTED");
                     if (var4 != null) {
                        var4.method_5392();
                     }

                     return null;
                  }

                  var10.write(var11, 0, var33);
               }

               if (var4 != null) {
                  var4.method_5392();
                  return null;
               }
            } catch (Throwable var26) {
               var26.printStackTrace();
               if (var8 != null) {
                  InputStream var12 = var8.getErrorStream();

                  try {
                     field_4365.error(IOUtils.toString(var12));
                  } catch (IOException var25) {
                     var25.printStackTrace();
                  }
               }

               if (var4 != null) {
                  var4.method_5392();
                  return null;
               }
            }

            return null;
         } finally {
            IOUtils.closeQuietly(var9);
            IOUtils.closeQuietly(var10);
         }
      }, field_4363);
   }

   public static int method_3611() {
      try (ServerSocket var2 = new ServerSocket(0)) {
         return var2.getLocalPort();
      } catch (IOException var16) {
         return 25564;
      }
   }
}
