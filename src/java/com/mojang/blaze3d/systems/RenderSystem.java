package com.mojang.blaze3d.systems;

import com.google.common.collect.Queues;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import mapped.*;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;

public class RenderSystem {
   private static final Logger field34654 = LogManager.getLogger();
   private static final ConcurrentLinkedQueue<Class4504> field34655 = Queues.newConcurrentLinkedQueue();
   private static final Tessellator field34656 = new Tessellator();
   public static final float field34657 = 0.1F;
   private static final int field34658 = 1024;
   private static boolean field34659;
   private static Thread field34660;
   private static Thread field34661;
   private static int field34662 = -1;
   private static boolean field34663;
   private static double field34664 = Double.MIN_VALUE;

   public static void method27802() {
      if (field34661 == null && field34660 != Thread.currentThread()) {
         field34661 = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize render thread");
      }
   }

   public static boolean isOnRenderThread() {
      return Thread.currentThread() == field34661;
   }

   public static boolean isOnRenderThreadOrInit() {
      return field34663 || isOnRenderThread();
   }

   public static void method27805(boolean var0) {
      boolean var3 = field34661 == Thread.currentThread();
      if (field34660 == null && field34661 != null && var3 != var0) {
         field34660 = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize tick thread");
      }
   }

   public static boolean isOnGameThread() {
      return true;
   }

   public static boolean isOnGameThreadOrInit() {
      return field34663 || isOnGameThread();
   }

   public static void assertThread(Supplier<Boolean> var0) {
      if (!(Boolean)var0.get()) {
         throw new IllegalStateException("Rendersystem called from wrong thread");
      }
   }

   public static boolean isInInitPhase() {
      return true;
   }

   public static void recordRenderCall(Class4504 var0) {
      field34655.add(var0);
   }

   public static void flipFrame(long var0) {
      GLFW.glfwPollEvents();
      method27812();
      Tessellator.getInstance().getBuffer().method17071();
      GLFW.glfwSwapBuffers(var0);
      GLFW.glfwPollEvents();
   }

   public static void method27812() {
      field34659 = true;

      while (!field34655.isEmpty()) {
         Class4504 var2 = field34655.poll();
         var2.method14222();
      }

      field34659 = false;
   }

   public static void limitDisplayFPS(int var0) {
      double var3 = field34664 + 1.0 / (double)var0;

      double var5;
      for (var5 = GLFW.glfwGetTime(); var5 < var3; var5 = GLFW.glfwGetTime()) {
         GLFW.glfwWaitEventsTimeout(var3 - var5);
      }

      field34664 = var5;
   }

   @Deprecated
   public static void method27814() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.pushLightingAttributes();
   }

   @Deprecated
   public static void method27815() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.pushTextureAttributes();
   }

   @Deprecated
   public static void method27816() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.popAttributes();
   }

   @Deprecated
   public static void disableAlphaTest() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.disableAlphaTest();
   }

   @Deprecated
   public static void enableAlphaTest() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.enableAlphaTest();
   }

   @Deprecated
   public static void method27819(int var0, float var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23697(var0, var1);
   }

   @Deprecated
   public static void method27820() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23698();
   }

   @Deprecated
   public static void disableLighting() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.disableLighting();
   }

   @Deprecated
   public static void enableColorMaterial() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.enableColorMaterial();
   }

   @Deprecated
   public static void method27823() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23702();
   }

   @Deprecated
   public static void colorMaterial(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.colorMaterial(var0, var1);
   }

   @Deprecated
   public static void normal3f(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.normal3f(var0, var1, var2);
   }

   public static void disableDepthTest() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.disableDepthTest();
   }

   public static void enableDepthTest() {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.enableDepthTest();
   }

   public static void enableScissor(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.func_244594_k();
      GlStateManager.func_244592_a(var0, var1, var2, var3);
   }

   public static void disableScissor() {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.func_244593_j();
   }

   public static void depthFunc(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.depthFunc(var0);
   }

   public static void depthMask(boolean var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.depthMask(var0);
   }

   public static void enableBlend() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.enableBlend();
   }

   public static void disableBlend() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.disableBlend();
   }

   public static void blendFunc(GlStateManager.SourceFactor var0, DestFactor var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.blendFunc(var0.param, var1.param);
   }

   public static void method27835(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.blendFunc(var0, var1);
   }

   public static void blendFuncSeparate(GlStateManager.SourceFactor var0, DestFactor var1, GlStateManager.SourceFactor var2, DestFactor var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.blendFuncSeparate(var0.param, var1.param, var2.param, var3.param);
   }

   public static void blendFuncSeparate(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.blendFuncSeparate(var0, var1, var2, var3);
   }

   public static void blendEquation(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23719(var0);
   }

   public static void blendColor(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23718(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method27840() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23779();
   }

   @Deprecated
   public static void method27841() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23780();
   }

   @Deprecated
   public static void method27842(Class2135 var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23781(var0.field13987);
   }

   @Deprecated
   public static void method27843(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23781(var0);
   }

   @Deprecated
   public static void method27844(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23782(var0);
   }

   @Deprecated
   public static void method27845(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23783(var0);
   }

   @Deprecated
   public static void method27846(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23784(var0);
   }

   @Deprecated
   public static void method27847(int var0, float var1, float var2, float var3, float var4) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23785(var0, new float[]{var1, var2, var3, var4});
   }

   @Deprecated
   public static void method27848(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23786(var0, var1);
   }

   public static void enableCull() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23787();
   }

   public static void method27850() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23788();
   }

   public static void method27851(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23789(var0, var1);
   }

   public static void method27852() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23790();
   }

   public static void method27853() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23791();
   }

   public static void method27854() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23792();
   }

   public static void method27855() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23793();
   }

   public static void method27856(float var0, float var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23794(var0, var1);
   }

   public static void method27857() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23795();
   }

   public static void method27858() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23796();
   }

   public static void method27859(Class2270 var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23797(var0.field14772);
   }

   public static void method27860(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23803(var0);
   }

   public static void enableTexture() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.enableTexture();
   }

   public static void disableTexture() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23805();
   }

   public static void method27863(int var0, int var1, int var2) {
      GlStateManager.texParameter(var0, var1, var2);
   }

   public static void method27864(int var0) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.method23812(var0);
   }

   public static void method27865(int var0) {
      GlStateManager.bindTexture(var0);
   }

   @Deprecated
   public static void shadeModel(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.shadeModel(var0);
   }

   @Deprecated
   public static void enableRescaleNormal() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.enableRescaleNormal();
   }

   @Deprecated
   public static void method27868() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23820();
   }

   public static void viewport(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.viewport(var0, var1, var2, var3);
   }

   public static void colorMask(boolean var0, boolean var1, boolean var2, boolean var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.colorMask(var0, var1, var2, var3);
   }

   public static void method27871(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23823(var0, var1, var2);
   }

   public static void method27872(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23824(var0);
   }

   public static void method27873(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23825(var0, var1, var2);
   }

   public static void method27874(double var0) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.clearDepth(var0);
   }

   public static void method27875(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.clearColor(var0, var1, var2, var3);
   }

   public static void method27876(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23828(var0);
   }

   public static void clear(int var0, boolean var1) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.clear(var0, var1);
   }

   @Deprecated
   public static void matrixMode(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.matrixMode(var0);
   }

   @Deprecated
   public static void loadIdentity() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.loadIdentity();
   }

   @Deprecated
   public static void pushMatrix() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23832();
   }

   @Deprecated
   public static void popMatrix() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23833();
   }

   @Deprecated
   public static void ortho(double var0, double var2, double var4, double var6, double var8, double var10) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.ortho(var0, var2, var4, var6, var8, var10);
   }

   @Deprecated
   public static void method27883(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23836(var0, var1, var2, var3);
   }

   @Deprecated
   public static void scalef(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23837(var0, var1, var2);
   }

   @Deprecated
   public static void scaled(double var0, double var2, double var4) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23838(var0, var2, var4);
   }

   @Deprecated
   public static void translatef(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.translatef(var0, var1, var2);
   }

   @Deprecated
   public static void translated(double var0, double var2, double var4) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23840(var0, var2, var4);
   }

   @Deprecated
   public static void multMatrix(Matrix4f var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.multMatrix(var0);
   }

   @Deprecated
   public static void color4f(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.color4f(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method27890(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.color4f(var0, var1, var2, 1.0F);
   }

   @Deprecated
   public static void method27891() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23844();
   }

   public static void method27892(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23854(var0, var1, var2);
   }

   public static void lineWidth(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23855(var0);
   }

   public static void method27894(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.method23856(var0, var1);
   }

   public static void method27895(int var0, float var1) {
      GlStateManager.method23857(var0, var1);
   }

   public static void method27896(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23858(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void method27897(int var0, Consumer<String> var1) {
      assertThread(RenderSystem::isOnGameThread);
      var1.accept(GlStateManager.method23860(var0));
   }

   public static String getBackendDescription() {
      assertThread(RenderSystem::isInInitPhase);
      return String.format("LWJGL version %s", GLX.method28297());
   }

   public static String getApiDescription() {
      assertThread(RenderSystem::isInInitPhase);
      return GLX.method28295();
   }

   public static LongSupplier initBackendSystem() {
      assertThread(RenderSystem::isInInitPhase);
      return GLX.method28298();
   }

   public static void initRenderer(int var0, boolean var1) {
      assertThread(RenderSystem::isInInitPhase);
      GLX.method28302(var0, var1);
   }

   public static void setErrorCallback(GLFWErrorCallbackI var0) {
      assertThread(RenderSystem::isInInitPhase);
      GLX.method28299(var0);
   }

   public static void method27903(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GLX.method28305(var0, true, true, true);
   }

   public static void method27904() {
      assertThread(RenderSystem::isOnGameThread);
      GLX.method28301();
   }

   @Deprecated
   public static void method27905(int var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23761(var0, var1, var2);
   }

   public static String getCapsString() {
      assertThread(RenderSystem::isOnGameThread);
      return GLX.method28303();
   }

   public static void setupDefaultState(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isInInitPhase);
      GlStateManager.enableTexture();
      GlStateManager.shadeModel(7425);
      GlStateManager.clearDepth(1.0);
      GlStateManager.enableDepthTest();
      GlStateManager.depthFunc(515);
      GlStateManager.enableAlphaTest();
      GlStateManager.method23697(516, 0.1F);
      GlStateManager.matrixMode(5889);
      GlStateManager.loadIdentity();
      GlStateManager.matrixMode(5888);
      GlStateManager.viewport(var0, var1, var2, var3);
   }

   public static int method27908() {
      assertThread(RenderSystem::isInInitPhase);
      if (field34662 == -1) {
         int var2 = GlStateManager.method23861(3379);

         for (int var3 = Math.max(32768, var2); var3 >= 1024; var3 >>= 1) {
            GlStateManager.texImage2D(32868, 0, 6408, var3, var3, 0, 6408, 5121, (IntBuffer)null);
            int var4 = GlStateManager.method23809(32868, 0, 4096);
            if (var4 != 0) {
               field34662 = var3;
               return var3;
            }
         }

         field34662 = Math.max(var2, 1024);
         field34654.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", field34662);
      }

      return field34662;
   }

   public static void method27909(int var0, Supplier<Integer> var1) {
      GlStateManager.method23747(var0, (Integer)var1.get());
   }

   public static void method27910(int var0, ByteBuffer var1, int var2) {
      assertThread(RenderSystem::isOnRenderThreadOrInit);
      GlStateManager.method23748(var0, var1, var2);
   }

   public static void method27911(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23749(var0);
   }

   public static void method27912(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23734(var0, var1);
   }

   public static void method27913(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23733(var0, var1);
   }

   public static void method27914(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23736(var0, var1);
   }

   public static void method27915(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23738(var0, var1);
   }

   public static void method27916(int var0, IntBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23740(var0, var1);
   }

   public static void method27917(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23735(var0, var1);
   }

   public static void method27918(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23737(var0, var1);
   }

   public static void method27919(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23739(var0, var1);
   }

   public static void method27920(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23741(var0, var1);
   }

   public static void method27921(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23742(var0, var1, var2);
   }

   public static void method27922(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23743(var0, var1, var2);
   }

   public static void method27923(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23744(var0, var1, var2);
   }

   public static void method27924() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23765();
   }

   public static void method27925() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23766();
   }

   public static void method27926(IntSupplier var0, int var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23767(var0.getAsInt(), var1);
   }

   public static void method27927() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23768();
   }

   public static void method27928(Vector3f var0, Vector3f var1, Matrix4f var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23772(var0, var1, var2);
   }

   public static void method27929(Vector3f var0, Vector3f var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23773(var0, var1);
   }

   public static void method27930(Vector3f var0, Vector3f var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23774(var0, var1);
   }

   public static void method27931() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.mulTextureByProjModelView();
   }

   public static void method27932() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.setupEndPortalTexGen();
   }

   public static void method27933() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.clearTexGen();
   }

   public static void method27934() {
      field34663 = true;
   }

   public static void method27935() {
      field34663 = false;
      if (!field34655.isEmpty()) {
         method27812();
      }

      if (!field34655.isEmpty()) {
         throw new IllegalStateException("Recorded to render queue during initialization");
      }
   }

   public static void method27936(Consumer<Integer> var0) {
      if (isOnRenderThread()) {
         var0.accept(GlStateManager.method23746());
      } else {
         recordRenderCall(() -> var0.accept(GlStateManager.method23746()));
      }
   }

   public static Tessellator renderThreadTesselator() {
      assertThread(RenderSystem::isOnRenderThread);
      return field34656;
   }

   public static void defaultBlendFunc() {
      blendFuncSeparate(GlStateManager.SourceFactor.field15997, DestFactor.field12932, GlStateManager.SourceFactor.field15990, DestFactor.field12936);
   }

   public static void method27939() {
      method27819(516, 0.1F);
   }

   @Deprecated
   public static void runAsFancy(Runnable var0) {
      boolean var3 = Minecraft.isFabulousGraphicsEnabled();
      if (var3) {
         GameSettings var4 = Minecraft.getInstance().gameSettings;
         GraphicsFanciness var5 = var4.graphicFanciness;
         var4.graphicFanciness = GraphicsFanciness.FANCY;
         var0.run();
         var4.graphicFanciness = var5;
      } else {
         var0.run();
      }
   }
}
