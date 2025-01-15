// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3395 extends Class3167
{
    private Class399 field16115;
    private double field16116;
    
    public Class3395() {
        super(Class8013.field32986, "Smooth", "Automatically aims at players");
        this.method9881(new Class4996("Range", "Range value", 4.0f, Float.class, 2.8f, 8.0f, 0.01f));
    }
    
    @Class6753
    private void method10835(final Class5739 class5739) {
        if (!this.method9906()) {
            return;
        }
        if (Class3395.field15514.field4684.field2400 <= 45.0f) {
            final Class399 method10266 = ((Class3255)this.method9914()).method10266(this.method9886("Range"));
            if (method10266 != null) {
                double n = Class3395.field15514.field4684.field2400 - this.method10836(method10266)[1];
                double n2 = Class3395.field15514.field4684.field2399 - this.method10836(method10266)[0];
                if (n2 < 0.0) {
                    n2 *= -1.0;
                }
                if (n < 0.0) {
                    n *= -1.0;
                }
                double n3 = (method10266.field2395 - method10266.field2417) * 2.14 + (method10266.field2397 - method10266.field2419) * 2.14;
                if (n3 < 0.0) {
                    n3 *= -1.0;
                }
                final double n4 = 0.05 * Class869.method5338() * (n3 + 1.0);
                if (Class3395.field15514.field4684.field2400 > this.method10836(method10266)[1]) {
                    final Class756 field4684 = Class3395.field15514.field4684;
                    field4684.field2400 -= (float)(n4 * n / 90.0 + Math.min(0.5, n2));
                }
                if (Class3395.field15514.field4684.field2400 < this.method10836(method10266)[1]) {
                    final Class756 field4685 = Class3395.field15514.field4684;
                    field4685.field2400 += (float)(n4 * n / 90.0 + Math.min(0.5, n2));
                }
                if (Class3395.field15514.field4684.field2399 > this.method10836(method10266)[0]) {
                    final Class756 field4686 = Class3395.field15514.field4684;
                    field4686.field2399 -= (float)(n4 * n2 / 90.0 + Math.min(0.5, n));
                }
                if (Class3395.field15514.field4684.field2399 < this.method10836(method10266)[0]) {
                    final Class756 field4687 = Class3395.field15514.field4684;
                    field4687.field2399 += (float)(n4 * n2 / 90.0 + Math.min(0.5, n));
                }
                Class3395.field15514.field4684.field2953 = Class3395.field15514.field4684.field2399;
            }
        }
    }
    
    public float[] method10836(final Class399 class399) {
        if (Class3395.field15514.field4690 == null) {
            if (this.field16115 != null) {
                this.field16116 = Math.random();
            }
        }
        this.field16115 = Class3395.field15514.field4690;
        final double x = class399.field2395 - Class3395.field15514.field4684.field2395 + Math.cos((class399.method1844() + 90.0f) * 3.141592653589793 / 180.0) * 0.14;
        final double y = class399.field2396 - 1.6 - this.field16116 + class399.method1892() - Class3395.field15514.field4684.field2396;
        final double y2 = class399.field2397 - Class3395.field15514.field4684.field2397 + Math.sin((class399.method1844() + 90.0f) * 3.141592653589793 / 180.0) * 0.14;
        return new float[] { this.method10837(Class3395.field15514.field4684.field2399, (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f, 360.0f), this.method10837(Class3395.field15514.field4684.field2400, (float)(-(Math.atan2(y, Class9546.method35641(x * x + y2 * y2)) * 180.0 / 3.141592653589793)), 360.0f) };
    }
    
    private float method10837(final float n, final float n2, final float n3) {
        float method35668 = Class9546.method35668(n2 - n);
        if (method35668 > n3) {
            method35668 = n3;
        }
        if (method35668 < -n3) {
            method35668 = -n3;
        }
        return n + method35668;
    }
}
