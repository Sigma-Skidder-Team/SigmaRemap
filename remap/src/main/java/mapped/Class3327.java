// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3327 extends Class3167
{
    public Class3327() {
        super(Class8013.field32990, "NCP", "Step for NCP");
        this.method9881(new Class4996("Maximum heigh", "Maximum heigh", 2.0f, Float.class, 1.0f, 2.5f, 0.5f));
    }
    
    @Class6753
    @Class6759
    private void method10532(final Class5745 class5745) {
        if (!this.method9906() || class5745.method16962()) {
            return;
        }
        final double method17049 = class5745.method17049();
        if (Class6430.method19160(Class3327.field15514.player, 1.0E-4f) && !Class7482.method23142()) {
            if (method17049 >= 0.625) {
                final double field2395 = Class3327.field15514.player.posX;
                final double field2396 = Class3327.field15514.player.posY;
                final double field2397 = Class3327.field15514.player.posZ;
                if (method17049 >= 1.1) {
                    if (method17049 >= 1.6) {
                        if (method17049 >= 2.1) {
                            final double[] array = { 0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869, 2.019, 1.907 };
                            for (int length = array.length, i = 0; i < length; ++i) {
                                Class3327.field15514.method5269().method17292(new Class4354(field2395, field2396 + array[i], field2397, false));
                            }
                        }
                        else {
                            for (final double n : new double[] { 0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869 }) {
                                if (n - 0.027 <= method17049) {
                                    Class3327.field15514.method5269().method17292(new Class4354(field2395, field2396 + n, field2397, false));
                                }
                            }
                        }
                    }
                    else {
                        final double[] array3 = { 0.41999998, 0.7531999805212, 1.01, 1.093, 1.015 };
                        for (int length3 = array3.length, k = 0; k < length3; ++k) {
                            Class3327.field15514.method5269().method17292(new Class4354(field2395, field2396 + array3[k], field2397, false));
                        }
                    }
                }
                else {
                    final double[] array4 = { 0.41999998688698 * method17049, 0.7531999805212 * method17049 };
                    for (int length4 = array4.length, l = 0; l < length4; ++l) {
                        Class3327.field15514.method5269().method17292(new Class4354(field2395, field2396 + array4[l], field2397, false));
                    }
                }
            }
            return;
        }
        class5745.method16961(true);
    }
    
    @Class6753
    private void method10533(final Class5738 class5738) {
        if (this.method9906() && Class3327.field15514.player != null) {
            if (!class5738.method17027()) {
                Class3327.field15514.player.stepHeight = this.method9886("Maximum heigh");
            }
            else {
                Class3327.field15514.player.stepHeight = 0.5f;
            }
        }
    }
}
