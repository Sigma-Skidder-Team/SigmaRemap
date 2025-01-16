// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7625 extends Class7626
{
    public final /* synthetic */ Class625 field30202;
    
    public Class7625(final Class625 field30202) {
        this.field30202 = field30202;
        super(15, 15, 215, 5);
    }
    
    @Override
    public void method23960(final int n, final int n2, final boolean b) {
        RealmsScreen.method15419("realms:textures/gui/realms/accept_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        RealmsScreen.method15411(n, n2, b ? 19.0f : 0.0f, 0.0f, 18, 18, 37, 18);
        Class8726.method30060();
        if (b) {
            Class5073.method15672(this.field30202.field3606, RealmsScreen.getLocalizedString("mco.invites.button.accept"));
        }
    }
    
    @Override
    public void method23961(final int n) {
        Class5073.method15666(this.field30202.field3606, n);
    }
}
