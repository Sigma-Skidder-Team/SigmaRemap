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
        Class5046.method15419("realms:textures/gui/realms/reject_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        Class5046.method15411(n, n2, b ? 19.0f : 0.0f, 0.0f, 18, 18, 37, 18);
        Class8726.method30060();
        if (b) {
            Class5073.method15672(this.field30207.field3606, Class5046.method15438("mco.invites.button.reject"));
        }
    }
    
    @Override
    public void method23961(final int n) {
        Class5073.method15670(this.field30207.field3606, n);
    }
}
