package remapped;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWImage.Buffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.tinyfd.TinyFileDialogs;

public final class MainWindow implements AutoCloseable {
   private static final Logger LOGGER = LogManager.getLogger();
   private final GLFWErrorCallback field_47714 = GLFWErrorCallback.create(this::method_43190);
   private final WindowEventHandler client;
   private final class_7962 monitorHandler;
   private final long handle;
   private int prevWindowX;
   private int prevWindowY;
   private int prevWindowWidth;
   private int prevWindowHeight;
   private Optional<VideoMode> videoMode;
   private boolean fullscreen;
   private boolean lastFullscreen;
   private int windowX;
   private int windowY;
   private int width;
   private int height;
   private int framebufferWidth;
   private int framebufferHeight;
   private int field_47715;
   private int field_47737;
   private double field_47733;
   private String field_47727 = "";
   private boolean videoModeChanged;
   private int framerateLimit;
   private boolean vsync;
   private boolean field_47728;

   public MainWindow(WindowEventHandler var1, class_7962 var2, class_9706 var3, String var4, String var5) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      this.monitorHandler = var2;
      this.method_43191();
      this.method_43182("Pre startup");
      this.client = var1;
      Optional var8 = VideoMode.method_25891(var4);
      if (!var8.isPresent()) {
         if (var3.field_49357.isPresent() && var3.field_49359.isPresent()) {
            this.videoMode = Optional.<VideoMode>of(new VideoMode(var3.field_49357.getAsInt(), var3.field_49359.getAsInt(), 8, 8, 8, 60));
         } else {
            this.videoMode = Optional.<VideoMode>empty();
         }
      } else {
         this.videoMode = var8;
      }

      this.lastFullscreen = this.fullscreen = var3.field_49360;
      Monitor var9 = var2.method_36021(GLFW.glfwGetPrimaryMonitor());
      this.prevWindowWidth = this.width = var3.field_49361 <= 0 ? 1 : var3.field_49361;
      this.prevWindowHeight = this.height = var3.field_49356 <= 0 ? 1 : var3.field_49356;
      GLFW.glfwDefaultWindowHints();
      GUIManager.method_30993();
      if (Config.method_14248()) {
         GLFW.glfwWindowHint(135181, Config.method_14447());
      }

      GLFW.glfwWindowHint(139265, 196609);
      GLFW.glfwWindowHint(139275, 221185);
      GLFW.glfwWindowHint(139266, 2);
      GLFW.glfwWindowHint(139267, 0);
      GLFW.glfwWindowHint(139272, 0);
      if (!class_7860.field_40035.method_3596()) {
         this.handle = GLFW.glfwCreateWindow(this.width, this.height, var5, this.fullscreen && var9 != null ? var9.method_9697() : 0L, 0L);
      } else {
         Object var10 = class_7860.method_35559(class_7860.field_40082);
         this.handle = class_7860.method_35571(
            var10,
            class_7860.field_40035,
            (IntSupplier)() -> this.width,
            (IntSupplier)() -> this.height,
            (Supplier<String>)() -> var5,
            (LongSupplier)() -> this.fullscreen && var9 != null ? var9.method_9697() : 0L
         );
      }

      if (var9 == null) {
         int[] var12 = new int[1];
         int[] var11 = new int[1];
         GLFW.glfwGetWindowPos(this.handle, var12, var11);
         this.prevWindowX = this.windowX = var12[0];
         this.prevWindowY = this.windowY = var11[0];
      } else {
         VideoMode var13 = var9.getVideoModeOrDefault(!this.fullscreen ? Optional.<VideoMode>empty() : this.videoMode);
         this.prevWindowX = this.windowX = var9.method_9694() + var13.getWidth() / 2 - this.width / 2;
         this.prevWindowY = this.windowY = var9.method_9703() + var13.getHeight() / 2 - this.height / 2;
      }

      GLFW.glfwMakeContextCurrent(this.handle);
      GL.createCapabilities();
      this.updateVideoMode();
      this.method_43195();
      GLFW.glfwSetFramebufferSizeCallback(this.handle, this::method_43158);
      GLFW.glfwSetWindowPosCallback(this.handle, this::method_43170);
      GLFW.glfwSetWindowSizeCallback(this.handle, this::onWindowSizeUpdate);
      GLFW.glfwSetWindowFocusCallback(this.handle, this::onWindowFocusUpdate);
      GLFW.glfwSetCursorEnterCallback(this.handle, this::onWindowEnterUpdate);
   }

   public int method_43197() {
      RenderSystem.assertThread(RenderSystem::method_16366);
      return class_3776.method_17493(this);
   }

   public boolean method_43187() {
      return class_3776.method_17492(this);
   }

   public static void method_43167(BiConsumer<Integer, String> var0) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      MemoryStack var3 = MemoryStack.stackPush();
      Throwable var4 = null;

      try {
         PointerBuffer var5 = var3.mallocPointer(1);
         int var6 = GLFW.glfwGetError(var5);
         if (var6 != 0) {
            long var7 = var5.get();
            String var9 = var7 == 0L ? "" : MemoryUtil.memUTF8(var7);
            var0.accept(var6, var9);
         }
      } catch (Throwable var17) {
         var4 = var17;
         throw var17;
      } finally {
         if (var3 != null) {
            if (var4 != null) {
               try {
                  var3.close();
               } catch (Throwable var16) {
                  var4.addSuppressed(var16);
               }
            } else {
               var3.close();
            }
         }
      }
   }

   public void method_43183(InputStream var1, InputStream var2) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);

      try {
         MemoryStack var5 = MemoryStack.stackPush();
         Throwable var6 = null;

         try {
            if (var1 == null) {
               throw new FileNotFoundException("icons/icon_16x16.png");
            }

            if (var2 == null) {
               throw new FileNotFoundException("icons/icon_32x32.png");
            }

            IntBuffer var7 = var5.mallocInt(1);
            IntBuffer var8 = var5.mallocInt(1);
            IntBuffer var9 = var5.mallocInt(1);
            Buffer var10 = GLFWImage.mallocStack(2, var5);
            ByteBuffer var11 = this.method_43180(var1, var7, var8, var9);
            if (var11 == null) {
               throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
            }

            var10.position(0);
            var10.width(var7.get(0));
            var10.height(var8.get(0));
            var10.pixels(var11);
            ByteBuffer var12 = this.method_43180(var2, var7, var8, var9);
            if (var12 == null) {
               throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
            }

            var10.position(1);
            var10.width(var7.get(0));
            var10.height(var8.get(0));
            var10.pixels(var12);
            var10.position(0);
            GLFW.glfwSetWindowIcon(this.handle, var10);
            STBImage.stbi_image_free(var11);
            STBImage.stbi_image_free(var12);
         } catch (Throwable var21) {
            var6 = var21;
            throw var21;
         } finally {
            if (var5 != null) {
               if (var6 != null) {
                  try {
                     var5.close();
                  } catch (Throwable var20) {
                     var6.addSuppressed(var20);
                  }
               } else {
                  var5.close();
               }
            }
         }
      } catch (IOException var23) {
         LOGGER.error("Couldn't set icon", var23);
      }
   }

   @Nullable
   private ByteBuffer method_43180(InputStream var1, IntBuffer var2, IntBuffer var3, IntBuffer var4) throws IOException {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      ByteBuffer var7 = null;

      ByteBuffer var8;
      try {
         var7 = class_4970.method_22844(var1);
         ((java.nio.Buffer)var7).rewind();
         var8 = STBImage.stbi_load_from_memory(var7, var2, var3, var4, 0);
      } finally {
         if (var7 != null) {
            MemoryUtil.memFree(var7);
         }
      }

      return var8;
   }

   public void method_43182(String var1) {
      this.field_47727 = var1;
      if (var1.equals("Startup")) {
         class_5525.method_25071();
      }
   }

   private void method_43191() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      GLFW.glfwSetErrorCallback(MainWindow::method_43196);
   }

   private static void method_43196(int error, long description) {
      com.mojang.blaze3d.systems.RenderSystem.assertThread(com.mojang.blaze3d.systems.RenderSystem::isInInitPhase);
      String s = "GLFW error " + error + ": " + MemoryUtil.memUTF8(description);
      TinyFileDialogs.tinyfd_messageBox("Minecraft", s + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).", "ok", "error", false);
      throw new net.minecraft.client.MainWindow.GlException(s);
   }

   public void method_43190(int var1, long var2) {
      RenderSystem.assertThread(RenderSystem::method_16366);
      String var6 = MemoryUtil.memUTF8(var2);
      LOGGER.error("########## GL ERROR ##########");
      LOGGER.error("@ {}", this.field_47727);
      LOGGER.error("{}: {}", var1, var6);
   }

   public void method_43172() {
      GLFWErrorCallback var3 = GLFW.glfwSetErrorCallback(this.field_47714);
      if (var3 != null) {
         var3.free();
      }

      class_5525.method_25088();
   }

   public void method_43162(boolean var1) {
      RenderSystem.assertThread(RenderSystem::method_16440);
      this.vsync = var1;
      GLFW.glfwSwapInterval(!var1 ? 0 : 1);
   }

   @Override
   public void close() {
      RenderSystem.assertThread(RenderSystem::method_16366);
      this.field_47728 = true;
      Callbacks.glfwFreeCallbacks(this.handle);
      this.field_47714.close();
      GLFW.glfwDestroyWindow(this.handle);
      GLFW.glfwTerminate();
   }

   private void method_43170(long var1, int var3, int var4) {
      this.windowX = var3;
      this.windowY = var4;
   }

   private void method_43158(long var1, int var3, int var4) {
      if (var1 == this.handle) {
         int var7 = this.getFramebufferWidth();
         int var8 = this.getFramebufferHeight();
         if (var3 != 0 && var4 != 0) {
            this.framebufferWidth = var3;
            this.framebufferHeight = var4;
            if (this.getFramebufferWidth() != var7 || this.getFramebufferHeight() != var8) {
               this.client.updateWindowSize();
            }
         }
      }
   }

   private void method_43195() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      int[] var3 = new int[1];
      int[] var4 = new int[1];
      GLFW.glfwGetFramebufferSize(this.handle, var3, var4);
      this.framebufferWidth = var3[0];
      this.framebufferHeight = var4[0];
   }

   private void onWindowSizeUpdate(long var1, int var3, int var4) {
      this.width = var3;
      this.height = var4;
      SigmaMainClass.getInstance().getGUIManager().method_30991();
   }

   private void onWindowFocusUpdate(long var1, boolean var3) {
      if (var1 == this.handle) {
         this.client.setGameFocused(var3);
      }
   }

   private void onWindowEnterUpdate(long var1, boolean var3) {
      if (var3) {
         this.client.ignoreFirstMove();
      }
   }

   public void setFramerateLimit(int var1) {
      this.framerateLimit = var1;
   }

   public int getLimitFramerate() {
      return this.framerateLimit;
   }

   public void flipFrame() {
      RenderSystem.flipFrame(this.handle);
      if (this.fullscreen != this.lastFullscreen) {
         this.lastFullscreen = this.fullscreen;
         this.toggleFullscreen(this.vsync);
      }
   }

   public Optional<VideoMode> getVideoMode() {
      return this.videoMode;
   }

   public void setVideoMode(Optional<VideoMode> fullscreenModeIn)
   {
      boolean flag = !fullscreenModeIn.equals(this.videoMode);
      this.videoMode = fullscreenModeIn;

      if (flag)
      {
         this.videoModeChanged = true;
      }
   }

   public void update() {
      if (this.fullscreen && this.videoModeChanged) {
         this.videoModeChanged = false;
         this.updateVideoMode();
         this.client.updateWindowSize();
      }
   }

   private void updateVideoMode() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      boolean var3 = GLFW.glfwGetWindowMonitor(this.handle) != 0L;
      if (!this.fullscreen) {
         this.windowX = this.prevWindowX;
         this.windowY = this.prevWindowY;
         this.width = this.prevWindowWidth;
         this.height = this.prevWindowHeight;
         GLFW.glfwSetWindowMonitor(this.handle, 0L, this.windowX, this.windowY, this.width, this.height, -1);
      } else {
         Monitor monitor = this.monitorHandler.getMonitor(this);
         if (monitor != null) {
            VideoMode videomode = monitor.getVideoModeOrDefault(this.videoMode);
            if (!var3) {
               this.prevWindowX = this.windowX;
               this.prevWindowY = this.windowY;
               this.prevWindowWidth = this.width;
               this.prevWindowHeight = this.height;
            }

            this.windowX = 0;
            this.windowY = 0;
            this.width = videomode.getWidth();
            this.height = videomode.getHeight();
            GLFW.glfwSetWindowMonitor(
               this.handle, monitor.method_9697(), this.windowX, this.windowY, this.width, this.height, videomode.getRefreshRate()
            );
         } else {
            LOGGER.warn("Failed to find suitable monitor for fullscreen mode");
            this.fullscreen = false;
         }
      }
   }

   public void toggleFullscreen() {
      this.fullscreen = !this.fullscreen;
   }

   private void toggleFullscreen(boolean var1) {
      RenderSystem.assertThread(RenderSystem::method_16366);

      try {
         this.updateVideoMode();
         this.client.updateWindowSize();
         this.method_43162(var1);
         this.flipFrame();
      } catch (Exception var5) {
         LOGGER.error("Couldn't toggle fullscreen", var5);
      }
   }

   public int calcGuiScale(int var1, boolean var2) {
      int var5 = 1;

      while (var5 != var1 && var5 < this.framebufferWidth && var5 < this.framebufferHeight && this.framebufferWidth / (var5 + 1) >= 320 && this.framebufferHeight / (var5 + 1) >= 240) {
         var5++;
      }

      if (var2 && var5 % 2 != 0) {
         var5++;
      }

      return var5;
   }

   public void setGuiScale(double var1) {
      this.field_47733 = var1;
      int var5 = (int)((double)this.framebufferWidth / var1);
      this.field_47715 = !((double)this.framebufferWidth / var1 > (double)var5) ? var5 : var5 + 1;
      int var6 = (int)((double)this.framebufferHeight / var1);
      this.field_47737 = !((double)this.framebufferHeight / var1 > (double)var6) ? var6 : var6 + 1;
   }

   public void setWindowTitle(String var1) {
      GLFW.glfwSetWindowTitle(this.handle, var1);
   }

   public long getHandle() {
      return this.handle;
   }

   public boolean isFullscreen() {
      return this.fullscreen;
   }

   public int getFramebufferWidth() {
      return this.framebufferWidth;
   }

   public int getFramebufferHeight() {
      return this.framebufferHeight;
   }

   public int method_43166() {
      return this.width;
   }

   public int method_43163() {
      return this.height;
   }

   public int getScaledWidth() {
      return this.field_47715;
   }

   public int getScaledHeight() {
      return this.field_47737;
   }

   public int method_43171() {
      return this.windowX;
   }

   public int method_43184() {
      return this.windowY;
   }

   public double method_43189() {
      return this.field_47733;
   }

   @Nullable
   public Monitor method_43192() {
      return this.monitorHandler.getMonitor(this);
   }

   public void method_43176(boolean var1) {
      class_9732.method_44935(this.handle, var1);
   }

   public void method_43161(int var1, int var2) {
      this.method_43158(this.handle, var1, var2);
   }

   public boolean method_43168() {
      return this.field_47728;
   }
}
