package remapped;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.Proxy.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9211 extends class_1809 {
   private static final Logger field_47108 = LogManager.getLogger();
   private final File field_47113;
   private final String field_47110;
   private final boolean field_47116;
   private final Runnable field_47117;
   private CompletableFuture<?> field_47111;
   private boolean field_47112;
   public Boolean field_47114 = null;
   public boolean field_47109 = false;
   private boolean field_47115 = false;

   public class_9211(File var1, String var2, class_4639 var3, boolean var4, Runnable var5) {
      super(var3);
      this.field_47113 = var1;
      this.field_47110 = var2;
      this.field_47116 = var4;
      this.field_47117 = var5;
   }

   private void method_42539(class_5797 var1) {
      if (this.field_47117 instanceof class_7452) {
         class_7452 var4 = (class_7452)this.field_47117;
         var1 = var4.method_33914(var1);
         var4.method_33916();
      }

      this.method_42542(var1);
   }

   private void method_42542(class_5797 var1) {
      if (this.field_47117 != null) {
         this.field_47117.run();
      }

      class_1893.method_8510().execute(() -> {
         this.field_47112 = true;
         if (class_3542.method_16366()) {
            this.method_42543(var1);
         } else {
            class_3542.method_16474(() -> this.method_42543(var1));
         }
      });
   }

   private void method_42543(class_5797 var1) {
      class_4970.method_22840(this.method_37055(), var1.method_26228(), var1.method_26253());
      var1.method_26260(0, 0, 0, true);
      this.field_47114 = var1 != null;
   }

   @Override
   public void method_37053(class_7832 var1) throws IOException {
      class_1893.method_8510().execute(() -> {
         if (!this.field_47112) {
            try {
               super.method_37053(var1);
            } catch (IOException var5x) {
               field_47108.warn("Failed to load texture: {}", this.field_9206, var5x);
            }

            this.field_47112 = true;
         }
      });
      if (this.field_47111 == null) {
         class_5797 var4;
         if (this.field_47113 != null && this.field_47113.isFile()) {
            field_47108.debug("Loading http texture from local cache ({})", this.field_47113);
            FileInputStream var5 = new FileInputStream(this.field_47113);
            var4 = this.method_42547(var5);
         } else {
            var4 = null;
         }

         if (var4 == null) {
            this.field_47111 = CompletableFuture.runAsync(() -> {
               HttpURLConnection var3 = null;
               field_47108.debug("Downloading http texture from {} to {}", this.field_47110, this.field_47113);
               if (this.method_42548()) {
                  this.method_42541();
               } else {
                  try {
                     var3 = (HttpURLConnection)new URL(this.field_47110).openConnection(class_1893.method_8510().method_8607());
                     var3.setDoInput(true);
                     var3.setDoOutput(false);
                     var3.connect();
                     if (var3.getResponseCode() / 100 == 2) {
                        Object var4x;
                        if (this.field_47113 != null) {
                           FileUtils.copyInputStreamToFile(var3.getInputStream(), this.field_47113);
                           var4x = new FileInputStream(this.field_47113);
                        } else {
                           var4x = var3.getInputStream();
                        }

                        class_1893.method_8510().execute(() -> {
                           class_5797 var4xx = this.method_42547(var4x);
                           if (var4xx != null) {
                              this.method_42539(var4xx);
                              this.method_42545();
                           }
                        });
                        this.field_47115 = true;
                        return;
                     }

                     if (var3.getErrorStream() != null) {
                        class_3111.method_14250(var3.getErrorStream());
                     }

                     return;
                  } catch (Exception var8) {
                     field_47108.error("Couldn't download http texture", var8);
                  } finally {
                     if (var3 != null) {
                        var3.disconnect();
                     }

                     this.method_42545();
                  }
               }
            }, class_9665.method_44661());
         } else {
            this.method_42539(var4);
            this.method_42545();
         }
      }
   }

   @Nullable
   private class_5797 method_42547(InputStream var1) {
      class_5797 var4 = null;

      try {
         var4 = class_5797.method_26230(var1);
         if (this.field_47116) {
            var4 = method_42544(var4);
         }
      } catch (IOException var6) {
         field_47108.warn("Error while loading the skin texture", var6);
      }

      return var4;
   }

   private boolean method_42548() {
      if (this.field_47109) {
         Proxy var3 = class_1893.method_8510().method_8607();
         return var3.type() != Type.DIRECT && var3.type() != Type.SOCKS ? false : this.field_47110.startsWith("http://");
      } else {
         return false;
      }
   }

   private void method_42541() {
      try {
         class_1951 var3 = class_2316.method_10646(this.field_47110, class_1893.method_8510().method_8607());
         class_3548 var4 = class_2316.method_10649(var3);
         if (var4.method_16508() / 100 == 2) {
            byte[] var5 = var4.method_16512();
            ByteArrayInputStream var6 = new ByteArrayInputStream(var5);
            class_5797 var7;
            if (this.field_47113 != null) {
               FileUtils.copyInputStreamToFile(var6, this.field_47113);
               var7 = class_5797.method_26230(new FileInputStream(this.field_47113));
            } else {
               var7 = class_5797.method_26230(var6);
            }

            this.method_42539(var7);
            this.field_47115 = true;
            return;
         }
      } catch (Exception var11) {
         field_47108.error("Couldn't download http texture: " + var11.getClass().getName() + ": " + var11.getMessage());
         return;
      } finally {
         this.method_42545();
      }
   }

   private void method_42545() {
      if (!this.field_47115 && this.field_47117 instanceof class_7452) {
         class_7452 var3 = (class_7452)this.field_47117;
         var3.method_33917();
      }
   }

   public Runnable method_42540() {
      return this.field_47117;
   }

   private static class_5797 method_42544(class_5797 var0) {
      boolean var3 = var0.method_26253() == 32;
      if (var3) {
         class_5797 var4 = new class_5797(64, 64, true);
         var4.method_26250(var0);
         var0.close();
         var0 = var4;
         var4.method_26226(0, 32, 64, 32, 0);
         var4.method_26249(4, 16, 16, 32, 4, 4, true, false);
         var4.method_26249(8, 16, 16, 32, 4, 4, true, false);
         var4.method_26249(0, 20, 24, 32, 4, 12, true, false);
         var4.method_26249(4, 20, 16, 32, 4, 12, true, false);
         var4.method_26249(8, 20, 8, 32, 4, 12, true, false);
         var4.method_26249(12, 20, 16, 32, 4, 12, true, false);
         var4.method_26249(44, 16, -8, 32, 4, 4, true, false);
         var4.method_26249(48, 16, -8, 32, 4, 4, true, false);
         var4.method_26249(40, 20, 0, 32, 4, 12, true, false);
         var4.method_26249(44, 20, -8, 32, 4, 12, true, false);
         var4.method_26249(48, 20, -16, 32, 4, 12, true, false);
         var4.method_26249(52, 20, -8, 32, 4, 12, true, false);
      }

      method_42546(var0, 0, 0, 32, 16);
      if (var3) {
         method_42549(var0, 32, 0, 64, 32);
      }

      method_42546(var0, 0, 16, 64, 32);
      method_42546(var0, 16, 48, 48, 64);
      return var0;
   }

   private static void method_42549(class_5797 var0, int var1, int var2, int var3, int var4) {
      for (int var7 = var1; var7 < var3; var7++) {
         for (int var8 = var2; var8 < var4; var8++) {
            int var9 = var0.method_26252(var7, var8);
            if ((var9 >> 24 & 0xFF) < 128) {
               return;
            }
         }
      }

      for (int var10 = var1; var10 < var3; var10++) {
         for (int var11 = var2; var11 < var4; var11++) {
            var0.method_26242(var10, var11, var0.method_26252(var10, var11) & 16777215);
         }
      }
   }

   private static void method_42546(class_5797 var0, int var1, int var2, int var3, int var4) {
      for (int var7 = var1; var7 < var3; var7++) {
         for (int var8 = var2; var8 < var4; var8++) {
            var0.method_26242(var7, var8, var0.method_26252(var7, var8) | 0xFF000000);
         }
      }
   }
}
