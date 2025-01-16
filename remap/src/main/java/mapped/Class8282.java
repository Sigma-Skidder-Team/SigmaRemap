// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.glfw.GLFWMonitorCallback;
import org.lwjgl.glfw.GLFWMonitorCallbackI;

import javax.annotation.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;

public class Class8282
{
    private static String[] field34069;
    private final Long2ObjectMap<Class7646> field34070;
    private final Class8547 field34071;
    
    public Class8282(final Class8547 field34071) {
        this.field34070 = (Long2ObjectMap<Class7646>)new Long2ObjectOpenHashMap();
        RenderSystem.method29989(RenderSystem::method29990);
        this.field34071 = field34071;
        GLFW.glfwSetMonitorCallback(this::method27519);
        final PointerBuffer glfwGetMonitors = GLFW.glfwGetMonitors();
        if (glfwGetMonitors != null) {
            for (int i = 0; i < glfwGetMonitors.limit(); ++i) {
                final long value = glfwGetMonitors.get(i);
                this.field34070.put(value, (Object)field34071.method28693(value));
            }
        }
    }
    
    private void method27519(final long n, final int n2) {
        RenderSystem.method29989(RenderSystem::method29984);
        if (n2 != 262145) {
            if (n2 == 262146) {
                this.field34070.remove(n);
            }
        }
        else {
            this.field34070.put(n, (Object)this.field34071.method28693(n));
        }
    }
    
    @Nullable
    public Class7646 method27520(final long n) {
        RenderSystem.method29989(RenderSystem::method29990);
        return (Class7646)this.field34070.get(n);
    }
    
    @Nullable
    public Class7646 method27521(final Class1925 class1925) {
        final long glfwGetWindowMonitor = GLFW.glfwGetWindowMonitor(class1925.method7690());
        if (glfwGetWindowMonitor == 0L) {
            final int method7698 = class1925.method7698();
            final int n = method7698 + class1925.method7694();
            final int method7699 = class1925.method7699();
            final int n2 = method7699 + class1925.method7695();
            int n3 = -1;
            Class7646 class1926 = null;
            for (final Class7646 class1927 : this.field34070.values()) {
                final int method7700 = class1927.method24209();
                final int n4 = method7700 + class1927.method24208().method29719();
                final int method7701 = class1927.method24210();
                final int n5 = method7701 + class1927.method24208().method29720();
                final int n6 = Math.max(0, method27522(n, method7700, n4) - method27522(method7698, method7700, n4)) * Math.max(0, method27522(n2, method7701, n5) - method27522(method7699, method7701, n5));
                if (n6 <= n3) {
                    continue;
                }
                class1926 = class1927;
                n3 = n6;
            }
            return class1926;
        }
        return this.method27520(glfwGetWindowMonitor);
    }
    
    public static int method27522(final int n, final int n2, final int n3) {
        if (n >= n2) {
            return (n <= n3) ? n : n3;
        }
        return n2;
    }
    
    public void method27523() {
        RenderSystem.method29989(RenderSystem::method29984);
        final GLFWMonitorCallback glfwSetMonitorCallback = GLFW.glfwSetMonitorCallback((GLFWMonitorCallbackI)null);
        if (glfwSetMonitorCallback != null) {
            glfwSetMonitorCallback.free();
        }
    }
}
