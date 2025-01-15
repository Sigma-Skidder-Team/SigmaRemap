// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3256 extends Class3247
{
    public static int field15748;
    
    public Class3256() {
        super(Class8013.field32990, "Speed", "Vroom vroom", new Class3167[] { new Class3332(), new Class3347(), new Class3227(), new Class3273(), new Class3383(), new Class3187(), new Class3290(), new Class3297(), new Class3340(), new Class3349(), new Class3189(), new Class3200(), new Class3220(), new Class3333(), new Class3218() });
        this.method9881(new Class4999("Lag back checker", "Disable speed when you get lag back", true));
        Class3256.field15748 = 0;
    }
    
    @Class6753
    public void method10267(final Class5743 class5743) {
        ++Class3256.field15748;
    }
    
    @Class6753
    public void method10268(final Class5723 class5723) {
        if (class5723.method16998() instanceof Class4328) {
            if (Class3256.field15514.field4684 != null) {
                Class3256.field15748 = 0;
                if (this.method9883("Lag back checker")) {
                    if (this.method9906()) {
                        if (Class3256.field15514.field4684.ticksExisted > 2) {
                            Class9463.method35173().method35197().method25776(new Class6224("Speed", "Disabled speed due to lagback."));
                            this.method9910();
                        }
                    }
                }
            }
        }
    }
    
    public void method10269() {
        if (this.field15743 instanceof Class3347) {
            ((Class3347)this.field15743).method10592();
        }
    }
}
