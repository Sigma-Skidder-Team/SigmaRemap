package mapped;

import com.google.common.base.Charsets;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import net.minecraft.util.text.TextProcessing;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.system.MemoryUtil;

public class Class7124 {
   private final ByteBuffer field30649 = BufferUtils.createByteBuffer(8192);

   public String method22228(long var1, GLFWErrorCallbackI var3) {
      GLFWErrorCallback var6 = GLFW.glfwSetErrorCallback(var3);
      String var7 = GLFW.glfwGetClipboardString(var1);
      var7 = var7 == null ? "" : TextProcessing.func_238338_a_(var7);
      GLFWErrorCallback var8 = GLFW.glfwSetErrorCallback(var6);
      if (var8 != null) {
         var8.free();
      }

      return var7;
   }

   private static void method22229(long var0, ByteBuffer var2, byte[] var3) {
      ((Buffer)var2).clear();
      var2.put(var3);
      var2.put((byte)0);
      ((Buffer)var2).flip();
      GLFW.glfwSetClipboardString(var0, var2);
   }

   public void method22230(long var1, String var3) {
      byte[] var6 = var3.getBytes(Charsets.UTF_8);
      int var7 = var6.length + 1;
      if (var7 < this.field30649.capacity()) {
         method22229(var1, this.field30649, var6);
      } else {
         ByteBuffer var8 = MemoryUtil.memAlloc(var7);

         try {
            method22229(var1, var8, var6);
         } finally {
            MemoryUtil.memFree(var8);
         }
      }
   }
}
