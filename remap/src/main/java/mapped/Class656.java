// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class656 extends Class654
{
    public final /* synthetic */ Class539 field3685;
    
    public Class656(final Class539 field3685, final int n, final int n2, final int n3, final int n4, final String s, final Class6887 class6887) {
        this.field3685 = field3685;
        super(n, n2, n3, n4, s, class6887);
    }
    
    @Override
    public String method3369() {
        return Class8822.method30773("selectWorld.allowCommands", new Object[0]) + ' ' + Class8822.method30773((Class539.method3128(this.field3685) && !Class539.method3129(this.field3685)) ? "options.on" : "options.off");
    }
    
    @Override
    public String method3352() {
        return super.method3352() + ". " + Class8822.method30773("selectWorld.allowCommands.info");
    }
}
