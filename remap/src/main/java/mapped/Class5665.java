// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5665 extends Class5611
{
    public final /* synthetic */ RealmsMainScreen field23079;
    
    public Class5665(final RealmsMainScreen field23079) {
        this.field23079 = field23079;
        super(8, field23079.width() / 2 + 47, 6, 22, 22, "");
    }
    
    @Override
    public void method16922() {
        this.method16925(Realms.method25379((RealmsMainScreen.method15839(this.field23079) != 0) ? "mco.invites.pending" : "mco.invites.nopending", new Object[0]));
    }
    
    @Override
    public void method16920(final int n, final int n2, final float n3) {
        super.method16920(n, n2, n3);
    }
    
    @Override
    public void method16932() {
        Realms.setScreen(new Class5073(RealmsMainScreen.method15811(this.field23079)));
    }
    
    @Override
    public void method16934(final int n, final int n2, final float n3) {
        RealmsMainScreen.method15840(this.field23079, n, n2, this.method16929(), this.method16928(), this.method16923().method3360(), this.method16916());
    }
}
