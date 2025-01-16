// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5669 extends Class5611
{
    private static String[] field23086;
    public final /* synthetic */ RealmsConfigureWorldScreen field23087;
    
    public Class5669(final RealmsConfigureWorldScreen field23087, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23087 = field23087;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        Realms.setScreen(new Class5089(this.field23087, RealmsConfigureWorldScreen.method15718(this.field23087).clone()));
    }
}
