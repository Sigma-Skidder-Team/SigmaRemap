// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3191 extends Class3167
{
    private int field15596;
    private double field15597;
    
    public Class3191() {
        super(Class8013.field32990, "Cubecraft", "Longjump for Cubecraft.");
        this.method9881(new Class4996("Boost", "Longjump boost", 3.0f, Float.class, 1.0f, 5.0f, 0.01f));
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(Class7482.method23136() * 0.8);
        Class3191.field15514.field4633.field26532 = 1.0f;
    }
    
    @Override
    public void method9879() {
        this.field15596 = -1;
        Class3191.field15514.field4633.field26532 = 0.3f;
    }
    
    @Class6753
    public void method10016(final Class5743 class5743) {
        if (this.method9906() && Class3191.field15514.player != null) {
            if (!Class6430.method19160(Class3191.field15514.player, 0.001f)) {
                ++this.field15596;
                this.field15597 -= 0.005;
                if (this.field15597 < 0.26 || this.field15596 > 6) {
                    this.field15597 = 0.26;
                }
                Class7482.method23151(this.field15597);
                if (this.field15596 > 5) {
                    this.method9914().method9910();
                }
            }
            else {
                if (this.field15596 > 0) {
                    Class7482.method23151(0.0);
                    this.method9914().method9910();
                    this.field15596 = 0;
                }
                final double field2395 = Class3191.field15514.player.posX;
                final double field2396 = Class3191.field15514.player.posY;
                final double field2397 = Class3191.field15514.player.posZ;
                for (int n = 49 + Class7482.method23140() * 17, i = 0; i < n; ++i) {
                    Class3191.field15514.method5269().method17292(new Class4354(field2395, field2396 + 0.06248, field2397, false));
                    Class3191.field15514.method5269().method17292(new Class4354(field2395, field2396, field2397, false));
                }
                Class3191.field15514.method5269().method17292(new Class4354(field2395, field2396, field2397, true));
                Class6430.method19155(Class7482.method23141());
                this.field15596 = 0;
                Class7482.method23151(this.field15597 = this.method9886("Boost") / 2.0f);
            }
        }
    }
}
