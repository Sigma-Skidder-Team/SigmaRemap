// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5680 extends Class5611
{
    public final /* synthetic */ RealmsMainScreen field23105;
    
    public Class5680(final RealmsMainScreen field23105) {
        this.field23105 = field23105;
        super(10, field23105.width() - 37, 6, 20, 20, RealmsScreen.getLocalizedString("mco.selectServer.info"));
    }
    
    @Override
    public void method16922() {
        super.method16922();
    }
    
    @Override
    public void method16920(final int n, final int n2, final float n3) {
        super.method16920(n, n2, n3);
    }
    
    @Override
    public void method16934(final int n, final int n2, final float n3) {
        RealmsMainScreen.method15832(this.field23105, n, n2, this.method16929(), this.method16928(), this.method16923().method3360());
    }
    
    @Override
    public void method16932() {
        RealmsMainScreen.method15833(this.field23105, !RealmsMainScreen.method15834(this.field23105));
    }
}
