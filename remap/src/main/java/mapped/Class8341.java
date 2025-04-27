// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import javax.annotation.Nullable;
import org.lwjgl.glfw.GLFWScrollCallbackI;
import org.lwjgl.glfw.GLFWMouseButtonCallbackI;
import org.lwjgl.glfw.GLFWCursorPosCallbackI;
import org.lwjgl.glfw.GLFWCharModsCallbackI;
import org.lwjgl.glfw.GLFWKeyCallbackI;
import org.lwjgl.glfw.GLFW;
import java.lang.invoke.MethodHandle;

public class Class8341
{
    private static final MethodHandle field34246;
    private static final int field34247;
    public static final Class7985 field34248;
    
    public static Class7985 method27796(final int n, final int n2) {
        return (n != -1) ? Class2136.field12467.method8289(n) : Class2136.field12468.method8289(n2);
    }
    
    public static Class7985 method27797(final String str) {
        if (!Class7985.field32861.containsKey(str)) {
            for (final Class2136 class2136 : Class2136.values()) {
                if (str.startsWith(Class2136.method8291(class2136))) {
                    return class2136.method8289(Integer.parseInt(str.substring(Class2136.method8291(class2136).length() + 1)));
                }
            }
            throw new IllegalArgumentException("Unknown key name: " + str);
        }
        return Class7985.field32861.get(str);
    }
    
    public static boolean method27798(final long n, final int n2) {
        return GLFW.glfwGetKey(n, n2) == 1;
    }
    
    public static void method27799(final long n, final GLFWKeyCallbackI glfwKeyCallbackI, final GLFWCharModsCallbackI glfwCharModsCallbackI) {
        GLFW.glfwSetKeyCallback(n, glfwKeyCallbackI);
        GLFW.glfwSetCharModsCallback(n, glfwCharModsCallbackI);
    }
    
    public static void method27800(final long n, final GLFWCursorPosCallbackI glfwCursorPosCallbackI, final GLFWMouseButtonCallbackI glfwMouseButtonCallbackI, final GLFWScrollCallbackI glfwScrollCallbackI) {
        GLFW.glfwSetCursorPosCallback(n, glfwCursorPosCallbackI);
        GLFW.glfwSetMouseButtonCallback(n, glfwMouseButtonCallbackI);
        GLFW.glfwSetScrollCallback(n, glfwScrollCallbackI);
    }
    
    public static void method27801(final long n, final int n2, final double n3, final double n4) {
        GLFW.glfwSetCursorPos(n, n3, n4);
        GLFW.glfwSetInputMode(n, 208897, n2);
    }
    
    public static boolean method27802() {
        try {
            return Class8341.field34246 != null && Class8341.field34246.invokeExact();
        }
        catch (final Throwable cause) {
            throw new RuntimeException(cause);
        }
    }
    
    public static void method27803(final long n, final boolean b) {
        if (method27802()) {
            GLFW.glfwSetInputMode(n, Class8341.field34247, b ? 1 : 0);
        }
    }
    
    @Nullable
    public static String method27804(final int n) {
        return GLFW.glfwGetKeyName(n, -1);
    }
    
    @Nullable
    public static String method27805(final int n) {
        return GLFW.glfwGetKeyName(-1, n);
    }
    
    static {
        final MethodHandles.Lookup lookup = MethodHandles.lookup();
        final MethodType methodType = MethodType.methodType(Boolean.TYPE);
        MethodHandle static1 = null;
        int invokeExact = 0;
        try {
            static1 = lookup.findStatic(GLFW.class, "glfwRawMouseMotionSupported", methodType);
            invokeExact = lookup.findStaticGetter(GLFW.class, "GLFW_RAW_MOUSE_MOTION", Integer.TYPE).invokeExact();
        }
        catch (final NoSuchFieldException | NoSuchMethodException ex) {}
        catch (final Throwable cause) {
            throw new RuntimeException(cause);
        }
        field34246 = static1;
        field34247 = invokeExact;
        field34248 = Class2136.field12467.method8289(-1);
    }
}
