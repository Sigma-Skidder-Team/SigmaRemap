package mapped;

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

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.optifine.Config;
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
   private final GLFWErrorCallback field9785 = GLFWErrorCallback.create(this::method8018);
   private final IWindowEventListener mc;
   private final Class9329 monitorHandler;
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
   private int scaledWidth;
   private int scaledHeight;
   private double guiScaleFactor;
   private String field9805 = "";
   private boolean videoModeChanged;
   private int framerateLimit;
   private boolean vsync;
   private boolean field9809;

   public MainWindow(IWindowEventListener var1, Class9329 var2, ScreenSize var3, String var4, String var5) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      this.monitorHandler = var2;
      this.method8016();
      this.setRenderPhase("Pre startup");
      this.mc = var1;
      Optional var8 = VideoMode.method31535(var4);
      if (!var8.isPresent()) {
         if (var3.fullscreenWidth.isPresent() && var3.fullscreenHeight.isPresent()) {
            this.videoMode = Optional.<VideoMode>of(new VideoMode(var3.fullscreenWidth.getAsInt(), var3.fullscreenHeight.getAsInt(), 8, 8, 8, 60));
         } else {
            this.videoMode = Optional.<VideoMode>empty();
         }
      } else {
         this.videoMode = var8;
      }

      this.lastFullscreen = this.fullscreen = var3.fullscreen;
      Monitor var9 = var2.method35258(GLFW.glfwGetPrimaryMonitor());
      this.prevWindowWidth = this.width = var3.field45780 <= 0 ? 1 : var3.field45780;
      this.prevWindowHeight = this.height = var3.field45781 <= 0 ? 1 : var3.field45781;
      GLFW.glfwDefaultWindowHints();
      GuiManager.method33475();
      if (Config.isAntialiasing()) {
         GLFW.glfwWindowHint(135181, Config.method26891());
      }

      GLFW.glfwWindowHint(139265, 196609);
      GLFW.glfwWindowHint(139275, 221185);
      GLFW.glfwWindowHint(139266, 2);
      GLFW.glfwWindowHint(139267, 0);
      GLFW.glfwWindowHint(139272, 0);
      if (!Reflector.field42792.exists()) {
         this.handle = GLFW.glfwCreateWindow(this.width, this.height, var5, this.fullscreen && var9 != null ? var9.getMonitorPointer() : 0L, 0L);
      } else {
         Object var10 = Reflector.method35071(Reflector.field42791);
         this.handle = Reflector.method35066(
            var10,
            Reflector.field42792,
            (IntSupplier)() -> this.width,
            (IntSupplier)() -> this.height,
            (Supplier<String>)() -> var5,
            (LongSupplier)() -> this.fullscreen && var9 != null ? var9.getMonitorPointer() : 0L
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
         this.prevWindowX = this.windowX = var9.method24489() + var13.getWidth() / 2 - this.width / 2;
         this.prevWindowY = this.windowY = var9.method24490() + var13.getHeight() / 2 - this.height / 2;
      }

      GLFW.glfwMakeContextCurrent(this.handle);
      GL.createCapabilities();
      this.updateVideoMode();
      this.updateFramebufferSize();
      GLFW.glfwSetFramebufferSizeCallback(this.handle, this::onFramebufferSizeUpdate);
      GLFW.glfwSetWindowPosCallback(this.handle, this::method8021);
      GLFW.glfwSetWindowSizeCallback(this.handle, this::onWindowSizeUpdate);
      GLFW.glfwSetWindowFocusCallback(this.handle, this::onWindowFocusUpdate);
      GLFW.glfwSetCursorEnterCallback(this.handle, this::onWindowEnterUpdate);
   }

   public int getRefreshRate() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GLX.method28296(this);
   }

   public boolean shouldClose() {
      return GLX.method28300(this);
   }

   public static void method8012(BiConsumer<Integer, String> var0) {
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

   public void setWindowIcon(InputStream var1, InputStream var2) {
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
            ByteBuffer var11 = this.method8014(var1, var7, var8, var9);
            if (var11 == null) {
               throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
            }

            var10.position(0);
            var10.width(var7.get(0));
            var10.height(var8.get(0));
            var10.pixels(var11);
            ByteBuffer var12 = this.method8014(var2, var7, var8, var9);
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
   private ByteBuffer method8014(InputStream var1, IntBuffer var2, IntBuffer var3, IntBuffer var4) throws IOException {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      ByteBuffer var7 = null;

      ByteBuffer var8;
      try {
         var7 = TextureUtil.method30373(var1);
         ((java.nio.Buffer)var7).rewind();
         var8 = STBImage.stbi_load_from_memory(var7, var2, var3, var4, 0);
      } finally {
         if (var7 != null) {
            MemoryUtil.memFree(var7);
         }
      }

      return var8;
   }

   public void setRenderPhase(String var1) {
      this.field9805 = var1;
      if (var1.equals("Startup")) {
         Class8684.method31269();
      }
   }

   private void method8016() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      GLFW.glfwSetErrorCallback(MainWindow::method8017);
   }

   private static void method8017(int var0, long var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      String var5 = "GLFW error " + var0 + ": " + MemoryUtil.memUTF8(var1);
      TinyFileDialogs.tinyfd_messageBox(
         "Minecraft", var5 + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).", "ok", "error", false
      );
      throw new Class2473(var5);
   }

   public void method8018(int var1, long var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      String var6 = MemoryUtil.memUTF8(var2);
      LOGGER.error("########## GL ERROR ##########");
      LOGGER.error("@ {}", this.field9805);
      LOGGER.error("{}: {}", var1, var6);
   }

   public void setLogOnGlError() {
      GLFWErrorCallback var3 = GLFW.glfwSetErrorCallback(this.field9785);
      if (var3 != null) {
         var3.free();
      }

      Class8684.method31268();
   }

   public void setVsync(boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.vsync = var1;
      GLFW.glfwSwapInterval(!var1 ? 0 : 1);
   }

   @Override
   public void close() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.field9809 = true;
      Callbacks.glfwFreeCallbacks(this.handle);
      this.field9785.close();
      GLFW.glfwDestroyWindow(this.handle);
      GLFW.glfwTerminate();
   }

   private void method8021(long var1, int var3, int var4) {
      this.windowX = var3;
      this.windowY = var4;
   }

   private void onFramebufferSizeUpdate(long windowPointer, int framebufferWidth, int framebufferHeight) {
      if (windowPointer == this.handle) {
         int var7 = this.getFramebufferWidth();
         int var8 = this.getFramebufferHeight();
         if (framebufferWidth != 0 && framebufferHeight != 0) {
            this.framebufferWidth = framebufferWidth;
            this.framebufferHeight = framebufferHeight;
            if (this.getFramebufferWidth() != var7 || this.getFramebufferHeight() != var8) {
               this.mc.updateWindowSize();
            }
         }
      }
   }

   private void updateFramebufferSize() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      int[] var3 = new int[1];
      int[] var4 = new int[1];
      GLFW.glfwGetFramebufferSize(this.handle, var3, var4);
      this.framebufferWidth = var3[0];
      this.framebufferHeight = var4[0];
   }

   private void onWindowSizeUpdate(long windowPointer, int windowWidthIn, int windowHeightIn) {
      this.width = windowWidthIn;
      this.height = windowHeightIn;
      Client.getInstance().getGuiManager().onResize();
   }

   private void onWindowFocusUpdate(long windowPointer, boolean hasFocus) {
      if (windowPointer == this.handle) {
         this.mc.setGameFocused(hasFocus);
      }
   }

   private void onWindowEnterUpdate(long window, boolean ignoreFirst) {
      if (ignoreFirst) {
         this.mc.ignoreFirstMove();
      }
   }

   public void setFramerateLimit(int limit) {
      this.framerateLimit = limit;
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

   public void setVideoMode(Optional<VideoMode> fullscreenModeIn) {
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
         this.mc.updateWindowSize();
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
            GLFW.glfwSetWindowMonitor(this.handle, monitor.getMonitorPointer(), this.windowX, this.windowY, this.width, this.height, videomode.getRefreshRate());
         } else {
            LOGGER.warn("Failed to find suitable monitor for fullscreen mode");
            this.fullscreen = false;
         }
      }
   }

   public void toggleFullscreen() {
      this.fullscreen = !this.fullscreen;
   }

   private void toggleFullscreen(boolean vsyncEnabled) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);

      try {
         this.updateVideoMode();
         this.mc.updateWindowSize();
         this.setVsync(vsyncEnabled);
         this.flipFrame();
      } catch (Exception exception) {
         LOGGER.error("Couldn't toggle fullscreen", exception);
      }
   }

   public int calcGuiScale(int guiScaleIn, boolean forceUnicode) {
      int i;

      for (i = 1; i != guiScaleIn && i < this.framebufferWidth && i < this.framebufferHeight && this.framebufferWidth / (i + 1) >= 320 && this.framebufferHeight / (i + 1) >= 240; ++i)
      {
      }

      if (forceUnicode && i % 2 != 0)
      {
         ++i;
      }

      return i;
   }

   public void setGuiScale(double scaleFactor) {
      this.guiScaleFactor = scaleFactor;
      int i = (int)((double)this.framebufferWidth / scaleFactor);
      this.scaledWidth = (double)this.framebufferWidth / scaleFactor > (double)i ? i + 1 : i;
      int j = (int)((double)this.framebufferHeight / scaleFactor);
      this.scaledHeight = (double)this.framebufferHeight / scaleFactor > (double)j ? j + 1 : j;
   }

   public void setWindowTitle(String title) {
      GLFW.glfwSetWindowTitle(this.handle, title);
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

   public int getWidth() {
      return this.width;
   }

   public int getHeight() {
      return this.height;
   }

   public int getScaledWidth() {
      return this.scaledWidth;
   }

   public int getScaledHeight() {
      return this.scaledHeight;
   }

   public int getWindowX() {
      return this.windowX;
   }

   public int getWindowY() {
      return this.windowY;
   }

   public double getGuiScaleFactor() {
      return this.guiScaleFactor;
   }

   @Nullable
   public Monitor getMonitor() {
      return this.monitorHandler.getMonitor(this);
   }

   public void setRawMouseInput(boolean var1) {
      InputMappings.method38644(this.handle, var1);
   }

   public void method8052(int var1, int var2) {
      this.onFramebufferSizeUpdate(this.handle, var1, var2);
   }

   public boolean method8053() {
      return this.field9809;
   }
}
