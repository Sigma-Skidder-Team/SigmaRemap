package remapped;

import com.google.common.collect.Maps;
import com.mojang.util.UUIDTypeAdapter;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Map;
import java.util.UUID;
import javax.imageio.ImageIO;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3570 {
   private static final Map<String, class_1641> field_17476 = Maps.newHashMap();
   private static final Map<String, Boolean> field_17477 = Maps.newHashMap();
   private static final Map<String, String> field_17472 = Maps.newHashMap();
   private static final Logger field_17473 = LogManager.getLogger();
   private static final Identifier field_17475 = new Identifier("textures/gui/presets/isles.png");

   public static void method_16600(String var0, String var1) {
      if (var1 != null) {
         int var4 = method_16599(var0, var1);
         class_3542.method_16446(var4);
      } else {
         MinecraftClient.getInstance().method_8577().method_35674(field_17475);
      }
   }

   public static void method_16603(String var0, Runnable var1) {
      class_3542.method_16444();

      try {
         method_16597(var0);
         var1.run();
      } finally {
         class_3542.method_16399();
      }
   }

   private static void method_16598(UUID var0) {
      MinecraftClient.getInstance().method_8577().method_35674(class_1512.method_6921(var0));
   }

   private static void method_16597(String var0) {
      UUID var3 = UUIDTypeAdapter.fromString(var0);
      if (!field_17476.containsKey(var0)) {
         if (!field_17477.containsKey(var0)) {
            field_17477.put(var0, false);
            method_16598(var3);
            class_3280 var4 = new class_3280("Realms Texture Downloader", var0);
            var4.setDaemon(true);
            var4.start();
         } else if (field_17477.get(var0)) {
            if (!field_17472.containsKey(var0)) {
               method_16598(var3);
            } else {
               int var5 = method_16599(var0, field_17472.get(var0));
               class_3542.method_16446(var5);
            }
         } else {
            method_16598(var3);
         }
      } else {
         class_3542.method_16446(class_1641.method_7354(field_17476.get(var0)));
      }
   }

   private static int method_16599(String var0, String var1) {
      int var5;
      if (field_17476.containsKey(var0)) {
         class_1641 var4 = field_17476.get(var0);
         if (class_1641.method_7356(var4).equals(var1)) {
            return class_1641.method_7354(var4);
         }

         class_3542.method_16362(class_1641.method_7354(var4));
         var5 = class_1641.method_7354(var4);
      } else {
         var5 = class_1920.method_8807();
      }

      IntBuffer var15 = null;
      int var6 = 0;
      int var7 = 0;

      try {
         ByteArrayInputStream var8 = new ByteArrayInputStream(new Base64().decode(var1));

         BufferedImage var9;
         try {
            var9 = ImageIO.read(var8);
         } finally {
            IOUtils.closeQuietly(var8);
         }

         var6 = var9.getWidth();
         var7 = var9.getHeight();
         int[] var10 = new int[var6 * var7];
         var9.getRGB(0, 0, var6, var7, var10, 0, var6);
         var15 = ByteBuffer.allocateDirect(4 * var6 * var7).order(ByteOrder.nativeOrder()).asIntBuffer();
         var15.put(var10);
         ((Buffer)var15).flip();
      } catch (IOException var14) {
         var14.printStackTrace();
      }

      class_3542.method_16492(33984);
      class_3542.method_16446(var5);
      class_4970.method_22836(var15, var6, var7);
      field_17476.put(var0, new class_1641(var1, var5));
      return var5;
   }
}
