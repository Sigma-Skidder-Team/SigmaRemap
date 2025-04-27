// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.opengl.renderer.Renderer;

public class Class6775
{
    public static SGL field26606;
    private final Runnable field26607;
    private int field26608;
    
    public Class6775(final Runnable field26607) {
        this.field26608 = -1;
        this.field26607 = field26607;
        this.method20681();
    }
    
    private void method20681() {
        if (this.field26608 != -1) {
            throw new RuntimeException("Attempt to build the display list more than once in CachedRender");
        }
        this.field26608 = Class6775.field26606.glGenLists(1);
        Class8093.method26586();
        Class6775.field26606.glNewList(this.field26608, 4864);
        this.field26607.run();
        Class6775.field26606.glEndList();
        Class8093.method26587();
    }
    
    public void method20682() {
        if (this.field26608 != -1) {
            Class8093.method26586();
            Class6775.field26606.glCallList(this.field26608);
            Class8093.method26587();
            return;
        }
        throw new RuntimeException("Attempt to render cached operations that have been destroyed");
    }
    
    public void method20683() {
        Class6775.field26606.glDeleteLists(this.field26608, 1);
        this.field26608 = -1;
    }
    
    static {
        Class6775.field26606 = Renderer.get();
    }
}
