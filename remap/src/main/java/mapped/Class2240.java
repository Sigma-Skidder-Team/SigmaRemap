// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2240
{
    field13767(0, 0), 
    field13768(1, 0), 
    field13769(2, 0), 
    field13770(0, 1), 
    field13771(1, 1);
    
    private final int field13772;
    private final int field13773;
    
    Class2240(final int field13772, final int field13773) {
        this.field13772 = field13772;
        this.field13773 = field13773;
    }
    
    public void method8444(final AbstractGui class565, final int n, final int n2) {
        RenderSystem.enableBlend();
        class565.blit(n, n2, 176 + this.field13772 * 20, this.field13773 * 20, 20, 20);
        RenderSystem.enableBlend();
    }
}
