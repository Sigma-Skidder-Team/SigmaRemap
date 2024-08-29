package mapped;

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

public class Class7414 {
   private static final FloatBuffer field31724 = Class8157.<FloatBuffer>method28308(
      MemoryUtil.memAllocFloat(16), var0 -> Class8317.method29100(MemoryUtil.memAddress(var0))
   );
   private static final Class8764 field31725 = new Class8764();
   private static final Class9368 field31726 = new Class9368(2896);
   private static final Class9368[] field31727 = IntStream.range(0, 8)
      .<Class9368>mapToObj(var0 -> new Class9368(16384 + var0))
      .<Class9368>toArray(Class9368[]::new);
   private static final Class8997 field31728 = new Class8997();
   private static final Class8970 field31729 = new Class8970();
   private static final Class7556 field31730 = new Class7556();
   private static final Class9582 field31731 = new Class9582();
   private static final Class6028 field31732 = new Class6028();
   private static final Class7134 field31733 = new Class7134();
   private static final Class7838 field31734 = new Class7838();
   private static final Class4535 field31735 = new Class4535();
   private static final Class9004 field31736 = new Class9004();
   private static final Class8865 field31737 = new Class8865();
   private static final FloatBuffer field31738 = Class7137.method22267(4);
   private static int field31739;
   private static final Class8938[] field31740 = IntStream.range(0, 32).<Class8938>mapToObj(var0 -> new Class8938()).<Class8938>toArray(Class8938[]::new);
   private static int field31741 = 7425;
   private static final Class9368 field31742 = new Class9368(32826);
   private static final Class8479 field31743 = new Class8479();
   private static final Class9377 field31744 = new Class9377();
   private static Class2065 field31745;
   private static Class2337 field31746;
   private static Class6893 field31747 = new Class6893();
   private static Class7675 field31748 = new Class7675();
   private static Class6893 field31749 = new Class6893();
   private static Class8069 field31750 = new Class8069();
   private static Class6893 field31751 = new Class6893();
   private static Class9816 field31752 = new Class9816();
   private static boolean field31753 = false;
   private static int field31754 = 0;
   private static boolean field31755 = false;
   public static float field31756 = 0.0F;
   public static float field31757 = 0.0F;
   public static boolean field31758;
   public static boolean field31759;
   public static int field31760;
   public static int field31761;
   public static int field31762;
   public static int field31763;
   private static boolean field31764 = true;
   public static final int field31765 = 7;
   public static final int field31766 = 4;
   public static final int field31767 = 33984;
   public static final int field31768 = 33985;
   public static final int field31769 = 33986;

   @Deprecated
   public static void method23692() {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glPushAttrib(8256);
   }

   @Deprecated
   public static void method23693() {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glPushAttrib(270336);
   }

   @Deprecated
   public static void method23694() {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glPopAttrib();
   }

   @Deprecated
   public static void method23695() {
      RenderSystem.method27808(RenderSystem::method27803);
      if (!field31747.method21055()) {
         field31725.field39453.method35529();
      } else {
         field31748.method25212();
      }
   }

   @Deprecated
   public static void method23696() {
      RenderSystem.method27808(RenderSystem::method27804);
      if (!field31747.method21055()) {
         field31725.field39453.method35530();
      } else {
         field31748.method25211();
      }
   }

   @Deprecated
   public static void method23697(int var0, float var1) {
      RenderSystem.method27808(RenderSystem::method27804);
      if (!field31747.method21055()) {
         if (var0 != field31725.field39454 || var1 != field31725.field39455) {
            field31725.field39454 = var0;
            field31725.field39455 = var1;
            GL11.glAlphaFunc(var0, var1);
         }
      } else {
         field31748.method25209(var0, var1);
      }
   }

   @Deprecated
   public static void method23698() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31726.method35530();
   }

   @Deprecated
   public static void method23699() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31726.method35529();
   }

   @Deprecated
   public static void method23700(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      field31727[var0].method35530();
   }

   @Deprecated
   public static void method23701() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31728.field41143.method35530();
   }

   @Deprecated
   public static void method23702() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31728.field41143.method35529();
   }

   @Deprecated
   public static void method23703(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 != field31728.field41144 || var1 != field31728.field41145) {
         field31728.field41144 = var0;
         field31728.field41145 = var1;
         GL11.glColorMaterial(var0, var1);
      }
   }

   @Deprecated
   public static void method23704(int var0, int var1, FloatBuffer var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glLightfv(var0, var1, var2);
   }

   @Deprecated
   public static void method23705(int var0, FloatBuffer var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glLightModelfv(var0, var1);
   }

   @Deprecated
   public static void method23706(float var0, float var1, float var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glNormal3f(var0, var1, var2);
   }

   public static void method23707() {
      RenderSystem.method27808(RenderSystem::method27804);
      field31737.field40056.method35529();
   }

   public static void method23708() {
      RenderSystem.method27808(RenderSystem::method27804);
      field31737.field40056.method35530();
   }

   public static void method23709(int var0, int var1, int var2, int var3) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL20.glScissor(var0, var1, var2, var3);
   }

   public static void method23710() {
      RenderSystem.method27808(RenderSystem::method27804);
      field31730.field32405.method35529();
   }

   public static void method23711() {
      RenderSystem.method27808(RenderSystem::method27804);
      field31730.field32405.method35530();
   }

   public static void method23712(int var0) {
      RenderSystem.method27808(RenderSystem::method27804);
      if (var0 != field31730.field32407) {
         field31730.field32407 = var0;
         GL11.glDepthFunc(var0);
      }
   }

   public static void method23713(boolean var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 != field31730.field32406) {
         field31730.field32406 = var0;
         GL11.glDepthMask(var0);
      }
   }

   public static void method23714() {
      RenderSystem.method27808(RenderSystem::method27803);
      if (!field31749.method21055()) {
         field31729.field40550.method35529();
      } else {
         field31750.method27777();
      }
   }

   public static void method23715() {
      RenderSystem.method27808(RenderSystem::method27803);
      if (!field31749.method21055()) {
         field31729.field40550.method35530();
      } else {
         field31750.method27776();
      }
   }

   public static void method23716(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (!field31749.method21055()) {
         if (var0 != field31729.field40551 || var1 != field31729.field40552 || var0 != field31729.field40553 || var1 != field31729.field40554) {
            field31729.field40551 = var0;
            field31729.field40552 = var1;
            field31729.field40553 = var0;
            field31729.field40554 = var1;
            if (Class7944.method26921()) {
               Shaders.field40772.method12249(var0, var1, var0, var1);
            }

            GL11.glBlendFunc(var0, var1);
         }
      } else {
         field31750.method27778(var0, var1);
      }
   }

   public static void method23717(int var0, int var1, int var2, int var3) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (!field31749.method21055()) {
         if (var0 != field31729.field40551 || var1 != field31729.field40552 || var2 != field31729.field40553 || var3 != field31729.field40554) {
            field31729.field40551 = var0;
            field31729.field40552 = var1;
            field31729.field40553 = var2;
            field31729.field40554 = var3;
            if (Class7944.method26921()) {
               Shaders.field40772.method12249(var0, var1, var2, var3);
            }

            method23762(var0, var1, var2, var3);
         }
      } else {
         field31750.method27779(var0, var1, var2, var3);
      }
   }

   public static void method23718(float var0, float var1, float var2, float var3) {
      GL14.glBlendColor(var0, var1, var2, var3);
   }

   public static void method23719(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL14.glBlendEquation(var0);
   }

   public static String method23720(GLCapabilities var0) {
      RenderSystem.method27808(RenderSystem::method27809);
      Class7944.method26780();
      field31758 = var0.OpenGL31;
      if (!field31758) {
         field31760 = 36662;
         field31761 = 36663;
      } else {
         field31760 = 36662;
         field31761 = 36663;
      }

      if (!var0.OpenGL15) {
         field31762 = 34962;
         field31763 = 35044;
      } else {
         field31762 = 34962;
         field31763 = 35044;
      }

      boolean var3 = field31758 || var0.GL_ARB_copy_buffer;
      boolean var4 = var0.OpenGL14;
      field31759 = var3 && var4;
      if (!field31759) {
         ArrayList var5 = new ArrayList();
         if (!var3) {
            var5.add("OpenGL 1.3, ARB_copy_buffer");
         }

         if (!var4) {
            var5.add("OpenGL 1.4");
         }

         String var6 = "VboRegions not supported, missing: " + Class7944.method26852(var5);
         Class7944.method26810(var6);
         var5.add(var6);
      }

      if (!var0.OpenGL30) {
         if (!var0.GL_EXT_framebuffer_blit) {
            field31746 = Class2337.field15980;
         } else {
            field31746 = Class2337.field15979;
         }
      } else {
         field31746 = Class2337.field15978;
      }

      if (!var0.OpenGL30) {
         if (!var0.GL_ARB_framebuffer_object) {
            if (!var0.GL_EXT_framebuffer_object) {
               throw new IllegalStateException("Could not initialize framebuffer support.");
            } else {
               field31745 = Class2065.field13462;
               Class8821.field39775 = 36160;
               Class8821.field39776 = 36161;
               Class8821.field39777 = 36064;
               Class8821.field39778 = 36096;
               Class8821.field39779 = 36053;
               Class8821.field39781 = 36055;
               Class8821.field39780 = 36054;
               Class8821.field39782 = 36059;
               Class8821.field39783 = 36060;
               return "EXT_framebuffer_object extension";
            }
         } else {
            field31745 = Class2065.field13461;
            Class8821.field39775 = 36160;
            Class8821.field39776 = 36161;
            Class8821.field39777 = 36064;
            Class8821.field39778 = 36096;
            Class8821.field39779 = 36053;
            Class8821.field39781 = 36055;
            Class8821.field39780 = 36054;
            Class8821.field39782 = 36059;
            Class8821.field39783 = 36060;
            return "ARB_framebuffer_object extension";
         }
      } else {
         field31745 = Class2065.field13460;
         Class8821.field39775 = 36160;
         Class8821.field39776 = 36161;
         Class8821.field39777 = 36064;
         Class8821.field39778 = 36096;
         Class8821.field39779 = 36053;
         Class8821.field39780 = 36054;
         Class8821.field39781 = 36055;
         Class8821.field39782 = 36059;
         Class8821.field39783 = 36060;
         return "OpenGL 3.0";
      }
   }

   public static int method23721(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      return GL20.glGetProgrami(var0, var1);
   }

   public static void method23722(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glAttachShader(var0, var1);
   }

   public static void method23723(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glDeleteShader(var0);
   }

   public static int method23724(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      return GL20.glCreateShader(var0);
   }

   public static void method23725(int var0, CharSequence var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glShaderSource(var0, var1);
   }

   public static void method23726(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glCompileShader(var0);
   }

   public static int method23727(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      return GL20.glGetShaderi(var0, var1);
   }

   public static void method23728(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUseProgram(var0);
   }

   public static int method23729() {
      RenderSystem.method27808(RenderSystem::method27803);
      return GL20.glCreateProgram();
   }

   public static void method23730(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glDeleteProgram(var0);
   }

   public static void method23731(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glLinkProgram(var0);
   }

   public static int method23732(int var0, CharSequence var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      return GL20.glGetUniformLocation(var0, var1);
   }

   public static void method23733(int var0, IntBuffer var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUniform1iv(var0, var1);
   }

   public static void method23734(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUniform1i(var0, var1);
   }

   public static void method23735(int var0, FloatBuffer var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUniform1fv(var0, var1);
   }

   public static void method23736(int var0, IntBuffer var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUniform2iv(var0, var1);
   }

   public static void method23737(int var0, FloatBuffer var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUniform2fv(var0, var1);
   }

   public static void method23738(int var0, IntBuffer var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUniform3iv(var0, var1);
   }

   public static void method23739(int var0, FloatBuffer var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUniform3fv(var0, var1);
   }

   public static void method23740(int var0, IntBuffer var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUniform4iv(var0, var1);
   }

   public static void method23741(int var0, FloatBuffer var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUniform4fv(var0, var1);
   }

   public static void method23742(int var0, boolean var1, FloatBuffer var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUniformMatrix2fv(var0, var1, var2);
   }

   public static void method23743(int var0, boolean var1, FloatBuffer var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUniformMatrix3fv(var0, var1, var2);
   }

   public static void method23744(int var0, boolean var1, FloatBuffer var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glUniformMatrix4fv(var0, var1, var2);
   }

   public static int method23745(int var0, CharSequence var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      return GL20.glGetAttribLocation(var0, var1);
   }

   public static int method23746() {
      RenderSystem.method27808(RenderSystem::method27804);
      return GL15.glGenBuffers();
   }

   public static void method23747(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL15.glBindBuffer(var0, var1);
   }

   public static void method23748(int var0, ByteBuffer var1, int var2) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL15.glBufferData(var0, var1, var2);
   }

   public static void method23749(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL15.glDeleteBuffers(var0);
   }

   public static void method23750(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL20.glCopyTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static void method23751(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27804);
      switch (Class9579.field44781[field31745.ordinal()]) {
         case 1:
            GL30.glBindFramebuffer(var0, var1);
            break;
         case 2:
            ARBFramebufferObject.glBindFramebuffer(var0, var1);
            break;
         case 3:
            EXTFramebufferObject.glBindFramebufferEXT(var0, var1);
      }
   }

   public static int method23752() {
      RenderSystem.method27808(RenderSystem::method27804);
      switch (Class9579.field44781[field31745.ordinal()]) {
         case 1:
            if (GL30.glGetFramebufferAttachmentParameteri(36160, 36096, 36048) == 5890) {
               return GL30.glGetFramebufferAttachmentParameteri(36160, 36096, 36049);
            }
            break;
         case 2:
            if (ARBFramebufferObject.glGetFramebufferAttachmentParameteri(36160, 36096, 36048) == 5890) {
               return ARBFramebufferObject.glGetFramebufferAttachmentParameteri(36160, 36096, 36049);
            }
            break;
         case 3:
            if (EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT(36160, 36096, 36048) == 5890) {
               return EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT(36160, 36096, 36049);
            }
      }

      return 0;
   }

   public static void method23753(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      RenderSystem.method27808(RenderSystem::method27804);
      switch (Class9579.field44782[field31746.ordinal()]) {
         case 1:
            GL30.glBlitFramebuffer(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
            break;
         case 2:
            EXTFramebufferBlit.glBlitFramebufferEXT(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
         case 3:
      }
   }

   public static void method23754(int var0) {
      RenderSystem.method27808(RenderSystem::method27804);
      switch (Class9579.field44781[field31745.ordinal()]) {
         case 1:
            GL30.glDeleteFramebuffers(var0);
            break;
         case 2:
            ARBFramebufferObject.glDeleteFramebuffers(var0);
            break;
         case 3:
            EXTFramebufferObject.glDeleteFramebuffersEXT(var0);
      }
   }

   public static int method23755() {
      RenderSystem.method27808(RenderSystem::method27804);
      switch (Class9579.field44781[field31745.ordinal()]) {
         case 1:
            return GL30.glGenFramebuffers();
         case 2:
            return ARBFramebufferObject.glGenFramebuffers();
         case 3:
            return EXTFramebufferObject.glGenFramebuffersEXT();
         default:
            return -1;
      }
   }

   public static int method23756(int var0) {
      RenderSystem.method27808(RenderSystem::method27804);
      switch (Class9579.field44781[field31745.ordinal()]) {
         case 1:
            return GL30.glCheckFramebufferStatus(var0);
         case 2:
            return ARBFramebufferObject.glCheckFramebufferStatus(var0);
         case 3:
            return EXTFramebufferObject.glCheckFramebufferStatusEXT(var0);
         default:
            return -1;
      }
   }

   public static void method23757(int var0, int var1, int var2, int var3, int var4) {
      RenderSystem.method27808(RenderSystem::method27804);
      switch (Class9579.field44781[field31745.ordinal()]) {
         case 1:
            GL30.glFramebufferTexture2D(var0, var1, var2, var3, var4);
            break;
         case 2:
            ARBFramebufferObject.glFramebufferTexture2D(var0, var1, var2, var3, var4);
            break;
         case 3:
            EXTFramebufferObject.glFramebufferTexture2DEXT(var0, var1, var2, var3, var4);
      }
   }

   @Deprecated
   public static int method23758() {
      return field31740[field31739].field40430;
   }

   public static void method23759(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL13.glActiveTexture(var0);
   }

   @Deprecated
   public static void method23760(int var0) {
      if (var0 != field31754) {
         RenderSystem.method27808(RenderSystem::method27803);
         GL13.glClientActiveTexture(var0);
         field31754 = var0;
      }
   }

   @Deprecated
   public static void method23761(int var0, float var1, float var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL13.glMultiTexCoord2f(var0, var1, var2);
      if (var0 == 33986) {
         field31756 = var1;
         field31757 = var2;
      }
   }

   public static void method23762(int var0, int var1, int var2, int var3) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL14.glBlendFuncSeparate(var0, var1, var2, var3);
   }

   public static String method23763(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      return GL20.glGetShaderInfoLog(var0, var1);
   }

   public static String method23764(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      return GL20.glGetProgramInfoLog(var0, var1);
   }

   public static void method23765() {
      RenderSystem.method27808(RenderSystem::method27803);
      method23806(8960, 8704, 34160);
      method23769(7681, 34168);
   }

   public static void method23766() {
      RenderSystem.method27808(RenderSystem::method27803);
      method23806(8960, 8704, 8448);
      method23770(8448, 5890, 34168, 34166);
   }

   public static void method23767(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      method23803(33985);
      method23804();
      method23830(5890);
      method23831();
      float var4 = 1.0F / (float)(var1 - 1);
      method23837(var4, var4, var4);
      method23830(5888);
      method23814(var0);
      method23808(3553, 10241, 9728);
      method23808(3553, 10240, 9728);
      method23808(3553, 10242, 10496);
      method23808(3553, 10243, 10496);
      method23806(8960, 8704, 34160);
      method23770(34165, 34168, 5890, 5890);
      method23771(7681, 34168);
      method23803(33984);
   }

   public static void method23768() {
      RenderSystem.method27808(RenderSystem::method27803);
      method23803(33985);
      method23805();
      method23803(33984);
   }

   private static void method23769(int var0, int var1) {
      method23806(8960, 34161, var0);
      method23806(8960, 34176, var1);
      method23806(8960, 34192, 768);
   }

   private static void method23770(int var0, int var1, int var2, int var3) {
      method23806(8960, 34161, var0);
      method23806(8960, 34176, var1);
      method23806(8960, 34192, 768);
      method23806(8960, 34177, var2);
      method23806(8960, 34193, 768);
      method23806(8960, 34178, var3);
      method23806(8960, 34194, 770);
   }

   private static void method23771(int var0, int var1) {
      method23806(8960, 34162, var0);
      method23806(8960, 34184, var1);
      method23806(8960, 34200, 770);
   }

   public static void method23772(Class7680 var0, Class7680 var1, Class9367 var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      method23832();
      method23831();
      method23700(0);
      method23700(1);
      Class7755 var5 = new Class7755(var0);
      var5.method25709(var2);
      method23704(16384, 4611, method23775(var5.method25701(), var5.method25702(), var5.method25703(), 0.0F));
      float var6 = 0.6F;
      method23704(16384, 4609, method23775(0.6F, 0.6F, 0.6F, 1.0F));
      method23704(16384, 4608, method23775(0.0F, 0.0F, 0.0F, 1.0F));
      method23704(16384, 4610, method23775(0.0F, 0.0F, 0.0F, 1.0F));
      Class7755 var7 = new Class7755(var1);
      var7.method25709(var2);
      method23704(16385, 4611, method23775(var7.method25701(), var7.method25702(), var7.method25703(), 0.0F));
      method23704(16385, 4609, method23775(0.6F, 0.6F, 0.6F, 1.0F));
      method23704(16385, 4608, method23775(0.0F, 0.0F, 0.0F, 1.0F));
      method23704(16385, 4610, method23775(0.0F, 0.0F, 0.0F, 1.0F));
      method23818(7424);
      float var8 = 0.4F;
      method23705(2899, method23775(0.4F, 0.4F, 0.4F, 1.0F));
      method23833();
   }

   public static void method23773(Class7680 var0, Class7680 var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      Class9367 var4 = new Class9367();
      var4.method35503();
      var4.method35508(Class9367.method35515(1.0F, -1.0F, 1.0F));
      var4.method35509(Class7680.field32900.method25286(-22.5F));
      var4.method35509(Class7680.field32898.method25286(135.0F));
      method23772(var0, var1, var4);
   }

   public static void method23774(Class7680 var0, Class7680 var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      Class9367 var4 = new Class9367();
      var4.method35503();
      var4.method35509(Class7680.field32900.method25286(62.0F));
      var4.method35509(Class7680.field32898.method25286(185.5F));
      var4.method35508(Class9367.method35515(1.0F, -1.0F, 1.0F));
      var4.method35509(Class7680.field32900.method25286(-22.5F));
      var4.method35509(Class7680.field32898.method25286(135.0F));
      method23772(var0, var1, var4);
   }

   private static FloatBuffer method23775(float var0, float var1, float var2, float var3) {
      ((Buffer)field31738).clear();
      field31738.put(var0).put(var1).put(var2).put(var3);
      ((Buffer)field31738).flip();
      return field31738;
   }

   public static void method23776() {
      method23800(Class2164.field14210, 9216);
      method23800(Class2164.field14211, 9216);
      method23800(Class2164.field14212, 9216);
      method23801(Class2164.field14210, 9474, method23775(1.0F, 0.0F, 0.0F, 0.0F));
      method23801(Class2164.field14211, 9474, method23775(0.0F, 1.0F, 0.0F, 0.0F));
      method23801(Class2164.field14212, 9474, method23775(0.0F, 0.0F, 1.0F, 0.0F));
      method23798(Class2164.field14210);
      method23798(Class2164.field14211);
      method23798(Class2164.field14212);
   }

   public static void method23777() {
      method23799(Class2164.field14210);
      method23799(Class2164.field14211);
      method23799(Class2164.field14212);
   }

   public static void method23778() {
      method23834(2983, field31724);
      method23841(field31724);
      method23834(2982, field31724);
      method23841(field31724);
   }

   @Deprecated
   public static void method23779() {
      if (field31764) {
         RenderSystem.method27808(RenderSystem::method27803);
         field31731.field44792.method35530();
      }
   }

   @Deprecated
   public static void method23780() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31731.field44792.method35529();
   }

   @Deprecated
   public static void method23781(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 != field31731.field44793) {
         field31731.field44793 = var0;
         method23786(2917, var0);
         if (Class7944.method26921()) {
            Shaders.method33046(var0);
         }
      }
   }

   @Deprecated
   public static void method23782(float var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 < 0.0F) {
         var0 = 0.0F;
      }

      if (var0 != field31731.field44794) {
         field31731.field44794 = var0;
         GL11.glFogf(2914, var0);
         if (Class7944.method26921()) {
            Shaders.method33124(var0);
         }
      }
   }

   @Deprecated
   public static void method23783(float var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 != field31731.field44795) {
         field31731.field44795 = var0;
         GL11.glFogf(2915, var0);
      }
   }

   @Deprecated
   public static void method23784(float var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 != field31731.field44796) {
         field31731.field44796 = var0;
         GL11.glFogf(2916, var0);
      }
   }

   @Deprecated
   public static void method23785(int var0, float[] var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glFogfv(var0, var1);
   }

   @Deprecated
   public static void method23786(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glFogi(var0, var1);
   }

   public static void method23787() {
      RenderSystem.method27808(RenderSystem::method27803);
      if (!field31751.method21055()) {
         field31732.field26226.method35530();
      } else {
         field31752.method38748();
      }
   }

   public static void method23788() {
      RenderSystem.method27808(RenderSystem::method27803);
      if (!field31751.method21055()) {
         field31732.field26226.method35529();
      } else {
         field31752.method38749();
      }
   }

   public static void method23789(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glPolygonMode(var0, var1);
   }

   public static void method23790() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31733.field30682.method35530();
   }

   public static void method23791() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31733.field30682.method35529();
   }

   public static void method23792() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31733.field30683.method35530();
   }

   public static void method23793() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31733.field30683.method35529();
   }

   public static void method23794(float var0, float var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 != field31733.field30684 || var1 != field31733.field30685) {
         field31733.field30684 = var0;
         field31733.field30685 = var1;
         GL11.glPolygonOffset(var0, var1);
      }
   }

   public static void method23795() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31734.field33643.method35530();
   }

   public static void method23796() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31734.field33643.method35529();
   }

   public static void method23797(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 != field31734.field33644) {
         field31734.field33644 = var0;
         GL11.glLogicOp(var0);
      }
   }

   @Deprecated
   public static void method23798(Class2164 var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      method23802(var0).field45814.method35530();
   }

   @Deprecated
   public static void method23799(Class2164 var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      method23802(var0).field45814.method35529();
   }

   @Deprecated
   public static void method23800(Class2164 var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      Class9796 var4 = method23802(var0);
      if (var1 != var4.field45816) {
         var4.field45816 = var1;
         GL11.glTexGeni(var4.field45815, 9472, var1);
      }
   }

   @Deprecated
   public static void method23801(Class2164 var0, int var1, FloatBuffer var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glTexGenfv(method23802(var0).field45815, var1, var2);
   }

   @Deprecated
   private static Class9796 method23802(Class2164 var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      switch (Class9579.field44783[var0.ordinal()]) {
         case 1:
            return field31735.field21851;
         case 2:
            return field31735.field21852;
         case 3:
            return field31735.field21853;
         case 4:
            return field31735.field21854;
         default:
            return field31735.field21851;
      }
   }

   public static void method23803(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (field31739 != var0 - 33984) {
         field31739 = var0 - 33984;
         method23759(var0);
      }
   }

   public static void method23804() {
      RenderSystem.method27808(RenderSystem::method27804);
      field31740[field31739].field40429.method35530();
   }

   public static void method23805() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31740[field31739].field40429.method35529();
   }

   @Deprecated
   public static void method23806(int var0, int var1, int var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glTexEnvi(var0, var1, var2);
   }

   public static void method23807(int var0, int var1, float var2) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL11.glTexParameterf(var0, var1, var2);
   }

   public static void method23808(int var0, int var1, int var2) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL11.glTexParameteri(var0, var1, var2);
   }

   public static int method23809(int var0, int var1, int var2) {
      RenderSystem.method27808(RenderSystem::method27809);
      return GL11.glGetTexLevelParameteri(var0, var1, var2);
   }

   public static int method23810() {
      RenderSystem.method27808(RenderSystem::method27804);
      return GL11.glGenTextures();
   }

   public static void method23811(int[] var0) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL11.glGenTextures(var0);
   }

   public static void method23812(int var0) {
      RenderSystem.method27808(RenderSystem::method27804);
      if (var0 != 0) {
         GL11.glDeleteTextures(var0);

         for (Class8938 var6 : field31740) {
            if (var6.field40430 == var0) {
               var6.field40430 = 0;
            }
         }
      }
   }

   public static void method23813(int[] var0) {
      RenderSystem.method27808(RenderSystem::method27804);

      for (Class8938 var6 : field31740) {
         for (int var10 : var0) {
            if (var6.field40430 == var10) {
               var6.field40430 = -1;
            }
         }
      }

      GL11.glDeleteTextures(var0);
   }

   public static void method23814(int var0) {
      RenderSystem.method27808(RenderSystem::method27804);
      if (var0 != field31740[field31739].field40430) {
         field31740[field31739].field40430 = var0;
         GL11.glBindTexture(3553, var0);
         if (Class4501.method14213()) {
            Class4501.method14219(var0);
         }
      }
   }

   public static void method23815(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, IntBuffer var8) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL11.glTexImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void method23816(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL11.glTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void method23817(int var0, int var1, int var2, int var3, long var4) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glGetTexImage(var0, var1, var2, var3, var4);
   }

   @Deprecated
   public static void method23818(int var0) {
      RenderSystem.method27808(RenderSystem::method27804);
      if (var0 != field31741) {
         field31741 = var0;
         GL11.glShadeModel(var0);
      }
   }

   @Deprecated
   public static void method23819() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31742.method35530();
   }

   @Deprecated
   public static void method23820() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31742.method35529();
   }

   public static void method23821(int var0, int var1, int var2, int var3) {
      RenderSystem.method27808(RenderSystem::method27804);
      Class2342.field16012.field16013 = var0;
      Class2342.field16012.field16014 = var1;
      Class2342.field16012.field16015 = var2;
      Class2342.field16012.field16016 = var3;
      GL11.glViewport(var0, var1, var2, var3);
   }

   public static void method23822(boolean var0, boolean var1, boolean var2, boolean var3) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 != field31743.field36346 || var1 != field31743.field36347 || var2 != field31743.field36348 || var3 != field31743.field36349) {
         field31743.field36346 = var0;
         field31743.field36347 = var1;
         field31743.field36348 = var2;
         field31743.field36349 = var3;
         GL11.glColorMask(var0, var1, var2, var3);
      }
   }

   public static void method23823(int var0, int var1, int var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 != field31736.field41162.field35856 || var0 != field31736.field41162.field35857 || var0 != field31736.field41162.field35858) {
         field31736.field41162.field35856 = var0;
         field31736.field41162.field35857 = var1;
         field31736.field41162.field35858 = var2;
         GL11.glStencilFunc(var0, var1, var2);
      }
   }

   public static void method23824(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 != field31736.field41163) {
         field31736.field41163 = var0;
         GL11.glStencilMask(var0);
      }
   }

   public static void method23825(int var0, int var1, int var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 != field31736.field41164 || var1 != field31736.field41165 || var2 != field31736.field41166) {
         field31736.field41164 = var0;
         field31736.field41165 = var1;
         field31736.field41166 = var2;
         GL11.glStencilOp(var0, var1, var2);
      }
   }

   public static void method23826(double var0) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL11.glClearDepth(var0);
   }

   public static void method23827(float var0, float var1, float var2, float var3) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL11.glClearColor(var0, var1, var2, var3);
   }

   public static void method23828(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glClearStencil(var0);
   }

   public static void method23829(int var0, boolean var1) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL11.glClear(var0);
      if (var1) {
         method23859();
      }
   }

   @Deprecated
   public static void method23830(int var0) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL11.glMatrixMode(var0);
   }

   @Deprecated
   public static void method23831() {
      RenderSystem.method27808(RenderSystem::method27804);
      GL11.glLoadIdentity();
   }

   @Deprecated
   public static void method23832() {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glPushMatrix();
   }

   @Deprecated
   public static void method23833() {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glPopMatrix();
   }

   @Deprecated
   public static void method23834(int var0, FloatBuffer var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glGetFloatv(var0, var1);
   }

   @Deprecated
   public static void method23835(double var0, double var2, double var4, double var6, double var8, double var10) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glOrtho(var0, var2, var4, var6, var8, var10);
   }

   @Deprecated
   public static void method23836(float var0, float var1, float var2, float var3) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glRotatef(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method23837(float var0, float var1, float var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glScalef(var0, var1, var2);
   }

   @Deprecated
   public static void method23838(double var0, double var2, double var4) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glScaled(var0, var2, var4);
   }

   @Deprecated
   public static void method23839(float var0, float var1, float var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glTranslatef(var0, var1, var2);
   }

   @Deprecated
   public static void method23840(double var0, double var2, double var4) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glTranslated(var0, var2, var4);
   }

   @Deprecated
   public static void method23841(FloatBuffer var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glMultMatrixf(var0);
   }

   @Deprecated
   public static void method23842(Class9367 var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      var0.method35502(field31724);
      ((Buffer)field31724).rewind();
      method23841(field31724);
   }

   @Deprecated
   public static void method23843(float var0, float var1, float var2, float var3) {
      RenderSystem.method27808(RenderSystem::method27803);
      if (var0 != field31744.field43518 || var1 != field31744.field43519 || var2 != field31744.field43520 || var3 != field31744.field43521) {
         field31744.field43518 = var0;
         field31744.field43519 = var1;
         field31744.field43520 = var2;
         field31744.field43521 = var3;
         GL11.glColor4f(var0, var1, var2, var3);
      }
   }

   @Deprecated
   public static void method23844() {
      RenderSystem.method27808(RenderSystem::method27803);
      field31744.field43518 = -1.0F;
      field31744.field43519 = -1.0F;
      field31744.field43520 = -1.0F;
      field31744.field43521 = -1.0F;
   }

   @Deprecated
   public static void method23845(int var0, int var1, long var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glNormalPointer(var0, var1, var2);
   }

   @Deprecated
   public static void method23846(int var0, int var1, int var2, long var3) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glTexCoordPointer(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method23847(int var0, int var1, int var2, long var3) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glVertexPointer(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method23848(int var0, int var1, int var2, long var3) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glColorPointer(var0, var1, var2, var3);
   }

   public static void method23849(int var0, int var1, int var2, boolean var3, int var4, long var5) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glVertexAttribPointer(var0, var1, var2, var3, var4, var5);
   }

   @Deprecated
   public static void method23850(int var0) {
      if (!field31753) {
         RenderSystem.method27808(RenderSystem::method27803);
         GL11.glEnableClientState(var0);
      }
   }

   @Deprecated
   public static void method23851(int var0) {
      if (!field31753) {
         RenderSystem.method27808(RenderSystem::method27803);
         GL11.glDisableClientState(var0);
      }
   }

   public static void method23852(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glEnableVertexAttribArray(var0);
   }

   public static void method23853(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL20.glEnableVertexAttribArray(var0);
   }

   public static void method23854(int var0, int var1, int var2) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glDrawArrays(var0, var1, var2);
      if (Class7944.method26921() && !field31755) {
         int var5 = Shaders.field40848.method26491();
         if (var5 > 1) {
            for (int var6 = 1; var6 < var5; var6++) {
               Shaders.field40773.method12251(var6);
               GL11.glDrawArrays(var0, var1, var2);
            }

            Shaders.field40773.method12251(0);
         }
      }
   }

   public static void method23855(float var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glLineWidth(var0);
   }

   public static void method23856(int var0, int var1) {
      RenderSystem.method27808(RenderSystem::method27804);
      GL11.glPixelStorei(var0, var1);
   }

   public static void method23857(int var0, float var1) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glPixelTransferf(var0, var1);
   }

   public static void method23858(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      RenderSystem.method27808(RenderSystem::method27803);
      GL11.glReadPixels(var0, var1, var2, var3, var4, var5, var6);
   }

   public static int method23859() {
      RenderSystem.method27808(RenderSystem::method27803);
      return GL11.glGetError();
   }

   public static String method23860(int var0) {
      RenderSystem.method27808(RenderSystem::method27803);
      return GL11.glGetString(var0);
   }

   public static int method23861(int var0) {
      RenderSystem.method27808(RenderSystem::method27804);
      return GL11.glGetInteger(var0);
   }

   public static boolean method23862() {
      return field31746 != Class2337.field15980;
   }

   public static int method23863() {
      return 33984 + field31739;
   }

   public static void method23864() {
      GL11.glBindTexture(3553, field31740[field31739].field40430);
   }

   public static int method23865() {
      return field31740[field31739].field40430;
   }

   public static void method23866() {
      if (Class7944.method26797()) {
         int var2 = GL11.glGetInteger(34016);
         int var3 = GL11.glGetInteger(32873);
         int var4 = method23863();
         int var5 = method23865();
         if (var5 > 0 && (var2 != var4 || var3 != var5)) {
            Class7944.method26810("checkTexture: act: " + var4 + ", glAct: " + var2 + ", tex: " + var5 + ", glTex: " + var3);
         }
      }
   }

   public static void method23867(IntBuffer var0) {
      ((Buffer)var0).rewind();

      while (var0.position() < var0.limit()) {
         int var3 = var0.get();
         method23812(var3);
      }

      ((Buffer)var0).rewind();
   }

   public static boolean method23868() {
      return Class9368.method35532(field31731.field44792);
   }

   public static void method23869(boolean var0) {
      field31731.field44792.method35531(var0);
   }

   public static void method23870(Class7675 var0) {
      if (!field31747.method21055()) {
         method23872(field31748);
         method23873(var0);
         field31747.method21053();
      }
   }

   public static void method23871() {
      if (field31747.method21054()) {
         method23873(field31748);
      }
   }

   public static void method23872(Class7675 var0) {
      if (!field31747.method21055()) {
         var0.method25207(Class9368.method35532(field31725.field39453), field31725.field39454, field31725.field39455);
      } else {
         var0.method25208(field31748);
      }
   }

   public static void method23873(Class7675 var0) {
      if (!field31747.method21055()) {
         field31725.field39453.method35531(var0.method25213());
         method23697(var0.method25214(), var0.method25215());
      } else {
         field31748.method25208(var0);
      }
   }

   public static void method23874(Class8069 var0) {
      if (!field31749.method21055()) {
         method23876(field31750);
         method23877(var0);
         field31749.method21053();
      }
   }

   public static void method23875() {
      if (field31749.method21054()) {
         method23877(field31750);
      }
   }

   public static void method23876(Class8069 var0) {
      if (!field31749.method21055()) {
         var0.method27773(
            Class9368.method35532(field31729.field40550), field31729.field40551, field31729.field40552, field31729.field40553, field31729.field40554
         );
      } else {
         var0.method27774(field31750);
      }
   }

   public static void method23877(Class8069 var0) {
      if (!field31749.method21055()) {
         field31729.field40550.method35531(var0.method27780());
         if (var0.method27785()) {
            method23717(var0.method27781(), var0.method27782(), var0.method27783(), var0.method27784());
         } else {
            method23716(var0.method27781(), var0.method27782());
         }
      } else {
         field31750.method27774(var0);
      }
   }

   public static void method23878(Class9816 var0) {
      if (!field31751.method21055()) {
         method23880(field31752);
         method23881(var0);
         field31751.method21053();
      }
   }

   public static void method23879() {
      if (field31751.method21054()) {
         method23881(field31752);
      }
   }

   public static void method23880(Class9816 var0) {
      if (!field31751.method21055()) {
         var0.method38744(Class9368.method35532(field31732.field26226), field31732.field26227);
      } else {
         var0.method38745(field31752);
      }
   }

   public static void method23881(Class9816 var0) {
      if (!field31751.method21055()) {
         field31732.field26226.method35531(var0.method38750());
         field31732.field26227 = var0.method38751();
      } else {
         field31752.method38745(var0);
      }
   }

   public static void method23882(int var0, IntBuffer var1, IntBuffer var2) {
      GL14.glMultiDrawArrays(var0, var1, var2);
      if (Class7944.method26921() && !field31755) {
         int var5 = Shaders.field40848.method26491();
         if (var5 > 1) {
            for (int var6 = 1; var6 < var5; var6++) {
               Shaders.field40773.method12251(var6);
               GL14.glMultiDrawArrays(var0, var1, var2);
            }

            Shaders.field40773.method12251(0);
         }
      }
   }

   public static void method23883(int var0) {
      method23829(var0, false);
   }

   public static void method23884(IntBuffer var0) {
      GL11.glCallLists(var0);
      if (Class7944.method26921() && !field31755) {
         int var3 = Shaders.field40848.method26491();
         if (var3 > 1) {
            for (int var4 = 1; var4 < var3; var4++) {
               Shaders.field40773.method12251(var4);
               GL11.glCallLists(var0);
            }

            Shaders.field40773.method12251(0);
         }
      }
   }

   public static void method23885(int var0, long var1, int var3) {
      GL15.glBufferData(var0, var1, var3);
   }

   public static void method23886(int var0, long var1, ByteBuffer var3) {
      GL15.glBufferSubData(var0, var1, var3);
   }

   public static void method23887(int var0, int var1, long var2, long var4, long var6) {
      if (!field31758) {
         ARBCopyBuffer.glCopyBufferSubData(var0, var1, var2, var4, var6);
      } else {
         GL31.glCopyBufferSubData(var0, var1, var2, var4, var6);
      }
   }

   public static boolean method23888() {
      return field31764;
   }

   public static void method23889(boolean var0) {
      field31764 = var0;
   }

   public static void method23890() {
      field31753 = true;
   }

   public static void method23891() {
      field31753 = false;
   }
}
