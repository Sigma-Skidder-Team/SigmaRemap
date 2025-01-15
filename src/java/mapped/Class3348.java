// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3348 extends Class3167
{
    public static int field15956;
    public float field15957;
    public float field15958;
    
    public Class3348() {
        super(Class8013.field32986, "AAC", "Places block underneath");
        this.method9881(new Class4996("Strengh", "Boost strengh", 0.7f, Float.class, 0.0f, 1.0f, 0.01f));
        Class3348.field15956 = 20;
    }
    
    @Override
    public void method9897() {
        Class3348.field15956 = 20;
    }
    
    @Class6753
    private void method10593(final Class5717 class5717) {
        if (!this.method9906() || Class3348.field15514.field4684 == null) {
            return;
        }
        if (!this.method10595()) {
            if (Class3348.field15956 < 7) {
                ++Class3348.field15956;
                if (Class3348.field15956 > 1) {
                    final float n = Class7482.method23143()[1];
                    final float n2 = Class7482.method23143()[2];
                    final float n3 = Class7482.method23143()[0];
                    final double cos = Math.cos(Math.toRadians(n3));
                    final double sin = Math.sin(Math.toRadians(n3));
                    final double n4 = (7 - Class3348.field15956) * this.method9886("Strengh") * 0.04 * this.field15958 * 0.2;
                    final double y = (n * cos + n2 * sin) * n4;
                    final double x = (n * sin - n2 * cos) * n4;
                    if (Class8845.method30918(this.field15957, (float)(Math.atan2(y, x) * 180.0 / 3.141592653589793) - 90.0f) > 100.0f && Class6430.method19114()) {
                        class5717.method16973(class5717.method16972() + y);
                        class5717.method16977(class5717.method16976() + x);
                    }
                    else {
                        class5717.method16973(class5717.method16972() * 0.8);
                        class5717.method16977(class5717.method16976() * 0.8);
                    }
                    Class6430.method19154(class5717.method16972());
                    Class6430.method19156(class5717.method16976());
                }
            }
            return;
        }
        if (Class3348.field15956 == 0) {
            if (!Class3348.field15514.field4684.field2404) {
                if (Class3348.field15514.field4684.field2938 > 0) {
                    if (Class3348.field15514.field4684.field2414 < 2.0f) {
                        Class3348.field15514.field4684.method1738(0.0, -1.0, 0.0);
                        Class6430.method19155(Class3348.field15514.field4684.method1935().method16761());
                        Class3348.field15514.field4684.field2404 = true;
                        Class3348.field15956 = 20;
                    }
                }
            }
        }
    }
    
    @Class6753
    private void method10594(final Class5723 class5723) {
        if (this.method9906() && Class3348.field15514.field4684 != null) {
            final Class4252 method16998 = class5723.method16998();
            if (method16998 instanceof Class4273) {
                if (this.method10595()) {
                    Class3348.field15956 = 0;
                    return;
                }
                final Class4273 class5724 = (Class4273)method16998;
                if (class5724.method12822() == Class3348.field15514.field4684.method1643()) {
                    if (class5724.field19165 != 0 || class5724.field19167 != 0) {
                        this.field15958 = (float)(Math.sqrt(class5724.field19165 * class5724.field19165 + class5724.field19167 * class5724.field19167) / 1000.0);
                        this.field15957 = (float)(Math.atan2(class5724.field19165 / 1000, class5724.field19167 / 1000) * 180.0 / 3.141592653589793) - 90.0f;
                        Class3348.field15956 = 0;
                    }
                }
            }
            if (class5723.method16998() instanceof Class4394) {
                final Class4394 class5725 = (Class4394)method16998;
            }
        }
    }
    
    public boolean method10595() {
        return this.method9886("Strengh") == 0.0f;
    }
}
