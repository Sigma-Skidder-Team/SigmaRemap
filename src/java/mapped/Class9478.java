package mapped;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundNBT;
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

public class Class9478 {
   private static final Logger field44053 = LogManager.getLogger();
   private volatile boolean field44054;
   private volatile boolean field44055;
   private volatile boolean field44056;
   private volatile boolean field44057;
   private volatile File field44058;
   private volatile File field44059;
   private volatile HttpGet field44060;
   private Thread field44061;
   private final RequestConfig field44062 = RequestConfig.custom().setSocketTimeout(120000).setConnectTimeout(120000).build();
   private static final String[] field44063 = new String[]{
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

   public long method36586(String var1) {
      CloseableHttpClient var4 = null;
      HttpGet var5 = null;

      long var10;
      try {
         var5 = new HttpGet(var1);
         var4 = HttpClientBuilder.create().setDefaultRequestConfig(this.field44062).build();
         CloseableHttpResponse var6 = var4.execute(var5);
         return Long.parseLong(var6.getFirstHeader("Content-Length").getValue());
      } catch (Throwable var20) {
         field44053.error("Unable to get content length for download");
         var10 = 0L;
      } finally {
         if (var5 != null) {
            var5.releaseConnection();
         }

         if (var4 != null) {
            try {
               var4.close();
            } catch (IOException var19) {
               field44053.error("Could not close http client", var19);
            }
         }
      }

      return var10;
   }

   public void method36587(Class6120 var1, String var2, Class7155 var3, SaveFormat var4) {
      if (this.field44061 == null) {
         this.field44061 = new Thread(() -> {
            CloseableHttpClient var7 = null;

            try {
               this.field44058 = File.createTempFile("backup", ".tar.gz");
               this.field44060 = new HttpGet(var1.field27402);
               var7 = HttpClientBuilder.create().setDefaultRequestConfig(this.field44062).build();
               CloseableHttpResponse var8 = var7.execute(this.field44060);
               var3.field30736 = Long.parseLong(var8.getFirstHeader("Content-Length").getValue());
               if (var8.getStatusLine().getStatusCode() != 200) {
                  this.field44056 = true;
                  this.field44060.abort();
                  return;
               }

               FileOutputStream var9 = new FileOutputStream(this.field44058);
               Class6305 var10 = new Class6305(this, var2.trim(), this.field44058, var4, var3);
               Class1760 var11 = new Class1760(this, var9);
               var11.method7701(var10);
               IOUtils.copy(var8.getEntity().getContent(), var11);
            } catch (Exception var98) {
               field44053.error("Caught exception while downloading: " + var98.getMessage());
               this.field44056 = true;
               return;
            } finally {
               this.field44060.releaseConnection();
               if (this.field44058 != null) {
                  this.field44058.delete();
               }

               if (!this.field44056) {
                  if (!var1.field27403.isEmpty() && !var1.field27404.isEmpty()) {
                     try {
                        this.field44058 = File.createTempFile("resources", ".tar.gz");
                        this.field44060 = new HttpGet(var1.field27403);
                        CloseableHttpResponse var20 = var7.execute(this.field44060);
                        var3.field30736 = Long.parseLong(var20.getFirstHeader("Content-Length").getValue());
                        if (var20.getStatusLine().getStatusCode() != 200) {
                           this.field44056 = true;
                           this.field44060.abort();
                           return;
                        }

                        FileOutputStream var21 = new FileOutputStream(this.field44058);
                        Class6313 var22 = new Class6313(this, this.field44058, var3, var1);
                        Class1760 var23 = new Class1760(this, var21);
                        var23.method7701(var22);
                        IOUtils.copy(var20.getEntity().getContent(), var23);
                     } catch (Exception var96) {
                        field44053.error("Caught exception while downloading: " + var96.getMessage());
                        this.field44056 = true;
                     } finally {
                        this.field44060.releaseConnection();
                        if (this.field44058 != null) {
                           this.field44058.delete();
                        }
                     }
                  } else {
                     this.field44055 = true;
                  }
               }

               if (var7 != null) {
                  try {
                     var7.close();
                  } catch (IOException var95) {
                     field44053.error("Failed to close Realms download client");
                  }
               }
            }
         });
         this.field44061.setUncaughtExceptionHandler(new Class6034(field44053));
         this.field44061.start();
      }
   }

   public void method36588() {
      if (this.field44060 != null) {
         this.field44060.abort();
      }

      if (this.field44058 != null) {
         this.field44058.delete();
      }

      this.field44054 = true;
   }

   public boolean method36589() {
      return this.field44055;
   }

   public boolean method36590() {
      return this.field44056;
   }

   public boolean method36591() {
      return this.field44057;
   }

   public static String method36592(String var0) {
      var0 = var0.replaceAll("[\\./\"]", "_");

      for (String var6 : field44063) {
         if (var0.equalsIgnoreCase(var6)) {
            var0 = "_" + var0 + "_";
         }
      }

      return var0;
   }

   private void method36593(String var1, File var2, SaveFormat var3) throws IOException {
      Pattern var6 = Pattern.compile(".*-([0-9]+)$");
      int var7 = 1;

      for (char var11 : SharedConstants.field42546) {
         var1 = var1.replace(var11, '_');
      }

      if (StringUtils.isEmpty(var1)) {
         var1 = "Realm";
      }

      var1 = method36592(var1);

      try {
         for (Class2024 var134 : var3.method38458()) {
            if (var134.method8643().toLowerCase(Locale.ROOT).startsWith(var1.toLowerCase(Locale.ROOT))) {
               Matcher var137 = var6.matcher(var134.method8643());
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
         field44053.error("Error getting level list", var130);
         this.field44056 = true;
         return;
      }

      String var133;
      if (var3.method38464(var1) && var7 <= 1) {
         var133 = var1;
      } else {
         var133 = var1 + (var7 == 1 ? "" : "-" + var7);
         if (!var3.method38464(var133)) {
            boolean var135 = false;

            while (!var135) {
               var7++;
               var133 = var1 + (var7 == 1 ? "" : "-" + var7);
               if (var3.method38464(var133)) {
                  var135 = true;
               }
            }
         }
      }

      TarArchiveInputStream var136 = null;
      File var138 = new File(Minecraft.getInstance().gameDir.getAbsolutePath(), "saves");

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
         field44053.error("Error extracting world", var128);
         this.field44056 = true;
      } finally {
         if (var136 != null) {
            var136.close();
         }

         if (var2 != null) {
            var2.delete();
         }

         try (SaveFormat.LevelSave var23 = var3.getLevelSave(var133)) {
            var23.method8004(var133.trim());
            Path var25 = var23.resolveFilePath(FolderName.field23350);
            method36594(var25.toFile());
         } catch (IOException var126) {
            field44053.error("Failed to rename unpacked realms level {}", var133, var126);
         }

         this.field44059 = new File(var138, var133 + File.separator + "resources.zip");
      }
   }

   private static void method36594(File var0) {
      if (var0.exists()) {
         try {
            CompoundNBT var3 = Class8799.method31765(var0);
            CompoundNBT var4 = var3.getCompound("Data");
            var4.method133("Player");
            Class8799.method31767(var3, var0);
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }
   }

   // $VF: synthetic method
   public static boolean method36596(Class9478 var0) {
      return var0.field44054;
   }

   // $VF: synthetic method
   public static boolean method36597(Class9478 var0) {
      return var0.field44056;
   }

   // $VF: synthetic method
   public static boolean method36598(Class9478 var0, boolean var1) {
      return var0.field44057 = var1;
   }

   // $VF: synthetic method
   public static void method36599(Class9478 var0, String var1, File var2, SaveFormat var3) throws IOException {
      var0.method36593(var1, var2, var3);
   }

   // $VF: synthetic method
   public static Logger method36600() {
      return field44053;
   }

   // $VF: synthetic method
   public static boolean method36601(Class9478 var0, boolean var1) {
      return var0.field44056 = var1;
   }

   // $VF: synthetic method
   public static File method36602(Class9478 var0) {
      return var0.field44059;
   }

   // $VF: synthetic method
   public static boolean method36603(Class9478 var0, boolean var1) {
      return var0.field44055 = var1;
   }
}
