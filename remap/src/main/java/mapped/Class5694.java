// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5694 extends Class5611
{
    private static String[] field23130;
    public final /* synthetic */ RealmsConfigureWorldScreen field23131;
    
    public Class5694(final RealmsConfigureWorldScreen field23131, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23131 = field23131;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        Realms.setScreen(new Class5071(this.field23131, RealmsConfigureWorldScreen.method15718(this.field23131).clone(), RealmsConfigureWorldScreen.method15718(this.field23131).field28688));
    }
}
