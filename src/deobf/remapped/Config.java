package remapped;

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
import net.minecraft.util.text.StringTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLCapabilities;

public class Config {
   public static final String field_15484 = "OptiFine";
   public static final String field_15472 = "1.16.4";
   public static final String field_15459 = "HD_U";
   public static final String field_15461 = "G5";
   public static final String field_15452 = "OptiFine_1.16.4_HD_U_G5";
   private static String field_15470 = null;
   private static String field_15465 = null;
   private static boolean field_15477 = false;
   public static String field_15464 = null;
   public static String field_15458 = null;
   public static String field_15479 = null;
   public static String[] field_15478 = null;
   public static class_2556 field_15456 = null;
   public static class_2556 field_15453 = null;
   public static int field_15487 = -1;
   public static boolean field_15485 = false;
   public static boolean field_15486 = false;
   private static GameOptions field_15483 = null;
   private static MinecraftClient field_15454 = MinecraftClient.getInstance();
   private static boolean field_15471 = false;
   private static Thread field_15482 = null;
   private static int field_15480 = 0;
   private static int field_15455 = 0;
   public static boolean field_15481 = false;
   public static boolean field_15466 = false;
   private static int field_15462 = 0;
   private static boolean field_15473 = false;
   private static boolean field_15476 = false;
   public static final Float field_15488 = 0.1F;
   private static final Logger field_15451 = LogManager.getLogger();
   public static final boolean field_15475 = System.getProperty("log.detail", field_15468[44]).equals(field_15468[43]);
   private static String field_15469 = null;
   private static int field_15463 = 0;
   private static int field_15467 = 0;
   private static class_8359 field_15460;
   private static long field_15457;
   private static long field_15474;

   private Config() {
   }

   public static String method_14314() {
      return "OptiFine_1.16.4_HD_U_G5";
   }

   public static String method_14244() {
      StringBuffer var2 = new StringBuffer(32);
      if (method_14326()) {
         var2.append("DL: ");
         var2.append(String.valueOf(class_8421.method_38761()));
         var2.append(", ");
      }

      var2.append("OptiFine_1.16.4_HD_U_G5");
      String var3 = class_6588.method_30235();
      if (var3 != null) {
         var2.append(", ");
         var2.append(var3);
      }

      return var2.toString();
   }

   public static void method_14436(GameOptions var0) {
      if (field_15483 == null) {
         field_15483 = var0;
         method_14344();
         class_8835.method_40636("optifine.ForgeSplashCompatible", Boolean.TRUE);
         field_15480 = field_15483.field_45527;
      }
   }

   public static void method_14372() {
      method_14249();
      field_15482 = Thread.currentThread();
      method_14430();
      class_6588.method_30297(MinecraftClient.getInstance());
   }

   public static void method_14249() {
      if (!field_15471 && MinecraftClient.getInstance().getMainWindow() != null) {
         field_15471 = true;
         method_14398();
         method_14386();
      }
   }

   private static void method_14398() {
      method_14280("");
      method_14280(method_14314());
      method_14280("Build: " + method_14376());
      method_14280("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
      method_14280("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
      method_14280("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
      method_14280("LWJGL: " + GLFW.glfwGetVersionString());
      field_15464 = GL11.glGetString(7938);
      field_15458 = GL11.glGetString(7937);
      field_15479 = GL11.glGetString(7936);
      method_14280("OpenGL: " + field_15458 + ", version " + field_15464 + ", " + field_15479);
      method_14280("OpenGL Version: " + method_14335());
      GLCapabilities var2 = GL.getCapabilities();
      if (!var2.OpenGL12) {
         method_14280("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
      }

      field_15485 = var2.GL_NV_fog_distance;
      if (!field_15485) {
         method_14280("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
      }

      field_15486 = var2.GL_ARB_occlusion_query;
      if (!field_15486) {
         method_14280("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
      }

      int var3 = class_5525.method_25079();
      method_14277("Maximum texture size: " + var3 + "x" + var3);
   }

   public static String method_14376() {
      if (field_15470 == null) {
         try {
            InputStream var2 = method_14300("/buildof.txt");
            if (var2 == null) {
               return null;
            }

            field_15470 = method_14432(var2)[0];
         } catch (Exception var3) {
            method_14317("" + var3.getClass().getName() + ": " + var3.getMessage());
            field_15470 = "";
         }
      }

      return field_15470;
   }

   public static InputStream method_14300(String var0) {
      InputStream var3 = class_8835.method_40637(var0);
      return var3 == null ? Config.class.getResourceAsStream(var0) : var3;
   }

   public static boolean method_14408() {
      return field_15485;
   }

   public static boolean method_14306() {
      return field_15486;
   }

   public static int method_14330() {
      if (field_15487 < 0) {
         String[] var2 = method_14302("1.16.4", ".");
         int var3 = 0;
         if (var2.length > 0) {
            var3 += 10000 * method_14361(var2[0], 0);
         }

         if (var2.length > 1) {
            var3 += 100 * method_14361(var2[1], 0);
         }

         if (var2.length > 2) {
            var3 += 1 * method_14361(var2[2], 0);
         }

         field_15487 = var3;
      }

      return field_15487;
   }

   public static String method_14335() {
      class_2556 var2 = method_14311();
      return "" + var2.method_11606() + "." + var2.method_11605() + "." + var2.method_11604();
   }

   private static class_2556 method_14383() {
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
                                                   return !var2.OpenGL11 ? new class_2556(1, 0) : new class_2556(1, 1);
                                                } else {
                                                   return new class_2556(1, 2);
                                                }
                                             } else {
                                                return new class_2556(1, 3);
                                             }
                                          } else {
                                             return new class_2556(1, 4);
                                          }
                                       } else {
                                          return new class_2556(1, 5);
                                       }
                                    } else {
                                       return new class_2556(2, 0);
                                    }
                                 } else {
                                    return new class_2556(2, 1);
                                 }
                              } else {
                                 return new class_2556(3, 0);
                              }
                           } else {
                              return new class_2556(3, 1);
                           }
                        } else {
                           return new class_2556(3, 2);
                        }
                     } else {
                        return new class_2556(3, 3);
                     }
                  } else {
                     return new class_2556(4, 0);
                  }
               } else {
                  return new class_2556(4, 1);
               }
            } else {
               return new class_2556(4, 2);
            }
         } else {
            return new class_2556(4, 3);
         }
      } else {
         return new class_2556(4, 4);
      }
   }

   public static class_2556 method_14311() {
      if (field_15456 == null) {
         String var2 = GL11.glGetString(7938);
         field_15456 = method_14402(var2, (class_2556)null);
         if (field_15456 == null) {
            field_15456 = method_14383();
         }

         if (field_15456 == null) {
            field_15456 = new class_2556(1, 0);
         }
      }

      return field_15456;
   }

   public static class_2556 method_14269() {
      if (field_15453 == null) {
         String var2 = GL11.glGetString(35724);
         field_15453 = method_14402(var2, (class_2556)null);
         if (field_15453 == null) {
            field_15453 = new class_2556(1, 10);
         }
      }

      return field_15453;
   }

   public static class_2556 method_14402(String var0, class_2556 var1) {
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
               return new class_2556(var6, var7, var8, var9);
            }
         }
      } catch (Exception var10) {
         method_14349("", var10);
         return var1;
      }
   }

   public static String[] method_14381() {
      if (field_15478 == null) {
         field_15478 = method_14240();
      }

      return field_15478;
   }

   private static String[] method_14240() {
      try {
         class_2556 var2 = method_14311();
         if (var2.method_11606() >= 3) {
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
         method_14349("", var7);
      }

      try {
         String var8 = GL11.glGetString(7939);
         return var8.split(" ");
      } catch (Exception var6) {
         method_14349("", var6);
         return new String[0];
      }
   }

   public static void method_14430() {
      method_14344();
      byte var2 = 8;
      if (!method_14411()) {
         field_15482.setPriority(10);
         method_14366("Server thread", 5);
      } else if (!method_14401()) {
         field_15482.setPriority(5);
         method_14366("Server thread", 5);
      } else {
         field_15482.setPriority(10);
         method_14366("Server thread", 1);
      }
   }

   private static void method_14366(String var0, int var1) {
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
         method_14317(var9.getClass().getName() + ": " + var9.getMessage());
      }
   }

   public static boolean method_14272() {
      return Thread.currentThread() == field_15482;
   }

   private static void method_14386() {
      class_210 var2 = new class_210();
      var2.start();
   }

   public static boolean method_14397() {
      return field_15483.field_45577 > 0;
   }

   public static int method_14245() {
      return field_15483.field_45577;
   }

   public static int method_14392() {
      switch (field_15483.field_45545) {
         case 0:
            return 9986;
         case 1:
            return 9986;
         case 2:
            if (method_14405()) {
               return 9985;
            }

            return 9986;
         case 3:
            if (method_14405()) {
               return 9987;
            }

            return 9986;
         default:
            return 9986;
      }
   }

   public static boolean method_14437() {
      float var2 = method_14341();
      return var2 > field_15488 + 1.0E-5F;
   }

   public static float method_14341() {
      return field_15488;
   }

   public static boolean method_14324() {
      return method_14408() ? field_15483.field_45497 == 2 : false;
   }

   public static boolean method_14296() {
      return field_15483.field_45497 == 1;
   }

   public static boolean method_14365() {
      return field_15483.field_45497 == 3;
   }

   public static boolean method_14420() {
      return field_15483.field_45497 != 3;
   }

   public static float method_14336() {
      return field_15483.field_45428;
   }

   public static void method_14284(String var0) {
      if (field_15475) {
         field_15451.info("[OptiFine] " + var0);
      }
   }

   public static void method_14277(String var0) {
      field_15451.info("[OptiFine] " + var0);
   }

   public static void method_14317(String var0) {
      field_15451.warn("[OptiFine] " + var0);
   }

   public static void method_14318(String var0, Throwable var1) {
      field_15451.warn("[OptiFine] " + var0, var1);
   }

   public static void method_14348(String var0) {
      field_15451.error("[OptiFine] " + var0);
   }

   public static void method_14349(String var0, Throwable var1) {
      field_15451.error("[OptiFine] " + var0, var1);
   }

   public static void method_14280(String var0) {
      method_14277(var0);
   }

   public static int method_14307() {
      return field_15483.field_45536;
   }

   public static boolean method_14303() {
      return field_15483.field_45474;
   }

   public static boolean method_14439() {
      return field_15483.field_45397 != class_4615.field_22434;
   }

   public static boolean method_14355() {
      return field_15483.field_45397 == class_4615.field_22433;
   }

   public static boolean method_14283() {
      return field_15483.field_45394 != 0 ? field_15483.field_45394 == 2 : method_14439();
   }

   public static boolean method_14421() {
      return field_15483.field_45394 == 3;
   }

   public static boolean method_14443() {
      if (field_15483.field_45550 == 0) {
         if (method_14424() && !class_6588.field_33590.method_24248()) {
            return class_6588.field_33590.method_24250();
         } else {
            return field_15462 == 0 ? method_14439() : field_15462 == 2;
         }
      } else {
         return field_15483.field_45550 == 2;
      }
   }

   public static boolean method_14396() {
      if (field_15483.field_45550 == 0) {
         if (method_14424() && !class_6588.field_33590.method_24248()) {
            return class_6588.field_33590.method_24251();
         } else {
            return field_15462 == 0 ? false : field_15462 == 3;
         }
      } else {
         return field_15483.field_45550 == 3;
      }
   }

   public static void method_14275() {
      field_15462 = 0;
      class_7832 var2 = method_14450();
      if (var2 != null) {
         try {
            InputStream var3 = var2.method_35458(new Identifier("optifine/color.properties")).method_18576();
            if (var3 == null) {
               return;
            }

            class_8407 var4 = new class_8407();
            var4.load(var3);
            var3.close();
            String var5 = var4.getProperty("clouds");
            if (var5 == null) {
               return;
            }

            method_14277("Texture pack clouds: " + var5);
            var5 = var5.toLowerCase();
            if (var5.equals("fast")) {
               field_15462 = 1;
            }

            if (var5.equals("fancy")) {
               field_15462 = 2;
            }

            if (var5.equals("off")) {
               field_15462 = 3;
            }
         } catch (Exception var6) {
         }
      }
   }

   public static class_7458 method_14346() {
      return field_15454.method_8511().field_44874;
   }

   public static boolean method_14371() {
      return field_15483.field_45553 != 0 ? field_15483.field_45553 != 1 : method_14439();
   }

   public static boolean method_14410() {
      return field_15483.field_45553 == 4;
   }

   public static boolean method_14279() {
      return field_15483.field_45553 != 0 ? field_15483.field_45553 == 4 : !method_14439();
   }

   public static boolean method_14315() {
      return field_15483.field_45448 != 0 ? field_15483.field_45448 == 2 : method_14439();
   }

   public static int method_14263(int var0, int var1, int var2) {
      if (var0 >= var1) {
         return var0 <= var2 ? var0 : var2;
      } else {
         return var1;
      }
   }

   public static long method_14264(long var0, long var2, long var4) {
      if (var0 >= var2) {
         return var0 <= var4 ? var0 : var4;
      } else {
         return var2;
      }
   }

   public static float method_14262(float var0, float var1, float var2) {
      if (!(var0 < var1)) {
         return !(var0 > var2) ? var0 : var2;
      } else {
         return var1;
      }
   }

   public static double method_14261(double var0, double var2, double var4) {
      if (!(var0 < var2)) {
         return !(var0 > var4) ? var0 : var4;
      } else {
         return var2;
      }
   }

   public static float method_14237(float var0) {
      if (!(var0 < 0.0F)) {
         return !(var0 > 1.0F) ? var0 : 1.0F;
      } else {
         return 0.0F;
      }
   }

   public static boolean method_14380() {
      return field_15483.field_45520 != 2;
   }

   public static boolean method_14319() {
      return field_15483.field_45520 == 1;
   }

   public static boolean method_14446() {
      return field_15483.field_45566;
   }

   public static boolean method_14323() {
      return field_15483.field_45389 != 2;
   }

   public static boolean method_14297() {
      return field_15483.field_45389 == 1;
   }

   public static boolean method_14251() {
      return field_15483.field_45508;
   }

   public static boolean method_14413() {
      return field_15483.field_45392;
   }

   public static boolean method_14418() {
      return field_15483.field_45447;
   }

   public static boolean method_14301() {
      return field_15483.field_45473;
   }

   public static boolean method_14246() {
      return field_15483.field_45461;
   }

   public static boolean method_14329() {
      return field_15483.field_45501;
   }

   public static boolean method_14268() {
      return field_15483.field_45489;
   }

   public static boolean method_14356() {
      return field_15483.field_45510;
   }

   public static boolean method_14433() {
      return field_15483.field_45572;
   }

   public static boolean method_14426() {
      return field_15483.field_45433;
   }

   public static boolean method_14429() {
      return field_15483.field_45557;
   }

   public static float method_14449() {
      return method_14424() && class_6588.field_33599 >= 0.0F ? class_6588.field_33599 : (float)field_15483.field_45438;
   }

   public static String method_14378(List var0) {
      return method_14379(var0, ", ");
   }

   public static String method_14379(List var0, String var1) {
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

   public static String method_14289(Object[] var0) {
      return method_14290(var0, ", ");
   }

   public static String method_14290(Object[] var0, String var1) {
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

   public static String method_14287(int[] var0) {
      return method_14288(var0, ", ");
   }

   public static String method_14288(int[] var0, String var1) {
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

   public static String method_14285(float[] var0) {
      return method_14286(var0, ", ");
   }

   public static String method_14286(float[] var0, String var1) {
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

   public static MinecraftClient method_14327() {
      return field_15454;
   }

   public static TextureManager method_14266() {
      return field_15454.getTextureManager();
   }

   public static class_7832 method_14450() {
      return field_15454.method_8498();
   }

   public static InputStream method_14374(Identifier var0) throws IOException {
      return method_14375(field_15454.method_8498(), var0);
   }

   public static InputStream method_14375(class_7832 var0, Identifier var1) throws IOException {
      class_4038 var4 = var0.method_35458(var1);
      return var4 != null ? var4.method_18576() : null;
   }

   public static class_4038 method_14435(Identifier var0) throws IOException {
      return field_15454.method_8498().method_35458(var0);
   }

   public static boolean method_14362(Identifier var0) {
      if (var0 != null) {
         class_8169 var3 = method_14233(var0);
         return var3 != null;
      } else {
         return false;
      }
   }

   public static boolean method_14363(class_7832 var0, Identifier var1) {
      try {
         class_4038 var4 = var0.method_35458(var1);
         return var4 != null;
      } catch (IOException var5) {
         return false;
      }
   }

   public static boolean method_14364(class_8169 var0, Identifier var1) {
      return var0 != null && var1 != null ? var0.method_37467(class_3168.field_15844, var1) : false;
   }

   public static class_8169[] method_14347() {
      class_6354 var2 = field_15454.method_8521();
      Collection var3 = var2.method_29125();
      ArrayList var4 = new ArrayList();

      for (class_5522 var6 : var3) {
         class_8169 var7 = var6.method_25032();
         if (var7 != method_14415()) {
            var4.add(var7);
         }
      }

      return var4.<class_8169>toArray(new class_8169[var4.size()]);
   }

   public static String method_14384() {
      if (field_15454.method_8498() == null) {
         return "";
      } else {
         class_8169[] var2 = method_14347();
         if (var2.length <= 0) {
            return method_14415().콵樽웎柿㥇竁();
         } else {
            String[] var3 = new String[var2.length];

            for (int var4 = 0; var4 < var2.length; var4++) {
               var3[var4] = var2[var4].method_37470();
            }

            return method_14289(var3);
         }
      }
   }

   public static class_599 method_14415() {
      return field_15454.method_8606().method_25060();
   }

   public static boolean method_14247(Identifier var0) {
      return method_14233(var0) == method_14415();
   }

   public static class_8169 method_14233(Identifier var0) {
      class_6354 var3 = field_15454.method_8521();
      Collection var4 = var3.method_29125();
      List var5 = (List)var4;

      for (int var6 = var5.size() - 1; var6 >= 0; var6--) {
         class_5522 var7 = (class_5522)var5.get(var6);
         class_8169 var8 = var7.method_25032();
         if (var8.method_37467(class_3168.field_15844, var0)) {
            return var8;
         }
      }

      return null;
   }

   public static WorldRenderer method_14387() {
      return field_15454.worldRenderer;
   }

   public static GameRenderer method_14400() {
      return field_15454.gameRenderer;
   }

   public static boolean method_14331() {
      return field_15483.field_45449 != 3;
   }

   public static boolean method_14299() {
      return field_15483.field_45449 == 2;
   }

   public static boolean method_14422() {
      return field_15483.field_45540;
   }

   public static boolean method_14391() {
      return field_15483.field_45547;
   }

   public static boolean method_14282() {
      return field_15483.field_45580;
   }

   public static boolean method_14448() {
      return !method_14282() ? false : !method_14424() || class_6588.method_30282();
   }

   public static boolean method_14241() {
      return !method_14282() ? false : !method_14424() || class_6588.method_30108();
   }

   public static boolean isVignetteEnabled() {
      if (method_14424() && !class_6588.method_30245()) {
         return false;
      } else {
         return field_15483.field_45404 != 0 ? field_15483.field_45404 == 2 : method_14439();
      }
   }

   public static boolean method_14417() {
      return field_15483.field_45425;
   }

   public static void method_14399(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var5) {
         method_14349("", var5);
      }
   }

   public static boolean method_14406() {
      return field_15483.field_45492 == 1;
   }

   public static boolean method_14434() {
      return field_15483.field_45492 == 0;
   }

   public static boolean method_14367() {
      return field_15483.field_45492 == 2;
   }

   public static int method_14412() {
      return 1;
   }

   public static boolean method_14423() {
      return method_14412() > 1;
   }

   public static int method_14447() {
      return 0;
   }

   public static boolean method_14248() {
      return method_14447() > 0;
   }

   public static boolean method_14252() {
      return method_14310().field_45527 > 0;
   }

   public static boolean method_14405() {
      return method_14412() <= 1 ? method_14447() > 0 : true;
   }

   public static boolean method_14354(int var0, int var1, int var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static boolean method_14353(float var0, float var1, float var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static boolean method_14338() {
      return field_15483.field_45498;
   }

   public static boolean method_14395() {
      return field_15483.field_45468;
   }

   public static int method_14361(String var0, int var1) {
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

   public static float method_14445(String var0, float var1) {
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

   public static boolean method_14257(String var0, boolean var1) {
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

   public static Boolean method_14256(String var0, Boolean var1) {
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

   public static String[] method_14302(String var0, String var1) {
      StringTokenizer var4 = new StringTokenizer(var0, var1);
      ArrayList var5 = new ArrayList();

      while (var4.hasMoreTokens()) {
         String var6 = var4.nextToken();
         var5.add(var6);
      }

      return var5.<String>toArray(new String[var5.size()]);
   }

   public static boolean method_14425() {
      return field_15483.field_45456;
   }

   public static boolean method_14385() {
      return field_15483.field_45516;
   }

   public static boolean method_14293() {
      return field_15483.field_45531;
   }

   public static boolean method_14394() {
      return field_15483.field_45490;
   }

   public static void method_14312(String var0) {
      int var3 = GlStateManager.method_8925();
      if (var3 != 0 && class_6941.method_31754(var3)) {
         String var4 = method_14316(var3);
         String var5 = String.format("OpenGL error: %s (%s), at: %s", var3, var4, var0);
         method_14348(var5);
         if (method_14294() && class_124.method_386("ShowGlError", 10000L)) {
            String var6 = class_6956.method_31803("of.message.openglError", var3, var4);
            field_15454.field_9614.method_13991().method_18676(new StringTextComponent(var6));
         }
      }
   }

   public static boolean method_14265() {
      return field_15483.field_45526 > 0;
   }

   public static int method_14235() {
      return field_15483.field_45526;
   }

   public static boolean method_14438() {
      return field_15483.field_45408;
   }

   public static boolean method_14414() {
      return field_15483.field_45413;
   }

   public static boolean method_14360() {
      return field_15483.field_45427;
   }

   public static boolean method_14274() {
      return field_15483.field_45518;
   }

   public static boolean method_14370() {
      return field_15483.field_45529 != 3;
   }

   public static boolean method_14404() {
      return field_15483.field_45507;
   }

   public static boolean method_14328() {
      return field_15483.field_45431;
   }

   public static boolean method_14309() {
      return field_15483.field_45529 == 2;
   }

   public static boolean method_14238() {
      return field_15483.field_45546;
   }

   public static boolean method_14377() {
      return field_15483.field_45532 != 0 ? field_15483.field_45532 == 2 : method_14439();
   }

   public static boolean method_14424() {
      return class_6588.field_33724;
   }

   public static String[] method_14431(File var0) throws IOException {
      FileInputStream var3 = new FileInputStream(var0);
      return method_14432(var3);
   }

   public static String[] method_14432(InputStream var0) throws IOException {
      ArrayList var3 = new ArrayList();
      InputStreamReader var4 = new InputStreamReader(var0, "ASCII");
      BufferedReader var5 = new BufferedReader(var4);

      while (true) {
         String var6 = var5.readLine();
         if (var6 == null) {
            return var3.<String>toArray(new String[var3.size()]);
         }

         var3.add(var6);
      }
   }

   public static String method_14444(File var0) throws IOException {
      FileInputStream var3 = new FileInputStream(var0);
      return method_14271(var3, "ASCII");
   }

   public static String method_14270(InputStream var0) throws IOException {
      return method_14271(var0, "ASCII");
   }

   public static String method_14271(InputStream var0, String var1) throws IOException {
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

   public static byte[] method_14250(InputStream var0) throws IOException {
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

   public static GameOptions method_14310() {
      return field_15483;
   }

   public static String method_14239() {
      return field_15465;
   }

   public static void method_14388(String var0) {
      field_15465 = var0;
   }

   public static int method_14281(String var0, String var1) {
      String[] var4 = method_14298(var0);
      String[] var5 = method_14298(var1);
      String var6 = var4[0];
      String var7 = var5[0];
      if (var6.equals(var7)) {
         int var8 = method_14361(var4[1], -1);
         int var9 = method_14361(var5[1], -1);
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

   private static String[] method_14298(String var0) {
      if (var0 != null && var0.length() > 0) {
         Pattern var3 = Pattern.compile("([A-Z])([0-9]+)(.*)");
         Matcher var4 = var3.matcher(var0);
         if (var4.matches()) {
            String var5 = method_14305(var4.group(1));
            String var6 = method_14305(var4.group(2));
            String var7 = method_14305(var4.group(3));
            return new String[]{var5, var6, var7};
         } else {
            return new String[]{"", "", ""};
         }
      } else {
         return new String[]{"", "", ""};
      }
   }

   public static int method_14419(int var0) {
      var0 = var0 ^ 61 ^ var0 >> 16;
      var0 += var0 << 3;
      var0 ^= var0 >> 4;
      var0 *= 668265261;
      return var0 ^ var0 >> 15;
   }

   public static int method_14242(class_1331 var0, int var1) {
      int var4 = method_14419(var1 + 37);
      var4 = method_14419(var4 + var0.method_12173());
      var4 = method_14419(var4 + var0.method_12185());
      return method_14419(var4 + var0.method_12165());
   }

   public static int method_14308() {
      return field_15455;
   }

   public static void method_14344() {
      field_15455 = Runtime.getRuntime().availableProcessors();
   }

   public static boolean method_14411() {
      return method_14308() <= 1;
   }

   public static boolean method_14401() {
      return field_15483.field_45446;
   }

   public static boolean method_14382() {
      return field_15483.field_45406;
   }

   public static boolean method_14313() {
      return field_15483.field_45524;
   }

   public static boolean method_14321() {
      return field_15483.field_45506;
   }

   public static int method_14358() {
      return field_15483 != null ? field_15483.field_45537 : 10;
   }

   public static boolean equals(Object var0, Object var1) {
      if (var0 != var1) {
         return var0 != null ? var0.equals(var1) : false;
      } else {
         return true;
      }
   }

   public static boolean method_14254(Object var0, Object[] var1) {
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

   public static boolean method_14253(int var0, int[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         if (var1[var4] == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean method_14352(Object var0, Object[] var1) {
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

   public static String method_14305(String var0) {
      return var0 != null ? var0 : "";
   }

   private static ByteBuffer method_14259(InputStream var0) throws IOException {
      BufferedImage var3 = ImageIO.read(var0);
      int[] var4 = var3.getRGB(0, 0, var3.getWidth(), var3.getHeight(), (int[])null, 0, var3.getWidth());
      ByteBuffer var5 = ByteBuffer.allocate(4 * var4.length);

      for (int var9 : var4) {
         var5.putInt(var9 << 8 | var9 >> 24 & 0xFF);
      }

      ((Buffer)var5).flip();
      return var5;
   }

   public static Object[] method_14441(Object[] var0, Object var1) {
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

   public static Object[] method_14442(Object[] var0, Object var1, int var2) {
      ArrayList var5 = new ArrayList<Object>(Arrays.asList(var0));
      var5.add(var2, var1);
      Object[] var6 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var5.size());
      return var5.<Object>toArray(var6);
   }

   public static Object[] method_14357(Object[] var0, Object[] var1) {
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

   public static Object[] method_14440(Object[] var0, Object var1) {
      ArrayList var4 = new ArrayList<Object>(Arrays.asList(var0));
      var4.remove(var1);
      return method_14243(var4, var0.getClass().getComponentType());
   }

   public static Object[] method_14243(Collection var0, Class var1) {
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

   public static boolean method_14390() {
      return field_15483.field_45417;
   }

   public static void method_14343(class_7966 var0) {
      int var3 = class_7860.method_35553(class_7860.field_40105, -1);
      int var4 = method_14304();
      int var5 = method_14273();
      int var6 = field_15454.worldRenderer.method_20054();
      int var7 = field_15454.worldRenderer.method_20031();
      int var8 = field_15454.worldRenderer.method_20001();
      String var9 = "" + var3 + "/" + var4 + " fps, C: " + var6 + ", E: " + var7 + "+" + var8 + ", U: " + var5;
      field_15454.textRenderer.method_45385(var0, var9, 2.0F, 2.0F, -2039584);
   }

   public static int method_14304() {
      return field_15463;
   }

   public static int method_14273() {
      return field_15467;
   }

   public static void method_14393() {
      class_9703 var2 = field_15454.method_8592();
      long[] var3 = var2.method_44838();
      int var4 = var2.method_44832();
      int var5 = var2.method_44834();
      if (var4 != var5) {
         int var6 = class_7860.method_35553(class_7860.field_40105, -1);
         if (var6 <= 0) {
            var6 = 1;
         }

         long var7 = (long)(1.0 / (double)var6 * 1.0E9);
         long var9 = var7;
         long var11 = 0L;

         for (int var13 = class_9299.method_42788(var4 - 1, var3.length);
            var13 != var5 && (double)var11 < 1.0E9;
            var13 = class_9299.method_42788(var13 - 1, var3.length)
         ) {
            long var16 = var3[var13];
            if (var16 > var9) {
               var9 = var16;
            }

            var11 += var16;
         }

         double var14 = (double)var9 / 1.0E9;
         field_15463 = (int)(1.0 / var14);
      }
   }

   private static void method_14345() {
      field_15467 = class_6705.field_34625;
      class_6705.field_34625 = 0;
   }

   public static int method_14334() {
      String var2 = System.getenv("ProgramFiles(X86)");
      return var2 == null ? 32 : 64;
   }

   public static int method_14332() {
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

   public static boolean method_14427() {
      return field_15477;
   }

   public static void method_14340(boolean var0) {
      field_15477 = var0;
   }

   public static boolean method_14258() {
      return false;
   }

   public static void method_14428(String var0, String var1) {
      class_6905 var4 = new class_6905(field_15454.field_9623, var0, var1);
      field_15454.method_8609(var4);
   }

   public static int[] method_14342(int[] var0, int var1) {
      return method_14322(var0, new int[]{var1});
   }

   public static int[] method_14322(int[] var0, int[] var1) {
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

   public static void method_14234(File var0, String var1) throws IOException {
      FileOutputStream var4 = new FileOutputStream(var0);
      byte[] var5 = var1.getBytes("ASCII");
      var4.write(var5);
      var4.close();
   }

   public static void method_14325(class_8359 var0) {
      field_15460 = var0;
   }

   public static class_8359 method_14295() {
      return field_15460;
   }

   public static boolean method_14326() {
      return field_15483.field_45571 != 3;
   }

   public static boolean method_14278() {
      return field_15483.field_45571 == 1;
   }

   public static boolean method_14451() {
      if (method_14326()) {
         return !method_14424() ? true : class_6588.method_30107();
      } else {
         return false;
      }
   }

   public static boolean method_14409() {
      return field_15483.field_45539;
   }

   public static boolean method_14373() {
      return field_15483.field_45511;
   }

   public static int method_14389() {
      return field_15483.field_45487;
   }

   public static int[] method_14267(Integer[] var0) {
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

   public static boolean method_14351() {
      return field_15483.field_45538 && GlStateManager.field_9838;
   }

   public static boolean method_14407() {
      return class_3776.method_17486();
   }

   public static boolean method_14337() {
      return field_15483.field_45432;
   }

   public static boolean method_14359(URI var0) {
      Util.method_44655((Exception)null);
      Util.getOperatingSystem().method_37582(var0);
      Exception var3 = Util.method_44701();
      return var3 == null;
   }

   public static boolean method_14294() {
      return field_15483.field_45558;
   }

   public static String method_14291(boolean[] var0, String var1) {
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

   public static boolean method_14369() {
      return field_15454.method_8515() != null ? field_15454.method_8566() : false;
   }

   public static IntBuffer method_14260(int var0) {
      return class_1423.method_6528(var0 << 2).asIntBuffer();
   }

   public static String method_14316(int var0) {
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

   public static boolean method_14276(int var0) {
      return GLFW.glfwGetKey(field_15454.getMainWindow().method_43181(), var0) == 1;
   }

   public static boolean method_14416(Boolean var0) {
      return var0 != null && var0;
   }

   public static boolean method_14350() {
      if (field_15454.field_9610 != null) {
         if (field_15454.field_9610 instanceof class_2789) {
            class_2789 var2 = (class_2789)field_15454.field_9610;
            if (var2.method_12676()) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean method_14236() {
      return method_14424() ? !class_6588.method_30287() : false;
   }

   public static void method_14339() {
      long var2 = System.currentTimeMillis();
      long var4 = var2 - field_15457;
      field_15457 = var2;
      var4 = method_14264(var4, 1L, 1000L);
      field_15474 = (field_15474 + var4) / 2L;
      field_15474 = method_14264(field_15474, 1L, 1000L);
      if (field_15454.field_9584 != field_15469) {
         field_15469 = field_15454.field_9584;
         method_14393();
         method_14345();
      }
   }

   public static long method_14255() {
      return field_15474;
   }

   public static float method_14403() {
      return (float)method_14255() / 1000.0F;
   }

   public static long method_14333() {
      return 1000L / method_14255();
   }

   public static void method_14320(Object var0, String var1) throws NullPointerException {
      if (var0 == null) {
         throw new NullPointerException(var1);
      }
   }
}
