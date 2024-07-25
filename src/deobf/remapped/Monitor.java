package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class Monitor {
   private final long field_10461;
   private final List<VideoMode> field_10462;
   private VideoMode field_10457;
   private int field_10460;
   private int field_10459;

   public Monitor(long var1) {
      this.field_10461 = var1;
      this.field_10462 = Lists.newArrayList();
      this.method_9699();
   }

   public void method_9699() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      this.field_10462.clear();
      Buffer var3 = GLFW.glfwGetVideoModes(this.field_10461);
      GLFWVidMode var4 = GLFW.glfwGetVideoMode(this.field_10461);
      VideoMode var5 = new VideoMode(var4);
      ArrayList var6 = new ArrayList();

      for (int var7 = var3.limit() - 1; var7 >= 0; var7--) {
         var3.position(var7);
         VideoMode var8 = new VideoMode(var3);
         if (var8.method_25886() >= 8 && var8.method_25884() >= 8 && var8.method_25890() >= 8) {
            if (var8.getRefreshRate() >= var5.getRefreshRate()) {
               this.field_10462.add(var8);
            } else {
               var6.add(var8);
            }
         }
      }

      var6.sort(new class_259().reversed());

      for (VideoMode var12 : var6) {
         if (method_9700(this.field_10462, var12.getWidth(), var12.getHeight()) == null) {
            this.field_10462.add(var12);
         }
      }

      this.field_10462.sort(new class_259());
      int[] var11 = new int[1];
      int[] var13 = new int[1];
      GLFW.glfwGetMonitorPos(this.field_10461, var11, var13);
      this.field_10460 = var11[0];
      this.field_10459 = var13[0];
      GLFWVidMode var9 = GLFW.glfwGetVideoMode(this.field_10461);
      this.field_10457 = new VideoMode(var9);
   }

   public VideoMode getVideoModeOrDefault(Optional<VideoMode> var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      if (var1.isPresent()) {
         VideoMode var4 = (VideoMode)var1.get();

         for (VideoMode var6 : this.field_10462) {
            if (var6.equals(var4)) {
               return var6;
            }
         }
      }

      return this.method_9702();
   }

   public int method_9704(VideoMode var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      return this.field_10462.indexOf(var1);
   }

   public VideoMode method_9702() {
      return this.field_10457;
   }

   public int method_9694() {
      return this.field_10460;
   }

   public int method_9703() {
      return this.field_10459;
   }

   public VideoMode method_9695(int var1) {
      return this.field_10462.get(var1);
   }

   public int method_9701() {
      return this.field_10462.size();
   }

   public long method_9697() {
      return this.field_10461;
   }

   @Override
   public String toString() {
      return String.format("Monitor[%s %sx%s %s]", this.field_10461, this.field_10460, this.field_10459, this.field_10457);
   }

   public static VideoMode method_9700(List<VideoMode> var0, int var1, int var2) {
      for (VideoMode var6 : var0) {
         if (var6.getWidth() == var1 && var6.getHeight() == var2) {
            return var6;
         }
      }

      return null;
   }
}
