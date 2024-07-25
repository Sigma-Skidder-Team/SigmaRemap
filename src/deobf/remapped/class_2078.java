package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class class_2078 {
   private final long field_10461;
   private final List<class_5722> field_10462;
   private class_5722 field_10457;
   private int field_10460;
   private int field_10459;

   public class_2078(long var1) {
      this.field_10461 = var1;
      this.field_10462 = Lists.newArrayList();
      this.method_9699();
   }

   public void method_9699() {
      class_3542.method_16431(class_3542::method_16395);
      this.field_10462.clear();
      Buffer var3 = GLFW.glfwGetVideoModes(this.field_10461);
      GLFWVidMode var4 = GLFW.glfwGetVideoMode(this.field_10461);
      class_5722 var5 = new class_5722(var4);
      ArrayList var6 = new ArrayList();

      for (int var7 = var3.limit() - 1; var7 >= 0; var7--) {
         var3.position(var7);
         class_5722 var8 = new class_5722(var3);
         if (var8.method_25886() >= 8 && var8.method_25884() >= 8 && var8.method_25890() >= 8) {
            if (var8.method_25887() >= var5.method_25887()) {
               this.field_10462.add(var8);
            } else {
               var6.add(var8);
            }
         }
      }

      var6.sort(new class_259().reversed());

      for (class_5722 var12 : var6) {
         if (method_9700(this.field_10462, var12.method_25883(), var12.method_25885()) == null) {
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
      this.field_10457 = new class_5722(var9);
   }

   public class_5722 method_9696(Optional<class_5722> var1) {
      class_3542.method_16431(class_3542::method_16395);
      if (var1.isPresent()) {
         class_5722 var4 = (class_5722)var1.get();

         for (class_5722 var6 : this.field_10462) {
            if (var6.equals(var4)) {
               return var6;
            }
         }
      }

      return this.method_9702();
   }

   public int method_9704(class_5722 var1) {
      class_3542.method_16431(class_3542::method_16395);
      return this.field_10462.indexOf(var1);
   }

   public class_5722 method_9702() {
      return this.field_10457;
   }

   public int method_9694() {
      return this.field_10460;
   }

   public int method_9703() {
      return this.field_10459;
   }

   public class_5722 method_9695(int var1) {
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

   public static class_5722 method_9700(List<class_5722> var0, int var1, int var2) {
      for (class_5722 var6 : var0) {
         if (var6.method_25883() == var1 && var6.method_25885() == var2) {
            return var6;
         }
      }

      return null;
   }
}
