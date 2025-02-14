package mapped;

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

public class InputMappings {
   private static final MethodHandle field45817;
   private static final int field45818;
   public static final InputMappingsInput INPUT_INVALID;

   public static InputMappingsInput method38637(int var0, int var1) {
      return var0 != -1 ? InputMappingsType.KEYSYM.method8197(var0) : InputMappingsType.SCANCODE.method8197(var1);
   }

   public static InputMappingsInput method38638(String var0) {
      if (InputMappingsInput.REGISTRY.containsKey(var0)) {
         return InputMappingsInput.REGISTRY.get(var0);
      } else {
         for (InputMappingsType var6 : InputMappingsType.values()) {
            if (var0.startsWith(InputMappingsType.method8202(var6))) {
               String var7 = var0.substring(InputMappingsType.method8202(var6).length() + 1);
               return var6.method8197(Integer.parseInt(var7));
            }
         }

         throw new IllegalArgumentException("Unknown key name: " + var0);
      }
   }

   public static boolean isKeyDown(long var0, int var2) {
      return GLFW.glfwGetKey(var0, var2) == 1;
   }

   public static void method38640(long var0, GLFWKeyCallbackI var2, GLFWCharModsCallbackI var3) {
      GLFW.glfwSetKeyCallback(var0, var2);
      GLFW.glfwSetCharModsCallback(var0, var3);
   }

   public static void method38641(long var0, GLFWCursorPosCallbackI var2, GLFWMouseButtonCallbackI var3, GLFWScrollCallbackI var4, GLFWDropCallbackI var5) {
      GLFW.glfwSetCursorPosCallback(var0, var2);
      GLFW.glfwSetMouseButtonCallback(var0, var3);
      GLFW.glfwSetScrollCallback(var0, var4);
      GLFW.glfwSetDropCallback(var0, var5);
   }

   public static void method38642(long var0, int var2, double var3, double var5) {
      GLFW.glfwSetCursorPos(var0, var3, var5);
      GLFW.glfwSetInputMode(var0, 208897, var2);
   }

   public static boolean method38643() {
      try {
         return field45817 != null && (boolean)field45817.invokeExact();
      } catch (Throwable var3) {
         throw new RuntimeException(var3);
      }
   }

   public static void method38644(long var0, boolean var2) {
      if (method38643()) {
         GLFW.glfwSetInputMode(var0, field45818, !var2 ? 0 : 1);
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

      field45817 = var8;
      field45818 = var9;
      INPUT_INVALID = InputMappingsType.KEYSYM.method8197(-1);
   }
}
