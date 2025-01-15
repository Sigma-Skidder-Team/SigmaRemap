// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.glfw.GLFW;

public class Class3303 extends Class3167
{
    public Class3303() {
        super(Class8013.field32985, "AutoWalk", "Automatically walks forward");
    }
    
    @Class6753
    private void method10462(final Class5743 class5743) {
        if (this.method9906()) {
            Class3303.field15514.field4648.field23435.field2162 = true;
        }
    }
    
    @Override
    public void method9897() {
        Class3303.field15514.field4648.field23435.field2162 = (GLFW.glfwGetKey(Class3303.field15514.field4632.method7690(), Class3303.field15514.field4648.field23435.field2161.field32860) == 1);
    }
}
