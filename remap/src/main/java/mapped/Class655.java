// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class655 extends Class654
{
    public final /* synthetic */ Class539 field3684;
    
    public Class655(final Class539 field3684, final int n, final int n2, final int n3, final int n4, final String s, final Class6887 class6887) {
        this.field3684 = field3684;
        super(n, n2, n3, n4, s, class6887);
    }
    
    @Override
    public String method3369() {
        return Class8822.method30773("selectWorld.bonusItems", new Object[0]) + ' ' + Class8822.method30773((Class539.method3130(this.field3684) && !Class539.method3129(this.field3684)) ? "options.on" : "options.off");
    }
}
