// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5682 extends Class5611
{
    private static String[] field23108;
    public final /* synthetic */ RealmsConfigureWorldScreen field23109;
    
    public Class5682(final RealmsConfigureWorldScreen field23109, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23109 = field23109;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        Realms.setScreen(new Class5085(this.field23109, RealmsConfigureWorldScreen.method15718(this.field23109).field28683.get(RealmsConfigureWorldScreen.method15718(this.field23109).field28688).clone(), RealmsConfigureWorldScreen.method15718(this.field23109).field28687, RealmsConfigureWorldScreen.method15718(this.field23109).field28688));
    }
}
