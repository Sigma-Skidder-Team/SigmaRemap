package net.optifine;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import mapped.*;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.util.Util;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.resources.VanillaPack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.StringTextComponent;
import net.optifine.shaders.Shaders;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLCapabilities;

public class Config {
   public static final String field34139 = "OptiFine";
   public static final String field34140 = "1.16.4";
   public static final String field34141 = "HD_U";
   public static final String field34142 = "G5";
   public static final String field34143 = "OptiFine_1.16.4_HD_U_G5";
   private static String field34144 = null;
   private static String field34145 = null;
   private static boolean field34146 = false;
   public static String field34147 = null;
   public static String field34148 = null;
   public static String field34149 = null;
   public static String[] field34150 = null;
   public static Class7728 field34151 = null;
   public static Class7728 field34152 = null;
   public static int field34153 = -1;
   public static boolean field34154 = false;
   public static boolean field34155 = false;
   private static GameSettings field34156 = null;
   private static Minecraft field34157 = Minecraft.getInstance();
   private static boolean field34158 = false;
   private static Thread field34159 = null;
   private static int field34160 = 0;
   private static int field34161 = 0;
   public static boolean field34162 = false;
   public static boolean field34163 = false;
   private static int field34164 = 0;
   private static boolean field34165 = false;
   private static boolean field34166 = false;
   public static final Float field34167 = 0.1F;
   private static final Logger field34168 = LogManager.getLogger();
   public static final boolean field34169 = System.getProperty("log.detail", "false").equals("true");
   private static String field34170 = null;
   private static int field34171 = 0;
   private static int field34172 = 0;
   private static AtlasTexture field34173;
   private static long field34174;
   private static long field34175;

   private Config() {
   }

   public static String method26777() {
      return "OptiFine_1.16.4_HD_U_G5";
   }

   public static String method26778() {
      StringBuffer var2 = new StringBuffer(32);
      if (method26970()) {
         var2.append("DL: ");
         var2.append(String.valueOf(Class9446.method36322()));
         var2.append(", ");
      }

      var2.append("OptiFine_1.16.4_HD_U_G5");
      String var3 = Shaders.method33137();
      if (var3 != null) {
         var2.append(", ");
         var2.append(var3);
      }

      return var2.toString();
   }

   public static void method26779(GameSettings var0) {
      if (field34156 == null) {
         field34156 = var0;
         method26936();
         Class9561.method37042("optifine.ForgeSplashCompatible", Boolean.TRUE);
         field34160 = field34156.field44688;
      }
   }

   public static void method26780() {
      method26781();
      field34159 = Thread.currentThread();
      method26795();
      Shaders.method32991(Minecraft.getInstance());
   }

   public static void method26781() {
      if (!field34158 && Minecraft.getInstance().getMainWindow() != null) {
         field34158 = true;
         method26782();
         method26798();
      }
   }

   private static void method26782() {
      method26815("");
      method26815(method26777());
      method26815("Build: " + method26783());
      method26815("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
      method26815("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
      method26815("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
      method26815("LWJGL: " + GLFW.glfwGetVersionString());
      field34147 = GL11.glGetString(7938);
      field34148 = GL11.glGetString(7937);
      field34149 = GL11.glGetString(7936);
      method26815("OpenGL: " + field34148 + ", version " + field34147 + ", " + field34149);
      method26815("OpenGL Version: " + method26788());
      GLCapabilities var2 = GL.getCapabilities();
      if (!var2.OpenGL12) {
         method26815("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
      }

      field34154 = var2.GL_NV_fog_distance;
      if (!field34154) {
         method26815("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
      }

      field34155 = var2.GL_ARB_occlusion_query;
      if (!field34155) {
         method26815("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
      }

      int var3 = Class8684.method31288();
      method26810("Maximum texture size: " + var3 + "x" + var3);
   }

   public static String method26783() {
      if (field34144 == null) {
         try {
            InputStream var2 = method26784("/buildof.txt");
            if (var2 == null) {
               return null;
            }

            field34144 = method26923(var2)[0];
         } catch (Exception var3) {
            method26811("" + var3.getClass().getName() + ": " + var3.getMessage());
            field34144 = "";
         }
      }

      return field34144;
   }

   public static InputStream method26784(String var0) {
      InputStream var3 = Class9561.method37043(var0);
      return var3 == null ? Config.class.getResourceAsStream(var0) : var3;
   }

   public static boolean method26785() {
      return field34154;
   }

   public static boolean method26786() {
      return field34155;
   }

   public static int method26787() {
      if (field34153 < 0) {
         String[] var2 = method26903("1.16.4", ".");
         int var3 = 0;
         if (var2.length > 0) {
            var3 += 10000 * method26899(var2[0], 0);
         }

         if (var2.length > 1) {
            var3 += 100 * method26899(var2[1], 0);
         }

         if (var2.length > 2) {
            var3 += 1 * method26899(var2[2], 0);
         }

         field34153 = var3;
      }

      return field34153;
   }

   public static String method26788() {
      Class7728 var2 = method26790();
      return "" + var2.method25562() + "." + var2.method25563() + "." + var2.method25564();
   }

   private static Class7728 method26789() {
      GLCapabilities var2 = GL.getCapabilities();
      if (!var2.OpenGL44) {
         if (!var2.OpenGL43) {
            if (!var2.OpenGL42) {
               if (!var2.OpenGL41) {
                  if (!var2.OpenGL40) {
                     if (!var2.OpenGL33) {
                        if (!var2.OpenGL32) {
                           if (!var2.OpenGL31) {
                              if (!var2.OpenGL30) {
                                 if (!var2.OpenGL21) {
                                    if (!var2.OpenGL20) {
                                       if (!var2.OpenGL15) {
                                          if (!var2.OpenGL14) {
                                             if (!var2.OpenGL13) {
                                                if (!var2.OpenGL12) {
                                                   return !var2.OpenGL11 ? new Class7728(1, 0) : new Class7728(1, 1);
                                                } else {
                                                   return new Class7728(1, 2);
                                                }
                                             } else {
                                                return new Class7728(1, 3);
                                             }
                                          } else {
                                             return new Class7728(1, 4);
                                          }
                                       } else {
                                          return new Class7728(1, 5);
                                       }
                                    } else {
                                       return new Class7728(2, 0);
                                    }
                                 } else {
                                    return new Class7728(2, 1);
                                 }
                              } else {
                                 return new Class7728(3, 0);
                              }
                           } else {
                              return new Class7728(3, 1);
                           }
                        } else {
                           return new Class7728(3, 2);
                        }
                     } else {
                        return new Class7728(3, 3);
                     }
                  } else {
                     return new Class7728(4, 0);
                  }
               } else {
                  return new Class7728(4, 1);
               }
            } else {
               return new Class7728(4, 2);
            }
         } else {
            return new Class7728(4, 3);
         }
      } else {
         return new Class7728(4, 4);
      }
   }

   public static Class7728 method26790() {
      if (field34151 == null) {
         String var2 = GL11.glGetString(7938);
         field34151 = method26792(var2, (Class7728)null);
         if (field34151 == null) {
            field34151 = method26789();
         }

         if (field34151 == null) {
            field34151 = new Class7728(1, 0);
         }
      }

      return field34151;
   }

   public static Class7728 method26791() {
      if (field34152 == null) {
         String var2 = GL11.glGetString(35724);
         field34152 = method26792(var2, (Class7728)null);
         if (field34152 == null) {
            field34152 = new Class7728(1, 10);
         }
      }

      return field34152;
   }

   public static Class7728 method26792(String var0, Class7728 var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            Pattern var4 = Pattern.compile("([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.+)?");
            Matcher var5 = var4.matcher(var0);
            if (!var5.matches()) {
               return var1;
            } else {
               int var6 = Integer.parseInt(var5.group(1));
               int var7 = Integer.parseInt(var5.group(2));
               int var8 = var5.group(4) != null ? Integer.parseInt(var5.group(4)) : 0;
               String var9 = var5.group(5);
               return new Class7728(var6, var7, var8, var9);
            }
         }
      } catch (Exception var10) {
         method26814("", var10);
         return var1;
      }
   }

   public static String[] method26793() {
      if (field34150 == null) {
         field34150 = method26794();
      }

      return field34150;
   }

   private static String[] method26794() {
      try {
         Class7728 var2 = method26790();
         if (var2.method25562() >= 3) {
            int var3 = GL11.glGetInteger(33309);
            if (var3 > 0) {
               String[] var4 = new String[var3];

               for (int var5 = 0; var5 < var3; var5++) {
                  var4[var5] = GL30.glGetStringi(7939, var5);
               }

               return var4;
            }
         }
      } catch (Exception var7) {
         method26814("", var7);
      }

      try {
         String var8 = GL11.glGetString(7939);
         return var8.split(" ");
      } catch (Exception var6) {
         method26814("", var6);
         return new String[0];
      }
   }

   public static void method26795() {
      method26936();
      byte var2 = 8;
      if (!isSingleProcessor()) {
         field34159.setPriority(10);
         method26796("Server thread", 5);
      } else if (!method26938()) {
         field34159.setPriority(5);
         method26796("Server thread", 5);
      } else {
         field34159.setPriority(10);
         method26796("Server thread", 1);
      }
   }

   private static void method26796(String var0, int var1) {
      try {
         ThreadGroup var4 = Thread.currentThread().getThreadGroup();
         if (var4 == null) {
            return;
         }

         int var5 = (var4.activeCount() + 10) * 2;
         Thread[] var6 = new Thread[var5];
         var4.enumerate(var6, false);

         for (int var7 = 0; var7 < var6.length; var7++) {
            Thread var8 = var6[var7];
            if (var8 != null && var8.getName().startsWith(var0)) {
               var8.setPriority(var1);
            }
         }
      } catch (Throwable var9) {
         method26811(var9.getClass().getName() + ": " + var9.getMessage());
      }
   }

   public static boolean method26797() {
      return Thread.currentThread() == field34159;
   }

   private static void method26798() {
      Class383 var2 = new Class383();
      var2.start();
   }

   public static boolean method26799() {
      return field34156.field44600 > 0;
   }

   public static int method26800() {
      return field34156.field44600;
   }

   public static int method26801() {
      switch (field34156.ofMipmapType) {
         case 0:
            return 9986;
         case 1:
            return 9986;
         case 2:
            if (method26894()) {
               return 9985;
            }

            return 9986;
         case 3:
            if (method26894()) {
               return 9987;
            }

            return 9986;
         default:
            return 9986;
      }
   }

   public static boolean method26802() {
      float var2 = method26803();
      return var2 > field34167 + 1.0E-5F;
   }

   public static float method26803() {
      return field34167;
   }

   public static boolean isFogFancy() {
      return method26785() ? field34156.ofFogType == 2 : false;
   }

   public static boolean isFogFast() {
      return field34156.ofFogType == 1;
   }

   public static boolean method26806() {
      return field34156.ofFogType == 3;
   }

   public static boolean method26807() {
      return field34156.ofFogType != 3;
   }

   public static float method26808() {
      return field34156.ofFogStart;
   }

   public static void method26809(String var0) {
      if (field34169) {
         field34168.info("[OptiFine] " + var0);
      }
   }

   public static void method26810(String var0) {
      field34168.info("[OptiFine] " + var0);
   }

   public static void method26811(String var0) {
      field34168.warn("[OptiFine] " + var0);
   }

   public static void method26812(String var0, Throwable var1) {
      field34168.warn("[OptiFine] " + var0, var1);
   }

   public static void method26813(String var0) {
      field34168.error("[OptiFine] " + var0);
   }

   public static void method26814(String var0, Throwable var1) {
      field34168.error("[OptiFine] " + var0, var1);
   }

   public static void method26815(String var0) {
      method26810(var0);
   }

   public static int method26816() {
      return field34156.field44705;
   }

   public static boolean method26817() {
      return field34156.field44706;
   }

   public static boolean method26818() {
      return field34156.graphicFanciness != GraphicsFanciness.field13603;
   }

   public static boolean method26819() {
      return field34156.graphicFanciness == GraphicsFanciness.FABULOUS;
   }

   public static boolean method26820() {
      return field34156.field44693 != 0 ? field34156.field44693 == 2 : method26818();
   }

   public static boolean method26821() {
      return field34156.field44693 == 3;
   }

   public static boolean method26822() {
      if (field34156.field44690 == 0) {
         if (isShaders() && ! Shaders.field40900.method27390()) {
            return Shaders.field40900.method27392();
         } else {
            return field34164 == 0 ? method26818() : field34164 == 2;
         }
      } else {
         return field34156.field44690 == 2;
      }
   }

   public static boolean method26823() {
      if (field34156.field44690 == 0) {
         if (isShaders() && ! Shaders.field40900.method27390()) {
            return Shaders.field40900.method27393();
         } else {
            return field34164 == 0 ? false : field34164 == 3;
         }
      } else {
         return field34156.field44690 == 3;
      }
   }

   public static void method26824() {
      field34164 = 0;
      IResourceManager var2 = method26862();
      if (var2 != null) {
         try {
            InputStream var3 = var2.getShader(new ResourceLocation("optifine/color.properties")).getFile();
            if (var3 == null) {
               return;
            }

            Class20 var4 = new Class20();
            var4.load(var3);
            var3.close();
            String var5 = var4.getProperty("clouds");
            if (var5 == null) {
               return;
            }

            method26810("Texture pack clouds: " + var5);
            var5 = var5.toLowerCase();
            if (var5.equals("fast")) {
               field34164 = 1;
            }

            if (var5.equals("fancy")) {
               field34164 = 2;
            }

            if (var5.equals("off")) {
               field34164 = 3;
            }
         } catch (Exception var6) {
         }
      }
   }

   public static ModelManager method26825() {
      return field34157.getItemRenderer().field851;
   }

   public static boolean method26826() {
      return field34156.field44692 != 0 ? field34156.field44692 != 1 : method26818();
   }

   public static boolean method26827() {
      return field34156.field44692 == 4;
   }

   public static boolean method26828() {
      return field34156.field44692 != 0 ? field34156.field44692 == 4 : !method26818();
   }

   public static boolean method26829() {
      return field34156.field44694 != 0 ? field34156.field44694 == 2 : method26818();
   }

   public static int method26830(int var0, int var1, int var2) {
      if (var0 >= var1) {
         return var0 <= var2 ? var0 : var2;
      } else {
         return var1;
      }
   }

   public static long method26831(long var0, long var2, long var4) {
      if (var0 >= var2) {
         return var0 <= var4 ? var0 : var4;
      } else {
         return var2;
      }
   }

   public static float method26832(float var0, float var1, float var2) {
      if (!(var0 < var1)) {
         return !(var0 > var2) ? var0 : var2;
      } else {
         return var1;
      }
   }

   public static double method26833(double var0, double var2, double var4) {
      if (!(var0 < var2)) {
         return !(var0 > var4) ? var0 : var4;
      } else {
         return var2;
      }
   }

   public static float method26834(float var0) {
      if (!(var0 < 0.0F)) {
         return !(var0 > 1.0F) ? var0 : 1.0F;
      } else {
         return 0.0F;
      }
   }

   public static boolean method26835() {
      return field34156.field44731 != 2;
   }

   public static boolean method26836() {
      return field34156.field44731 == 1;
   }

   public static boolean method26837() {
      return field34156.field44734;
   }

   public static boolean method26838() {
      return field34156.field44732 != 2;
   }

   public static boolean method26839() {
      return field34156.field44732 == 1;
   }

   public static boolean method26840() {
      return field34156.field44733;
   }

   public static boolean method26841() {
      return field34156.field44735;
   }

   public static boolean method26842() {
      return field34156.field44736;
   }

   public static boolean method26843() {
      return field34156.field44737;
   }

   public static boolean method26844() {
      return field34156.field44738;
   }

   public static boolean method26845() {
      return field34156.field44739;
   }

   public static boolean method26846() {
      return field34156.field44740;
   }

   public static boolean method26847() {
      return field34156.field44741;
   }

   public static boolean method26848() {
      return field34156.field44742;
   }

   public static boolean method26849() {
      return field34156.field44743;
   }

   public static boolean method26850() {
      return field34156.field44744;
   }

   public static float method26851() {
      return isShaders() && Shaders.field40935 >= 0.0F ? Shaders.field40935 : (float)field34156.field44687;
   }

   public static String method26852(List var0) {
      return method26853(var0, ", ");
   }

   public static String method26853(List var0, String var1) {
      if (var0 != null) {
         StringBuffer var4 = new StringBuffer(var0.size() * 5);

         for (int var5 = 0; var5 < var0.size(); var5++) {
            Object var6 = var0.get(var5);
            if (var5 > 0) {
               var4.append(var1);
            }

            var4.append(String.valueOf(var6));
         }

         return var4.toString();
      } else {
         return "";
      }
   }

   public static String method26854(Object[] var0) {
      return method26855(var0, ", ");
   }

   public static String method26855(Object[] var0, String var1) {
      if (var0 != null) {
         StringBuffer var4 = new StringBuffer(var0.length * 5);

         for (int var5 = 0; var5 < var0.length; var5++) {
            Object var6 = var0[var5];
            if (var5 > 0) {
               var4.append(var1);
            }

            var4.append(String.valueOf(var6));
         }

         return var4.toString();
      } else {
         return "";
      }
   }

   public static String method26856(int[] var0) {
      return method26857(var0, ", ");
   }

   public static String method26857(int[] var0, String var1) {
      if (var0 != null) {
         StringBuffer var4 = new StringBuffer(var0.length * 5);

         for (int var5 = 0; var5 < var0.length; var5++) {
            int var6 = var0[var5];
            if (var5 > 0) {
               var4.append(var1);
            }

            var4.append(String.valueOf(var6));
         }

         return var4.toString();
      } else {
         return "";
      }
   }

   public static String method26858(float[] var0) {
      return method26859(var0, ", ");
   }

   public static String method26859(float[] var0, String var1) {
      if (var0 != null) {
         StringBuffer var4 = new StringBuffer(var0.length * 5);

         for (int var5 = 0; var5 < var0.length; var5++) {
            float var6 = var0[var5];
            if (var5 > 0) {
               var4.append(var1);
            }

            var4.append(String.valueOf(var6));
         }

         return var4.toString();
      } else {
         return "";
      }
   }

   public static Minecraft method26860() {
      return field34157;
   }

   public static TextureManager method26861() {
      return field34157.getTextureManager();
   }

   public static IResourceManager method26862() {
      return field34157.getResourceManager();
   }

   public static InputStream method26863(ResourceLocation var0) throws IOException {
      return method26864(field34157.getResourceManager(), var0);
   }

   public static InputStream method26864(IResourceManager var0, ResourceLocation var1) throws IOException {
      JSonShader var4 = var0.getShader(var1);
      return var4 != null ? var4.getFile() : null;
   }

   public static JSonShader method26865(ResourceLocation var0) throws IOException {
      return field34157.getResourceManager().getShader(var0);
   }

   public static boolean method26866(ResourceLocation var0) {
      if (var0 != null) {
         IResourcePack var3 = method26873(var0);
         return var3 != null;
      } else {
         return false;
      }
   }

   public static boolean method26867(IResourceManager var0, ResourceLocation var1) {
      try {
         JSonShader var4 = var0.getShader(var1);
         return var4 != null;
      } catch (IOException var5) {
         return false;
      }
   }

   public static boolean method26868(IResourcePack var0, ResourceLocation var1) {
      return var0 != null && var1 != null ? var0.resourceExists(ResourcePackType.CLIENT_RESOURCES, var1) : false;
   }

   public static IResourcePack[] method26869() {
      ResourcePackList var2 = field34157.getResourcePackList();
      Collection<ResourcePackInfo> var3 = var2.getEnabledPacks();
      ArrayList<IResourcePack> var4 = new ArrayList();

      for (ResourcePackInfo var6 : var3) {
         IResourcePack var7 = var6.getResourcePack();
         if (var7 != method26871()) {
            var4.add(var7);
         }
      }

      return var4.toArray(new IResourcePack[var4.size()]);
   }

   public static String method26870() {
      if (field34157.getResourceManager() == null) {
         return "";
      } else {
         IResourcePack[] var2 = method26869();
         if (var2.length <= 0) {
            return method26871().getName();
         } else {
            String[] var3 = new String[var2.length];

            for (int var4 = 0; var4 < var2.length; var4++) {
               var3[var4] = var2[var4].getName();
            }

            return method26854(var3);
         }
      }
   }

   public static VanillaPack method26871() {
      return field34157.getPackFinder().getVanillaPack();
   }

   public static boolean method26872(ResourceLocation var0) {
      return method26873(var0) == method26871();
   }

   public static IResourcePack method26873(ResourceLocation var0) {
      ResourcePackList var3 = field34157.getResourcePackList();
      Collection var4 = var3.getEnabledPacks();
      List var5 = (List)var4;

      for (int var6 = var5.size() - 1; var6 >= 0; var6--) {
         ResourcePackInfo var7 = (ResourcePackInfo)var5.get(var6);
         IResourcePack var8 = var7.getResourcePack();
         if (var8.resourceExists(ResourcePackType.CLIENT_RESOURCES, var0)) {
            return var8;
         }
      }

      return null;
   }

   public static WorldRenderer method26874() {
      return field34157.worldRenderer;
   }

   public static GameRenderer method26875() {
      return field34157.gameRenderer;
   }

   public static boolean method26876() {
      return field34156.field44695 != 3;
   }

   public static boolean method26877() {
      return field34156.field44695 == 2;
   }

   public static boolean method26878() {
      return field34156.field44700;
   }

   public static boolean method26879() {
      return field34156.field44701;
   }

   public static boolean method26880() {
      return field34156.field44703;
   }

   public static boolean method26881() {
      return !method26880() ? false : !isShaders() || Shaders.method32998();
   }

   public static boolean method26882() {
      return !method26880() ? false : !isShaders() || Shaders.method32999();
   }

   public static boolean method26883() {
      if (isShaders() && ! Shaders.method33000()) {
         return false;
      } else {
         return field34156.field44704 != 0 ? field34156.field44704 == 2 : method26818();
      }
   }

   public static boolean method26884() {
      return field34156.field44702;
   }

   public static void method26885(long var0) {

   }

   public static boolean method26886() {
      return field34156.field44707 == 1;
   }

   public static boolean method26887() {
      return field34156.field44707 == 0;
   }

   public static boolean method26888() {
      return field34156.field44707 == 2;
   }

   public static int method26889() {
      return 1;
   }

   public static boolean method26890() {
      return method26889() > 1;
   }

   public static int method26891() {
      return 0;
   }

   public static boolean method26892() {
      return method26891() > 0;
   }

   public static boolean method26893() {
      return method26928().field44688 > 0;
   }

   public static boolean method26894() {
      return method26889() <= 1 ? method26891() > 0 : true;
   }

   public static boolean method26895(int var0, int var1, int var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static boolean method26896(float var0, float var1, float var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static boolean method26897() {
      return field34156.field44745;
   }

   public static boolean method26898() {
      return field34156.field44708;
   }

   public static int method26899(String var0, int var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            var0 = var0.trim();
            return Integer.parseInt(var0);
         }
      } catch (NumberFormatException var5) {
         return var1;
      }
   }

   public static float method26900(String var0, float var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            var0 = var0.trim();
            return Float.parseFloat(var0);
         }
      } catch (NumberFormatException var5) {
         return var1;
      }
   }

   public static boolean method26901(String var0, boolean var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            var0 = var0.trim();
            return Boolean.parseBoolean(var0);
         }
      } catch (NumberFormatException var5) {
         return var1;
      }
   }

   public static Boolean method26902(String var0, Boolean var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            var0 = var0.trim().toLowerCase();
            if (var0.equals("true")) {
               return Boolean.TRUE;
            } else {
               return var0.equals("false") ? Boolean.FALSE : var1;
            }
         }
      } catch (NumberFormatException var5) {
         return var1;
      }
   }

   public static String[] method26903(String var0, String var1) {
      StringTokenizer var4 = new StringTokenizer(var0, var1);
      ArrayList<String> var5 = new ArrayList();

      while (var4.hasMoreTokens()) {
         String var6 = var4.nextToken();
         var5.add(var6);
      }

      return var5.toArray(new String[var5.size()]);
   }

   public static boolean method26904() {
      return field34156.field44746;
   }

   public static boolean method26905() {
      return field34156.field44747;
   }

   public static boolean method26906() {
      return field34156.field44709;
   }

   public static boolean method26907() {
      return field34156.field44710;
   }

   public static void method26908(String var0) {
      int var3 = GlStateManager.method23859();
      if (var3 != 0 && Class9084.method33877(var3)) {
         String var4 = method26985(var3);
         String var5 = String.format("OpenGL error: %s (%s), at: %s", var3, var4, var0);
         method26813(var5);
         if (method26981() && Class4379.method13743("ShowGlError", 10000L)) {
            String var6 = I18n.format("of.message.openglError", var3, var4);
            field34157.ingameGUI.getChatGUI().sendChatMessage(new StringTextComponent(var6));
         }
      }
   }

   public static boolean method26909() {
      return field34156.biomeBlendRadius > 0;
   }

   public static int method26910() {
      return field34156.biomeBlendRadius;
   }

   public static boolean method26911() {
      return field34156.field44712;
   }

   public static boolean method26912() {
      return field34156.field44713;
   }

   public static boolean method26913() {
      return field34156.field44711;
   }

   public static boolean method26914() {
      return field34156.field44714;
   }

   public static boolean method26915() {
      return field34156.field44715 != 3;
   }

   public static boolean method26916() {
      return field34156.field44717;
   }

   public static boolean method26917() {
      return field34156.field44718;
   }

   public static boolean method26918() {
      return field34156.field44715 == 2;
   }

   public static boolean method26919() {
      return field34156.field44720;
   }

   public static boolean method26920() {
      return field34156.field44721 != 0 ? field34156.field44721 == 2 : method26818();
   }

   public static boolean isShaders() {
      return Shaders.field40886;
   }

   public static String[] method26922(File var0) throws IOException {
      FileInputStream var3 = new FileInputStream(var0);
      return method26923(var3);
   }

   public static String[] method26923(InputStream var0) throws IOException {
      ArrayList<String> var3 = new ArrayList();
      InputStreamReader var4 = new InputStreamReader(var0, "ASCII");
      BufferedReader var5 = new BufferedReader(var4);

      while (true) {
         String var6 = var5.readLine();
         if (var6 == null) {
            return var3.toArray(new String[var3.size()]);
         }

         var3.add(var6);
      }
   }

   public static String method26924(File var0) throws IOException {
      FileInputStream var3 = new FileInputStream(var0);
      return method26926(var3, "ASCII");
   }

   public static String method26925(InputStream var0) throws IOException {
      return method26926(var0, "ASCII");
   }

   public static String method26926(InputStream var0, String var1) throws IOException {
      InputStreamReader var4 = new InputStreamReader(var0, var1);
      BufferedReader var5 = new BufferedReader(var4);
      StringBuffer var6 = new StringBuffer();

      while (true) {
         String var7 = var5.readLine();
         if (var7 == null) {
            return var6.toString();
         }

         var6.append(var7);
         var6.append("\n");
      }
   }

   public static byte[] method26927(InputStream var0) throws IOException {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      byte[] var4 = new byte[1024];

      while (true) {
         int var5 = var0.read(var4);
         if (var5 < 0) {
            var0.close();
            return var3.toByteArray();
         }

         var3.write(var4, 0, var5);
      }
   }

   public static GameSettings method26928() {
      return field34156;
   }

   public static String method26929() {
      return field34145;
   }

   public static void method26930(String var0) {
      field34145 = var0;
   }

   public static int method26931(String var0, String var1) {
      String[] var4 = method26932(var0);
      String[] var5 = method26932(var1);
      String var6 = var4[0];
      String var7 = var5[0];
      if (var6.equals(var7)) {
         int var8 = method26899(var4[1], -1);
         int var9 = method26899(var5[1], -1);
         if (var8 == var9) {
            String var10 = var4[2];
            String var11 = var5[2];
            if (!var10.equals(var11)) {
               if (var10.isEmpty()) {
                  return 1;
               }

               if (var11.isEmpty()) {
                  return -1;
               }
            }

            return var10.compareTo(var11);
         } else {
            return var8 - var9;
         }
      } else {
         return var6.compareTo(var7);
      }
   }

   private static String[] method26932(String var0) {
      if (var0 != null && var0.length() > 0) {
         Pattern var3 = Pattern.compile("([A-Z])([0-9]+)(.*)");
         Matcher var4 = var3.matcher(var0);
         if (var4.matches()) {
            String var5 = method26946(var4.group(1));
            String var6 = method26946(var4.group(2));
            String var7 = method26946(var4.group(3));
            return new String[]{var5, var6, var7};
         } else {
            return new String[]{"", "", ""};
         }
      } else {
         return new String[]{"", "", ""};
      }
   }

   public static int method26933(int var0) {
      var0 = var0 ^ 61 ^ var0 >> 16;
      var0 += var0 << 3;
      var0 ^= var0 >> 4;
      var0 *= 668265261;
      return var0 ^ var0 >> 15;
   }

   public static int method26934(BlockPos var0, int var1) {
      int var4 = method26933(var1 + 37);
      var4 = method26933(var4 + var0.getX());
      var4 = method26933(var4 + var0.getZ());
      return method26933(var4 + var0.getY());
   }

   public static int method26935() {
      return field34161;
   }

   public static void method26936() {
      field34161 = Runtime.getRuntime().availableProcessors();
   }

   public static boolean isSingleProcessor() {
      return method26935() <= 1;
   }

   public static boolean method26938() {
      return field34156.ofSmoothWorld;
   }

   public static boolean method26939() {
      return field34156.ofLazyChunkLoading;
   }

   public static boolean method26940() {
      return field34156.field44722;
   }

   public static boolean method26941() {
      return field34156.field44723;
   }

   public static int method26942() {
      return field34156 != null ? field34156.renderDistanceChunks : 10;
   }

   public static boolean equals(Object var0, Object var1) {
      if (var0 != var1) {
         return var0 != null ? var0.equals(var1) : false;
      } else {
         return true;
      }
   }

   public static boolean method26943(Object var0, Object[] var1) {
      if (var1 == null) {
         return false;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            Object var5 = var1[var4];
            if (equals(var0, var5)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean method26944(int var0, int[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         if (var1[var4] == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean method26945(Object var0, Object[] var1) {
      if (var1 == null) {
         return false;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            Object var5 = var1[var4];
            if (var0 == var5) {
               return true;
            }
         }

         return false;
      }
   }

   public static String method26946(String var0) {
      return var0 != null ? var0 : "";
   }

   private static ByteBuffer method26947(InputStream var0) throws IOException {
      BufferedImage var3 = ImageIO.read(var0);
      int[] var4 = var3.getRGB(0, 0, var3.getWidth(), var3.getHeight(), (int[])null, 0, var3.getWidth());
      ByteBuffer var5 = ByteBuffer.allocate(4 * var4.length);

      for (int var9 : var4) {
         var5.putInt(var9 << 8 | var9 >> 24 & 0xFF);
      }

      ((Buffer)var5).flip();
      return var5;
   }

   public static Object[] method26948(Object[] var0, Object var1) {
      if (var0 != null) {
         int var4 = var0.length;
         int var5 = var4 + 1;
         Object[] var6 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var5);
         System.arraycopy(var0, 0, var6, 0, var4);
         var6[var4] = var1;
         return var6;
      } else {
         throw new NullPointerException("The given array is NULL");
      }
   }

   public static Object[] method26949(Object[] var0, Object var1, int var2) {
      ArrayList var5 = new ArrayList<Object>(Arrays.asList(var0));
      var5.add(var2, var1);
      Object[] var6 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var5.size());
      return var5.<Object>toArray(var6);
   }

   public static Object[] method26950(Object[] var0, Object[] var1) {
      if (var0 != null) {
         if (var1.length != 0) {
            int var4 = var0.length;
            int var5 = var4 + var1.length;
            Object[] var6 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var5);
            System.arraycopy(var0, 0, var6, 0, var4);
            System.arraycopy(var1, 0, var6, var4, var1.length);
            return var6;
         } else {
            return var0;
         }
      } else {
         throw new NullPointerException("The given array is NULL");
      }
   }

   public static Object[] method26951(Object[] var0, Object var1) {
      ArrayList var4 = new ArrayList<Object>(Arrays.asList(var0));
      var4.remove(var1);
      return method26952(var4, var0.getClass().getComponentType());
   }

   public static Object[] method26952(Collection var0, Class var1) {
      if (var0 != null) {
         if (var1 != null) {
            if (!var1.isPrimitive()) {
               Object[] var4 = (Object[])Array.newInstance(var1, var0.size());
               return var0.<Object>toArray(var4);
            } else {
               throw new IllegalArgumentException("Can not make arrays with primitive elements (int, double), element class: " + var1);
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static boolean method26953() {
      return field34156.field44716;
   }

   public static void method26954(MatrixStack var0) {
      int var3 = Reflector.method35077(Reflector.field43019, -1);
      int var4 = method26955();
      int var5 = method26956();
      int var6 = field34157.worldRenderer.method924();
      int var7 = field34157.worldRenderer.method925();
      int var8 = field34157.worldRenderer.method926();
      String var9 = "" + var3 + "/" + var4 + " fps, C: " + var6 + ", E: " + var7 + "+" + var8 + ", U: " + var5;
      field34157.fontRenderer.method38801(var0, var9, 2.0F, 2.0F, -2039584);
   }

   public static int method26955() {
      return field34171;
   }

   public static int method26956() {
      return field34172;
   }

   public static void method26957() {
      FrameTimer var2 = field34157.getFrameTimer();
      long[] var3 = var2.method38597();
      int var4 = var2.method38595();
      int var5 = var2.method38594();
      if (var4 != var5) {
         int var6 = Reflector.method35077(Reflector.field43019, -1);
         if (var6 <= 0) {
            var6 = 1;
         }

         long var7 = (long)(1.0 / (double)var6 * 1.0E9);
         long var9 = var7;
         long var11 = 0L;

         for (int var13 = MathHelper.normalizeAngle(var4 - 1, var3.length);
              var13 != var5 && (double)var11 < 1.0E9;
              var13 = MathHelper.normalizeAngle(var13 - 1, var3.length)
         ) {
            long var16 = var3[var13];
            if (var16 > var9) {
               var9 = var16;
            }

            var11 += var16;
         }

         double var14 = (double)var9 / 1.0E9;
         field34171 = (int)(1.0 / var14);
      }
   }

   private static void method26958() {
      field34172 = Class9016.field41247;
      Class9016.field41247 = 0;
   }

   public static int method26959() {
      String var2 = System.getenv("ProgramFiles(X86)");
      return var2 == null ? 32 : 64;
   }

   public static int method26960() {
      String[] var2 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (int var3 = 0; var3 < var2.length; var3++) {
         String var4 = var2[var3];
         String var5 = System.getProperty(var4);
         if (var5 != null && var5.contains("64")) {
            return 64;
         }
      }

      return 32;
   }

   public static boolean method26961() {
      return field34146;
   }

   public static void method26962(boolean var0) {
      field34146 = var0;
   }

   public static boolean method26963() {
      return false;
   }

   public static void method26964(String var0, String var1) {
      Class844 var4 = new Class844(field34157.currentScreen, var0, var1);
      field34157.displayGuiScreen(var4);
   }

   public static int[] method26965(int[] var0, int var1) {
      return method26966(var0, new int[]{var1});
   }

   public static int[] method26966(int[] var0, int[] var1) {
      if (var0 != null && var1 != null) {
         int var4 = var0.length;
         int var5 = var4 + var1.length;
         int[] var6 = new int[var5];
         System.arraycopy(var0, 0, var6, 0, var4);

         for (int var7 = 0; var7 < var1.length; var7++) {
            var6[var7 + var4] = var1[var7];
         }

         return var6;
      } else {
         throw new NullPointerException("The given array is NULL");
      }
   }

   public static void method26967(File var0, String var1) throws IOException {
      FileOutputStream var4 = new FileOutputStream(var0);
      byte[] var5 = var1.getBytes("ASCII");
      var4.write(var5);
      var4.close();
   }

   public static void method26968(AtlasTexture var0) {
      field34173 = var0;
   }

   public static AtlasTexture method26969() {
      return field34173;
   }

   public static boolean method26970() {
      return field34156.field44724 != 3;
   }

   public static boolean method26971() {
      return field34156.field44724 == 1;
   }

   public static boolean method26972() {
      if (method26970()) {
         return !isShaders() ? true : Shaders.method32994();
      } else {
         return false;
      }
   }

   public static boolean method26973() {
      return field34156.field44725;
   }

   public static boolean method26974() {
      return field34156.field44726;
   }

   public static int method26975() {
      return field34156.field44728;
   }

   public static int[] method26976(Integer[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return new int[0];
      } else {
         int[] var3 = new int[var0.length];

         for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = var0[var4];
         }

         return var3;
      }
   }

   public static boolean method26977() {
      return field34156.field44685 && GlStateManager.vboRegions;
   }

   public static boolean method26978() {
      return GLX.method28310();
   }

   public static boolean method26979() {
      return field34156.ofSmoothFps;
   }

   public static boolean method26980(URI var0) {
      Util.method38513((Exception)null);
      Util.getOSType().openURI(var0);
      Exception var3 = Util.method38512();
      return var3 == null;
   }

   public static boolean method26981() {
      return field34156.field44727;
   }

   public static String method26982(boolean[] var0, String var1) {
      if (var0 != null) {
         StringBuffer var4 = new StringBuffer(var0.length * 5);

         for (int var5 = 0; var5 < var0.length; var5++) {
            boolean var6 = var0[var5];
            if (var5 > 0) {
               var4.append(var1);
            }

            var4.append(String.valueOf(var6));
         }

         return var4.toString();
      } else {
         return "";
      }
   }

   public static boolean method26983() {
      return field34157.getIntegratedServer() != null ? field34157.isIntegratedServerRunning() : false;
   }

   public static IntBuffer method26984(int var0) {
      return GLAllocation.method22266(var0 << 2).asIntBuffer();
   }

   public static String method26985(int var0) {
      switch (var0) {
         case 0:
            return "No error";
         case 1280:
            return "Invalid enum";
         case 1281:
            return "Invalid value";
         case 1282:
            return "Invalid operation";
         case 1283:
            return "Stack overflow";
         case 1284:
            return "Stack underflow";
         case 1285:
            return "Out of memory";
         case 1286:
            return "Invalid framebuffer operation";
         default:
            return "Unknown";
      }
   }

   public static boolean method26986(int var0) {
      return GLFW.glfwGetKey(field34157.getMainWindow().getHandle(), var0) == 1;
   }

   public static boolean method26987(Boolean var0) {
      return var0 != null && var0;
   }

   public static boolean method26988() {
      if (field34157.loadingGui != null) {
         if (field34157.loadingGui instanceof ResourceLoadProgressGui) {
            ResourceLoadProgressGui var2 = (ResourceLoadProgressGui)field34157.loadingGui;
            if (var2.method5682()) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean method26989() {
      return isShaders() ? ! Shaders.method33167() : false;
   }

   public static void method26990() {
      long var2 = System.currentTimeMillis();
      long var4 = var2 - field34174;
      field34174 = var2;
      var4 = method26831(var4, 1L, 1000L);
      field34175 = (field34175 + var4) / 2L;
      field34175 = method26831(field34175, 1L, 1000L);
      if (field34157.debug != field34170) {
         field34170 = field34157.debug;
         method26957();
         method26958();
      }
   }

   public static long method26991() {
      return field34175;
   }

   public static float method26992() {
      return (float)method26991() / 1000.0F;
   }

   public static long method26993() {
      return 1000L / method26991();
   }

   public static void method26994(Object var0, String var1) throws NullPointerException {
      if (var0 == null) {
         throw new NullPointerException(var1);
      }
   }
}
