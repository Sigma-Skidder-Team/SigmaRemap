// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3330 extends Class3167
{
    private int field15927;
    private int field15928;
    
    public Class3330() {
        super(Class8013.field32988, "Unstuck", "Toggle this when an anticheat freeze you mid-air");
        this.method9881(new Class4996("Flags", "Maximum flag before trying to unstuck", 5.0f, Float.class, 2.0f, 20.0f, 1.0f));
    }
    
    @Override
    public void method9879() {
        this.field15927 = 0;
    }
    
    @Class6753
    public void method10542(final Class5717 class5717) {
        if (this.method9906()) {
            if (this.field15927 >= this.method9886("Flags")) {
                Class7482.method23149(class5717, 0.0);
                class5717.method16975(0.0);
                Class3330.field15514.field4684.setMotion(0.0, 0.0, 0.0);
            }
        }
    }
    
    @Class6753
    public void method10543(final Class5732 class5732) {
        if (this.method9906()) {
            this.field15927 = 0;
        }
    }
    
    @Class6753
    public void method10544(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            if (!Class3330.field15514.field4684.onGround && !Class6430.method19160(Class3330.field15514.field4684, 0.001f)) {
                if (this.field15927 >= this.method9886("Flags")) {
                    if (this.field15928 == 0) {
                        this.field15928 = 60;
                        Class9463.method35173().method35197().method25776(new Class6224("Unstuck", "Trying to unstuck you.."));
                    }
                }
                if (this.field15928 > 0) {
                    --this.field15928;
                    if (this.field15928 == 0) {
                        this.field15927 = 0;
                    }
                    class5744.method16961(true);
                }
            }
            else {
                this.field15927 = 0;
            }
        }
    }
    
    @Class6753
    public void method10545(final Class5723 class5723) {
        if (!this.method9906()) {
            return;
        }
        if (Class3330.field15514.field4684 != null) {
            if (class5723.method16998() instanceof Class4328) {
                if (!Class6430.method19160(Class3330.field15514.field4684, 0.3f)) {
                    if (Class3330.field15514.field4684.ticksExisted > 10) {
                        ++this.field15927;
                        if (this.field15927 > this.method9886("Flags")) {
                            class5723.method16961(true);
                        }
                    }
                }
            }
        }
    }
}
