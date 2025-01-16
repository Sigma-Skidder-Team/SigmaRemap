// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5702 extends Class5611
{
    private static String[] field23150;
    public final /* synthetic */ RealmsConfigureWorldScreen field23151;
    
    public Class5702(final RealmsConfigureWorldScreen field23151, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23151 = field23151;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        Realms.setScreen(new Class5083(this.field23151, RealmsConfigureWorldScreen.method15718(this.field23151).clone(), RealmsConfigureWorldScreen.method15719(this.field23151)));
    }
}
