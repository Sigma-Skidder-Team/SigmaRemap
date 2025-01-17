// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.Renderer;

public class Class6775
{
    public static SGL field26606;
    private Runnable field26607;
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
        this.field26608 = Class6775.field26606.method19283(1);
        Class8093.method26586();
        Class6775.field26606.method19276(this.field26608, 4864);
        this.field26607.run();
        Class6775.field26606.method19275();
        Class8093.method26587();
    }
    
    public void method20682() {
        if (this.field26608 != -1) {
            Class8093.method26586();
            Class6775.field26606.method19260(this.field26608);
            Class8093.method26587();
            return;
        }
        throw new RuntimeException("Attempt to render cached operations that have been destroyed");
    }
    
    public void method20683() {
        Class6775.field26606.method19290(this.field26608, 1);
        this.field26608 = -1;
    }
    
    static {
        Class6775.field26606 = Renderer.get();
    }
}
