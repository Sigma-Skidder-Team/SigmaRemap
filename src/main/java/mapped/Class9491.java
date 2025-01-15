// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.MemoryUtil;

public class Class9491
{
    private static String[] field40791;
    
    public static void method35320() {
        MemoryUtil.memSet(0L, 0, 1L);
    }
    
    public static double method35321() {
        return GLFW.glfwGetTime();
    }
}
