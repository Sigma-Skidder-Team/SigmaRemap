// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.glfw.GLFW;

public class Class3210 extends Class3167
{
    public Class3210() {
        super(Class8013.field32988, "GameIdler", "Lowers your fps when the game is idle to increase performance");
    }
    
    @Class6753
    private void method10090(final Class5740 class5740) {
        if (this.method9906()) {
            if (GLFW.glfwGetWindowAttrib(Class3210.field15514.field4632.method7690(), 131073) == 1) {
                Minecraft.method5277().field4632.method7678(Class3210.field15514.field4648.field23383);
            }
            else {
                Minecraft.method5277().field4632.method7678(5);
            }
        }
    }
    
    @Override
    public void method9897() {
        Minecraft.method5277().field4632.method7678(Class3210.field15514.field4648.field23383);
    }
}
