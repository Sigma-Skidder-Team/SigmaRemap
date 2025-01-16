// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class8824
{
    private static String[] field37103;
    private final int field37104;
    private boolean field37105;
    
    public Class8824(final int field37104) {
        this.field37104 = field37104;
    }
    
    public void method30776() {
        this.method30778(false);
    }
    
    public void method30777() {
        this.method30778(true);
    }
    
    public void method30778(final boolean field37105) {
        RenderSystem.method29989(RenderSystem::method29985);
        if (field37105 != this.field37105) {
            if (!(this.field37105 = field37105)) {
                GL11.glDisable(this.field37104);
            }
            else {
                GL11.glEnable(this.field37104);
            }
        }
    }
}
