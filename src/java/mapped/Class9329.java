package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWMonitorCallback;
import org.lwjgl.glfw.GLFWMonitorCallbackI;

public class Class9329 {
   private static String[] field43292;
   private final Long2ObjectMap<Class7513> field43293 = new Long2ObjectOpenHashMap();
   private final Class7220 field43294;

   public Class9329(Class7220 var1) {
      RenderSystem.method27808(RenderSystem::method27809);
      this.field43294 = var1;
      GLFW.glfwSetMonitorCallback(this::method35257);
      PointerBuffer var4 = GLFW.glfwGetMonitors();
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.limit(); var5++) {
            long var6 = var4.get(var5);
            this.field43293.put(var6, var1.method22696(var6));
         }
      }
   }

   private void method35257(long var1, int var3) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var3 != 262145) {
         if (var3 == 262146) {
            this.field43293.remove(var1);
         }
      } else {
         this.field43293.put(var1, this.field43294.method22696(var1));
      }
   }

   @Nullable
   public Class7513 method35258(long var1) {
      RenderSystem.method27808(RenderSystem::method27809);
      return (Class7513)this.field43293.get(var1);
   }

   @Nullable
   public Class7513 method35259(Class1815 var1) {
      long var4 = GLFW.glfwGetWindowMonitor(var1.method8039());
      if (var4 == 0L) {
         int var6 = var1.method8047();
         int var7 = var6 + var1.method8043();
         int var8 = var1.method8048();
         int var9 = var8 + var1.method8044();
         int var10 = -1;
         Class7513 var11 = null;
         ObjectIterator var12 = this.field43293.values().iterator();

         while (var12.hasNext()) {
            Class7513 var13 = (Class7513)var12.next();
            int var14 = var13.method24489();
            int var15 = var14 + var13.method24488().method31529();
            int var16 = var13.method24490();
            int var17 = var16 + var13.method24488().method31530();
            int var18 = method35260(var6, var14, var15);
            int var19 = method35260(var7, var14, var15);
            int var20 = method35260(var8, var16, var17);
            int var21 = method35260(var9, var16, var17);
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
         return this.method35258(var4);
      }
   }

   public static int method35260(int var0, int var1, int var2) {
      if (var0 >= var1) {
         return var0 <= var2 ? var0 : var2;
      } else {
         return var1;
      }
   }

   public void method35261() {
      RenderSystem.method27808(RenderSystem::method27803);
      GLFWMonitorCallback var3 = GLFW.glfwSetMonitorCallback((GLFWMonitorCallbackI)null);
      if (var3 != null) {
         var3.free();
      }
   }
}
