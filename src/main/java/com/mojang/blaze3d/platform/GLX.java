package com.mojang.blaze3d.platform;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.BufferBuilder;
import net.minecraft.client.renderer.GlDebugTextUtils;
import mapped.MainWindow;
import mapped.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.Version;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import oshi.SystemInfo;
import oshi.hardware.Processor;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class GLX {
   private static final Logger field35101 = LogManager.getLogger();
   private static String capsString = "";
   private static String cpuInfo;
   private static final Map<Integer, String> field35104 = make(Maps.newHashMap(), var0 -> {
      var0.put(0, "No error");
      var0.put(1280, "Enum parameter is invalid for this function");
      var0.put(1281, "Parameter is invalid for this function");
      var0.put(1282, "Current state is invalid for this function");
      var0.put(1283, "Stack overflow");
      var0.put(1284, "Stack underflow");
      var0.put(1285, "Out of memory");
      var0.put(1286, "Operation on incomplete framebuffer");
      var0.put(1286, "Operation on incomplete framebuffer");
   });

   public static String getOpenGLVersionString() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GLFW.glfwGetCurrentContext() != 0L
         ? GlStateManager.getString(7937) + " GL version " + GlStateManager.getString(7938) + ", " + GlStateManager.getString(7936)
         : "NO CONTEXT";
   }

   public static int method28296(MainWindow var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      long var3 = GLFW.glfwGetWindowMonitor(var0.getHandle());
      if (var3 == 0L) {
         var3 = GLFW.glfwGetPrimaryMonitor();
      }

      GLFWVidMode var5 = var3 != 0L ? GLFW.glfwGetVideoMode(var3) : null;
      return var5 != null ? var5.refreshRate() : 0;
   }

   public static String _getLWJGLVersion() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      return Version.getVersion();
   }

   public static LongSupplier _initGlfw() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      MainWindow.method8012((var0, var1) -> {
         throw new IllegalStateException(String.format("GLFW error before init: [0x%X]%s", var0, var1));
      });
      ArrayList<String> var2 = Lists.newArrayList();
      GLFWErrorCallback var3 = GLFW.glfwSetErrorCallback((var1, var2x) -> var2.add(String.format("GLFW error during init: [0x%X]%s", var1, var2x)));
      if (!GLFW.glfwInit()) {
         throw new IllegalStateException("Failed to initialize GLFW, errors: " + Joiner.on(",").join(var2));
      } else {
         LongSupplier var4 = () -> (long)(GLFW.glfwGetTime() * 1.0E9);

         for (String var6 : var2) {
            field35101.error("GLFW error collected during initialization: {}", var6);
         }

         RenderSystem.setErrorCallback(var3);
         return var4;
      }
   }

   public static void _setGlfwErrorCallback(GLFWErrorCallbackI var0) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      GLFWErrorCallback var3 = GLFW.glfwSetErrorCallback(var0);
      if (var3 != null) {
         var3.free();
      }
   }

   public static boolean method28300(MainWindow var0) {
      return GLFW.glfwWindowShouldClose(var0.getHandle());
   }

   public static void _setupNvFogDistance() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (GL.getCapabilities().GL_NV_fog_distance) {
         if (Config.isFogFancy()) {
            GlStateManager.method23786(34138, 34139);
         }

         if (Config.isFogFast()) {
            GlStateManager.method23786(34138, 34140);
         }
      }
   }

   public static void _init(int var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      GLCapabilities glcapabilities = GL.getCapabilities();
      capsString = "Using framebuffer using " + GlStateManager.init(glcapabilities);

      try {
         Processor[] var5 = new SystemInfo().getHardware().getProcessors();
         cpuInfo = String.format("%dx %s", var5.length, var5[0]).replaceAll("\\s+", " ");
      } catch (Throwable var6) {
      }

      GlDebugTextUtils.setDebugVerbosity(var0, var1);
   }

   public static String _getCapsString() {
      return capsString;
   }

   public static String method28304() {
      return cpuInfo != null ? cpuInfo : "<unknown>";
   }

   public static void _renderCrosshair(int var0, boolean var1, boolean var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GlStateManager.method23805();
      GlStateManager.depthMask(false);
      Tessellator var6 = RenderSystem.renderThreadTesselator();
      BufferBuilder var7 = var6.getBuffer();
      GL11.glLineWidth(4.0F);
      var7.begin(1, DefaultVertexFormats.POSITION_COLOR);
      if (var1) {
         var7.pos(0.0, 0.0, 0.0).color(0, 0, 0, 255).endVertex();
         var7.pos((double)var0, 0.0, 0.0).color(0, 0, 0, 255).endVertex();
      }

      if (var2) {
         var7.pos(0.0, 0.0, 0.0).color(0, 0, 0, 255).endVertex();
         var7.pos(0.0, (double)var0, 0.0).color(0, 0, 0, 255).endVertex();
      }

      if (var3) {
         var7.pos(0.0, 0.0, 0.0).color(0, 0, 0, 255).endVertex();
         var7.pos(0.0, 0.0, (double)var0).color(0, 0, 0, 255).endVertex();
      }

      var6.draw();
      GL11.glLineWidth(2.0F);
      var7.begin(1, DefaultVertexFormats.POSITION_COLOR);
      if (var1) {
         var7.pos(0.0, 0.0, 0.0).color(255, 0, 0, 255).endVertex();
         var7.pos((double)var0, 0.0, 0.0).color(255, 0, 0, 255).endVertex();
      }

      if (var2) {
         var7.pos(0.0, 0.0, 0.0).color(0, 255, 0, 255).endVertex();
         var7.pos(0.0, (double)var0, 0.0).color(0, 255, 0, 255).endVertex();
      }

      if (var3) {
         var7.pos(0.0, 0.0, 0.0).color(127, 127, 255, 255).endVertex();
         var7.pos(0.0, 0.0, (double)var0).color(127, 127, 255, 255).endVertex();
      }

      var6.draw();
      GL11.glLineWidth(1.0F);
      GlStateManager.depthMask(true);
      GlStateManager.enableTexture();
   }

   public static String method28306(int var0) {
      return field35104.get(var0);
   }

   public static <T> T method28307(Supplier<T> var0) {
      return (T)var0.get();
   }

   public static <T> T make(T var0, Consumer<T> var1) {
      var1.accept(var0);
      return (T)var0;
   }

   public static boolean isUsingFBOs() {
      return !Config.isAntialiasing();
   }

   public static boolean useVbo() {
      return true;
   }
}
