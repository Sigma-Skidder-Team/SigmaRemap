// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.glfw.GLFW;

public class Class3197 extends Class3167
{
    public int field15608;
    private float field15609;
    private float field15610;
    private float field15611;
    private boolean field15612;
    public int field15613;
    
    public Class3197() {
        super(Class8013.field32990, "ElytraFly", "Better elytra flying");
        this.field15608 = 0;
        this.field15613 = 0;
        this.method9881(new Class4999("NCP", "Bypass NCP", true));
    }
    
    @Class6753
    public void method10030(final Class5743 class5743) {
        if (this.method9906()) {
            Class3197.field15514.field4648.field23440.field2162 = false;
            if (Class3197.field15514.field4684.method1935().field22771 < 0.08 && !Class3197.field15514.field4684.field2404) {
                if (!Class3197.field15514.field4684.method2773()) {
                    Class3197.field15514.method5269().method17292(new Class4336(Class3197.field15514.field4684, Class287.field1599));
                    Class3197.field15514.field4684.method1830(7, true);
                }
            }
            else {
                Class3197.field15514.field4684.method1830(7, false);
                if (Class3197.field15514.field4684.method1809()) {
                    this.method9909(false);
                }
            }
        }
    }
    
    @Class6753
    public void method10031(final Class5717 class5717) {
        if (this.method9906()) {
            double method23136 = Class7482.method23136();
            Class6430.method19114();
            if (!this.method9883("NCP")) {
                if (Class3197.field15514.field4684.method1809()) {
                    method23136 *= 2.5;
                }
            }
            Class7482.method23149(class5717, 0.0);
            if (!Class3197.field15514.field4684.method2773()) {
                this.field15608 = 0;
            }
            else {
                if (this.field15608 > 0) {
                    if (this.field15608 > 7) {
                        Class7482.method23149(class5717, method23136 * 6.300000190734863);
                    }
                    Class6430.method19155(-0.071);
                    class5717.method16975(-1.0001000191550702E-4);
                }
                ++this.field15608;
            }
            if (this.field15610 > 1.0001E-4f) {
                if (Class3197.field15514.field4684.field2967) {
                    Class7482.method23149(class5717, method23136 * 6.300000190734863);
                    class5717.method16975(this.field15610);
                }
            }
            if (GLFW.glfwGetKey(Class3197.field15514.field4632.method7690(), Class3197.field15514.field4648.field23440.field2161.field32860) == 1 && this.method9883("NCP")) {
                class5717.method16975(-0.8999999761581421);
            }
            else if (!Class3197.field15514.field4684.method1809()) {
                if (Class3197.field15514.field4684.field2967) {
                    if (!this.method9883("NCP")) {
                        class5717.method16975(1.399999976158142);
                    }
                }
            }
            else {
                class5717.method16975(1.399999976158142);
            }
            this.field15610 *= (float)0.85;
        }
    }
    
    @Class6753
    private void method10032(final Class5723 class5723) {
        if (this.method9906()) {
            if (Class3197.field15514.field4684 != null) {
                if (class5723.method16998() instanceof Class4273) {
                    final Class4273 class5724 = (Class4273)class5723.method16998();
                    final Class399 method6741 = Class3197.field15514.field4683.method6741(class5724.method12822());
                    if (method6741 instanceof Class406) {
                        final Class406 class5725 = (Class406)method6741;
                        if (class5725.field2499 != null) {
                            if (class5725.field2499.method1643() == Class3197.field15514.field4684.method1643()) {
                                this.field15609 += class5724.field19165 / 8000.0f;
                                this.field15611 += class5724.field19167 / 8000.0f;
                                this.field15610 += class5724.field19166 / 8000.0f;
                                this.field15612 = true;
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Class6753
    private void method10033(final Class5744 class5744) {
        if (this.method9906()) {
            final int field15613 = 65;
            if (this.field15613 != field15613 - 1) {
                if (this.field15613 <= 0) {
                    if (Class3197.field15514.field4684.field2967) {
                        this.field15613 = field15613;
                    }
                }
            }
            else {
                final int method29340 = Class8639.method29340(Class7739.field31532);
                if (method29340 >= 0) {
                    if (method29340 != Class3197.field15514.field4684.field3006.field2743) {
                        Class3197.field15514.method5269().method17292(new Class4321(method29340));
                    }
                    Class3197.field15514.method5269().method17292(new Class4307(Class316.field1877));
                    if (method29340 != Class3197.field15514.field4684.field3006.field2743) {
                        Class3197.field15514.method5269().method17292(new Class4321(Class3197.field15514.field4684.field3006.field2743));
                    }
                }
            }
            if (this.field15613 > 0) {
                class5744.method17041(-90.0f);
            }
            if (!Class3197.field15514.field4684.field2967) {
                this.field15613 = 0;
            }
            --this.field15613;
        }
    }
    
    @Class6753
    @Class6757
    private void method10034(final Class5721 class5721) {
        if (this.method9906()) {
            return;
        }
    }
    
    @Class6753
    private void method10035(final Class5715 class5715) {
        if (this.method9906()) {
            return;
        }
    }
    
    @Override
    public void method9879() {
        if (Class3197.field15514.field4684.field2404) {
            Class6430.method19155(0.399399995803833);
        }
    }
    
    @Override
    public void method9897() {
        if (!Class7482.method23148()) {
            Class6430.method19154(0.0);
            Class6430.method19156(0.0);
        }
    }
}
