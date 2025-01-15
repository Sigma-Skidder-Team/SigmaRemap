// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3394 extends Class3167
{
    public Class3394() {
        super(Class8013.field32990, "FullBlock", "Basic phase");
    }
    
    @Class6753
    private void method10830(final Class5744 class5744) {
        if (this.method9906() && method10834()) {
            class5744.method17033(true);
        }
    }
    
    @Class6753
    private void method10831(final Class5717 class5717) {
        if (this.method9906()) {
            if (!method10834()) {
                if (Class3394.field15514.field4684.collidedHorizontally) {
                    Class7482.method23149(class5717, 0.0);
                    this.method10833(1.1920931E-8);
                }
            }
            else {
                this.method10833(0.617);
            }
        }
    }
    
    @Class6753
    private void method10832(final Class5713 class5713) {
        if (this.method9906()) {
            class5713.method16961(true);
        }
    }
    
    private void method10833(final double n) {
        double n2 = Class3394.field15514.field4684.field4085.field24722;
        double n3 = Class3394.field15514.field4684.field4085.field24721;
        float field2399 = Class3394.field15514.field4684.rotationYaw;
        if (n2 != 0.0) {
            if (n3 <= 0.0) {
                if (n3 < 0.0) {
                    field2399 += ((n2 <= 0.0) ? -45 : 45);
                }
            }
            else {
                field2399 += ((n2 <= 0.0) ? 45 : -45);
            }
            n3 = 0.0;
            if (n2 <= 0.0) {
                if (n2 < 0.0) {
                    n2 = -1.0;
                }
            }
            else {
                n2 = 1.0;
            }
        }
        Class3394.field15514.field4684.setPosition(Class3394.field15514.field4684.posX + (n2 * n * Math.cos(Math.toRadians(field2399 + 90.0f)) + n3 * n * Math.sin(Math.toRadians(field2399 + 90.0f))), Class3394.field15514.field4684.posY, Class3394.field15514.field4684.posZ + (n2 * n * Math.sin(Math.toRadians(field2399 + 90.0f)) - n3 * n * Math.cos(Math.toRadians(field2399 + 90.0f))));
    }
    
    public static boolean method10834() {
        final double n = 1.0E-7;
        return Class3394.field15514.field4683.method6981(Class3394.field15514.field4684, Class3394.field15514.field4684.boundingBox.method18494(n, 0.0, n).method18494(-n, 0.0, -n)).count() > 0L;
    }
}
