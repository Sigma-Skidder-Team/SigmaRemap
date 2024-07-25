package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.stream.IntStream;
import org.lwjgl.opengl.ARBCopyBuffer;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.EXTFramebufferBlit;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.system.MemoryUtil;

public class class_1920 {
   private static final FloatBuffer field_9820 = class_3776.<FloatBuffer>method_17484(
      MemoryUtil.memAllocFloat(16), var0 -> class_4208.method_19578(MemoryUtil.memAddress(var0))
   );
   private static final class_5807 field_9831 = new class_5807(null);
   private static final class_8111 field_9794 = new class_8111(2896);
   private static final class_8111[] field_9802 = IntStream.range(0, 8)
      .<class_8111>mapToObj(var0 -> new class_8111(16384 + var0))
      .<class_8111>toArray(class_8111[]::new);
   private static final class_6646 field_9809 = new class_6646(null);
   private static final class_6562 field_9805 = new class_6562(null);
   private static final class_2192 field_9812 = new class_2192(null);
   private static final class_8905 field_9798 = new class_8905(null);
   private static final class_444 field_9837 = new class_444(null);
   private static final class_1414 field_9834 = new class_1414(null);
   private static final class_2877 field_9829 = new class_2877(null);
   private static final class_167 field_9818 = new class_167(null);
   private static final class_6663 field_9806 = new class_6663(null);
   private static final class_6179 field_9824 = new class_6179(null);
   private static final FloatBuffer field_9813 = class_1423.method_6529(4);
   private static int field_9836;
   private static final class_6449[] field_9796 = IntStream.range(0, 32)
      .<class_6449>mapToObj(var0 -> new class_6449(null))
      .<class_6449>toArray(class_6449[]::new);
   private static int field_9801 = 7425;
   private static final class_8111 field_9808 = new class_8111(32826);
   private static final class_4743 field_9800 = new class_4743(null);
   private static final class_8149 field_9832 = new class_8149();
   private static class_5332 field_9815;
   private static class_2027 field_9816;
   private static class_1123 field_9804 = new class_1123();
   private static class_2412 field_9799 = new class_2412();
   private static class_1123 field_9828 = new class_1123();
   private static class_3525 field_9833 = new class_3525();
   private static class_1123 field_9807 = new class_1123();
   private static class_9777 field_9814 = new class_9777();
   private static boolean field_9811 = false;
   private static int field_9803 = 0;
   private static boolean field_9795 = false;
   public static float field_9830 = 0.0F;
   public static float field_9810 = 0.0F;
   public static boolean field_9817;
   public static boolean field_9838;
   public static int field_9819;
   public static int field_9840;
   public static int field_9822;
   public static int field_9825;
   private static boolean field_9821 = true;
   public static final int field_9839 = 7;
   public static final int field_9823 = 4;
   public static final int field_9826 = 33984;
   public static final int field_9827 = 33985;
   public static final int field_9797 = 33986;

   @Deprecated
   public static void method_8934() {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glPushAttrib(8256);
   }

   @Deprecated
   public static void method_8885() {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glPushAttrib(270336);
   }

   @Deprecated
   public static void method_8875() {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glPopAttrib();
   }

   @Deprecated
   public static void method_8801() {
      class_3542.method_16431(class_3542::method_16366);
      if (!field_9804.method_4945()) {
         field_9831.field_29315.method_36839();
      } else {
         field_9799.method_10969();
      }
   }

   @Deprecated
   public static void method_8741() {
      class_3542.method_16431(class_3542::method_16440);
      if (!field_9804.method_4945()) {
         field_9831.field_29315.method_36841();
      } else {
         field_9799.method_10966();
      }
   }

   @Deprecated
   public static void method_8785(int var0, float var1) {
      class_3542.method_16431(class_3542::method_16440);
      if (!field_9804.method_4945()) {
         if (var0 != field_9831.field_29317 || var1 != field_9831.field_29314) {
            field_9831.field_29317 = var0;
            field_9831.field_29314 = var1;
            GL11.glAlphaFunc(var0, var1);
         }
      } else {
         field_9799.method_10970(var0, var1);
      }
   }

   @Deprecated
   public static void method_8927() {
      class_3542.method_16431(class_3542::method_16366);
      field_9794.method_36841();
   }

   @Deprecated
   public static void method_8912() {
      class_3542.method_16431(class_3542::method_16366);
      field_9794.method_36839();
   }

   @Deprecated
   public static void method_8738(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      field_9802[var0].method_36841();
   }

   @Deprecated
   public static void method_8819() {
      class_3542.method_16431(class_3542::method_16366);
      field_9809.field_34388.method_36841();
   }

   @Deprecated
   public static void method_8798() {
      class_3542.method_16431(class_3542::method_16366);
      field_9809.field_34388.method_36839();
   }

   @Deprecated
   public static void method_8811(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 != field_9809.field_34386 || var1 != field_9809.field_34389) {
         field_9809.field_34386 = var0;
         field_9809.field_34389 = var1;
         GL11.glColorMaterial(var0, var1);
      }
   }

   @Deprecated
   public static void method_8744(int var0, int var1, FloatBuffer var2) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glLightfv(var0, var1, var2);
   }

   @Deprecated
   public static void method_8872(int var0, FloatBuffer var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glLightModelfv(var0, var1);
   }

   @Deprecated
   public static void method_8820(float var0, float var1, float var2) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glNormal3f(var0, var1, var2);
   }

   public static void method_8929() {
      class_3542.method_16431(class_3542::method_16440);
      field_9824.field_31590.method_36839();
   }

   public static void method_8767() {
      class_3542.method_16431(class_3542::method_16440);
      field_9824.field_31590.method_36841();
   }

   public static void method_8850(int var0, int var1, int var2, int var3) {
      class_3542.method_16431(class_3542::method_16440);
      GL20.glScissor(var0, var1, var2, var3);
   }

   public static void method_8786() {
      class_3542.method_16431(class_3542::method_16440);
      field_9812.field_10891.method_36839();
   }

   public static void method_8745() {
      class_3542.method_16431(class_3542::method_16440);
      field_9812.field_10891.method_36841();
   }

   public static void method_8862(int var0) {
      class_3542.method_16431(class_3542::method_16440);
      if (var0 != field_9812.field_10889) {
         field_9812.field_10889 = var0;
         GL11.glDepthFunc(var0);
      }
   }

   public static void method_8867(boolean var0) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 != field_9812.field_10890) {
         field_9812.field_10890 = var0;
         GL11.glDepthMask(var0);
      }
   }

   public static void method_8775() {
      class_3542.method_16431(class_3542::method_16366);
      if (!field_9828.method_4945()) {
         field_9805.field_33477.method_36839();
      } else {
         field_9833.method_16281();
      }
   }

   public static void method_8829() {
      class_3542.method_16431(class_3542::method_16366);
      if (!field_9828.method_4945()) {
         field_9805.field_33477.method_36841();
      } else {
         field_9833.method_16282();
      }
   }

   public static void method_8787(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16366);
      if (!field_9828.method_4945()) {
         if (var0 != field_9805.field_33478 || var1 != field_9805.field_33476 || var0 != field_9805.field_33474 || var1 != field_9805.field_33473) {
            field_9805.field_33478 = var0;
            field_9805.field_33476 = var1;
            field_9805.field_33474 = var0;
            field_9805.field_33473 = var1;
            if (class_3111.method_14424()) {
               class_6588.field_33850.method_3540(var0, var1, var0, var1);
            }

            GL11.glBlendFunc(var0, var1);
         }
      } else {
         field_9833.method_16277(var0, var1);
      }
   }

   public static void method_8816(int var0, int var1, int var2, int var3) {
      class_3542.method_16431(class_3542::method_16366);
      if (!field_9828.method_4945()) {
         if (var0 != field_9805.field_33478 || var1 != field_9805.field_33476 || var2 != field_9805.field_33474 || var3 != field_9805.field_33473) {
            field_9805.field_33478 = var0;
            field_9805.field_33476 = var1;
            field_9805.field_33474 = var2;
            field_9805.field_33473 = var3;
            if (class_3111.method_14424()) {
               class_6588.field_33850.method_3540(var0, var1, var2, var3);
            }

            method_8891(var0, var1, var2, var3);
         }
      } else {
         field_9833.method_16278(var0, var1, var2, var3);
      }
   }

   public static void method_8868(float var0, float var1, float var2, float var3) {
      GL14.glBlendColor(var0, var1, var2, var3);
   }

   public static void method_8896(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL14.glBlendEquation(var0);
   }

   public static String method_8902(GLCapabilities var0) {
      class_3542.method_16431(class_3542::method_16395);
      class_3111.method_14372();
      field_9817 = var0.OpenGL31;
      if (!field_9817) {
         field_9819 = 36662;
         field_9840 = 36663;
      } else {
         field_9819 = 36662;
         field_9840 = 36663;
      }

      if (!var0.OpenGL15) {
         field_9822 = 34962;
         field_9825 = 35044;
      } else {
         field_9822 = 34962;
         field_9825 = 35044;
      }

      boolean var3 = field_9817 || var0.GL_ARB_copy_buffer;
      boolean var4 = var0.OpenGL14;
      field_9838 = var3 && var4;
      if (!field_9838) {
         ArrayList var5 = new ArrayList();
         if (!var3) {
            var5.add("OpenGL 1.3, ARB_copy_buffer");
         }

         if (!var4) {
            var5.add("OpenGL 1.4");
         }

         String var6 = "VboRegions not supported, missing: " + class_3111.method_14378(var5);
         class_3111.method_14277(var6);
         var5.add(var6);
      }

      if (!var0.OpenGL30) {
         if (!var0.GL_EXT_framebuffer_blit) {
            field_9816 = class_2027.field_10303;
         } else {
            field_9816 = class_2027.field_10302;
         }
      } else {
         field_9816 = class_2027.field_10299;
      }

      if (!var0.OpenGL30) {
         if (!var0.GL_ARB_framebuffer_object) {
            if (!var0.GL_EXT_framebuffer_object) {
               throw new IllegalStateException("Could not initialize framebuffer support.");
            } else {
               field_9815 = class_5332.field_27203;
               class_6024.field_30769 = 36160;
               class_6024.field_30764 = 36161;
               class_6024.field_30770 = 36064;
               class_6024.field_30765 = 36096;
               class_6024.field_30761 = 36053;
               class_6024.field_30768 = 36055;
               class_6024.field_30767 = 36054;
               class_6024.field_30766 = 36059;
               class_6024.field_30763 = 36060;
               return "EXT_framebuffer_object extension";
            }
         } else {
            field_9815 = class_5332.field_27201;
            class_6024.field_30769 = 36160;
            class_6024.field_30764 = 36161;
            class_6024.field_30770 = 36064;
            class_6024.field_30765 = 36096;
            class_6024.field_30761 = 36053;
            class_6024.field_30768 = 36055;
            class_6024.field_30767 = 36054;
            class_6024.field_30766 = 36059;
            class_6024.field_30763 = 36060;
            return "ARB_framebuffer_object extension";
         }
      } else {
         field_9815 = class_5332.field_27202;
         class_6024.field_30769 = 36160;
         class_6024.field_30764 = 36161;
         class_6024.field_30770 = 36064;
         class_6024.field_30765 = 36096;
         class_6024.field_30761 = 36053;
         class_6024.field_30767 = 36054;
         class_6024.field_30768 = 36055;
         class_6024.field_30766 = 36059;
         class_6024.field_30763 = 36060;
         return "OpenGL 3.0";
      }
   }

   public static int method_8844(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16366);
      return GL20.glGetProgrami(var0, var1);
   }

   public static void method_8739(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glAttachShader(var0, var1);
   }

   public static void method_8766(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glDeleteShader(var0);
   }

   public static int method_8931(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      return GL20.glCreateShader(var0);
   }

   public static void method_8845(int var0, CharSequence var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glShaderSource(var0, var1);
   }

   public static void method_8888(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glCompileShader(var0);
   }

   public static int method_8866(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16366);
      return GL20.glGetShaderi(var0, var1);
   }

   public static void method_8808(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUseProgram(var0);
   }

   public static int method_8933() {
      class_3542.method_16431(class_3542::method_16366);
      return GL20.glCreateProgram();
   }

   public static void method_8853(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glDeleteProgram(var0);
   }

   public static void method_8759(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glLinkProgram(var0);
   }

   public static int method_8900(int var0, CharSequence var1) {
      class_3542.method_16431(class_3542::method_16366);
      return GL20.glGetUniformLocation(var0, var1);
   }

   public static void method_8753(int var0, IntBuffer var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUniform1iv(var0, var1);
   }

   public static void method_8752(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUniform1i(var0, var1);
   }

   public static void method_8915(int var0, FloatBuffer var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUniform1fv(var0, var1);
   }

   public static void method_8901(int var0, IntBuffer var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUniform2iv(var0, var1);
   }

   public static void method_8799(int var0, FloatBuffer var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUniform2fv(var0, var1);
   }

   public static void method_8774(int var0, IntBuffer var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUniform3iv(var0, var1);
   }

   public static void method_8743(int var0, FloatBuffer var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUniform3fv(var0, var1);
   }

   public static void method_8852(int var0, IntBuffer var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUniform4iv(var0, var1);
   }

   public static void method_8882(int var0, FloatBuffer var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUniform4fv(var0, var1);
   }

   public static void method_8834(int var0, boolean var1, FloatBuffer var2) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUniformMatrix2fv(var0, var1, var2);
   }

   public static void method_8770(int var0, boolean var1, FloatBuffer var2) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUniformMatrix3fv(var0, var1, var2);
   }

   public static void method_8740(int var0, boolean var1, FloatBuffer var2) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glUniformMatrix4fv(var0, var1, var2);
   }

   public static int method_8815(int var0, CharSequence var1) {
      class_3542.method_16431(class_3542::method_16366);
      return GL20.glGetAttribLocation(var0, var1);
   }

   public static int method_8817() {
      class_3542.method_16431(class_3542::method_16440);
      return GL15.glGenBuffers();
   }

   public static void method_8760(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16440);
      GL15.glBindBuffer(var0, var1);
   }

   public static void method_8803(int var0, ByteBuffer var1, int var2) {
      class_3542.method_16431(class_3542::method_16440);
      GL15.glBufferData(var0, var1, var2);
   }

   public static void method_8825(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL15.glDeleteBuffers(var0);
   }

   public static void method_8874(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class_3542.method_16431(class_3542::method_16440);
      GL20.glCopyTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void method_8893(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16440);
      switch (field_9815) {
         case field_27202:
            GL30.glBindFramebuffer(var0, var1);
            break;
         case field_27201:
            ARBFramebufferObject.glBindFramebuffer(var0, var1);
            break;
         case field_27203:
            EXTFramebufferObject.glBindFramebufferEXT(var0, var1);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static int method_8748() {
      class_3542.method_16431(class_3542::method_16440);
      switch (field_9815) {
         case field_27202:
            if (GL30.glGetFramebufferAttachmentParameteri(36160, 36096, 36048) == 5890) {
               return GL30.glGetFramebufferAttachmentParameteri(36160, 36096, 36049);
            }
            break;
         case field_27201:
            if (ARBFramebufferObject.glGetFramebufferAttachmentParameteri(36160, 36096, 36048) == 5890) {
               return ARBFramebufferObject.glGetFramebufferAttachmentParameteri(36160, 36096, 36049);
            }
            break;
         case field_27203:
            if (EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT(36160, 36096, 36048) == 5890) {
               return EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT(36160, 36096, 36049);
            }
      }

      return 0;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void method_8835(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      class_3542.method_16431(class_3542::method_16440);
      switch (field_9816) {
         case field_10299:
            GL30.glBlitFramebuffer(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
            break;
         case field_10302:
            EXTFramebufferBlit.glBlitFramebufferEXT(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
         case field_10303:
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void method_8857(int var0) {
      class_3542.method_16431(class_3542::method_16440);
      switch (field_9815) {
         case field_27202:
            GL30.glDeleteFramebuffers(var0);
            break;
         case field_27201:
            ARBFramebufferObject.glDeleteFramebuffers(var0);
            break;
         case field_27203:
            EXTFramebufferObject.glDeleteFramebuffersEXT(var0);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static int method_8828() {
      class_3542.method_16431(class_3542::method_16440);
      switch (field_9815) {
         case field_27202:
            return GL30.glGenFramebuffers();
         case field_27201:
            return ARBFramebufferObject.glGenFramebuffers();
         case field_27203:
            return EXTFramebufferObject.glGenFramebuffersEXT();
         default:
            return -1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static int method_8916(int var0) {
      class_3542.method_16431(class_3542::method_16440);
      switch (field_9815) {
         case field_27202:
            return GL30.glCheckFramebufferStatus(var0);
         case field_27201:
            return ARBFramebufferObject.glCheckFramebufferStatus(var0);
         case field_27203:
            return EXTFramebufferObject.glCheckFramebufferStatusEXT(var0);
         default:
            return -1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void method_8747(int var0, int var1, int var2, int var3, int var4) {
      class_3542.method_16431(class_3542::method_16440);
      switch (field_9815) {
         case field_27202:
            GL30.glFramebufferTexture2D(var0, var1, var2, var3, var4);
            break;
         case field_27201:
            ARBFramebufferObject.glFramebufferTexture2D(var0, var1, var2, var3, var4);
            break;
         case field_27203:
            EXTFramebufferObject.glFramebufferTexture2DEXT(var0, var1, var2, var3, var4);
      }
   }

   @Deprecated
   public static int method_8910() {
      return field_9796[field_9836].field_32894;
   }

   public static void method_8809(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL13.glActiveTexture(var0);
   }

   @Deprecated
   public static void method_8750(int var0) {
      if (var0 != field_9803) {
         class_3542.method_16431(class_3542::method_16366);
         GL13.glClientActiveTexture(var0);
         field_9803 = var0;
      }
   }

   @Deprecated
   public static void method_8796(int var0, float var1, float var2) {
      class_3542.method_16431(class_3542::method_16366);
      GL13.glMultiTexCoord2f(var0, var1, var2);
      if (var0 == 33986) {
         field_9830 = var1;
         field_9810 = var2;
      }
   }

   public static void method_8891(int var0, int var1, int var2, int var3) {
      class_3542.method_16431(class_3542::method_16366);
      GL14.glBlendFuncSeparate(var0, var1, var2, var3);
   }

   public static String method_8889(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16366);
      return GL20.glGetShaderInfoLog(var0, var1);
   }

   public static String method_8810(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16366);
      return GL20.glGetProgramInfoLog(var0, var1);
   }

   public static void method_8849() {
      class_3542.method_16431(class_3542::method_16366);
      method_8858(8960, 8704, 34160);
      method_8883(7681, 34168);
   }

   public static void method_8814() {
      class_3542.method_16431(class_3542::method_16366);
      method_8858(8960, 8704, 8448);
      method_8884(8448, 5890, 34168, 34166);
   }

   public static void method_8805(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16366);
      method_8899(33985);
      method_8843();
      method_8842(5890);
      method_8865();
      float var4 = 1.0F / (float)(var1 - 1);
      method_8854(var4, var4, var4);
      method_8842(5888);
      method_8791(var0);
      method_8879(3553, 10241, 9728);
      method_8879(3553, 10240, 9728);
      method_8879(3553, 10242, 10496);
      method_8879(3553, 10243, 10496);
      method_8858(8960, 8704, 34160);
      method_8884(34165, 34168, 5890, 5890);
      method_8758(7681, 34168);
      method_8899(33984);
   }

   public static void method_8764() {
      class_3542.method_16431(class_3542::method_16366);
      method_8899(33985);
      method_8848();
      method_8899(33984);
   }

   private static void method_8883(int var0, int var1) {
      method_8858(8960, 34161, var0);
      method_8858(8960, 34176, var1);
      method_8858(8960, 34192, 768);
   }

   private static void method_8884(int var0, int var1, int var2, int var3) {
      method_8858(8960, 34161, var0);
      method_8858(8960, 34176, var1);
      method_8858(8960, 34192, 768);
      method_8858(8960, 34177, var2);
      method_8858(8960, 34193, 768);
      method_8858(8960, 34178, var3);
      method_8858(8960, 34194, 770);
   }

   private static void method_8758(int var0, int var1) {
      method_8858(8960, 34162, var0);
      method_8858(8960, 34184, var1);
      method_8858(8960, 34200, 770);
   }

   public static void method_8783(class_2426 var0, class_2426 var1, class_8107 var2) {
      class_3542.method_16431(class_3542::method_16366);
      method_8757();
      method_8865();
      method_8738(0);
      method_8738(1);
      class_2637 var5 = new class_2637(var0);
      var5.method_11929(var2);
      method_8744(16384, 4611, method_8877(var5.method_11923(), var5.method_11922(), var5.method_11927(), 0.0F));
      float var6 = 0.6F;
      method_8744(16384, 4609, method_8877(0.6F, 0.6F, 0.6F, 1.0F));
      method_8744(16384, 4608, method_8877(0.0F, 0.0F, 0.0F, 1.0F));
      method_8744(16384, 4610, method_8877(0.0F, 0.0F, 0.0F, 1.0F));
      class_2637 var7 = new class_2637(var1);
      var7.method_11929(var2);
      method_8744(16385, 4611, method_8877(var7.method_11923(), var7.method_11922(), var7.method_11927(), 0.0F));
      method_8744(16385, 4609, method_8877(0.6F, 0.6F, 0.6F, 1.0F));
      method_8744(16385, 4608, method_8877(0.0F, 0.0F, 0.0F, 1.0F));
      method_8744(16385, 4610, method_8877(0.0F, 0.0F, 0.0F, 1.0F));
      method_8932(7424);
      float var8 = 0.4F;
      method_8872(2899, method_8877(0.4F, 0.4F, 0.4F, 1.0F));
      method_8761();
   }

   public static void method_8921(class_2426 var0, class_2426 var1) {
      class_3542.method_16431(class_3542::method_16366);
      class_8107 var4 = new class_8107();
      var4.method_36817();
      var4.method_36832(class_8107.method_36814(1.0F, -1.0F, 1.0F));
      var4.method_36831(class_2426.field_12074.method_11074(-22.5F));
      var4.method_36831(class_2426.field_12080.method_11074(135.0F));
      method_8783(var0, var1, var4);
   }

   public static void method_8806(class_2426 var0, class_2426 var1) {
      class_3542.method_16431(class_3542::method_16366);
      class_8107 var4 = new class_8107();
      var4.method_36817();
      var4.method_36831(class_2426.field_12074.method_11074(62.0F));
      var4.method_36831(class_2426.field_12080.method_11074(185.5F));
      var4.method_36832(class_8107.method_36814(1.0F, -1.0F, 1.0F));
      var4.method_36831(class_2426.field_12074.method_11074(-22.5F));
      var4.method_36831(class_2426.field_12080.method_11074(135.0F));
      method_8783(var0, var1, var4);
   }

   private static FloatBuffer method_8877(float var0, float var1, float var2, float var3) {
      ((Buffer)field_9813).clear();
      field_9813.put(var0).put(var1).put(var2).put(var3);
      ((Buffer)field_9813).flip();
      return field_9813;
   }

   public static void method_8736() {
      method_8905(class_1998.field_10152, 9216);
      method_8905(class_1998.field_10150, 9216);
      method_8905(class_1998.field_10151, 9216);
      method_8762(class_1998.field_10152, 9474, method_8877(1.0F, 0.0F, 0.0F, 0.0F));
      method_8762(class_1998.field_10150, 9474, method_8877(0.0F, 1.0F, 0.0F, 0.0F));
      method_8762(class_1998.field_10151, 9474, method_8877(0.0F, 0.0F, 1.0F, 0.0F));
      method_8742(class_1998.field_10152);
      method_8742(class_1998.field_10150);
      method_8742(class_1998.field_10151);
   }

   public static void method_8909() {
      method_8737(class_1998.field_10152);
      method_8737(class_1998.field_10150);
      method_8737(class_1998.field_10151);
   }

   public static void method_8873() {
      method_8846(2983, field_9820);
      method_8837(field_9820);
      method_8846(2982, field_9820);
      method_8837(field_9820);
   }

   @Deprecated
   public static void method_8907() {
      if (field_9821) {
         class_3542.method_16431(class_3542::method_16366);
         field_9798.field_45659.method_36841();
      }
   }

   @Deprecated
   public static void method_8804() {
      class_3542.method_16431(class_3542::method_16366);
      field_9798.field_45659.method_36839();
   }

   @Deprecated
   public static void method_8892(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 != field_9798.field_45660) {
         field_9798.field_45660 = var0;
         method_8768(2917, var0);
         if (class_3111.method_14424()) {
            class_6588.method_30218(var0);
         }
      }
   }

   @Deprecated
   public static void method_8784(float var0) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 < 0.0F) {
         var0 = 0.0F;
      }

      if (var0 != field_9798.field_45657) {
         field_9798.field_45657 = var0;
         GL11.glFogf(2914, var0);
         if (class_3111.method_14424()) {
            class_6588.method_30131(var0);
         }
      }
   }

   @Deprecated
   public static void method_8851(float var0) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 != field_9798.field_45658) {
         field_9798.field_45658 = var0;
         GL11.glFogf(2915, var0);
      }
   }

   @Deprecated
   public static void method_8749(float var0) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 != field_9798.field_45661) {
         field_9798.field_45661 = var0;
         GL11.glFogf(2916, var0);
      }
   }

   @Deprecated
   public static void method_8919(int var0, float[] var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glFogfv(var0, var1);
   }

   @Deprecated
   public static void method_8768(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glFogi(var0, var1);
   }

   public static void method_8903() {
      class_3542.method_16431(class_3542::method_16366);
      if (!field_9807.method_4945()) {
         field_9837.field_1863.method_36841();
      } else {
         field_9814.method_45130();
      }
   }

   public static void method_8765() {
      class_3542.method_16431(class_3542::method_16366);
      if (!field_9807.method_4945()) {
         field_9837.field_1863.method_36839();
      } else {
         field_9814.method_45132();
      }
   }

   public static void method_8818(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glPolygonMode(var0, var1);
   }

   public static void method_8792() {
      class_3542.method_16431(class_3542::method_16366);
      field_9834.field_7674.method_36841();
   }

   public static void method_8861() {
      class_3542.method_16431(class_3542::method_16366);
      field_9834.field_7674.method_36839();
   }

   public static void method_8863() {
      class_3542.method_16431(class_3542::method_16366);
      field_9834.field_7676.method_36841();
   }

   public static void method_8894() {
      class_3542.method_16431(class_3542::method_16366);
      field_9834.field_7676.method_36839();
   }

   public static void method_8924(float var0, float var1) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 != field_9834.field_7675 || var1 != field_9834.field_7678) {
         field_9834.field_7675 = var0;
         field_9834.field_7678 = var1;
         GL11.glPolygonOffset(var0, var1);
      }
   }

   public static void method_8790() {
      class_3542.method_16431(class_3542::method_16366);
      field_9829.field_14090.method_36841();
   }

   public static void method_8813() {
      class_3542.method_16431(class_3542::method_16366);
      field_9829.field_14090.method_36839();
   }

   public static void method_8769(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 != field_9829.field_14089) {
         field_9829.field_14089 = var0;
         GL11.glLogicOp(var0);
      }
   }

   @Deprecated
   public static void method_8742(class_1998 var0) {
      class_3542.method_16431(class_3542::method_16366);
      method_8887(var0).field_49442.method_36841();
   }

   @Deprecated
   public static void method_8737(class_1998 var0) {
      class_3542.method_16431(class_3542::method_16366);
      method_8887(var0).field_49442.method_36839();
   }

   @Deprecated
   public static void method_8905(class_1998 var0, int var1) {
      class_3542.method_16431(class_3542::method_16366);
      class_9727 var4 = method_8887(var0);
      if (var1 != var4.field_49443) {
         var4.field_49443 = var1;
         GL11.glTexGeni(var4.field_49444, 9472, var1);
      }
   }

   @Deprecated
   public static void method_8762(class_1998 var0, int var1, FloatBuffer var2) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glTexGenfv(method_8887(var0).field_49444, var1, var2);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Deprecated
   private static class_9727 method_8887(class_1998 var0) {
      class_3542.method_16431(class_3542::method_16366);
      switch (var0) {
         case field_10152:
            return field_9818.field_504;
         case field_10150:
            return field_9818.field_505;
         case field_10151:
            return field_9818.field_503;
         case field_10149:
            return field_9818.field_506;
         default:
            return field_9818.field_504;
      }
   }

   public static void method_8899(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      if (field_9836 != var0 - 33984) {
         field_9836 = var0 - 33984;
         method_8809(var0);
      }
   }

   public static void method_8843() {
      class_3542.method_16431(class_3542::method_16440);
      field_9796[field_9836].field_32892.method_36841();
   }

   public static void method_8848() {
      class_3542.method_16431(class_3542::method_16366);
      field_9796[field_9836].field_32892.method_36839();
   }

   @Deprecated
   public static void method_8858(int var0, int var1, int var2) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glTexEnvi(var0, var1, var2);
   }

   public static void method_8878(int var0, int var1, float var2) {
      class_3542.method_16431(class_3542::method_16440);
      GL11.glTexParameterf(var0, var1, var2);
   }

   public static void method_8879(int var0, int var1, int var2) {
      class_3542.method_16431(class_3542::method_16440);
      GL11.glTexParameteri(var0, var1, var2);
   }

   public static int method_8911(int var0, int var1, int var2) {
      class_3542.method_16431(class_3542::method_16395);
      return GL11.glGetTexLevelParameteri(var0, var1, var2);
   }

   public static int method_8807() {
      class_3542.method_16431(class_3542::method_16440);
      return GL11.glGenTextures();
   }

   public static void method_8906(int[] var0) {
      class_3542.method_16431(class_3542::method_16440);
      GL11.glGenTextures(var0);
   }

   public static void method_8904(int var0) {
      class_3542.method_16431(class_3542::method_16440);
      if (var0 != 0) {
         GL11.glDeleteTextures(var0);

         for (class_6449 var6 : field_9796) {
            if (var6.field_32894 == var0) {
               var6.field_32894 = 0;
            }
         }
      }
   }

   public static void method_8859(int[] var0) {
      class_3542.method_16431(class_3542::method_16440);

      for (class_6449 var6 : field_9796) {
         for (int var10 : var0) {
            if (var6.field_32894 == var10) {
               var6.field_32894 = -1;
            }
         }
      }

      GL11.glDeleteTextures(var0);
   }

   public static void method_8791(int var0) {
      class_3542.method_16431(class_3542::method_16440);
      if (var0 != field_9796[field_9836].field_32894) {
         field_9796[field_9836].field_32894 = var0;
         GL11.glBindTexture(3553, var0);
         if (class_153.method_611()) {
            class_153.method_612(var0);
         }
      }
   }

   public static void method_8886(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, IntBuffer var8) {
      class_3542.method_16431(class_3542::method_16440);
      GL11.glTexImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void method_8776(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8) {
      class_3542.method_16431(class_3542::method_16440);
      GL11.glTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void method_8926(int var0, int var1, int var2, int var3, long var4) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glGetTexImage(var0, var1, var2, var3, var4);
   }

   @Deprecated
   public static void method_8932(int var0) {
      class_3542.method_16431(class_3542::method_16440);
      if (var0 != field_9801) {
         field_9801 = var0;
         GL11.glShadeModel(var0);
      }
   }

   @Deprecated
   public static void method_8908() {
      class_3542.method_16431(class_3542::method_16366);
      field_9808.method_36841();
   }

   @Deprecated
   public static void method_8778() {
      class_3542.method_16431(class_3542::method_16366);
      field_9808.method_36839();
   }

   public static void method_8930(int var0, int var1, int var2, int var3) {
      class_3542.method_16431(class_3542::method_16440);
      class_3433.field_16873.field_16874 = var0;
      class_3433.field_16873.field_16877 = var1;
      class_3433.field_16873.field_16875 = var2;
      class_3433.field_16873.field_16878 = var3;
      GL11.glViewport(var0, var1, var2, var3);
   }

   public static void method_8895(boolean var0, boolean var1, boolean var2, boolean var3) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 != field_9800.field_22985 || var1 != field_9800.field_22982 || var2 != field_9800.field_22984 || var3 != field_9800.field_22986) {
         field_9800.field_22985 = var0;
         field_9800.field_22982 = var1;
         field_9800.field_22984 = var2;
         field_9800.field_22986 = var3;
         GL11.glColorMask(var0, var1, var2, var3);
      }
   }

   public static void method_8773(int var0, int var1, int var2) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 != field_9806.field_34454.field_20887 || var0 != field_9806.field_34454.field_20886 || var0 != field_9806.field_34454.field_20885) {
         field_9806.field_34454.field_20887 = var0;
         field_9806.field_34454.field_20886 = var1;
         field_9806.field_34454.field_20885 = var2;
         GL11.glStencilFunc(var0, var1, var2);
      }
   }

   public static void method_8821(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 != field_9806.field_34451) {
         field_9806.field_34451 = var0;
         GL11.glStencilMask(var0);
      }
   }

   public static void method_8914(int var0, int var1, int var2) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 != field_9806.field_34453 || var1 != field_9806.field_34455 || var2 != field_9806.field_34452) {
         field_9806.field_34453 = var0;
         field_9806.field_34455 = var1;
         field_9806.field_34452 = var2;
         GL11.glStencilOp(var0, var1, var2);
      }
   }

   public static void method_8913(double var0) {
      class_3542.method_16431(class_3542::method_16440);
      GL11.glClearDepth(var0);
   }

   public static void method_8880(float var0, float var1, float var2, float var3) {
      class_3542.method_16431(class_3542::method_16440);
      GL11.glClearColor(var0, var1, var2, var3);
   }

   public static void method_8839(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glClearStencil(var0);
   }

   public static void method_8794(int var0, boolean var1) {
      class_3542.method_16431(class_3542::method_16440);
      GL11.glClear(var0);
      if (var1) {
         method_8925();
      }
   }

   @Deprecated
   public static void method_8842(int var0) {
      class_3542.method_16431(class_3542::method_16440);
      GL11.glMatrixMode(var0);
   }

   @Deprecated
   public static void method_8865() {
      class_3542.method_16431(class_3542::method_16440);
      GL11.glLoadIdentity();
   }

   @Deprecated
   public static void method_8757() {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glPushMatrix();
   }

   @Deprecated
   public static void method_8761() {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glPopMatrix();
   }

   @Deprecated
   public static void method_8846(int var0, FloatBuffer var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glGetFloatv(var0, var1);
   }

   @Deprecated
   public static void method_8781(double var0, double var2, double var4, double var6, double var8, double var10) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glOrtho(var0, var2, var4, var6, var8, var10);
   }

   @Deprecated
   public static void method_8824(float var0, float var1, float var2, float var3) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glRotatef(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method_8854(float var0, float var1, float var2) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glScalef(var0, var1, var2);
   }

   @Deprecated
   public static void method_8771(double var0, double var2, double var4) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glScaled(var0, var2, var4);
   }

   @Deprecated
   public static void method_8897(float var0, float var1, float var2) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glTranslatef(var0, var1, var2);
   }

   @Deprecated
   public static void method_8876(double var0, double var2, double var4) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glTranslated(var0, var2, var4);
   }

   @Deprecated
   public static void method_8837(FloatBuffer var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glMultMatrixf(var0);
   }

   @Deprecated
   public static void method_8838(class_8107 var0) {
      class_3542.method_16431(class_3542::method_16366);
      var0.method_36827(field_9820);
      ((Buffer)field_9820).rewind();
      method_8837(field_9820);
   }

   @Deprecated
   public static void method_8789(float var0, float var1, float var2, float var3) {
      class_3542.method_16431(class_3542::method_16366);
      if (var0 != field_9832.field_41782 || var1 != field_9832.field_41783 || var2 != field_9832.field_41780 || var3 != field_9832.field_41779) {
         field_9832.field_41782 = var0;
         field_9832.field_41783 = var1;
         field_9832.field_41780 = var2;
         field_9832.field_41779 = var3;
         GL11.glColor4f(var0, var1, var2, var3);
      }
   }

   @Deprecated
   public static void method_8836() {
      class_3542.method_16431(class_3542::method_16366);
      field_9832.field_41782 = -1.0F;
      field_9832.field_41783 = -1.0F;
      field_9832.field_41780 = -1.0F;
      field_9832.field_41779 = -1.0F;
   }

   @Deprecated
   public static void method_8827(int var0, int var1, long var2) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glNormalPointer(var0, var1, var2);
   }

   @Deprecated
   public static void method_8830(int var0, int var1, int var2, long var3) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glTexCoordPointer(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method_8754(int var0, int var1, int var2, long var3) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glVertexPointer(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method_8833(int var0, int var1, int var2, long var3) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glColorPointer(var0, var1, var2, var3);
   }

   public static void method_8832(int var0, int var1, int var2, boolean var3, int var4, long var5) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glVertexAttribPointer(var0, var1, var2, var3, var4, var5);
   }

   @Deprecated
   public static void method_8782(int var0) {
      if (!field_9811) {
         class_3542.method_16431(class_3542::method_16366);
         GL11.glEnableClientState(var0);
      }
   }

   @Deprecated
   public static void method_8751(int var0) {
      if (!field_9811) {
         class_3542.method_16431(class_3542::method_16366);
         GL11.glDisableClientState(var0);
      }
   }

   public static void method_8826(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glEnableVertexAttribArray(var0);
   }

   public static void method_8800(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL20.glEnableVertexAttribArray(var0);
   }

   public static void method_8812(int var0, int var1, int var2) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glDrawArrays(var0, var1, var2);
      if (class_3111.method_14424() && !field_9795) {
         int var5 = class_6588.field_33770.method_13756();
         if (var5 > 1) {
            for (int var6 = 1; var6 < var5; var6++) {
               class_6588.field_33776.method_40456(var6);
               GL11.glDrawArrays(var0, var1, var2);
            }

            class_6588.field_33776.method_40456(0);
         }
      }
   }

   public static void method_8823(float var0) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glLineWidth(var0);
   }

   public static void method_8763(int var0, int var1) {
      class_3542.method_16431(class_3542::method_16440);
      GL11.glPixelStorei(var0, var1);
   }

   public static void method_8755(int var0, float var1) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glPixelTransferf(var0, var1);
   }

   public static void method_8898(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      class_3542.method_16431(class_3542::method_16366);
      GL11.glReadPixels(var0, var1, var2, var3, var4, var5, var6);
   }

   public static int method_8925() {
      class_3542.method_16431(class_3542::method_16366);
      return GL11.glGetError();
   }

   public static String method_8928(int var0) {
      class_3542.method_16431(class_3542::method_16366);
      return GL11.glGetString(var0);
   }

   public static int method_8860(int var0) {
      class_3542.method_16431(class_3542::method_16440);
      return GL11.glGetInteger(var0);
   }

   public static boolean method_8795() {
      return field_9816 != class_2027.field_10303;
   }

   public static int method_8881() {
      return 33984 + field_9836;
   }

   public static void method_8797() {
      GL11.glBindTexture(3553, field_9796[field_9836].field_32894);
   }

   public static int method_8841() {
      return field_9796[field_9836].field_32894;
   }

   public static void method_8735() {
      if (class_3111.method_14272()) {
         int var2 = GL11.glGetInteger(34016);
         int var3 = GL11.glGetInteger(32873);
         int var4 = method_8881();
         int var5 = method_8841();
         if (var5 > 0 && (var2 != var4 || var3 != var5)) {
            class_3111.method_14277("checkTexture: act: " + var4 + ", glAct: " + var2 + ", tex: " + var5 + ", glTex: " + var3);
         }
      }
   }

   public static void method_8890(IntBuffer var0) {
      ((Buffer)var0).rewind();

      while (var0.position() < var0.limit()) {
         int var3 = var0.get();
         method_8904(var3);
      }

      ((Buffer)var0).rewind();
   }

   public static boolean method_8779() {
      return class_8111.method_36837(field_9798.field_45659);
   }

   public static void method_8840(boolean var0) {
      field_9798.field_45659.method_36838(var0);
   }

   public static void method_8756(class_2412 var0) {
      if (!field_9804.method_4945()) {
         method_8871(field_9799);
         method_8746(var0);
         field_9804.method_4942();
      }
   }

   public static void method_8777() {
      if (field_9804.method_4943()) {
         method_8746(field_9799);
      }
   }

   public static void method_8871(class_2412 var0) {
      if (!field_9804.method_4945()) {
         var0.method_10975(class_8111.method_36837(field_9831.field_29315), field_9831.field_29317, field_9831.field_29314);
      } else {
         var0.method_10974(field_9799);
      }
   }

   public static void method_8746(class_2412 var0) {
      if (!field_9804.method_4945()) {
         field_9831.field_29315.method_36838(var0.method_10968());
         method_8785(var0.method_10973(), var0.method_10972());
      } else {
         field_9799.method_10974(var0);
      }
   }

   public static void method_8831(class_3525 var0) {
      if (!field_9828.method_4945()) {
         method_8923(field_9833);
         method_8920(var0);
         field_9828.method_4942();
      }
   }

   public static void method_8855() {
      if (field_9828.method_4943()) {
         method_8920(field_9833);
      }
   }

   public static void method_8923(class_3525 var0) {
      if (!field_9828.method_4945()) {
         var0.method_16276(
            class_8111.method_36837(field_9805.field_33477), field_9805.field_33478, field_9805.field_33476, field_9805.field_33474, field_9805.field_33473
         );
      } else {
         var0.method_16275(field_9833);
      }
   }

   public static void method_8920(class_3525 var0) {
      if (!field_9828.method_4945()) {
         field_9805.field_33477.method_36838(var0.method_16287());
         if (var0.method_16274()) {
            method_8816(var0.method_16273(), var0.method_16285(), var0.method_16286(), var0.method_16279());
         } else {
            method_8787(var0.method_16273(), var0.method_16285());
         }
      } else {
         field_9833.method_16275(var0);
      }
   }

   public static void method_8772(class_9777 var0) {
      if (!field_9807.method_4945()) {
         method_8864(field_9814);
         method_8922(var0);
         field_9807.method_4942();
      }
   }

   public static void method_8918() {
      if (field_9807.method_4943()) {
         method_8922(field_9814);
      }
   }

   public static void method_8864(class_9777 var0) {
      if (!field_9807.method_4945()) {
         var0.method_45128(class_8111.method_36837(field_9837.field_1863), field_9837.field_1862);
      } else {
         var0.method_45127(field_9814);
      }
   }

   public static void method_8922(class_9777 var0) {
      if (!field_9807.method_4945()) {
         field_9837.field_1863.method_36838(var0.method_45133());
         field_9837.field_1862 = var0.method_45129();
      } else {
         field_9814.method_45127(var0);
      }
   }

   public static void method_8847(int var0, IntBuffer var1, IntBuffer var2) {
      GL14.glMultiDrawArrays(var0, var1, var2);
      if (class_3111.method_14424() && !field_9795) {
         int var5 = class_6588.field_33770.method_13756();
         if (var5 > 1) {
            for (int var6 = 1; var6 < var5; var6++) {
               class_6588.field_33776.method_40456(var6);
               GL14.glMultiDrawArrays(var0, var1, var2);
            }

            class_6588.field_33776.method_40456(0);
         }
      }
   }

   public static void method_8793(int var0) {
      method_8794(var0, false);
   }

   public static void method_8822(IntBuffer var0) {
      GL11.glCallLists(var0);
      if (class_3111.method_14424() && !field_9795) {
         int var3 = class_6588.field_33770.method_13756();
         if (var3 > 1) {
            for (int var4 = 1; var4 < var3; var4++) {
               class_6588.field_33776.method_40456(var4);
               GL11.glCallLists(var0);
            }

            class_6588.field_33776.method_40456(0);
         }
      }
   }

   public static void method_8802(int var0, long var1, int var3) {
      GL15.glBufferData(var0, var1, var3);
   }

   public static void method_8870(int var0, long var1, ByteBuffer var3) {
      GL15.glBufferSubData(var0, var1, var3);
   }

   public static void method_8869(int var0, int var1, long var2, long var4, long var6) {
      if (!field_9817) {
         ARBCopyBuffer.glCopyBufferSubData(var0, var1, var2, var4, var6);
      } else {
         GL31.glCopyBufferSubData(var0, var1, var2, var4, var6);
      }
   }

   public static boolean method_8788() {
      return field_9821;
   }

   public static void method_8856(boolean var0) {
      field_9821 = var0;
   }

   public static void method_8780() {
      field_9811 = true;
   }

   public static void method_8935() {
      field_9811 = false;
   }
}
