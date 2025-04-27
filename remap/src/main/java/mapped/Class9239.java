// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.Buffer;
import org.lwjgl.system.MemoryUtil;
import com.google.common.base.Charsets;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.BufferUtils;
import java.nio.ByteBuffer;

public class Class9239
{
    private final ByteBuffer field39624;
    
    public Class9239() {
        this.field39624 = BufferUtils.createByteBuffer(8192);
    }
    
    public String method34063(final long n, final GLFWErrorCallbackI glfwErrorCallbackI) {
        final GLFWErrorCallback glfwSetErrorCallback = GLFW.glfwSetErrorCallback(glfwErrorCallbackI);
        final String glfwGetClipboardString = GLFW.glfwGetClipboardString(n);
        final String s = (glfwGetClipboardString == null) ? "" : Class9528.method35578(glfwGetClipboardString);
        final GLFWErrorCallback glfwSetErrorCallback2 = GLFW.glfwSetErrorCallback(glfwSetErrorCallback);
        if (glfwSetErrorCallback2 != null) {
            glfwSetErrorCallback2.free();
        }
        return s;
    }
    
    private static void method34064(final long n, final ByteBuffer byteBuffer, final byte[] src) {
        byteBuffer.clear();
        byteBuffer.put(src);
        byteBuffer.put((byte)0);
        byteBuffer.flip();
        GLFW.glfwSetClipboardString(n, byteBuffer);
    }
    
    public void method34065(final long n, final String s) {
        final byte[] bytes = s.getBytes(Charsets.UTF_8);
        final int n2 = bytes.length + 1;
        if (n2 < this.field39624.capacity()) {
            method34064(n, this.field39624, bytes);
        }
        else {
            final ByteBuffer memAlloc = MemoryUtil.memAlloc(n2);
            try {
                method34064(n, memAlloc, bytes);
            }
            finally {
                MemoryUtil.memFree(memAlloc);
            }
        }
    }
}
