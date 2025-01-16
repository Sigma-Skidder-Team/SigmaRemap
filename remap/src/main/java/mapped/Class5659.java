// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5659 extends Class5611
{
    private static String[] field23068;
    public final /* synthetic */ RealmsMainScreen field23069;
    
    public Class5659(final RealmsMainScreen field23069, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23069 = field23069;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        if (!RealmsMainScreen.method15810(this.field23069)) {
            Realms.setScreen(RealmsMainScreen.method15811(this.field23069));
        }
    }
}
