package remapped;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWCharModsCallbackI;
import org.lwjgl.glfw.GLFWCursorPosCallbackI;
import org.lwjgl.glfw.GLFWDropCallbackI;
import org.lwjgl.glfw.GLFWKeyCallbackI;
import org.lwjgl.glfw.GLFWMouseButtonCallbackI;
import org.lwjgl.glfw.GLFWScrollCallbackI;

public class class_9732 {
   private static final MethodHandle field_49458;
   private static final int field_49457;
   public static final class_3654 field_49455;

   public static class_3654 method_44940(int var0, int var1) {
      return var0 != -1 ? class_8863.field_45319.method_40758(var0) : class_8863.field_45315.method_40758(var1);
   }

   public static class_3654 method_44939(String var0) {
      if (class_3654.field_17801.containsKey(var0)) {
         return class_3654.field_17801.get(var0);
      } else {
         for (class_8863 var6 : class_8863.values()) {
            if (var0.startsWith(class_8863.method_40757(var6))) {
               String var7 = var0.substring(class_8863.method_40757(var6).length() + 1);
               return var6.method_40758(Integer.parseInt(var7));
            }
         }

         throw new IllegalArgumentException("Unknown key name: " + var0);
      }
   }

   public static boolean method_44934(long var0, int var2) {
      return GLFW.glfwGetKey(var0, var2) == 1;
   }

   public static void method_44942(long var0, GLFWKeyCallbackI var2, GLFWCharModsCallbackI var3) {
      GLFW.glfwSetKeyCallback(var0, var2);
      GLFW.glfwSetCharModsCallback(var0, var3);
   }

   public static void method_44941(long var0, GLFWCursorPosCallbackI var2, GLFWMouseButtonCallbackI var3, GLFWScrollCallbackI var4, GLFWDropCallbackI var5) {
      GLFW.glfwSetCursorPosCallback(var0, var2);
      GLFW.glfwSetMouseButtonCallback(var0, var3);
      GLFW.glfwSetScrollCallback(var0, var4);
      GLFW.glfwSetDropCallback(var0, var5);
   }

   public static void method_44937(long var0, int var2, double var3, double var5) {
      GLFW.glfwSetCursorPos(var0, var3, var5);
      GLFW.glfwSetInputMode(var0, 208897, var2);
   }

   public static boolean method_44938() {
      try {
         return field_49458 != null && (boolean)field_49458.invokeExact();
      } catch (Throwable var3) {
         throw new RuntimeException(var3);
      }
   }

   public static void method_44935(long var0, boolean var2) {
      if (method_44938()) {
         GLFW.glfwSetInputMode(var0, field_49457, !var2 ? 0 : 1);
      }
   }

   static {
      Lookup var6 = MethodHandles.lookup();
      MethodType var7 = MethodType.methodType(boolean.class);
      MethodHandle var8 = null;
      int var9 = 0;

      try {
         var8 = var6.findStatic(GLFW.class, "glfwRawMouseMotionSupported", var7);
         MethodHandle var10 = var6.findStaticGetter(GLFW.class, "GLFW_RAW_MOUSE_MOTION", int.class);
         var9 = (int)var10.invokeExact();
      } catch (NoSuchMethodException | NoSuchFieldException var11) {
      } catch (Throwable var12) {
         throw new RuntimeException(var12);
      }

      field_49458 = var8;
      field_49457 = var9;
      field_49455 = class_8863.field_45319.method_40758(-1);
   }
}
