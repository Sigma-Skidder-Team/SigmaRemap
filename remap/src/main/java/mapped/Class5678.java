// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5678 extends Class5611
{
    public final /* synthetic */ RealmsMainScreen field23102;
    
    public Class5678(final RealmsMainScreen field23102) {
        this.field23102 = field23102;
        super(9, field23102.width() - 62, 6, 20, 20, "");
    }
    
    @Override
    public void method16922() {
        this.method16925(Realms.method25379("mco.news"));
    }
    
    @Override
    public void method16920(final int n, final int n2, final float n3) {
        super.method16920(n, n2, n3);
    }
    
    @Override
    public void method16932() {
        if (RealmsMainScreen.method15835(this.field23102) != null) {
            Class8428.method28148(RealmsMainScreen.method15835(this.field23102));
            if (RealmsMainScreen.method15836(this.field23102)) {
                final Class8907 method29061 = Class8584.method29061();
                method29061.field37449 = false;
                RealmsMainScreen.method15837(this.field23102, false);
                Class8584.method29062(method29061);
            }
        }
    }
    
    @Override
    public void method16934(final int n, final int n2, final float n3) {
        RealmsMainScreen.method15838(this.field23102, n, n2, RealmsMainScreen.method15836(this.field23102), this.method16929(), this.method16928(), this.method16923().method3360(), this.method16916());
    }
}
