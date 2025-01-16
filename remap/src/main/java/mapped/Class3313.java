// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3313 extends Class3167
{
    private double field15895;
    
    public Class3313() {
        super(Class8013.field32986, "Hover", "Hover criticals");
    }
    
    @Override
    public void method9879() {
        this.field15895 = 1.0E-11;
    }
    
    @Class6753
    public void method10483(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15895 = 1.0E-11;
            }
        }
    }
    
    @Class6753
    @Class6757
    private void method10484(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            final boolean b = Class3313.field15514.field4691 != null && Class3313.field15514.field4691.getType() == RayTraceResult.Type.BLOCK;
            final boolean b2 = Class3313.field15514.field4682.method27337() || (Class3313.field15514.gameSettings.field23446.method1056() && b);
            if (Class9463.method35173().method35194().method29228() > 0 && !b2) {
                this.field15895 -= 1.0E-14;
                if (this.field15895 < 0.0 || Class3265.field15758 == 0) {
                    this.field15895 = 1.0E-11;
                }
                class5744.method17033(true);
                class5744.method17037(class5744.method17036() + this.field15895);
                class5744.method17045(false);
            }
            else {
                this.field15895 = 1.0E-11;
            }
        }
    }
}
