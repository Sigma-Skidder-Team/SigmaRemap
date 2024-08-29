package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class Class294 extends Class293 {
   private static final Logger field1136 = LogManager.getLogger();
   private final File field1141;
   private final String field1142;
   private final boolean field1143;
   private final Runnable field1144;
   private CompletableFuture<?> field1145;
   private boolean field1146;
   public Boolean field1147 = null;
   public boolean field1148 = false;
   private boolean field1149 = false;

   public Class294(File var1, String var2, ResourceLocation var3, boolean var4, Runnable var5) {
      super(var3);
      this.field1141 = var1;
      this.field1142 = var2;
      this.field1143 = var4;
      this.field1144 = var5;
   }

   private void method1149(Class1806 var1) {
      if (this.field1144 instanceof Class1458) {
         Class1458 var4 = (Class1458)this.field1144;
         var1 = var4.method6460(var1);
         var4.method6461();
      }

      this.method1150(var1);
   }

   private void method1150(Class1806 var1) {
      if (this.field1144 != null) {
         this.field1144.run();
      }

      Minecraft.getInstance().execute(() -> {
         this.field1146 = true;
         if (RenderSystem.isOnRenderThread()) {
            this.method1151(var1);
         } else {
            RenderSystem.method27810(() -> this.method1151(var1));
         }
      });
   }

   private void method1151(Class1806 var1) {
      Class8535.method30368(this.method1131(), var1.method7886(), var1.method7887());
      var1.method7893(0, 0, 0, true);
      this.field1147 = var1 != null;
   }

   @Override
   public void method1090(IResourceManager var1) throws IOException {
      Minecraft.getInstance().execute(() -> {
         if (!this.field1146) {
            try {
               super.method1090(var1);
            } catch (IOException var5x) {
               field1136.warn("Failed to load texture: {}", this.field1137, var5x);
            }

            this.field1146 = true;
         }
      });
      if (this.field1145 == null) {
         Class1806 var4;
         if (this.field1141 != null && this.field1141.isFile()) {
            field1136.debug("Loading http texture from local cache ({})", this.field1141);
            FileInputStream var5 = new FileInputStream(this.field1141);
            var4 = this.method1152(var5);
         } else {
            var4 = null;
         }

         if (var4 == null) {
            this.field1145 = CompletableFuture.runAsync(() -> {
               HttpURLConnection var3 = null;
               field1136.debug("Downloading http texture from {} to {}", this.field1142, this.field1141);
               if (this.method1153()) {
                  this.method1154();
               } else {
                  try {
                     var3 = (HttpURLConnection)new URL(this.field1142).openConnection(Minecraft.getInstance().getProxy());
                     var3.setDoInput(true);
                     var3.setDoOutput(false);
                     var3.connect();
                     if (var3.getResponseCode() / 100 == 2) {
                        InputStream var4x;
                        if (this.field1141 != null) {
                           FileUtils.copyInputStreamToFile(var3.getInputStream(), this.field1141);
                           var4x = new FileInputStream(this.field1141);
                        } else {
                           var4x = var3.getInputStream();
                        }

                        Minecraft.getInstance().execute(() -> {
                           Class1806 var4xx = this.method1152(var4x);
                           if (var4xx != null) {
                              this.method1149(var4xx);
                              this.method1155();
                           }
                        });
                        this.field1149 = true;
                        return;
                     }

                     if (var3.getErrorStream() != null) {
                        Class7944.method26927(var3.getErrorStream());
                     }

                     return;
                  } catch (Exception var8) {
                     field1136.error("Couldn't download http texture", var8);
                  } finally {
                     if (var3 != null) {
                        var3.disconnect();
                     }

                     this.method1155();
                  }
               }
            }, Util.getServerExecutor());
         } else {
            this.method1149(var4);
            this.method1155();
         }
      }
   }

   @Nullable
   private Class1806 method1152(InputStream var1) {
      Class1806 var4 = null;

      try {
         var4 = Class1806.method7879(var1);
         if (this.field1143) {
            var4 = method1157(var4);
         }
      } catch (IOException var6) {
         field1136.warn("Error while loading the skin texture", var6);
      }

      return var4;
   }

   private boolean method1153() {
      if (this.field1148) {
         Proxy var3 = Minecraft.getInstance().getProxy();
         return var3.type() != Type.DIRECT && var3.type() != Type.SOCKS ? false : this.field1142.startsWith("http://");
      } else {
         return false;
      }
   }

   private void method1154() {
      try {
         Class7432 var3 = Class7615.method24943(this.field1142, Minecraft.getInstance().getProxy());
         Class8075 var4 = Class7615.method24950(var3);
         if (var4.method27942() / 100 == 2) {
            byte[] var5 = var4.method27946();
            ByteArrayInputStream var6 = new ByteArrayInputStream(var5);
            Class1806 var7;
            if (this.field1141 != null) {
               FileUtils.copyInputStreamToFile(var6, this.field1141);
               var7 = Class1806.method7879(new FileInputStream(this.field1141));
            } else {
               var7 = Class1806.method7879(var6);
            }

            this.method1149(var7);
            this.field1149 = true;
            return;
         }
      } catch (Exception var11) {
         field1136.error("Couldn't download http texture: " + var11.getClass().getName() + ": " + var11.getMessage());
         return;
      } finally {
         this.method1155();
      }
   }

   private void method1155() {
      if (!this.field1149 && this.field1144 instanceof Class1458) {
         Class1458 var3 = (Class1458)this.field1144;
         var3.method6462();
      }
   }

   public Runnable method1156() {
      return this.field1144;
   }

   private static Class1806 method1157(Class1806 var0) {
      boolean var3 = var0.method7887() == 32;
      if (var3) {
         Class1806 var4 = new Class1806(64, 64, true);
         var4.method7903(var0);
         var0.close();
         var0 = var4;
         var4.method7904(0, 32, 64, 32, 0);
         var4.method7905(4, 16, 16, 32, 4, 4, true, false);
         var4.method7905(8, 16, 16, 32, 4, 4, true, false);
         var4.method7905(0, 20, 24, 32, 4, 12, true, false);
         var4.method7905(4, 20, 16, 32, 4, 12, true, false);
         var4.method7905(8, 20, 8, 32, 4, 12, true, false);
         var4.method7905(12, 20, 16, 32, 4, 12, true, false);
         var4.method7905(44, 16, -8, 32, 4, 4, true, false);
         var4.method7905(48, 16, -8, 32, 4, 4, true, false);
         var4.method7905(40, 20, 0, 32, 4, 12, true, false);
         var4.method7905(44, 20, -8, 32, 4, 12, true, false);
         var4.method7905(48, 20, -16, 32, 4, 12, true, false);
         var4.method7905(52, 20, -8, 32, 4, 12, true, false);
      }

      method1159(var0, 0, 0, 32, 16);
      if (var3) {
         method1158(var0, 32, 0, 64, 32);
      }

      method1159(var0, 0, 16, 64, 32);
      method1159(var0, 16, 48, 48, 64);
      return var0;
   }

   private static void method1158(Class1806 var0, int var1, int var2, int var3, int var4) {
      for (int var7 = var1; var7 < var3; var7++) {
         for (int var8 = var2; var8 < var4; var8++) {
            int var9 = var0.method7889(var7, var8);
            if ((var9 >> 24 & 0xFF) < 128) {
               return;
            }
         }
      }

      for (int var10 = var1; var10 < var3; var10++) {
         for (int var11 = var2; var11 < var4; var11++) {
            var0.method7890(var10, var11, var0.method7889(var10, var11) & 16777215);
         }
      }
   }

   private static void method1159(Class1806 var0, int var1, int var2, int var3, int var4) {
      for (int var7 = var1; var7 < var3; var7++) {
         for (int var8 = var2; var8 < var4; var8++) {
            var0.method7890(var7, var8, var0.method7889(var7, var8) | 0xFF000000);
         }
      }
   }
}
