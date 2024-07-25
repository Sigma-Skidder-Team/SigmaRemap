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

public final class Window implements AutoCloseable {
   private static final Logger field_47718 = LogManager.getLogger();
   private final GLFWErrorCallback field_47714 = GLFWErrorCallback.create(this::method_43190);
   private final WindowEventHandler field_47731;
   private final class_7962 field_47734;
   private final long field_47716;
   private int field_47739;
   private int field_47723;
   private int field_47720;
   private int field_47730;
   private Optional<class_5722> field_47717;
   private boolean field_47735;
   private boolean field_47726;
   private int field_47722;
   private int field_47713;
   private int field_47736;
   private int field_47724;
   private int field_47725;
   private int field_47729;
   private int field_47715;
   private int field_47737;
   private double field_47733;
   private String field_47727 = "";
   private boolean field_47721;
   private int field_47738;
   private boolean field_47732;
   private boolean field_47728;

   public Window(WindowEventHandler var1, class_7962 var2, class_9706 var3, String var4, String var5) {
      class_3542.method_16431(class_3542::method_16395);
      this.field_47734 = var2;
      this.method_43191();
      this.method_43182("Pre startup");
      this.field_47731 = var1;
      Optional var8 = class_5722.method_25891(var4);
      if (!var8.isPresent()) {
         if (var3.field_49357.isPresent() && var3.field_49359.isPresent()) {
            this.field_47717 = Optional.<class_5722>of(new class_5722(var3.field_49357.getAsInt(), var3.field_49359.getAsInt(), 8, 8, 8, 60));
         } else {
            this.field_47717 = Optional.<class_5722>empty();
         }
      } else {
         this.field_47717 = var8;
      }

      this.field_47726 = this.field_47735 = var3.field_49360;
      class_2078 var9 = var2.method_36021(GLFW.glfwGetPrimaryMonitor());
      this.field_47720 = this.field_47736 = var3.field_49361 <= 0 ? 1 : var3.field_49361;
      this.field_47730 = this.field_47724 = var3.field_49356 <= 0 ? 1 : var3.field_49356;
      GLFW.glfwDefaultWindowHints();
      GUIManager.method_30993();
      if (class_3111.method_14248()) {
         GLFW.glfwWindowHint(135181, class_3111.method_14447());
      }

      GLFW.glfwWindowHint(139265, 196609);
      GLFW.glfwWindowHint(139275, 221185);
      GLFW.glfwWindowHint(139266, 2);
      GLFW.glfwWindowHint(139267, 0);
      GLFW.glfwWindowHint(139272, 0);
      if (!class_7860.field_40035.method_3596()) {
         this.field_47716 = GLFW.glfwCreateWindow(this.field_47736, this.field_47724, var5, this.field_47735 && var9 != null ? var9.method_9697() : 0L, 0L);
      } else {
         Object var10 = class_7860.method_35559(class_7860.field_40082);
         this.field_47716 = class_7860.method_35571(
            var10,
            class_7860.field_40035,
            (IntSupplier)() -> this.field_47736,
            (IntSupplier)() -> this.field_47724,
            (Supplier<String>)() -> var5,
            (LongSupplier)() -> this.field_47735 && var9 != null ? var9.method_9697() : 0L
         );
      }

      if (var9 == null) {
         int[] var12 = new int[1];
         int[] var11 = new int[1];
         GLFW.glfwGetWindowPos(this.field_47716, var12, var11);
         this.field_47739 = this.field_47722 = var12[0];
         this.field_47723 = this.field_47713 = var11[0];
      } else {
         class_5722 var13 = var9.method_9696(!this.field_47735 ? Optional.<class_5722>empty() : this.field_47717);
         this.field_47739 = this.field_47722 = var9.method_9694() + var13.method_25883() / 2 - this.field_47736 / 2;
         this.field_47723 = this.field_47713 = var9.method_9703() + var13.method_25885() / 2 - this.field_47724 / 2;
      }

      GLFW.glfwMakeContextCurrent(this.field_47716);
      GL.createCapabilities();
      this.method_43188();
      this.method_43195();
      GLFW.glfwSetFramebufferSizeCallback(this.field_47716, this::method_43158);
      GLFW.glfwSetWindowPosCallback(this.field_47716, this::method_43170);
      GLFW.glfwSetWindowSizeCallback(this.field_47716, this::method_43155);
      GLFW.glfwSetWindowFocusCallback(this.field_47716, this::method_43173);
      GLFW.glfwSetCursorEnterCallback(this.field_47716, this::method_43159);
   }

   public int method_43197() {
      class_3542.method_16431(class_3542::method_16366);
      return class_3776.method_17493(this);
   }

   public boolean method_43187() {
      return class_3776.method_17492(this);
   }

   public static void method_43167(BiConsumer<Integer, String> var0) {
      class_3542.method_16431(class_3542::method_16395);
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
      class_3542.method_16431(class_3542::method_16395);

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
            GLFW.glfwSetWindowIcon(this.field_47716, var10);
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
         field_47718.error("Couldn't set icon", var23);
      }
   }

   @Nullable
   private ByteBuffer method_43180(InputStream var1, IntBuffer var2, IntBuffer var3, IntBuffer var4) throws IOException {
      class_3542.method_16431(class_3542::method_16395);
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
      class_3542.method_16431(class_3542::method_16395);
      GLFW.glfwSetErrorCallback(Window::method_43196);
   }

   private static void method_43196(int var0, long var1) {
      class_3542.method_16431(class_3542::method_16395);
      String var5 = "GLFW error " + var0 + ": " + MemoryUtil.memUTF8(var1);
      TinyFileDialogs.tinyfd_messageBox(
         "Minecraft", var5 + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).", "ok", "error", false
      );
      throw new class_9489(var5, null);
   }

   public void method_43190(int var1, long var2) {
      class_3542.method_16431(class_3542::method_16366);
      String var6 = MemoryUtil.memUTF8(var2);
      field_47718.error("########## GL ERROR ##########");
      field_47718.error("@ {}", this.field_47727);
      field_47718.error("{}: {}", var1, var6);
   }

   public void method_43172() {
      GLFWErrorCallback var3 = GLFW.glfwSetErrorCallback(this.field_47714);
      if (var3 != null) {
         var3.free();
      }

      class_5525.method_25088();
   }

   public void method_43162(boolean var1) {
      class_3542.method_16431(class_3542::method_16440);
      this.field_47732 = var1;
      GLFW.glfwSwapInterval(!var1 ? 0 : 1);
   }

   @Override
   public void close() {
      class_3542.method_16431(class_3542::method_16366);
      this.field_47728 = true;
      Callbacks.glfwFreeCallbacks(this.field_47716);
      this.field_47714.close();
      GLFW.glfwDestroyWindow(this.field_47716);
      GLFW.glfwTerminate();
   }

   private void method_43170(long var1, int var3, int var4) {
      this.field_47722 = var3;
      this.field_47713 = var4;
   }

   private void method_43158(long var1, int var3, int var4) {
      if (var1 == this.field_47716) {
         int var7 = this.method_43178();
         int var8 = this.method_43198();
         if (var3 != 0 && var4 != 0) {
            this.field_47725 = var3;
            this.field_47729 = var4;
            if (this.method_43178() != var7 || this.method_43198() != var8) {
               this.field_47731.method_32777();
            }
         }
      }
   }

   private void method_43195() {
      class_3542.method_16431(class_3542::method_16395);
      int[] var3 = new int[1];
      int[] var4 = new int[1];
      GLFW.glfwGetFramebufferSize(this.field_47716, var3, var4);
      this.field_47725 = var3[0];
      this.field_47729 = var4[0];
   }

   private void method_43155(long var1, int var3, int var4) {
      this.field_47736 = var3;
      this.field_47724 = var4;
      SigmaMainClass.getInstance().getGUIManager().method_30991();
   }

   private void method_43173(long var1, boolean var3) {
      if (var1 == this.field_47716) {
         this.field_47731.method_32778(var3);
      }
   }

   private void method_43159(long var1, boolean var3) {
      if (var3) {
         this.field_47731.method_32779();
      }
   }

   public void method_43194(int var1) {
      this.field_47738 = var1;
   }

   public int method_43186() {
      return this.field_47738;
   }

   public void method_43154() {
      class_3542.method_16415(this.field_47716);
      if (this.field_47735 != this.field_47726) {
         this.field_47726 = this.field_47735;
         this.method_43157(this.field_47732);
      }
   }

   public Optional<class_5722> method_43175() {
      return this.field_47717;
   }

   public void method_43179(Optional<class_5722> var1) {
      boolean var4 = !var1.equals(this.field_47717);
      this.field_47717 = var1;
      if (var4) {
         this.field_47721 = true;
      }
   }

   public void method_43160() {
      if (this.field_47735 && this.field_47721) {
         this.field_47721 = false;
         this.method_43188();
         this.field_47731.method_32777();
      }
   }

   private void method_43188() {
      class_3542.method_16431(class_3542::method_16395);
      boolean var3 = GLFW.glfwGetWindowMonitor(this.field_47716) != 0L;
      if (!this.field_47735) {
         this.field_47722 = this.field_47739;
         this.field_47713 = this.field_47723;
         this.field_47736 = this.field_47720;
         this.field_47724 = this.field_47730;
         GLFW.glfwSetWindowMonitor(this.field_47716, 0L, this.field_47722, this.field_47713, this.field_47736, this.field_47724, -1);
      } else {
         class_2078 var4 = this.field_47734.method_36022(this);
         if (var4 != null) {
            class_5722 var5 = var4.method_9696(this.field_47717);
            if (!var3) {
               this.field_47739 = this.field_47722;
               this.field_47723 = this.field_47713;
               this.field_47720 = this.field_47736;
               this.field_47730 = this.field_47724;
            }

            this.field_47722 = 0;
            this.field_47713 = 0;
            this.field_47736 = var5.method_25883();
            this.field_47724 = var5.method_25885();
            GLFW.glfwSetWindowMonitor(
               this.field_47716, var4.method_9697(), this.field_47722, this.field_47713, this.field_47736, this.field_47724, var5.method_25887()
            );
         } else {
            field_47718.warn("Failed to find suitable monitor for fullscreen mode");
            this.field_47735 = false;
         }
      }
   }

   public void method_43156() {
      this.field_47735 = !this.field_47735;
   }

   private void method_43157(boolean var1) {
      class_3542.method_16431(class_3542::method_16366);

      try {
         this.method_43188();
         this.field_47731.method_32777();
         this.method_43162(var1);
         this.method_43154();
      } catch (Exception var5) {
         field_47718.error("Couldn't toggle fullscreen", var5);
      }
   }

   public int method_43164(int var1, boolean var2) {
      int var5 = 1;

      while (var5 != var1 && var5 < this.field_47725 && var5 < this.field_47729 && this.field_47725 / (var5 + 1) >= 320 && this.field_47729 / (var5 + 1) >= 240) {
         var5++;
      }

      if (var2 && var5 % 2 != 0) {
         var5++;
      }

      return var5;
   }

   public void method_43169(double var1) {
      this.field_47733 = var1;
      int var5 = (int)((double)this.field_47725 / var1);
      this.field_47715 = !((double)this.field_47725 / var1 > (double)var5) ? var5 : var5 + 1;
      int var6 = (int)((double)this.field_47729 / var1);
      this.field_47737 = !((double)this.field_47729 / var1 > (double)var6) ? var6 : var6 + 1;
   }

   public void method_43185(String var1) {
      GLFW.glfwSetWindowTitle(this.field_47716, var1);
   }

   public long method_43181() {
      return this.field_47716;
   }

   public boolean method_43174() {
      return this.field_47735;
   }

   public int method_43178() {
      return this.field_47725;
   }

   public int method_43198() {
      return this.field_47729;
   }

   public int method_43166() {
      return this.field_47736;
   }

   public int method_43163() {
      return this.field_47724;
   }

   public int method_43165() {
      return this.field_47715;
   }

   public int method_43177() {
      return this.field_47737;
   }

   public int method_43171() {
      return this.field_47722;
   }

   public int method_43184() {
      return this.field_47713;
   }

   public double method_43189() {
      return this.field_47733;
   }

   @Nullable
   public class_2078 method_43192() {
      return this.field_47734.method_36022(this);
   }

   public void method_43176(boolean var1) {
      class_9732.method_44935(this.field_47716, var1);
   }

   public void method_43161(int var1, int var2) {
      this.method_43158(this.field_47716, var1, var2);
   }

   public boolean method_43168() {
      return this.field_47728;
   }
}
