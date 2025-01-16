// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5689 extends Class5611
{
    private static String[] field23121;
    public final /* synthetic */ RealmsConfigureWorldScreen field23122;
    
    public Class5689(final RealmsConfigureWorldScreen field23122, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23122 = field23122;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        Realms.setScreen(new Class5069(this.field23122, RealmsConfigureWorldScreen.method15718(this.field23122)));
    }
}
