package remapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWMonitorCallback;
import org.lwjgl.glfw.GLFWMonitorCallbackI;

public class class_7962 {
   private static String[] field_40794;
   private final Long2ObjectMap<class_2078> field_40793 = new Long2ObjectOpenHashMap();
   private final class_1551 field_40792;

   public class_7962(class_1551 var1) {
      RenderSystem.method_16431(RenderSystem::method_16395);
      this.field_40792 = var1;
      GLFW.glfwSetMonitorCallback(this::method_36020);
      PointerBuffer var4 = GLFW.glfwGetMonitors();
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.limit(); var5++) {
            long var6 = var4.get(var5);
            this.field_40793.put(var6, var1.method_7063(var6));
         }
      }
   }

   private void method_36020(long var1, int var3) {
      RenderSystem.method_16431(RenderSystem::method_16366);
      if (var3 != 262145) {
         if (var3 == 262146) {
            this.field_40793.remove(var1);
         }
      } else {
         this.field_40793.put(var1, this.field_40792.method_7063(var1));
      }
   }

   @Nullable
   public class_2078 method_36021(long var1) {
      RenderSystem.method_16431(RenderSystem::method_16395);
      return (class_2078)this.field_40793.get(var1);
   }

   @Nullable
   public class_2078 method_36022(Window var1) {
      long var4 = GLFW.glfwGetWindowMonitor(var1.method_43181());
      if (var4 == 0L) {
         int var6 = var1.method_43171();
         int var7 = var6 + var1.method_43166();
         int var8 = var1.method_43184();
         int var9 = var8 + var1.method_43163();
         int var10 = -1;
         class_2078 var11 = null;
         ObjectIterator var12 = this.field_40793.values().iterator();

         while (var12.hasNext()) {
            class_2078 var13 = (class_2078)var12.next();
            int var14 = var13.method_9694();
            int var15 = var14 + var13.method_9702().method_25883();
            int var16 = var13.method_9703();
            int var17 = var16 + var13.method_9702().method_25885();
            int var18 = method_36024(var6, var14, var15);
            int var19 = method_36024(var7, var14, var15);
            int var20 = method_36024(var8, var16, var17);
            int var21 = method_36024(var9, var16, var17);
            int var22 = Math.max(0, var19 - var18);
            int var23 = Math.max(0, var21 - var20);
            int var24 = var22 * var23;
            if (var24 > var10) {
               var11 = var13;
               var10 = var24;
            }
         }

         return var11;
      } else {
         return this.method_36021(var4);
      }
   }

   public static int method_36024(int var0, int var1, int var2) {
      if (var0 >= var1) {
         return var0 <= var2 ? var0 : var2;
      } else {
         return var1;
      }
   }

   public void method_36025() {
      RenderSystem.method_16431(RenderSystem::method_16366);
      GLFWMonitorCallback var3 = GLFW.glfwSetMonitorCallback((GLFWMonitorCallbackI)null);
      if (var3 != null) {
         var3.free();
      }
   }
}
