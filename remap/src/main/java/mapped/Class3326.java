// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3326 extends Class3167
{
    public Class3326() {
        super(Class8013.field32990, "AAC", "Step for AAC");
    }
    
    @Class6753
    @Class6759
    private void method10530(final Class5745 class5745) {
        if (!this.method9906() || class5745.method16962()) {
            return;
        }
        final double method17049 = class5745.method17049();
        if (Class6430.method19160(Class3326.field15514.player, 1.0E-4f)) {
            if (!Class7482.method23142()) {
                if (method17049 >= 0.625) {
                    final double field2395 = Class3326.field15514.player.posX;
                    final double field2396 = Class3326.field15514.player.posY;
                    final double field2397 = Class3326.field15514.player.posZ;
                    if (method17049 < 1.1) {
                        final double[] array = { 0.41999998688698 * method17049, 0.754 * method17049 };
                        for (int length = array.length, i = 0; i < length; ++i) {
                            Class3326.field15514.method5269().method17292(new Class4354(field2395, field2396 + array[i], field2397, false));
                        }
                    }
                }
            }
            return;
        }
        class5745.method16961(true);
    }
    
    @Class6753
    private void method10531(final Class5738 class5738) {
        if (this.method9906() && Class3326.field15514.player != null) {
            if (!class5738.method17027()) {
                Class3326.field15514.player.stepHeight = 1.0f;
            }
            else {
                Class3326.field15514.player.stepHeight = 0.5f;
            }
        }
    }
}
