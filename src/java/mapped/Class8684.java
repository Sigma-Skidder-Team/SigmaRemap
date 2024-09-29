package mapped;

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

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.texture.Texture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.optifine.Config;
import net.optifine.entity.model.CustomEntityModels;
import net.optifine.shaders.Shaders;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

public class Class8684 {
   private static final String field39163 = "grass_block_top";
   private static final String field39164 = "grass_block_side";
   private static final String field39165 = "grass_block_side_overlay";
   private static final String field39166 = "snow";
   private static final String field39167 = "grass_block_snow";
   private static final String field39168 = "mycelium_side";
   private static final String field39169 = "mycelium_top";
   private static final String field39170 = "water_still";
   private static final String field39171 = "water_flow";
   private static final String field39172 = "lava_still";
   private static final String field39173 = "lava_flow";
   private static final String field39174 = "fire_0";
   private static final String field39175 = "fire_1";
   private static final String field39176 = "soul_fire_0";
   private static final String field39177 = "soul_fire_1";
   private static final String field39178 = "campfire_fire";
   private static final String field39179 = "campfire_log_lit";
   private static final String field39180 = "soul_campfire_fire";
   private static final String field39181 = "soul_campfire_log_lit";
   private static final String field39182 = "nether_portal";
   private static final String field39183 = "glass";
   private static final String field39184 = "glass_pane_top";
   public static TextureAtlasSprite field39185;
   public static TextureAtlasSprite field39186;
   public static TextureAtlasSprite field39187;
   public static TextureAtlasSprite field39188;
   public static TextureAtlasSprite field39189;
   public static TextureAtlasSprite field39190;
   public static TextureAtlasSprite field39191;
   public static TextureAtlasSprite field39192;
   public static TextureAtlasSprite field39193;
   public static TextureAtlasSprite field39194;
   public static TextureAtlasSprite field39195;
   public static TextureAtlasSprite field39196;
   public static TextureAtlasSprite field39197;
   public static TextureAtlasSprite field39198;
   public static TextureAtlasSprite field39199;
   public static TextureAtlasSprite field39200;
   public static TextureAtlasSprite field39201;
   public static TextureAtlasSprite field39202;
   public static TextureAtlasSprite field39203;
   public static TextureAtlasSprite field39204;
   public static TextureAtlasSprite field39205;
   public static TextureAtlasSprite field39206;
   public static final String field39207 = "minecraft:block/";
   public static final String field39208 = "minecraft:item/";
   public static final ResourceLocation field39209 = new ResourceLocation("optifine/ctm/default/empty");
   public static final ResourceLocation field39210 = new ResourceLocation("optifine/ctm/default/empty.png");
   private static IntBuffer field39211 = Config.method26984(256);
   private static int field39212 = -1;

   public static void method31259() {
      AtlasTexture var2 = method31267();
      if (var2 != null) {
         String var3 = "minecraft:block/";
         field39185 = method31260(var2, var3 + "grass_block_top");
         field39186 = method31260(var2, var3 + "grass_block_side");
         field39187 = method31260(var2, var3 + "grass_block_side_overlay");
         field39188 = method31260(var2, var3 + "snow");
         field39189 = method31260(var2, var3 + "grass_block_snow");
         field39190 = method31260(var2, var3 + "mycelium_side");
         field39191 = method31260(var2, var3 + "mycelium_top");
         field39192 = method31260(var2, var3 + "water_still");
         field39193 = method31260(var2, var3 + "water_flow");
         field39194 = method31260(var2, var3 + "lava_still");
         field39195 = method31260(var2, var3 + "lava_flow");
         field39196 = method31260(var2, var3 + "fire_0");
         field39197 = method31260(var2, var3 + "fire_1");
         field39198 = method31260(var2, var3 + "soul_fire_0");
         field39199 = method31260(var2, var3 + "soul_fire_1");
         field39200 = method31260(var2, var3 + "campfire_fire");
         field39201 = method31260(var2, var3 + "campfire_log_lit");
         field39202 = method31260(var2, var3 + "soul_campfire_fire");
         field39203 = method31260(var2, var3 + "soul_campfire_log_lit");
         field39204 = method31260(var2, var3 + "nether_portal");
         field39205 = method31260(var2, var3 + "glass");
         field39206 = method31260(var2, var3 + "glass_pane_top");
         String var4 = "minecraft:item/";
      }
   }

   public static TextureAtlasSprite method31260(AtlasTexture var0, String var1) {
      TextureAtlasSprite var4 = var0.method1106(var1);
      if (var4 == null || var4 instanceof Class1714) {
         Config.method26811("Sprite not found: " + var1);
      }

      return var4;
   }

   public static BufferedImage method31261(String var0, BufferedImage var1) {
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

   public static int method31262(int var0) {
      byte var3 = 1;

      while (var3 < var0) {
         var3 *= 2;
      }

      return var3;
   }

   public static int method31263(int var0) {
      byte var3 = 1;

      int var4;
      for (var4 = 0; var3 < var0; var4++) {
         var3 *= 2;
      }

      return var4;
   }

   public static int method31264(int var0) {
      byte var3 = 1;

      for (int var4 = 0; var4 < var0; var4++) {
         var3 *= 2;
      }

      return var3;
   }

   public static Texture method31265(ResourceLocation var0) {
      Texture var3 = Config.method26861().getTexture(var0);
      if (var3 == null) {
         if (Config.method26866(var0)) {
            Class293 var4 = new Class293(var0);
            Config.method26861().loadTexture(var0, var4);
            return var4;
         } else {
            return null;
         }
      } else {
         return var3;
      }
   }

   public static void method31266(IResourceManager var0) {
      if (method31267() != null) {
         Config.method26810("*** Reloading custom textures ***");
         Class8862.method32260();
         TextureAnimations.method29392();
         method31259();
         Class8052.method27654();
         Class9422.method36143();
         Class7880.method26418();
         TextureAnimations.method29393();
         Class9680.method37833();
         Class8862.method32261();
         Class9387.method35644();
         Class7992.method27252();
         CustomEntityModels.method38688();
         Shaders.method33141();
         Class8043.method27615();
         Config.method26824();
         Class9753.method38323();
         Class6695.method20416();
         Class7050.method21966();
         Class262.method853();
         Class8703.method31388();
         Class7031.method21825();
         Config.method26861().tick();
         Config.method26810("Disable Forge light pipeline");
         Class9561.method37054(false);
      }
   }

   public static AtlasTexture method31267() {
      return Config.getTextureMap();
   }

   public static void method31268() {
      IResourceManager var2 = Config.method26862();
      if (var2 instanceof IReloadableResourceManager) {
         IReloadableResourceManager var3 = (IReloadableResourceManager)var2;
         Class276 var4 = new Class276();
         var3.addReloadListener(var4);
         Class265 var5 = new Class265();
         var3.addReloadListener(var5);
      }
   }

   public static void method31269() {
      Class300 var2 = new Class300();
      ResourceLocation var3 = new ResourceLocation("optifine/tickable_textures");
      Config.method26861().loadTexture(var3, var2);
   }

   public static void method31270(ModelBakery var0) {
      Class7992.method27245();
      Class7992.method27251(var0);
   }

   public static void method31271(AtlasTexture var0) {
      if (var0.getTextureLocation().equals(AtlasTexture.LOCATION_BLOCKS_TEXTURE)) {
         Class9619.method37482(var0);
         Class7992.method27249(var0);
         Class9422.method36142(var0);
      }
   }

   public static void method31272(AtlasTexture var0) {
      if (var0.getTextureLocation().equals(AtlasTexture.LOCATION_BLOCKS_TEXTURE)) {
         Class9619.method37484(var0);
         Class7992.method27250(var0);
         Class9422.method36145(var0);
      }

      EmissiveTextures.method30602(var0);
   }

   public static ResourceLocation method31273(ResourceLocation var0, String var1) {
      if (var0.getNamespace().equals("minecraft")) {
         String var4 = var0.getPath();
         String var5 = method31274(var4, var1);
         if (var5 != var4) {
            var0 = new ResourceLocation(var0.getNamespace(), var5);
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static String method31274(String var0, String var1) {
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

   public static String method31275(String var0) {
      int var3 = var0.lastIndexOf(47);
      return var3 >= 0 ? var0.substring(0, var3) : "";
   }

   public static void method31276() {
      if (GL.getCapabilities().GL_EXT_texture_filter_anisotropic) {
         float var2 = GL11.glGetFloat(34047);
         float var3 = (float) Config.method26889();
         var3 = Math.min(var3, var2);
         GL11.glTexParameterf(3553, 34046, var3);
      }
   }

   public static void method31277(int var0) {
      GlStateManager.bindTexture(var0);
   }

   public static boolean method31278(int var0) {
      int var3 = MathHelper.method37800(var0);
      return var3 == var0;
   }

   public static Class1806 method31279(Class1806 var0, int var1) {
      BufferedImage var4 = method31280(var0);
      BufferedImage var5 = method31282(var4, var1);
      return method31281(var5);
   }

   public static BufferedImage method31280(Class1806 var0) {
      int var3 = var0.method7886();
      int var4 = var0.method7887();
      int[] var5 = new int[var3 * var4];
      var0.method7915().get(var5);
      BufferedImage var6 = new BufferedImage(var3, var4, 2);
      var6.setRGB(0, 0, var3, var4, var5, 0, var3);
      return var6;
   }

   private static Class1806 method31281(BufferedImage var0) {
      int var3 = var0.getWidth();
      int var4 = var0.getHeight();
      int[] var5 = new int[var3 * var4];
      var0.getRGB(0, 0, var3, var4, var5, 0, var3);
      Class1806 var6 = new Class1806(var3, var4, false);
      var6.method7915().put(var5);
      return var6;
   }

   public static BufferedImage method31282(BufferedImage var0, int var1) {
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

   public static int method31283(int var0, int var1) {
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

   public static int method31284(int var0, int var1) {
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

   public static Dimension method31285(InputStream var0, String var1) {
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

   public static void method31286(TextureAtlasSprite var0) {
      Class1806[] var3 = var0.method7488();

      for (int var4 = 0; var4 < var3.length; var4++) {
         Class1806 var5 = var3[var4];
         if (var5 != null) {
            Config.method26810("" + var4 + ": " + var5.method7886() * var5.method7887());
         } else {
            Config.method26810("" + var4 + ": " + var5);
         }
      }
   }

   public static void method31287(String var0, int var1, int var2, int var3, int var4) {
      method31277(var1);
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
            Config.method26810("Exported: " + var20);
         } catch (Exception var18) {
            Config.method26811("Error writing: " + var20);
            Config.method26811("" + var18.getClass().getName() + ": " + var18.getMessage());
         }
      }
   }

   public static int method31288() {
      if (field39212 < 0) {
         field39212 = method31289();
      }

      return field39212;
   }

   private static int method31289() {
      for (int var2 = 65536; var2 > 0; var2 >>= 1) {
         GlStateManager.texImage2D(32868, 0, 6408, var2, var2, 0, 6408, 5121, (IntBuffer)null);
         int var3 = GL11.glGetError();
         int var4 = GlStateManager.method23809(32868, 0, 4096);
         if (var4 != 0) {
            return var2;
         }
      }

      return 0;
   }

   public static BufferedImage method31290(InputStream var0) throws IOException {
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

   public static int method31291(int var0) {
      int var3 = var0 >> 24 & 0xFF;
      int var4 = var0 >> 16 & 0xFF;
      int var5 = var0 >> 8 & 0xFF;
      int var6 = var0 >> 0 & 0xFF;
      return var3 << 24 | var6 << 16 | var5 << 8 | var4;
   }

   public static void method31292() {
      GlStateManager.method23856(3314, 0);
      GlStateManager.method23856(3316, 0);
      GlStateManager.method23856(3315, 0);
      GlStateManager.method23856(3317, 4);
   }
}
