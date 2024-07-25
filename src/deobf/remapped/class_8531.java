package remapped;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8531 {
   private static final Logger field_43667 = LogManager.getLogger();
   private volatile boolean field_43664;
   private volatile boolean field_43669;
   private volatile boolean field_43668;
   private volatile boolean field_43663;
   private volatile File field_43671;
   private volatile File field_43661;
   private volatile HttpGet field_43666;
   private Thread field_43665;
   private final RequestConfig field_43670 = RequestConfig.custom().setSocketTimeout(120000).setConnectTimeout(120000).build();
   private static final String[] field_43660 = new String[]{
      "CON",
      "COM",
      "PRN",
      "AUX",
      "CLOCK$",
      "NUL",
      "COM1",
      "COM2",
      "COM3",
      "COM4",
      "COM5",
      "COM6",
      "COM7",
      "COM8",
      "COM9",
      "LPT1",
      "LPT2",
      "LPT3",
      "LPT4",
      "LPT5",
      "LPT6",
      "LPT7",
      "LPT8",
      "LPT9"
   };

   public long method_39262(String var1) {
      CloseableHttpClient var4 = null;
      HttpGet var5 = null;

      long var10;
      try {
         var5 = new HttpGet(var1);
         var4 = HttpClientBuilder.create().setDefaultRequestConfig(this.field_43670).build();
         CloseableHttpResponse var6 = var4.execute(var5);
         return Long.parseLong(var6.getFirstHeader("Content-Length").getValue());
      } catch (Throwable var20) {
         field_43667.error("Unable to get content length for download");
         var10 = 0L;
      } finally {
         if (var5 != null) {
            var5.releaseConnection();
         }

         if (var4 != null) {
            try {
               var4.close();
            } catch (IOException var19) {
               field_43667.error("Could not close http client", var19);
            }
         }
      }

      return var10;
   }

   public void method_39272(class_8105 var1, String var2, class_1432 var3, class_9663 var4) {
      if (this.field_43665 == null) {
         this.field_43665 = new Thread(() -> {
            CloseableHttpClient var7 = null;

            try {
               this.field_43671 = File.createTempFile("backup", ".tar.gz");
               this.field_43666 = new HttpGet(var1.field_41509);
               var7 = HttpClientBuilder.create().setDefaultRequestConfig(this.field_43670).build();
               CloseableHttpResponse var8 = var7.execute(this.field_43666);
               var3.field_7732 = Long.parseLong(var8.getFirstHeader("Content-Length").getValue());
               if (var8.getStatusLine().getStatusCode() != 200) {
                  this.field_43668 = true;
                  this.field_43666.abort();
                  return;
               }

               FileOutputStream var9 = new FileOutputStream(this.field_43671);
               class_3695 var10 = new class_3695(this, var2.trim(), this.field_43671, var4, var3, null);
               class_9796 var11 = new class_9796(this, var9);
               var11.method_45198(var10);
               IOUtils.copy(var8.getEntity().getContent(), var11);
            } catch (Exception var98) {
               field_43667.error("Caught exception while downloading: " + var98.getMessage());
               this.field_43668 = true;
               return;
            } finally {
               this.field_43666.releaseConnection();
               if (this.field_43671 != null) {
                  this.field_43671.delete();
               }

               if (!this.field_43668) {
                  if (!var1.field_41513.isEmpty() && !var1.field_41510.isEmpty()) {
                     try {
                        this.field_43671 = File.createTempFile("resources", ".tar.gz");
                        this.field_43666 = new HttpGet(var1.field_41513);
                        CloseableHttpResponse var20 = var7.execute(this.field_43666);
                        var3.field_7732 = Long.parseLong(var20.getFirstHeader("Content-Length").getValue());
                        if (var20.getStatusLine().getStatusCode() != 200) {
                           this.field_43668 = true;
                           this.field_43666.abort();
                           return;
                        }

                        FileOutputStream var21 = new FileOutputStream(this.field_43671);
                        class_6492 var22 = new class_6492(this, this.field_43671, var3, var1, null);
                        class_9796 var23 = new class_9796(this, var21);
                        var23.method_45198(var22);
                        IOUtils.copy(var20.getEntity().getContent(), var23);
                     } catch (Exception var96) {
                        field_43667.error("Caught exception while downloading: " + var96.getMessage());
                        this.field_43668 = true;
                     } finally {
                        this.field_43666.releaseConnection();
                        if (this.field_43671 != null) {
                           this.field_43671.delete();
                        }
                     }
                  } else {
                     this.field_43669 = true;
                  }
               }

               if (var7 != null) {
                  try {
                     var7.close();
                  } catch (IOException var95) {
                     field_43667.error("Failed to close Realms download client");
                  }
               }
            }
         });
         this.field_43665.setUncaughtExceptionHandler(new class_4525(field_43667));
         this.field_43665.start();
      }
   }

   public void method_39278() {
      if (this.field_43666 != null) {
         this.field_43666.abort();
      }

      if (this.field_43671 != null) {
         this.field_43671.delete();
      }

      this.field_43664 = true;
   }

   public boolean method_39274() {
      return this.field_43669;
   }

   public boolean method_39267() {
      return this.field_43668;
   }

   public boolean method_39265() {
      return this.field_43663;
   }

   public static String method_39264(String var0) {
      var0 = var0.replaceAll("[\\./\"]", "_");

      for (String var6 : field_43660) {
         if (var0.equalsIgnoreCase(var6)) {
            var0 = "_" + var0 + "_";
         }
      }

      return var0;
   }

   private void method_39271(String var1, File var2, class_9663 var3) throws IOException {
      Pattern var6 = Pattern.compile(".*-([0-9]+)$");
      int var7 = 1;

      for (char var11 : class_7665.field_38956) {
         var1 = var1.replace(var11, '_');
      }

      if (StringUtils.isEmpty(var1)) {
         var1 = "Realm";
      }

      var1 = method_39264(var1);

      try {
         for (class_460 var134 : var3.method_44631()) {
            if (var134.method_2203().toLowerCase(Locale.ROOT).startsWith(var1.toLowerCase(Locale.ROOT))) {
               Matcher var137 = var6.matcher(var134.method_2203());
               if (var137.matches()) {
                  if (Integer.valueOf(var137.group(1)) > var7) {
                     var7 = Integer.valueOf(var137.group(1));
                  }
               } else {
                  var7++;
               }
            }
         }
      } catch (Exception var130) {
         field_43667.error("Error getting level list", var130);
         this.field_43668 = true;
         return;
      }

      String var133;
      if (var3.method_44626(var1) && var7 <= 1) {
         var133 = var1;
      } else {
         var133 = var1 + (var7 == 1 ? "" : "-" + var7);
         if (!var3.method_44626(var133)) {
            boolean var135 = false;

            while (!var135) {
               var7++;
               var133 = var1 + (var7 == 1 ? "" : "-" + var7);
               if (var3.method_44626(var133)) {
                  var135 = true;
               }
            }
         }
      }

      TarArchiveInputStream var136 = null;
      File var138 = new File(MinecraftClient.getInstance().runDirectory.getAbsolutePath(), "saves");

      try {
         var138.mkdir();
         var136 = new TarArchiveInputStream(new GzipCompressorInputStream(new BufferedInputStream(new FileInputStream(var2))));

         for (TarArchiveEntry var139 = var136.getNextTarEntry(); var139 != null; var139 = var136.getNextTarEntry()) {
            File var12 = new File(var138, var139.getName().replace("world", var133));
            if (var139.isDirectory()) {
               var12.mkdirs();
            } else {
               var12.createNewFile();

               try (FileOutputStream var13 = new FileOutputStream(var12)) {
                  IOUtils.copy(var136, var13);
               }
            }
         }
      } catch (Exception var128) {
         field_43667.error("Error extracting world", var128);
         this.field_43668 = true;
      } finally {
         if (var136 != null) {
            var136.close();
         }

         if (var2 != null) {
            var2.delete();
         }

         try (class_3676 var23 = var3.method_44633(var133)) {
            var23.method_17062(var133.trim());
            Path var25 = var23.method_17064(class_263.field_925);
            method_39276(var25.toFile());
         } catch (IOException var126) {
            field_43667.error("Failed to rename unpacked realms level {}", var133, var126);
         }

         this.field_43661 = new File(var138, var133 + File.separator + "resources.zip");
      }
   }

   private static void method_39276(File var0) {
      if (var0.exists()) {
         try {
            class_5734 var3 = class_5957.method_27227(var0);
            class_5734 var4 = var3.method_25937("Data");
            var4.method_25959("Player");
            class_5957.method_27218(var3, var0);
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }
   }
}
