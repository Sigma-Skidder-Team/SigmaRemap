// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7627 extends Class7626
{
    public final /* synthetic */ Class625 field30207;
    
    public Class7627(final Class625 field30207) {
        this.field30207 = field30207;
        super(15, 15, 235, 5);
    }
    
    @Override
    public void method23960(final int n, final int n2, final boolean b) {
        RealmsScreen.method15419("realms:textures/gui/realms/reject_icon.png");
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.pushMatrix();
        RealmsScreen.method15411(n, n2, b ? 19.0f : 0.0f, 0.0f, 18, 18, 37, 18);
        RenderSystem.popMatrix();
        if (b) {
            Class5073.method15672(this.field30207.field3606, RealmsScreen.getLocalizedString("mco.invites.button.reject"));
        }
    }
    
    @Override
    public void method23961(final int n) {
        Class5073.method15670(this.field30207.field3606, n);
    }
}
