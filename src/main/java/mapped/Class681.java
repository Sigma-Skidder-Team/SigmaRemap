// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class681 extends Class654
{
    public final /* synthetic */ Class607 field3722;
    public final /* synthetic */ Class350 field3723;
    public final /* synthetic */ Class595 field3724;
    
    public Class681(final Class595 field3724, final int n, final int n2, final int n3, final int n4, final String s, final Class6887 class6887, final Class607 field3725, final Class350 field3726) {
        this.field3724 = field3724;
        this.field3722 = field3725;
        this.field3723 = field3726;
        super(n, n2, n3, n4, s, class6887);
    }
    
    @Override
    public String method3352() {
        return this.field3723.method1065() ? Class8822.method30773("narrator.controls.unbound", Class595.method3474(this.field3724)) : Class8822.method30773("narrator.controls.bound", Class595.method3474(this.field3724), super.method3352());
    }
}
