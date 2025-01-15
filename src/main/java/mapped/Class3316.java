// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3316 extends Class3167
{
    private int field15900;
    
    public Class3316() {
        super(Class8013.field32986, "Spartan", "Places block underneath");
        this.method9881(new Class4996("Ticks", "Vertical velocity multiplier", 1.0f, Float.class, 1.0f, 6.0f, 1.0f));
    }
    
    @Class6753
    private void method10495(final Class5743 class5743) {
        if (this.method9906()) {
            if (this.field15900 < 10) {
                ++this.field15900;
                if (this.field15900 == (int)this.method9886("Ticks")) {
                    Class7482.method23151(0.0);
                }
            }
        }
    }
    
    @Class6753
    private void method10496(final Class5723 class5723) {
        if (this.method9906()) {
            if (Class3316.field15514.field4684 != null) {
                if (class5723.method16998() instanceof Class4273) {
                    if (((Class4273)class5723.method16998()).method12822() == Class3316.field15514.field4684.method1643()) {
                        this.field15900 = 0;
                    }
                }
            }
        }
    }
}
