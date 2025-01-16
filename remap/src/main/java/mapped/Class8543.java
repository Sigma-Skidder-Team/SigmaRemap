// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;

import java.util.function.Consumer;
import java.util.function.Supplier;
import org.lwjgl.opengl.GL11;
import oshi.hardware.Processor;
import oshi.SystemInfo;
import org.lwjgl.opengl.GL;
import java.util.Iterator;
import org.lwjgl.glfw.GLFWErrorCallback;
import java.util.ArrayList;
import com.google.common.base.Joiner;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import com.google.common.collect.Lists;
import java.util.function.LongSupplier;
import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFW;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class8543
{
    private static final Logger field35881;
    private static String field35882;
    private static String field35883;
    private static final Map<Integer, String> field35884;
    
    public static String method28662() {
        RenderSystem.method29989(RenderSystem::method29984);
        return (GLFW.glfwGetCurrentContext() != 0L) ? (Class8933.method31663(7937) + " GL version " + Class8933.method31663(7938) + ", " + Class8933.method31663(7936)) : "NO CONTEXT";
    }
    
    public static int method28663(final Class1925 class1925) {
        RenderSystem.method29989(RenderSystem::method29984);
        long n = GLFW.glfwGetWindowMonitor(class1925.method7690());
        if (n == 0L) {
            n = GLFW.glfwGetPrimaryMonitor();
        }
        final GLFWVidMode glfwVidMode = (n != 0L) ? GLFW.glfwGetVideoMode(n) : null;
        return (glfwVidMode != null) ? glfwVidMode.refreshRate() : 0;
    }
    
    public static String method28664() {
        RenderSystem.method29989(RenderSystem::method29990);
        return Version.getVersion();
    }
    
    public static LongSupplier method28665() {
        RenderSystem.method29989(RenderSystem::method29990);
        Class1925.method7664((n, s) -> {
            new IllegalStateException(String.format("GLFW error before init: [0x%X]%s", n, s));
            throw;
        });
        final ArrayList arrayList = Lists.newArrayList();
        final GLFWErrorCallback glfwSetErrorCallback = GLFW.glfwSetErrorCallback((i, l) -> arrayList.add(String.format("GLFW error during init: [0x%X]%s", i, l)));
        if (GLFW.glfwInit()) {
            final LongSupplier longSupplier = () -> (long)(GLFW.glfwGetTime() * 1.0E9);
            final Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                Class8543.field35881.error("GLFW error collected during initialization: {}", (Object)iterator.next());
            }
            RenderSystem.method30081((GLFWErrorCallbackI)glfwSetErrorCallback);
            return longSupplier;
        }
        throw new IllegalStateException("Failed to initialize GLFW, errors: " + Joiner.on(",").join((Iterable)arrayList));
    }
    
    public static void method28666(final GLFWErrorCallbackI glfwErrorCallbackI) {
        RenderSystem.method29989(RenderSystem::method29990);
        final GLFWErrorCallback glfwSetErrorCallback = GLFW.glfwSetErrorCallback(glfwErrorCallbackI);
        if (glfwSetErrorCallback != null) {
            glfwSetErrorCallback.free();
        }
    }
    
    public static boolean method28667(final Class1925 class1925) {
        return GLFW.glfwWindowShouldClose(class1925.method7690());
    }
    
    public static void method28668() {
        RenderSystem.method29989(RenderSystem::method29984);
        if (GL.getCapabilities().GL_NV_fog_distance) {
            if (Config.method28841()) {
                Class8933.method31591(34138, 34139);
            }
            if (Config.method28842()) {
                Class8933.method31591(34138, 34140);
            }
        }
    }
    
    public static void method28669(final int n, final boolean b) {
        RenderSystem.method29989(RenderSystem::method29990);
        Class8543.field35882 = "Using framebuffer using " + Class8933.method31524(GL.getCapabilities());
        try {
            final Processor[] processors = new SystemInfo().getHardware().getProcessors();
            Class8543.field35883 = String.format("%dx %s", processors.length, processors[0]).replaceAll("\\s+", " ");
        }
        catch (final Throwable t) {}
        Class8489.method28353(n, b);
    }
    
    public static String method28670() {
        return Class8543.field35882;
    }
    
    public static String method28671() {
        return (Class8543.field35883 != null) ? Class8543.field35883 : "<unknown>";
    }
    
    public static void method28672(final int n, final boolean b, final boolean b2, final boolean b3) {
        RenderSystem.method29989(RenderSystem::method29984);
        Class8933.method31610();
        Class8933.method31517(false);
        final Tessellator method30116 = RenderSystem.method30116();
        final BufferBuilder method30117 = method30116.getBuffer();
        GL11.glLineWidth(4.0f);
        method30117.begin(1, DefaultVertexFormats.POSITION_COLOR);
        if (b) {
            method30117.pos(0.0, 0.0, 0.0).method12399(0, 0, 0, 255).endVertex();
            method30117.pos(n, 0.0, 0.0).method12399(0, 0, 0, 255).endVertex();
        }
        if (b2) {
            method30117.pos(0.0, 0.0, 0.0).method12399(0, 0, 0, 255).endVertex();
            method30117.pos(0.0, n, 0.0).method12399(0, 0, 0, 255).endVertex();
        }
        if (b3) {
            method30117.pos(0.0, 0.0, 0.0).method12399(0, 0, 0, 255).endVertex();
            method30117.pos(0.0, 0.0, n).method12399(0, 0, 0, 255).endVertex();
        }
        method30116.draw();
        GL11.glLineWidth(2.0f);
        method30117.begin(1, DefaultVertexFormats.POSITION_COLOR);
        if (b) {
            method30117.pos(0.0, 0.0, 0.0).method12399(255, 0, 0, 255).endVertex();
            method30117.pos(n, 0.0, 0.0).method12399(255, 0, 0, 255).endVertex();
        }
        if (b2) {
            method30117.pos(0.0, 0.0, 0.0).method12399(0, 255, 0, 255).endVertex();
            method30117.pos(0.0, n, 0.0).method12399(0, 255, 0, 255).endVertex();
        }
        if (b3) {
            method30117.pos(0.0, 0.0, 0.0).method12399(127, 127, 255, 255).endVertex();
            method30117.pos(0.0, 0.0, n).method12399(127, 127, 255, 255).endVertex();
        }
        method30116.draw();
        GL11.glLineWidth(1.0f);
        Class8933.method31517(true);
        Class8933.method31609();
    }
    
    public static String method28673(final int i) {
        return Class8543.field35884.get(i);
    }
    
    public static <T> T method28674(final Supplier<T> supplier) {
        return supplier.get();
    }
    
    public static <T> T method28675(final T t, final Consumer<T> consumer) {
        consumer.accept(t);
        return t;
    }
    
    public static boolean method28676() {
        return true;
    }
    
    public static boolean method28677() {
        return true;
    }
    
    static {
        field35881 = LogManager.getLogger();
        Class8543.field35882 = "";
        field35884 = method28675(Maps.newHashMap(), hashMap -> {
            hashMap.put(0, "No error");
            hashMap.put(1280, "Enum parameter is invalid for this function");
            hashMap.put(1281, "Parameter is invalid for this function");
            hashMap.put(1282, "Current state is invalid for this function");
            hashMap.put(1283, "Stack overflow");
            hashMap.put(1284, "Stack underflow");
            hashMap.put(1285, "Out of memory");
            hashMap.put(1286, "Operation on incomplete framebuffer");
            hashMap.put(1286, "Operation on incomplete framebuffer");
        });
    }
}
