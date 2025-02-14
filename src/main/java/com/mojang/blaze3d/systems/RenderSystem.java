package com.mojang.blaze3d.systems;

import com.google.common.collect.Queues;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import mapped.*;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.vector.Vector3f;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class RenderSystem {
   private static final Logger LOGGER = LogManager.getLogger();
   private static final ConcurrentLinkedQueue<IRenderCall> recordingQueue = Queues.newConcurrentLinkedQueue();
   private static final Tessellator field34656 = new Tessellator();
   public static final float field34657 = 0.1F;
   private static final int field34658 = 1024;
   private static boolean isReplayingQueue;
   private static Thread gameThread;
   private static Thread renderThread;
   private static int MAX_SUPPORTED_TEXTURE_SIZE = -1;
   private static boolean isInInit;
   private static double lastDrawTime = Double.MIN_VALUE;

   public static void method27802() {
      if (renderThread == null && gameThread != Thread.currentThread()) {
         renderThread = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize render thread");
      }
   }

   public static boolean isOnRenderThread() {
      return Thread.currentThread() == renderThread;
   }

   public static boolean isOnRenderThreadOrInit() {
      return isInInit || isOnRenderThread();
   }

   public static void initGameThread(boolean p_initGameThread_0_) {
      boolean flag = renderThread == Thread.currentThread();
      if (gameThread == null && renderThread != null && flag != p_initGameThread_0_) {
         gameThread = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize tick thread");
      }
   }

   public static boolean isOnGameThread() {
      return true;
   }

   public static boolean isOnGameThreadOrInit() {
      return isInInit || isOnGameThread();
   }

   public static void assertThread(Supplier<Boolean> p_assertThread_0_) {
      if (!p_assertThread_0_.get()) {
         throw new IllegalStateException("Rendersystem called from wrong thread");
      }
   }

   public static boolean isInInitPhase() {
      return true;
   }

   public static void recordRenderCall(IRenderCall p_recordRenderCall_0_) {
      recordingQueue.add(p_recordRenderCall_0_);
   }

   public static void flipFrame(long p_flipFrame_0_) {
      GLFW.glfwPollEvents();
      replayQueue();
      Tessellator.getInstance().getBuffer().reset();
      GLFW.glfwSwapBuffers(p_flipFrame_0_);
      GLFW.glfwPollEvents();
   }

   public static void replayQueue() {
      isReplayingQueue = true;

      while (!recordingQueue.isEmpty()) {
         IRenderCall irendercall = recordingQueue.poll();
         irendercall.execute();
      }

      isReplayingQueue = false;
   }

   public static void limitDisplayFPS(int p_limitDisplayFPS_0_) {
      double d0 = lastDrawTime + 1.0D / (double)p_limitDisplayFPS_0_;
      double d1;

      for (d1 = GLFW.glfwGetTime(); d1 < d0; d1 = GLFW.glfwGetTime())
      {
         GLFW.glfwWaitEventsTimeout(d0 - d1);
      }

      lastDrawTime = d1;
   }

   @Deprecated
   public static void pushLightingAttributes() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.pushLightingAttributes();
   }

   @Deprecated
   public static void pushTextureAttributes() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.pushTextureAttributes();
   }

   @Deprecated
   public static void popAttributes() {
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
   public static void alphaFunc(int var0, float var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.alphaFunc(var0, var1);
   }

   @Deprecated
   public static void enableLighting() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.enableLighting();
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
   public static void disableColorMaterial() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.disableColorMaterial();
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

   public static void disableCull() {
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

   public static void logicOp(Class2270 var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.logicOp(var0.opcode);
   }

   public static void activeTexture(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.activeTexture(var0);
   }

   public static void enableTexture() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.enableTexture();
   }

   public static void disableTexture() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23805();
   }

   public static void texParameter(int var0, int var1, int var2) {
      GlStateManager.texParameter(var0, var1, var2);
   }

   public static void method27864(int var0) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.method23812(var0);
   }

   public static void bindTexture(int var0) {
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
   public static void disableRescaleNormal() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.disableRescaleNormal();
   }

   public static void viewport(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.viewport(var0, var1, var2, var3);
   }

   public static void colorMask(boolean var0, boolean var1, boolean var2, boolean var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.colorMask(var0, var1, var2, var3);
   }

   public static void stencilFunc(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.stencilFunc(var0, var1, var2);
   }

   public static void stencilMask(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.stencilMask(var0);
   }

   public static void stencilOp(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.stencilOp(var0, var1, var2);
   }

   public static void clearDepth(double var0) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.clearDepth(var0);
   }

   public static void clearColor(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.clearColor(var0, var1, var2, var3);
   }

   public static void clearStencil(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.clearStencil(var0);
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
      GlStateManager.pushMatrix();
   }

   @Deprecated
   public static void popMatrix() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.popMatrix();
   }

   @Deprecated
   public static void ortho(double var0, double var2, double var4, double var6, double var8, double var10) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.ortho(var0, var2, var4, var6, var8, var10);
   }

   @Deprecated
   public static void rotatef(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.rotatef(var0, var1, var2, var3);
   }

   @Deprecated
   public static void scalef(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.scalef(var0, var1, var2);
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
   public static void color3f(float var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.color4f(var0, var1, var2, 1.0F);
   }

   @Deprecated
   public static void clearCurrentColor() {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.clearCurrentColor();
   }

   public static void drawArrays(int var0, int var1, int var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.drawArrays(var0, var1, var2);
   }

   public static void lineWidth(float var0) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.lineWidth(var0);
   }

   public static void pixelStore(int var0, int var1) {
      assertThread(RenderSystem::isOnGameThreadOrInit);
      GlStateManager.pixelStore(var0, var1);
   }

   public static void pixelTransfer(int var0, float var1) {
      GlStateManager.pixelTransfer(var0, var1);
   }

   public static void readPixels(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.readPixels(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void getString(int var0, Consumer<String> var1) {
      assertThread(RenderSystem::isOnGameThread);
      var1.accept(GlStateManager.getString(var0));
   }

   public static String getBackendDescription() {
      assertThread(RenderSystem::isInInitPhase);
      return String.format("LWJGL version %s", GLX._getLWJGLVersion());
   }

   public static String getApiDescription() {
      assertThread(RenderSystem::isInInitPhase);
      return GLX.getOpenGLVersionString();
   }

   public static LongSupplier initBackendSystem() {
      assertThread(RenderSystem::isInInitPhase);
      return GLX._initGlfw();
   }

   public static void initRenderer(int var0, boolean var1) {
      assertThread(RenderSystem::isInInitPhase);
      GLX._init(var0, var1);
   }

   public static void setErrorCallback(GLFWErrorCallbackI var0) {
      assertThread(RenderSystem::isInInitPhase);
      GLX._setGlfwErrorCallback(var0);
   }

   public static void renderCrosshair(int var0) {
      assertThread(RenderSystem::isOnGameThread);
      GLX._renderCrosshair(var0, true, true, true);
   }

   public static void setupNvFogDistance() {
      assertThread(RenderSystem::isOnGameThread);
      GLX._setupNvFogDistance();
   }

   @Deprecated
   public static void glMultiTexCoord2f(int var0, float var1, float var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.multiTexCoord2f(var0, var1, var2);
   }

   public static String getCapsString() {
      assertThread(RenderSystem::isOnGameThread);
      return GLX._getCapsString();
   }

   public static void setupDefaultState(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isInInitPhase);
      GlStateManager.enableTexture();
      GlStateManager.shadeModel(7425);
      GlStateManager.clearDepth(1.0);
      GlStateManager.enableDepthTest();
      GlStateManager.depthFunc(515);
      GlStateManager.enableAlphaTest();
      GlStateManager.alphaFunc(516, 0.1F);
      GlStateManager.matrixMode(5889);
      GlStateManager.loadIdentity();
      GlStateManager.matrixMode(5888);
      GlStateManager.viewport(var0, var1, var2, var3);
   }

   public static int maxSupportedTextureSize() {
      assertThread(RenderSystem::isInInitPhase);

      if (MAX_SUPPORTED_TEXTURE_SIZE == -1)
      {
         int i = GlStateManager.getInteger(3379);

         for (int j = Math.max(32768, i); j >= 1024; j >>= 1)
         {
            GlStateManager.texImage2D(32868, 0, 6408, j, j, 0, 6408, 5121, (IntBuffer)null);
            int k = GlStateManager.getTexLevelParameter(32868, 0, 4096);

            if (k != 0)
            {
               MAX_SUPPORTED_TEXTURE_SIZE = j;
               return j;
            }
         }

         MAX_SUPPORTED_TEXTURE_SIZE = Math.max(i, 1024);
         LOGGER.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", (int)MAX_SUPPORTED_TEXTURE_SIZE);
      }

      return MAX_SUPPORTED_TEXTURE_SIZE;
   }

   public static void glBindBuffer(int var0, Supplier<Integer> var1) {
      GlStateManager.bindBuffer(var0, (Integer)var1.get());
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

   public static void setupLevelDiffuseLighting(Vector3f var0, Vector3f var1, Matrix4f var2) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23772(var0, var1, var2);
   }

   public static void setupGuiFlatDiffuseLighting(Vector3f var0, Vector3f var1) {
      assertThread(RenderSystem::isOnGameThread);
      GlStateManager.method23773(var0, var1);
   }

   public static void setupGui3DDiffuseLighting(Vector3f var0, Vector3f var1) {
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
      isInInit = true;
   }

   public static void method27935() {
      isInInit = false;
      if (!recordingQueue.isEmpty()) {
         replayQueue();
      }

      if (!recordingQueue.isEmpty()) {
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
      blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, DestFactor.ZERO);
   }

   public static void method27939() {
      alphaFunc(516, 0.1F);
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
