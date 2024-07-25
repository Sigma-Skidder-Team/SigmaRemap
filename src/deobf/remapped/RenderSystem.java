package remapped;

import com.google.common.collect.Queues;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;

public class RenderSystem {
   private static final Logger field_17323 = LogManager.getLogger();
   private static final ConcurrentLinkedQueue<class_156> field_17329 = Queues.newConcurrentLinkedQueue();
   private static final class_8042 field_17322 = new class_8042();
   public static final float field_17328 = 0.1F;
   private static final int field_17325 = 1024;
   private static boolean field_17326;
   private static Thread field_17324;
   private static Thread field_17321;
   private static int field_17327 = -1;
   private static boolean field_17331;
   private static double field_17330 = Double.MIN_VALUE;

   public static void method_16370() {
      if (field_17321 == null && field_17324 != Thread.currentThread()) {
         field_17321 = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize render thread");
      }
   }

   public static boolean method_16366() {
      return Thread.currentThread() == field_17321;
   }

   public static boolean method_16440() {
      return field_17331 || method_16366();
   }

   public static void method_16390(boolean var0) {
      boolean var3 = field_17321 == Thread.currentThread();
      if (field_17324 == null && field_17321 != null && var3 != var0) {
         field_17324 = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize tick thread");
      }
   }

   public static boolean isOnGameThread() {
      return true;
   }

   public static boolean method_16363() {
      return field_17331 || isOnGameThread();
   }

   public static void assertThread(Supplier<Boolean> var0) {
      if (!(Boolean)var0.get()) {
         throw new IllegalStateException("Rendersystem called from wrong thread");
      }
   }

   public static boolean isInInitPhase() {
      return true;
   }

   public static void method_16474(class_156 var0) {
      field_17329.add(var0);
   }

   public static void flipFrame(long var0) {
      GLFW.glfwPollEvents();
      method_16482();
      class_8042.method_36499().method_36501().method_44463();
      GLFW.glfwSwapBuffers(var0);
      GLFW.glfwPollEvents();
   }

   public static void method_16482() {
      field_17326 = true;

      while (!field_17329.isEmpty()) {
         class_156 var2 = field_17329.poll();
         var2.method_621();
      }

      field_17326 = false;
   }

   public static void method_16422(int var0) {
      double var3 = field_17330 + 1.0 / (double)var0;

      double var5;
      for (var5 = GLFW.glfwGetTime(); var5 < var3; var5 = GLFW.glfwGetTime()) {
         GLFW.glfwWaitEventsTimeout(var3 - var5);
      }

      field_17330 = var5;
   }

   @Deprecated
   public static void method_16451() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8934();
   }

   @Deprecated
   public static void method_16444() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8885();
   }

   @Deprecated
   public static void method_16399() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8875();
   }

   @Deprecated
   public static void method_16458() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8801();
   }

   @Deprecated
   public static void enableAlphaTest() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.enableAlphaTest();
   }

   @Deprecated
   public static void alphaFunc(int var0, float var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.alphaFunc(var0, var1);
   }

   @Deprecated
   public static void method_16389() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8927();
   }

   @Deprecated
   public static void method_16487() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8912();
   }

   @Deprecated
   public static void method_16481() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8819();
   }

   @Deprecated
   public static void method_16435() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8798();
   }

   @Deprecated
   public static void method_16368(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8811(var0, var1);
   }

   @Deprecated
   public static void method_16465(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8820(var0, var1, var2);
   }

   public static void disableDepthTest() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.disableDepthTest();
   }

   public static void enableDepthTest() {
      assertThread(RenderSystem::method_16363);
      GlStateManager.enableDepthTest();
   }

   public static void method_16452(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::method_16363);
      GlStateManager.method_8767();
      GlStateManager.method_8850(var0, var1, var2, var3);
   }

   public static void method_16372() {
      assertThread(RenderSystem::method_16363);
      GlStateManager.method_8929();
   }

   public static void method_16457(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8862(var0);
   }

   public static void method_16387(boolean var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8867(var0);
   }

   public static void enableBlend() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8829();
   }

   public static void disableBlend() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8775();
   }

   public static void blendFunc(SourceFactor var0, DestFactor var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.blendFunc(var0.param, var1.param);
   }

   public static void blendFunc(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.blendFunc(var0, var1);
   }

   public static void blendFuncSeparate(SourceFactor var0, DestFactor var1, SourceFactor var2, DestFactor var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.blendFuncSeparate(var0.param, var1.param, var2.param, var3.param);
   }

   public static void blendFuncSeparate(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.blendFuncSeparate(var0, var1, var2, var3);
   }

   public static void blendEquation(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.blendEquation(var0);
   }

   public static void blendColor(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.blendColor(var0, var1, var2, var3);
   }

   @Deprecated
   public static void enableFog() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.enableFog();
   }

   @Deprecated
   public static void disableFog() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.disableFog();
   }

   @Deprecated
   public static void fogMode(FogMode var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.fogMode(var0.param);
   }

   @Deprecated
   public static void fogMode(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.fogMode(var0);
   }

   @Deprecated
   public static void fogDensity(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.fogDensity(var0);
   }

   @Deprecated
   public static void fogStart(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.fogStart(var0);
   }

   @Deprecated
   public static void fogEnd(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.fogEnd(var0);
   }

   @Deprecated
   public static void fog(int var0, float var1, float var2, float var3, float var4) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.fog(var0, new float[]{var1, var2, var3, var4});
   }

   @Deprecated
   public static void fogi(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.fogi(var0, var1);
   }

   public static void enableCull() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.enableCull();
   }

   public static void disableCull() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.disableCull();
   }

   public static void polygonMode(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.polygonMode(var0, var1);
   }

   public static void enablePolygonOffset() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.enablePolygonOffset();
   }

   public static void method_16382() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8861();
   }

   public static void method_16380() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8863();
   }

   public static void method_16371() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8894();
   }

   public static void method_16475(float var0, float var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8924(var0, var1);
   }

   public static void method_16466() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8790();
   }

   public static void method_16409() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8813();
   }

   public static void method_16407(class_2603 var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8769(var0.field_12865);
   }

   public static void method_16492(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8899(var0);
   }

   public static void method_16432() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8843();
   }

   public static void method_16354() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8848();
   }

   public static void method_16490(int var0, int var1, int var2) {
      GlStateManager.method_8879(var0, var1, var2);
   }

   public static void method_16362(int var0) {
      assertThread(RenderSystem::method_16363);
      GlStateManager.method_8904(var0);
   }

   public static void method_16446(int var0) {
      GlStateManager.method_8791(var0);
   }

   @Deprecated
   public static void method_16486(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8932(var0);
   }

   @Deprecated
   public static void method_16381() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8908();
   }

   @Deprecated
   public static void method_16443() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8778();
   }

   public static void method_16392(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::method_16363);
      GlStateManager.method_8930(var0, var1, var2, var3);
   }

   public static void method_16405(boolean var0, boolean var1, boolean var2, boolean var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8895(var0, var1, var2, var3);
   }

   public static void method_16388(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8773(var0, var1, var2);
   }

   public static void method_16453(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8821(var0);
   }

   public static void method_16386(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8914(var0, var1, var2);
   }

   public static void method_16377(double var0) {
      assertThread(RenderSystem::method_16363);
      GlStateManager.method_8913(var0);
   }

   public static void method_16391(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::method_16363);
      GlStateManager.method_8880(var0, var1, var2, var3);
   }

   public static void method_16455(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8839(var0);
   }

   public static void method_16402(int var0, boolean var1) {
      assertThread(RenderSystem::method_16363);
      GlStateManager.method_8794(var0, var1);
   }

   @Deprecated
   public static void method_16463(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8842(var0);
   }

   @Deprecated
   public static void method_16476() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8865();
   }

   @Deprecated
   public static void method_16438() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8757();
   }

   @Deprecated
   public static void method_16489() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8761();
   }

   @Deprecated
   public static void method_16376(double var0, double var2, double var4, double var6, double var8, double var10) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8781(var0, var2, var4, var6, var8, var10);
   }

   @Deprecated
   public static void method_16410(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8824(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method_16403(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8854(var0, var1, var2);
   }

   @Deprecated
   public static void scaled(double var0, double var2, double var4) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.scaled(var0, var2, var4);
   }

   @Deprecated
   public static void translatef(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.translatef(var0, var1, var2);
   }

   @Deprecated
   public static void translated(double var0, double var2, double var4) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.translated(var0, var2, var4);
   }

   @Deprecated
   public static void multMatrix(class_8107 var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.multMatrix(var0);
   }

   @Deprecated
   public static void color4f(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.color4f(var0, var1, var2, var3);
   }

   @Deprecated
   public static void color3f(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.color4f(var0, var1, var2, 1.0F);
   }

   @Deprecated
   public static void method_16473() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8836();
   }

   public static void method_16400(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8812(var0, var1, var2);
   }

   public static void method_16484(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8823(var0);
   }

   public static void method_16360(int var0, int var1) {
      assertThread(RenderSystem::method_16363);
      GlStateManager.method_8763(var0, var1);
   }

   public static void method_16450(int var0, float var1) {
      GlStateManager.method_8755(var0, var1);
   }

   public static void method_16471(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8898(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void method_16411(int var0, Consumer<String> var1) {
      assertThread(RenderSystem::isOnGameThread);
      var1.accept(GlStateManager.method_8928(var0));
   }

   public static String method_16385() {
      assertThread(RenderSystem::isInInitPhase);
      return String.format("LWJGL version %s", class_3776.method_17478());
   }

   public static String method_16461() {
      assertThread(RenderSystem::isInInitPhase);
      return class_3776.method_17479();
   }

   public static LongSupplier method_16454() {
      assertThread(RenderSystem::isInInitPhase);
      return class_3776.method_17488();
   }

   public static void method_16478(int var0, boolean var1) {
      assertThread(RenderSystem::isInInitPhase);
      class_3776.method_17494(var0, var1);
   }

   public static void method_16416(GLFWErrorCallbackI var0) {
      assertThread(RenderSystem::isInInitPhase);
      class_3776.method_17489(var0);
   }

   public static void method_16412(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      class_3776.method_17480(var0, true, true, true);
   }

   public static void method_16396() {
      assertThread(RenderSystem::isOnGameThread);
      class_3776.method_17490();
   }

   @Deprecated
   public static void method_16420(int var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8796(var0, var1, var2);
   }

   public static String method_16369() {
      assertThread(RenderSystem::isOnGameThread);
      return class_3776.method_17481();
   }

   public static void method_16406(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isInInitPhase);
      GlStateManager.method_8843();
      GlStateManager.method_8932(7425);
      GlStateManager.method_8913(1.0);
      GlStateManager.enableDepthTest();
      GlStateManager.method_8862(515);
      GlStateManager.enableAlphaTest();
      GlStateManager.alphaFunc(516, 0.1F);
      GlStateManager.method_8842(5889);
      GlStateManager.method_8865();
      GlStateManager.method_8842(5888);
      GlStateManager.method_8930(var0, var1, var2, var3);
   }

   public static int method_16477() {
      assertThread(RenderSystem::isInInitPhase);
      if (field_17327 == -1) {
         int var2 = GlStateManager.method_8860(3379);

         for (int var3 = Math.max(32768, var2); var3 >= 1024; var3 >>= 1) {
            GlStateManager.method_8886(32868, 0, 6408, var3, var3, 0, 6408, 5121, (IntBuffer)null);
            int var4 = GlStateManager.method_8911(32868, 0, 4096);
            if (var4 != 0) {
               field_17327 = var3;
               return var3;
            }
         }

         field_17327 = Math.max(var2, 1024);
         field_17323.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", field_17327);
      }

      return field_17327;
   }

   public static void method_16418(int var0, Supplier<Integer> var1) {
      GlStateManager.method_8760(var0, (Integer)var1.get());
   }

   public static void method_16417(int var0, ByteBuffer var1, int var2) {
      assertThread(RenderSystem::method_16440);
      GlStateManager.method_8803(var0, var1, var2);
   }

   public static void method_16462(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8825(var0);
   }

   public static void method_16414(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8752(var0, var1);
   }

   public static void method_16379(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8753(var0, var1);
   }

   public static void method_16427(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8901(var0, var1);
   }

   public static void method_16384(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8774(var0, var1);
   }

   public static void method_16469(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8852(var0, var1);
   }

   public static void method_16378(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8915(var0, var1);
   }

   public static void method_16426(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8799(var0, var1);
   }

   public static void method_16383(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8743(var0, var1);
   }

   public static void method_16468(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8882(var0, var1);
   }

   public static void method_16423(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8834(var0, var1, var2);
   }

   public static void method_16394(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8770(var0, var1, var2);
   }

   public static void method_16375(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8740(var0, var1, var2);
   }

   public static void method_16472() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8849();
   }

   public static void method_16485() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8814();
   }

   public static void method_16459(IntSupplier var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8805(var0.getAsInt(), var1);
   }

   public static void method_16439() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8764();
   }

   public static void method_16359(class_2426 var0, class_2426 var1, class_8107 var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8783(var0, var1, var2);
   }

   public static void method_16436(class_2426 var0, class_2426 var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8921(var0, var1);
   }

   public static void method_16357(class_2426 var0, class_2426 var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8806(var0, var1);
   }

   public static void method_16408() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8873();
   }

   public static void method_16445() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8736();
   }

   public static void method_16479() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method_8909();
   }

   public static void method_16456() {
      field_17331 = true;
   }

   public static void method_16421() {
      field_17331 = false;
      if (!field_17329.isEmpty()) {
         method_16482();
      }

      if (!field_17329.isEmpty()) {
         throw new IllegalStateException("Recorded to render queue during initialization");
      }
   }

   public static void method_16355(Consumer<Integer> var0) {
      if (method_16366()) {
         var0.accept(GlStateManager.method_8817());
      } else {
         method_16474(() -> var0.accept(GlStateManager.method_8817()));
      }
   }

   public static class_8042 method_16373() {
      assertThread(RenderSystem::method_16366);
      return field_17322;
   }

   public static void defaultBlendFunc() {
      blendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.field_43697, SourceFactor.ONE, DestFactor.field_43699);
   }

   public static void method_16433() {
      alphaFunc(516, 0.1F);
   }

   @Deprecated
   public static void method_16430(Runnable var0) {
      boolean var3 = MinecraftClient.method_8497();
      if (var3) {
         GameOptions var4 = MinecraftClient.getInstance().gameOptions;
         class_4615 var5 = var4.field_45397;
         var4.field_45397 = class_4615.field_22437;
         var0.run();
         var4.field_45397 = var5;
      } else {
         var0.run();
      }
   }
}
