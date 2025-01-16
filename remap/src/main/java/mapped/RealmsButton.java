// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class RealmsButton extends Class5611
{
    private static String[] field23001;
    public final /* synthetic */ RealmsGenericErrorScreen field23002;
    
    public RealmsButton(final RealmsGenericErrorScreen field23002, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23002 = field23002;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        Realms.setScreen(RealmsGenericErrorScreen.method15676(this.field23002));
    }
}
