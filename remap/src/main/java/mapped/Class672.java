// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class672 extends Class654
{
    public final /* synthetic */ Class539 field3707;
    
    public Class672(final Class539 field3707, final int n, final int n2, final int n3, final int n4, final String s, final Class6887 class6887) {
        this.field3707 = field3707;
        super(n, n2, n3, n4, s, class6887);
    }
    
    @Override
    public String method3369() {
        return Class8822.method30773("selectWorld.mapFeatures", new Object[0]) + ' ' + Class8822.method30773(Class539.method3126(this.field3707) ? "options.on" : "options.off", new Object[0]);
    }
    
    @Override
    public String method3352() {
        return super.method3352() + ". " + Class8822.method30773("selectWorld.mapFeatures.info", new Object[0]);
    }
}
