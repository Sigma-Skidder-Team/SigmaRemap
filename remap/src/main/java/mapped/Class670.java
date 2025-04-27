// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class670 extends Class654
{
    public final /* synthetic */ Class539 field3704;
    
    public Class670(final Class539 field3704, final int n, final int n2, final int n3, final int n4, final String s, final Class6887 class6887) {
        this.field3704 = field3704;
        super(n, n2, n3, n4, s, class6887);
    }
    
    @Override
    public String method3369() {
        return Class8822.method30773("selectWorld.mapType", new Object[0]) + ' ' + Class8822.method30773(Class9505.field40891[Class539.method3127(this.field3704)].method35400());
    }
    
    @Override
    public String method3352() {
        final Class9505 class9505 = Class9505.field40891[Class539.method3127(this.field3704)];
        return class9505.method35412() ? (super.method3352() + ". " + Class8822.method30773(class9505.method35401())) : super.method3352();
    }
}
