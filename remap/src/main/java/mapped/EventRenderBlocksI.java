// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class EventRenderBlocksI extends CancellableEvent2
{
    private static String[] field23263;
    private final BlockState field23264;
    private boolean field23265;
    
    public EventRenderBlocksI(final BlockState field23264) {
        this.field23265 = false;
        this.field23264 = field23264;
    }
    
    public BlockState getBlockState() {
        return this.field23264;
    }
    
    public boolean method16987() {
        return this.field23265;
    }
    
    public void method16988(final boolean field23265) {
        this.field23265 = field23265;
    }
}
