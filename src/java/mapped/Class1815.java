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

public final class Class1815 implements AutoCloseable {
   private static final Logger field9784 = LogManager.getLogger();
   private final GLFWErrorCallback field9785 = GLFWErrorCallback.create(this::method8018);
   private final Class1643 field9786;
   private final Class9329 field9787;
   private final long field9788;
   private int field9789;
   private int field9790;
   private int field9791;
   private int field9792;
   private Optional<Class8737> field9793;
   private boolean field9794;
   private boolean field9795;
   private int field9796;
   private int field9797;
   private int field9798;
   private int field9799;
   private int field9800;
   private int field9801;
   private int field9802;
   private int field9803;
   private double field9804;
   private String field9805 = "";
   private boolean field9806;
   private int field9807;
   private boolean field9808;
   private boolean field9809;

   public Class1815(Class1643 var1, Class9329 var2, Class9790 var3, String var4, String var5) {
      RenderSystem.method27808(RenderSystem::method27809);
      this.field9787 = var2;
      this.method8016();
      this.method8015("Pre startup");
      this.field9786 = var1;
      Optional var8 = Class8737.method31535(var4);
      if (!var8.isPresent()) {
         if (var3.field45782.isPresent() && var3.field45783.isPresent()) {
            this.field9793 = Optional.<Class8737>of(new Class8737(var3.field45782.getAsInt(), var3.field45783.getAsInt(), 8, 8, 8, 60));
         } else {
            this.field9793 = Optional.<Class8737>empty();
         }
      } else {
         this.field9793 = var8;
      }

      this.field9795 = this.field9794 = var3.field45784;
      Class7513 var9 = var2.method35258(GLFW.glfwGetPrimaryMonitor());
      this.field9791 = this.field9798 = var3.field45780 <= 0 ? 1 : var3.field45780;
      this.field9792 = this.field9799 = var3.field45781 <= 0 ? 1 : var3.field45781;
      GLFW.glfwDefaultWindowHints();
      GuiManager.method33475();
      if (Class7944.method26892()) {
         GLFW.glfwWindowHint(135181, Class7944.method26891());
      }

      GLFW.glfwWindowHint(139265, 196609);
      GLFW.glfwWindowHint(139275, 221185);
      GLFW.glfwWindowHint(139266, 2);
      GLFW.glfwWindowHint(139267, 0);
      GLFW.glfwWindowHint(139272, 0);
      if (!Class9299.field42792.method20214()) {
         this.field9788 = GLFW.glfwCreateWindow(this.field9798, this.field9799, var5, this.field9794 && var9 != null ? var9.method24493() : 0L, 0L);
      } else {
         Object var10 = Class9299.method35071(Class9299.field42791);
         this.field9788 = Class9299.method35066(
            var10,
            Class9299.field42792,
            (IntSupplier)() -> this.field9798,
            (IntSupplier)() -> this.field9799,
            (Supplier<String>)() -> var5,
            (LongSupplier)() -> this.field9794 && var9 != null ? var9.method24493() : 0L
         );
      }

      if (var9 == null) {
         int[] var12 = new int[1];
         int[] var11 = new int[1];
         GLFW.glfwGetWindowPos(this.field9788, var12, var11);
         this.field9789 = this.field9796 = var12[0];
         this.field9790 = this.field9797 = var11[0];
      } else {
         Class8737 var13 = var9.method24486(!this.field9794 ? Optional.<Class8737>empty() : this.field9793);
         this.field9789 = this.field9796 = var9.method24489() + var13.method31529() / 2 - this.field9798 / 2;
         this.field9790 = this.field9797 = var9.method24490() + var13.method31530() / 2 - this.field9799 / 2;
      }

      GLFW.glfwMakeContextCurrent(this.field9788);
      GL.createCapabilities();
      this.method8033();
      this.method8023();
      GLFW.glfwSetFramebufferSizeCallback(this.field9788, this::method8022);
      GLFW.glfwSetWindowPosCallback(this.field9788, this::method8021);
      GLFW.glfwSetWindowSizeCallback(this.field9788, this::method8024);
      GLFW.glfwSetWindowFocusCallback(this.field9788, this::method8025);
      GLFW.glfwSetCursorEnterCallback(this.field9788, this::method8026);
   }

   public int method8010() {
      RenderSystem.method27808(RenderSystem::method27803);
      return Class8157.method28296(this);
   }

   public boolean method8011() {
      return Class8157.method28300(this);
   }

   public static void method8012(BiConsumer<Integer, String> var0) {
      RenderSystem.method27808(RenderSystem::method27809);
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

   public void method8013(InputStream var1, InputStream var2) {
      RenderSystem.method27808(RenderSystem::method27809);

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
            GLFW.glfwSetWindowIcon(this.field9788, var10);
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
         field9784.error("Couldn't set icon", var23);
      }
   }

   @Nullable
   private ByteBuffer method8014(InputStream var1, IntBuffer var2, IntBuffer var3, IntBuffer var4) throws IOException {
      RenderSystem.method27808(RenderSystem::method27809);
      ByteBuffer var7 = null;

      ByteBuffer var8;
      try {
         var7 = Class8535.method30373(var1);
         ((java.nio.Buffer)var7).rewind();
         var8 = STBImage.stbi_load_from_memory(var7, var2, var3, var4, 0);
      } finally {
         if (var7 != null) {
            MemoryUtil.memFree(var7);
         }
      }

      return var8;
   }

   public void method8015(String var1) {
      this.field9805 = var1;
      if (var1.equals("Startup")) {
         Class8684.method31269();
      }
   }

   private void method8016() {
      RenderSystem.method27808(RenderSystem::method27809);
      GLFW.glfwSetErrorCallback(Class1815::method8017);
   }

   private static void method8017(int var0, long var1) {
      RenderSystem.method27808(RenderSystem::method27809);
      String var5 = "GLFW error " + var0 + ": " + MemoryUtil.memUTF8(var1);
      TinyFileDialogs.tinyfd_messageBox(
         "Minecraft", var5 + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).", "ok", "error", false
      );
      throw new Class2473(var5);
   }

   public void method8018(int var1, long var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      String var6 = MemoryUtil.memUTF8(var2);
      field9784.error("########## GL ERROR ##########");
      field9784.error("@ {}", this.field9805);
      field9784.error("{}: {}", var1, var6);
   }

   public void method8019() {
      GLFWErrorCallback var3 = GLFW.glfwSetErrorCallback(this.field9785);
      if (var3 != null) {
         var3.free();
      }

      Class8684.method31268();
   }

   public void method8020(boolean var1) {
      RenderSystem.method27808(RenderSystem::method27804);
      this.field9808 = var1;
      GLFW.glfwSwapInterval(!var1 ? 0 : 1);
   }

   @Override
   public void close() {
      RenderSystem.method27808(RenderSystem::method27803);
      this.field9809 = true;
      Callbacks.glfwFreeCallbacks(this.field9788);
      this.field9785.close();
      GLFW.glfwDestroyWindow(this.field9788);
      GLFW.glfwTerminate();
   }

   private void method8021(long var1, int var3, int var4) {
      this.field9796 = var3;
      this.field9797 = var4;
   }

   private void method8022(long var1, int var3, int var4) {
      if (var1 == this.field9788) {
         int var7 = this.method8041();
         int var8 = this.method8042();
         if (var3 != 0 && var4 != 0) {
            this.field9800 = var3;
            this.field9801 = var4;
            if (this.method8041() != var7 || this.method8042() != var8) {
               this.field9786.method1481();
            }
         }
      }
   }

   private void method8023() {
      RenderSystem.method27808(RenderSystem::method27809);
      int[] var3 = new int[1];
      int[] var4 = new int[1];
      GLFW.glfwGetFramebufferSize(this.field9788, var3, var4);
      this.field9800 = var3[0];
      this.field9801 = var4[0];
   }

   private void method8024(long var1, int var3, int var4) {
      this.field9798 = var3;
      this.field9799 = var4;
      Client.getInstance().getGuiManager().method33479();
   }

   private void method8025(long var1, boolean var3) {
      if (var1 == this.field9788) {
         this.field9786.method1573(var3);
      }
   }

   private void method8026(long var1, boolean var3) {
      if (var3) {
         this.field9786.method1482();
      }
   }

   public void method8027(int var1) {
      this.field9807 = var1;
   }

   public int method8028() {
      return this.field9807;
   }

   public void method8029() {
      RenderSystem.method27811(this.field9788);
      if (this.field9794 != this.field9795) {
         this.field9795 = this.field9794;
         this.method8035(this.field9808);
      }
   }

   public Optional<Class8737> method8030() {
      return this.field9793;
   }

   public void method8031(Optional<Class8737> var1) {
      boolean var4 = !var1.equals(this.field9793);
      this.field9793 = var1;
      if (var4) {
         this.field9806 = true;
      }
   }

   public void method8032() {
      if (this.field9794 && this.field9806) {
         this.field9806 = false;
         this.method8033();
         this.field9786.method1481();
      }
   }

   private void method8033() {
      RenderSystem.method27808(RenderSystem::method27809);
      boolean var3 = GLFW.glfwGetWindowMonitor(this.field9788) != 0L;
      if (!this.field9794) {
         this.field9796 = this.field9789;
         this.field9797 = this.field9790;
         this.field9798 = this.field9791;
         this.field9799 = this.field9792;
         GLFW.glfwSetWindowMonitor(this.field9788, 0L, this.field9796, this.field9797, this.field9798, this.field9799, -1);
      } else {
         Class7513 var4 = this.field9787.method35259(this);
         if (var4 != null) {
            Class8737 var5 = var4.method24486(this.field9793);
            if (!var3) {
               this.field9789 = this.field9796;
               this.field9790 = this.field9797;
               this.field9791 = this.field9798;
               this.field9792 = this.field9799;
            }

            this.field9796 = 0;
            this.field9797 = 0;
            this.field9798 = var5.method31529();
            this.field9799 = var5.method31530();
            GLFW.glfwSetWindowMonitor(this.field9788, var4.method24493(), this.field9796, this.field9797, this.field9798, this.field9799, var5.method31534());
         } else {
            field9784.warn("Failed to find suitable monitor for fullscreen mode");
            this.field9794 = false;
         }
      }
   }

   public void method8034() {
      this.field9794 = !this.field9794;
   }

   private void method8035(boolean var1) {
      RenderSystem.method27808(RenderSystem::method27803);

      try {
         this.method8033();
         this.field9786.method1481();
         this.method8020(var1);
         this.method8029();
      } catch (Exception var5) {
         field9784.error("Couldn't toggle fullscreen", var5);
      }
   }

   public int method8036(int var1, boolean var2) {
      int var5 = 1;

      while (var5 != var1 && var5 < this.field9800 && var5 < this.field9801 && this.field9800 / (var5 + 1) >= 320 && this.field9801 / (var5 + 1) >= 240) {
         var5++;
      }

      if (var2 && var5 % 2 != 0) {
         var5++;
      }

      return var5;
   }

   public void method8037(double var1) {
      this.field9804 = var1;
      int var5 = (int)((double)this.field9800 / var1);
      this.field9802 = !((double)this.field9800 / var1 > (double)var5) ? var5 : var5 + 1;
      int var6 = (int)((double)this.field9801 / var1);
      this.field9803 = !((double)this.field9801 / var1 > (double)var6) ? var6 : var6 + 1;
   }

   public void method8038(String var1) {
      GLFW.glfwSetWindowTitle(this.field9788, var1);
   }

   public long method8039() {
      return this.field9788;
   }

   public boolean method8040() {
      return this.field9794;
   }

   public int method8041() {
      return this.field9800;
   }

   public int method8042() {
      return this.field9801;
   }

   public int method8043() {
      return this.field9798;
   }

   public int method8044() {
      return this.field9799;
   }

   public int method8045() {
      return this.field9802;
   }

   public int method8046() {
      return this.field9803;
   }

   public int method8047() {
      return this.field9796;
   }

   public int method8048() {
      return this.field9797;
   }

   public double method8049() {
      return this.field9804;
   }

   @Nullable
   public Class7513 method8050() {
      return this.field9787.method35259(this);
   }

   public void method8051(boolean var1) {
      Class9798.method38644(this.field9788, var1);
   }

   public void method8052(int var1, int var2) {
      this.method8022(this.field9788, var1, var2);
   }

   public boolean method8053() {
      return this.field9809;
   }
}
