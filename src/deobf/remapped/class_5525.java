package remapped;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

public class class_5525 {
   private static final String field_28163 = "grass_block_top";
   private static final String field_28151 = "grass_block_side";
   private static final String field_28159 = "grass_block_side_overlay";
   private static final String field_28140 = "snow";
   private static final String field_28133 = "grass_block_snow";
   private static final String field_28155 = "mycelium_side";
   private static final String field_28160 = "mycelium_top";
   private static final String field_28122 = "water_still";
   private static final String field_28147 = "water_flow";
   private static final String field_28167 = "lava_still";
   private static final String field_28169 = "lava_flow";
   private static final String field_28170 = "fire_0";
   private static final String field_28124 = "fire_1";
   private static final String field_28152 = "soul_fire_0";
   private static final String field_28161 = "soul_fire_1";
   private static final String field_28143 = "campfire_fire";
   private static final String field_28125 = "campfire_log_lit";
   private static final String field_28123 = "soul_campfire_fire";
   private static final String field_28137 = "soul_campfire_log_lit";
   private static final String field_28121 = "nether_portal";
   private static final String field_28164 = "glass";
   private static final String field_28141 = "glass_pane_top";
   public static class_5155 field_28131;
   public static class_5155 field_28153;
   public static class_5155 field_28130;
   public static class_5155 field_28168;
   public static class_5155 field_28145;
   public static class_5155 field_28134;
   public static class_5155 field_28136;
   public static class_5155 field_28157;
   public static class_5155 field_28158;
   public static class_5155 field_28138;
   public static class_5155 field_28148;
   public static class_5155 field_28144;
   public static class_5155 field_28135;
   public static class_5155 field_28132;
   public static class_5155 field_28150;
   public static class_5155 field_28129;
   public static class_5155 field_28156;
   public static class_5155 field_28162;
   public static class_5155 field_28142;
   public static class_5155 field_28128;
   public static class_5155 field_28166;
   public static class_5155 field_28171;
   public static final String field_28126 = "minecraft:block/";
   public static final String field_28149 = "minecraft:item/";
   public static final class_4639 field_28139 = new class_4639("optifine/ctm/default/empty");
   public static final class_4639 field_28154 = new class_4639("optifine/ctm/default/empty.png");
   private static IntBuffer field_28165 = class_3111.method_14260(256);
   private static int field_28146 = -1;

   public static void method_25070() {
      class_8359 var2 = method_25083();
      if (var2 != null) {
         String var3 = "minecraft:block/";
         field_28131 = method_25092(var2, var3 + "grass_block_top");
         field_28153 = method_25092(var2, var3 + "grass_block_side");
         field_28130 = method_25092(var2, var3 + "grass_block_side_overlay");
         field_28168 = method_25092(var2, var3 + "snow");
         field_28145 = method_25092(var2, var3 + "grass_block_snow");
         field_28134 = method_25092(var2, var3 + "mycelium_side");
         field_28136 = method_25092(var2, var3 + "mycelium_top");
         field_28157 = method_25092(var2, var3 + "water_still");
         field_28158 = method_25092(var2, var3 + "water_flow");
         field_28138 = method_25092(var2, var3 + "lava_still");
         field_28148 = method_25092(var2, var3 + "lava_flow");
         field_28144 = method_25092(var2, var3 + "fire_0");
         field_28135 = method_25092(var2, var3 + "fire_1");
         field_28132 = method_25092(var2, var3 + "soul_fire_0");
         field_28150 = method_25092(var2, var3 + "soul_fire_1");
         field_28129 = method_25092(var2, var3 + "campfire_fire");
         field_28156 = method_25092(var2, var3 + "campfire_log_lit");
         field_28162 = method_25092(var2, var3 + "soul_campfire_fire");
         field_28142 = method_25092(var2, var3 + "soul_campfire_log_lit");
         field_28128 = method_25092(var2, var3 + "nether_portal");
         field_28166 = method_25092(var2, var3 + "glass");
         field_28171 = method_25092(var2, var3 + "glass_pane_top");
         String var4 = "minecraft:item/";
      }
   }

   public static class_5155 method_25092(class_8359 var0, String var1) {
      class_5155 var4 = var0.method_38522(var1);
      if (var4 == null || var4 instanceof class_2008) {
         class_3111.method_14317("Sprite not found: " + var1);
      }

      return var4;
   }

   public static BufferedImage method_25090(String var0, BufferedImage var1) {
      if (var0.startsWith("/mob/zombie") || var0.startsWith("/mob/pigzombie")) {
         int var4 = var1.getWidth();
         int var5 = var1.getHeight();
         if (var4 == var5 * 2) {
            BufferedImage var6 = new BufferedImage(var4, var5 * 2, 2);
            Graphics2D var7 = var6.createGraphics();
            var7.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            var7.drawImage(var1, 0, 0, var4, var5, (ImageObserver)null);
            return var6;
         }
      }

      return var1;
   }

   public static int method_25068(int var0) {
      byte var3 = 1;

      while (var3 < var0) {
         var3 *= 2;
      }

      return var3;
   }

   public static int method_25093(int var0) {
      byte var3 = 1;

      int var4;
      for (var4 = 0; var3 < var0; var4++) {
         var3 *= 2;
      }

      return var4;
   }

   public static int method_25074(int var0) {
      byte var3 = 1;

      for (int var4 = 0; var4 < var0; var4++) {
         var3 *= 2;
      }

      return var3;
   }

   public static class_8143 method_25065(class_4639 var0) {
      class_8143 var3 = class_3111.method_14266().method_35679(var0);
      if (var3 == null) {
         if (class_3111.method_14362(var0)) {
            class_1809 var4 = new class_1809(var0);
            class_3111.method_14266().method_35682(var0, var4);
            return var4;
         } else {
            return null;
         }
      } else {
         return var3;
      }
   }

   public static void method_25089(class_7832 var0) {
      if (method_25083() != null) {
         class_3111.method_14277("*** Reloading custom textures ***");
         class_6167.method_28269();
         class_4454.method_20648();
         method_25070();
         class_3475.method_15968();
         class_8316.method_38331();
         class_2986.method_13669();
         class_4454.method_20646();
         class_9300.method_42905();
         class_6167.method_28270();
         class_8192.method_37528();
         class_3290.method_15101();
         class_9763.method_45062();
         class_6588.method_30303();
         class_3458.method_15908();
         class_3111.method_14275();
         class_9582.method_44262();
         class_877.method_3778();
         class_1322.method_6046();
         class_7416.method_33786();
         class_5609.method_25463();
         class_1303.method_5951();
         class_3111.method_14266().method_80();
         class_3111.method_14277("Disable Forge light pipeline");
         class_8835.method_40640(false);
      }
   }

   public static class_8359 method_25083() {
      return class_3111.method_14295();
   }

   public static void method_25088() {
      class_7832 var2 = class_3111.method_14450();
      if (var2 instanceof class_550) {
         class_550 var3 = (class_550)var2;
         class_5379 var4 = new class_5379();
         var3.method_2649(var4);
         class_5143 var5 = new class_5143();
         var3.method_2649(var5);
      }
   }

   public static void method_25071() {
      class_4192 var2 = new class_4192();
      class_4639 var3 = new class_4639("optifine/tickable_textures");
      class_3111.method_14266().method_35682(var3, var2);
   }

   public static void method_25066(class_6560 var0) {
      class_3290.method_15073();
      class_3290.method_15076(var0);
   }

   public static void method_25073(class_8359 var0) {
      if (var0.method_38519().equals(class_8359.field_42824)) {
         class_9049.method_41533(var0);
         class_3290.method_15082(var0);
         class_8316.method_38337(var0);
      }
   }

   public static void method_25075(class_8359 var0) {
      if (var0.method_38519().equals(class_8359.field_42824)) {
         class_9049.method_41546(var0);
         class_3290.method_15103(var0);
         class_8316.method_38338(var0);
      }

      class_5052.method_23279(var0);
   }

   public static class_4639 method_25064(class_4639 var0, String var1) {
      if (var0.method_21461().equals("minecraft")) {
         String var4 = var0.method_21456();
         String var5 = method_25096(var4, var1);
         if (var5 != var4) {
            var0 = new class_4639(var0.method_21461(), var5);
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static String method_25096(String var0, String var1) {
      String var4 = "assets/minecraft/";
      if (!var0.startsWith(var4)) {
         if (!var0.startsWith("./")) {
            if (var0.startsWith("/~")) {
               var0 = var0.substring(1);
            }

            String var5 = "optifine/";
            if (!var0.startsWith("~/")) {
               return !var0.startsWith("/") ? var0 : var5 + var0.substring(1);
            } else {
               var0 = var0.substring(2);
               return var5 + var0;
            }
         } else {
            var0 = var0.substring(2);
            if (!var1.endsWith("/")) {
               var1 = var1 + "/";
            }

            return var1 + var0;
         }
      } else {
         return var0.substring(var4.length());
      }
   }

   public static String method_25091(String var0) {
      int var3 = var0.lastIndexOf(47);
      return var3 >= 0 ? var0.substring(0, var3) : "";
   }

   public static void method_25084() {
      if (GL.getCapabilities().GL_EXT_texture_filter_anisotropic) {
         float var2 = GL11.glGetFloat(34047);
         float var3 = (float)class_3111.method_14412();
         var3 = Math.min(var3, var2);
         GL11.glTexParameterf(3553, 34046, var3);
      }
   }

   public static void method_25077(int var0) {
      class_1920.method_8791(var0);
   }

   public static boolean method_25097(int var0) {
      int var3 = class_9299.method_42801(var0);
      return var3 == var0;
   }

   public static class_5797 method_25095(class_5797 var0, int var1) {
      BufferedImage var4 = method_25086(var0);
      BufferedImage var5 = method_25094(var4, var1);
      return method_25078(var5);
   }

   public static BufferedImage method_25086(class_5797 var0) {
      int var3 = var0.method_26228();
      int var4 = var0.method_26253();
      int[] var5 = new int[var3 * var4];
      var0.method_26251().get(var5);
      BufferedImage var6 = new BufferedImage(var3, var4, 2);
      var6.setRGB(0, 0, var3, var4, var5, 0, var3);
      return var6;
   }

   private static class_5797 method_25078(BufferedImage var0) {
      int var3 = var0.getWidth();
      int var4 = var0.getHeight();
      int[] var5 = new int[var3 * var4];
      var0.getRGB(0, 0, var3, var4, var5, 0, var3);
      class_5797 var6 = new class_5797(var3, var4, false);
      var6.method_26251().put(var5);
      return var6;
   }

   public static BufferedImage method_25094(BufferedImage var0, int var1) {
      int var4 = var0.getWidth();
      int var5 = var0.getHeight();
      int var6 = var5 * var1 / var4;
      BufferedImage var7 = new BufferedImage(var1, var6, 2);
      Graphics2D var8 = var7.createGraphics();
      Object var9 = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
      if (var1 < var4 || var1 % var4 != 0) {
         var9 = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
      }

      var8.setRenderingHint(RenderingHints.KEY_INTERPOLATION, var9);
      var8.drawImage(var0, 0, 0, var1, var6, (ImageObserver)null);
      return var7;
   }

   public static int method_25087(int var0, int var1) {
      if (var0 == var1) {
         return var0;
      } else {
         int var4 = var0 / var1 * var1;

         while (var4 < var0) {
            var4 += var1;
         }

         return var4;
      }
   }

   public static int method_25069(int var0, int var1) {
      if (var0 >= var1) {
         return var0;
      } else {
         int var4 = var1 / var0 * var0;

         while (var4 < var1) {
            var4 += var0;
         }

         return var4;
      }
   }

   public static Dimension method_25063(InputStream var0, String var1) {
      Iterator var4 = ImageIO.getImageReadersBySuffix(var1);

      while (var4.hasNext()) {
         ImageReader var5 = (ImageReader)var4.next();

         Dimension var9;
         try {
            ImageInputStream var6 = ImageIO.createImageInputStream(var0);
            var5.setInput(var6);
            int var7 = var5.getWidth(var5.getMinIndex());
            int var8 = var5.getHeight(var5.getMinIndex());
            var9 = new Dimension(var7, var8);
         } catch (IOException var13) {
            continue;
         } finally {
            var5.dispose();
         }

         return var9;
      }

      return null;
   }

   public static void method_25076(class_5155 var0) {
      class_5797[] var3 = var0.method_23627();

      for (int var4 = 0; var4 < var3.length; var4++) {
         class_5797 var5 = var3[var4];
         if (var5 != null) {
            class_3111.method_14277("" + var4 + ": " + var5.method_26228() * var5.method_26253());
         } else {
            class_3111.method_14277("" + var4 + ": " + var5);
         }
      }
   }

   public static void method_25082(String var0, int var1, int var2, int var3, int var4) {
      method_25077(var1);
      GL11.glPixelStorei(3333, 1);
      GL11.glPixelStorei(3317, 1);
      File var7 = new File(var0);
      File var8 = var7.getParentFile();
      if (var8 != null) {
         var8.mkdirs();
      }

      for (int var9 = 0; var9 < 16; var9++) {
         String var10 = var0.endsWith(".png") ? var0.replace(".png", "_" + var9 + ".png") : var0 + "_" + var9 + ".png";
         File var11 = new File(var10);
         var11.delete();
      }

      for (int var19 = 0; var19 <= var2; var19++) {
         File var20 = new File(var0 + "_" + var19 + ".png");
         int var21 = var3 >> var19;
         int var12 = var4 >> var19;
         int var13 = var21 * var12;
         IntBuffer var14 = BufferUtils.createIntBuffer(var13);
         int[] var15 = new int[var13];
         GL11.glGetTexImage(3553, var19, 32993, 33639, var14);
         var14.get(var15);
         BufferedImage var16 = new BufferedImage(var21, var12, 2);
         var16.setRGB(0, 0, var21, var12, var15, 0, var21);

         try {
            ImageIO.write(var16, "png", var20);
            class_3111.method_14277("Exported: " + var20);
         } catch (Exception var18) {
            class_3111.method_14317("Error writing: " + var20);
            class_3111.method_14317("" + var18.getClass().getName() + ": " + var18.getMessage());
         }
      }
   }

   public static int method_25079() {
      if (field_28146 < 0) {
         field_28146 = method_25080();
      }

      return field_28146;
   }

   private static int method_25080() {
      for (int var2 = 65536; var2 > 0; var2 >>= 1) {
         class_1920.method_8886(32868, 0, 6408, var2, var2, 0, 6408, 5121, (IntBuffer)null);
         int var3 = GL11.glGetError();
         int var4 = class_1920.method_8911(32868, 0, 4096);
         if (var4 != 0) {
            return var2;
         }
      }

      return 0;
   }

   public static BufferedImage method_25085(InputStream var0) throws IOException {
      if (var0 == null) {
         return null;
      } else {
         BufferedImage var4;
         try {
            BufferedImage var3 = ImageIO.read(var0);
            var4 = var3;
         } finally {
            IOUtils.closeQuietly(var0);
         }

         return var4;
      }
   }

   public static int method_25081(int var0) {
      int var3 = var0 >> 24 & 0xFF;
      int var4 = var0 >> 16 & 0xFF;
      int var5 = var0 >> 8 & 0xFF;
      int var6 = var0 >> 0 & 0xFF;
      return var3 << 24 | var6 << 16 | var5 << 8 | var4;
   }

   public static void method_25072() {
      class_1920.method_8763(3314, 0);
      class_1920.method_8763(3316, 0);
      class_1920.method_8763(3315, 0);
      class_1920.method_8763(3317, 4);
   }
}
