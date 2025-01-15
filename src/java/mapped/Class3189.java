// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3189 extends Class3167
{
    private int field15591;
    private double field15592;
    private float field15593;
    
    public Class3189() {
        super(Class8013.field32990, "AGC", "Speed for AGC");
    }
    
    @Override
    public void method9879() {
        this.field15593 = Class7482.method23143()[0];
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.2800000011920929);
    }
    
    @Class6753
    private void method10003(final Class5723 class5723) {
        if (this.method9906()) {
            if (Class3189.field15514.field4684 != null) {
                if (class5723.method16998() instanceof Class4273) {
                    if (((Class4273)class5723.method16998()).method12822() == Class3189.field15514.field4684.method1643()) {
                        this.field15591 = -1;
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10004(final Class5717 class5717) {
        if (!this.method9906()) {
            return;
        }
        if (Class9463.method35173().method35194().method29228() > 25) {
            this.field15591 = 0;
        }
        if (this.field15591 >= 0) {
            if (!Class6430.method19114()) {
                if (Class3189.field15514.field4684.field2404) {
                    this.field15593 = Class3189.field15514.field4684.field2399 + 90.0f;
                }
            }
            else if (!Class3189.field15514.field4684.field2404) {
                this.field15592 -= 0.00775;
                if (this.field15592 < 0.17) {
                    this.field15592 = 0.17;
                }
                this.field15593 = Class7482.method23153(class5717, this.field15592, Class7482.method23144()[0], this.field15593, 45.0f);
            }
            else {
                this.field15592 = 0.67 + Math.random() * 1.0E-10 + Class7482.method23139() * 0.12;
                this.field15593 = Class7482.method23153(class5717, this.field15592, Class7482.method23144()[0], this.field15593, 45.0f);
                this.field15592 = 0.39;
                class5717.method16975(Class7482.method23141());
                Class6430.method19155(class5717.method16974());
            }
        }
    }
}
