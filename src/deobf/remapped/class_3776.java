package remapped;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
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

public class class_3776 {
   private static final Logger field_18439 = LogManager.getLogger();
   private static String field_18438 = "";
   private static String field_18436;
   private static final Map<Integer, String> field_18435 = method_17484(Maps.newHashMap(), var0 -> {
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

   public static String method_17479() {
      class_3542.method_16431(class_3542::method_16366);
      return GLFW.glfwGetCurrentContext() != 0L
         ? class_1920.method_8928(7937) + " GL version " + class_1920.method_8928(7938) + ", " + class_1920.method_8928(7936)
         : "NO CONTEXT";
   }

   public static int method_17493(class_9352 var0) {
      class_3542.method_16431(class_3542::method_16366);
      long var3 = GLFW.glfwGetWindowMonitor(var0.method_43181());
      if (var3 == 0L) {
         var3 = GLFW.glfwGetPrimaryMonitor();
      }

      GLFWVidMode var5 = var3 != 0L ? GLFW.glfwGetVideoMode(var3) : null;
      return var5 != null ? var5.refreshRate() : 0;
   }

   public static String method_17478() {
      class_3542.method_16431(class_3542::method_16395);
      return Version.getVersion();
   }

   public static LongSupplier method_17488() {
      class_3542.method_16431(class_3542::method_16395);
      class_9352.method_43167((var0, var1) -> {
         throw new IllegalStateException(String.format("GLFW error before init: [0x%X]%s", var0, var1));
      });
      ArrayList var2 = Lists.newArrayList();
      GLFWErrorCallback var3 = GLFW.glfwSetErrorCallback((var1, var2x) -> var2.add(String.format("GLFW error during init: [0x%X]%s", var1, var2x)));
      if (!GLFW.glfwInit()) {
         throw new IllegalStateException("Failed to initialize GLFW, errors: " + Joiner.on(",").join(var2));
      } else {
         LongSupplier var4 = () -> (long)(GLFW.glfwGetTime() * 1.0E9);

         for (String var6 : var2) {
            field_18439.error("GLFW error collected during initialization: {}", var6);
         }

         class_3542.method_16416(var3);
         return var4;
      }
   }

   public static void method_17489(GLFWErrorCallbackI var0) {
      class_3542.method_16431(class_3542::method_16395);
      GLFWErrorCallback var3 = GLFW.glfwSetErrorCallback(var0);
      if (var3 != null) {
         var3.free();
      }
   }

   public static boolean method_17492(class_9352 var0) {
      return GLFW.glfwWindowShouldClose(var0.method_43181());
   }

   public static void method_17490() {
      class_3542.method_16431(class_3542::method_16366);
      if (GL.getCapabilities().GL_NV_fog_distance) {
         if (class_3111.method_14324()) {
            class_1920.method_8768(34138, 34139);
         }

         if (class_3111.method_14296()) {
            class_1920.method_8768(34138, 34140);
         }
      }
   }

   public static void method_17494(int var0, boolean var1) {
      class_3542.method_16431(class_3542::method_16395);
      GLCapabilities var4 = GL.getCapabilities();
      field_18438 = "Using framebuffer using " + class_1920.method_8902(var4);

      try {
         Processor[] var5 = new SystemInfo().getHardware().getProcessors();
         field_18436 = String.format("%dx %s", var5.length, var5[0]).replaceAll("\\s+", " ");
      } catch (Throwable var6) {
      }

      class_2262.method_10390(var0, var1);
   }

   public static String method_17481() {
      return field_18438;
   }

   public static String method_17483() {
      return field_18436 != null ? field_18436 : "<unknown>";
   }

   public static void method_17480(int var0, boolean var1, boolean var2, boolean var3) {
      class_3542.method_16431(class_3542::method_16366);
      class_1920.method_8848();
      class_1920.method_8867(false);
      class_8042 var6 = class_3542.method_16373();
      class_9633 var7 = var6.method_36501();
      GL11.glLineWidth(4.0F);
      var7.method_44471(1, class_7985.field_40903);
      if (var1) {
         var7.method_35761(0.0, 0.0, 0.0).method_35743(0, 0, 0, 255).method_35735();
         var7.method_35761((double)var0, 0.0, 0.0).method_35743(0, 0, 0, 255).method_35735();
      }

      if (var2) {
         var7.method_35761(0.0, 0.0, 0.0).method_35743(0, 0, 0, 255).method_35735();
         var7.method_35761(0.0, (double)var0, 0.0).method_35743(0, 0, 0, 255).method_35735();
      }

      if (var3) {
         var7.method_35761(0.0, 0.0, 0.0).method_35743(0, 0, 0, 255).method_35735();
         var7.method_35761(0.0, 0.0, (double)var0).method_35743(0, 0, 0, 255).method_35735();
      }

      var6.method_36500();
      GL11.glLineWidth(2.0F);
      var7.method_44471(1, class_7985.field_40903);
      if (var1) {
         var7.method_35761(0.0, 0.0, 0.0).method_35743(255, 0, 0, 255).method_35735();
         var7.method_35761((double)var0, 0.0, 0.0).method_35743(255, 0, 0, 255).method_35735();
      }

      if (var2) {
         var7.method_35761(0.0, 0.0, 0.0).method_35743(0, 255, 0, 255).method_35735();
         var7.method_35761(0.0, (double)var0, 0.0).method_35743(0, 255, 0, 255).method_35735();
      }

      if (var3) {
         var7.method_35761(0.0, 0.0, 0.0).method_35743(127, 127, 255, 255).method_35735();
         var7.method_35761(0.0, 0.0, (double)var0).method_35743(127, 127, 255, 255).method_35735();
      }

      var6.method_36500();
      GL11.glLineWidth(1.0F);
      class_1920.method_8867(true);
      class_1920.method_8843();
   }

   public static String method_17491(int var0) {
      return field_18435.get(var0);
   }

   public static <T> T method_17485(Supplier<T> var0) {
      return (T)var0.get();
   }

   public static <T> T method_17484(T var0, Consumer<T> var1) {
      var1.accept(var0);
      return (T)var0;
   }

   public static boolean method_17487() {
      return true;
   }

   public static boolean method_17486() {
      return true;
   }
}
