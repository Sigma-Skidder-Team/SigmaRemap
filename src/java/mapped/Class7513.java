package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class Class7513 {
   private final long field32234;
   private final List<Class8737> field32235;
   private Class8737 field32236;
   private int field32237;
   private int field32238;

   public Class7513(long var1) {
      this.field32234 = var1;
      this.field32235 = Lists.newArrayList();
      this.method24485();
   }

   public void method24485() {
      RenderSystem.method27808(RenderSystem::method27809);
      this.field32235.clear();
      Buffer var3 = GLFW.glfwGetVideoModes(this.field32234);
      GLFWVidMode var4 = GLFW.glfwGetVideoMode(this.field32234);
      Class8737 var5 = new Class8737(var4);
      List<Class8737> var6 = new ArrayList();

      for (int var7 = var3.limit() - 1; var7 >= 0; var7--) {
         var3.position(var7);
         Class8737 var8 = new Class8737(var3);
         if (var8.method31531() >= 8 && var8.method31532() >= 8 && var8.method31533() >= 8) {
            if (var8.method31534() >= var5.method31534()) {
               this.field32235.add(var8);
            } else {
               var6.add(var8);
            }
         }
      }

      var6.sort(new Class3611().reversed());

      for (Class8737 var12 : var6) {
         if (method24494(this.field32235, var12.method31529(), var12.method31530()) == null) {
            this.field32235.add(var12);
         }
      }

      this.field32235.sort(new Class3611());
      int[] var11 = new int[1];
      int[] var13 = new int[1];
      GLFW.glfwGetMonitorPos(this.field32234, var11, var13);
      this.field32237 = var11[0];
      this.field32238 = var13[0];
      GLFWVidMode var9 = GLFW.glfwGetVideoMode(this.field32234);
      this.field32236 = new Class8737(var9);
   }

   public Class8737 method24486(Optional<Class8737> var1) {
      RenderSystem.method27808(RenderSystem::method27809);
      if (var1.isPresent()) {
         Class8737 var4 = (Class8737)var1.get();

         for (Class8737 var6 : this.field32235) {
            if (var6.equals(var4)) {
               return var6;
            }
         }
      }

      return this.method24488();
   }

   public int method24487(Class8737 var1) {
      RenderSystem.method27808(RenderSystem::method27809);
      return this.field32235.indexOf(var1);
   }

   public Class8737 method24488() {
      return this.field32236;
   }

   public int method24489() {
      return this.field32237;
   }

   public int method24490() {
      return this.field32238;
   }

   public Class8737 method24491(int var1) {
      return this.field32235.get(var1);
   }

   public int method24492() {
      return this.field32235.size();
   }

   public long method24493() {
      return this.field32234;
   }

   @Override
   public String toString() {
      return String.format("Monitor[%s %sx%s %s]", this.field32234, this.field32237, this.field32238, this.field32236);
   }

   public static Class8737 method24494(List<Class8737> var0, int var1, int var2) {
      for (Class8737 var6 : var0) {
         if (var6.method31529() == var1 && var6.method31530() == var2) {
            return var6;
         }
      }

      return null;
   }
}
